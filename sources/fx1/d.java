package fx1;

import com.pinterest.api.model.u7;
import com.pinterest.api.model.v7;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.framework.multisection.datasource.pagedlist.p;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import pc.p0;
import pc.q0;
import rm1.k;
import rm1.l;
import rm1.q;
import x40.ub;

/* loaded from: classes4.dex */
public final class d extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f63092i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f63093j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(boolean z13, int i13) {
        super(1);
        this.f63092i = i13;
        this.f63093j = z13;
    }

    public final v7 b(v7 board) {
        int i13 = this.f63092i;
        boolean z13 = this.f63093j;
        switch (i13) {
            case 11:
                Intrinsics.checkNotNullParameter(board, "board");
                u7 G1 = board.G1();
                G1.b(Boolean.valueOf(z13));
                v7 a13 = G1.a();
                Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
                return a13;
            default:
                Intrinsics.checkNotNullParameter(board, "board");
                u7 G12 = board.G1();
                G12.b(Boolean.valueOf(!z13));
                v7 a14 = G12.a();
                Intrinsics.checkNotNullExpressionValue(a14, "build(...)");
                return a14;
        }
    }

    public final om1.c e(om1.c it) {
        int i13 = this.f63092i;
        boolean z13 = this.f63093j;
        switch (i13) {
            case 15:
                Intrinsics.checkNotNullParameter(it, "it");
                return om1.c.e(it, null, null, null, z13 ? fm1.c.VISIBLE : fm1.c.GONE, null, false, 0, 1015);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return om1.c.e(it, z13 ? q.CAPTIONS : q.CAPTIONS_OUTLINE, null, null, null, null, false, 0, 1022);
        }
    }

    public final rm1.d f(rm1.d it) {
        int i13 = this.f63092i;
        boolean z13 = this.f63093j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 6:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return rm1.d.e(it, null, null, d7.b.Z(z13), 0, null, 27);
    }

    public final rn1.a h(rn1.a it) {
        int i13 = this.f63092i;
        boolean z13 = this.f63093j;
        switch (i13) {
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 5:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 16:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 20:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return rn1.a.y(it, null, null, null, null, null, 0, d7.b.Z(z13), null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097087);
    }

    public final yl1.b i(yl1.b it) {
        int i13 = this.f63092i;
        boolean z13 = this.f63093j;
        switch (i13) {
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, null, false, d7.b.Z(z13), null, null, null, null, null, 0, null, 1019);
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, null, false, d7.b.Z(z13), null, null, null, null, null, 0, null, 1019);
            case 3:
            case 5:
            case 6:
            case 10:
            case 11:
            case 12:
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, null, false, d7.b.Z(z13), null, null, null, null, null, 0, null, 1019);
            case 4:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, null, false, d7.b.Z(z13), null, null, null, null, null, 0, null, 1019);
            case 7:
                Intrinsics.checkNotNullParameter(it, "nexState");
                return yl1.b.f(it, null, this.f63093j, null, null, null, null, null, null, 0, null, 1021);
            case 8:
                Intrinsics.checkNotNullParameter(it, "nexState");
                return yl1.b.f(it, null, this.f63093j, null, null, null, null, null, null, 0, null, 1021);
            case 9:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, null, this.f63093j, null, null, null, null, null, null, 0, null, 1021);
            case 13:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, null, this.f63093j, null, null, null, null, null, null, 0, null, 1021);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f63092i;
        boolean z13 = this.f63093j;
        switch (i13) {
            case 0:
                return f((rm1.d) obj);
            case 1:
                return i((yl1.b) obj);
            case 2:
                return i((yl1.b) obj);
            case 3:
                return h((rn1.a) obj);
            case 4:
                return i((yl1.b) obj);
            case 5:
                return h((rn1.a) obj);
            case 6:
                return f((rm1.d) obj);
            case 7:
                return i((yl1.b) obj);
            case 8:
                return i((yl1.b) obj);
            case 9:
                return i((yl1.b) obj);
            case 10:
                return f((rm1.d) obj);
            case 11:
                return b((v7) obj);
            case 12:
                return b((v7) obj);
            case 13:
                return i((yl1.b) obj);
            case 14:
                in1.b it = (in1.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return in1.b.e(it, null, z13, null, 13);
            case 15:
                return e((om1.c) obj);
            case 16:
                return h((rn1.a) obj);
            case 17:
                on1.b it2 = (on1.b) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return on1.b.e(it2, this.f63093j, false, null, 0, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL);
            case 18:
                return i((yl1.b) obj);
            case 19:
                rl1.q it3 = (rl1.q) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                return rl1.q.e(it3, null, null, false, null, null, false, false, d7.b.Z(z13), 0, null, null, 1919);
            case 20:
                return h((rn1.a) obj);
            case 21:
                return h((rn1.a) obj);
            case 22:
                p requestState = (p) obj;
                Intrinsics.checkNotNullParameter(requestState, "requestState");
                q0 q0Var = new q0(Integer.valueOf(requestState.f49152a));
                String str = requestState.f49153b;
                return new ub(q0Var, str == null ? p0.f99597a : new q0(str), new q0(Boolean.valueOf(z13)), 4);
            case 23:
                l standard = (l) obj;
                Intrinsics.checkNotNullParameter(standard, "$this$standard");
                standard.a(z13 ? q.MUTE : q.SOUND);
                return Unit.f80348a;
            case 24:
                k bind = (k) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.b(new d(z13, 23));
                return Unit.f80348a;
            default:
                return e((om1.c) obj);
        }
    }
}
