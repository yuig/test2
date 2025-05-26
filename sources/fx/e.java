package fx;

import ao1.i;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.searchField.GestaltStaticSearchBar;
import com.pinterest.qrCodeLogin.j;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import rn1.k;
import u50.h0;
import u50.i0;
import vn1.g;
import ym1.z;

/* loaded from: classes3.dex */
public final class e extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f63075i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i0 f63076j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i13, i0 i0Var) {
        super(1);
        this.f63075i = i13;
        this.f63076j = i0Var;
    }

    public final ao1.b b(ao1.b it) {
        h0 h0Var = h0.f120562a;
        int i13 = this.f63075i;
        i0 i0Var = this.f63076j;
        switch (i13) {
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                return ao1.b.e(it, null, null, this.f63076j, null, yn1.f.ERROR, false, 0, 0, 0, false, false, false, null, false, null, null, null, null, null, 0, 4194267);
            case 4:
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return ao1.b.e(it, null, null, this.f63076j, null, !Intrinsics.d(i0Var, h0Var) ? yn1.f.ERROR : yn1.f.DEFAULT, false, 0, 0, 0, false, false, false, null, false, null, null, null, null, null, 0, 4194267);
            case 5:
                Intrinsics.checkNotNullParameter(it, "it");
                return ao1.b.e(it, null, null, this.f63076j, null, !Intrinsics.d(i0Var, h0Var) ? yn1.f.ERROR : yn1.f.DEFAULT, false, 0, 0, 0, false, false, false, null, false, null, null, null, null, null, 0, 4194267);
        }
    }

    public final cm1.d e(cm1.d buttonGroup) {
        switch (this.f63075i) {
            case 8:
                Intrinsics.checkNotNullParameter(buttonGroup, "buttonGroup");
                return cm1.d.e(buttonGroup, yl1.b.f(buttonGroup.f28012a, this.f63076j, false, null, null, null, null, null, null, 0, null, 1022), null, null, null, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL);
            default:
                Intrinsics.checkNotNullParameter(buttonGroup, "buttonGroup");
                return cm1.d.e(buttonGroup, null, yl1.b.f(buttonGroup.f28013b, this.f63076j, false, null, null, null, null, null, null, 0, null, 1022), null, null, null, RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_DETAILED);
        }
    }

    public final rn1.a f(rn1.a it) {
        switch (this.f63075i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, this.f63076j, null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            case 4:
                Intrinsics.checkNotNullParameter(it, "it");
                g gVar = g.BODY_100;
                g gVar2 = g.BODY_200;
                rn1.b bVar = rn1.b.END;
                return rn1.a.y(it, this.f63076j, null, e0.b(vn1.b.CENTER), null, null, 4, fm1.c.VISIBLE, bVar, null, null, true, 0, null, gVar, gVar2, null, null, false, null, null, 2071322);
            case 7:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, this.f63076j, null, null, null, g.UI_400, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097070);
            case 16:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, this.f63076j, null, null, null, g.BODY_300, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097134);
            case 17:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, this.f63076j, null, null, e0.b(vn1.e.BOLD), g.UI_400, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097126);
            case 19:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, this.f63076j, null, null, null, g.BODY_300, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097134);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, this.f63076j, null, null, e0.b(vn1.e.BOLD), g.UI_400, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097126);
        }
    }

    public final void h(k bind) {
        int i13 = this.f63075i;
        i0 i0Var = this.f63076j;
        switch (i13) {
            case 11:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.g(i0Var);
                break;
            case 12:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.g(i0Var);
                bind.i(fm1.c.VISIBLE);
                bind.b(vn1.c.INVERSE);
                bind.h(g.BODY_300);
                bind.f108897l = z.popover_main_text;
                break;
            case 13:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.g(i0Var);
                bind.b(GestaltStaticSearchBar.f49525q);
                bind.f108895j = null;
                break;
            default:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.g(i0Var);
                bind.c(rn1.b.END);
                bind.f108891f = 2;
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f63075i;
        i0 helperText = this.f63076j;
        switch (i13) {
            case 1:
                yl1.b it = (yl1.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 2:
                i bind = (i) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.e(yn1.f.ERROR);
                Intrinsics.checkNotNullParameter(helperText, "helperText");
                bind.f20086c = helperText;
                break;
            case 10:
                cn1.d state = (cn1.d) obj;
                Intrinsics.checkNotNullParameter(state, "state");
                break;
            case 11:
                h((k) obj);
                break;
            case 12:
                h((k) obj);
                break;
            case 13:
                h((k) obj);
                break;
            case 14:
                h((k) obj);
                break;
            case 15:
                un1.c it2 = (un1.c) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                break;
            case 18:
                j it3 = (j) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                ln1.e eVar = ln1.e.LOADED;
                com.pinterest.qrCodeLogin.d dVar = new com.pinterest.qrCodeLogin.d(helperText);
                it3.getClass();
                break;
        }
        return f((rn1.a) obj);
    }
}
