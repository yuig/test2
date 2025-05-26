package a;

import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public final class v9 {
    public static ads_mobile_sdk.q0 a(int i13) {
        LinkedHashMap linkedHashMap;
        linkedHashMap = ads_mobile_sdk.q0.f9880c;
        ads_mobile_sdk.q0 q0Var = (ads_mobile_sdk.q0) linkedHashMap.get(Integer.valueOf(i13));
        if (q0Var != null) {
            return q0Var;
        }
        throw new Exception("Invalid for value enum " + v9.class.getName() + ": " + i13);
    }
}
