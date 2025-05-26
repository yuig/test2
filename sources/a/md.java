package a;

import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public final class md extends ads_mobile_sdk.d {
    public final void a(String str, o8 o8Var) {
        LinkedHashMap linkedHashMap = this.f4078a;
        if (o8Var == null) {
            throw new NullPointerException("provider");
        }
        linkedHashMap.put(str, o8Var);
    }
}
