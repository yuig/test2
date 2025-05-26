package com.github.mikephil.charting.charts;

import ag.d;
import ag.i;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import com.github.mikephil.charting.data.Entry;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.partnerAnalytics.feature.analytics.closeup.analyticsGraph.model.CustomEntry;
import h32.f1;
import h32.g0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import org.chromium.net.y;
import ow1.g;
import sf.f;
import sf.j;
import sf.l;
import sf.m;
import tf.c;
import uf.b;
import uw1.a;
import wf.e;
import zf.h;
import zf.k;

/* loaded from: classes3.dex */
public abstract class Chart<T extends c> extends ViewGroup implements e {

    /* renamed from: a, reason: collision with root package name */
    public c f30149a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f30150b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f30151c;

    /* renamed from: d, reason: collision with root package name */
    public float f30152d;

    /* renamed from: e, reason: collision with root package name */
    public b f30153e;

    /* renamed from: f, reason: collision with root package name */
    public Paint f30154f;

    /* renamed from: g, reason: collision with root package name */
    public Paint f30155g;

    /* renamed from: h, reason: collision with root package name */
    public m f30156h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f30157i;

    /* renamed from: j, reason: collision with root package name */
    public sf.c f30158j;

    /* renamed from: k, reason: collision with root package name */
    public j f30159k;

    /* renamed from: l, reason: collision with root package name */
    public ow1.b f30160l;

    /* renamed from: m, reason: collision with root package name */
    public yf.c f30161m;

    /* renamed from: n, reason: collision with root package name */
    public String f30162n;

    /* renamed from: o, reason: collision with root package name */
    public k f30163o;

    /* renamed from: p, reason: collision with root package name */
    public h f30164p;

    /* renamed from: q, reason: collision with root package name */
    public vf.e f30165q;

    /* renamed from: r, reason: collision with root package name */
    public ag.j f30166r;

    /* renamed from: s, reason: collision with root package name */
    public y f30167s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f30168t;

    /* renamed from: u, reason: collision with root package name */
    public vf.c[] f30169u;

    /* renamed from: v, reason: collision with root package name */
    public float f30170v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f30171w;

    /* renamed from: x, reason: collision with root package name */
    public ArrayList f30172x;

