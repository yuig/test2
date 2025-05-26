package nn2;

import am2.w0;
import dm2.u0;
import dm2.z;
import kotlin.jvm.internal.Intrinsics;
import tm2.a0;

/* loaded from: classes2.dex */
public final class t extends u0 implements b {
    public final a0 E;
    public final vm2.f F;
    public final vm2.i G;
    public final vm2.j H;
    public final l I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(am2.m containingDeclaration, u0 u0Var, bm2.i annotations, ym2.g name, am2.c kind, a0 proto, vm2.f nameResolver, vm2.i typeTable, vm2.j versionRequirementTable, l lVar, w0 w0Var) {
        super(containingDeclaration, u0Var, annotations, name, kind, w0Var == null ? w0.f15602a : w0Var);
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        Intrinsics.checkNotNullParameter(versionRequirementTable, "versionRequirementTable");
        this.E = proto;
        this.F = nameResolver;
        this.G = typeTable;
        this.H = versionRequirementTable;
        this.I = lVar;
    }

    @Override // nn2.m
    public final zm2.c T() {
        return this.E;
    }

    @Override // nn2.m
    public final vm2.i v() {
        return this.G;
    }

    @Override // dm2.u0, dm2.z
    public final z v0(am2.c kind, am2.m newOwner, am2.x xVar, w0 source, bm2.i annotations, ym2.g gVar) {
        ym2.g gVar2;
        Intrinsics.checkNotNullParameter(newOwner, "newOwner");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(source, "source");
        u0 u0Var = (u0) xVar;
        if (gVar == null) {
            ym2.g name = getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            gVar2 = name;
        } else {
            gVar2 = gVar;
        }
        t tVar = new t(newOwner, u0Var, annotations, gVar2, kind, this.E, this.F, this.G, this.H, this.I, source);
        tVar.f55584w = this.f55584w;
        return tVar;
    }

    @Override // nn2.m
    public final vm2.f y() {
        return this.F;
    }

    @Override // nn2.m
    public final l z() {
        return this.I;
    }
}
