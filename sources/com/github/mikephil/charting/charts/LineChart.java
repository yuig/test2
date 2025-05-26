package com.github.mikephil.charting.charts;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.AttributeSet;
import java.lang.ref.WeakReference;
import tf.g;
import zf.h;
import zf.n;

/* loaded from: classes3.dex */
public class LineChart extends BarLineChartBase<g> implements wf.g {
    public LineChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // wf.g
    public final g e() {
        return (g) this.f30149a;
    }

    @Override // com.github.mikephil.charting.charts.Chart, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        h hVar = this.f30164p;
        if (hVar != null && (hVar instanceof n)) {
            n nVar = (n) hVar;
            Canvas canvas = nVar.f141854k;
            if (canvas != null) {
                canvas.setBitmap(null);
                nVar.f141854k = null;
            }
            WeakReference weakReference = nVar.f141853j;
            if (weakReference != null) {
                Bitmap bitmap = (Bitmap) weakReference.get();
                if (bitmap != null) {
                    bitmap.recycle();
                }
                nVar.f141853j.clear();
                nVar.f141853j = null;
            }
        }
        super.onDetachedFromWindow();
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    public final void u() {
        super.u();
        this.f30164p = new n(this, this.f30167s, this.f30166r);
    }

    public LineChart(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
    }
}
