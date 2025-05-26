package f2;

import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class w extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f60932i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e0 f60933j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(e0 e0Var, int i13) {
        super(1);
        this.f60932i = i13;
        this.f60933j = e0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13;
        int i14 = this.f60932i;
        e0 e0Var = this.f60933j;
        switch (i14) {
            case 0:
                e0Var.f60843j.i((int) (((n4.j) obj).f89186a >> 32));
                return Unit.f80348a;
            case 1:
                float floatValue = ((Number) obj).floatValue();
                float floatValue2 = ((Number) e0Var.f60836c.c()).floatValue();
                ql2.h hVar = e0Var.f60836c;
                float f13 = ql2.s.f(floatValue, floatValue2, ((Number) hVar.d()).floatValue());
                boolean z13 = true;
                int i15 = e0Var.f60834a;
                if (i15 > 0 && (i13 = i15 + 1) >= 0) {
                    float f14 = f13;
                    float f15 = f14;
                    int i16 = 0;
                    while (true) {
                        float U = tb.f.U(((Number) hVar.c()).floatValue(), ((Number) hVar.d()).floatValue(), i16 / i13);
                        float f16 = U - f13;
                        if (Math.abs(f16) <= f14) {
                            f14 = Math.abs(f16);
                            f15 = U;
                        }
                        if (i16 != i13) {
                            i16++;
                        } else {
                            f13 = f15;
                        }
                    }
                }
                ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = e0Var.f60837d;
                if (f13 == parcelableSnapshotMutableFloatState.h()) {
                    z13 = false;
                } else {
                    if (f13 != parcelableSnapshotMutableFloatState.h()) {
                        Function1 function1 = e0Var.f60838e;
                        if (function1 != null) {
                            function1.invoke(Float.valueOf(f13));
                        } else {
                            e0Var.d(f13);
                        }
                    }
                    Function0 function0 = e0Var.f60835b;
                    if (function0 != null) {
                        function0.invoke();
                    }
                }
                return Boolean.valueOf(z13);
            default:
                long j13 = ((a3.c) obj).f482a;
                e0Var.b(0.0f);
                e0Var.f60845l.invoke();
                return Unit.f80348a;
        }
    }
}
