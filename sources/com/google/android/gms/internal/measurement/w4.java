package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Build;

/* loaded from: classes3.dex */
public final /* synthetic */ class w4 implements ok.g0 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Context f31683a;

    @Override // ok.g0
    public final Object get() {
        ok.v vVar;
        ok.v b13;
        Context context = this.f31683a;
        synchronized (r4.class) {
            try {
                vVar = r4.f31618a;
                if (vVar == null) {
                    String str = Build.TYPE;
                    String str2 = Build.TAGS;
                    if (!str.equals("eng")) {
                        if (str.equals("userdebug")) {
                        }
                        b13 = ok.a.f95409a;
                        vVar = b13;
                        r4.f31618a = vVar;
                    }
                    if (!str2.contains("dev-keys")) {
                        if (str2.contains("test-keys")) {
                        }
                        b13 = ok.a.f95409a;
                        vVar = b13;
                        r4.f31618a = vVar;
                    }
                    if (!context.isDeviceProtectedStorage()) {
                        context = context.createDeviceProtectedStorageContext();
                    }
                    b13 = p0.b(context);
                    vVar = b13;
                    r4.f31618a = vVar;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return vVar;
    }
}
