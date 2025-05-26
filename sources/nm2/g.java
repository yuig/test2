package nm2;

import an2.b0;
import an2.u;
import an2.y;
import in2.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j;
import kotlin.text.StringsKt;
import pn2.g0;
import pn2.g1;
import pn2.h0;
import pn2.u0;
import pn2.v;
import pn2.v1;
import qn2.h;
import qn2.i;

/* loaded from: classes4.dex */
public final class g extends v implements g0 {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(h0 lowerBound, h0 upperBound) {
        this(lowerBound, upperBound, false);
        Intrinsics.checkNotNullParameter(lowerBound, "lowerBound");
        Intrinsics.checkNotNullParameter(upperBound, "upperBound");
    }

    public static final ArrayList G0(y yVar, h0 h0Var) {
        List<g1> u03 = h0Var.u0();
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(u03, 10));
        for (g1 typeProjection : u03) {
            yVar.getClass();
            Intrinsics.checkNotNullParameter(typeProjection, "typeProjection");
            StringBuilder sb3 = new StringBuilder();
            CollectionsKt___CollectionsKt.H(e0.b(typeProjection), sb3, ", ", (r16 & 4) != 0 ? "" : null, (r16 & 8) != 0 ? "" : null, -1, "...", (r16 & 64) != 0 ? null : new u(yVar, 0));
            String sb4 = sb3.toString();
            Intrinsics.checkNotNullExpressionValue(sb4, "toString(...)");
            arrayList.add(sb4);
        }
        return arrayList;
    }

    public static final String H0(String str, String str2) {
        if (!StringsKt.F(str, '<')) {
            return str;
        }
        return StringsKt.d0('<', str, str) + '<' + str2 + '>' + StringsKt.b0('>', str, str);
    }

    @Override // pn2.v1
    public final v1 A0(boolean z13) {
        return new g(this.f100850b.A0(z13), this.f100851c.A0(z13));
    }

    @Override // pn2.v1
    public final v1 C0(u0 newAttributes) {
        Intrinsics.checkNotNullParameter(newAttributes, "newAttributes");
        return new g(this.f100850b.C0(newAttributes), this.f100851c.C0(newAttributes));
    }

    @Override // pn2.v
    public final h0 D0() {
        return this.f100850b;
    }

    @Override // pn2.v
    public final String E0(y renderer, b0 options) {
        Intrinsics.checkNotNullParameter(renderer, "renderer");
        Intrinsics.checkNotNullParameter(options, "options");
        h0 h0Var = this.f100850b;
        String d03 = renderer.d0(h0Var);
        h0 h0Var2 = this.f100851c;
        String d04 = renderer.d0(h0Var2);
        if (options.h()) {
            return "raw (" + d03 + ".." + d04 + ')';
        }
        if (h0Var2.u0().isEmpty()) {
            return renderer.I(d03, d04, j.m(this));
        }
        ArrayList G0 = G0(renderer, h0Var);
        ArrayList G02 = G0(renderer, h0Var2);
        String Z = CollectionsKt.Z(G0, ", ", null, null, 0, null, f.f91532i, 30);
        ArrayList N0 = CollectionsKt.N0(G0, G02);
        if (!N0.isEmpty()) {
            Iterator it = N0.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                String str = (String) pair.f80346a;
                String str2 = (String) pair.f80347b;
                if (!Intrinsics.d(str, StringsKt.R("out ", str2)) && !Intrinsics.d(str2, "*")) {
                    break;
                }
            }
        }
        d04 = H0(d04, Z);
        String H0 = H0(d03, Z);
        return Intrinsics.d(H0, d04) ? H0 : renderer.I(H0, d04, j.m(this));
    }

    @Override // pn2.b0
    /* renamed from: F0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final v y0(i kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        ((h) kotlinTypeRefiner).getClass();
        h0 type = this.f100850b;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.g(type, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        h0 type2 = this.f100851c;
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.g(type2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new g(type, type2, true);
    }

    @Override // pn2.v, pn2.b0
    public final n w() {
        am2.j b13 = w0().b();
        am2.g gVar = b13 instanceof am2.g ? (am2.g) b13 : null;
        if (gVar != null) {
            n G = gVar.G(new e());
            Intrinsics.checkNotNullExpressionValue(G, "getMemberScope(...)");
            return G;
        }
        throw new IllegalStateException(("Incorrect classifier: " + w0().b()).toString());
    }

    public g(h0 h0Var, h0 h0Var2, boolean z13) {
        super(h0Var, h0Var2);
        if (z13) {
            return;
        }
        qn2.d.f104496a.b(h0Var, h0Var2);
    }
}
