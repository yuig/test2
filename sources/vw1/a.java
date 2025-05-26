package vw1;

import ag.j;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.Log;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.pinterest.partnerAnalytics.feature.analytics.closeup.analyticsGraph.model.CustomEntry;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import tf.d;
import tf.g;
import tf.i;
import zf.h;

/* loaded from: classes4.dex */
public final class a extends LineChart {
    public final vf.a U;
    public ArrayList V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f30149a = null;
        this.f30150b = true;
        this.f30151c = true;
        this.f30152d = 0.9f;
        this.f30153e = new uf.b(0);
        this.f30157i = true;
        this.f30162n = "No chart data available.";
        this.f30166r = new j();
        this.f30168t = false;
        this.f30170v = 0.0f;
        this.f30171w = true;
        this.f30172x = new ArrayList();
        u();
        this.f30147y = 100;
        this.f30148z = true;
        this.A = true;
        this.B = true;
        this.C = true;
        this.D = true;
        this.E = true;
        this.H = 15.0f;
        this.P = new RectF();
        this.Q = new Matrix();
        new Matrix();
        this.R = ag.c.b(0.0d, 0.0d);
        this.S = ag.c.b(0.0d, 0.0d);
        this.T = new float[2];
        this.U = new vf.a(this);
    }

    public final List J() {
        return (List) this.U.f114929c;
    }

    public final void K(g data) {
        Intrinsics.checkNotNullParameter(data, "data");
        w(data);
        ArrayList arrayList = new ArrayList(data.c());
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.V = arrayList;
        int c13 = data.c();
        for (int i13 = 0; i13 < c13; i13++) {
            ArrayList arrayList2 = this.V;
            if (arrayList2 == null) {
                Intrinsics.r("originalSetsColors");
                throw null;
            }
            arrayList2.add(Integer.valueOf(((i) data.f117511i.get(i13)).c()));
        }
    }

    public final void L(boolean z13) {
        tf.c cVar = this.f30149a;
        if (cVar != null) {
            int i13 = 0;
            if (z13) {
                int c13 = ((g) cVar).c();
                while (i13 < c13) {
                    Object obj = ((g) this.f30149a).f117511i.get(i13);
                    Intrinsics.g(obj, "null cannot be cast to non-null type com.github.mikephil.charting.data.LineDataSet");
                    i iVar = (i) obj;
                    ArrayList arrayList = this.V;
                    if (arrayList == null) {
                        Intrinsics.r("originalSetsColors");
                        throw null;
                    }
                    arrayList.add(Integer.valueOf(((i) ((g) this.f30149a).f117511i.get(i13)).c()));
                    Context context = getContext();
                    int i14 = eo1.b.color_gray_100;
                    Object obj2 = d5.a.f53679a;
                    iVar.i(context.getColor(i14));
                    i13++;
                }
            } else {
                int c14 = ((g) cVar).c();
                while (i13 < c14) {
                    Object obj3 = ((g) this.f30149a).f117511i.get(i13);
                    Intrinsics.g(obj3, "null cannot be cast to non-null type com.github.mikephil.charting.data.LineDataSet");
                    i iVar2 = (i) obj3;
                    ArrayList arrayList2 = this.V;
                    if (arrayList2 == null) {
                        Intrinsics.r("originalSetsColors");
                        throw null;
                    }
                    Object obj4 = arrayList2.get(i13);
                    Intrinsics.checkNotNullExpressionValue(obj4, "get(...)");
                    int intValue = ((Number) obj4).intValue();
                    iVar2.i(Color.rgb(Color.red(intValue), Color.green(intValue), Color.blue(intValue)));
                    i13++;
                }
            }
            v();
        }
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public final void k(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.f30171w && B()) {
            int length = this.f30169u.length;
            for (int i13 = 0; i13 < length; i13++) {
                vf.c cVar = this.f30169u[i13];
                i iVar = (i) ((g) this.f30149a).b(cVar.f125770f);
                tf.c cVar2 = this.f30149a;
                Intrinsics.g(cVar2, "null cannot be cast to non-null type com.github.mikephil.charting.data.LineData");
                Entry e13 = ((g) cVar2).e(this.f30169u[i13]);
                if (e13 == null) {
                    return;
                }
                float g13 = iVar.g(e13.b(), e13.a(), d.CLOSEST);
                float size = iVar.f117526o.size();
                this.f30167s.getClass();
                if (g13 <= size * 1.0f) {
                    float[] fArr = {cVar.f125773i, cVar.f125774j};
                    float f13 = fArr[0];
                    float f14 = fArr[1];
                    j jVar = this.f30166r;
                    if (jVar.c(f13) && jVar.d(f13) && jVar.e(f14)) {
                        CustomEntry customEntry = (CustomEntry) e13;
                        h hVar = this.f30164p;
                        Intrinsics.g(hVar, "null cannot be cast to non-null type com.pinterest.partnerAnalytics.feature.analytics.closeup.graphComponents.CustomLineChartRenderer");
                        ArrayList arrayList = ((c) hVar).f126805r;
                        String str = customEntry.f50117e;
                        if (arrayList.contains(str)) {
                            continue;
                        } else {
                            Paint paint = new Paint();
                            ArrayList arrayList2 = this.V;
                            if (arrayList2 == null) {
                                Intrinsics.r("originalSetsColors");
                                throw null;
                            }
                            Object obj = arrayList2.get(cVar.f125770f);
                            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                            paint.setColor(((Number) obj).intValue());
                            float f15 = (-4) + f14;
                            canvas.drawCircle(f13, f15, 16.0f, paint);
                            Paint paint2 = new Paint();
                            paint2.setStyle(Paint.Style.STROKE);
                            paint2.setStrokeWidth(3.0f);
                            Context context = getContext();
                            int i14 = eo1.b.color_white_0;
                            Object obj2 = d5.a.f53679a;
                            paint2.setColor(context.getColor(i14));
                            canvas.drawCircle(f13, f15, 16.0f, paint2);
                            if (Intrinsics.d(str, "READY") || Intrinsics.d(str, "ESTIMATE")) {
                                String G = this.I.f().G(customEntry.f117501a);
                                float f16 = 12;
                                paint.setTextSize(getContext().getResources().getDisplayMetrics().density * f16);
                                paint2.setTextSize(f16 * getContext().getResources().getDisplayMetrics().density);
                                float f17 = 100;
                                if (((((getWidth() - f13) * f17) / getWidth()) - f17) * (-1) < 20.0f) {
                                    float f18 = f13 + 50;
                                    float f19 = f14 + 8;
                                    canvas.drawText(G, f18, f19, paint2);
                                    canvas.drawText(G, f18, f19, paint);
                                } else {
                                    float f23 = f13 - 100;
                                    float f24 = f14 + 8;
                                    canvas.drawText(G, f23, f24, paint2);
                                    canvas.drawText(G, f23, f24, paint);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public final vf.c o(float f13, float f14) {
        if (this.f30149a != null) {
            return this.U.A(f13, f14);
        }
        Log.e("MPAndroidChart", "Can't select by touch. No data set.");
        return null;
    }
}