    public Chart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f30149a = null;
        this.f30150b = true;
        this.f30151c = true;
        this.f30152d = 0.9f;
        this.f30153e = new b(0);
        this.f30157i = true;
        this.f30162n = "No chart data available.";
        this.f30166r = new ag.j();
        this.f30168t = false;
        this.f30170v = 0.0f;
        this.f30171w = true;
        this.f30172x = new ArrayList();
        u();
    }

    public final void A(vw1.c cVar) {
        this.f30164p = cVar;
    }

    public final boolean B() {
        vf.c[] cVarArr = this.f30169u;
        return (cVarArr == null || cVarArr.length <= 0 || cVarArr[0] == null) ? false : true;
    }

    public abstract void h();

    public final void i() {
        this.f30149a = null;
        this.f30168t = false;
        this.f30169u = null;
        this.f30161m.f138941b = null;
        invalidate();
    }

    public final void j(Canvas canvas) {
        sf.c cVar = this.f30158j;
        if (cVar == null || !cVar.f112469a) {
            return;
        }
        Paint paint = this.f30154f;
        cVar.getClass();
        paint.setTypeface(null);
        this.f30154f.setTextSize(this.f30158j.f112472d);
        this.f30154f.setColor(this.f30158j.f112473e);
        this.f30154f.setTextAlign(this.f30158j.f112475g);
        float width = getWidth();
        ag.j jVar = this.f30166r;
        float f13 = (width - (jVar.f15116c - jVar.f15115b.right)) - this.f30158j.f112470b;
        float height = getHeight() - this.f30166r.f();
        sf.c cVar2 = this.f30158j;
        canvas.drawText(cVar2.f112474f, f13, height - cVar2.f112471c, this.f30154f);
    }

    public void k(Canvas canvas) {
    }

    public final y l() {
        return this.f30167s;
    }

    public final d m() {
        RectF rectF = this.f30166r.f15115b;
        return d.b(rectF.centerX(), rectF.centerY());
    }

    public final sf.c n() {
        return this.f30158j;
    }

    public vf.c o(float f13, float f14) {
        if (this.f30149a != null) {
            return this.f30165q.A(f13, f14);
        }
        Log.e("MPAndroidChart", "Can't select by touch. No data set.");
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f30149a == null) {
            if (!TextUtils.isEmpty(this.f30162n)) {
                d b13 = d.b(getWidth() / 2.0f, getHeight() / 2.0f);
                canvas.drawText(this.f30162n, b13.f15087b, b13.f15088c, this.f30155g);
                return;
            }
            return;
        }
        if (this.f30168t) {
            return;
        }
        h();
        this.f30168t = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        for (int i17 = 0; i17 < getChildCount(); i17++) {
            getChildAt(i17).layout(i13, i14, i15, i16);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i13, int i14) {
        super.onMeasure(i13, i14);
        int c13 = (int) i.c(50.0f);
        setMeasuredDimension(Math.max(getSuggestedMinimumWidth(), View.resolveSize(c13, i13)), Math.max(getSuggestedMinimumHeight(), View.resolveSize(c13, i14)));
    }

    @Override // android.view.View
    public void onSizeChanged(int i13, int i14, int i15, int i16) {
        if (i13 > 0 && i14 > 0 && i13 < 10000 && i14 < 10000) {
            ag.j jVar = this.f30166r;
            RectF rectF = jVar.f15115b;
            float f13 = rectF.left;
            float f14 = rectF.top;
            float f15 = jVar.f15116c - rectF.right;
            float f16 = jVar.f();
            jVar.f15117d = i14;
            jVar.f15116c = i13;
            jVar.h(f13, f14, f15, f16);
        }
        v();
        ArrayList arrayList = this.f30172x;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            post((Runnable) it.next());
        }
        arrayList.clear();
        super.onSizeChanged(i13, i14, i15, i16);
    }

    public final j p() {
        return this.f30159k;
    }

    public final ag.j q() {
        return this.f30166r;
    }

    public m r() {
        return this.f30156h;
    }

    public final void s(vf.c cVar) {
        Entry e13;
        vf.c cVar2;
        if (cVar == null) {
            this.f30169u = null;
            e13 = null;
        } else {
            e13 = this.f30149a.e(cVar);
            if (e13 == null) {
                this.f30169u = null;
            } else {
                this.f30169u = new vf.c[]{cVar};
            }
        }
        vf.c[] cVarArr = this.f30169u;
        if (cVarArr == null || cVarArr.length <= 0 || (cVar2 = cVarArr[0]) == null) {
            this.f30161m.f138941b = null;
        } else {
            this.f30161m.f138941b = cVar2;
        }
        if (this.f30160l != null) {
            if (B()) {
                g gVar = this.f30160l.f97932a;
                d0.B(gVar.s7(), f1.HOVER, g0.ANALYTICS_TIMESERIES_GRAPH, null, null, 28);
                if (e13 != null) {
                    CustomEntry hoveredPoint = (CustomEntry) e13;
                    List<mw1.e> t33 = ((ow1.j) gVar.f8()).t3();
                    ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(t33, 10));
                    for (mw1.e eVar : t33) {
                        int i13 = eVar.f88428a;
                        a f83 = gVar.f8();
                        String label = String.valueOf(eVar.f88428a);
                        Intrinsics.checkNotNullParameter(label, "label");
                        Intrinsics.checkNotNullParameter(hoveredPoint, "hoveredPoint");
                        ArrayList arrayList2 = ((ow1.j) f83).f97970k.f117511i;
                        int i14 = 0;
                        while (true) {
                            if (i14 >= arrayList2.size()) {
                                i14 = -1;
                                break;
                            } else if (label.equalsIgnoreCase(((tf.e) ((xf.b) arrayList2.get(i14))).f117514c)) {
                                break;
                            } else {
                                i14++;
                            }
                        }
                        ArrayList d2 = ((tf.i) ((i14 < 0 || i14 >= arrayList2.size()) ? null : (xf.b) arrayList2.get(i14))).d(hoveredPoint.f30176c);
                        Intrinsics.checkNotNullExpressionValue(d2, "getEntriesForXValue(...)");
                        Intrinsics.checkNotNullParameter(d2, "<this>");
                        Entry entry = (Entry) CollectionsKt.S(d2);
                        String str = hoveredPoint.f50117e;
                        arrayList.add(new mw1.e(i13, (Intrinsics.d(str, "READY") || Intrinsics.d(str, "ESTIMATE")) ? Double.valueOf(entry.a()) : null, eVar.f88430c, eVar.f88431d, eVar.f88432e));
                    }
                    gVar.l8(arrayList, e13);
                    gVar.k8();
                }
            } else {
                g gVar2 = this.f30160l.f97932a;
                gVar2.l8(((ow1.j) gVar2.f8()).t3(), null);
                gVar2.b8();
            }
        }
        invalidate();
    }

    public final void t(vf.c[] cVarArr) {
        vf.c cVar;
        this.f30169u = cVarArr;
        if (cVarArr == null || cVarArr.length <= 0 || (cVar = cVarArr[0]) == null) {
            this.f30161m.f138941b = null;
        } else {
            this.f30161m.f138941b = cVar;
        }
        invalidate();
    }

    public void u() {
        setWillNotDraw(false);
        this.f30167s = new y();
        Context context = getContext();
        DisplayMetrics displayMetrics = i.f15104a;
        if (context == null) {
            i.f15105b = ViewConfiguration.getMinimumFlingVelocity();
            i.f15106c = ViewConfiguration.getMaximumFlingVelocity();
            Log.e("MPChartLib-Utils", "Utils.init(...) PROVIDED CONTEXT OBJECT IS NULL");
        } else {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            i.f15105b = viewConfiguration.getScaledMinimumFlingVelocity();
            i.f15106c = viewConfiguration.getScaledMaximumFlingVelocity();
            i.f15104a = context.getResources().getDisplayMetrics();
        }
        this.f30170v = i.c(500.0f);
        sf.c cVar = new sf.c();
        cVar.f112474f = "Description Label";
        cVar.f112475g = Paint.Align.RIGHT;
        cVar.f112472d = i.c(8.0f);
        this.f30158j = cVar;
        j jVar = new j();
        jVar.f112477f = new sf.k[0];
        jVar.f112478g = sf.g.LEFT;
        jVar.f112479h = sf.i.BOTTOM;
        jVar.f112480i = sf.h.HORIZONTAL;
        jVar.f112481j = sf.e.LEFT_TO_RIGHT;
        jVar.f112482k = f.SQUARE;
        jVar.f112483l = 8.0f;
        jVar.f112484m = 3.0f;
        jVar.f112485n = 6.0f;
        jVar.f112486o = 5.0f;
        jVar.f112487p = 3.0f;
        jVar.f112488q = 0.95f;
        jVar.f112489r = 0.0f;
        jVar.f112490s = 0.0f;
        jVar.f112491t = 0.0f;
        jVar.f112492u = new ArrayList(16);
        jVar.f112493v = new ArrayList(16);
        jVar.f112494w = new ArrayList(16);
        jVar.f112472d = i.c(10.0f);
        jVar.f112470b = i.c(5.0f);
        jVar.f112471c = i.c(3.0f);
        this.f30159k = jVar;
        k kVar = new k(this.f30166r);
        kVar.f141843e = new ArrayList(16);
        kVar.f141844f = new Paint.FontMetrics();
        kVar.f141845g = new Path();
        kVar.f141842d = jVar;
        Paint paint = new Paint(1);
        kVar.f141840b = paint;
        paint.setTextSize(i.c(9.0f));
        paint.setTextAlign(Paint.Align.LEFT);
        Paint paint2 = new Paint(1);
        kVar.f141841c = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f30163o = kVar;
        m mVar = new m();
        mVar.B = 1;
        mVar.C = 1;
        mVar.D = l.TOP;
        mVar.f112471c = i.c(4.0f);
        this.f30156h = mVar;
        this.f30154f = new Paint(1);
        Paint paint3 = new Paint(1);
        this.f30155g = paint3;
        paint3.setColor(Color.rgb(RecyclerViewTypes.VIEW_TYPE_PEAR_INSIGHT_HEADER, RecyclerViewTypes.VIEW_TYPE_BUBBLE_IMAGE_WITH_TITLE_OVERLAY, 51));
        this.f30155g.setTextAlign(Paint.Align.CENTER);
        this.f30155g.setTextSize(i.c(12.0f));
    }

    public abstract void v();

    public final void w(c cVar) {
        this.f30149a = cVar;
        this.f30168t = false;
        if (cVar == null) {
            return;
        }
        float f13 = cVar.f117504b;
        float f14 = cVar.f117503a;
        float f15 = i.f(cVar.d() < 2 ? Math.max(Math.abs(f13), Math.abs(f14)) : Math.abs(f14 - f13));
        int ceil = Float.isInfinite(f15) ? 0 : ((int) Math.ceil(-Math.log10(f15))) + 2;
        b bVar = this.f30153e;
        bVar.t0(ceil);
        Iterator it = this.f30149a.f117511i.iterator();
        while (it.hasNext()) {
            tf.e eVar = (tf.e) ((xf.b) it.next());
            Object obj = eVar.f117517f;
            if (obj != null) {
                if (obj == null) {
                    obj = i.f15111h;
                }
                if (obj == bVar) {
                }
            }
            eVar.f117517f = bVar;
        }
        v();
    }

    public final void x() {
        this.f30171w = true;
    }

    public final void y() {
        this.f30162n = "";
    }

    public final void z(ow1.b bVar) {
        this.f30160l = bVar;
    }

    public Chart(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f30149a = null;
        this.f30150b = true;
        this.f30151c = true;
        this.f30152d = 0.9f;
        this.f30153e = new b(0);
        this.f30157i = true;
        this.f30162n = "No chart data available.";
        this.f30166r = new ag.j();
        this.f30168t = false;
        this.f30170v = 0.0f;
        this.f30171w = true;
        this.f30172x = new ArrayList();
        u();
    }
}
