package oq;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class x extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f97151i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c0 f97152j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(c0 c0Var, int i13) {
        super(1);
        this.f97151i = i13;
        this.f97152j = c0Var;
    }

    public final pq.b b(pq.b it) {
        int i13 = this.f97151i;
        c0 c0Var = this.f97152j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return pq.b.e(it, c0Var.getPin(), null, qq.a.CUTOUT_SCISSORS, false, false, false, false, false, null, false, false, 2042);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return pq.b.e(it, c0Var.getPin(), null, null, true, false, false, false, false, null, false, false, 2038);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f97151i) {
            case 0:
                return b((pq.b) obj);
            case 1:
                return b((pq.b) obj);
            default:
                this.f97152j.b();
                return Unit.f80348a;
        }
    }
}
