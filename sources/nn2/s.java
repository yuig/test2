package nn2;

import am2.c0;
import am2.r0;
import am2.v0;
import am2.w0;
import dm2.q0;
import kotlin.jvm.internal.Intrinsics;
import t3.s1;
import tm2.i0;

/* loaded from: classes2.dex */
public final class s extends q0 implements b {
    public final i0 B;
    public final vm2.f C;
    public final vm2.i D;
    public final vm2.j E;
    public final l F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(am2.m containingDeclaration, r0 r0Var, bm2.i annotations, c0 modality, am2.q visibility, boolean z13, ym2.g name, am2.c kind, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, i0 proto, vm2.f nameResolver, vm2.i typeTable, vm2.j versionRequirementTable, l lVar) {
        super(containingDeclaration, r0Var, annotations, modality, visibility, z13, name, kind, w0.f15602a, z14, z15, z18, false, z16, z17);
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(modality, "modality");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        Intrinsics.checkNotNullParameter(versionRequirementTable, "versionRequirementTable");
        this.B = proto;
        this.C = nameResolver;
        this.D = typeTable;
        this.E = versionRequirementTable;
        this.F = lVar;
    }

    @Override // nn2.m
    public final zm2.c T() {
        return this.B;
    }

    @Override // dm2.q0, am2.a0
    public final boolean isExternal() {
        return s1.k(vm2.e.E, this.B.f118326d, "get(...)");
    }

    @Override // nn2.m
    public final vm2.i v() {
        return this.D;
    }

    @Override // dm2.q0
    public final q0 w0(am2.m newOwner, c0 newModality, am2.q newVisibility, r0 r0Var, am2.c kind, ym2.g newName) {
        v0 source = w0.f15602a;
        Intrinsics.checkNotNullParameter(newOwner, "newOwner");
        Intrinsics.checkNotNullParameter(newModality, "newModality");
        Intrinsics.checkNotNullParameter(newVisibility, "newVisibility");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(newName, "newName");
        Intrinsics.checkNotNullParameter(source, "source");
        return new s(newOwner, r0Var, getAnnotations(), newModality, newVisibility, this.f55493f, newName, kind, this.f55501n, this.f55502o, isExternal(), this.f55506s, this.f55503p, this.B, this.C, this.D, this.E, this.F);
    }

    @Override // nn2.m
    public final vm2.f y() {
        return this.C;
    }

    @Override // nn2.m
    public final l z() {
        return this.F;
    }
}
