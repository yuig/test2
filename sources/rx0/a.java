package rx0;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l2;
import androidx.recyclerview.widget.o2;
import androidx.recyclerview.widget.y2;
import gg0.p;
import i32.l;
import i32.y0;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m60.u;
import xk2.v;

/* loaded from: classes5.dex */
public final class a extends o2 {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f110177a;

    public a(int i13, sx0.b shouldHavePulsar) {
        Intrinsics.checkNotNullParameter(shouldHavePulsar, "shouldHavePulsar");
        this.f110177a = shouldHavePulsar;
    }

    @Override // androidx.recyclerview.widget.o2
    public final void g(RecyclerView recyclerView, int i13) {
        y2 S0;
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        v vVar = zf0.f.f141903e;
        vb0.e.e().getClass();
        if (zf0.f.f(y0.ANDROID_NOTIFICATIONS_TAKEOVER, new l[]{l.ANDROID_NEWS_HUB_SCROLL_PROMPT})) {
            if (i13 != 0) {
                u.f85943a.d(new gg0.l());
                return;
            }
            ArrayList arrayList = new ArrayList();
            l2 l2Var = recyclerView.f19242n;
            Intrinsics.g(l2Var, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) l2Var;
            int k13 = linearLayoutManager.k1();
            int l13 = linearLayoutManager.l1();
            if (k13 <= l13) {
                while (true) {
                    if (((Boolean) this.f110177a.invoke(Integer.valueOf(k13))).booleanValue() && (S0 = recyclerView.S0(k13)) != null) {
                        View itemView = S0.f19717a;
                        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                    }
                    if (k13 == l13) {
                        break;
                    } else {
                        k13++;
                    }
                }
            }
            u.f85943a.d(new p(arrayList));
        }
    }
}
