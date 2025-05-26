package x40;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class th implements pc.u0 {

    /* renamed from: f, reason: collision with root package name */
    public static final pc f133387f = new pc(13, 0);

    /* renamed from: a, reason: collision with root package name */
    public final String f133388a;

    /* renamed from: b, reason: collision with root package name */
    public final int f133389b;

    /* renamed from: c, reason: collision with root package name */
    public final pc.r0 f133390c;

    /* renamed from: d, reason: collision with root package name */
    public final pc.r0 f133391d;

    /* renamed from: e, reason: collision with root package name */
    public final pc.r0 f133392e;

    public th(String conversationId, int i13, pc.r0 after, pc.r0 imageMediumSizeSpec, pc.r0 imageLargeSizeSpec) {
        Intrinsics.checkNotNullParameter(conversationId, "conversationId");
        Intrinsics.checkNotNullParameter(after, "after");
        Intrinsics.checkNotNullParameter(imageMediumSizeSpec, "imageMediumSizeSpec");
        Intrinsics.checkNotNullParameter(imageLargeSizeSpec, "imageLargeSizeSpec");
        this.f133388a = conversationId;
        this.f133389b = i13;
        this.f133390c = after;
        this.f133391d = imageMediumSizeSpec;
        this.f133392e = imageLargeSizeSpec;
    }

    @Override // pc.o0
    public final String a() {
        return "69bba408c41703b9171b7a9f80681e2883a0c4b2c1ca5690f68b071d2a94f161";
    }

    @Override // pc.o0
    public final pc.a b() {
        return pc.c.c(y40.mg.f137295a);
    }

    @Override // pc.o0
    public final String c() {
        return f133387f.a();
    }

    @Override // pc.o0
    public final pc.m d() {
        pc.m0 v13 = ep.b.v(c50.l3.f26127a, "data", "name", "type");
        kotlin.collections.q0 q0Var = kotlin.collections.q0.f80391a;
        List list = b50.d0.f21823a;
        List selections = b50.d0.f21833k;
        Intrinsics.checkNotNullParameter(selections, "selections");
        return new pc.m("data", v13, null, q0Var, q0Var, selections);
    }

    @Override // pc.o0
    public final void e(tc.g writer, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        ve.h.h0(writer, customScalarAdapters, this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof th)) {
            return false;
        }
        th thVar = (th) obj;
        return Intrinsics.d(this.f133388a, thVar.f133388a) && this.f133389b == thVar.f133389b && Intrinsics.d(this.f133390c, thVar.f133390c) && Intrinsics.d(this.f133391d, thVar.f133391d) && Intrinsics.d(this.f133392e, thVar.f133392e);
    }

    public final int hashCode() {
        return this.f133392e.hashCode() + pk2.f.a(this.f133391d, pk2.f.a(this.f133390c, ep.b.b(this.f133389b, this.f133388a.hashCode() * 31, 31), 31), 31);
    }

    @Override // pc.o0
    public final String name() {
        return "RelatedPinsQuery";
    }

    public final String toString() {
        return "RelatedPinsQuery(conversationId=" + this.f133388a + ", numberOfPinsToUse=" + this.f133389b + ", after=" + this.f133390c + ", imageMediumSizeSpec=" + this.f133391d + ", imageLargeSizeSpec=" + this.f133392e + ")";
    }
}
