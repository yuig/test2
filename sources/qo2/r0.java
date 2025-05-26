package qo2;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class r0 implements po2.c, po2.a {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f104615a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public boolean f104616b;

    @Override // po2.a
    public final byte B(a1 descriptor, int i13) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return G(P(descriptor, i13));
    }

    @Override // po2.a
    public final Object C(oo2.g descriptor, int i13, no2.a deserializer, Object obj) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        String P = P(descriptor, i13);
        k1 k1Var = new k1(this, deserializer, obj, 1);
        this.f104615a.add(P);
        Object invoke = k1Var.invoke();
        if (!this.f104616b) {
            Q();
        }
        this.f104616b = false;
        return invoke;
    }

    @Override // po2.a
    public final int D(oo2.g descriptor, int i13) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        String tag = P(descriptor, i13);
        so2.a aVar = (so2.a) this;
        Intrinsics.checkNotNullParameter(tag, "tag");
        try {
            return ro2.o.e(aVar.T(tag));
        } catch (IllegalArgumentException unused) {
            aVar.V("int");
            throw null;
        }
    }

    @Override // po2.c
    public final byte E() {
        return G(Q());
    }

    public abstract boolean F(Object obj);

    public abstract byte G(Object obj);

    public abstract char H(Object obj);

    public abstract double I(Object obj);

    public abstract float J(Object obj);

    public abstract po2.c K(Object obj, oo2.g gVar);

    public abstract long L(Object obj);

    public abstract short M(Object obj);

    public abstract String N(Object obj);

    public String O(oo2.g descriptor, int i13) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return descriptor.f(i13);
    }

    public final String P(oo2.g gVar, int i13) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        String childName = O(gVar, i13);
        Intrinsics.checkNotNullParameter(childName, "nestedName");
        String parentName = (String) CollectionsKt.d0(this.f104615a);
        if (parentName == null) {
            parentName = "";
        }
        Intrinsics.checkNotNullParameter(parentName, "parentName");
        Intrinsics.checkNotNullParameter(childName, "childName");
        return childName;
    }

    public final Object Q() {
        ArrayList arrayList = this.f104615a;
        Object remove = arrayList.remove(kotlin.collections.f0.i(arrayList));
        this.f104616b = true;
        return remove;
    }

    @Override // po2.a
    public final long e(oo2.g descriptor, int i13) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return L(P(descriptor, i13));
    }

    @Override // po2.c
    public final int g() {
        so2.a aVar = (so2.a) this;
        String tag = (String) Q();
        Intrinsics.checkNotNullParameter(tag, "tag");
        try {
            return ro2.o.e(aVar.T(tag));
        } catch (IllegalArgumentException unused) {
            aVar.V("int");
            throw null;
        }
    }

    @Override // po2.a
    public final boolean h(oo2.g descriptor, int i13) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return F(P(descriptor, i13));
    }

    @Override // po2.c
    public final long i() {
        return L(Q());
    }

    @Override // po2.a
    public final short j(a1 descriptor, int i13) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return M(P(descriptor, i13));
    }

    @Override // po2.a
    public final String k(oo2.g descriptor, int i13) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return N(P(descriptor, i13));
    }

    @Override // po2.a
    public final char l(a1 descriptor, int i13) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return H(P(descriptor, i13));
    }

    @Override // po2.c
    public abstract Object m(no2.a aVar);

    @Override // po2.a
    public final float n(oo2.g descriptor, int i13) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return J(P(descriptor, i13));
    }

    @Override // po2.c
    public final short q() {
        return M(Q());
    }

    @Override // po2.c
    public final float r() {
        return J(Q());
    }

    @Override // po2.c
    public final double s() {
        return I(Q());
    }

    @Override // po2.c
    public final boolean t() {
        return F(Q());
    }

    @Override // po2.c
    public final char u() {
        return H(Q());
    }

    @Override // po2.a
    public final Object v(y0 descriptor, int i13, no2.b deserializer, Object obj) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        String P = P(descriptor, i13);
        k1 k1Var = new k1(this, deserializer, obj, 0);
        this.f104615a.add(P);
        Object invoke = k1Var.invoke();
        if (!this.f104616b) {
            Q();
        }
        this.f104616b = false;
        return invoke;
    }

    @Override // po2.c
    public final int w(oo2.g enumDescriptor) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        so2.a aVar = (so2.a) this;
        String tag = (String) Q();
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        return so2.n.c(enumDescriptor, aVar.f114752c, aVar.T(tag).b(), "");
    }

    @Override // po2.a
    public final po2.c x(a1 descriptor, int i13) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return K(P(descriptor, i13), descriptor.h(i13));
    }

    @Override // po2.a
    public final double y(oo2.g descriptor, int i13) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return I(P(descriptor, i13));
    }

    @Override // po2.c
    public final String z() {
        return N(Q());
    }
}
