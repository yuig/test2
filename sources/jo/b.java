package jo;

import androidx.appcompat.app.j0;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.charts.PieRadarChartBase;
import com.github.mikephil.charting.charts.RadarChart;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class b extends j0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f77130c;

    public b(String str, z.a aVar, int i13) {
        this.f77130c = i13;
        this.f16056a = str;
        this.f16057b = aVar;
    }

    @Override // androidx.appcompat.app.j0
    public a k(String str) {
        switch (this.f77130c) {
            case 0:
                return new a(str, 0);
            default:
                return new a(str, 1);
        }
    }

    @Override // androidx.appcompat.app.j0
    public vf.c p(float f13, float f14, int i13) {
        switch (this.f77130c) {
            case 0:
                tf.m f15 = ((tf.k) ((PieChart) ((PieRadarChartBase) this.f16056a)).f30149a).f();
                return new vf.c(i13, f15.e(i13).a(), f13, f14, 0, f15.f117515d);
            default:
                ((List) this.f16057b).clear();
                ((RadarChart) ((PieRadarChartBase) this.f16056a)).f30167s.getClass();
                ((RadarChart) ((PieRadarChartBase) this.f16056a)).f30167s.getClass();
                ((RadarChart) ((PieRadarChartBase) this.f16056a)).J();
                throw null;
        }
    }

    public b(PieRadarChartBase pieRadarChartBase, int i13) {
        this.f77130c = i13;
        this.f16057b = new ArrayList();
        this.f16056a = pieRadarChartBase;
    }
}
