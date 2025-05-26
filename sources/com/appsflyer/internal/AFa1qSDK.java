package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import androidx.annotation.NonNull;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFa1qSDK {
    public static JSONObject getCurrencyIso4217Code(Map<String, ?> map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey(), getCurrencyIso4217Code(entry.getValue()));
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    public static JSONObject getRevenue(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new JSONObject(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    private static List<Object> getRevenue(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i13 = 0; i13 < jSONArray.length(); i13++) {
            Object obj = jSONArray.get(i13);
            if (obj instanceof JSONArray) {
                obj = getRevenue((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = getCurrencyIso4217Code((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    private static Object getCurrencyIso4217Code(Object obj) {
        if (obj == null) {
            return JSONObject.NULL;
        }
        if ((obj instanceof JSONArray) || (obj instanceof JSONObject) || obj.equals(JSONObject.NULL)) {
            return obj;
        }
        try {
            if (obj instanceof Collection) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    jSONArray.put(getCurrencyIso4217Code(it.next()));
                }
                return jSONArray;
            }
            if (obj.getClass().isArray()) {
                int length = Array.getLength(obj);
                JSONArray jSONArray2 = new JSONArray();
                for (int i13 = 0; i13 < length; i13++) {
                    jSONArray2.put(getCurrencyIso4217Code(Array.get(obj, i13)));
                }
                return jSONArray2;
            }
            if (obj instanceof Map) {
                return getCurrencyIso4217Code((Map<String, ?>) obj);
            }
            return ((obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof String)) ? obj : obj.toString();
        } catch (Exception unused) {
            return JSONObject.NULL;
        }
    }

    public static Map<String, Object> getCurrencyIso4217Code(@NonNull JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONArray) {
                obj = getRevenue((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = getCurrencyIso4217Code((JSONObject) obj);
            }
            hashMap.put(next, obj);
        }
        return hashMap;
    }

    public static AFh1nSDK getCurrencyIso4217Code(Context context) {
        if (context instanceof Activity) {
            return AFh1nSDK.activity;
        }
        if (context instanceof Application) {
            return AFh1nSDK.application;
        }
        return AFh1nSDK.other;
    }
}
