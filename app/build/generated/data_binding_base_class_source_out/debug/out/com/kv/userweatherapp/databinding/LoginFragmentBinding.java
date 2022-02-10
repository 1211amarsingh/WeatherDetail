// Generated by data binding compiler. Do not edit!
package com.kv.userweatherapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.kv.userweatherapp.R;
import com.kv.userweatherapp.presentation.login.LoginViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class LoginFragmentBinding extends ViewDataBinding {
  @NonNull
  public final MaterialButton buttonLogin;

  @NonNull
  public final ConstraintLayout main;

  @NonNull
  public final ProgressBar progress;

  @NonNull
  public final TextInputLayout tielUName;

  @NonNull
  public final TextInputLayout tielUPassword;

  @NonNull
  public final TextInputEditText tietPassword;

  @NonNull
  public final TextInputEditText tietUName;

  @Bindable
  protected LoginViewModel mViewmodel;

  protected LoginFragmentBinding(Object _bindingComponent, View _root, int _localFieldCount,
      MaterialButton buttonLogin, ConstraintLayout main, ProgressBar progress,
      TextInputLayout tielUName, TextInputLayout tielUPassword, TextInputEditText tietPassword,
      TextInputEditText tietUName) {
    super(_bindingComponent, _root, _localFieldCount);
    this.buttonLogin = buttonLogin;
    this.main = main;
    this.progress = progress;
    this.tielUName = tielUName;
    this.tielUPassword = tielUPassword;
    this.tietPassword = tietPassword;
    this.tietUName = tietUName;
  }

  public abstract void setViewmodel(@Nullable LoginViewModel viewmodel);

  @Nullable
  public LoginViewModel getViewmodel() {
    return mViewmodel;
  }

  @NonNull
  public static LoginFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.login_fragment, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static LoginFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<LoginFragmentBinding>inflateInternal(inflater, R.layout.login_fragment, root, attachToRoot, component);
  }

  @NonNull
  public static LoginFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.login_fragment, null, false, component)
   */
  @NonNull
  @Deprecated
  public static LoginFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<LoginFragmentBinding>inflateInternal(inflater, R.layout.login_fragment, null, false, component);
  }

  public static LoginFragmentBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static LoginFragmentBinding bind(@NonNull View view, @Nullable Object component) {
    return (LoginFragmentBinding)bind(component, view, R.layout.login_fragment);
  }
}