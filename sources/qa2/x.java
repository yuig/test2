package qa2;

import android.content.res.Resources;
import com.pinterest.api.model.f30;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.ui.grid.LegoPinGridCellImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class x extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f103366i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ LegoPinGridCellImpl f103367j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(LegoPinGridCellImpl legoPinGridCellImpl, int i13) {
        super(0);
        this.f103366i = i13;
        this.f103367j = legoPinGridCellImpl;
    }

    public final Integer b() {
        int i13 = this.f103366i;
        LegoPinGridCellImpl legoPinGridCellImpl = this.f103367j;
        switch (i13) {
            case 8:
                Resources resources = legoPinGridCellImpl.getContext().getResources();
                int i14 = LegoPinGridCellImpl.Z2;
                return Integer.valueOf(resources.getDimensionPixelSize(((Number) legoPinGridCellImpl.f52472v0.getValue()).intValue()));
            default:
                int i15 = LegoPinGridCellImpl.Z2;
                legoPinGridCellImpl.getClass();
                return Integer.valueOf(legoPinGridCellImpl.t1() ? eo1.c.lego_corner_radius_small : eo1.c.lego_corner_radius_medium);
        }
    }

    public final ua2.n0 e() {
        int i13 = this.f103366i;
        LegoPinGridCellImpl legoPinGridCellImpl = this.f103367j;
        switch (i13) {
            case 0:
                ua2.n0 n0Var = new ua2.n0(legoPinGridCellImpl, legoPinGridCellImpl.Y1);
                tn1.c cVar = n0Var.f121583k.f125401m;
                Intrinsics.checkNotNullParameter(cVar, "<this>");
                cVar.a(new tn1.a(cVar, 1));
                return n0Var;
            case 1:
                ua2.n0 n0Var2 = new ua2.n0(legoPinGridCellImpl, legoPinGridCellImpl.Y1);
                n0Var2.I(tn1.c.f118617i);
                n0Var2.H(vn1.c.SUBTLE);
                String string = legoPinGridCellImpl.getResources().getString(legoPinGridCellImpl.f52408f0 ? wy1.f.sponsored : wy1.f.promoted);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                n0Var2.G(string);
                return n0Var2;
            case 2:
                ua2.n0 n0Var3 = new ua2.n0(legoPinGridCellImpl, legoPinGridCellImpl.Y1);
                n0Var3.I(tn1.c.f118617i);
                n0Var3.H(vn1.c.DEFAULT);
                return n0Var3;
            default:
                return new ua2.n0(legoPinGridCellImpl, legoPinGridCellImpl.Y1);
        }
    }

    public final ua2.o0 f() {
        int i13 = this.f103366i;
        LegoPinGridCellImpl legoPinGridCellImpl = this.f103367j;
        switch (i13) {
            case 15:
                ua2.o0 o0Var = new ua2.o0(legoPinGridCellImpl, legoPinGridCellImpl.Y1, 0, rm1.q.ARROW_UP_RIGHT, rm1.c.SUBTLE, null, Integer.valueOf(bs1.c.W(legoPinGridCellImpl, wy1.b.arrow_up_right_width)), null, RecyclerViewTypes.VIEW_TYPE_MAKEUP_CAROUSEL_ITEM_LOADING);
                o0Var.I(tn1.c.f118617i);
                o0Var.H(vn1.c.SUBTLE);
                String string = legoPinGridCellImpl.getResources().getString(legoPinGridCellImpl.f52408f0 ? wy1.f.sponsored : wy1.f.promoted);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                o0Var.G(string);
                return o0Var;
            case 16:
                ua2.o0 o0Var2 = new ua2.o0(this.f103367j, legoPinGridCellImpl.Y1, bs1.c.W(legoPinGridCellImpl, wy1.b.d2s_attribution_icon_padding), rm1.q.ARROW_SMALL_UP_RIGHT, rm1.c.SUBTLE, rm1.i.XS, null, g92.d.VR, 64);
                o0Var2.I(tn1.c.f118617i);
                o0Var2.H(vn1.c.SUBTLE);
                String string2 = legoPinGridCellImpl.getResources().getString(legoPinGridCellImpl.f52408f0 ? wy1.f.sponsored : wy1.f.promoted);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                o0Var2.G(string2);
                return o0Var2;
            default:
                ua2.o0 o0Var3 = new ua2.o0(legoPinGridCellImpl, legoPinGridCellImpl.Y1, 0, rm1.q.CHECK_CIRCLE, rm1.c.INFO, rm1.i.XS, null, null, RecyclerViewTypes.VIEW_SHOP_THE_LOOK_CLOSEUP_MODULE);
                o0Var3.I(tn1.c.f118617i);
                o0Var3.H(vn1.c.DEFAULT);
                return o0Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        int i13 = this.f103366i;
        LegoPinGridCellImpl legoPinGridCellImpl = this.f103367j;
        switch (i13) {
            case 11:
                return Boolean.valueOf(legoPinGridCellImpl.f52415h);
            case 12:
                return Boolean.valueOf(legoPinGridCellImpl.f52440n0);
            default:
                f30 f30Var = legoPinGridCellImpl.C0;
                return Boolean.valueOf(f30Var != null ? Intrinsics.d(f30Var.S4(), Boolean.TRUE) : false);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f103366i;
        LegoPinGridCellImpl legoPinGridCellImpl = this.f103367j;
        switch (i13) {
            case 0:
                return e();
            case 1:
                return e();
            case 2:
                return e();
            case 3:
                return e();
            case 4:
                return new ua2.y0(legoPinGridCellImpl);
            case 5:
                m240invoke();
                return Unit.f80348a;
            case 6:
                m240invoke();
                return Unit.f80348a;
            case 7:
                m240invoke();
                return Unit.f80348a;
            case 8:
                return b();
            case 9:
                return b();
            case 10:
                return legoPinGridCellImpl.R0;
            case 11:
                return invoke();
            case 12:
                return invoke();
            case 13:
                return invoke();
            case 14:
                return legoPinGridCellImpl.f52400d;
            case 15:
                return f();
            case 16:
                return f();
            case 17:
                return f();
            case 18:
                m240invoke();
                return Unit.f80348a;
            case 19:
                m240invoke();
                return Unit.f80348a;
            default:
                return new sa2.c(legoPinGridCellImpl, legoPinGridCellImpl.getImageCache(), new w(legoPinGridCellImpl, 3));
        }
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m240invoke() {
        int i13 = this.f103366i;
        LegoPinGridCellImpl legoPinGridCellImpl = this.f103367j;
        switch (i13) {
            case 5:
                legoPinGridCellImpl.k2();
                legoPinGridCellImpl.S1 = System.currentTimeMillis() * 1000000;
                break;
            case 6:
                legoPinGridCellImpl.getExperiments().d();
                break;
            case 7:
                legoPinGridCellImpl.getExperiments().e();
                break;
            case 18:
                legoPinGridCellImpl.getExperiments().d();
                break;
            default:
                legoPinGridCellImpl.getExperiments().e();
                break;
        }
    }
}
