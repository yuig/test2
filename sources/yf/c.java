package yf;

import android.view.GestureDetector;
import android.view.View;
import com.github.mikephil.charting.charts.Chart;

/* loaded from: classes3.dex */
public abstract class c extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public int f138940a;

    /* renamed from: b, reason: collision with root package name */
    public vf.c f138941b;

    /* renamed from: c, reason: collision with root package name */
    public final GestureDetector f138942c;

    /* renamed from: d, reason: collision with root package name */
    public final Chart f138943d;

    public c(Chart chart) {
        b bVar = b.NONE;
        this.f138940a = 0;
        this.f138943d = chart;
        this.f138942c = new GestureDetector(chart.getContext(), this);
    }
}
