package com.enet.textbaiduapi;

import android.util.Log;

import com.zhy.http.okhttp.callback.Callback;

import okhttp3.Call;
import okhttp3.Response;

/**
 * Created by zhouqiang on 2017/2/28.
 */
public class MyStringCallback extends Callback {
    @Override
    public Object parseNetworkResponse(Response response, int id) throws Exception {


        return null;
    }

    @Override
    public void onError(Call call, Exception e, int id) {
        Log.e("zq",e.toString());
    }

    @Override
    public void onResponse(Object response, int id) {

        if(response!=null) {
            Log.e("zq", "" + response.toString());
        }
    }
}
