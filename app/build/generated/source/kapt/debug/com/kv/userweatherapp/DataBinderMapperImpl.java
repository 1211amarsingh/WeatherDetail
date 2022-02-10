package com.kv.userweatherapp;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.kv.userweatherapp.databinding.AddUserFragmentBindingImpl;
import com.kv.userweatherapp.databinding.HomeFragmentBindingImpl;
import com.kv.userweatherapp.databinding.ItemUserBindingImpl;
import com.kv.userweatherapp.databinding.LoginFragmentBindingImpl;
import com.kv.userweatherapp.databinding.MainActivityBindingImpl;
import com.kv.userweatherapp.databinding.WeatherFragmentBindingImpl;
import com.kv.userweatherapp.databinding.WelcomeFragmentBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ADDUSERFRAGMENT = 1;

  private static final int LAYOUT_HOMEFRAGMENT = 2;

  private static final int LAYOUT_ITEMUSER = 3;

  private static final int LAYOUT_LOGINFRAGMENT = 4;

  private static final int LAYOUT_MAINACTIVITY = 5;

  private static final int LAYOUT_WEATHERFRAGMENT = 6;

  private static final int LAYOUT_WELCOMEFRAGMENT = 7;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(7);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.kv.userweatherapp.R.layout.add_user_fragment, LAYOUT_ADDUSERFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.kv.userweatherapp.R.layout.home_fragment, LAYOUT_HOMEFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.kv.userweatherapp.R.layout.item_user, LAYOUT_ITEMUSER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.kv.userweatherapp.R.layout.login_fragment, LAYOUT_LOGINFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.kv.userweatherapp.R.layout.main_activity, LAYOUT_MAINACTIVITY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.kv.userweatherapp.R.layout.weather_fragment, LAYOUT_WEATHERFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.kv.userweatherapp.R.layout.welcome_fragment, LAYOUT_WELCOMEFRAGMENT);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ADDUSERFRAGMENT: {
          if ("layout/add_user_fragment_0".equals(tag)) {
            return new AddUserFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for add_user_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_HOMEFRAGMENT: {
          if ("layout/home_fragment_0".equals(tag)) {
            return new HomeFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for home_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMUSER: {
          if ("layout/item_user_0".equals(tag)) {
            return new ItemUserBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_user is invalid. Received: " + tag);
        }
        case  LAYOUT_LOGINFRAGMENT: {
          if ("layout/login_fragment_0".equals(tag)) {
            return new LoginFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for login_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_MAINACTIVITY: {
          if ("layout/main_activity_0".equals(tag)) {
            return new MainActivityBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for main_activity is invalid. Received: " + tag);
        }
        case  LAYOUT_WEATHERFRAGMENT: {
          if ("layout/weather_fragment_0".equals(tag)) {
            return new WeatherFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for weather_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_WELCOMEFRAGMENT: {
          if ("layout/welcome_fragment_0".equals(tag)) {
            return new WelcomeFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for welcome_fragment is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(3);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "item");
      sKeys.put(2, "viewmodel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(7);

    static {
      sKeys.put("layout/add_user_fragment_0", com.kv.userweatherapp.R.layout.add_user_fragment);
      sKeys.put("layout/home_fragment_0", com.kv.userweatherapp.R.layout.home_fragment);
      sKeys.put("layout/item_user_0", com.kv.userweatherapp.R.layout.item_user);
      sKeys.put("layout/login_fragment_0", com.kv.userweatherapp.R.layout.login_fragment);
      sKeys.put("layout/main_activity_0", com.kv.userweatherapp.R.layout.main_activity);
      sKeys.put("layout/weather_fragment_0", com.kv.userweatherapp.R.layout.weather_fragment);
      sKeys.put("layout/welcome_fragment_0", com.kv.userweatherapp.R.layout.welcome_fragment);
    }
  }
}
