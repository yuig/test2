package w1;

import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import com.pinterest.api.model.tq;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m1.r3;

/* loaded from: classes2.dex */
public final class d extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f127194i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f127195j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(long j13, int i13) {
        super(1);
        this.f127194i = i13;
        this.f127195j = j13;
    }

    public final bk1.a2 b(bk1.a2 it) {
        int i13 = this.f127194i;
        long j13 = this.f127195j;
        switch (i13) {
            case 7:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return bk1.a2.b(it, null, false, false, null, null, 0, false, null, null, Long.valueOf(j13), false, false, null, null, 0, false, false, false, null, null, null, false, false, false, false, false, false, null, null, null, false, false, null, false, false, null, null, false, false, false, false, -16385, 524287);
    }

    public final void e(d3.h Canvas) {
        switch (this.f127194i) {
            case 2:
                Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                d3.h.O(Canvas, this.f127195j, 0.0f, 0L, 0.0f, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL);
                break;
            case 3:
                Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                d3.h.O(Canvas, this.f127195j, 0.0f, 0L, 0.0f, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL);
                break;
            case 4:
                Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                d3.h.O(Canvas, this.f127195j, 0.0f, 0L, 0.0f, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL);
                break;
            default:
                Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                d3.h.O(Canvas, this.f127195j, 0.0f, 0L, 0.0f, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f127194i;
        long j13 = this.f127195j;
        switch (i13) {
            case 0:
                y2.d dVar = (y2.d) obj;
                float d2 = a3.f.d(dVar.f136664a.g()) / 2.0f;
                b3.f0 D = c0.d.D(dVar, d2);
                int i14 = Build.VERSION.SDK_INT;
                long j14 = this.f127195j;
                return dVar.a(new r3(d2, D, new b3.p(j14, 5, i14 >= 29 ? b3.q.f21347a.a(j14, 5) : new PorterDuffColorFilter(androidx.compose.ui.graphics.a.u(j14), androidx.compose.ui.graphics.a.w(5)))));
            case 1:
                ((z3.j) ((z3.y) obj)).e(b2.d0.f21132c, new b2.c0(v0.Cursor, j13, b2.b0.Middle, true));
                return Unit.f80348a;
            case 2:
                e((d3.h) obj);
                return Unit.f80348a;
            case 3:
                e((d3.h) obj);
                return Unit.f80348a;
            case 4:
                e((d3.h) obj);
                return Unit.f80348a;
            case 5:
                e((d3.h) obj);
                return Unit.f80348a;
            case 6:
                tq durationConfig = (tq) obj;
                Intrinsics.checkNotNullParameter(durationConfig, "durationConfig");
                return tq.b(durationConfig, 0L, this.f127195j, null, null, 13);
            case 7:
                return b((bk1.a2) obj);
            case 8:
                return b((bk1.a2) obj);
            case 9:
                rn1.a it = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(kw1.e.a(j13, kw1.b.DATE)), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            default:
                vf2.c captureData = (vf2.c) obj;
                Intrinsics.checkNotNullParameter(captureData, "$this$captureData");
                ((ei2.a) captureData).i(new xf2.m0(), j13);
                return Unit.f80348a;
        }
    }
}
