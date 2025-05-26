package r1;

import android.widget.FrameLayout;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m60.w0;
import ni1.y2;
import s80.f7;
import um0.x0;

/* loaded from: classes2.dex */
public final class j0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f105919i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f105920j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(int i13, int i14) {
        super(1);
        this.f105919i = i14;
        this.f105920j = i13;
    }

    public final ao1.b b(ao1.b it) {
        int i13 = this.f105919i;
        int i14 = this.f105920j;
        switch (i13) {
            case 17:
                Intrinsics.checkNotNullParameter(it, "it");
                return ao1.b.e(it, null, bs1.c.j2(new String[0], i14), null, null, null, false, 0, 0, 0, false, false, false, null, false, null, null, null, null, null, 0, 4194301);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return ao1.b.e(it, null, null, null, null, null, false, 0, 0, 0, false, false, false, null, false, Integer.valueOf(i14), null, null, null, null, 0, 4161535);
        }
    }

    public final Boolean e(z2.z zVar) {
        int i13 = this.f105919i;
        int i14 = this.f105920j;
        switch (i13) {
            case 1:
                Boolean F = androidx.compose.ui.focus.a.F(zVar, i14);
                return Boolean.valueOf(F != null ? F.booleanValue() : false);
            default:
                Boolean F2 = androidx.compose.ui.focus.a.F(zVar, i14);
                return Boolean.valueOf(F2 != null ? F2.booleanValue() : false);
        }
    }

    public final rn1.a f(rn1.a displayState) {
        int i13 = this.f105919i;
        int i14 = this.f105920j;
        switch (i13) {
            case 4:
                Intrinsics.checkNotNullParameter(displayState, "displayState");
                Intrinsics.checkNotNullParameter(displayState, "displayState");
                u50.i0 i0Var = displayState.f108849g;
                u50.j0 text = bs1.c.i2(w0.plural_pins_string, i14, qb0.j.b(i14));
                Intrinsics.checkNotNullParameter(text, "text");
                return new rn1.a(text, displayState.f108850h, displayState.f108851i, displayState.f108852j, displayState.f108853k, displayState.f108854l, displayState.f108855m, displayState.f108856n, displayState.f108857o, displayState.f108858p, displayState.f108859q, displayState.f108860r, displayState.f108861s, displayState.f108862t, displayState.f108863u, displayState.f108864v, displayState.f108865w, displayState.f108866x, displayState.f108867y, displayState.f108868z, displayState.A);
            case 5:
                Intrinsics.checkNotNullParameter(displayState, "it");
                return rn1.a.y(displayState, bs1.c.j2(new String[0], i14), null, kotlin.collections.e0.b(vn1.b.CENTER_VERTICAL), null, vn1.g.BODY_100, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097130);
            case 12:
                Intrinsics.checkNotNullParameter(displayState, "it");
                return rn1.a.y(displayState, bs1.c.j2(new String[0], i14), null, null, null, vn1.g.BODY_300, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097134);
            case 14:
                Intrinsics.checkNotNullParameter(displayState, "it");
                return rn1.a.y(displayState, bs1.c.j2(new String[0], i14), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            case 18:
                Intrinsics.checkNotNullParameter(displayState, "it");
                return rn1.a.y(displayState, bs1.c.j2(new String[0], i14), vn1.c.SUBTLE, kotlin.collections.e0.b(vn1.b.CENTER), null, vn1.g.BODY_100, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097128);
            case 19:
                Intrinsics.checkNotNullParameter(displayState, "it");
                return rn1.a.y(displayState, bs1.c.j2(new String[0], i14), null, null, kotlin.collections.e0.b(vn1.e.BOLD), vn1.g.UI_400, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097126);
            case 21:
                Intrinsics.checkNotNullParameter(displayState, "it");
                return rn1.a.y(displayState, null, null, null, null, null, this.f105920j, null, rn1.b.END, null, null, false, 0, null, null, null, null, null, false, null, null, 2096991);
            case 22:
                Intrinsics.checkNotNullParameter(displayState, "it");
                return rn1.a.y(displayState, null, null, null, null, null, this.f105920j, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097119);
            case 23:
                Intrinsics.checkNotNullParameter(displayState, "it");
                String string = String.valueOf(i14);
                Intrinsics.checkNotNullParameter(string, "string");
                return rn1.a.y(displayState, new u50.f0(string), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            case 24:
                Intrinsics.checkNotNullParameter(displayState, "it");
                return rn1.a.y(displayState, bs1.c.h2(String.valueOf(i14)), null, null, null, null, 0, d7.b.Z(i14 > 0), null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            default:
                Intrinsics.checkNotNullParameter(displayState, "it");
                return rn1.a.y(displayState, bs1.c.h2(String.valueOf(i14)), null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
        }
    }

    public final wn1.d h(wn1.d it) {
        int i13 = this.f105919i;
        int i14 = this.f105920j;
        switch (i13) {
            case 7:
                Intrinsics.checkNotNullParameter(it, "it");
                return wn1.d.e(it, null, bs1.c.j2(new String[0], i14), null, null, false, null, null, null, null, 8388605);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return wn1.d.e(it, null, null, null, null, false, Integer.valueOf(i14), null, null, null, 8355839);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f105919i;
        int i14 = this.f105920j;
        switch (i13) {
            case 0:
                return Integer.valueOf(((h0) obj).f105909a - i14);
            case 1:
                return e((z2.z) obj);
            case 2:
                return e((z2.z) obj);
            case 3:
            default:
                return f((rn1.a) obj);
            case 4:
                return f((rn1.a) obj);
            case 5:
                return f((rn1.a) obj);
            case 6:
                rl1.q it = (rl1.q) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return rl1.q.e(it, null, null, true, rl1.r.LG, null, false, false, null, this.f105920j, null, null, 1779);
            case 7:
                return h((wn1.d) obj);
            case 8:
                int[] it2 = (int[]) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                if (i14 < it2.length) {
                    return Boolean.valueOf(it2[i14] > 0);
                }
                return Boolean.FALSE;
            case 9:
                int[] it3 = (int[]) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                return Integer.valueOf(it3[i14]);
            case 10:
                an1.l it4 = (an1.l) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                return an1.l.e(it4, null, null, null, null, this.f105920j, null, null, RecyclerViewTypes.VIEW_TYPE_ADS_CAROUSEL);
            case 11:
                s80.j it5 = (s80.j) obj;
                Intrinsics.checkNotNullParameter(it5, "it");
                f7 f7Var = it5.f111599h;
                u50.k0 text = bs1.c.j2(new String[0], i14);
                f7Var.getClass();
                Intrinsics.checkNotNullParameter(text, "text");
                return s80.j.e(it5, null, null, null, null, null, null, null, new f7(text, true), null, null, null, null, false, false, false, null, 130943);
            case 12:
                return f((rn1.a) obj);
            case 13:
                nm1.m it6 = (nm1.m) obj;
                Intrinsics.checkNotNullParameter(it6, "it");
                return ((nm1.b0) it6).b(i14);
            case 14:
                return f((rn1.a) obj);
            case 15:
                yl1.b it7 = (yl1.b) obj;
                Intrinsics.checkNotNullParameter(it7, "it");
                return yl1.b.f(it7, bs1.c.j2(new String[0], i14), false, null, null, null, null, null, null, 0, null, 1022);
            case 16:
                y2 it8 = (y2) obj;
                Intrinsics.checkNotNullParameter(it8, "it");
                return y2.b(it8, wa2.m.a(it8.f90905c, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, false, false, false, false, null, false, false, null, null, null, false, null, null, false, false, null, null, false, -8388609, -1, 1023), null, Integer.valueOf(i14), false, false, null, null, false, false, false, false, 0, false, false, null, null, null, null, null, null, null, -131077, 4194303);
            case 17:
                return b((ao1.b) obj);
            case 18:
                return f((rn1.a) obj);
            case 19:
                return f((rn1.a) obj);
            case 20:
                um0.e it9 = (um0.e) obj;
                Intrinsics.checkNotNullParameter(it9, "it");
                Intrinsics.checkNotNullParameter(it9, "<this>");
                xm0.d headerState = xm0.d.a(it9.f122697c.f122780a, xm0.c.a(i14), null, 5);
                Intrinsics.checkNotNullParameter(headerState, "headerState");
                return um0.e.e(it9, null, null, new x0(headerState), 3);
            case 21:
                return f((rn1.a) obj);
            case 22:
                return f((rn1.a) obj);
            case 23:
                return f((rn1.a) obj);
            case 24:
                return f((rn1.a) obj);
            case 25:
                return h((wn1.d) obj);
            case 26:
                return b((ao1.b) obj);
            case 27:
                dx0.f it10 = (dx0.f) obj;
                Intrinsics.checkNotNullParameter(it10, "it");
                return dx0.f.e(it10, null, false, i14, 1023);
            case 28:
                FrameLayout.LayoutParams lparamsFrame = (FrameLayout.LayoutParams) obj;
                Intrinsics.checkNotNullParameter(lparamsFrame, "$this$lparamsFrame");
                lparamsFrame.width = i14;
                lparamsFrame.height = i14;
                lparamsFrame.gravity = 8388693;
                return Unit.f80348a;
        }
    }
}
