package oe2;

import java.lang.reflect.Type;

/* loaded from: classes4.dex */
public final class f0 extends r {

    /* renamed from: a, reason: collision with root package name */
    public final Type f94324a;

    /* renamed from: b, reason: collision with root package name */
    public final String f94325b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f94326c;

    /* renamed from: d, reason: collision with root package name */
    public r f94327d;

    public f0(Object obj, String str, Type type) {
        this.f94324a = type;
        this.f94325b = str;
        this.f94326c = obj;
    }

    @Override // oe2.r
    public final Object a(v vVar) {
        r rVar = this.f94327d;
        if (rVar != null) {
            return rVar.a(vVar);
        }
        throw new IllegalStateException("JsonAdapter isn't ready");
    }

    @Override // oe2.r
    public final void d(y yVar, Object obj) {
        r rVar = this.f94327d;
        if (rVar == null) {
            throw new IllegalStateException("JsonAdapter isn't ready");
        }
        rVar.d(yVar, obj);
    }

    public final String toString() {
        r rVar = this.f94327d;
        return rVar != null ? rVar.toString() : super.toString();
    }
}
