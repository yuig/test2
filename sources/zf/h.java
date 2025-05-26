package zf;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import c0.s0;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.charts.Chart;
import com.pinterest.feature.core.view.RecyclerViewTypes;

/* loaded from: classes3.dex */
public abstract class h extends s0 {

    /* renamed from: b, reason: collision with root package name */
    public final org.chromium.net.y f141832b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f141833c;

    /* renamed from: d, reason: collision with root package name */
    public Paint f141834d;

    /* renamed from: e, reason: collision with root package name */
    public final Paint f141835e;

    public h(org.chromium.net.y yVar, ag.j jVar) {
        super(jVar);
        this.f141832b = yVar;
        Paint paint = new Paint(1);
        this.f141833c = paint;
        paint.setStyle(Paint.Style.FILL);
        new Paint(4);
        Paint paint2 = new Paint(1);
        this.f141835e = paint2;
        paint2.setColor(Color.rgb(63, 63, 63));
        paint2.setTextAlign(Paint.Align.CENTER);
        paint2.setTextSize(ag.i.c(9.0f));
        Paint paint3 = new Paint(1);
        this.f141834d = paint3;
        paint3.setStyle(Paint.Style.STROKE);
        this.f141834d.setStrokeWidth(2.0f);
        this.f141834d.setColor(Color.rgb(255, RecyclerViewTypes.VIEW_TYPE_BUBBLE_EDITORIAL_CARD, RecyclerViewTypes.VIEW_TYPE_ANNOUNCEMENT_MODAL_TYPE_ONE));
    }

    public abstract void q(Canvas canvas);

    public abstract void r(Canvas canvas);

    public abstract void s(Canvas canvas, vf.c[] cVarArr);

    public abstract void t(Canvas canvas);

    public abstract void u();

    public boolean v(wf.e eVar) {
        return ((float) ((Chart) eVar).f30149a.d()) < ((float) ((BarLineChartBase) eVar).f30147y) * ((ag.j) this.f24333a).f15122i;
    }
}
