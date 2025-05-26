package xh2;

import a.g;
import ao2.m0;
import com.squareup.moshi.JsonDataException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Type;
import kh2.g2;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import oe2.h0;
import oe2.r;
import oe2.u;
import oe2.w;
import wo2.j;
import wo2.x;
import wo2.y;
import xk2.m;
import xk2.v;

/* loaded from: classes4.dex */
public final class c implements d {

    /* renamed from: a, reason: collision with root package name */
    public final g f134989a = new g(17);

    /* renamed from: b, reason: collision with root package name */
    public final v f134990b = m.b(new g2(this, 5));

    @Override // xh2.d
    public final Object a(InputStream inputStream, Type type) {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        Intrinsics.checkNotNullParameter(type, "type");
        y i13 = m0.i(m0.l0(inputStream));
        try {
            r b13 = i().b(type);
            b13.getClass();
            Object a13 = b13.a(new w(i13));
            if (a13 == null) {
                throw new IllegalStateException("JSON conversion failed.".toString());
            }
            dl2.b.J(i13, null);
            return a13;
        } finally {
        }
    }

    @Override // xh2.d
    public final String b(Object obj, Type type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return i().b(type).c(obj);
    }

    @Override // xh2.d
    public final String c(Class clz, Object obj) {
        Intrinsics.checkNotNullParameter(clz, "clz");
        return i().a(clz).c(obj);
    }

    @Override // xh2.d
    public final String d(Object obj) {
        if (obj == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        return i().b(obj.getClass()).c(obj);
    }

    @Override // xh2.d
    public final void e(Object obj, Type type, OutputStream outputStream) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(outputStream, "outputStream");
        x h10 = m0.h(m0.i0(outputStream));
        try {
            r b13 = i().b(type);
            b13.getClass();
            b13.d(new oe2.x(h10), obj);
            Unit unit = Unit.f80348a;
            dl2.b.J(h10, null);
        } finally {
        }
    }

    @Override // xh2.d
    public final Object f(Class clz, String json) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(clz, "clz");
        r a13 = i().a(clz);
        a13.getClass();
        j jVar = new j();
        jVar.r0(json);
        w wVar = new w(jVar);
        Object a14 = a13.a(wVar);
        if (wVar.g() != u.END_DOCUMENT) {
            throw new JsonDataException("JSON document was not fully consumed.");
        }
        if (a14 != null) {
            return a14;
        }
        throw new IllegalStateException("JSON conversion failed.".toString());
    }

    @Override // xh2.d
    public final Object g(InputStream inputStream, Class clz) {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        Intrinsics.checkNotNullParameter(clz, "clz");
        y i13 = m0.i(m0.l0(inputStream));
        try {
            r a13 = i().a(clz);
            a13.getClass();
            Object a14 = a13.a(new w(i13));
            if (a14 == null) {
                throw new IllegalStateException("JSON conversion failed.".toString());
            }
            dl2.b.J(i13, null);
            return a14;
        } finally {
        }
    }

    @Override // xh2.d
    public final void h(Object obj, Class clazz, OutputStream outputStream) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(outputStream, "outputStream");
        x h10 = m0.h(m0.i0(outputStream));
        try {
            r a13 = i().a(clazz);
            a13.getClass();
            a13.d(new oe2.x(h10), obj);
            Unit unit = Unit.f80348a;
            dl2.b.J(h10, null);
        } finally {
        }
    }

    public final h0 i() {
        return (h0) this.f134990b.getValue();
    }
}
