package o80;

import android.content.Context;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.widget.ImageView;
import android.widget.OverScroller;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public int f93476a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f93477b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final ScaleGestureDetector f93478c;

    /* renamed from: d, reason: collision with root package name */
    public VelocityTracker f93479d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f93480e;

    /* renamed from: f, reason: collision with root package name */
    public float f93481f;

    /* renamed from: g, reason: collision with root package name */
    public float f93482g;

    /* renamed from: h, reason: collision with root package name */
    public final float f93483h;

    /* renamed from: i, reason: collision with root package name */
    public final float f93484i;

    /* renamed from: j, reason: collision with root package name */
    public final j f93485j;

    public b(Context context, j jVar) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f93484i = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f93483h = viewConfiguration.getScaledTouchSlop();
        this.f93485j = jVar;
        this.f93478c = new ScaleGestureDetector(context, new a(this));
    }

    public final void a(MotionEvent motionEvent) {
        float x13;
        float y13;
        int i13;
        float x14;
        float y14;
        ImageView h10;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        float x15;
        float y15;
        int action = motionEvent.getAction();
        int i19 = action & 255;
        if (i19 != 0) {
            j jVar = this.f93485j;
            if (i19 == 1) {
                this.f93476a = -1;
                if (this.f93480e && this.f93479d != null) {
                    try {
                        x14 = motionEvent.getX(this.f93477b);
                    } catch (Exception unused) {
                        x14 = motionEvent.getX();
                    }
                    this.f93481f = x14;
                    try {
                        y14 = motionEvent.getY(this.f93477b);
                    } catch (Exception unused2) {
                        y14 = motionEvent.getY();
                    }
                    this.f93482g = y14;
                    this.f93479d.addMovement(motionEvent);
                    this.f93479d.computeCurrentVelocity(1000);
                    float xVelocity = this.f93479d.getXVelocity();
                    float yVelocity = this.f93479d.getYVelocity();
                    if (Math.max(Math.abs(xVelocity), Math.abs(yVelocity)) >= this.f93484i) {
                        float f13 = -xVelocity;
                        float f14 = -yVelocity;
                        if (!jVar.f93503j && (h10 = jVar.h()) != null) {
                            Context context = h10.getContext();
                            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                            s.h hVar = new s.h(context, jVar);
                            int i23 = j.i(h10);
                            int i24 = (int) jVar.f93498e;
                            int i25 = (int) f13;
                            int i26 = (int) f14;
                            jVar.b();
                            RectF f15 = jVar.f(jVar.g());
                            if (f15 != null) {
                                int round = Math.round(-f15.left);
                                int round2 = Math.round(-f15.top);
                                if (jVar.O) {
                                    if (f15.height() < jVar.C - jVar.B) {
                                        jVar.B = jVar.I;
                                        jVar.C = jVar.f93493J;
                                    }
                                    int round3 = Math.round(-jVar.D);
                                    int round4 = Math.round(-jVar.B);
                                    float f16 = jVar.E - jVar.D;
                                    float f17 = jVar.C - jVar.B;
                                    int round5 = f16 < f15.width() ? Math.round(f15.width() - jVar.E) : 0;
                                    if (f17 < f15.height()) {
                                        i17 = Math.round(f15.height() - jVar.C);
                                        i14 = round5;
                                        i16 = round3;
                                        i18 = round4;
                                    } else {
                                        i14 = round5;
                                        i16 = round3;
                                        i18 = round4;
                                        i17 = 0;
                                    }
                                } else {
                                    float f18 = i23;
                                    if (f18 < f15.width()) {
                                        i14 = Math.round(f15.width() - f18);
                                        i15 = 0;
                                    } else {
                                        i14 = round;
                                        i15 = i14;
                                    }
                                    float f19 = i24;
                                    if (f19 < f15.height()) {
                                        i17 = Math.round(f15.height() - f19);
                                        i16 = i15;
                                        i18 = 0;
                                    } else {
                                        i16 = i15;
                                        i17 = round2;
                                        i18 = i17;
                                    }
                                }
                                hVar.f110264b = round;
                                hVar.f110265c = round2;
                                if (round != i14 || round2 != i17) {
                                    ((OverScroller) hVar.f110266d).fling(round, round2, i25, i26, i16, i14, i18, i17, 0, 0);
                                }
                            }
                            jVar.f93518y = hVar;
                            h10.post(hVar);
                        }
                    }
                }
                VelocityTracker velocityTracker = this.f93479d;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f93479d = null;
                }
            } else if (i19 == 2) {
                try {
                    x15 = motionEvent.getX(this.f93477b);
                } catch (Exception unused3) {
                    x15 = motionEvent.getX();
                }
                try {
                    y15 = motionEvent.getY(this.f93477b);
                } catch (Exception unused4) {
                    y15 = motionEvent.getY();
                }
                float f23 = x15 - this.f93481f;
                float f24 = y15 - this.f93482g;
                if (!this.f93480e) {
                    this.f93480e = Math.sqrt((double) ((f24 * f24) + (f23 * f23))) >= ((double) this.f93483h);
                }
                if (this.f93480e) {
                    jVar.j(f23, f24);
                    this.f93481f = x15;
                    this.f93482g = y15;
                    VelocityTracker velocityTracker2 = this.f93479d;
                    if (velocityTracker2 != null) {
                        velocityTracker2.addMovement(motionEvent);
                    }
                }
            } else if (i19 == 3) {
                this.f93476a = -1;
                VelocityTracker velocityTracker3 = this.f93479d;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f93479d = null;
                }
            } else if (i19 == 6) {
                int i27 = (action & 65280) >> 8;
                if (motionEvent.getPointerId(i27) == this.f93476a) {
                    int i28 = i27 != 0 ? 0 : 1;
                    this.f93476a = motionEvent.getPointerId(i28);
                    this.f93481f = motionEvent.getX(i28);
                    this.f93482g = motionEvent.getY(i28);
                }
            }
            i13 = 0;
        } else {
            this.f93476a = motionEvent.getPointerId(0);
            VelocityTracker obtain = VelocityTracker.obtain();
            this.f93479d = obtain;
            if (obtain != null) {
                obtain.addMovement(motionEvent);
            }
            try {
                x13 = motionEvent.getX(this.f93477b);
            } catch (Exception unused5) {
                x13 = motionEvent.getX();
            }
            this.f93481f = x13;
            try {
                y13 = motionEvent.getY(this.f93477b);
            } catch (Exception unused6) {
                y13 = motionEvent.getY();
            }
            this.f93482g = y13;
            i13 = 0;
            this.f93480e = false;
        }
        int i29 = this.f93476a;
        this.f93477b = motionEvent.findPointerIndex(i29 != -1 ? i29 : i13);
    }
}
