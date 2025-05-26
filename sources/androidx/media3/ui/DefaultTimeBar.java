package androidx.media3.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes3.dex */
public class DefaultTimeBar extends View implements t0 {
    public static final /* synthetic */ int P = 0;
    public final int A;
    public final long B;
    public int C;
    public Rect D;
    public final ValueAnimator E;
    public float F;
    public boolean G;
    public boolean H;
    public long I;

    /* renamed from: J */
    public long f18879J;
    public long K;
    public long L;
    public int M;
    public long[] N;
    public boolean[] O;

    /* renamed from: a */
    public final Rect f18880a;

    /* renamed from: b */
    public final Rect f18881b;

    /* renamed from: c */
    public final Rect f18882c;

    /* renamed from: d */
    public final Rect f18883d;

    /* renamed from: e */
    public final Paint f18884e;

    /* renamed from: f */
    public final Paint f18885f;

    /* renamed from: g */
    public final Paint f18886g;

    /* renamed from: h */
    public final Paint f18887h;

    /* renamed from: i */
    public final Paint f18888i;

    /* renamed from: j */
    public final Paint f18889j;

    /* renamed from: k */
    public final Drawable f18890k;

    /* renamed from: l */
    public final int f18891l;

    /* renamed from: m */
    public final int f18892m;

    /* renamed from: n */
    public final int f18893n;

    /* renamed from: o */
    public final int f18894o;

    /* renamed from: p */
    public final int f18895p;

    /* renamed from: q */
    public final int f18896q;

    /* renamed from: r */
    public final int f18897r;

    /* renamed from: s */
    public final int f18898s;

    /* renamed from: t */
    public final int f18899t;

    /* renamed from: u */
    public final StringBuilder f18900u;

    /* renamed from: v */
    public final Formatter f18901v;

    /* renamed from: w */
    public final u0.n f18902w;

    /* renamed from: x */
    public final CopyOnWriteArraySet f18903x;

    /* renamed from: y */
    public final Point f18904y;

    /* renamed from: z */
    public final float f18905z;

    public DefaultTimeBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static int d(int i13, float f13) {
        return (int) ((i13 * f13) + 0.5f);
    }

    @Override // androidx.media3.ui.t0
    public void a(long j13) {
        if (this.K == j13) {
            return;
        }
        this.K = j13;
        setContentDescription(d7.n0.I(this.f18900u, this.f18901v, j13));
        n();
    }

    @Override // androidx.media3.ui.t0
    public void b(long j13) {
        if (this.f18879J == j13) {
            return;
        }
        this.f18879J = j13;
        if (this.H && j13 == -9223372036854775807L) {
            m(true);
        }
        n();
    }

