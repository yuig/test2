package o80;

import android.widget.ImageView;

/* loaded from: classes5.dex */
public final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final float f93486a;

    /* renamed from: b, reason: collision with root package name */
    public final float f93487b;

    /* renamed from: c, reason: collision with root package name */
    public final float f93488c;

    /* renamed from: d, reason: collision with root package name */
    public final float f93489d;

    /* renamed from: e, reason: collision with root package name */
    public final long f93490e = System.currentTimeMillis();

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j f93491f;

    public e(j jVar, float f13, float f14, float f15, float f16) {
        this.f93491f = jVar;
        this.f93486a = f13;
        this.f93487b = f14;
        this.f93488c = f15;
        this.f93489d = f16;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j jVar = this.f93491f;
        ImageView h10 = jVar.h();
        if (h10 != null) {
            float interpolation = jVar.U.getInterpolation(Math.min(1.0f, ((System.currentTimeMillis() - this.f93490e) * 1.0f) / 500.0f));
            float f13 = this.f93487b;
            float f14 = this.f93486a;
            jVar.k(ep.b.a(f13, f14, interpolation, f14) / jVar.e(), this.f93488c, this.f93489d);
            if (interpolation < 1.0f) {
                h10.postOnAnimation(this);
            }
        }
    }
}
