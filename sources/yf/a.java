package yf;

import ag.i;
import ag.j;
import android.graphics.Matrix;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.charts.Chart;
import sf.n;

/* loaded from: classes3.dex */
public final class a extends c {

    /* renamed from: e, reason: collision with root package name */
    public Matrix f138926e;

    /* renamed from: f, reason: collision with root package name */
    public Matrix f138927f;

    /* renamed from: g, reason: collision with root package name */
    public ag.d f138928g;

    /* renamed from: h, reason: collision with root package name */
    public ag.d f138929h;

    /* renamed from: i, reason: collision with root package name */
    public float f138930i;

    /* renamed from: j, reason: collision with root package name */
    public float f138931j;

    /* renamed from: k, reason: collision with root package name */
    public float f138932k;

    /* renamed from: l, reason: collision with root package name */
    public xf.a f138933l;

    /* renamed from: m, reason: collision with root package name */
    public VelocityTracker f138934m;

    /* renamed from: n, reason: collision with root package name */
    public long f138935n;

    /* renamed from: o, reason: collision with root package name */
    public ag.d f138936o;

    /* renamed from: p, reason: collision with root package name */
    public ag.d f138937p;

    /* renamed from: q, reason: collision with root package name */
    public float f138938q;

    /* renamed from: r, reason: collision with root package name */
    public float f138939r;

