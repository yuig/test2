package qn2;

import am2.c1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kh2.g2;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pn2.b0;
import pn2.g1;

/* loaded from: classes4.dex */
public final class l implements cn2.b {

    /* renamed from: a, reason: collision with root package name */
    public final g1 f104506a;

    /* renamed from: b, reason: collision with root package name */
    public Function0 f104507b;

    /* renamed from: c, reason: collision with root package name */
    public final l f104508c;

    /* renamed from: d, reason: collision with root package name */
    public final c1 f104509d;

    /* renamed from: e, reason: collision with root package name */
    public final xk2.k f104510e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(g1 projection, ArrayList supertypes) {
        this(projection, new s1.c(supertypes, 6), null, null, 8);
        Intrinsics.checkNotNullParameter(projection, "projection");
        Intrinsics.checkNotNullParameter(supertypes, "supertypes");
    }

    @Override // cn2.b
    public final g1 a() {
        return this.f104506a;
    }

    @Override // pn2.b1
    public final am2.j b() {
        return null;
    }

    @Override // pn2.b1
    public final Collection c() {
        Collection collection = (List) this.f104510e.getValue();
        if (collection == null) {
            collection = q0.f80391a;
        }
        return collection;
    }

    @Override // pn2.b1
    public final boolean d() {
        return false;
    }

    public final l e(i kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        g1 a13 = this.f104506a.a(kotlinTypeRefiner);
        Intrinsics.checkNotNullExpressionValue(a13, "refine(...)");
        xh2.a aVar = this.f104507b != null ? new xh2.a(6, this, kotlinTypeRefiner) : null;
        l lVar = this.f104508c;
        if (lVar == null) {
            lVar = this;
        }
        return new l(a13, aVar, lVar, this.f104509d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.d(l.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.g(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedTypeConstructor");
        l lVar = (l) obj;
        l lVar2 = this.f104508c;
        if (lVar2 == null) {
            lVar2 = this;
        }
        l lVar3 = lVar.f104508c;
        if (lVar3 != null) {
            lVar = lVar3;
        }
        return lVar2 == lVar;
    }

    @Override // pn2.b1
    public final xl2.l f() {
        b0 type = this.f104506a.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        return kotlin.jvm.internal.j.m(type);
    }

    @Override // pn2.b1
    public final List getParameters() {
        return q0.f80391a;
    }

    public final int hashCode() {
        l lVar = this.f104508c;
        return lVar != null ? lVar.hashCode() : super.hashCode();
    }

    public final String toString() {
        return "CapturedType(" + this.f104506a + ')';
    }

    public l(g1 projection, Function0 function0, l lVar, c1 c1Var) {
        Intrinsics.checkNotNullParameter(projection, "projection");
        this.f104506a = projection;
        this.f104507b = function0;
        this.f104508c = lVar;
        this.f104509d = c1Var;
        this.f104510e = xk2.m.a(xk2.n.PUBLICATION, new g2(this, 21));
    }

    public /* synthetic */ l(g1 g1Var, s1.c cVar, l lVar, c1 c1Var, int i13) {
        this(g1Var, (i13 & 2) != 0 ? null : cVar, (i13 & 4) != 0 ? null : lVar, (i13 & 8) != 0 ? null : c1Var);
    }
}
