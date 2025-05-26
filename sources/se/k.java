package se;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class k {

    /* renamed from: g, reason: collision with root package name */
    public static k f112370g;

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicBoolean f112371h = new AtomicBoolean(false);

    /* renamed from: a, reason: collision with root package name */
    public final Class f112372a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f112373b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f112374c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f112375d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f112376e;

    /* renamed from: f, reason: collision with root package name */
    public final Method f112377f;

    public k(Class skuDetailsParamsClazz, Class builderClazz, Method newBuilderMethod, Method setTypeMethod, Method setSkusListMethod, Method buildMethod) {
        Intrinsics.checkNotNullParameter(skuDetailsParamsClazz, "skuDetailsParamsClazz");
        Intrinsics.checkNotNullParameter(builderClazz, "builderClazz");
        Intrinsics.checkNotNullParameter(newBuilderMethod, "newBuilderMethod");
        Intrinsics.checkNotNullParameter(setTypeMethod, "setTypeMethod");
        Intrinsics.checkNotNullParameter(setSkusListMethod, "setSkusListMethod");
        Intrinsics.checkNotNullParameter(buildMethod, "buildMethod");
        this.f112372a = skuDetailsParamsClazz;
        this.f112373b = builderClazz;
        this.f112374c = newBuilderMethod;
        this.f112375d = setTypeMethod;
        this.f112376e = setSkusListMethod;
        this.f112377f = buildMethod;
    }

    public final Object a(ArrayList arrayList) {
        Object h10;
        Object h13;
        Class cls = this.f112373b;
        if (p001if.a.b(this)) {
            return null;
        }
        try {
            Object h14 = l.h(this.f112372a, null, this.f112374c, new Object[0]);
            if (h14 != null && (h10 = l.h(cls, h14, this.f112375d, "inapp")) != null && (h13 = l.h(cls, h10, this.f112376e, arrayList)) != null) {
                return l.h(cls, h13, this.f112377f, new Object[0]);
            }
            return null;
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
            return null;
        }
    }
}
