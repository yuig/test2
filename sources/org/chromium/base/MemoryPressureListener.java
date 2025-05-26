package org.chromium.base;

import a.e;
import dp2.g;
import org.chromium.base.annotations.CalledByNative;

/* loaded from: classes4.dex */
public class MemoryPressureListener {

    /* renamed from: a, reason: collision with root package name */
    public static g f97308a;

    @CalledByNative
    public static void addNativeCallback() {
        Object obj = ThreadUtils.f97317a;
        e eVar = new e(4);
        if (f97308a == null) {
            f97308a = new g();
        }
        f97308a.b(eVar);
    }
}
