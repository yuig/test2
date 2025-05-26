package qn2;

import kotlin.jvm.internal.Intrinsics;
import pk.a0;
import pn2.a1;
import pn2.b0;
import pn2.v1;

/* loaded from: classes2.dex */
public final class o implements n {

    /* renamed from: c */
    public final g f104514c;

    /* renamed from: d */
    public final bn2.o f104515d;

    public o() {
        h kotlinTypeRefiner = h.f104498a;
        e kotlinTypePreparator = e.f104497a;
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        Intrinsics.checkNotNullParameter(kotlinTypePreparator, "kotlinTypePreparator");
        this.f104514c = kotlinTypePreparator;
        bn2.o oVar = new bn2.o(bn2.o.f23591e);
        Intrinsics.checkNotNullExpressionValue(oVar, "createWithTypeRefiner(...)");
        this.f104515d = oVar;
    }

    public final boolean a(b0 a13, b0 b13) {
        Intrinsics.checkNotNullParameter(a13, "a");
        Intrinsics.checkNotNullParameter(b13, "b");
        a1 G = a0.G(false, false, null, this.f104514c, h.f104498a, 6);
        v1 a14 = a13.z0();
        v1 b14 = b13.z0();
        Intrinsics.checkNotNullParameter(G, "<this>");
        Intrinsics.checkNotNullParameter(a14, "a");
        Intrinsics.checkNotNullParameter(b14, "b");
        return pn2.g.g(G, a14, b14);
    }

    public final boolean b(b0 subtype, b0 supertype) {
        Intrinsics.checkNotNullParameter(subtype, "subtype");
        Intrinsics.checkNotNullParameter(supertype, "supertype");
        a1 G = a0.G(true, false, null, this.f104514c, h.f104498a, 6);
        v1 subType = subtype.z0();
        v1 superType = supertype.z0();
        Intrinsics.checkNotNullParameter(G, "<this>");
        Intrinsics.checkNotNullParameter(subType, "subType");
        Intrinsics.checkNotNullParameter(superType, "superType");
        return pn2.g.n(pn2.g.f100796a, G, subType, superType);
    }
}
