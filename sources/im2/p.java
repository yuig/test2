package im2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class p implements bn2.h {
    @Override // bn2.h
    public bn2.g a(am2.b superDescriptor, am2.b subDescriptor, am2.g gVar) {
        Intrinsics.checkNotNullParameter(superDescriptor, "superDescriptor");
        Intrinsics.checkNotNullParameter(subDescriptor, "subDescriptor");
        if (!(subDescriptor instanceof am2.r0) || !(superDescriptor instanceof am2.r0)) {
            return bn2.g.UNKNOWN;
        }
        am2.r0 r0Var = (am2.r0) subDescriptor;
        am2.r0 r0Var2 = (am2.r0) superDescriptor;
        return !Intrinsics.d(r0Var.getName(), r0Var2.getName()) ? bn2.g.UNKNOWN : (lb.l0.G0(r0Var) && lb.l0.G0(r0Var2)) ? bn2.g.OVERRIDABLE : (lb.l0.G0(r0Var) || lb.l0.G0(r0Var2)) ? bn2.g.INCOMPATIBLE : bn2.g.UNKNOWN;
    }

    @Override // bn2.h
    public bn2.f b() {
        return bn2.f.BOTH;
    }
}
