package vs0;

import android.os.Handler;
import h32.u0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.p;
import qz.f0;
import yk1.v;
import yq0.t;

/* loaded from: classes5.dex */
public final /* synthetic */ class d extends p implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ts0.b bVar;
        Pair pair;
        int intValue = ((Number) obj).intValue();
        f fVar = (f) this.receiver;
        fVar.getClass();
        ts0.b.Companion.getClass();
        ts0.b[] values = ts0.b.values();
        int length = values.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                bVar = null;
                break;
            }
            bVar = values[i13];
            if (bVar.ordinal() == intValue) {
                break;
            }
            i13++;
        }
        if (bVar == null) {
            bVar = ts0.b.All;
        }
        if (bVar != fVar.f126547c) {
            fVar.f126547c = bVar;
            int i14 = c.f126543a[bVar.ordinal()];
            xk1.e eVar = fVar.f126550f;
            v vVar = fVar.f126545a;
            if (i14 == 1) {
                fVar.v3(u0.HOME_FEED_CONTROL_PANEL_ACTIVITY_TAB_FILTER_TYPE_DROPDOWN_OPTION_ALL);
                eVar.t();
                yk1.a aVar = (yk1.a) vVar;
                pair = new Pair(aVar.f139224a.getString(xp1.d.homefeed_tuner_filter_title_selection_all), aVar.f139224a.getString(xp1.d.homefeed_tuner_filter_subtitle_selection_all));
            } else if (i14 == 2) {
                fVar.v3(u0.HOME_FEED_CONTROL_PANEL_ACTIVITY_TAB_FILTER_TYPE_DROPDOWN_OPTION_SAVED);
                eVar.y();
                yk1.a aVar2 = (yk1.a) vVar;
                pair = new Pair(aVar2.f139224a.getString(xp1.d.homefeed_tuner_filter_title_selection_saved), aVar2.f139224a.getString(xp1.d.homefeed_tuner_filter_subtitle_selection_all));
            } else {
                if (i14 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                fVar.v3(u0.HOME_FEED_CONTROL_PANEL_ACTIVITY_TAB_FILTER_TYPE_DROPDOWN_OPTION_VIEWED);
                eVar.t();
                yk1.a aVar3 = (yk1.a) vVar;
                pair = new Pair(aVar3.f139224a.getString(xp1.d.homefeed_tuner_filter_title_selection_viewed), aVar3.f139224a.getString(xp1.d.homefeed_tuner_filter_subtitle_selection_all));
            }
            String str = (String) pair.f80346a;
            String str2 = (String) pair.f80347b;
            if (fVar.isBound()) {
                String filterParam = bVar.getFilterParam();
                ss0.c cVar = fVar.f126549e;
                if (filterParam == null) {
                    f0 f0Var = cVar.f49121k;
                    if (f0Var != null) {
                        f0Var.h("filter_type");
                    }
                } else {
                    f0 f0Var2 = cVar.f49121k;
                    if (f0Var2 != null) {
                        f0Var2.e("filter_type", filterParam);
                    }
                }
                if (fVar.isBound()) {
                    ((t) ((rs0.b) fVar.getView())).resetRecyclerScrollListener();
                    cVar.Z();
                    ((Handler) fVar.f126548d.getValue()).post(new b(fVar, 0));
                }
            }
            ((rs0.b) fVar.getView()).O3(str);
            ((rs0.b) fVar.getView()).M4(str2);
        }
        ((rs0.b) fVar.getView()).x2();
        return Unit.f80348a;
    }
}
