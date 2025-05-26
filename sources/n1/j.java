package n1;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.s;
import m1.m1;
import q1.x;
import u80.r;
import u80.t;

/* loaded from: classes2.dex */
public final class j extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f88903i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f88904j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f88905k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f88906l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Function1 f88907m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(float f13, g0 g0Var, m1 m1Var, d dVar, int i13) {
        super(1);
        this.f88903i = i13;
        this.f88904j = f13;
        this.f88905k = g0Var;
        this.f88906l = m1Var;
        this.f88907m = dVar;
    }

    public final void b(j1.m mVar) {
        int i13 = this.f88903i;
        Function1 function1 = this.f88907m;
        Object obj = this.f88906l;
        Object obj2 = this.f88905k;
        float f13 = this.f88904j;
        switch (i13) {
            case 0:
                float abs = Math.abs(((Number) mVar.f74148e.getValue()).floatValue());
                float abs2 = Math.abs(f13);
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = mVar.f74148e;
                if (abs < abs2) {
                    g0 g0Var = (g0) obj2;
                    float floatValue = ((Number) parcelableSnapshotMutableState.getValue()).floatValue() - g0Var.f80425a;
                    float a13 = ((m1) obj).a(floatValue);
                    function1.invoke(Float.valueOf(a13));
                    if (Math.abs(floatValue - a13) > 0.5f) {
                        mVar.a();
                    }
                    g0Var.f80425a = ((Number) parcelableSnapshotMutableState.getValue()).floatValue();
                    break;
                } else {
                    float c13 = l.c(((Number) parcelableSnapshotMutableState.getValue()).floatValue(), f13);
                    g0 g0Var2 = (g0) obj2;
                    float f14 = c13 - g0Var2.f80425a;
                    float a14 = ((m1) obj).a(f14);
                    function1.invoke(Float.valueOf(a14));
                    if (Math.abs(f14 - a14) > 0.5f) {
                        mVar.a();
                    }
                    mVar.a();
                    g0Var2.f80425a = c13;
                    break;
                }
            default:
                float c14 = l.c(((Number) mVar.f74148e.getValue()).floatValue(), f13);
                g0 g0Var3 = (g0) obj2;
                float f15 = c14 - g0Var3.f80425a;
                float a15 = ((m1) obj).a(f15);
                function1.invoke(Float.valueOf(a15));
                if (Math.abs(f15 - a15) > 0.5f || c14 != ((Number) mVar.f74148e.getValue()).floatValue()) {
                    mVar.a();
                }
                g0Var3.f80425a += a15;
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f88903i) {
            case 0:
                b((j1.m) obj);
                break;
            case 1:
                b((j1.m) obj);
                break;
            default:
                x LazyRow = (x) obj;
                Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
                List list = ((t80.d) this.f88905k).f116683a;
                u80.k kVar = (u80.k) this.f88906l;
                r rVar = r.f120975i;
                int size = list.size();
                u80.s sVar = new u80.s(0, list, rVar);
                t tVar = new t(list, this.f88907m, kVar, this.f88904j);
                Object obj2 = q2.i.f102113a;
                ((q1.i) LazyRow).s(size, null, sVar, new q2.h(tVar, true, -632812321));
                break;
        }
        return Unit.f80348a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(t80.d dVar, Function1 function1, u80.k kVar, float f13) {
        super(1);
        this.f88903i = 2;
        this.f88905k = dVar;
        this.f88907m = function1;
        this.f88906l = kVar;
        this.f88904j = f13;
    }
}
