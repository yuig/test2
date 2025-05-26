package a;

import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public final class i1 {
    public static ads_mobile_sdk.e6 a(int i13) {
        LinkedHashMap linkedHashMap;
        linkedHashMap = ads_mobile_sdk.e6.f4723c;
        ads_mobile_sdk.e6 e6Var = (ads_mobile_sdk.e6) linkedHashMap.get(Integer.valueOf(i13));
        if (e6Var != null) {
            return e6Var;
        }
        throw new Exception("Invalid for value enum " + i1.class.getName() + ": " + i13);
    }
}
