package com.kv.userweatherapp.databinding;
import com.kv.userweatherapp.R;
import com.kv.userweatherapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class AddUserFragmentBindingImpl extends AddUserFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tiel_f_name, 5);
        sViewsWithIds.put(R.id.tiel_l_name, 6);
        sViewsWithIds.put(R.id.tiel_email, 7);
        sViewsWithIds.put(R.id.cl_button, 8);
        sViewsWithIds.put(R.id.bt_cancel, 9);
        sViewsWithIds.put(R.id.progress, 10);
    }
    // views
    // variables
    // values
    // listeners
    private OnClickListenerImpl mViewmodelSaveAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener tietEmailandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.email.getValue()
            //         is viewmodel.email.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(tietEmail);
            // localize variables for thread safety
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.email != null
            boolean viewmodelEmailJavaLangObjectNull = false;
            // viewmodel.email.getValue()
            java.lang.String viewmodelEmailGetValue = null;
            // viewmodel.email
            androidx.lifecycle.MutableLiveData<java.lang.String> viewmodelEmail = null;
            // viewmodel
            com.kv.userweatherapp.presentation.useradd.AddUserViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelEmail = viewmodel.getEmail();

                viewmodelEmailJavaLangObjectNull = (viewmodelEmail) != (null);
                if (viewmodelEmailJavaLangObjectNull) {




                    viewmodelEmail.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener tietFNameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.fname.getValue()
            //         is viewmodel.fname.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(tietFName);
            // localize variables for thread safety
            // viewmodel.fname.getValue()
            java.lang.String viewmodelFnameGetValue = null;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.fname
            androidx.lifecycle.MutableLiveData<java.lang.String> viewmodelFname = null;
            // viewmodel.fname != null
            boolean viewmodelFnameJavaLangObjectNull = false;
            // viewmodel
            com.kv.userweatherapp.presentation.useradd.AddUserViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelFname = viewmodel.getFname();

                viewmodelFnameJavaLangObjectNull = (viewmodelFname) != (null);
                if (viewmodelFnameJavaLangObjectNull) {




                    viewmodelFname.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener tietLNameandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewmodel.lname.getValue()
            //         is viewmodel.lname.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(tietLName);
            // localize variables for thread safety
            // viewmodel.lname != null
            boolean viewmodelLnameJavaLangObjectNull = false;
            // viewmodel != null
            boolean viewmodelJavaLangObjectNull = false;
            // viewmodel.lname
            androidx.lifecycle.MutableLiveData<java.lang.String> viewmodelLname = null;
            // viewmodel.lname.getValue()
            java.lang.String viewmodelLnameGetValue = null;
            // viewmodel
            com.kv.userweatherapp.presentation.useradd.AddUserViewModel viewmodel = mViewmodel;



            viewmodelJavaLangObjectNull = (viewmodel) != (null);
            if (viewmodelJavaLangObjectNull) {


                viewmodelLname = viewmodel.getLname();

                viewmodelLnameJavaLangObjectNull = (viewmodelLname) != (null);
                if (viewmodelLnameJavaLangObjectNull) {




                    viewmodelLname.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public AddUserFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private AddUserFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (com.google.android.material.button.MaterialButton) bindings[9]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[8]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (com.google.android.material.button.MaterialButton) bindings[4]
            , (android.widget.ProgressBar) bindings[10]
            , (com.google.android.material.textfield.TextInputLayout) bindings[7]
            , (com.google.android.material.textfield.TextInputLayout) bindings[5]
            , (com.google.android.material.textfield.TextInputLayout) bindings[6]
            , (com.google.android.material.textfield.TextInputEditText) bindings[3]
            , (com.google.android.material.textfield.TextInputEditText) bindings[1]
            , (com.google.android.material.textfield.TextInputEditText) bindings[2]
            );
        this.main.setTag(null);
        this.materialButton.setTag(null);
        this.tietEmail.setTag(null);
        this.tietFName.setTag(null);
        this.tietLName.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
            setViewmodel((com.kv.userweatherapp.presentation.useradd.AddUserViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable com.kv.userweatherapp.presentation.useradd.AddUserViewModel Viewmodel) {
        this.mViewmodel = Viewmodel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.viewmodel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewmodelFname((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewmodelEmail((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewmodelLname((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodelFname(androidx.lifecycle.MutableLiveData<java.lang.String> ViewmodelFname, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelEmail(androidx.lifecycle.MutableLiveData<java.lang.String> ViewmodelEmail, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewmodelLname(androidx.lifecycle.MutableLiveData<java.lang.String> ViewmodelLname, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
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
        java.lang.String viewmodelFnameGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewmodelFname = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewmodelEmail = null;
        java.lang.String viewmodelLnameGetValue = null;
        android.view.View.OnClickListener viewmodelSaveAndroidViewViewOnClickListener = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewmodelLname = null;
        java.lang.String viewmodelEmailGetValue = null;
        com.kv.userweatherapp.presentation.useradd.AddUserViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x19L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.fname
                        viewmodelFname = viewmodel.getFname();
                    }
                    updateLiveDataRegistration(0, viewmodelFname);


                    if (viewmodelFname != null) {
                        // read viewmodel.fname.getValue()
                        viewmodelFnameGetValue = viewmodelFname.getValue();
                    }
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.email
                        viewmodelEmail = viewmodel.getEmail();
                    }
                    updateLiveDataRegistration(1, viewmodelEmail);


                    if (viewmodelEmail != null) {
                        // read viewmodel.email.getValue()
                        viewmodelEmailGetValue = viewmodelEmail.getValue();
                    }
            }
            if ((dirtyFlags & 0x18L) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel::save
                        viewmodelSaveAndroidViewViewOnClickListener = (((mViewmodelSaveAndroidViewViewOnClickListener == null) ? (mViewmodelSaveAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mViewmodelSaveAndroidViewViewOnClickListener).setValue(viewmodel));
                    }
            }
            if ((dirtyFlags & 0x1cL) != 0) {

                    if (viewmodel != null) {
                        // read viewmodel.lname
                        viewmodelLname = viewmodel.getLname();
                    }
                    updateLiveDataRegistration(2, viewmodelLname);


                    if (viewmodelLname != null) {
                        // read viewmodel.lname.getValue()
                        viewmodelLnameGetValue = viewmodelLname.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x18L) != 0) {
            // api target 1

            this.materialButton.setOnClickListener(viewmodelSaveAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tietEmail, viewmodelEmailGetValue);
        }
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.tietEmail, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, tietEmailandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.tietFName, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, tietFNameandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.tietLName, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, tietLNameandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tietFName, viewmodelFnameGetValue);
        }
        if ((dirtyFlags & 0x1cL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tietLName, viewmodelLnameGetValue);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private com.kv.userweatherapp.presentation.useradd.AddUserViewModel value;
        public OnClickListenerImpl setValue(com.kv.userweatherapp.presentation.useradd.AddUserViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.save(arg0); 
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel.fname
        flag 1 (0x2L): viewmodel.email
        flag 2 (0x3L): viewmodel.lname
        flag 3 (0x4L): viewmodel
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}