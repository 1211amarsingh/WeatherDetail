package com.kv.userweatherapp.databinding;
import com.kv.userweatherapp.R;
import com.kv.userweatherapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class WeatherFragmentBindingImpl extends WeatherFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tv_lable, 5);
        sViewsWithIds.put(R.id.tv_lable_type, 6);
        sViewsWithIds.put(R.id.tv_lable_humidity, 7);
        sViewsWithIds.put(R.id.tv_lable_wind_speed, 8);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public WeatherFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private WeatherFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[4]
            );
        this.main.setTag(null);
        this.tvHumidity.setTag(null);
        this.tvTemp.setTag(null);
        this.tvType.setTag(null);
        this.tvWindSpeed.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
            setViewmodel((com.kv.userweatherapp.presentation.weather.WeatherViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewmodel(@Nullable com.kv.userweatherapp.presentation.weather.WeatherViewModel Viewmodel) {
        this.mViewmodel = Viewmodel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewmodel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewmodelWeatherdata((androidx.lifecycle.MutableLiveData<com.kv.userweatherapp.domain.model.WeatherModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewmodelWeatherdata(androidx.lifecycle.MutableLiveData<com.kv.userweatherapp.domain.model.WeatherModel> ViewmodelWeatherdata, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
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
        java.lang.String viewmodelWeatherdataCurrentWindSpeed = null;
        java.lang.String viewmodelWeatherdataCurrentTemp = null;
        com.kv.userweatherapp.domain.model.Weather viewmodelWeatherdataCurrentWeatherGetInt0 = null;
        com.kv.userweatherapp.domain.model.WeatherModel viewmodelWeatherdataGetValue = null;
        androidx.lifecycle.MutableLiveData<com.kv.userweatherapp.domain.model.WeatherModel> viewmodelWeatherdata = null;
        java.util.ArrayList<com.kv.userweatherapp.domain.model.Weather> viewmodelWeatherdataCurrentWeather = null;
        java.lang.String viewmodelWeatherdataCurrentWeatherGetInt0Main = null;
        java.lang.String viewmodelWeatherdataCurrentHumidity = null;
        com.kv.userweatherapp.domain.model.CurrentModel viewmodelWeatherdataCurrent = null;
        com.kv.userweatherapp.presentation.weather.WeatherViewModel viewmodel = mViewmodel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewmodel != null) {
                    // read viewmodel.weatherdata
                    viewmodelWeatherdata = viewmodel.getWeatherdata();
                }
                updateLiveDataRegistration(0, viewmodelWeatherdata);


                if (viewmodelWeatherdata != null) {
                    // read viewmodel.weatherdata.getValue()
                    viewmodelWeatherdataGetValue = viewmodelWeatherdata.getValue();
                }


                if (viewmodelWeatherdataGetValue != null) {
                    // read viewmodel.weatherdata.getValue().current
                    viewmodelWeatherdataCurrent = viewmodelWeatherdataGetValue.getCurrent();
                }


                if (viewmodelWeatherdataCurrent != null) {
                    // read viewmodel.weatherdata.getValue().current.wind_speed
                    viewmodelWeatherdataCurrentWindSpeed = viewmodelWeatherdataCurrent.getWind_speed();
                    // read viewmodel.weatherdata.getValue().current.temp
                    viewmodelWeatherdataCurrentTemp = viewmodelWeatherdataCurrent.getTemp();
                    // read viewmodel.weatherdata.getValue().current.weather
                    viewmodelWeatherdataCurrentWeather = viewmodelWeatherdataCurrent.getWeather();
                    // read viewmodel.weatherdata.getValue().current.humidity
                    viewmodelWeatherdataCurrentHumidity = viewmodelWeatherdataCurrent.getHumidity();
                }


                if (viewmodelWeatherdataCurrentWeather != null) {
                    // read viewmodel.weatherdata.getValue().current.weather.get(0)
                    viewmodelWeatherdataCurrentWeatherGetInt0 = viewmodelWeatherdataCurrentWeather.get(0);
                }


                if (viewmodelWeatherdataCurrentWeatherGetInt0 != null) {
                    // read viewmodel.weatherdata.getValue().current.weather.get(0).main
                    viewmodelWeatherdataCurrentWeatherGetInt0Main = viewmodelWeatherdataCurrentWeatherGetInt0.getMain();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvHumidity, viewmodelWeatherdataCurrentHumidity);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTemp, viewmodelWeatherdataCurrentTemp);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvType, viewmodelWeatherdataCurrentWeatherGetInt0Main);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvWindSpeed, viewmodelWeatherdataCurrentWindSpeed);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewmodel.weatherdata
        flag 1 (0x2L): viewmodel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}