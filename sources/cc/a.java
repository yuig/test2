package cc;

import android.graphics.PointF;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final PointF f27408a;

    /* renamed from: b, reason: collision with root package name */
    public final PointF f27409b;

    /* renamed from: c, reason: collision with root package name */
    public final PointF f27410c;

    public a() {
        this.f27408a = new PointF();
        this.f27409b = new PointF();
        this.f27410c = new PointF();
    }

    public final String toString() {
        PointF pointF = this.f27410c;
        Float valueOf = Float.valueOf(pointF.x);
        Float valueOf2 = Float.valueOf(pointF.y);
        PointF pointF2 = this.f27408a;
        Float valueOf3 = Float.valueOf(pointF2.x);
        Float valueOf4 = Float.valueOf(pointF2.y);
        PointF pointF3 = this.f27409b;
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", valueOf, valueOf2, valueOf3, valueOf4, Float.valueOf(pointF3.x), Float.valueOf(pointF3.y));
    }

    public a(PointF pointF, PointF pointF2, PointF pointF3) {
        this.f27408a = pointF;
        this.f27409b = pointF2;
        this.f27410c = pointF3;
    }
}
