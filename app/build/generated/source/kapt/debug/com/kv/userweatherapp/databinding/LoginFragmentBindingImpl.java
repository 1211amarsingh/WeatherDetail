package com.kv.userweatherapp.databinding;
import com.kv.userweatherapp.R;
import com.kv.userweatherapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class LoginFragmentBindingImpl extends LoginFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tiel_u_name, 4);
        sViewsWithIds.put(R.id.tiel_u_password, 5);
        sViewsWithIds.put(R.id.progress, 6);
    }
    // views
    // variables
    // values
    // listeners
    private OnClickListenerImpl mViewmodelOnLoginAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener tietPasswordandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.password.getValue()
            //         is viewmodel.password.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(tietPassword);
            // localize variables for thread safety
            // viewmodel.password.getValue()
            java.lang.String viewmodelPasswordGetValue = null;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.password != null
            boolean viewmodelPasswordJavaLangObjectNull = false;
            // viewmodel
            com.kv.userweatherapp.presentation.login.LoginViewModel viewmodel = mViewmodel;
            // viewmodel.password
            androidx.lifecycle.MutableLiveData<java.lang.String> viewmodelPassword = null;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelPassword = viewmodel.getPassword();

                viewmodelPasswordJavaLangObjectNull = (viewmodelPassword) != (null);
                if (viewmodelPasswordJavaLangObjectNull) {




                    viewmodelPassword.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener tietUNameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.user_name.getValue()
            //         is viewmodel.user_name.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(tietUName);
            // localize variables for thread safety
            // viewmodel.user_name.getValue()
            java.lang.String viewmodelUserNameGetValue = null;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.user_name
            androidx.lifecycle.MutableLiveData<java.lang.String> viewmodelUserName = null;
            // viewmodel.user_name != null
            boolean viewmodelUserNameJavaLangObjectNull = false;
            // viewmodel
            com.kv.userweatherapp.presentation.login.LoginViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelUserName = viewmodel.getUser_name();

                viewmodelUserNameJavaLangObjectNull = (viewmodelUserName) != (null);
                if (viewmodelUserNameJavaLangObjectNull) {




                    viewmodelUserName.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public LoginFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private LoginFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (com.google.android.material.button.MaterialButton) bindings[3]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.ProgressBar) bindings[6]
            , (com.google.android.material.textfield.TextInputLayout) bindings[4]
            , (com.google.android.material.textfield.TextInputLayout) bindings[5]
            , (com.google.android.material.textfield.TextInputEditText) bindings[2]
            , (com.google.android.material.textfield.TextInputEditText) bindings[1]
            );
        this.buttonLogin.setTag(null);
        this.main.setTag(null);
        this.tietPassword.setTag(null);
        this.tietUName.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
        if (BR.viewmodel == variableId) {
            setViewmodel((com.kv.userweatherapp.presentation.login.LoginViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable com.kv.userweatherapp.presentation.login.LoginViewModel Viewmodel) {
        this.mViewmodel = Viewmodel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewmodel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewmodelUserName((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewmodelPassword((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodelUserName(androidx.lifecycle.MutableLiveData<java.lang.String> ViewmodelUserName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelPassword(androidx.lifecycle.MutableLiveData<java.lang.String> ViewmodelPassword, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
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
        java.lang.String viewmodelPasswordGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewmodelUserName = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewmodelPassword = null;
        android.view.View.OnClickListener viewmodelOnLoginAndroidViewViewOnClickListener = null;
        java.lang.String viewmodelUserNameGetValue = null;
        com.kv.userweatherapp.presentation.login.LoginViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.user_name
                        viewmodelUserName = viewmodel.getUser_name();
                    }
                    updateLiveDataRegistration(0, viewmodelUserName);


                    if (viewmodelUserName != null) {
                        // read viewmodel.user_name.getValue()
                        viewmodelUserNameGetValue = viewmodelUserName.getValue();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.password
                        viewmodelPassword = viewmodel.getPassword();
                    }
                    updateLiveDataRegistration(1, viewmodelPassword);


                    if (viewmodelPassword != null) {
                        // read viewmodel.password.getValue()
                        viewmodelPasswordGetValue = viewmodelPassword.getValue();
                    }
            }
            if ((dirtyFlags & 0xcL) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel::onLogin
                        viewmodelOnLoginAndroidViewViewOnClickListener = (((mViewmodelOnLoginAndroidViewViewOnClickListener == null) ? (mViewmodelOnLoginAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mViewmodelOnLoginAndroidViewViewOnClickListener).setValue(viewmodel));
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            this.buttonLogin.setOnClickListener(viewmodelOnLoginAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tietPassword, viewmodelPasswordGetValue);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.tietPassword, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, tietPasswordandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.tietUName, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, tietUNameandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tietUName, viewmodelUserNameGetValue);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private com.kv.userweatherapp.presentation.login.LoginViewModel value;
        public OnClickListenerImpl setValue(com.kv.userweatherapp.presentation.login.LoginViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onLogin(arg0); 
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel.user_name
        flag 1 (0x2L): viewmodel.password
        flag 2 (0x3L): viewmodel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}