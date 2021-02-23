// Generated by data binding compiler. Do not edit!
package com.netease.music.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.netease.music.R;
import java.lang.Boolean;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class DelegateNormalLoadingBinding extends ViewDataBinding {
  @NonNull
  public final ImageView animImage;

  @NonNull
  public final ImageView animImage2;

  @NonNull
  public final TextView animText;

  @Bindable
  protected Boolean mLoading;

  protected DelegateNormalLoadingBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView animImage, ImageView animImage2, TextView animText) {
    super(_bindingComponent, _root, _localFieldCount);
    this.animImage = animImage;
    this.animImage2 = animImage2;
    this.animText = animText;
  }

  public abstract void setLoading(@Nullable Boolean loading);

  @Nullable
  public Boolean getLoading() {
    return mLoading;
  }

  @NonNull
  public static DelegateNormalLoadingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.delegate_normal_loading, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static DelegateNormalLoadingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<DelegateNormalLoadingBinding>inflateInternal(inflater, R.layout.delegate_normal_loading, root, attachToRoot, component);
  }

  @NonNull
  public static DelegateNormalLoadingBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.delegate_normal_loading, null, false, component)
   */
  @NonNull
  @Deprecated
  public static DelegateNormalLoadingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<DelegateNormalLoadingBinding>inflateInternal(inflater, R.layout.delegate_normal_loading, null, false, component);
  }

  public static DelegateNormalLoadingBinding bind(@NonNull View view) {
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
  public static DelegateNormalLoadingBinding bind(@NonNull View view, @Nullable Object component) {
    return (DelegateNormalLoadingBinding)bind(component, view, R.layout.delegate_normal_loading);
  }
}
