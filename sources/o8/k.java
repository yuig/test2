package o8;

import android.content.Context;
import android.graphics.PointF;
import android.opengl.Matrix;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes3.dex */
public final class k extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, c {

    /* renamed from: c, reason: collision with root package name */
    public final j f93471c;

    /* renamed from: e, reason: collision with root package name */
    public final GestureDetector f93473e;

    /* renamed from: a, reason: collision with root package name */
    public final PointF f93469a = new PointF();

    /* renamed from: b, reason: collision with root package name */
    public final PointF f93470b = new PointF();

    /* renamed from: d, reason: collision with root package name */
    public final float f93472d = 25.0f;

    /* renamed from: f, reason: collision with root package name */
    public volatile float f93474f = 3.1415927f;

    public k(Context context, j jVar) {
        this.f93471c = jVar;
        this.f93473e = new GestureDetector(context, this);
    }

    @Override // o8.c
    public final void a(float f13, float[] fArr) {
        this.f93474f = -f13;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.f93469a.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f13, float f14) {
        float x13 = (motionEvent2.getX() - this.f93469a.x) / this.f93472d;
        float y13 = motionEvent2.getY();
        PointF pointF = this.f93469a;
        float f15 = (y13 - pointF.y) / this.f93472d;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d2 = this.f93474f;
        float cos = (float) Math.cos(d2);
        float sin = (float) Math.sin(d2);
        PointF pointF2 = this.f93470b;
        pointF2.x -= (cos * x13) - (sin * f15);
        float f16 = (cos * f15) + (sin * x13) + pointF2.y;
        pointF2.y = f16;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f16));
        j jVar = this.f93471c;
        PointF pointF3 = this.f93470b;
        synchronized (jVar) {
            float f17 = pointF3.y;
            jVar.f93464g = f17;
            Matrix.setRotateM(jVar.f93462e, 0, -f17, (float) Math.cos(jVar.f93465h), (float) Math.sin(jVar.f93465h), 0.0f);
            Matrix.setRotateM(jVar.f93463f, 0, -pointF3.x, 0.0f, 1.0f, 0.0f);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.f93471c.f93468k.performClick();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f93473e.onTouchEvent(motionEvent);
    }
}