    public final void c(s0 s0Var) {
        s0Var.getClass();
        this.f18903x.add(s0Var);
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f18890k;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    public final long e() {
        long j13 = this.B;
        if (j13 != -9223372036854775807L) {
            return j13;
        }
        long j14 = this.f18879J;
        if (j14 == -9223372036854775807L) {
            return 0L;
        }
        return j14 / this.A;
    }

    public final long f() {
        int width = (int) (this.f18881b.width() / this.f18905z);
        if (width != 0) {
            long j13 = this.f18879J;
            if (j13 != 0 && j13 != -9223372036854775807L) {
                return j13 / width;
            }
        }
        return Long.MAX_VALUE;
    }

    public final long g() {
        if (this.f18881b.width() <= 0 || this.f18879J == -9223372036854775807L) {
            return 0L;
        }
        return (this.f18883d.width() * this.f18879J) / r0.width();
    }

    public final boolean h(long j13) {
        long j14 = this.f18879J;
        if (j14 <= 0) {
            return false;
        }
        long j15 = this.H ? this.I : this.K;
        long j16 = d7.n0.j(j15 + j13, 0L, j14);
        if (j16 == j15) {
            return false;
        }
        if (this.H) {
            o(j16);
        } else {
            l(j16);
        }
        n();
        return true;
    }

    public final void i(long[] jArr, boolean[] zArr, int i13) {
        bf.b.i(i13 == 0 || !(jArr == null || zArr == null));
        this.M = i13;
        this.N = jArr;
        this.O = zArr;
        n();
    }

    public final void j(long j13) {
        if (this.L == j13) {
            return;
        }
        this.L = j13;
        n();
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f18890k;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public final void k(int i13) {
        this.f18886g.setColor(i13);
        invalidate(this.f18880a);
    }

    public final void l(long j13) {
        this.I = j13;
        this.H = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator it = this.f18903x.iterator();
        while (it.hasNext()) {
            ((s0) it.next()).a(this, j13);
        }
    }

    public final void m(boolean z13) {
        removeCallbacks(this.f18902w);
        this.H = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator it = this.f18903x.iterator();
        while (it.hasNext()) {
            ((s0) it.next()).c(this, this.I, z13);
        }
    }

    public final void n() {
        Rect rect = this.f18882c;
        Rect rect2 = this.f18881b;
        rect.set(rect2);
        Rect rect3 = this.f18883d;
        rect3.set(rect2);
        long j13 = this.H ? this.I : this.K;
        if (this.f18879J > 0) {
            rect.right = Math.min(rect2.left + ((int) ((rect2.width() * this.L) / this.f18879J)), rect2.right);
            rect3.right = Math.min(rect2.left + ((int) ((rect2.width() * j13) / this.f18879J)), rect2.right);
        } else {
            int i13 = rect2.left;
            rect.right = i13;
            rect3.right = i13;
        }
        invalidate(this.f18880a);
    }

    public final void o(long j13) {
        if (this.I == j13) {
            return;
        }
        this.I = j13;
        Iterator it = this.f18903x.iterator();
        while (it.hasNext()) {
            ((s0) it.next()).b(this, j13);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        Rect rect = this.f18881b;
        int height = rect.height();
        int centerY = rect.centerY() - (height / 2);
        int i13 = centerY + height;
        long j13 = this.f18879J;
        Paint paint = this.f18886g;
        Rect rect2 = this.f18883d;
        if (j13 <= 0) {
            canvas.drawRect(rect.left, centerY, rect.right, i13, paint);
        } else {
            Rect rect3 = this.f18882c;
            int i14 = rect3.left;
            int i15 = rect3.right;
            int max = Math.max(Math.max(rect.left, i15), rect2.right);
            int i16 = rect.right;
            if (max < i16) {
                canvas.drawRect(max, centerY, i16, i13, paint);
            }
            int max2 = Math.max(i14, rect2.right);
            if (i15 > max2) {
                canvas.drawRect(max2, centerY, i15, i13, this.f18885f);
            }
            if (rect2.width() > 0) {
                canvas.drawRect(rect2.left, centerY, rect2.right, i13, this.f18884e);
            }
            if (this.M != 0) {
                long[] jArr = this.N;
                jArr.getClass();
                boolean[] zArr = this.O;
                zArr.getClass();
                int i17 = this.f18894o;
                int i18 = i17 / 2;
                int i19 = 0;
                int i23 = 0;
                while (i23 < this.M) {
                    canvas.drawRect(Math.min(rect.width() - i17, Math.max(i19, ((int) ((rect.width() * d7.n0.j(jArr[i23], 0L, this.f18879J)) / this.f18879J)) - i18)) + rect.left, centerY, r1 + i17, i13, zArr[i23] ? this.f18888i : this.f18887h);
                    i23++;
                    i19 = i19;
                    i17 = i17;
                }
            }
        }
        if (this.f18879J > 0) {
            int i24 = d7.n0.i(rect2.right, rect2.left, rect.right);
            int centerY2 = rect2.centerY();
            Drawable drawable = this.f18890k;
            if (drawable == null) {
                canvas.drawCircle(i24, centerY2, (int) ((((this.H || isFocused()) ? this.f18897r : isEnabled() ? this.f18895p : this.f18896q) * this.F) / 2.0f), this.f18889j);
            } else {
                int intrinsicWidth = ((int) (drawable.getIntrinsicWidth() * this.F)) / 2;
                int intrinsicHeight = ((int) (drawable.getIntrinsicHeight() * this.F)) / 2;
                drawable.setBounds(i24 - intrinsicWidth, centerY2 - intrinsicHeight, i24 + intrinsicWidth, centerY2 + intrinsicHeight);
                drawable.draw(canvas);
            }
        }
        canvas.restore();
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z13, int i13, Rect rect) {
        super.onFocusChanged(z13, i13, rect);
        if (!this.H || z13) {
            return;
        }
        m(false);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(d7.n0.I(this.f18900u, this.f18901v, this.K));
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(d7.n0.I(this.f18900u, this.f18901v, this.K));
        if (this.f18879J <= 0) {
            return;
        }
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onKeyDown(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L2e
            long r0 = r4.e()
            r2 = 66
            r3 = 1
            if (r5 == r2) goto L25
            switch(r5) {
                case 21: goto L13;
                case 22: goto L14;
                case 23: goto L25;
                default: goto L12;
            }
        L12:
            goto L2e
        L13:
            long r0 = -r0
        L14:
            boolean r0 = r4.h(r0)
            if (r0 == 0) goto L2e
            u0.n r5 = r4.f18902w
            r4.removeCallbacks(r5)
            r0 = 1000(0x3e8, double:4.94E-321)
            r4.postDelayed(r5, r0)
            return r3
        L25:
            boolean r0 = r4.H
            if (r0 == 0) goto L2e
            r5 = 0
            r4.m(r5)
            return r3
        L2e:
            boolean r5 = super.onKeyDown(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.DefaultTimeBar.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public final void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        int i17;
        int i18;
        Rect rect;
        int i19 = i15 - i13;
        int i23 = i16 - i14;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i19 - getPaddingRight();
        int i24 = this.G ? 0 : this.f18898s;
        int i25 = this.f18893n;
        int i26 = this.f18891l;
        int i27 = this.f18892m;
        if (i25 == 1) {
            i17 = (i23 - getPaddingBottom()) - i27;
            i18 = ((i23 - getPaddingBottom()) - i26) - Math.max(i24 - (i26 / 2), 0);
        } else {
            i17 = (i23 - i27) / 2;
            i18 = (i23 - i26) / 2;
        }
        Rect rect2 = this.f18880a;
        rect2.set(paddingLeft, i17, paddingRight, i27 + i17);
        this.f18881b.set(rect2.left + i24, i18, rect2.right - i24, i26 + i18);
        if (d7.n0.f53866a >= 29 && ((rect = this.D) == null || rect.width() != i19 || this.D.height() != i23)) {
            Rect rect3 = new Rect(0, 0, i19, i23);
            this.D = rect3;
            setSystemGestureExclusionRects(Collections.singletonList(rect3));
        }
        n();
    }

    @Override // android.view.View
    public final void onMeasure(int i13, int i14) {
        int mode = View.MeasureSpec.getMode(i14);
        int size = View.MeasureSpec.getSize(i14);
        int i15 = this.f18892m;
        if (mode == 0) {
            size = i15;
        } else if (mode != 1073741824) {
            size = Math.min(i15, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i13), size);
        Drawable drawable = this.f18890k;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i13) {
        Drawable drawable = this.f18890k;
        if (drawable == null || d7.n0.f53866a < 23 || !drawable.setLayoutDirection(i13)) {
            return;
        }
        invalidate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        if (r3 != 3) goto L69;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            boolean r0 = r9.isEnabled()
            r1 = 0
            if (r0 == 0) goto La2
            long r2 = r9.f18879J
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L11
            goto La2
        L11:
            android.graphics.Point r0 = r9.f18904y
            float r2 = r10.getX()
            int r2 = (int) r2
            float r3 = r10.getY()
            int r3 = (int) r3
            r0.set(r2, r3)
            int r2 = r0.x
            int r0 = r0.y
            int r3 = r10.getAction()
            android.graphics.Rect r4 = r9.f18883d
            android.graphics.Rect r5 = r9.f18881b
            r6 = 1
            if (r3 == 0) goto L7e
            r7 = 3
            if (r3 == r6) goto L6f
            r8 = 2
            if (r3 == r8) goto L38
            if (r3 == r7) goto L6f
            goto La2
        L38:
            boolean r10 = r9.H
            if (r10 == 0) goto La2
            int r10 = r9.f18899t
            if (r0 >= r10) goto L53
            int r10 = r9.C
            int r10 = a.a.b(r2, r10, r7, r10)
            float r10 = (float) r10
            int r10 = (int) r10
            int r0 = r5.left
            int r1 = r5.right
            int r10 = d7.n0.i(r10, r0, r1)
            r4.right = r10
            goto L61
        L53:
            r9.C = r2
            float r10 = (float) r2
            int r10 = (int) r10
            int r0 = r5.left
            int r1 = r5.right
            int r10 = d7.n0.i(r10, r0, r1)
            r4.right = r10
        L61:
            long r0 = r9.g()
            r9.o(r0)
            r9.n()
            r9.invalidate()
            return r6
        L6f:
            boolean r0 = r9.H
            if (r0 == 0) goto La2
            int r10 = r10.getAction()
            if (r10 != r7) goto L7a
            r1 = r6
        L7a:
            r9.m(r1)
            return r6
        L7e:
            float r10 = (float) r2
            float r0 = (float) r0
            int r10 = (int) r10
            int r0 = (int) r0
            android.graphics.Rect r2 = r9.f18880a
            boolean r0 = r2.contains(r10, r0)
            if (r0 == 0) goto La2
            int r0 = r5.left
            int r1 = r5.right
            int r10 = d7.n0.i(r10, r0, r1)
            r4.right = r10
            long r0 = r9.g()
            r9.l(r0)
            r9.n()
            r9.invalidate()
            return r6
        La2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.DefaultTimeBar.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i13, Bundle bundle) {
        if (super.performAccessibilityAction(i13, bundle)) {
            return true;
        }
        if (this.f18879J <= 0) {
            return false;
        }
        if (i13 == 8192) {
            if (h(-e())) {
                m(false);
            }
        } else {
            if (i13 != 4096) {
                return false;
            }
            if (h(e())) {
                m(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    @Override // android.view.View, androidx.media3.ui.t0
    public final void setEnabled(boolean z13) {
        super.setEnabled(z13);
        if (!this.H || z13) {
            return;
        }
        m(true);
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet, int i13) {
        this(context, attributeSet, i13, attributeSet, 0);
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet, Object obj) {
        this(context, null, 0, attributeSet, 0);
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet, int i13, AttributeSet attributeSet2, int i14) {
        super(context, attributeSet, i13);
        this.f18880a = new Rect();
        this.f18881b = new Rect();
        this.f18882c = new Rect();
        this.f18883d = new Rect();
        Paint paint = new Paint();
        this.f18884e = paint;
        Paint paint2 = new Paint();
        this.f18885f = paint2;
        Paint paint3 = new Paint();
        this.f18886g = paint3;
        Paint paint4 = new Paint();
        this.f18887h = paint4;
        Paint paint5 = new Paint();
        this.f18888i = paint5;
        Paint paint6 = new Paint();
        this.f18889j = paint6;
        paint6.setAntiAlias(true);
        this.f18903x = new CopyOnWriteArraySet();
        this.f18904y = new Point();
        float f13 = context.getResources().getDisplayMetrics().density;
        this.f18905z = f13;
        this.f18899t = d(-50, f13);
        int d2 = d(4, f13);
        int d13 = d(26, f13);
        int d14 = d(4, f13);
        int d15 = d(12, f13);
        int d16 = d(0, f13);
        int d17 = d(16, f13);
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, m0.DefaultTimeBar, i13, i14);
            try {
                Drawable drawable = obtainStyledAttributes.getDrawable(m0.DefaultTimeBar_scrubber_drawable);
                this.f18890k = drawable;
                if (drawable != null) {
                    int i15 = d7.n0.f53866a;
                    if (i15 >= 23) {
                        int layoutDirection = getLayoutDirection();
                        if (i15 >= 23) {
                            drawable.setLayoutDirection(layoutDirection);
                        }
                    }
                    d13 = Math.max(drawable.getMinimumHeight(), d13);
                }
                this.f18891l = obtainStyledAttributes.getDimensionPixelSize(m0.DefaultTimeBar_bar_height, d2);
                this.f18892m = obtainStyledAttributes.getDimensionPixelSize(m0.DefaultTimeBar_touch_target_height, d13);
                this.f18893n = obtainStyledAttributes.getInt(m0.DefaultTimeBar_bar_gravity, 0);
                this.f18894o = obtainStyledAttributes.getDimensionPixelSize(m0.DefaultTimeBar_ad_marker_width, d14);
                this.f18895p = obtainStyledAttributes.getDimensionPixelSize(m0.DefaultTimeBar_scrubber_enabled_size, d15);
                this.f18896q = obtainStyledAttributes.getDimensionPixelSize(m0.DefaultTimeBar_scrubber_disabled_size, d16);
                this.f18897r = obtainStyledAttributes.getDimensionPixelSize(m0.DefaultTimeBar_scrubber_dragged_size, d17);
                int i16 = obtainStyledAttributes.getInt(m0.DefaultTimeBar_played_color, -1);
                int i17 = obtainStyledAttributes.getInt(m0.DefaultTimeBar_scrubber_color, -1);
                int i18 = obtainStyledAttributes.getInt(m0.DefaultTimeBar_buffered_color, -855638017);
                int i19 = obtainStyledAttributes.getInt(m0.DefaultTimeBar_unplayed_color, 872415231);
                int i23 = obtainStyledAttributes.getInt(m0.DefaultTimeBar_ad_marker_color, -1291845888);
                int i24 = obtainStyledAttributes.getInt(m0.DefaultTimeBar_played_ad_marker_color, 872414976);
                paint.setColor(i16);
                paint6.setColor(i17);
                paint2.setColor(i18);
                paint3.setColor(i19);
                paint4.setColor(i23);
                paint5.setColor(i24);
                obtainStyledAttributes.recycle();
            } catch (Throwable th3) {
                obtainStyledAttributes.recycle();
                throw th3;
            }
        } else {
            this.f18891l = d2;
            this.f18892m = d13;
            this.f18893n = 0;
            this.f18894o = d14;
            this.f18895p = d15;
            this.f18896q = d16;
            this.f18897r = d17;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(-855638017);
            paint3.setColor(872415231);
            paint4.setColor(-1291845888);
            paint5.setColor(872414976);
            this.f18890k = null;
        }
        StringBuilder sb3 = new StringBuilder();
        this.f18900u = sb3;
        this.f18901v = new Formatter(sb3, Locale.getDefault());
        this.f18902w = new u0.n(this, 22);
        Drawable drawable2 = this.f18890k;
        if (drawable2 != null) {
            this.f18898s = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.f18898s = (Math.max(this.f18896q, Math.max(this.f18895p, this.f18897r)) + 1) / 2;
        }
        this.F = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.E = valueAnimator;
        valueAnimator.addUpdateListener(new c(this, 0));
        this.f18879J = -9223372036854775807L;
        this.B = -9223372036854775807L;
        this.A = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }
}
