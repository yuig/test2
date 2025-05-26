package wr1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class y0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f131031i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ m0 f131032j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0(m0 m0Var, int i13) {
        super(1);
        this.f131031i = i13;
        this.f131032j = m0Var;
    }

    public final q b(q it) {
        int i13 = this.f131031i;
        m0 m0Var = this.f131032j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return q.e(it, se0.f.LOADED, null, new a(((y) m0Var).f131030a), null, null, 26);
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return q.e(it, se0.f.LOADED, null, new b(((c0) m0Var).f130948a), null, null, 26);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return q.e(it, se0.f.NONE, null, null, null, new h(((a0) m0Var).f130937a), 14);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f131031i) {
            case 0:
                return b((q) obj);
            case 1:
                return b((q) obj);
            case 2:
                return b((q) obj);
            default:
                a1 it = (a1) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return a1.b(it, ((e0) this.f131032j).f130962a, null, 13);
        }
    }
}
