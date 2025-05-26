package xh2;

import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Type;
import jg2.h;
import kh2.a3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final d f134988a;

    public b(c impl) {
        Intrinsics.checkNotNullParameter(impl, "impl");
        this.f134988a = impl;
    }

    @Override // xh2.d
    public final Object a(InputStream inputStream, Type type) {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        Intrinsics.checkNotNullParameter(type, "type");
        return new h(this, inputStream, type, 23).invoke();
    }

    @Override // xh2.d
    public final String b(Object obj, Type type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return (String) new h(this, obj, type, 25).invoke();
    }

    @Override // xh2.d
    public final String c(Class clz, Object obj) {
        Intrinsics.checkNotNullParameter(clz, "clz");
        return (String) new h(this, obj, clz, 24).invoke();
    }

    @Override // xh2.d
    public final String d(Object obj) {
        return (String) new a(0, this, obj).invoke();
    }

    @Override // xh2.d
    public final void e(Object obj, Type type, OutputStream outputStream) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(outputStream, "outputStream");
        new a3(this, obj, type, outputStream, 4).invoke();
    }

    @Override // xh2.d
    public final Object f(Class clz, String json) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(clz, "clz");
        return new h(this, json, clz, 21).invoke();
    }

    @Override // xh2.d
    public final Object g(InputStream inputStream, Class clz) {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        Intrinsics.checkNotNullParameter(clz, "clz");
        return new h(this, inputStream, clz, 22).invoke();
    }

    @Override // xh2.d
    public final void h(Object obj, Class clazz, OutputStream outputStream) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(outputStream, "outputStream");
        new a3(this, obj, clazz, outputStream, 3).invoke();
    }
}
