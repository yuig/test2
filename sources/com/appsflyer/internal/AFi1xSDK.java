package com.appsflyer.internal;

import java.util.ArrayList;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;
import xk2.r;
import xk2.s;

/* loaded from: classes.dex */
public final class AFi1xSDK {
    public final AFi1tSDK getCurrencyIso4217Code;
    public AFi1rSDK getMediationNetwork;
    public final AFi1wSDK getMonetizationNetwork;

    public AFi1xSDK(@NotNull JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "");
        this.getMediationNetwork = getCurrencyIso4217Code(jSONObject);
        this.getMonetizationNetwork = getMediationNetwork(jSONObject);
        this.getCurrencyIso4217Code = getMonetizationNetwork(jSONObject);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static AFi1rSDK getCurrencyIso4217Code(JSONObject jSONObject) {
        Object m13;
        q0 q0Var;
        try {
            xk2.q qVar = s.f135225b;
            JSONObject currencyIso4217Code = getCurrencyIso4217Code(jSONObject, "r_debugger");
            if (currencyIso4217Code != null) {
                long j13 = currencyIso4217Code.getLong("ttl");
                int i13 = currencyIso4217Code.getInt("counter");
                String optString = currencyIso4217Code.optString("app_ver", "");
                String optString2 = currencyIso4217Code.optString("sdk_ver", "");
                float optDouble = (float) currencyIso4217Code.optDouble("ratio", 1.0d);
                JSONArray optJSONArray = currencyIso4217Code.optJSONArray("tags");
                if (optJSONArray != null) {
                    Intrinsics.checkNotNullExpressionValue(optJSONArray, "");
                    ArrayList arrayList = new ArrayList();
                    int length = optJSONArray.length();
                    for (int i14 = 0; i14 < length; i14++) {
                        String string = optJSONArray.getString(i14);
                        Intrinsics.checkNotNullExpressionValue(string, "");
                        arrayList.add(string);
                    }
                    q0Var = arrayList;
                } else {
                    q0Var = q0.f80391a;
                }
                Intrinsics.checkNotNullExpressionValue(optString, "");
                Intrinsics.checkNotNullExpressionValue(optString2, "");
                m13 = new AFi1rSDK(j13, optDouble, q0Var, i13, optString, optString2);
            } else {
                m13 = null;
            }
        } catch (Throwable th3) {
            xk2.q qVar2 = s.f135225b;
            m13 = ue.c.m(th3);
        }
        xk2.q qVar3 = s.f135225b;
        return (AFi1rSDK) (m13 instanceof r ? null : m13);
    }

    private static AFi1wSDK getMediationNetwork(JSONObject jSONObject) {
        Object m13;
        try {
            xk2.q qVar = s.f135225b;
            JSONObject currencyIso4217Code = getCurrencyIso4217Code(jSONObject, "exc_mngr");
            m13 = currencyIso4217Code != null ? new AFi1wSDK(currencyIso4217Code.getString("sdk_ver"), currencyIso4217Code.optInt("min", -1), currencyIso4217Code.optInt("expire", -1), currencyIso4217Code.optLong("ttl", -1L)) : null;
        } catch (Throwable th3) {
            xk2.q qVar2 = s.f135225b;
            m13 = ue.c.m(th3);
        }
        return (AFi1wSDK) (m13 instanceof r ? null : m13);
    }

    private static AFi1tSDK getMonetizationNetwork(JSONObject jSONObject) {
        Object m13;
        try {
            xk2.q qVar = s.f135225b;
            JSONObject currencyIso4217Code = getCurrencyIso4217Code(jSONObject, "meta_data");
            m13 = currencyIso4217Code != null ? new AFi1tSDK(currencyIso4217Code.optDouble("send_rate", 1.0d)) : null;
        } catch (Throwable th3) {
            xk2.q qVar2 = s.f135225b;
            m13 = ue.c.m(th3);
        }
        return (AFi1tSDK) (m13 instanceof r ? null : m13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.d(AFi1xSDK.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.g(obj, "");
        AFi1xSDK aFi1xSDK = (AFi1xSDK) obj;
        return Intrinsics.d(this.getMonetizationNetwork, aFi1xSDK.getMonetizationNetwork) && Intrinsics.d(this.getCurrencyIso4217Code, aFi1xSDK.getCurrencyIso4217Code) && Intrinsics.d(this.getMediationNetwork, aFi1xSDK.getMediationNetwork);
    }

    public final int hashCode() {
        AFi1wSDK aFi1wSDK = this.getMonetizationNetwork;
        int hashCode = (aFi1wSDK != null ? aFi1wSDK.hashCode() : 0) * 31;
        AFi1tSDK aFi1tSDK = this.getCurrencyIso4217Code;
        int hashCode2 = (hashCode + (aFi1tSDK != null ? aFi1tSDK.hashCode() : 0)) * 31;
        AFi1rSDK aFi1rSDK = this.getMediationNetwork;
        return hashCode2 + (aFi1rSDK != null ? aFi1rSDK.hashCode() : 0);
    }

    private static JSONObject getCurrencyIso4217Code(JSONObject jSONObject, String str) {
        JSONObject optJSONObject;
        if (!jSONObject.has(str) || (optJSONObject = jSONObject.getJSONArray(str).optJSONObject(0).optJSONObject("data")) == null) {
            return null;
        }
        return optJSONObject.optJSONObject("v1");
    }
}
