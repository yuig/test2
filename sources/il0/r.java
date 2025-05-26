package il0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l82.c0;
import lm0.x0;
import ml0.m0;
import ni1.u0;
import ni1.y2;
import o82.j0;
import qm0.y1;
import sk0.y;
import tk0.i0;
import um0.w0;
import xs0.g0;
import zy.a0;
import zy.l0;

/* loaded from: classes5.dex */
public final class r extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f72541i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c0 f72542j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(c0 c0Var, int i13) {
        super(1);
        this.f72541i = i13;
        this.f72542j = c0Var;
    }

    public final lm0.a b(lm0.a it) {
        int i13 = this.f72541i;
        c0 c0Var = this.f72542j;
        switch (i13) {
            case 6:
                Intrinsics.checkNotNullParameter(it, "it");
                return lm0.a.e(it, null, null, null, false, null, false, (sk0.d) c0Var.f82212a, null, null, null, 1919);
            case 7:
            case 9:
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return lm0.a.e(it, null, null, null, false, null, false, null, null, null, (a0) c0Var.f82212a, 1023);
            case 8:
                Intrinsics.checkNotNullParameter(it, "it");
                return lm0.a.e(it, null, null, null, false, null, false, null, null, (o82.a0) c0Var.f82212a, null, 1535);
            case 10:
                Intrinsics.checkNotNullParameter(it, "it");
                return lm0.a.e(it, null, null, null, false, null, false, null, (um0.e) c0Var.f82212a, null, null, 1791);
        }
    }

    public final x0 e(x0 it) {
        int i13 = this.f72541i;
        c0 c0Var = this.f72542j;
        switch (i13) {
            case 7:
                Intrinsics.checkNotNullParameter(it, "it");
                return x0.b(it, null, null, null, null, (y) c0Var.f82213b, null, null, null, 959);
            case 8:
            case 10:
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return x0.b(it, null, null, null, null, null, null, null, (l0) c0Var.f82213b, 511);
            case 9:
                Intrinsics.checkNotNullParameter(it, "it");
                return x0.b(it, null, null, null, null, null, null, (j0) c0Var.f82213b, null, 767);
            case 11:
                Intrinsics.checkNotNullParameter(it, "it");
                return x0.b(it, null, null, null, null, null, (w0) c0Var.f82213b, null, null, 895);
        }
    }

    public final ml0.b f(ml0.b it) {
        int i13 = this.f72541i;
        c0 c0Var = this.f72542j;
        switch (i13) {
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                return ml0.b.e(it, (o82.a0) c0Var.f82212a, null, null, 6);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return ml0.b.e(it, null, null, (a0) c0Var.f82212a, 3);
        }
    }

    public final m0 h(m0 it) {
        int i13 = this.f72541i;
        c0 c0Var = this.f72542j;
        switch (i13) {
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                return m0.b(it, (j0) c0Var.f82213b, null, null, null, 61);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return m0.b(it, null, (l0) c0Var.f82213b, null, null, 59);
        }
    }

    public final qm0.b i(qm0.b it) {
        int i13 = this.f72541i;
        c0 c0Var = this.f72542j;
        switch (i13) {
            case 14:
                Intrinsics.checkNotNullParameter(it, "it");
                return qm0.b.e(it, null, null, null, (sk0.d) c0Var.f82212a, null, 23);
            case 15:
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return qm0.b.e(it, null, (o82.a0) c0Var.f82212a, null, null, null, 29);
            case 16:
                Intrinsics.checkNotNullParameter(it, "it");
                return qm0.b.e(it, null, null, null, null, (a0) c0Var.f82212a, 15);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f72541i;
        c0 c0Var = this.f72542j;
        switch (i13) {
            case 0:
                a it = (a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return a.e(it, null, (tk0.e) c0Var.f82212a, 7);
            case 1:
                t it2 = (t) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return t.b(it2, null, (i0) c0Var.f82213b, 1);
            case 2:
                return f((ml0.b) obj);
            case 3:
                return h((m0) obj);
            case 4:
                return f((ml0.b) obj);
            case 5:
                return h((m0) obj);
            case 6:
                return b((lm0.a) obj);
            case 7:
                return e((x0) obj);
            case 8:
                return b((lm0.a) obj);
            case 9:
                return e((x0) obj);
            case 10:
                return b((lm0.a) obj);
            case 11:
                return e((x0) obj);
            case 12:
                return b((lm0.a) obj);
            case 13:
                return e((x0) obj);
            case 14:
                return i((qm0.b) obj);
            case 15:
                return j((y1) obj);
            case 16:
                return i((qm0.b) obj);
            case 17:
                return j((y1) obj);
            case 18:
                return i((qm0.b) obj);
            case 19:
                return j((y1) obj);
            case 20:
                um0.e it3 = (um0.e) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                return um0.e.e(it3, null, (tk0.e) c0Var.f82212a, null, 5);
            case 21:
                w0 it4 = (w0) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                return w0.b(it4, false, false, (i0) c0Var.f82213b, null, 27);
            case 22:
                return l((vn0.a) obj);
            case 23:
                return n((vn0.m) obj);
            case 24:
                return l((vn0.a) obj);
            case 25:
                return n((vn0.m) obj);
            case 26:
                xs0.q it5 = (xs0.q) obj;
                Intrinsics.checkNotNullParameter(it5, "it");
                return xs0.q.e(it5, false, null, null, false, (u0) c0Var.f82212a, 15);
            case 27:
                g0 it6 = (g0) obj;
                Intrinsics.checkNotNullParameter(it6, "it");
                return g0.b(it6, null, (y2) c0Var.f82213b, 63);
            case 28:
                ys0.b it7 = (ys0.b) obj;
                Intrinsics.checkNotNullParameter(it7, "it");
                o82.a0 multiSectionDisplayState = (o82.a0) c0Var.f82212a;
                it7.getClass();
                Intrinsics.checkNotNullParameter(multiSectionDisplayState, "multiSectionDisplayState");
                return new ys0.b(multiSectionDisplayState);
            default:
                ys0.q it8 = (ys0.q) obj;
                Intrinsics.checkNotNullParameter(it8, "it");
                j0 multiSectionVMState = (j0) c0Var.f82213b;
                l0 pinalyticsVMState = it8.f140125a;
                Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
                Intrinsics.checkNotNullParameter(multiSectionVMState, "multiSectionVMState");
                return new ys0.q(pinalyticsVMState, multiSectionVMState);
        }
    }

    public final y1 j(y1 it) {
        int i13 = this.f72541i;
        c0 c0Var = this.f72542j;
        switch (i13) {
            case 15:
                Intrinsics.checkNotNullParameter(it, "it");
                return y1.b(it, null, null, null, (y) c0Var.f82213b, null, false, false, null, 991);
            case 16:
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return y1.b(it, null, null, (j0) c0Var.f82213b, null, null, false, false, null, 1007);
            case 17:
                Intrinsics.checkNotNullParameter(it, "it");
                return y1.b(it, null, null, null, null, null, false, false, (l0) c0Var.f82213b, 511);
        }
    }

    public final vn0.a l(vn0.a it) {
        int i13 = this.f72541i;
        c0 c0Var = this.f72542j;
        switch (i13) {
            case 22:
                Intrinsics.checkNotNullParameter(it, "it");
                return vn0.a.e(it, (sk0.d) c0Var.f82212a, null, 2);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return vn0.a.e(it, null, (tk0.e) c0Var.f82212a, 1);
        }
    }

    public final vn0.m n(vn0.m it) {
        int i13 = this.f72541i;
        c0 c0Var = this.f72542j;
        switch (i13) {
            case 23:
                Intrinsics.checkNotNullParameter(it, "it");
                return vn0.m.b(it, (y) c0Var.f82213b, null, 2);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return vn0.m.b(it, null, (i0) c0Var.f82213b, 1);
        }
    }
}
