package androidx.appcompat.widget;

import android.os.Build;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public final class r2 {

    /* renamed from: a, reason: collision with root package name */
    public Method f16677a;

    /* renamed from: b, reason: collision with root package name */
    public Method f16678b;

    /* renamed from: c, reason: collision with root package name */
    public Method f16679c;

    public r2(Method method, Method method2, Method method3) {
        this.f16677a = method;
        this.f16678b = method2;
        this.f16679c = method3;
    }

    public static void a() {
        if (Build.VERSION.SDK_INT >= 29) {
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }
    }
}
