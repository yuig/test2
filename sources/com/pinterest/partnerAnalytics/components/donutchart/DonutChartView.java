package com.pinterest.partnerAnalytics.components.donutchart;

import a.c;
import ag.i;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.PinterestLinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieEntry;
import com.pinterest.gestalt.text.GestaltText;
import dw1.a;
import fy1.d;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import mw1.e;
import org.jetbrains.annotations.NotNull;
import pk.a0;
import sf.n;
import tf.k;
import tf.l;
import tf.m;
import xf.b;
import xk2.v;
import zf.q;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/pinterest/partnerAnalytics/components/donutchart/DonutChartView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "partnerAnalytics_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class DonutChartView extends LinearLayout {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f50062f = 0;

    /* renamed from: a, reason: collision with root package name */
    public final v f50063a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f50064b;

    /* renamed from: c, reason: collision with root package name */
    public final v f50065c;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltText f50066d;

    /* renamed from: e, reason: collision with root package name */
    public final PieChart f50067e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DonutChartView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a(String title, String str, ArrayList entries) {
        b bVar;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(entries, "entries");
        a0.p(this.f50064b, title);
        if (str == null) {
            str = "";
        }
        a0.p(this.f50066d, str);
        ArrayList arrayList = new ArrayList(g0.q(entries, 10));
        Iterator it = entries.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            Double d2 = eVar.f88429b;
            float doubleValue = d2 != null ? (float) d2.doubleValue() : 0.0f;
            Integer valueOf = Integer.valueOf(eVar.f88428a);
            PieEntry pieEntry = new PieEntry(doubleValue);
            pieEntry.f117502b = valueOf;
            pieEntry.f30176c = 0.0f;
            arrayList.add(pieEntry);
        }
        Object obj = null;
        m mVar = new m(arrayList, null);
        mVar.f117539t = 0.0f;
        mVar.f117540u = 18.0f;
        l lVar = l.INSIDE_SLICE;
        mVar.f117541v = lVar;
        mVar.f117542w = lVar;
        mVar.f117543x = -16777216;
        mVar.f117544y = 1.0f;
        mVar.f117545z = 75.0f;
        mVar.A = 0.3f;
        mVar.B = 0.4f;
        mVar.C = true;
        mVar.f117514c = null;
        mVar.f117521j = false;
        ArrayList arrayList2 = new ArrayList(g0.q(entries, 10));
        Iterator it2 = entries.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Integer.valueOf(((e) it2.next()).f88430c));
        }
        mVar.f117512a = arrayList2;
        mVar.f117539t = i.c(2.0f);
        k kVar = new k();
        kVar.f117503a = -3.4028235E38f;
        kVar.f117504b = Float.MAX_VALUE;
        kVar.f117505c = -3.4028235E38f;
        kVar.f117506d = Float.MAX_VALUE;
        kVar.f117507e = -3.4028235E38f;
        kVar.f117508f = Float.MAX_VALUE;
        kVar.f117509g = -3.4028235E38f;
        kVar.f117510h = Float.MAX_VALUE;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(new m[]{mVar}[0]);
        kVar.f117511i = arrayList3;
        kVar.f117503a = -3.4028235E38f;
        kVar.f117504b = Float.MAX_VALUE;
        kVar.f117505c = -3.4028235E38f;
        kVar.f117506d = Float.MAX_VALUE;
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            kVar.a((b) it3.next());
        }
        kVar.f117507e = -3.4028235E38f;
        kVar.f117508f = Float.MAX_VALUE;
        kVar.f117509g = -3.4028235E38f;
        kVar.f117510h = Float.MAX_VALUE;
        Iterator it4 = arrayList3.iterator();
        while (true) {
            if (!it4.hasNext()) {
                bVar = null;
                break;
            } else {
                bVar = (b) it4.next();
                if (((tf.e) bVar).f117515d == n.LEFT) {
                    break;
                }
            }
        }
        if (bVar != null) {
            tf.e eVar2 = (tf.e) bVar;
            kVar.f117507e = eVar2.f117527p;
            kVar.f117508f = eVar2.f117528q;
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                tf.e eVar3 = (tf.e) ((b) it5.next());
                if (eVar3.f117515d == n.LEFT) {
                    float f13 = eVar3.f117528q;
                    if (f13 < kVar.f117508f) {
                        kVar.f117508f = f13;
                    }
                    float f14 = eVar3.f117527p;
                    if (f14 > kVar.f117507e) {
                        kVar.f117507e = f14;
                    }
                }
            }
        }
        Iterator it6 = arrayList3.iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            Object obj2 = (b) it6.next();
            if (((tf.e) obj2).f117515d == n.RIGHT) {
                obj = obj2;
                break;
            }
        }
        if (obj != null) {
            tf.e eVar4 = (tf.e) obj;
            kVar.f117509g = eVar4.f117527p;
            kVar.f117510h = eVar4.f117528q;
            Iterator it7 = arrayList3.iterator();
            while (it7.hasNext()) {
                tf.e eVar5 = (tf.e) ((b) it7.next());
                if (eVar5.f117515d == n.RIGHT) {
                    float f15 = eVar5.f117528q;
                    if (f15 < kVar.f117510h) {
                        kVar.f117510h = f15;
                    }
                    float f16 = eVar5.f117527p;
                    if (f16 > kVar.f117509g) {
                        kVar.f117509g = f16;
                    }
                }
            }
        }
        PieChart pieChart = this.f50067e;
        pieChart.w(kVar);
        pieChart.invalidate();
        ((uw1.e) this.f50065c.getValue()).C(entries, new fy1.e(d.PERCENTAGE, 2), true);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DonutChartView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f50063a = xk2.m.b(a.f56411i);
        v n13 = c.n(context, 11);
        this.f50065c = n13;
        View.inflate(context, com.pinterest.partnerAnalytics.e.donut_chart_view, this);
        View findViewById = findViewById(com.pinterest.partnerAnalytics.d.tvChartTitle);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f50064b = (GestaltText) findViewById;
        View findViewById2 = findViewById(com.pinterest.partnerAnalytics.d.pieChart);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        PieChart pieChart = (PieChart) findViewById2;
        this.f50067e = pieChart;
        View findViewById3 = findViewById(com.pinterest.partnerAnalytics.d.rvLegendList);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        RecyclerView recyclerView = (RecyclerView) findViewById3;
        View findViewById4 = findViewById(com.pinterest.partnerAnalytics.d.tvChartDisclaimer);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f50066d = (GestaltText) findViewById4;
        pieChart.f30150b = false;
        pieChart.C = false;
        Context context2 = getContext();
        int i14 = eo1.b.color_themed_light_gray;
        Object obj = d5.a.f53679a;
        ((q) pieChart.f30164p).f141862g.setColor(context2.getColor(i14));
        ((q) pieChart.f30164p).f141863h.setAlpha(0);
        pieChart.f30159k.f112469a = false;
        pieChart.f30158j.f112474f = "";
        recyclerView.H2((uw1.e) n13.getValue());
        recyclerView.m(new ey1.d(context, new PinterestLinearLayoutManager(new g41.a(this, 15)), (uw1.e) n13.getValue()));
    }
}
