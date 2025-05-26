package qo2;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class b1 extends o {

    /* renamed from: b, reason: collision with root package name */
    public final a1 f104534b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(no2.b primitiveSerializer) {
        super(primitiveSerializer);
        Intrinsics.checkNotNullParameter(primitiveSerializer, "primitiveSerializer");
        this.f104534b = new a1(primitiveSerializer.a());
    }

    @Override // no2.h, no2.a
    public final oo2.g a() {
        return this.f104534b;
    }

    @Override // qo2.o, no2.h
    public final void c(po2.d encoder, Object obj) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        int i13 = i(obj);
        a1 a1Var = this.f104534b;
        po2.b h10 = encoder.h(a1Var, i13);
        p(h10, obj, i13);
        h10.a(a1Var);
    }

    @Override // qo2.a, no2.a
    public final Object e(po2.c decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return j(decoder);
    }

    @Override // qo2.a
    public final Object f() {
        return (z0) l(o());
    }

    @Override // qo2.a
    public final int g(Object obj) {
        z0 z0Var = (z0) obj;
        Intrinsics.checkNotNullParameter(z0Var, "<this>");
        return z0Var.d();
    }

    @Override // qo2.a
    public final Iterator h(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead".toString());
    }

    @Override // qo2.a
    public final Object m(Object obj) {
        z0 z0Var = (z0) obj;
        Intrinsics.checkNotNullParameter(z0Var, "<this>");
        return z0Var.a();
    }

    @Override // qo2.o
    public final void n(int i13, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter((z0) obj, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead".toString());
    }

    public abstract Object o();

    public abstract void p(po2.b bVar, Object obj, int i13);
}
