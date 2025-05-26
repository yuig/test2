package bt0;

import c61.k1;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import ct0.z;
import dy0.n0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l82.c0;
import ny0.t0;
import o82.a0;
import o82.j0;
import y01.h0;
import y01.n1;
import yy0.d0;
import zy.l0;

/* loaded from: classes5.dex */
public final class r extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f23886i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c0 f23887j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(c0 c0Var, int i13) {
        super(1);
        this.f23886i = i13;
        this.f23887j = c0Var;
    }

    public final c61.k b(c61.k it) {
        int i13 = this.f23886i;
        c0 c0Var = this.f23887j;
        switch (i13) {
            case 25:
                Intrinsics.checkNotNullParameter(it, "it");
                return c61.k.e(it, false, (a0) c0Var.f82212a, false, false, false, false, false, null, 2043);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return c61.k.e(it, false, null, false, false, false, false, false, (zy.a0) c0Var.f82212a, 1535);
        }
    }

    public final k1 e(k1 it) {
        int i13 = this.f23886i;
        c0 c0Var = this.f23887j;
        switch (i13) {
            case 26:
                Intrinsics.checkNotNullParameter(it, "it");
                return k1.b(it, null, (j0) c0Var.f82213b, false, 55);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return k1.b(it, (l0) c0Var.f82213b, null, false, 59);
        }
    }

    public final ny0.f f(ny0.f it) {
        int i13 = this.f23886i;
        c0 c0Var = this.f23887j;
        switch (i13) {
            case 12:
                Intrinsics.checkNotNullParameter(it, "it");
                return ny0.f.e(it, (a0) c0Var.f82212a, null, null, null, null, 62);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return ny0.f.e(it, null, null, null, (zy.a0) c0Var.f82212a, null, 55);
        }
    }

    public final t0 h(t0 it) {
        int i13 = this.f23886i;
        c0 c0Var = this.f23887j;
        switch (i13) {
            case 13:
                Intrinsics.checkNotNullParameter(it, "it");
                return t0.b(it, (j0) c0Var.f82213b, null, null, 30);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return t0.b(it, null, (l0) c0Var.f82213b, null, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f23886i;
        c0 c0Var = this.f23887j;
        switch (i13) {
            case 0:
                b it = (b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                a0 multiSectionDisplayState = (a0) c0Var.f82212a;
                int i14 = it.f23861b;
                Intrinsics.checkNotNullParameter(multiSectionDisplayState, "multiSectionDisplayState");
                return new b(multiSectionDisplayState, i14);
            case 1:
                t it2 = (t) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                j0 multiSectionVMState = (j0) c0Var.f82213b;
                String userId = it2.f23889a;
                Intrinsics.checkNotNullParameter(userId, "userId");
                Intrinsics.checkNotNullParameter(multiSectionVMState, "multiSectionVMState");
                return new t(userId, multiSectionVMState);
            case 2:
                ct0.h it3 = (ct0.h) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                a0 multiSectionDisplayState2 = (a0) c0Var.f82212a;
                int i15 = it3.f53145a;
                Intrinsics.checkNotNullParameter(multiSectionDisplayState2, "multiSectionDisplayState");
                return new ct0.h(i15, multiSectionDisplayState2, it3.f53147c, it3.f53148d, it3.f53149e, it3.f53150f, it3.f53151g);
            case 3:
                z it4 = (z) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                j0 multiSectionVMState2 = (j0) c0Var.f82213b;
                it4.getClass();
                Intrinsics.checkNotNullParameter(multiSectionVMState2, "multiSectionVMState");
                return new z(multiSectionVMState2);
            case 4:
                dt0.a it5 = (dt0.a) obj;
                Intrinsics.checkNotNullParameter(it5, "it");
                return dt0.a.e(it5, 0, 0, (a0) c0Var.f82212a, false, 23);
            case 5:
                dt0.a0 it6 = (dt0.a0) obj;
                Intrinsics.checkNotNullParameter(it6, "it");
                return dt0.a0.b(it6, null, (j0) c0Var.f82213b, 7);
            case 6:
                zw0.b it7 = (zw0.b) obj;
                Intrinsics.checkNotNullParameter(it7, "it");
                return zw0.b.e(it7, (a0) c0Var.f82212a, false, RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_DETAILED);
            case 7:
                zw0.s it8 = (zw0.s) obj;
                Intrinsics.checkNotNullParameter(it8, "it");
                return zw0.s.b(it8, (j0) c0Var.f82213b);
            case 8:
                dx0.f it9 = (dx0.f) obj;
                Intrinsics.checkNotNullParameter(it9, "it");
                return dx0.f.e(it9, (a0) c0Var.f82212a, false, 0, 2043);
            case 9:
                dx0.u it10 = (dx0.u) obj;
                Intrinsics.checkNotNullParameter(it10, "it");
                return dx0.u.b(it10, (j0) c0Var.f82213b);
            case 10:
                dy0.e it11 = (dy0.e) obj;
                Intrinsics.checkNotNullParameter(it11, "it");
                return dy0.e.e(it11, null, (zy.a0) c0Var.f82212a, 31);
            case 11:
                n0 it12 = (n0) obj;
                Intrinsics.checkNotNullParameter(it12, "it");
                l0 pinalyticsVMState = (l0) c0Var.f82213b;
                boolean z13 = it12.f56600a;
                Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
                return new n0(pinalyticsVMState, z13);
            case 12:
                return f((ny0.f) obj);
            case 13:
                return h((t0) obj);
            case 14:
                return f((ny0.f) obj);
            case 15:
                return h((t0) obj);
            case 16:
                yy0.d it13 = (yy0.d) obj;
                Intrinsics.checkNotNullParameter(it13, "it");
                return yy0.d.e(it13, null, null, null, (zy.a0) c0Var.f82212a, 7);
            case 17:
                d0 it14 = (d0) obj;
                Intrinsics.checkNotNullParameter(it14, "it");
                return d0.b(it14, (l0) c0Var.f82213b, 0, RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_DETAILED);
            case 18:
                iz0.b it15 = (iz0.b) obj;
                Intrinsics.checkNotNullParameter(it15, "it");
                return iz0.b.e(it15, (a0) c0Var.f82212a, null, 2);
            case 19:
                iz0.c0 it16 = (iz0.c0) obj;
                Intrinsics.checkNotNullParameter(it16, "it");
                j0 multiSectionVMState3 = (j0) c0Var.f82213b;
                String quizId = it16.f73900a;
                Intrinsics.checkNotNullParameter(quizId, "quizId");
                String answerString = it16.f73901b;
                Intrinsics.checkNotNullParameter(answerString, "answerString");
                Intrinsics.checkNotNullParameter(multiSectionVMState3, "multiSectionVMState");
                return new iz0.c0(quizId, answerString, it16.f73902c, multiSectionVMState3);
            case 20:
                h0 it17 = (h0) obj;
                Intrinsics.checkNotNullParameter(it17, "it");
                return h0.e(it17, (h42.a) c0Var.f82212a, null, 2);
            case 21:
                n1 it18 = (n1) obj;
                Intrinsics.checkNotNullParameter(it18, "it");
                return n1.b(it18, null, (h42.f) c0Var.f82213b, false, null, 0, 0, null, 32735);
            case 22:
                x31.c it19 = (x31.c) obj;
                Intrinsics.checkNotNullParameter(it19, "it");
                return x31.c.e(it19, null, (zy.a0) c0Var.f82212a, 1);
            case 23:
                x31.p it20 = (x31.p) obj;
                Intrinsics.checkNotNullParameter(it20, "it");
                return x31.p.b(it20, null, null, null, (l0) c0Var.f82213b, null, 447);
            case 24:
                i51.a0 it21 = (i51.a0) obj;
                Intrinsics.checkNotNullParameter(it21, "it");
                return i51.a0.b(it21, false, false, false, null, (x31.p) c0Var.f82213b, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK);
            case 25:
                return b((c61.k) obj);
            case 26:
                return e((k1) obj);
            case 27:
                return b((c61.k) obj);
            case 28:
                return e((k1) obj);
            default:
                x91.a it22 = (x91.a) obj;
                Intrinsics.checkNotNullParameter(it22, "it");
                return x91.a.e(it22, null, null, false, (a0) c0Var.f82212a, 7);
        }
    }
}
