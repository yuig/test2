package nn2;

import am2.w0;
import dm2.z;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class c extends dm2.k implements b {
    public final tm2.m F;
    public final vm2.f G;
    public final vm2.i H;
    public final vm2.j I;

    /* renamed from: J, reason: collision with root package name */
    public final l f91583J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(am2.g containingDeclaration, am2.l lVar, bm2.i annotations, boolean z13, am2.c kind, tm2.m proto, vm2.f nameResolver, vm2.i typeTable, vm2.j versionRequirementTable, l lVar2, w0 w0Var) {
        super(containingDeclaration, lVar, annotations, z13, kind, w0Var == null ? w0.f15602a : w0Var);
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        Intrinsics.checkNotNullParameter(versionRequirementTable, "versionRequirementTable");
        this.F = proto;
        this.G = nameResolver;
        this.H = typeTable;
        this.I = versionRequirementTable;
        this.f91583J = lVar2;
    }

    @Override // dm2.k
    /* renamed from: E0 */
    public final /* bridge */ /* synthetic */ dm2.k v0(am2.c cVar, am2.m mVar, am2.x xVar, w0 w0Var, bm2.i iVar, ym2.g gVar) {
        return K0(cVar, mVar, xVar, w0Var, iVar);
    }

    public final c K0(am2.c kind, am2.m newOwner, am2.x xVar, w0 source, bm2.i annotations) {
        Intrinsics.checkNotNullParameter(newOwner, "newOwner");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(source, "source");
        c cVar = new c((am2.g) newOwner, (am2.l) xVar, annotations, this.E, kind, this.F, this.G, this.H, this.I, this.f91583J, source);
        cVar.f55584w = this.f55584w;
        return cVar;
    }

    @Override // nn2.m
    public final zm2.c T() {
        return this.F;
    }

    @Override // dm2.z, am2.a0
    public final boolean isExternal() {
        return false;
    }

    @Override // dm2.z, am2.x
    public final boolean isInline() {
        return false;
    }

    @Override // dm2.z, am2.x
    public final boolean isSuspend() {
        return false;
    }

    @Override // dm2.z, am2.x
    public final boolean t() {
        return false;
    }

    @Override // nn2.m
    public final vm2.i v() {
        return this.H;
    }

    @Override // dm2.k, dm2.z
    public final /* bridge */ /* synthetic */ z v0(am2.c cVar, am2.m mVar, am2.x xVar, w0 w0Var, bm2.i iVar, ym2.g gVar) {
        return K0(cVar, mVar, xVar, w0Var, iVar);
    }

    @Override // nn2.m
    public final vm2.f y() {
        return this.G;
    }

    @Override // nn2.m
    public final l z() {
        return this.f91583J;
    }
}
