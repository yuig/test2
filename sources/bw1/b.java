package bw1;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b2;
import androidx.recyclerview.widget.y2;
import bs1.c;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.partnerAnalytics.components.barchartlist.HorizontalBarChartView;
import com.pinterest.partnerAnalytics.g;
import fy1.e;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;

/* loaded from: classes4.dex */
public final class b extends b2 {

    /* renamed from: e, reason: collision with root package name */
    public float f24020e;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f24019d = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public float f24021f = 100.0f;

    @Override // androidx.recyclerview.widget.b2
    public final int e() {
        return this.f24019d.size();
    }

    @Override // androidx.recyclerview.widget.b2
    public final void r(y2 y2Var, int i13) {
        a holder = (a) y2Var;
        Intrinsics.checkNotNullParameter(holder, "holder");
        cw1.a lineBar = (cw1.a) this.f24019d.get(i13);
        float f13 = this.f24021f;
        Intrinsics.checkNotNullParameter(lineBar, "lineBar");
        View view = holder.f19717a;
        HorizontalBarChartView horizontalBarChartView = view instanceof HorizontalBarChartView ? (HorizontalBarChartView) view : null;
        if (horizontalBarChartView != null) {
            String title = lineBar.f53332a;
            Intrinsics.checkNotNullParameter(title, "title");
            a0.p(horizontalBarChartView.f50059c, title);
            horizontalBarChartView.f50057a = holder.f24018u;
            int i14 = (int) f13;
            ProgressBar progressBar = horizontalBarChartView.f50060d;
            progressBar.setMax(i14);
            Resources resources = horizontalBarChartView.getResources();
            int i15 = g.audience_insights_accessibility_progress;
            StringBuilder sb3 = new StringBuilder();
            float f14 = lineBar.f53333b;
            progressBar.setContentDescription(resources.getString(i15, d7.g.i(sb3, f14, " %")));
            float f15 = horizontalBarChartView.f50057a;
            GestaltText gestaltText = horizontalBarChartView.f50061e;
            e eVar = horizontalBarChartView.f50058b;
            if (f14 >= f15) {
                progressBar.setProgress((int) f14);
                a0.p(gestaltText, eVar.G(f14));
                return;
            }
            progressBar.setProgress((int) f15);
            a0.p(gestaltText, "<" + eVar.G(horizontalBarChartView.f50057a));
        }
    }

    @Override // androidx.recyclerview.widget.b2
    public final y2 t(RecyclerView parent, int i13) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        View inflate = LayoutInflater.from(c.k0(context)).inflate(com.pinterest.partnerAnalytics.e.horizontal_line_bar_item, (ViewGroup) parent, false);
        Intrinsics.f(inflate);
        return new a(inflate, this.f24020e);
    }
}
