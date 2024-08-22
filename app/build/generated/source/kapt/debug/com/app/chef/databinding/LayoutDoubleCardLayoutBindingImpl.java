package com.app.chef.databinding;
import com.app.chef.R;
import com.app.chef.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class LayoutDoubleCardLayoutBindingImpl extends LayoutDoubleCardLayoutBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.otpArea, 3);
        sViewsWithIds.put(R.id.titleTxt, 4);
        sViewsWithIds.put(R.id.sloganTxt, 5);
        sViewsWithIds.put(R.id.backImgView, 6);
        sViewsWithIds.put(R.id.field1Area, 7);
        sViewsWithIds.put(R.id.field1, 8);
        sViewsWithIds.put(R.id.et_field1, 9);
        sViewsWithIds.put(R.id.field2Area, 10);
        sViewsWithIds.put(R.id.field2, 11);
        sViewsWithIds.put(R.id.et_field2, 12);
        sViewsWithIds.put(R.id.field3Area, 13);
        sViewsWithIds.put(R.id.field3, 14);
        sViewsWithIds.put(R.id.et_field3, 15);
        sViewsWithIds.put(R.id.field4Area, 16);
        sViewsWithIds.put(R.id.field4, 17);
        sViewsWithIds.put(R.id.et_field4, 18);
        sViewsWithIds.put(R.id.operationArea, 19);
        sViewsWithIds.put(R.id.checkbox, 20);
        sViewsWithIds.put(R.id.forgetPassTxt, 21);
        sViewsWithIds.put(R.id.tv_type1, 22);
        sViewsWithIds.put(R.id.signupOptnArea, 23);
        sViewsWithIds.put(R.id.gotoSignup, 24);
        sViewsWithIds.put(R.id.iv_facebookOptn, 25);
        sViewsWithIds.put(R.id.iv_twitterOptn, 26);
        sViewsWithIds.put(R.id.iv_googleOptn, 27);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final android.widget.RelativeLayout mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public LayoutDoubleCardLayoutBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 28, sIncludes, sViewsWithIds));
    }
    private LayoutDoubleCardLayoutBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[6]
            , (android.widget.CheckBox) bindings[20]
            , (android.widget.LinearLayout) bindings[2]
            , (android.widget.EditText) bindings[9]
            , (android.widget.EditText) bindings[12]
            , (android.widget.EditText) bindings[15]
            , (android.widget.EditText) bindings[18]
            , (android.widget.TextView) bindings[8]
            , (android.widget.LinearLayout) bindings[7]
            , (android.widget.TextView) bindings[11]
            , (android.widget.LinearLayout) bindings[10]
            , (android.widget.TextView) bindings[14]
            , (android.widget.LinearLayout) bindings[13]
            , (android.widget.TextView) bindings[17]
            , (android.widget.LinearLayout) bindings[16]
            , (android.widget.TextView) bindings[21]
            , (android.widget.TextView) bindings[24]
            , (android.widget.ImageView) bindings[25]
            , (android.widget.ImageView) bindings[27]
            , (android.widget.ImageView) bindings[26]
            , (android.widget.LinearLayout) bindings[19]
            , (bindings[3] != null) ? com.app.chef.databinding.LayoutOtpSixDigitsBinding.bind((android.view.View) bindings[3]) : null
            , (android.widget.LinearLayout) bindings[23]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[22]
            );
        this.contentArea.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.RelativeLayout) bindings[1];
        this.mboundView1.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.res == variableId) {
            setRes((com.app.chef.core.utils.ColorsRes) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setRes(@Nullable com.app.chef.core.utils.ColorsRes Res) {
        this.mRes = Res;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.res);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        int resGetColorXmlJavaLangStringAppThemeAccent = 0;
        com.app.chef.core.utils.ColorsRes res = mRes;

        if ((dirtyFlags & 0x3L) != 0) {



                if (res != null) {
                    // read res.getColorXml("appTheme_accent")
                    resGetColorXmlJavaLangStringAppThemeAccent = res.getColorXml("appTheme_accent");
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.app.chef.core.AdapterBindings.AdapterBindingsKt.setBackgroundColor(this.mboundView1, resGetColorXmlJavaLangStringAppThemeAccent);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): res
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}