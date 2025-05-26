package nn2;

import am2.v0;
import am2.w0;
import ao2.m0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import pn2.b0;
import pn2.b1;
import pn2.h0;
import pn2.q1;
import pn2.t1;
import pn2.w1;
import tm2.u0;

/* loaded from: classes4.dex */
public final class u extends dm2.g implements m {

    /* renamed from: i, reason: collision with root package name */
    public final u0 f91637i;

    /* renamed from: j, reason: collision with root package name */
    public final vm2.f f91638j;

    /* renamed from: k, reason: collision with root package name */
    public final vm2.i f91639k;

    /* renamed from: l, reason: collision with root package name */
    public final vm2.j f91640l;

    /* renamed from: m, reason: collision with root package name */
    public final l f91641m;

    /* renamed from: n, reason: collision with root package name */
    public h0 f91642n;

    /* renamed from: o, reason: collision with root package name */
    public h0 f91643o;

    /* renamed from: p, reason: collision with root package name */
    public List f91644p;

    /* renamed from: q, reason: collision with root package name */
    public h0 f91645q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(on2.u storageManager, am2.m containingDeclaration, bm2.i annotations, ym2.g name, am2.q visibility, u0 proto, vm2.f nameResolver, vm2.i typeTable, vm2.j versionRequirementTable, l lVar) {
        super(storageManager, containingDeclaration, annotations, name, visibility);
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        Intrinsics.checkNotNullParameter(versionRequirementTable, "versionRequirementTable");
        v0 NO_SOURCE = w0.f15602a;
        Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
        this.f91637i = proto;
        this.f91638j = nameResolver;
        this.f91639k = typeTable;
        this.f91640l = versionRequirementTable;
        this.f91641m = lVar;
    }

    @Override // am2.y0
    public final am2.n d(q1 substitutor) {
        Intrinsics.checkNotNullParameter(substitutor, "substitutor");
        if (substitutor.f100834a.f()) {
            return this;
        }
        am2.m g13 = g();
        Intrinsics.checkNotNullExpressionValue(g13, "getContainingDeclaration(...)");
        bm2.i annotations = getAnnotations();
        Intrinsics.checkNotNullExpressionValue(annotations, "<get-annotations>(...)");
        ym2.g name = getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        u uVar = new u(this.f55418e, g13, annotations, name, this.f55419f, this.f91637i, this.f91638j, this.f91639k, this.f91640l, this.f91641m);
        List k13 = k();
        h0 v03 = v0();
        w1 w1Var = w1.INVARIANT;
        b0 j13 = substitutor.j(v03, w1Var);
        Intrinsics.checkNotNullExpressionValue(j13, "safeSubstitute(...)");
        h0 x13 = l0.x(j13);
        b0 j14 = substitutor.j(u0(), w1Var);
        Intrinsics.checkNotNullExpressionValue(j14, "safeSubstitute(...)");
        uVar.w0(k13, x13, l0.x(j14));
        return uVar;
    }

    @Override // am2.j
    public final h0 j() {
        h0 h0Var = this.f91645q;
        if (h0Var != null) {
            return h0Var;
        }
        Intrinsics.r("defaultTypeImpl");
        throw null;
    }

    public final am2.g r0() {
        if (m0.U(u0())) {
            return null;
        }
        am2.j b13 = u0().w0().b();
        if (b13 instanceof am2.g) {
            return (am2.g) b13;
        }
        return null;
    }

    public final h0 u0() {
        h0 h0Var = this.f91643o;
        if (h0Var != null) {
            return h0Var;
        }
        Intrinsics.r("expandedType");
        throw null;
    }

    @Override // nn2.m
    public final vm2.i v() {
        throw null;
    }

    public final h0 v0() {
        h0 h0Var = this.f91642n;
        if (h0Var != null) {
            return h0Var;
        }
        Intrinsics.r("underlyingType");
        throw null;
    }

    public final void w0(List declaredTypeParameters, h0 underlyingType, h0 expandedType) {
        in2.n nVar;
        h0 s13;
        Intrinsics.checkNotNullParameter(declaredTypeParameters, "declaredTypeParameters");
        Intrinsics.checkNotNullParameter(underlyingType, "underlyingType");
        Intrinsics.checkNotNullParameter(expandedType, "expandedType");
        Intrinsics.checkNotNullParameter(declaredTypeParameters, "declaredTypeParameters");
        this.f55420g = declaredTypeParameters;
        this.f91642n = underlyingType;
        this.f91643o = expandedType;
        this.f91644p = l0.M(this);
        am2.g r03 = r0();
        if (r03 == null || (nVar = r03.L()) == null) {
            nVar = in2.m.f72874b;
        }
        in2.n nVar2 = nVar;
        dm2.e eVar = new dm2.e(this, 0);
        rn2.j jVar = t1.f100842a;
        if (rn2.m.g(this)) {
            s13 = rn2.m.d(rn2.l.UNABLE_TO_SUBSTITUTE_TYPE, toString());
        } else {
            b1 e13 = e();
            if (e13 == null) {
                t1.a(12);
                throw null;
            }
            List e14 = t1.e(((dm2.f) e13).getParameters());
            pn2.u0.f100848b.getClass();
            s13 = pn2.g.s(pn2.u0.f100849c, e13, e14, false, nVar2, eVar);
        }
        Intrinsics.checkNotNullExpressionValue(s13, "makeUnsubstitutedType(...)");
        this.f91645q = s13;
    }

    @Override // nn2.m
    public final vm2.f y() {
        throw null;
    }

    @Override // nn2.m
    public final l z() {
        return this.f91641m;
    }
}
