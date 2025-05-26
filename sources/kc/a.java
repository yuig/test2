package kc;

import android.graphics.PointF;
import android.view.animation.BaseInterpolator;
import android.view.animation.Interpolator;
import com.airbnb.lottie.h;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final h f79103a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f79104b;

    /* renamed from: c, reason: collision with root package name */
    public Object f79105c;

    /* renamed from: d, reason: collision with root package name */
    public final Interpolator f79106d;

    /* renamed from: e, reason: collision with root package name */
    public final Interpolator f79107e;

    /* renamed from: f, reason: collision with root package name */
    public final Interpolator f79108f;

    /* renamed from: g, reason: collision with root package name */
    public final float f79109g;

    /* renamed from: h, reason: collision with root package name */
    public Float f79110h;

    /* renamed from: i, reason: collision with root package name */
    public float f79111i;

    /* renamed from: j, reason: collision with root package name */
    public float f79112j;

    /* renamed from: k, reason: collision with root package name */
    public int f79113k;

    /* renamed from: l, reason: collision with root package name */
    public int f79114l;

    /* renamed from: m, reason: collision with root package name */
    public float f79115m;

    /* renamed from: n, reason: collision with root package name */
    public float f79116n;

    /* renamed from: o, reason: collision with root package name */
    public PointF f79117o;

    /* renamed from: p, reason: collision with root package name */
    public PointF f79118p;

    public a(h hVar, Object obj, Object obj2, BaseInterpolator baseInterpolator, float f13, Float f14) {
        this.f79111i = -3987645.8f;
        this.f79112j = -3987645.8f;
        this.f79113k = 784923401;
        this.f79114l = 784923401;
        this.f79115m = Float.MIN_VALUE;
        this.f79116n = Float.MIN_VALUE;
        this.f79117o = null;
        this.f79118p = null;
        this.f79103a = hVar;
        this.f79104b = obj;
        this.f79105c = obj2;
        this.f79106d = baseInterpolator;
        this.f79107e = null;
        this.f79108f = null;
        this.f79109g = f13;
        this.f79110h = f14;
    }

    public final float a() {
        h hVar = this.f79103a;
        if (hVar == null) {
            return 1.0f;
        }
        if (this.f79116n == Float.MIN_VALUE) {
            if (this.f79110h == null) {
                this.f79116n = 1.0f;
            } else {
                this.f79116n = ((this.f79110h.floatValue() - this.f79109g) / (hVar.f28408m - hVar.f28407l)) + b();
            }
        }
        return this.f79116n;
    }

    public final float b() {
        h hVar = this.f79103a;
        if (hVar == null) {
            return 0.0f;
        }
        if (this.f79115m == Float.MIN_VALUE) {
            float f13 = hVar.f28407l;
            this.f79115m = (this.f79109g - f13) / (hVar.f28408m - f13);
        }
        return this.f79115m;
    }

    public final boolean c() {
        return this.f79106d == null && this.f79107e == null && this.f79108f == null;
    }

    public final String toString() {
        return "Keyframe{startValue=" + this.f79104b + ", endValue=" + this.f79105c + ", startFrame=" + this.f79109g + ", endFrame=" + this.f79110h + ", interpolator=" + this.f79106d + '}';
    }

    public a(h hVar, Object obj, Object obj2, BaseInterpolator baseInterpolator, BaseInterpolator baseInterpolator2, float f13) {
        this.f79111i = -3987645.8f;
        this.f79112j = -3987645.8f;
        this.f79113k = 784923401;
        this.f79114l = 784923401;
        this.f79115m = Float.MIN_VALUE;
        this.f79116n = Float.MIN_VALUE;
        this.f79117o = null;
        this.f79118p = null;
        this.f79103a = hVar;
        this.f79104b = obj;
        this.f79105c = obj2;
        this.f79106d = null;
        this.f79107e = baseInterpolator;
        this.f79108f = baseInterpolator2;
        this.f79109g = f13;
        this.f79110h = null;
    }

    public a(h hVar, PointF pointF, PointF pointF2, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f13, Float f14) {
        this.f79111i = -3987645.8f;
        this.f79112j = -3987645.8f;
        this.f79113k = 784923401;
        this.f79114l = 784923401;
        this.f79115m = Float.MIN_VALUE;
        this.f79116n = Float.MIN_VALUE;
        this.f79117o = null;
        this.f79118p = null;
        this.f79103a = hVar;
        this.f79104b = pointF;
        this.f79105c = pointF2;
        this.f79106d = interpolator;
        this.f79107e = interpolator2;
        this.f79108f = interpolator3;
        this.f79109g = f13;
        this.f79110h = f14;
    }

    public a(Object obj) {
        this.f79111i = -3987645.8f;
        this.f79112j = -3987645.8f;
        this.f79113k = 784923401;
        this.f79114l = 784923401;
        this.f79115m = Float.MIN_VALUE;
        this.f79116n = Float.MIN_VALUE;
        this.f79117o = null;
        this.f79118p = null;
        this.f79103a = null;
        this.f79104b = obj;
        this.f79105c = obj;
        this.f79106d = null;
        this.f79107e = null;
        this.f79108f = null;
        this.f79109g = Float.MIN_VALUE;
        this.f79110h = Float.valueOf(Float.MAX_VALUE);
    }

    public a(ec.c cVar, ec.c cVar2) {
        this.f79111i = -3987645.8f;
        this.f79112j = -3987645.8f;
        this.f79113k = 784923401;
        this.f79114l = 784923401;
        this.f79115m = Float.MIN_VALUE;
        this.f79116n = Float.MIN_VALUE;
        this.f79117o = null;
        this.f79118p = null;
        this.f79103a = null;
        this.f79104b = cVar;
        this.f79105c = cVar2;
        this.f79106d = null;
        this.f79107e = null;
        this.f79108f = null;
        this.f79109g = Float.MIN_VALUE;
        this.f79110h = Float.valueOf(Float.MAX_VALUE);
    }
}
