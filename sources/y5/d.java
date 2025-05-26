package y5;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.OverScroller;
import androidx.appcompat.app.z;
import bp1.h;
import com.google.android.gms.ads.AdSize;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: x, reason: collision with root package name */
    public static final c f137745x = new c();

    /* renamed from: a, reason: collision with root package name */
    public int f137746a;

    /* renamed from: b, reason: collision with root package name */
    public int f137747b;

    /* renamed from: d, reason: collision with root package name */
    public float[] f137749d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f137750e;

    /* renamed from: f, reason: collision with root package name */
    public float[] f137751f;

    /* renamed from: g, reason: collision with root package name */
    public float[] f137752g;

    /* renamed from: h, reason: collision with root package name */
    public int[] f137753h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f137754i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f137755j;

    /* renamed from: k, reason: collision with root package name */
    public int f137756k;

    /* renamed from: l, reason: collision with root package name */
    public VelocityTracker f137757l;

    /* renamed from: m, reason: collision with root package name */
    public final float f137758m;

    /* renamed from: n, reason: collision with root package name */
    public float f137759n;

    /* renamed from: o, reason: collision with root package name */
    public int f137760o;

    /* renamed from: p, reason: collision with root package name */
    public final int f137761p;

    /* renamed from: q, reason: collision with root package name */
    public int f137762q;

    /* renamed from: r, reason: collision with root package name */
    public final OverScroller f137763r;

    /* renamed from: s, reason: collision with root package name */
    public final h f137764s;

    /* renamed from: t, reason: collision with root package name */
    public View f137765t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f137766u;

    /* renamed from: v, reason: collision with root package name */
    public final ViewGroup f137767v;

    /* renamed from: c, reason: collision with root package name */
    public int f137748c = -1;

    /* renamed from: w, reason: collision with root package name */
    public final z f137768w = new z(this, 10);

    public d(Context context, ViewGroup viewGroup, h hVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (hVar == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f137767v = viewGroup;
        this.f137764s = hVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i13 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f137761p = i13;
        this.f137760o = i13;
        this.f137747b = viewConfiguration.getScaledTouchSlop();
        this.f137758m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f137759n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f137763r = new OverScroller(context, f137745x);
    }

    public static boolean l(View view, int i13, int i14) {
        return view != null && i13 >= view.getLeft() && i13 < view.getRight() && i14 >= view.getTop() && i14 < view.getBottom();
    }

    public final void a() {
        b();
        if (this.f137746a == 2) {
            OverScroller overScroller = this.f137763r;
            overScroller.getCurrX();
            overScroller.getCurrY();
            overScroller.abortAnimation();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            this.f137764s.C(this.f137765t, currX, currY);
        }
        r(0);
    }

    public final void b() {
        this.f137748c = -1;
        float[] fArr = this.f137749d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f137750e, 0.0f);
            Arrays.fill(this.f137751f, 0.0f);
            Arrays.fill(this.f137752g, 0.0f);
            Arrays.fill(this.f137753h, 0);
            Arrays.fill(this.f137754i, 0);
            Arrays.fill(this.f137755j, 0);
            this.f137756k = 0;
        }
        VelocityTracker velocityTracker = this.f137757l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f137757l = null;
        }
    }

    public final void c(View view, int i13) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.f137767v;
        if (parent != viewGroup) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + viewGroup + ")");
        }
        this.f137765t = view;
        this.f137748c = i13;
        this.f137764s.A(view, i13);
        r(1);
    }

    public final boolean d(float f13, float f14, int i13, int i14) {
        float abs = Math.abs(f13);
        float abs2 = Math.abs(f14);
        if ((this.f137753h[i13] & i14) != i14 || (this.f137762q & i14) == 0 || (this.f137755j[i13] & i14) == i14 || (this.f137754i[i13] & i14) == i14) {
            return false;
        }
        float f15 = this.f137747b;
        if (abs <= f15 && abs2 <= f15) {
            return false;
        }
        if (abs < abs2 * 0.5f) {
            this.f137764s.getClass();
        }
        return (this.f137754i[i13] & i14) == 0 && abs > ((float) this.f137747b);
    }

    public final boolean e(View view, float f13, float f14) {
        if (view == null) {
            return false;
        }
        h hVar = this.f137764s;
        boolean z13 = hVar.r(view) > 0;
        boolean z14 = hVar.s() > 0;
        if (!z13 || !z14) {
            return z13 ? Math.abs(f13) > ((float) this.f137747b) : z14 && Math.abs(f14) > ((float) this.f137747b);
        }
        float f15 = (f14 * f14) + (f13 * f13);
        int i13 = this.f137747b;
        return f15 > ((float) (i13 * i13));
    }

    public final void f(int i13) {
        float[] fArr = this.f137749d;
        if (fArr != null) {
            int i14 = this.f137756k;
            int i15 = 1 << i13;
            if ((i14 & i15) != 0) {
                fArr[i13] = 0.0f;
                this.f137750e[i13] = 0.0f;
                this.f137751f[i13] = 0.0f;
                this.f137752g[i13] = 0.0f;
                this.f137753h[i13] = 0;
                this.f137754i[i13] = 0;
                this.f137755j[i13] = 0;
                this.f137756k = (~i15) & i14;
            }
        }
    }

    public final int g(int i13, int i14, int i15) {
        if (i13 == 0) {
            return 0;
        }
        float width = this.f137767v.getWidth() / 2;
        float sin = (((float) Math.sin((Math.min(1.0f, Math.abs(i13) / r0) - 0.5f) * 0.47123894f)) * width) + width;
        int abs = Math.abs(i14);
        return Math.min(abs > 0 ? Math.round(Math.abs(sin / abs) * 1000.0f) * 4 : (int) (((Math.abs(i13) / i15) + 1.0f) * 256.0f), AdSize.WIDE_SKYSCRAPER_HEIGHT);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        if (r2 == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean h() {
        /*
            r9 = this;
            int r0 = r9.f137746a
            r1 = 2
            if (r0 != r1) goto L5b
            android.widget.OverScroller r0 = r9.f137763r
            boolean r2 = r0.computeScrollOffset()
            int r3 = r0.getCurrX()
            int r4 = r0.getCurrY()
            android.view.View r5 = r9.f137765t
            int r5 = r5.getLeft()
            int r5 = r3 - r5
            android.view.View r6 = r9.f137765t
            int r6 = r6.getTop()
            int r6 = r4 - r6
            if (r5 == 0) goto L2c
            android.view.View r7 = r9.f137765t
            java.util.WeakHashMap r8 = q5.v0.f102521a
            r7.offsetLeftAndRight(r5)
        L2c:
            if (r6 == 0) goto L35
            android.view.View r7 = r9.f137765t
            java.util.WeakHashMap r8 = q5.v0.f102521a
            r7.offsetTopAndBottom(r6)
        L35:
            if (r5 != 0) goto L39
            if (r6 == 0) goto L40
        L39:
            bp1.h r5 = r9.f137764s
            android.view.View r6 = r9.f137765t
            r5.C(r6, r3, r4)
        L40:
            if (r2 == 0) goto L52
            int r5 = r0.getFinalX()
            if (r3 != r5) goto L52
            int r3 = r0.getFinalY()
            if (r4 != r3) goto L52
            r0.abortAnimation()
            goto L54
        L52:
            if (r2 != 0) goto L5b
        L54:
            androidx.appcompat.app.z r0 = r9.f137768w
            android.view.ViewGroup r2 = r9.f137767v
            r2.post(r0)
        L5b:
            int r0 = r9.f137746a
            if (r0 != r1) goto L61
            r0 = 1
            goto L62
        L61:
            r0 = 0
        L62:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y5.d.h():boolean");
    }

    public final View i(int i13, int i14) {
        ViewGroup viewGroup = this.f137767v;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f137764s.getClass();
            View childAt = viewGroup.getChildAt(childCount);
            if (i13 >= childAt.getLeft() && i13 < childAt.getRight() && i14 >= childAt.getTop() && i14 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean j(int r11, int r12, int r13, int r14) {
        /*
            r10 = this;
            android.view.View r0 = r10.f137765t
            int r2 = r0.getLeft()
            android.view.View r0 = r10.f137765t
            int r3 = r0.getTop()
            int r4 = r11 - r2
            int r5 = r12 - r3
            android.widget.OverScroller r1 = r10.f137763r
            r11 = 0
            if (r4 != 0) goto L1e
            if (r5 != 0) goto L1e
            r1.abortAnimation()
            r10.r(r11)
            return r11
        L1e:
            android.view.View r12 = r10.f137765t
            float r0 = r10.f137759n
            int r0 = (int) r0
            float r6 = r10.f137758m
            int r6 = (int) r6
            int r7 = java.lang.Math.abs(r13)
            if (r7 >= r0) goto L2e
            r13 = r11
            goto L35
        L2e:
            if (r7 <= r6) goto L35
            if (r13 <= 0) goto L34
            r13 = r6
            goto L35
        L34:
            int r13 = -r6
        L35:
            float r0 = r10.f137759n
            int r0 = (int) r0
            int r7 = java.lang.Math.abs(r14)
            if (r7 >= r0) goto L40
        L3e:
            r14 = r11
            goto L48
        L40:
            if (r7 <= r6) goto L48
            if (r14 <= 0) goto L46
            r14 = r6
            goto L48
        L46:
            int r11 = -r6
            goto L3e
        L48:
            int r11 = java.lang.Math.abs(r4)
            int r0 = java.lang.Math.abs(r5)
            int r6 = java.lang.Math.abs(r13)
            int r7 = java.lang.Math.abs(r14)
            int r8 = r6 + r7
            int r9 = r11 + r0
            if (r13 == 0) goto L62
            float r11 = (float) r6
            float r6 = (float) r8
        L60:
            float r11 = r11 / r6
            goto L65
        L62:
            float r11 = (float) r11
            float r6 = (float) r9
            goto L60
        L65:
            if (r14 == 0) goto L6b
            float r0 = (float) r7
            float r6 = (float) r8
        L69:
            float r0 = r0 / r6
            goto L6e
        L6b:
            float r0 = (float) r0
            float r6 = (float) r9
            goto L69
        L6e:
            bp1.h r6 = r10.f137764s
            int r12 = r6.r(r12)
            int r12 = r10.g(r4, r13, r12)
            int r13 = r6.s()
            int r13 = r10.g(r5, r14, r13)
            float r12 = (float) r12
            float r12 = r12 * r11
            float r11 = (float) r13
            float r11 = r11 * r0
            float r11 = r11 + r12
            int r6 = (int) r11
            r1.startScroll(r2, r3, r4, r5, r6)
            r11 = 2
            r10.r(r11)
            r11 = 1
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: y5.d.j(int, int, int, int):boolean");
    }

    public final boolean k(int i13) {
        if ((this.f137756k & (1 << i13)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i13 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
    
        if (r9.f137748c == (-1)) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006e, code lost:
    
        n();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y5.d.m(android.view.MotionEvent):void");
    }

    public final void n() {
        VelocityTracker velocityTracker = this.f137757l;
        float f13 = this.f137758m;
        velocityTracker.computeCurrentVelocity(1000, f13);
        float xVelocity = this.f137757l.getXVelocity(this.f137748c);
        float f14 = this.f137759n;
        float abs = Math.abs(xVelocity);
        float f15 = 0.0f;
        if (abs < f14) {
            xVelocity = 0.0f;
        } else if (abs > f13) {
            xVelocity = xVelocity > 0.0f ? f13 : -f13;
        }
        float yVelocity = this.f137757l.getYVelocity(this.f137748c);
        float f16 = this.f137759n;
        float abs2 = Math.abs(yVelocity);
        if (abs2 >= f16) {
            if (abs2 > f13) {
                if (yVelocity <= 0.0f) {
                    f13 = -f13;
                }
                f15 = f13;
            } else {
                f15 = yVelocity;
            }
        }
        this.f137766u = true;
        this.f137764s.D(this.f137765t, xVelocity, f15);
        this.f137766u = false;
        if (this.f137746a == 1) {
            r(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r3v3, types: [bp1.h] */
    public final void o(float f13, float f14, int i13) {
        boolean d2 = d(f13, f14, i13, 1);
        boolean z13 = d2;
        if (d(f14, f13, i13, 4)) {
            z13 = (d2 ? 1 : 0) | 4;
        }
        boolean z14 = z13;
        if (d(f13, f14, i13, 2)) {
            z14 = (z13 ? 1 : 0) | 2;
        }
        ?? r03 = z14;
        if (d(f14, f13, i13, 8)) {
            r03 = (z14 ? 1 : 0) | 8;
        }
        if (r03 != 0) {
            int[] iArr = this.f137754i;
            iArr[i13] = iArr[i13] | r03;
            this.f137764s.y(r03, i13);
        }
    }

    public final void p(float f13, float f14, int i13) {
        float[] fArr = this.f137749d;
        if (fArr == null || fArr.length <= i13) {
            int i14 = i13 + 1;
            float[] fArr2 = new float[i14];
            float[] fArr3 = new float[i14];
            float[] fArr4 = new float[i14];
            float[] fArr5 = new float[i14];
            int[] iArr = new int[i14];
            int[] iArr2 = new int[i14];
            int[] iArr3 = new int[i14];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f137750e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f137751f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f137752g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f137753h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f137754i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f137755j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f137749d = fArr2;
            this.f137750e = fArr3;
            this.f137751f = fArr4;
            this.f137752g = fArr5;
            this.f137753h = iArr;
            this.f137754i = iArr2;
            this.f137755j = iArr3;
        }
        float[] fArr9 = this.f137749d;
        this.f137751f[i13] = f13;
        fArr9[i13] = f13;
        float[] fArr10 = this.f137750e;
        this.f137752g[i13] = f14;
        fArr10[i13] = f14;
        int[] iArr7 = this.f137753h;
        int i15 = (int) f13;
        int i16 = (int) f14;
        ViewGroup viewGroup = this.f137767v;
        int i17 = i15 < viewGroup.getLeft() + this.f137760o ? 1 : 0;
        if (i16 < viewGroup.getTop() + this.f137760o) {
            i17 |= 4;
        }
        if (i15 > viewGroup.getRight() - this.f137760o) {
            i17 |= 2;
        }
        if (i16 > viewGroup.getBottom() - this.f137760o) {
            i17 |= 8;
        }
        iArr7[i13] = i17;
        this.f137756k |= 1 << i13;
    }

    public final void q(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i13 = 0; i13 < pointerCount; i13++) {
            int pointerId = motionEvent.getPointerId(i13);
            if (k(pointerId)) {
                float x13 = motionEvent.getX(i13);
                float y13 = motionEvent.getY(i13);
                this.f137751f[pointerId] = x13;
                this.f137752g[pointerId] = y13;
            }
        }
    }

    public final void r(int i13) {
        this.f137767v.removeCallbacks(this.f137768w);
        if (this.f137746a != i13) {
            this.f137746a = i13;
            this.f137764s.B(i13);
            if (this.f137746a == 0) {
                this.f137765t = null;
            }
        }
    }

    public final boolean s(int i13, int i14) {
        if (this.f137766u) {
            return j(i13, i14, (int) this.f137757l.getXVelocity(this.f137748c), (int) this.f137757l.getYVelocity(this.f137748c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d4, code lost:
    
        if (r13 != r12) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean t(android.view.MotionEvent r19) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y5.d.t(android.view.MotionEvent):boolean");
    }

    public final boolean u(View view, int i13, int i14) {
        this.f137765t = view;
        this.f137748c = -1;
        boolean j13 = j(i13, i14, 0, 0);
        if (!j13 && this.f137746a == 0 && this.f137765t != null) {
            this.f137765t = null;
        }
        return j13;
    }

    public final boolean v(View view, int i13) {
        if (view == this.f137765t && this.f137748c == i13) {
            return true;
        }
        if (view == null || !this.f137764s.I(view, i13)) {
            return false;
        }
        this.f137748c = i13;
        c(view, i13);
        return true;
    }
}
