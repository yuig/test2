package vf;

import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import sf.n;
import sp2.i;
import wf.g;

/* loaded from: classes3.dex */
public class a extends i {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f125764d = 1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(LineChart chart) {
        super(chart);
        Intrinsics.checkNotNullParameter(chart, "chart");
    }

    @Override // sp2.i, vf.e
    public c A(float f13, float f14) {
        switch (this.f125764d) {
            case 0:
                if (super.A(f13, f14) == null) {
                    return null;
                }
                ((BarLineChartBase) ((wf.b) this.f114928b)).G(n.LEFT).b(f13, f14);
                ((wf.a) ((wf.b) this.f114928b)).f();
                throw null;
            default:
                return super.A(f13, f14);
        }
    }

    @Override // sp2.i
    public ArrayList H(xf.b set, int i13, float f13, tf.d dVar) {
        Entry f14;
        switch (this.f125764d) {
            case 1:
                Intrinsics.checkNotNullParameter(set, "set");
                ArrayList arrayList = new ArrayList();
                tf.e eVar = (tf.e) set;
                ArrayList<Entry> d2 = eVar.d(f13);
                if (d2.size() == 0 && (f14 = eVar.f(f13, Float.NaN, dVar)) != null) {
                    d2 = eVar.d(f14.b());
                }
                if (d2.size() == 0) {
                    this.f114929c = arrayList;
                } else {
                    for (Entry entry : d2) {
                        ag.c a13 = ((BarLineChartBase) ((g) ((wf.b) this.f114928b))).G(eVar.f117515d).a(entry.b(), entry.a());
                        arrayList.add(new c(entry.b(), entry.a(), (float) a13.f15084b, (float) a13.f15085c, i13, eVar.f117515d));
                    }
                    ((List) this.f114929c).addAll(arrayList);
                }
                return arrayList;
            default:
                return super.H(set, i13, f13, dVar);
        }
    }

    @Override // sp2.i
    public final tf.a Q() {
        switch (this.f125764d) {
            case 0:
                ((wf.a) ((wf.b) this.f114928b)).f();
                return null;
            default:
                return super.Q();
        }
    }

    @Override // sp2.i
    public float R(float f13, float f14, float f15, float f16) {
        switch (this.f125764d) {
            case 0:
                return Math.abs(f13 - f15);
            default:
                return super.R(f13, f14, f15, f16);
        }
    }

    public a(wf.a aVar) {
        super(aVar);
    }
}
