package com.app.chef.features.auth.data

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.app.chef.core.utils.Resource
import com.app.chef.features.auth.domain.repo.AuthRepository
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.AuthCredential
import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.storage.StorageReference

class AuthViewModel (
    val authRepository: AuthRepository
): ViewModel() {

    private var  mAuth: FirebaseAuth? = null
    private var storage: FirebaseStorage
    private var storageReference: StorageReference
    private  var rootNode: FirebaseDatabase
    private  var reference: DatabaseReference
    init {

        mAuth = FirebaseAuth.getInstance()    //Authentication
        storage = FirebaseStorage.getInstance()   //File/image uploads
        storageReference = storage.reference    //Reference to the storage
        rootNode = FirebaseDatabase.getInstance()   // Realtime DB
        reference = rootNode.getReference("taxInfo") //Reference to DBTable
    }

    val signupResult: MutableLiveData<Resource<String>> = MutableLiveData()
    val loginResult: MutableLiveData<Resource<String>> = MutableLiveData()
    val resetPassResult: MutableLiveData<Resource<String>> = MutableLiveData()
    val googleLoginResult: MutableLiveData<Resource<String>> = MutableLiveData()

    fun registerUser(email: String, password: String) {
        signupResult.postValue(Resource.Loading())
        mAuth?.createUserWithEmailAndPassword(email, password)
            ?.addOnCompleteListener { task ->
                signupResult.postValue(handleNetRequestResponse(task))
            }
    }

    fun loginUser(email: String, password: String) {
        loginResult.postValue(Resource.Loading())
        mAuth?.signInWithEmailAndPassword(email, password)
            ?.addOnCompleteListener { task ->
                loginResult.postValue(handleNetRequestResponse(task))
            }
    }

    fun loginWithGoogle(credential: AuthCredential) {
        googleLoginResult.postValue(Resource.Loading())
        mAuth?.signInWithCredential(credential)
            ?.addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    googleLoginResult.postValue(Resource.Success("Login Successful!"))
                }else
                    googleLoginResult.postValue(Resource.Error(task.exception?.message.toString()))
            }
    }


    private fun handleNetRequestResponse(response: Task<AuthResult>): Resource<String> {
        if (response.isSuccessful) {
            response.result?.let {
                return Resource.Success("Login successful!")
            }
        }
        return Resource.Error(response.exception?.message.toString())
    }

    fun resetLinkToMail(email: String) {
        resetPassResult.postValue(Resource.Loading())
        mAuth?.sendPasswordResetEmail(email)
            ?.addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    resetPassResult.postValue(Resource.Success("Link sent successfully!"))
                }else
                    resetPassResult.postValue(Resource.Error(task.exception?.message.toString()))
            }
    }

}