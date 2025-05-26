package yf;

import ag.i;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.charts.PieRadarChartBase;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class e extends c {

    /* renamed from: e, reason: collision with root package name */
    public ag.d f138946e;

    /* renamed from: f, reason: collision with root package name */
    public float f138947f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f138948g;

    /* renamed from: h, reason: collision with root package name */
    public long f138949h;

    /* renamed from: i, reason: collision with root package name */
    public float f138950i;

    public final void a(float f13, float f14) {
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        ArrayList arrayList = this.f138948g;
        float E = ((PieRadarChartBase) this.f138943d).E(f13, f14);
        d dVar = new d();
        dVar.f138944a = currentAnimationTimeMillis;
        dVar.f138945b = E;
        arrayList.add(dVar);
        for (int size = arrayList.size(); size - 2 > 0 && currentAnimationTimeMillis - ((d) arrayList.get(0)).f138944a > 1000; size--) {
            arrayList.remove(0);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        b bVar = b.NONE;
        ((PieRadarChartBase) this.f138943d).getClass();
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        b bVar = b.NONE;
        PieRadarChartBase pieRadarChartBase = (PieRadarChartBase) this.f138943d;
        pieRadarChartBase.getClass();
        if (!pieRadarChartBase.f30150b) {
            return false;
        }
        vf.c o13 = pieRadarChartBase.o(motionEvent.getX(), motionEvent.getY());
        Chart chart = this.f138943d;
        if (o13 == null || o13.a(this.f138941b)) {
            chart.s(null);
            this.f138941b = null;
            return true;
        }
        chart.s(o13);
        this.f138941b = o13;
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        float abs;
        if (this.f138942c.onTouchEvent(motionEvent)) {
            return true;
        }
        Chart chart = this.f138943d;
        PieRadarChartBase pieRadarChartBase = (PieRadarChartBase) chart;
        if (pieRadarChartBase.A) {
            float x13 = motionEvent.getX();
            float y13 = motionEvent.getY();
            int action = motionEvent.getAction();
            ArrayList arrayList = this.f138948g;
            ag.d dVar = this.f138946e;
            if (action == 0) {
                this.f138943d.getClass();
                this.f138950i = 0.0f;
                arrayList.clear();
                if (pieRadarChartBase.f30151c) {
                    a(x13, y13);
                }
                this.f138947f = pieRadarChartBase.E(x13, y13) - pieRadarChartBase.f30175z;
                dVar.f15087b = x13;
                dVar.f15088c = y13;
            } else if (action == 1) {
                if (pieRadarChartBase.f30151c) {
                    this.f138950i = 0.0f;
                    a(x13, y13);
                    if (arrayList.isEmpty()) {
                        abs = 0.0f;
                    } else {
                        d dVar2 = (d) arrayList.get(0);
                        d dVar3 = (d) ep.b.h(arrayList, 1);
                        d dVar4 = dVar2;
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            dVar4 = (d) arrayList.get(size);
                            if (dVar4.f138945b != dVar3.f138945b) {
                                break;
                            }
                        }
                        float f13 = (dVar3.f138944a - dVar2.f138944a) / 1000.0f;
                        if (f13 == 0.0f) {
                            f13 = 0.1f;
                        }
                        boolean z13 = dVar3.f138945b >= dVar4.f138945b;
                        if (Math.abs(r7 - r10) > 270.0d) {
                            z13 = !z13;
                        }
                        float f14 = dVar3.f138945b;
                        float f15 = dVar2.f138945b;
                        if (f14 - f15 > 180.0d) {
                            dVar2.f138945b = (float) (f15 + 360.0d);
                        } else if (f15 - f14 > 180.0d) {
                            dVar3.f138945b = (float) (f14 + 360.0d);
                        }
                        abs = Math.abs((dVar3.f138945b - dVar2.f138945b) / f13);
                        if (!z13) {
                            abs = -abs;
                        }
                    }
                    this.f138950i = abs;
                    if (abs != 0.0f) {
                        this.f138949h = AnimationUtils.currentAnimationTimeMillis();
                        DisplayMetrics displayMetrics = i.f15104a;
                        chart.postInvalidateOnAnimation();
                    }
                }
                ViewParent parent = pieRadarChartBase.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(false);
                }
                this.f138940a = 0;
                this.f138943d.getClass();
            } else if (action == 2) {
                if (pieRadarChartBase.f30151c) {
                    a(x13, y13);
                }
                if (this.f138940a == 0) {
                    float f16 = x13 - dVar.f15087b;
                    float f17 = y13 - dVar.f15088c;
                    if (((float) Math.sqrt((f17 * f17) + (f16 * f16))) > i.c(8.0f)) {
                        b bVar = b.NONE;
                        this.f138940a = 6;
                        ViewParent parent2 = pieRadarChartBase.getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f138943d.getClass();
                    }
                }
                if (this.f138940a == 6) {
                    float E = pieRadarChartBase.E(x13, y13) - this.f138947f;
                    pieRadarChartBase.f30175z = E;
                    DisplayMetrics displayMetrics2 = i.f15104a;
                    while (E < 0.0f) {
                        E += 360.0f;
                    }
                    pieRadarChartBase.f30174y = E % 360.0f;
                    pieRadarChartBase.invalidate();
                }
                this.f138943d.getClass();
            }
        }
        return true;
    }
}
