package a;

import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public final class t7 {
    public static ads_mobile_sdk.n0 a(int i13) {
        LinkedHashMap linkedHashMap;
        linkedHashMap = ads_mobile_sdk.n0.f8466c;
        ads_mobile_sdk.n0 n0Var = (ads_mobile_sdk.n0) linkedHashMap.get(Integer.valueOf(i13));
        if (n0Var != null) {
            return n0Var;
        }
        throw new Exception("Invalid value for enum " + t7.class.getName() + ": " + i13);
    }
}
