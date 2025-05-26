package rn2;

import am2.c0;
import am2.r;
import am2.s;
import am2.w;
import am2.w0;
import am2.x;
import dm2.u0;
import dm2.z;
import java.util.Collection;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d extends u0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a containingDeclaration) {
        super(containingDeclaration, null, bm2.h.f23540a, ym2.g.g(b.ERROR_FUNCTION.getDebugText()), am2.c.DECLARATION, w0.f15602a);
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        q0 q0Var = q0.f80391a;
        y0(null, null, q0Var, q0Var, q0Var, m.d(l.RETURN_TYPE_FOR_FUNCTION, new String[0]), c0.OPEN, s.f15577e);
    }

    @Override // dm2.z, am2.b
    public final Object K(km2.e key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return null;
    }

    @Override // dm2.u0, am2.d
    public final /* bridge */ /* synthetic */ am2.d W(am2.m mVar, c0 c0Var, r rVar, am2.c cVar) {
        u0(mVar, c0Var, rVar, cVar);
        return this;
    }

    @Override // dm2.z, am2.x
    public final boolean isSuspend() {
        return false;
    }

    @Override // dm2.z, am2.d
    public final void n0(Collection overriddenDescriptors) {
        Intrinsics.checkNotNullParameter(overriddenDescriptors, "overriddenDescriptors");
    }

    @Override // dm2.u0, dm2.z, am2.x
    public final w q0() {
        return new c(this);
    }

    @Override // dm2.z
    public final u0 u0(am2.m newOwner, c0 modality, r visibility, am2.c kind) {
        Intrinsics.checkNotNullParameter(newOwner, "newOwner");
        Intrinsics.checkNotNullParameter(modality, "modality");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Intrinsics.checkNotNullParameter(kind, "kind");
        return this;
    }

    @Override // dm2.u0, dm2.z
    public final z v0(am2.c kind, am2.m newOwner, x xVar, w0 source, bm2.i annotations, ym2.g gVar) {
        Intrinsics.checkNotNullParameter(newOwner, "newOwner");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(source, "source");
        return this;
    }
}
