package yq0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.n4;
import lh0.z3;

/* loaded from: classes.dex */
public final class i0 extends a {

    /* renamed from: a, reason: collision with root package name */
    public final n4 f139709a;

    public i0(n4 experiments) {
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        this.f139709a = experiments;
    }

    @Override // yq0.a
    public final Function0 getCreator() {
        n4 n4Var = this.f139709a;
        n4Var.getClass();
        z3 z3Var = a4.f83298b;
        g1 g1Var = (g1) n4Var.f83445a;
        return (g1Var.o("android_sba_structured_feed", "enabled", z3Var) || g1Var.l("android_sba_structured_feed")) ? new h0(this, 0) : new h0(this, 1);
    }
}
