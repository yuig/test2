package wr1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o82.q1;

/* loaded from: classes4.dex */
public final class x0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f131027i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ z0 f131028j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ m0 f131029k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x0(z0 z0Var, m0 m0Var, int i13) {
        super(1);
        this.f131027i = i13;
        this.f131028j = z0Var;
        this.f131029k = m0Var;
    }

    public final q b(q it) {
        int i13 = this.f131027i;
        z0 z0Var = this.f131028j;
        m0 m0Var = this.f131029k;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return q.e(it, se0.f.NONE, null, null, null, new f(z0.g(z0Var, ((l0) m0Var).f130979a)), 14);
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                se0.f fVar = se0.f.NONE;
                q1 q1Var = ((o82.f0) ((h0) m0Var).f130972a).f93580b;
                Intrinsics.g(q1Var, "null cannot be cast to non-null type com.pinterest.statebasedrecycler.SectionEvent.Error");
                return q.e(it, fVar, null, null, null, new f(z0.g(z0Var, ((o82.c1) q1Var).f93548a)), 14);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return q.e(it, se0.f.NONE, null, null, null, new f(z0.g(z0Var, ((w) m0Var).f131024a)), 14);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f131027i) {
        }
        return b((q) obj);
    }
}