    public static float d(MotionEvent motionEvent) {
        float x13 = motionEvent.getX(0) - motionEvent.getX(1);
        float y13 = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) Math.sqrt((y13 * y13) + (x13 * x13));
    }

    public final ag.d a(float f13, float f14) {
        j jVar = ((BarLineChartBase) this.f138943d).f30166r;
        float f15 = f13 - jVar.f15115b.left;
        b();
        return ag.d.b(f15, -((r0.getMeasuredHeight() - f14) - jVar.f()));
    }

    public final void b() {
        xf.a aVar = this.f138933l;
        Chart chart = this.f138943d;
        if (aVar == null) {
            BarLineChartBase barLineChartBase = (BarLineChartBase) chart;
            barLineChartBase.I.getClass();
            barLineChartBase.f30146J.getClass();
        }
        xf.b bVar = this.f138933l;
        if (bVar != null) {
            BarLineChartBase barLineChartBase2 = (BarLineChartBase) chart;
            n nVar = ((tf.e) bVar).f117515d;
            barLineChartBase2.getClass();
            (nVar == n.LEFT ? barLineChartBase2.I : barLineChartBase2.f30146J).getClass();
        }
    }

    public final void c(MotionEvent motionEvent) {
        this.f138927f.set(this.f138926e);
        float x13 = motionEvent.getX();
        ag.d dVar = this.f138928g;
        dVar.f15087b = x13;
        dVar.f15088c = motionEvent.getY();
        BarLineChartBase barLineChartBase = (BarLineChartBase) this.f138943d;
        vf.c o13 = barLineChartBase.o(motionEvent.getX(), motionEvent.getY());
        this.f138933l = o13 != null ? (xf.a) ((tf.a) barLineChartBase.f30149a).b(o13.f125770f) : null;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        b bVar = b.NONE;
        BarLineChartBase barLineChartBase = (BarLineChartBase) this.f138943d;
        barLineChartBase.getClass();
        if (barLineChartBase.f30148z && ((tf.a) barLineChartBase.f30149a).d() > 0) {
            ag.d a13 = a(motionEvent.getX(), motionEvent.getY());
            float f13 = barLineChartBase.D ? 1.4f : 1.0f;
            float f14 = barLineChartBase.E ? 1.4f : 1.0f;
            float f15 = a13.f15087b;
            float f16 = a13.f15088c;
            j jVar = barLineChartBase.f30166r;
            Matrix matrix = barLineChartBase.Q;
            jVar.getClass();
            matrix.reset();
            matrix.set(jVar.f15114a);
            matrix.postScale(f13, f14, f15, -f16);
            barLineChartBase.f30166r.g(matrix, barLineChartBase, false);
            barLineChartBase.h();
            barLineChartBase.postInvalidate();
            barLineChartBase.getClass();
            ag.d.c(a13);
        }
        return super.onDoubleTap(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f13, float f14) {
        b bVar = b.NONE;
        ((BarLineChartBase) this.f138943d).getClass();
        return super.onFling(motionEvent, motionEvent2, f13, f14);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        b bVar = b.NONE;
        ((BarLineChartBase) this.f138943d).getClass();
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        b bVar = b.NONE;
        BarLineChartBase barLineChartBase = (BarLineChartBase) this.f138943d;
        barLineChartBase.getClass();
        if (!barLineChartBase.f30150b) {
            return false;
        }
        vf.c o13 = barLineChartBase.o(motionEvent.getX(), motionEvent.getY());
        Chart chart = this.f138943d;
        if (o13 == null || o13.a(this.f138941b)) {
            chart.s(null);
            this.f138941b = null;
        } else {
            chart.s(o13);
            this.f138941b = o13;
        }
        return super.onSingleTapUp(motionEvent);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        vf.c o13;
        VelocityTracker velocityTracker;
        if (this.f138934m == null) {
            this.f138934m = VelocityTracker.obtain();
        }
        this.f138934m.addMovement(motionEvent);
        if (motionEvent.getActionMasked() == 3 && (velocityTracker = this.f138934m) != null) {
            velocityTracker.recycle();
            this.f138934m = null;
        }
        if (this.f138940a == 0) {
            this.f138942c.onTouchEvent(motionEvent);
        }
        Chart chart = this.f138943d;
        BarLineChartBase barLineChartBase = (BarLineChartBase) chart;
        int i13 = 0;
        if (!(barLineChartBase.B || barLineChartBase.C) && !barLineChartBase.D && !barLineChartBase.E) {
            return true;
        }
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f138943d.getClass();
            ag.d dVar = this.f138937p;
            dVar.f15087b = 0.0f;
            dVar.f15088c = 0.0f;
            c(motionEvent);
        } else if (action != 1) {
            ag.d dVar2 = this.f138929h;
            if (action == 2) {
                int i14 = this.f138940a;
                ag.d dVar3 = this.f138928g;
                if (i14 == 1) {
                    ViewParent parent = barLineChartBase.getParent();
                    if (parent != null) {
                        parent.requestDisallowInterceptTouchEvent(true);
                    }
                    float x13 = barLineChartBase.B ? motionEvent.getX() - dVar3.f15087b : 0.0f;
                    float y13 = barLineChartBase.C ? motionEvent.getY() - dVar3.f15088c : 0.0f;
                    b bVar = b.NONE;
                    this.f138926e.set(this.f138927f);
                    ((BarLineChartBase) this.f138943d).getClass();
                    b();
                    this.f138926e.postTranslate(x13, y13);
                } else if (i14 == 2 || i14 == 3 || i14 == 4) {
                    ViewParent parent2 = barLineChartBase.getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    if ((barLineChartBase.D || barLineChartBase.E) && motionEvent.getPointerCount() >= 2) {
                        barLineChartBase.getClass();
                        float d2 = d(motionEvent);
                        if (d2 > this.f138939r) {
                            ag.d a13 = a(dVar2.f15087b, dVar2.f15088c);
                            j jVar = barLineChartBase.f30166r;
                            int i15 = this.f138940a;
                            Matrix matrix = this.f138927f;
                            if (i15 == 4) {
                                b bVar2 = b.NONE;
                                float f13 = d2 / this.f138932k;
                                boolean z13 = f13 < 1.0f;
                                boolean z14 = !z13 ? jVar.f15122i >= jVar.f15121h : jVar.f15122i <= jVar.f15120g;
                                if (!z13 ? jVar.f15123j < jVar.f15119f : jVar.f15123j > jVar.f15118e) {
                                    i13 = 1;
                                }
                                float f14 = barLineChartBase.D ? f13 : 1.0f;
                                float f15 = barLineChartBase.E ? f13 : 1.0f;
                                if (i13 != 0 || z14) {
                                    this.f138926e.set(matrix);
                                    this.f138926e.postScale(f14, f15, a13.f15087b, a13.f15088c);
                                }
                            } else if (i15 == 2 && barLineChartBase.D) {
                                b bVar3 = b.NONE;
                                float abs = Math.abs(motionEvent.getX(0) - motionEvent.getX(1)) / this.f138930i;
                                if (abs >= 1.0f ? jVar.f15122i < jVar.f15121h : jVar.f15122i > jVar.f15120g) {
                                    this.f138926e.set(matrix);
                                    this.f138926e.postScale(abs, 1.0f, a13.f15087b, a13.f15088c);
                                }
                            } else if (i15 == 3 && barLineChartBase.E) {
                                b bVar4 = b.NONE;
                                float abs2 = Math.abs(motionEvent.getY(0) - motionEvent.getY(1)) / this.f138931j;
                                if (abs2 >= 1.0f ? jVar.f15123j < jVar.f15119f : jVar.f15123j > jVar.f15118e) {
                                    this.f138926e.set(matrix);
                                    this.f138926e.postScale(1.0f, abs2, a13.f15087b, a13.f15088c);
                                }
                            }
                            ag.d.c(a13);
                        }
                    }
                } else if (i14 == 0) {
                    float x14 = motionEvent.getX() - dVar3.f15087b;
                    float y14 = motionEvent.getY() - dVar3.f15088c;
                    if (Math.abs((float) Math.sqrt((y14 * y14) + (x14 * x14))) > this.f138938q && (barLineChartBase.B || barLineChartBase.C)) {
                        j jVar2 = barLineChartBase.f30166r;
                        if (jVar2.a() && jVar2.b()) {
                            barLineChartBase.f30166r.getClass();
                            boolean z15 = barLineChartBase.A;
                            if (z15) {
                                b bVar5 = b.NONE;
                                if (z15 && (o13 = barLineChartBase.o(motionEvent.getX(), motionEvent.getY())) != null && !o13.a(this.f138941b)) {
                                    this.f138941b = o13;
                                    barLineChartBase.s(o13);
                                }
                            }
                        } else {
                            float abs3 = Math.abs(motionEvent.getX() - dVar3.f15087b);
                            float abs4 = Math.abs(motionEvent.getY() - dVar3.f15088c);
                            if ((barLineChartBase.B || abs4 >= abs3) && (barLineChartBase.C || abs4 <= abs3)) {
                                b bVar6 = b.NONE;
                                this.f138940a = 1;
                            }
                        }
                    }
                }
            } else if (action == 3) {
                this.f138940a = 0;
                this.f138943d.getClass();
            } else if (action != 5) {
                if (action == 6) {
                    VelocityTracker velocityTracker2 = this.f138934m;
                    velocityTracker2.computeCurrentVelocity(1000, i.f15106c);
                    int actionIndex = motionEvent.getActionIndex();
                    int pointerId = motionEvent.getPointerId(actionIndex);
                    float xVelocity = velocityTracker2.getXVelocity(pointerId);
                    float yVelocity = velocityTracker2.getYVelocity(pointerId);
                    int pointerCount = motionEvent.getPointerCount();
                    while (true) {
                        if (i13 >= pointerCount) {
                            break;
                        }
                        if (i13 != actionIndex) {
                            int pointerId2 = motionEvent.getPointerId(i13);
                            if ((velocityTracker2.getYVelocity(pointerId2) * yVelocity) + (velocityTracker2.getXVelocity(pointerId2) * xVelocity) < 0.0f) {
                                velocityTracker2.clear();
                                break;
                            }
                        }
                        i13++;
                    }
                    this.f138940a = 5;
                }
            } else if (motionEvent.getPointerCount() >= 2) {
                ViewParent parent3 = barLineChartBase.getParent();
                if (parent3 != null) {
                    parent3.requestDisallowInterceptTouchEvent(true);
                }
                c(motionEvent);
                this.f138930i = Math.abs(motionEvent.getX(0) - motionEvent.getX(1));
                this.f138931j = Math.abs(motionEvent.getY(0) - motionEvent.getY(1));
                float d13 = d(motionEvent);
                this.f138932k = d13;
                if (d13 > 10.0f) {
                    barLineChartBase.getClass();
                    boolean z16 = barLineChartBase.D;
                    if (z16 != barLineChartBase.E) {
                        this.f138940a = z16 ? 2 : 3;
                    } else {
                        this.f138940a = this.f138930i > this.f138931j ? 2 : 3;
                    }
                }
                float x15 = motionEvent.getX(1) + motionEvent.getX(0);
                float y15 = motionEvent.getY(1) + motionEvent.getY(0);
                dVar2.f15087b = x15 / 2.0f;
                dVar2.f15088c = y15 / 2.0f;
            }
        } else {
            VelocityTracker velocityTracker3 = this.f138934m;
            int pointerId3 = motionEvent.getPointerId(0);
            velocityTracker3.computeCurrentVelocity(1000, i.f15106c);
            float yVelocity2 = velocityTracker3.getYVelocity(pointerId3);
            float xVelocity2 = velocityTracker3.getXVelocity(pointerId3);
            if ((Math.abs(xVelocity2) > i.f15105b || Math.abs(yVelocity2) > i.f15105b) && this.f138940a == 1 && barLineChartBase.f30151c) {
                ag.d dVar4 = this.f138937p;
                dVar4.f15087b = 0.0f;
                dVar4.f15088c = 0.0f;
                this.f138935n = AnimationUtils.currentAnimationTimeMillis();
                float x16 = motionEvent.getX();
                ag.d dVar5 = this.f138936o;
                dVar5.f15087b = x16;
                dVar5.f15088c = motionEvent.getY();
                ag.d dVar6 = this.f138937p;
                dVar6.f15087b = xVelocity2;
                dVar6.f15088c = yVelocity2;
                chart.postInvalidateOnAnimation();
            }
            int i16 = this.f138940a;
            if (i16 == 2 || i16 == 3 || i16 == 4 || i16 == 5) {
                barLineChartBase.h();
                barLineChartBase.postInvalidate();
            }
            this.f138940a = 0;
            ViewParent parent4 = barLineChartBase.getParent();
            if (parent4 != null) {
                parent4.requestDisallowInterceptTouchEvent(false);
            }
            VelocityTracker velocityTracker4 = this.f138934m;
            if (velocityTracker4 != null) {
                velocityTracker4.recycle();
                this.f138934m = null;
            }
            this.f138943d.getClass();
        }
        j jVar3 = barLineChartBase.f30166r;
        Matrix matrix2 = this.f138926e;
        jVar3.g(matrix2, chart, true);
        this.f138926e = matrix2;
        return true;
    }
}
