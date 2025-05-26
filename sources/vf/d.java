package vf;

import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.data.Entry;
import java.util.ArrayList;
import sf.n;

/* loaded from: classes3.dex */
public final class d extends a {
    @Override // vf.a, sp2.i, vf.e
    public final c A(float f13, float f14) {
        ((wf.a) ((wf.b) this.f114928b)).f();
        if (S((float) ((BarLineChartBase) ((wf.b) this.f114928b)).G(n.LEFT).b(f14, f13).f15085c, f14, f13) == null) {
            return null;
        }
        throw null;
    }

    @Override // vf.a, sp2.i
    public final ArrayList H(xf.b bVar, int i13, float f13, tf.d dVar) {
        Entry f14;
        ArrayList arrayList = new ArrayList();
        tf.e eVar = (tf.e) bVar;
        ArrayList<Entry> d2 = eVar.d(f13);
        if (d2.size() == 0 && (f14 = eVar.f(f13, Float.NaN, dVar)) != null) {
            d2 = eVar.d(f14.b());
        }
        if (d2.size() == 0) {
            return arrayList;
        }
        for (Entry entry : d2) {
            ag.c a13 = ((BarLineChartBase) ((wf.a) ((wf.b) this.f114928b))).G(eVar.f117515d).a(entry.a(), entry.b());
            arrayList.add(new c(entry.b(), entry.a(), (float) a13.f15084b, (float) a13.f15085c, i13, eVar.f117515d));
        }
        return arrayList;
    }

    @Override // vf.a, sp2.i
    public final float R(float f13, float f14, float f15, float f16) {
        return Math.abs(f14 - f16);
    }
}
