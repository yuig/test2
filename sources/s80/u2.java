package s80;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class u2 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ n4.b f111810r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ w80.h1 f111811s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ i2.q1 f111812t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(n4.b bVar, w80.h1 h1Var, i2.q1 q1Var, bl2.c cVar) {
        super(2, cVar);
        this.f111810r = bVar;
        this.f111811s = h1Var;
        this.f111812t = q1Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new u2(this.f111810r, this.f111811s, this.f111812t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((u2) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        float l03 = this.f111810r.l0(24);
        i2.q1 q1Var = this.f111812t;
        long j13 = 0;
        if (n4.h.a(((n4.h) q1Var.getValue()).f89180a, 0L)) {
            w80.h1 h1Var = this.f111811s;
            float f13 = ((a3.d) h1Var.f128301b.getValue()).f485b + l03;
            ParcelableSnapshotMutableState parcelableSnapshotMutableState = h1Var.f128300a;
            if (f13 < ((a3.d) parcelableSnapshotMutableState.getValue()).f487d) {
                int i13 = (int) (((a3.d) parcelableSnapshotMutableState.getValue()).f487d - ((a3.d) h1Var.f128301b.getValue()).f487d);
                if (i13 > 0) {
                    i13 = 0;
                }
                j13 = d7.b.a(0, i13);
            }
        } else {
            j13 = ((n4.h) q1Var.getValue()).f89180a;
        }
        q1Var.setValue(new n4.h(j13));
        return Unit.f80348a;
    }
}
