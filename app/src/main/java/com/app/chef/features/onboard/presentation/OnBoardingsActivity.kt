package com.app.chef.features.onboard.presentation

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Build
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.app.chef.MainActivity
import com.app.chef.R
import com.app.chef.features.onboard.presentation.adapter.OnBoardingAdapter
import com.app.chef.databinding.ActivityOnBoardingBinding
import com.app.chef.features.auth.presentation.base.AuthenticationsActivity
import com.app.chef.features.onboard.domain.model.OnBoardingModel


class OnBoardingsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityOnBoardingBinding
    private lateinit var obAdapter: OnBoardingAdapter
    lateinit var list: ArrayList<OnBoardingModel>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnBoardingBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        list = ArrayList()

        initViews()
        loadData();
    }

    private fun initViews() {
        obAdapter = OnBoardingAdapter(list)
        binding.onboarding.apply{
            adapter = obAdapter
            registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
                override fun onPageSelected(position: Int) {
                    super.onPageSelected(position)
                    updateIndicatingViews()
                }
            })
        }

        binding.skipBtn.setOnClickListener {
            startActivity(Intent(applicationContext, MainActivity::class.java))
        }
        binding.nextBtn.setOnClickListener {
            if (binding.onboarding.currentItem == list.lastIndex) {
                startActivity(Intent(applicationContext, AuthenticationsActivity::class.java))
            } else {
                binding.onboarding.currentItem++
                obAdapter.notifyDataSetChanged()
            }
        }
    }

    private fun updateIndicatingViews() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            binding.view1.backgroundTintList =
                resources.getColorStateList(R.color.appTheme_primary_light, theme)

            binding.view2.backgroundTintList =
                resources.getColorStateList(R.color.appTheme_primary_light, theme)
            binding.view3.backgroundTintList =
                resources.getColorStateList(R.color.appTheme_primary_light, theme)
            when (binding.onboarding.currentItem) {
                1 -> binding.view2.backgroundTintList =
                    resources.getColorStateList(R.color.appTheme_primary, theme)

                2 -> binding.view3.backgroundTintList =
                    resources.getColorStateList(R.color.appTheme_primary, theme)

                else -> {
                    binding.view1.backgroundTintList =
                        resources.getColorStateList(R.color.appTheme_primary, theme)
                }
            }
        }
    }

    private fun loadData() {
        list.clear()
        list.add(
            OnBoardingModel(
                "https://dummyimage.com/600x400/000/fff",
                "All your favorites",
                "Get all your loved foods in one once place, you just place the orer we do the rest"
            )
        )
        list.add(
            OnBoardingModel(
                "https://resizing.flixster.com/pF8FZMke9ofUVrJwrrma3RAcpmA=/206x305/v2/https://resizing.flixster.com/-XZAfHZM39UwaGJIFWKAE8fS0ak=/v3/t/assets/p18253291_b_v10_ad.jpg",
                "All your favorites",
                "Get all your loved foods in one once place, you just place the orer we do the rest"
            )
        )
        list.add(
            OnBoardingModel(
                "https://5.imimg.com/data5/SELLER/Default/2023/4/299176288/JR/MF/PD/138005083/female-measurement-dummy-1000x1000.jpg",
                "All your favorites",
                "Get all your loved foods in one once place, you just place the orer we do the rest"
            )
        )
        obAdapter.notifyDataSetChanged()
    }

}