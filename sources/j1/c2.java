package j1;

import androidx.compose.runtime.ParcelableSnapshotMutableLongState;
import i2.f3;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class c2 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ g2 f74023i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f74024j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(g2 g2Var, float f13) {
        super(1);
        this.f74023i = g2Var;
        this.f74024j = f13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long longValue = ((Number) obj).longValue();
        g2 g2Var = this.f74023i;
        if (!g2Var.g()) {
            ParcelableSnapshotMutableLongState parcelableSnapshotMutableLongState = g2Var.f74081g;
            if (((f3) s2.p.t(parcelableSnapshotMutableLongState.f71120b, parcelableSnapshotMutableLongState)).f71117c == Long.MIN_VALUE) {
                parcelableSnapshotMutableLongState.h(longValue);
                g2Var.f74075a.f74167a.setValue(Boolean.TRUE);
            }
            long j13 = longValue - ((f3) s2.p.t(parcelableSnapshotMutableLongState.f71120b, parcelableSnapshotMutableLongState)).f71117c;
            float f13 = this.f74024j;
            if (f13 != 0.0f) {
                j13 = ml2.c.d(j13 / f13);
            }
            if (g2Var.f74076b == null) {
                g2Var.f74080f.h(j13);
            }
            g2Var.h(j13, f13 == 0.0f);
        }
        return Unit.f80348a;
    }
}
