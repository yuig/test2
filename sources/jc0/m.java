package jc0;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import qm0.y1;

/* loaded from: classes5.dex */
public final class m extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f75420i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f75421j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(boolean z13, int i13) {
        super(1);
        this.f75420i = i13;
        this.f75421j = z13;
    }

    public final om1.c b(om1.c it) {
        int i13 = this.f75420i;
        boolean z13 = this.f75421j;
        switch (i13) {
            case 15:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 16:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 17:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 18:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return om1.c.e(it, null, null, null, d7.b.Z(z13), null, false, 0, 1015);
    }

    public final on1.b e(on1.b it) {
        switch (this.f75420i) {
            case 19:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return on1.b.e(it, this.f75421j, false, null, 0, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL);
    }

    public final y1 f(y1 it) {
        switch (this.f75420i) {
            case 28:
                Intrinsics.checkNotNullParameter(it, "it");
                return y1.b(it, null, null, null, null, null, this.f75421j, false, null, 895);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return y1.b(it, null, null, null, null, null, false, this.f75421j, null, 767);
        }
    }

    public final rm1.d h(rm1.d it) {
        int i13 = this.f75420i;
        boolean z13 = this.f75421j;
        switch (i13) {
            case 5:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return rm1.d.e(it, null, null, d7.b.Z(z13), 0, null, 27);
    }

    public final rn1.a i(rn1.a it) {
        int i13 = this.f75420i;
        boolean z13 = this.f75421j;
        switch (i13) {
            case 4:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, z13 ? vn1.c.INVERSE : vn1.c.DEFAULT, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097149);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, d7.b.Z(z13), null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097087);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f75420i;
        boolean z13 = this.f75421j;
        switch (i13) {
            case 7:
                bm1.v bind = (bm1.v) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                fm1.c visibility = fm1.c.VISIBLE;
                bind.getClass();
                Intrinsics.checkNotNullParameter(visibility, "visibility");
                bind.f23528e = visibility;
                bm1.n selectedState = z13 ? bm1.n.SELECTED : bm1.n.UNSELECTED;
                Intrinsics.checkNotNullParameter(selectedState, "selectedState");
                bind.f23525b = selectedState;
                bm1.b buttonType = new bm1.b(z13 ? bs1.c.j2(new String[0], x0.added) : bs1.c.j2(new String[0], x0.add));
                Intrinsics.checkNotNullParameter(buttonType, "buttonType");
                bind.f23526c = buttonType;
                break;
            case 8:
                l((on1.r) obj);
                break;
            case 9:
                yl1.l bind2 = (yl1.l) obj;
                switch (i13) {
                    case 9:
                        Intrinsics.checkNotNullParameter(bind2, "$this$bind");
                        bind2.f139349b = z13;
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(bind2, "$this$bind");
                        bind2.f139349b = z13;
                        break;
                }
                break;
            case 10:
                yl1.l bind3 = (yl1.l) obj;
                switch (i13) {
                    case 9:
                        Intrinsics.checkNotNullParameter(bind3, "$this$bind");
                        bind3.f139349b = z13;
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(bind3, "$this$bind");
                        bind3.f139349b = z13;
                        break;
                }
                break;
            case 11:
                l((on1.r) obj);
                break;
            case 12:
                rn1.k bind4 = (rn1.k) obj;
                Intrinsics.checkNotNullParameter(bind4, "$this$bind");
                bind4.i(d7.b.Z(z13));
                break;
            case 13:
                l((on1.r) obj);
                break;
            case 26:
                on1.k it = (on1.k) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 27:
                lm0.a it2 = (lm0.a) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                boolean z14 = !z13;
                break;
        }
        return f((y1) obj);
    }

    public final yl1.b j(yl1.b it) {
        int i13 = this.f75420i;
        boolean z13 = this.f75421j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, null, false, d7.b.Z(z13), null, null, null, null, null, 0, null, 1019);
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, null, this.f75421j, null, null, null, null, null, null, 0, null, 1021);
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, null, this.f75421j, null, null, null, null, null, null, 0, null, 1021);
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, null, this.f75421j, null, null, null, null, null, null, 0, null, 1021);
            case 22:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, null, this.f75421j, null, null, null, null, null, null, 0, null, 1021);
            case 23:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, null, false, d7.b.Z(!z13), null, null, null, null, null, 0, null, 1019);
            case 24:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, null, false, d7.b.Z(z13), null, null, null, null, null, 0, null, 1019);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, null, this.f75421j, null, null, null, null, null, null, 0, null, 1021);
        }
    }

    public final void l(on1.r bind) {
        boolean z13 = this.f75421j;
        switch (this.f75420i) {
            case 8:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                on1.b bVar = new on1.b(z13, true, RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_FOOTER);
                bind.getClass();
                Intrinsics.checkNotNullParameter(bVar, "switch");
                bind.f96754a = bVar;
                fm1.c visibility = fm1.c.VISIBLE;
                Intrinsics.checkNotNullParameter(visibility, "visibility");
                bind.f96757d = visibility;
                break;
            case 11:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                on1.b bVar2 = new on1.b(z13, false, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL);
                bind.getClass();
                Intrinsics.checkNotNullParameter(bVar2, "switch");
                bind.f96754a = bVar2;
                break;
            default:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                fm1.c visibility2 = d7.b.Z(z13);
                bind.getClass();
                Intrinsics.checkNotNullParameter(visibility2, "visibility");
                bind.f96757d = visibility2;
                break;
        }
    }
}
