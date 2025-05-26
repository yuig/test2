package x40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ej implements pc.u0 {

    /* renamed from: b, reason: collision with root package name */
    public static final zy.b0 f132364b = new zy.b0(15, 0);

    /* renamed from: a, reason: collision with root package name */
    public final String f132365a;

    public ej(String id3) {
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter("345x", "imageSizeSpec");
        Intrinsics.checkNotNullParameter("345x", "imageSpec");
        this.f132365a = id3;
    }

    @Override // pc.o0
    public final String a() {
        return "a0b07090e42ba2dace067e63754acf1fc80f9bee121b339b646712efaee0804c";
    }

    @Override // pc.o0
    public final pc.a b() {
        return pc.c.c(y40.uh.f137551a);
    }

    @Override // pc.o0
    public final String c() {
        return f132364b.b();
    }

    @Override // pc.o0
    public final pc.m d() {
        pc.m0 v13 = ep.b.v(c50.l3.f26127a, "data", "name", "type");
        kotlin.collections.q0 q0Var = kotlin.collections.q0.f80391a;
        List list = b50.g0.f21858a;
        List selections = b50.g0.f21872o;
        Intrinsics.checkNotNullParameter(selections, "selections");
        return new pc.m("data", v13, null, q0Var, q0Var, selections);
    }

    @Override // pc.o0
    public final void e(tc.g writer, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(this, "value");
        writer.M0("id");
        a10.e eVar = pc.c.f99520a;
        eVar.d(writer, customScalarAdapters, this.f132365a);
        writer.M0("imageSizeSpec");
        eVar.d(writer, customScalarAdapters, "345x");
        writer.M0("imageSpec");
        eVar.d(writer, customScalarAdapters, "345x");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ej) {
            return Intrinsics.d(this.f132365a, ((ej) obj).f132365a) && Intrinsics.d("345x", "345x") && Intrinsics.d("345x", "345x");
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f132365a.hashCode() * 31) + 1571076) * 31) + 1571076;
    }

    @Override // pc.o0
    public final String name() {
        return "UserConnectionQuery";
    }

    public final String toString() {
        return a.a.p(new StringBuilder("UserConnectionQuery(id="), this.f132365a, ", imageSizeSpec=345x, imageSpec=345x)");
    }
}
