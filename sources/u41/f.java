package u41;

import bm1.m;
import bm1.o;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import i2.f2;
import i2.s;
import j41.i;
import kotlin.jvm.internal.Intrinsics;
import u2.n;
import u2.q;

/* loaded from: classes5.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final e f120485a = new e(new m(o.SMALL, null, new bm1.b(null, null, false), false, null, 0, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL_FULL_SPAN));

    public static final void a(e state, q qVar, i2.o oVar, int i13, int i14) {
        Intrinsics.checkNotNullParameter(state, "state");
        s sVar = (s) oVar;
        sVar.Y(-929583107);
        if ((i14 & 2) != 0) {
            qVar = n.f120041b;
        }
        kg.o.a(state.f120483a, qVar, new i(state, 2), sVar, (i13 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) | 8, 0);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new v31.d(state, qVar, i13, i14, 1);
        }
    }

    public static e b(String str, rm1.q qVar, boolean z13, int i13) {
        if ((i13 & 2) != 0) {
            qVar = null;
        }
        if ((i13 & 4) != 0) {
            z13 = false;
        }
        return new e(new m(o.SMALL, null, new bm1.b(bs1.c.h2(str), qVar, z13), false, null, 0, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL_FULL_SPAN));
    }
}
