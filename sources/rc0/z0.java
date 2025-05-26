package rc0;

import android.text.Editable;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class z0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f107490i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ gm1.c f107491j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z0(int i13, gm1.c cVar) {
        super(1);
        this.f107490i = i13;
        this.f107491j = cVar;
    }

    public final an1.l b(an1.l it) {
        int i13 = this.f107490i;
        gm1.c cVar = this.f107491j;
        switch (i13) {
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 3:
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 4:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return an1.l.e(it, null, null, null, null, ((an1.p) cVar).f15758c, null, null, RecyclerViewTypes.VIEW_TYPE_ADS_CAROUSEL);
    }

    public final on1.k e(on1.k it) {
        int i13 = this.f107490i;
        gm1.c cVar = this.f107491j;
        switch (i13) {
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return on1.k.e(it, on1.b.e(it.f96740a, cVar instanceof on1.g, false, null, 0, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL), null, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL);
    }

    public final yl1.b f(yl1.b state) {
        int i13 = this.f107490i;
        gm1.c cVar = this.f107491j;
        switch (i13) {
            case 3:
                Intrinsics.checkNotNullParameter(state, "state");
                Editable editable = ((xn1.a) cVar).f135436c;
                return yl1.b.f(state, null, !(editable == null || kotlin.text.z.j(editable)), null, null, null, null, null, null, 0, null, 1021);
            case 8:
                Intrinsics.checkNotNullParameter(state, "it");
                return yl1.b.f(state, null, false, d7.b.Z(!((xn1.f) cVar).f135448c), null, null, null, null, null, 0, null, 1019);
            case 9:
                Intrinsics.checkNotNullParameter(state, "it");
                return yl1.b.f(state, null, false, d7.b.Z(!((xn1.f) cVar).f135448c), null, null, null, null, null, 0, null, 1019);
            default:
                Intrinsics.checkNotNullParameter(state, "it");
                return yl1.b.f(state, null, ((xn1.i) cVar).f135454c.length() > 0, null, null, null, null, null, null, 0, null, 1021);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f107490i;
        gm1.c cVar = this.f107491j;
        switch (i13) {
            case 0:
                wm1.k0 bind = (wm1.k0) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                wm1.k endItem = new wm1.k(cVar instanceof on1.g, false, 6);
                bind.getClass();
                Intrinsics.checkNotNullParameter(endItem, "endItem");
                bind.f130313d = endItem;
                break;
            case 5:
                Unit it = (Unit) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                boolean z13 = cVar instanceof on1.g;
                break;
        }
        return f((yl1.b) obj);
    }
}
