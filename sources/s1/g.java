package s1;

import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class g extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f110437i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ o0 f110438j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(o0 o0Var, int i13) {
        super(0);
        this.f110437i = i13;
        this.f110438j = o0Var;
    }

    public final Integer b() {
        int h10;
        int i13 = this.f110437i;
        o0 o0Var = this.f110438j;
        switch (i13) {
            case 0:
                return Integer.valueOf(o0Var.n());
            case 1:
                return Integer.valueOf(o0Var.n());
            case 2:
                return Integer.valueOf(o0Var.f110500j.c() ? o0Var.f110509s.h() : o0Var.l());
            default:
                if (o0Var.f110500j.c()) {
                    ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = o0Var.f110508r;
                    h10 = parcelableSnapshotMutableIntState.h() != -1 ? parcelableSnapshotMutableIntState.h() : Math.abs(o0Var.f110493c.f110450c.h()) >= Math.abs(Math.min(o0Var.f110506p.l0(s0.f110535a), ((float) o0Var.o()) / 2.0f) / ((float) o0Var.o())) ? o0Var.a() ? o0Var.f110494d + 1 : o0Var.f110494d : o0Var.l();
                } else {
                    h10 = o0Var.l();
                }
                return Integer.valueOf(o0Var.k(h10));
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f110437i) {
        }
        return b();
    }
}
