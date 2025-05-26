package com.github.mikephil.charting.charts;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import rf.b;
import tf.c;
import tf.g;
import wf.f;

/* loaded from: classes3.dex */
public class CombinedChart extends BarLineChartBase<Object> implements f {
    public boolean U;
    public b[] V;

    public CombinedChart(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.U = false;
    }

    @Override // wf.c
    public final void a() {
        c cVar = this.f30149a;
        if (cVar == null) {
            return;
        }
        pk2.f.q(cVar);
        throw null;
    }

    @Override // wf.h
    public final void b() {
        c cVar = this.f30149a;
        if (cVar == null) {
            return;
        }
        pk2.f.q(cVar);
        throw null;
    }

    @Override // wf.g
    public final g e() {
        c cVar = this.f30149a;
        if (cVar == null) {
            return null;
        }
        pk2.f.q(cVar);
        throw null;
    }

    @Override // wf.a
    public final void f() {
        c cVar = this.f30149a;
        if (cVar == null) {
            return;
        }
        pk2.f.q(cVar);
        throw null;
    }

    @Override // wf.d
    public final void g() {
        c cVar = this.f30149a;
        if (cVar == null) {
            return;
        }
        pk2.f.q(cVar);
        throw null;
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public final void k(Canvas canvas) {
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public final vf.c o(float f13, float f14) {
        if (this.f30149a == null) {
            Log.e("MPAndroidChart", "Can't select by touch. No data set.");
            return null;
        }
        vf.c A = this.f30165q.A(f13, f14);
        return (A == null || !this.U) ? A : new vf.c(A.f125765a, A.f125766b, A.f125767c, A.f125768d, A.f125770f, A.f125772h, 0);
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, com.github.mikephil.charting.charts.Chart
    public final void u() {
        super.u();
        this.V = new b[]{b.BAR, b.BUBBLE, b.LINE, b.CANDLE, b.SCATTER};
        vf.b bVar = new vf.b(this);
        f();
        this.f30165q = bVar;
        this.U = true;
        zf.g gVar = new zf.g(this.f30167s, this.f30166r);
        ArrayList arrayList = new ArrayList(5);
        gVar.f141829f = arrayList;
        gVar.f141831h = new ArrayList();
        WeakReference weakReference = new WeakReference(this);
        gVar.f141830g = weakReference;
        arrayList.clear();
        CombinedChart combinedChart = (CombinedChart) weakReference.get();
        if (combinedChart != null) {
            for (b bVar2 : combinedChart.V) {
                int i13 = zf.f.f141828a[bVar2.ordinal()];
                if (i13 == 1) {
                    combinedChart.f();
                } else if (i13 == 2) {
                    combinedChart.a();
                } else if (i13 == 3) {
                    combinedChart.e();
                } else if (i13 == 4) {
                    combinedChart.g();
                } else if (i13 == 5) {
                    combinedChart.b();
                }
            }
        }
        this.f30164p = gVar;
    }

    public CombinedChart(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.U = false;
    }
}
