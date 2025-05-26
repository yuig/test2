package cp;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kh2.c3;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import s80.m7;
import s80.n7;
import s80.t6;
import s80.v6;
import w80.x1;

/* loaded from: classes3.dex */
public final class t extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f52971i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f52972j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(boolean z13, int i13) {
        super(1);
        this.f52971i = i13;
        this.f52972j = z13;
    }

    public final rl1.q b(rl1.q it) {
        int i13 = this.f52971i;
        boolean z13 = this.f52972j;
        switch (i13) {
            case 7:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 18:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 19:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 20:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 21:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 22:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 23:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 24:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 25:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return rl1.q.e(it, null, null, false, null, null, false, false, d7.b.Z(z13), 0, null, null, 1919);
    }

    public final rn1.a e(rn1.a it) {
        int i13 = this.f52971i;
        boolean z13 = this.f52972j;
        switch (i13) {
            case 4:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 8:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return rn1.a.y(it, null, null, null, null, null, 0, d7.b.Z(z13), null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097087);
    }

    public final s80.j f(s80.j it) {
        int i13 = this.f52971i;
        boolean z13 = this.f52972j;
        switch (i13) {
            case 12:
                Intrinsics.checkNotNullParameter(it, "it");
                Intrinsics.checkNotNullParameter(it, "<this>");
                return s80.j.e(it, null, null, null, null, t6.e(it.f111596e, null, z13, 1), null, null, null, null, null, null, z13 ? m7.f111681a : n7.f111731a, false, false, false, null, 129007);
            case 13:
                Intrinsics.checkNotNullParameter(it, "it");
                Intrinsics.checkNotNullParameter(it, "<this>");
                v6 e13 = v6.e(it.f111600i, null, null, z13, 3);
                t6 t6Var = it.f111596e;
                ra0.u uVar = t6Var.f111805a;
                String colorString = it.f111600i.f111831a;
                Intrinsics.checkNotNullParameter(colorString, "colorString");
                return s80.j.e(it, null, null, null, null, t6.e(t6Var, ra0.u.e(uVar, new ra0.x(new u50.h(colorString))), false, 2), null, null, null, e13, null, null, null, false, false, false, null, 130799);
            case 14:
                Intrinsics.checkNotNullParameter(it, "it");
                return c3.t0(it, null, z13, 1);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                Intrinsics.checkNotNullParameter(it, "<this>");
                x1 x1Var = it.f111593b;
                boolean z14 = this.f52972j;
                return s80.j.e(it, null, x1.e(x1Var, null, null, null, null, null, null, z14, false, RecyclerViewTypes.VIEW_TYPE_LENS_PHOTO), w80.b.e(it.f111594c, false, false, false, false, false, z14, 31), null, null, null, null, null, null, null, null, null, false, false, false, null, 131065);
        }
    }

    public final yl1.b h(yl1.b displayState) {
        int i13 = this.f52971i;
        boolean z13 = this.f52972j;
        switch (i13) {
            case 1:
                Intrinsics.checkNotNullParameter(displayState, "it");
                Intrinsics.checkNotNullParameter(displayState, "displayState");
                break;
            case 11:
                Intrinsics.checkNotNullParameter(displayState, "it");
                boolean z14 = this.f52972j;
                break;
            case 27:
                Intrinsics.checkNotNullParameter(displayState, "it");
                break;
            case 28:
                Intrinsics.checkNotNullParameter(displayState, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(displayState, "it");
                break;
        }
        return yl1.b.f(displayState, null, false, d7.b.Z(z13), null, null, null, null, null, 0, null, 1019);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f52971i;
        boolean z13 = this.f52972j;
        switch (i13) {
            case 0:
                cn1.d0 bind = (cn1.d0) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                fm1.c visibility = d7.b.Z(z13);
                bind.getClass();
                Intrinsics.checkNotNullParameter(visibility, "visibility");
                bind.f28178h = visibility;
                break;
            case 2:
                on1.r bind2 = (on1.r) obj;
                Intrinsics.checkNotNullParameter(bind2, "$this$bind");
                on1.b bVar = new on1.b(z13, false, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL);
                bind2.getClass();
                Intrinsics.checkNotNullParameter(bVar, "switch");
                bind2.f96754a = bVar;
                break;
            case 3:
                om1.c it = (om1.c) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 5:
                rm1.d it2 = (rm1.d) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                break;
            case 6:
                wn1.d it3 = (wn1.d) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                om1.c cVar = it3.f130534u;
                break;
            case 10:
                cm1.d it4 = (cm1.d) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                break;
            case 16:
                ea0.l it5 = (ea0.l) obj;
                Intrinsics.checkNotNullParameter(it5, "it");
                break;
            case 17:
                om1.q bind3 = (om1.q) obj;
                Intrinsics.checkNotNullParameter(bind3, "$this$bind");
                bind3.c(z13 ? om1.e.LG : om1.e.MD);
                break;
        }
        return h((yl1.b) obj);
    }
}
