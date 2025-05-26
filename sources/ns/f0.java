package ns;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kh2.c3;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m90.a1;
import p90.u0;
import s80.n6;

/* loaded from: classes3.dex */
public final class f0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f91911i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l82.c0 f91912j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(l82.c0 c0Var, int i13) {
        super(1);
        this.f91911i = i13;
        this.f91912j = c0Var;
    }

    public final h90.d b(h90.d it) {
        int i13 = this.f91911i;
        l82.c0 c0Var = this.f91912j;
        switch (i13) {
            case 17:
                Intrinsics.checkNotNullParameter(it, "it");
                return h90.d.e(it, (o82.a0) c0Var.f82212a, null, 2);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return h90.d.e(it, null, (zy.a0) c0Var.f82212a, 1);
        }
    }

    public final m90.b e(m90.b it) {
        int i13 = this.f91911i;
        l82.c0 c0Var = this.f91912j;
        switch (i13) {
            case 19:
                Intrinsics.checkNotNullParameter(it, "it");
                return m90.b.e(it, (o82.a0) c0Var.f82212a, false, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_CAROUSEL);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return m90.b.e(it, null, false, (zy.a0) c0Var.f82212a, 63);
        }
    }

    public final a1 f(a1 it) {
        int i13 = this.f91911i;
        l82.c0 c0Var = this.f91912j;
        switch (i13) {
            case 20:
                Intrinsics.checkNotNullParameter(it, "it");
                return a1.b(it, (o82.j0) c0Var.f82213b, null, 55);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return a1.b(it, null, (zy.l0) c0Var.f82213b, 47);
        }
    }

    public final n70.o0 h(n70.o0 it) {
        int i13 = this.f91911i;
        l82.c0 c0Var = this.f91912j;
        switch (i13) {
            case 8:
                Intrinsics.checkNotNullParameter(it, "it");
                return n70.o0.b(it, null, 0, (o82.j0) c0Var.f82213b, null, 6143);
            default:
                Intrinsics.checkNotNullParameter(it, "vmState");
                return n70.o0.b(it, null, 0, null, (zy.l0) c0Var.f82213b, 4095);
        }
    }

    public final c i(c it) {
        int i13 = this.f91911i;
        l82.c0 c0Var = this.f91912j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return c.e(it, false, false, false, false, (o82.a0) c0Var.f82212a, null, 47);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return c.e(it, false, false, false, false, null, (zy.a0) c0Var.f82212a, 31);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f91911i;
        l82.c0 c0Var = this.f91912j;
        switch (i13) {
            case 0:
                return i((c) obj);
            case 1:
                return j((l0) obj);
            case 2:
                return i((c) obj);
            case 3:
                return j((l0) obj);
            case 4:
                sv.i it = (sv.i) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return sv.i.e(it, 0, null, (zy.a0) c0Var.f82212a, false, null, false, RecyclerViewTypes.VIEW_TYPE_CAROUSEL_VIDEO_CELL);
            case 5:
                sv.c0 it2 = (sv.c0) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return sv.c0.b(it2, (zy.l0) c0Var.f82213b, 0, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_CAROUSEL);
            case 6:
                com.pinterest.boardAutoCollages.e it3 = (com.pinterest.boardAutoCollages.e) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                return com.pinterest.boardAutoCollages.e.e(it3, false, (o82.a0) c0Var.f82212a, 3);
            case 7:
                com.pinterest.boardAutoCollages.j0 it4 = (com.pinterest.boardAutoCollages.j0) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                o82.j0 multiSectionVMState = (o82.j0) c0Var.f82213b;
                String str = it4.f44570a;
                xa0.q draftSelectionResult = it4.f44573d;
                Intrinsics.checkNotNullParameter(draftSelectionResult, "draftSelectionResult");
                zy.l0 pinalyticsState = it4.f44574e;
                Intrinsics.checkNotNullParameter(pinalyticsState, "pinalyticsState");
                Intrinsics.checkNotNullParameter(multiSectionVMState, "multiSectionVMState");
                return new com.pinterest.boardAutoCollages.j0(str, it4.f44571b, it4.f44572c, draftSelectionResult, pinalyticsState, multiSectionVMState);
            case 8:
                return h((n70.o0) obj);
            case 9:
                n70.a displayState = (n70.a) obj;
                Intrinsics.checkNotNullParameter(displayState, "displayState");
                return n70.a.e(displayState, null, null, (zy.a0) c0Var.f82212a, null, null, 27);
            case 10:
                return h((n70.o0) obj);
            case 11:
                return r((s80.j) obj);
            case 12:
                return s((n6) obj);
            case 13:
                return r((s80.j) obj);
            case 14:
                return s((n6) obj);
            case 15:
                g90.a it5 = (g90.a) obj;
                Intrinsics.checkNotNullParameter(it5, "it");
                return g90.a.e(it5, 0, null, (zy.a0) c0Var.f82212a, false, 11);
            case 16:
                g90.b0 it6 = (g90.b0) obj;
                Intrinsics.checkNotNullParameter(it6, "it");
                zy.l0 pinalyticsState2 = (zy.l0) c0Var.f82213b;
                String collageId = it6.f64509a;
                Intrinsics.checkNotNullParameter(collageId, "collageId");
                String tappedCutoutItemId = it6.f64510b;
                Intrinsics.checkNotNullParameter(tappedCutoutItemId, "tappedCutoutItemId");
                Intrinsics.checkNotNullParameter(pinalyticsState2, "pinalyticsState");
                return new g90.b0(collageId, tappedCutoutItemId, pinalyticsState2, it6.f64512d, it6.f64513e, it6.f64514f);
            case 17:
                return b((h90.d) obj);
            case 18:
                return b((h90.d) obj);
            case 19:
                return e((m90.b) obj);
            case 20:
                return f((a1) obj);
            case 21:
                return e((m90.b) obj);
            case 22:
                return f((a1) obj);
            case 23:
                return l((p90.b) obj);
            case 24:
                return n((u0) obj);
            case 25:
                return l((p90.b) obj);
            case 26:
                return n((u0) obj);
            case 27:
                return l((p90.b) obj);
            case 28:
                return n((u0) obj);
            default:
                s90.a it7 = (s90.a) obj;
                Intrinsics.checkNotNullParameter(it7, "it");
                return s90.a.e(it7, (sa0.a) c0Var.f82212a, null, false, null, 30);
        }
    }

    public final l0 j(l0 it) {
        int i13 = this.f91911i;
        l82.c0 c0Var = this.f91912j;
        switch (i13) {
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return l0.b(it, (o82.j0) c0Var.f82213b, null, 23);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return l0.b(it, null, (zy.l0) c0Var.f82213b, 15);
        }
    }

    public final p90.b l(p90.b it) {
        int i13 = this.f91911i;
        l82.c0 c0Var = this.f91912j;
        switch (i13) {
            case 23:
                Intrinsics.checkNotNullParameter(it, "it");
                return p90.b.e(it, null, (sa0.a) c0Var.f82212a, null, null, 29);
            case 24:
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return p90.b.e(it, null, null, null, (zy.a0) c0Var.f82212a, 23);
            case 25:
                Intrinsics.checkNotNullParameter(it, "it");
                return p90.b.e(it, null, null, (o82.a0) c0Var.f82212a, null, 27);
        }
    }

    public final u0 n(u0 it) {
        int i13 = this.f91911i;
        l82.c0 c0Var = this.f91912j;
        switch (i13) {
            case 24:
                Intrinsics.checkNotNullParameter(it, "it");
                return u0.b(it, (sa0.s) c0Var.f82213b, null, null, 30);
            case 25:
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return u0.b(it, null, null, (zy.l0) c0Var.f82213b, 27);
            case 26:
                Intrinsics.checkNotNullParameter(it, "it");
                return u0.b(it, null, (o82.j0) c0Var.f82213b, null, 29);
        }
    }

    public final s80.j r(s80.j it) {
        int i13 = this.f91911i;
        l82.c0 c0Var = this.f91912j;
        switch (i13) {
            case 11:
                Intrinsics.checkNotNullParameter(it, "it");
                return c3.t0(it, (t80.d) c0Var.f82212a, false, 2);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return s80.j.e(it, null, null, null, null, null, null, null, null, null, null, (zy.a0) c0Var.f82212a, null, false, false, false, null, 130047);
        }
    }

    public final n6 s(n6 it) {
        int i13 = this.f91911i;
        l82.c0 c0Var = this.f91912j;
        switch (i13) {
            case 12:
                Intrinsics.checkNotNullParameter(it, "it");
                return n6.b(it, null, null, false, false, false, false, null, null, null, null, null, null, null, (t80.d0) c0Var.f82213b, false, null, false, null, 2080767);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return n6.b(it, null, null, false, false, false, false, null, null, null, null, null, null, null, null, false, (zy.l0) c0Var.f82213b, false, null, 2031615);
        }
    }
}
