package qo2;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.SerializationException;

/* loaded from: classes4.dex */
public abstract class s0 implements po2.d, po2.b {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f104620a = new ArrayList();

    @Override // po2.b
    public final void B(a1 descriptor, int i13, short s13) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        String tag = J(descriptor, i13);
        Intrinsics.checkNotNullParameter(tag, "tag");
        ((so2.c) this).M(tag, ro2.o.a(Short.valueOf(s13)));
    }

    @Override // po2.d
    public final void C(int i13) {
        String tag = (String) K();
        Intrinsics.checkNotNullParameter(tag, "tag");
        ((so2.c) this).M(tag, ro2.o.a(Integer.valueOf(i13)));
    }

    @Override // po2.b
    public final void D(int i13, int i14, oo2.g descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        String tag = J(descriptor, i13);
        Intrinsics.checkNotNullParameter(tag, "tag");
        ((so2.c) this).M(tag, ro2.o.a(Integer.valueOf(i14)));
    }

    @Override // po2.b
    public final void E(oo2.g descriptor, int i13, boolean z13) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        String tag = J(descriptor, i13);
        Intrinsics.checkNotNullParameter(tag, "tag");
        Boolean valueOf = Boolean.valueOf(z13);
        b0 b0Var = ro2.o.f109027a;
        ((so2.c) this).M(tag, new ro2.v(valueOf, false, null));
    }

    @Override // po2.d
    public final void F(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        String tag = (String) K();
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(value, "value");
        ((so2.c) this).M(tag, ro2.o.b(value));
    }

    public abstract void G(Object obj, double d2);

    public abstract void H(float f13, Object obj);

    public abstract po2.d I(Object obj, oo2.g gVar);

    public final String J(oo2.g descriptor, int i13) {
        String childName;
        Intrinsics.checkNotNullParameter(descriptor, "<this>");
        so2.q qVar = (so2.q) this;
        switch (qVar.f114807f) {
            case 2:
                Intrinsics.checkNotNullParameter(descriptor, "descriptor");
                childName = String.valueOf(i13);
                break;
            default:
                Intrinsics.checkNotNullParameter(descriptor, "descriptor");
                Intrinsics.checkNotNullParameter(descriptor, "<this>");
                ro2.c json = qVar.f114761b;
                Intrinsics.checkNotNullParameter(json, "json");
                so2.n.d(descriptor, json);
                childName = descriptor.f(i13);
                break;
        }
        Intrinsics.checkNotNullParameter(childName, "nestedName");
        String parentName = (String) CollectionsKt.d0(this.f104620a);
        if (parentName == null) {
            parentName = "";
        }
        Intrinsics.checkNotNullParameter(parentName, "parentName");
        Intrinsics.checkNotNullParameter(childName, "childName");
        return childName;
    }

    public final Object K() {
        ArrayList arrayList = this.f104620a;
        if (!arrayList.isEmpty()) {
            return arrayList.remove(kotlin.collections.f0.i(arrayList));
        }
        throw new SerializationException("No tag in stack for requested element");
    }

    @Override // po2.b
    public final void a(oo2.g descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!this.f104620a.isEmpty()) {
            K();
        }
        so2.c cVar = (so2.c) this;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        cVar.f114762c.invoke(cVar.L());
    }

    @Override // po2.d
    public final void f(double d2) {
        G(K(), d2);
    }

    @Override // po2.d
    public final void g(byte b13) {
        String tag = (String) K();
        Intrinsics.checkNotNullParameter(tag, "tag");
        ((so2.c) this).M(tag, ro2.o.a(Byte.valueOf(b13)));
    }

    @Override // po2.d
    public final po2.b h(oo2.g descriptor, int i13) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return ((so2.c) this).b(descriptor);
    }

    @Override // po2.b
    public final void i(a1 descriptor, int i13, char c13) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        String tag = J(descriptor, i13);
        Intrinsics.checkNotNullParameter(tag, "tag");
        ((so2.c) this).M(tag, ro2.o.b(String.valueOf(c13)));
    }

    @Override // po2.d
    public abstract void k(no2.h hVar, Object obj);

    @Override // po2.b
    public final void m(int i13, String value, oo2.g descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(value, "value");
        String tag = J(descriptor, i13);
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(value, "value");
        ((so2.c) this).M(tag, ro2.o.b(value));
    }

    @Override // po2.d
    public final void n(oo2.g enumDescriptor, int i13) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        String tag = (String) K();
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        ((so2.c) this).M(tag, ro2.o.b(enumDescriptor.f(i13)));
    }

    @Override // po2.b
    public final void o(oo2.g descriptor, int i13, double d2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        G(J(descriptor, i13), d2);
    }

    @Override // po2.b
    public final po2.d p(a1 descriptor, int i13) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return I(J(descriptor, i13), descriptor.h(i13));
    }

    @Override // po2.d
    public final void q(long j13) {
        String tag = (String) K();
        Intrinsics.checkNotNullParameter(tag, "tag");
        ((so2.c) this).M(tag, ro2.o.a(Long.valueOf(j13)));
    }

    @Override // po2.b
    public final void r(a1 descriptor, int i13, byte b13) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        String tag = J(descriptor, i13);
        Intrinsics.checkNotNullParameter(tag, "tag");
        ((so2.c) this).M(tag, ro2.o.a(Byte.valueOf(b13)));
    }

    @Override // po2.d
    public final void t(short s13) {
        String tag = (String) K();
        Intrinsics.checkNotNullParameter(tag, "tag");
        ((so2.c) this).M(tag, ro2.o.a(Short.valueOf(s13)));
    }

    @Override // po2.b
    public final void u(oo2.g descriptor, int i13, no2.h serializer, Object obj) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.f104620a.add(J(descriptor, i13));
        k(serializer, obj);
    }

    @Override // po2.b
    public final void v(oo2.g descriptor, int i13, float f13) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        H(f13, J(descriptor, i13));
    }

    @Override // po2.d
    public final void w(boolean z13) {
        String tag = (String) K();
        Intrinsics.checkNotNullParameter(tag, "tag");
        Boolean valueOf = Boolean.valueOf(z13);
        b0 b0Var = ro2.o.f109027a;
        ((so2.c) this).M(tag, new ro2.v(valueOf, false, null));
    }

    @Override // po2.d
    public final void x(float f13) {
        H(f13, K());
    }

    @Override // po2.b
    public final void y(oo2.g descriptor, int i13, long j13) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        String tag = J(descriptor, i13);
        Intrinsics.checkNotNullParameter(tag, "tag");
        ((so2.c) this).M(tag, ro2.o.a(Long.valueOf(j13)));
    }

    @Override // po2.d
    public final void z(char c13) {
        String tag = (String) K();
        Intrinsics.checkNotNullParameter(tag, "tag");
        ((so2.c) this).M(tag, ro2.o.b(String.valueOf(c13)));
    }
}
