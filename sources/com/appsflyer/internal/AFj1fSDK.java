package com.appsflyer.internal;

import com.android.billingclient.BuildConfig;
import java.io.Serializable;
import java.lang.reflect.Field;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xk2.s;

/* loaded from: classes3.dex */
public final class AFj1fSDK implements AFj1eSDK {
    @Override // com.appsflyer.internal.AFj1eSDK
    @NotNull
    public final String AFAdRevenueData() {
        Serializable m13;
        try {
            xk2.q qVar = s.f135225b;
            Field declaredField = BuildConfig.class.getDeclaredField("VERSION_NAME");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(null);
            Intrinsics.g(obj, "");
            m13 = (String) obj;
        } catch (Throwable th3) {
            xk2.q qVar2 = s.f135225b;
            m13 = ue.c.m(th3);
        }
        return (String) (s.b(m13) ? "" : m13);
    }
}
