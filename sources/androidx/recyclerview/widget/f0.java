package androidx.recyclerview.widget;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class f0 extends h2 implements n2 {
    public static final int[] C = {R.attr.state_pressed};
    public static final int[] D = new int[0];
    public int A;
    public final androidx.appcompat.app.z B;

    /* renamed from: a, reason: collision with root package name */
    public final int f19377a;

    /* renamed from: b, reason: collision with root package name */
    public final int f19378b;

    /* renamed from: c, reason: collision with root package name */
    public final StateListDrawable f19379c;

    /* renamed from: d, reason: collision with root package name */
    public final Drawable f19380d;

    /* renamed from: e, reason: collision with root package name */
    public final int f19381e;

    /* renamed from: f, reason: collision with root package name */
    public final int f19382f;

    /* renamed from: g, reason: collision with root package name */
    public final StateListDrawable f19383g;

    /* renamed from: h, reason: collision with root package name */
    public final Drawable f19384h;

    /* renamed from: i, reason: collision with root package name */
    public final int f19385i;

    /* renamed from: j, reason: collision with root package name */
    public final int f19386j;

    /* renamed from: k, reason: collision with root package name */
    public int f19387k;

    /* renamed from: l, reason: collision with root package name */
    public int f19388l;

    /* renamed from: m, reason: collision with root package name */
    public float f19389m;

    /* renamed from: n, reason: collision with root package name */
    public int f19390n;

    /* renamed from: o, reason: collision with root package name */
    public int f19391o;

    /* renamed from: p, reason: collision with root package name */
    public float f19392p;

    /* renamed from: s, reason: collision with root package name */
    public final RecyclerView f19395s;

    /* renamed from: z, reason: collision with root package name */
    public final ValueAnimator f19402z;

    /* renamed from: q, reason: collision with root package name */
    public int f19393q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f19394r = 0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f19396t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f19397u = false;

    /* renamed from: v, reason: collision with root package name */
    public int f19398v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f19399w = 0;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f19400x = new int[2];

    /* renamed from: y, reason: collision with root package name */
    public final int[] f19401y = new int[2];

    public f0(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i13, int i14, int i15) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f19402z = ofFloat;
        this.A = 0;
        androidx.appcompat.app.z zVar = new androidx.appcompat.app.z(this, 14);
        this.B = zVar;
        c0 c0Var = new c0(this, 0);
        this.f19379c = stateListDrawable;
        this.f19380d = drawable;
        this.f19383g = stateListDrawable2;
        this.f19384h = drawable2;
        this.f19381e = Math.max(i13, stateListDrawable.getIntrinsicWidth());
        this.f19382f = Math.max(i13, drawable.getIntrinsicWidth());
        this.f19385i = Math.max(i13, stateListDrawable2.getIntrinsicWidth());
        this.f19386j = Math.max(i13, drawable2.getIntrinsicWidth());
        this.f19377a = i14;
        this.f19378b = i15;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new d0(this));
        ofFloat.addUpdateListener(new e0(this, 0));
        RecyclerView recyclerView2 = this.f19395s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.t2(this);
            RecyclerView recyclerView3 = this.f19395s;
            recyclerView3.f19248q.remove(this);
            if (recyclerView3.f19250r == this) {
                recyclerView3.f19250r = null;
            }
            this.f19395s.w2(c0Var);
            this.f19395s.removeCallbacks(zVar);
        }
        this.f19395s = recyclerView;
        if (recyclerView != null) {
            recyclerView.m(this);
            this.f19395s.f19248q.add(this);
            this.f19395s.o(c0Var);
        }
    }

    public static int k(float f13, float f14, int[] iArr, int i13, int i14, int i15) {
        int i16 = iArr[1] - iArr[0];
        if (i16 == 0) {
            return 0;
        }
        int i17 = i13 - i15;
        int i18 = (int) (((f14 - f13) / i16) * i17);
        int i19 = i14 + i18;
        if (i19 >= i17 || i19 < 0) {
            return 0;
        }
        return i18;
    }

    @Override // androidx.recyclerview.widget.n2
    public final void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f19398v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean j13 = j(motionEvent.getX(), motionEvent.getY());
            boolean i13 = i(motionEvent.getX(), motionEvent.getY());
            if (j13 || i13) {
                if (i13) {
                    this.f19399w = 1;
                    this.f19392p = (int) motionEvent.getX();
                } else if (j13) {
                    this.f19399w = 2;
                    this.f19389m = (int) motionEvent.getY();
                }
                l(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f19398v == 2) {
            this.f19389m = 0.0f;
            this.f19392p = 0.0f;
            l(1);
            this.f19399w = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f19398v == 2) {
            m();
            int i14 = this.f19399w;
            int i15 = this.f19378b;
            if (i14 == 1) {
                float x13 = motionEvent.getX();
                int[] iArr = this.f19401y;
                iArr[0] = i15;
                int i16 = this.f19393q - i15;
                iArr[1] = i16;
                float max = Math.max(i15, Math.min(i16, x13));
                if (Math.abs(this.f19391o - max) >= 2.0f) {
                    int k13 = k(this.f19392p, max, iArr, this.f19395s.computeHorizontalScrollRange(), this.f19395s.computeHorizontalScrollOffset(), this.f19393q);
                    if (k13 != 0) {
                        this.f19395s.scrollBy(k13, 0);
                    }
                    this.f19392p = max;
                }
            }
            if (this.f19399w == 2) {
                float y13 = motionEvent.getY();
                int[] iArr2 = this.f19400x;
                iArr2[0] = i15;
                int i17 = this.f19394r - i15;
                iArr2[1] = i17;
                float max2 = Math.max(i15, Math.min(i17, y13));
                if (Math.abs(this.f19388l - max2) < 2.0f) {
                    return;
                }
                int k14 = k(this.f19389m, max2, iArr2, this.f19395s.computeVerticalScrollRange(), this.f19395s.computeVerticalScrollOffset(), this.f19394r);
                if (k14 != 0) {
                    this.f19395s.scrollBy(0, k14);
                }
                this.f19389m = max2;
            }
        }
    }

    @Override // androidx.recyclerview.widget.n2
    public final boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i13 = this.f19398v;
        if (i13 == 1) {
            boolean j13 = j(motionEvent.getX(), motionEvent.getY());
            boolean i14 = i(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!j13 && !i14) {
                return false;
            }
            if (i14) {
                this.f19399w = 1;
                this.f19392p = (int) motionEvent.getX();
            } else if (j13) {
                this.f19399w = 2;
                this.f19389m = (int) motionEvent.getY();
            }
            l(2);
        } else if (i13 != 2) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.n2
    public final void e(boolean z13) {
    }

    @Override // androidx.recyclerview.widget.h2
    public final void h(Canvas canvas, RecyclerView recyclerView) {
        if (this.f19393q != this.f19395s.getWidth() || this.f19394r != this.f19395s.getHeight()) {
            this.f19393q = this.f19395s.getWidth();
            this.f19394r = this.f19395s.getHeight();
            l(0);
            return;
        }
        if (this.A != 0) {
            if (this.f19396t) {
                int i13 = this.f19393q;
                int i14 = this.f19381e;
                int i15 = i13 - i14;
                int i16 = this.f19388l;
                int i17 = this.f19387k;
                int i18 = i16 - (i17 / 2);
                StateListDrawable stateListDrawable = this.f19379c;
                stateListDrawable.setBounds(0, 0, i14, i17);
                int i19 = this.f19394r;
                int i23 = this.f19382f;
                Drawable drawable = this.f19380d;
                drawable.setBounds(0, 0, i23, i19);
                RecyclerView recyclerView2 = this.f19395s;
                WeakHashMap weakHashMap = q5.v0.f102521a;
                if (recyclerView2.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i14, i18);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-i14, -i18);
                } else {
                    canvas.translate(i15, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i18);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i15, -i18);
                }
            }
            if (this.f19397u) {
                int i24 = this.f19394r;
                int i25 = this.f19385i;
                int i26 = i24 - i25;
                int i27 = this.f19391o;
                int i28 = this.f19390n;
                int i29 = i27 - (i28 / 2);
                StateListDrawable stateListDrawable2 = this.f19383g;
                stateListDrawable2.setBounds(0, 0, i28, i25);
                int i33 = this.f19393q;
                int i34 = this.f19386j;
                Drawable drawable2 = this.f19384h;
                drawable2.setBounds(0, 0, i33, i34);
                canvas.translate(0.0f, i26);
                drawable2.draw(canvas);
                canvas.translate(i29, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i29, -i26);
            }
        }
    }

    public final boolean i(float f13, float f14) {
        if (f14 >= this.f19394r - this.f19385i) {
            int i13 = this.f19391o;
            int i14 = this.f19390n;
            if (f13 >= i13 - (i14 / 2) && f13 <= (i14 / 2) + i13) {
                return true;
            }
        }
        return false;
    }

    public final boolean j(float f13, float f14) {
        RecyclerView recyclerView = this.f19395s;
        WeakHashMap weakHashMap = q5.v0.f102521a;
        boolean z13 = recyclerView.getLayoutDirection() == 1;
        int i13 = this.f19381e;
        if (z13) {
            if (f13 > i13) {
                return false;
            }
        } else if (f13 < this.f19393q - i13) {
            return false;
        }
        int i14 = this.f19388l;
        int i15 = this.f19387k / 2;
        return f14 >= ((float) (i14 - i15)) && f14 <= ((float) (i15 + i14));
    }

    public final void l(int i13) {
        androidx.appcompat.app.z zVar = this.B;
        StateListDrawable stateListDrawable = this.f19379c;
        if (i13 == 2 && this.f19398v != 2) {
            stateListDrawable.setState(C);
            this.f19395s.removeCallbacks(zVar);
        }
        if (i13 == 0) {
            this.f19395s.invalidate();
        } else {
            m();
        }
        if (this.f19398v == 2 && i13 != 2) {
            stateListDrawable.setState(D);
            this.f19395s.removeCallbacks(zVar);
            this.f19395s.postDelayed(zVar, 1200);
        } else if (i13 == 1) {
            this.f19395s.removeCallbacks(zVar);
            this.f19395s.postDelayed(zVar, 1500);
        }
        this.f19398v = i13;
    }

    public final void m() {
        int i13 = this.A;
        ValueAnimator valueAnimator = this.f19402z;
        if (i13 != 0) {
            if (i13 != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
