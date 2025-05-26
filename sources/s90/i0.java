package s90;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import la0.m1;
import v90.k1;

/* loaded from: classes5.dex */
public final class i0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f111976i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l82.c0 f111977j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(l82.c0 c0Var, int i13) {
        super(1);
        this.f111976i = i13;
        this.f111977j = c0Var;
    }

    public final cj0.g b(cj0.g it) {
        int i13 = this.f111976i;
        l82.c0 c0Var = this.f111977j;
        switch (i13) {
            case 24:
                Intrinsics.checkNotNullParameter(it, "it");
                return cj0.g.e(it, 0, null, null, null, (zy.a0) c0Var.f82212a, null, false, RecyclerViewTypes.VIEW_TYPE_TV_SCHEDULE_EPISODE);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return cj0.g.e(it, 0, null, null, (o82.a0) c0Var.f82212a, null, null, false, RecyclerViewTypes.VIEW_TYPE_CAROUSEL_VIDEO_CELL);
        }
    }

    public final cj0.d0 e(cj0.d0 it) {
        int i13 = this.f111976i;
        l82.c0 c0Var = this.f111977j;
        switch (i13) {
            case 25:
                Intrinsics.checkNotNullParameter(it, "it");
                return cj0.d0.b(it, null, null, null, null, (zy.l0) c0Var.f82213b, false, 383);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return cj0.d0.b(it, null, null, null, (o82.j0) c0Var.f82213b, null, false, 447);
        }
    }

    public final ea0.l f(ea0.l it) {
        int i13 = this.f111976i;
        l82.c0 c0Var = this.f111977j;
        switch (i13) {
            case 11:
                Intrinsics.checkNotNullParameter(it, "it");
                return ea0.l.e(it, false, (o82.a0) c0Var.f82212a, null, 23);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return ea0.l.e(it, false, null, (zy.a0) c0Var.f82212a, 15);
        }
    }

    public final ea0.j0 h(ea0.j0 it) {
        int i13 = this.f111976i;
        l82.c0 c0Var = this.f111977j;
        switch (i13) {
            case 12:
                Intrinsics.checkNotNullParameter(it, "it");
                return ea0.j0.b(it, (o82.j0) c0Var.f82213b, null, 5);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return ea0.j0.b(it, null, (zy.l0) c0Var.f82213b, 3);
        }
    }

    public final fa0.l i(fa0.l it) {
        int i13 = this.f111976i;
        l82.c0 c0Var = this.f111977j;
        switch (i13) {
            case 15:
                Intrinsics.checkNotNullParameter(it, "it");
                return fa0.l.e(it, false, null, null, (o82.a0) c0Var.f82212a, null, 47);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return fa0.l.e(it, false, null, null, null, (zy.a0) c0Var.f82212a, 31);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f111976i;
        l82.c0 c0Var = this.f111977j;
        switch (i13) {
            case 0:
                return r((o0) obj);
            case 1:
                a it = (a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return a.e(it, null, null, false, (zy.a0) c0Var.f82212a, 15);
            case 2:
                return r((o0) obj);
            case 3:
                v90.a it2 = (v90.a) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return v90.a.e(it2, null, false, null, (zy.a0) c0Var.f82212a, null, null, null, null, null, false, 2039);
            case 4:
                k1 it3 = (k1) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                return k1.b(it3, (zy.l0) c0Var.f82213b, null, false, RecyclerViewTypes.VIEW_TYPE_TV_SCHEDULE_EPISODE);
            case 5:
                return s((w90.b) obj);
            case 6:
                return t((w90.g0) obj);
            case 7:
                return s((w90.b) obj);
            case 8:
                return t((w90.g0) obj);
            case 9:
                ca0.d it4 = (ca0.d) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                return ca0.d.e(it4, null, null, null, null, null, false, null, false, (zy.a0) c0Var.f82212a, 2047);
            case 10:
                ca0.a1 it5 = (ca0.a1) obj;
                Intrinsics.checkNotNullParameter(it5, "it");
                return ca0.a1.b(it5, null, null, null, null, null, false, null, (zy.l0) c0Var.f82213b, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK);
            case 11:
                return f((ea0.l) obj);
            case 12:
                return h((ea0.j0) obj);
            case 13:
                return f((ea0.l) obj);
            case 14:
                return h((ea0.j0) obj);
            case 15:
                return i((fa0.l) obj);
            case 16:
                return j((fa0.j0) obj);
            case 17:
                return i((fa0.l) obj);
            case 18:
                return j((fa0.j0) obj);
            case 19:
                return n((m1) obj);
            case 20:
                return l((la0.g) obj);
            case 21:
                return n((m1) obj);
            case 22:
                return l((la0.g) obj);
            case 23:
                return n((m1) obj);
            case 24:
                return b((cj0.g) obj);
            case 25:
                return e((cj0.d0) obj);
            case 26:
                return b((cj0.g) obj);
            case 27:
                return e((cj0.d0) obj);
            case 28:
                il0.a it6 = (il0.a) obj;
                Intrinsics.checkNotNullParameter(it6, "it");
                return il0.a.e(it6, (sk0.d) c0Var.f82212a, null, 11);
            default:
                il0.t it7 = (il0.t) obj;
                Intrinsics.checkNotNullParameter(it7, "it");
                return il0.t.b(it7, (sk0.y) c0Var.f82213b, null, 2);
        }
    }

    public final fa0.j0 j(fa0.j0 it) {
        int i13 = this.f111976i;
        l82.c0 c0Var = this.f111977j;
        switch (i13) {
            case 16:
                Intrinsics.checkNotNullParameter(it, "it");
                return fa0.j0.b(it, null, (o82.j0) c0Var.f82213b, null, 23);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return fa0.j0.b(it, null, null, (zy.l0) c0Var.f82213b, 15);
        }
    }

    public final la0.g l(la0.g it) {
        int i13 = this.f111976i;
        l82.c0 c0Var = this.f111977j;
        switch (i13) {
            case 20:
                Intrinsics.checkNotNullParameter(it, "it");
                return la0.g.e(it, (o82.a0) c0Var.f82212a, null, null, null, null, false, 510);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return la0.g.e(it, null, null, null, null, (zy.a0) c0Var.f82212a, false, 479);
        }
    }

    public final m1 n(m1 it) {
        int i13 = this.f111976i;
        l82.c0 c0Var = this.f111977j;
        switch (i13) {
            case 19:
                Intrinsics.checkNotNullParameter(it, "it");
                return m1.b(it, null, null, null, (x31.p) c0Var.f82213b, null, 959);
            case 20:
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return m1.b(it, null, null, (zy.l0) c0Var.f82213b, null, null, 991);
            case 21:
                Intrinsics.checkNotNullParameter(it, "it");
                return m1.b(it, null, (o82.j0) c0Var.f82213b, null, null, null, 1015);
        }
    }

    public final o0 r(o0 it) {
        int i13 = this.f111976i;
        l82.c0 c0Var = this.f111977j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return o0.b(it, (sa0.s) c0Var.f82213b, null, 14);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return o0.b(it, null, (zy.l0) c0Var.f82213b, 11);
        }
    }

    public final w90.b s(w90.b it) {
        int i13 = this.f111976i;
        l82.c0 c0Var = this.f111977j;
        switch (i13) {
            case 5:
                Intrinsics.checkNotNullParameter(it, "it");
                return w90.b.e(it, false, (o82.a0) c0Var.f82212a, null, 5);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return w90.b.e(it, false, null, (zy.a0) c0Var.f82212a, 3);
        }
    }

    public final w90.g0 t(w90.g0 it) {
        int i13 = this.f111976i;
        l82.c0 c0Var = this.f111977j;
        switch (i13) {
            case 6:
                Intrinsics.checkNotNullParameter(it, "it");
                return w90.g0.b(it, (o82.j0) c0Var.f82213b, null, 495);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return w90.g0.b(it, null, (zy.l0) c0Var.f82213b, 479);
        }
    }
}
