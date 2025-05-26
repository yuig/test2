package com.pinterest.ui.components.rangesliders;

import a.a;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.pinterest.feature.shopping.shoppingcomponents.productfilters.unifiedproductfilters.itemviews.RangeFilterItem;
import de1.b0;
import de1.n0;
import de1.o0;
import fe1.h;
import fe1.i;
import fe1.j;
import h32.f1;
import h32.g0;
import java.util.HashMap;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import ma2.b;
import ma2.c;
import nx.d0;
import org.jetbrains.annotations.NotNull;
import pk.a0;
import q5.v0;
import t32.f;
import vn1.g;
import zd1.r;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/pinterest/ui/components/rangesliders/RangeSliderBar;", "Lcom/pinterest/ui/components/rangesliders/RangeProgressBar;", "Lma2/b;", "fe1/j", "ma2/c", "productFilterLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RangeSliderBar extends RangeProgressBar implements b {
    public int D;
    public int E;
    public final Rect F;
    public final Rect G;
    public j H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public int f52324J;
    public int K;
    public int L;
    public final int M;
    public Drawable N;
    public Drawable O;
    public int P;
    public final float Q;
    public final int R;
    public float S;
    public boolean T;
    public c U;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RangeSliderBar(@NotNull Context context, AttributeSet attributeSet) {
        this(0, 12, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.pinterest.ui.components.rangesliders.RangeProgressBar, android.view.View
    public final void drawableHotspotChanged(float f13, float f14) {
        super.drawableHotspotChanged(f13, f14);
        this.N.setHotspot(f13, f14);
        this.O.setHotspot(f13, f14);
    }

    @Override // com.pinterest.ui.components.rangesliders.RangeProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f52308m;
        if (drawable != null) {
            float f13 = this.Q;
            if (f13 < 1.0f) {
                drawable.setAlpha(isEnabled() ? 255 : (int) (255 * f13));
            }
        }
        c cVar = this.U;
        if (cVar != c.None) {
            Drawable drawable2 = cVar == c.Start ? this.N : this.O;
            int[] drawableState = getDrawableState();
            Intrinsics.checkNotNullExpressionValue(drawableState, "getDrawableState(...)");
            n(drawable2, drawableState);
            return;
        }
        Drawable drawable3 = this.N;
        int[] drawableState2 = getDrawableState();
        Intrinsics.checkNotNullExpressionValue(drawableState2, "getDrawableState(...)");
        n(drawable3, drawableState2);
        Drawable drawable4 = this.O;
        int[] drawableState3 = getDrawableState();
        Intrinsics.checkNotNullExpressionValue(drawableState3, "getDrawableState(...)");
        n(drawable4, drawableState3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0045, code lost:
    
        r7 = kh2.p2.U(r7, 0, r0);
     */
    @Override // com.pinterest.ui.components.rangesliders.RangeProgressBar
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean e(int r7, int r8, boolean r9, boolean r10) {
        /*
            r6 = this;
            monitor-enter(r6)
            int r0 = r6.L     // Catch: java.lang.Throwable -> L2c
            r1 = 1
            if (r0 <= r1) goto L2e
            int r1 = r7 % r0
            r2 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            if (r1 <= 0) goto L1a
            float r4 = (float) r1     // Catch: java.lang.Throwable -> L2c
            float r5 = (float) r0     // Catch: java.lang.Throwable -> L2c
            float r4 = r4 / r5
            double r4 = (double) r4     // Catch: java.lang.Throwable -> L2c
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 <= 0) goto L19
            int r1 = r0 - r1
            int r1 = r1 + r7
            r7 = r1
            goto L1a
        L19:
            int r7 = r7 - r1
        L1a:
            int r1 = r8 % r0
            if (r1 <= 0) goto L2e
            float r4 = (float) r1     // Catch: java.lang.Throwable -> L2c
            float r5 = (float) r0     // Catch: java.lang.Throwable -> L2c
            float r4 = r4 / r5
            double r4 = (double) r4     // Catch: java.lang.Throwable -> L2c
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 <= 0) goto L2a
            int r0 = r0 - r1
            int r0 = r0 + r8
            r8 = r0
            goto L2e
        L2a:
            int r8 = r8 - r1
            goto L2e
        L2c:
            r7 = move-exception
            goto L5a
        L2e:
            int r0 = r6.f52297b     // Catch: java.lang.Throwable -> L2c
            r1 = -1
            if (r0 != r1) goto L43
            int r2 = r6.f52298c     // Catch: java.lang.Throwable -> L2c
            if (r2 == r1) goto L38
            goto L43
        L38:
            int r0 = r6.f52296a     // Catch: java.lang.Throwable -> L2c
            if (r0 == 0) goto L54
            int r1 = r8 - r7
            if (r1 >= r0) goto L54
            int r8 = r7 + r0
            goto L54
        L43:
            if (r0 == r1) goto L4a
            r2 = 0
            int r7 = kh2.p2.U(r7, r2, r0)     // Catch: java.lang.Throwable -> L2c
        L4a:
            int r0 = r6.f52298c     // Catch: java.lang.Throwable -> L2c
            if (r0 == r1) goto L54
            int r1 = r6.f52306k     // Catch: java.lang.Throwable -> L2c
            int r8 = kh2.p2.U(r8, r0, r1)     // Catch: java.lang.Throwable -> L2c
        L54:
            boolean r7 = super.e(r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r6)
            return r7
        L5a:
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.ui.components.rangesliders.RangeSliderBar.e(int, int, boolean, boolean):boolean");
    }

    @Override // com.pinterest.ui.components.rangesliders.RangeProgressBar, android.view.View
    public final CharSequence getAccessibilityClassName() {
        String name = RangeSliderBar.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return name;
    }

    public final void j(Canvas canvas) {
        int save = canvas.save();
        canvas.translate(getPaddingStart() - this.K, getPaddingTop());
        this.N.draw(canvas);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        tn1.c cVar = new tn1.c(context, new tn1.b(tn1.c.f118612d.b(), tn1.c.f118618j, g.BODY_200, 2));
        canvas.drawText(String.valueOf(this.f52305j), this.N.getBounds().right, this.N.getBounds().top - 40.0f, cVar);
        this.O.draw(canvas);
        canvas.drawText(String.valueOf(this.f52304i), this.O.getBounds().right, this.O.getBounds().top - 40.0f, cVar);
        canvas.restoreToCount(save);
    }

    @Override // com.pinterest.ui.components.rangesliders.RangeProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.N.jumpToCurrentState();
        this.O.jumpToCurrentState();
    }

    public final void k(int i13, int i14) {
        j jVar = this.H;
        if (jVar != null) {
            Intrinsics.checkNotNullParameter(this, "seekBar");
            if (jVar.isBound()) {
                if (i13 != jVar.f62067f) {
                    jVar.f62067f = i13;
                    de1.j jVar2 = (de1.j) jVar.getView();
                    String text = jVar.p3(jVar.f62067f);
                    RangeFilterItem rangeFilterItem = (RangeFilterItem) jVar2;
                    rangeFilterItem.getClass();
                    Intrinsics.checkNotNullParameter(text, "text");
                    a0.p(rangeFilterItem.f48488a, text);
                }
                if (i14 != jVar.f62068g) {
                    jVar.f62068g = i14;
                    r rVar = jVar.f62062a;
                    if (rVar != null) {
                        int i15 = rVar.f141750e;
                        ((RangeFilterItem) ((de1.j) jVar.getView())).b(i14 == i15 ? a.C(jVar.p3(i15), "+") : jVar.p3(i14));
                    }
                }
                jVar.q3();
            }
        }
    }

    public final void l() {
        this.T = true;
        j jVar = this.H;
        if (jVar != null) {
            c currentThumbPosition = this.U;
            Intrinsics.checkNotNullParameter(currentThumbPosition, "currentThumbPosition");
            if (jVar.isBound()) {
                int i13 = i.f62061a[currentThumbPosition.ordinal()];
                if (i13 == 1) {
                    RangeFilterItem rangeFilterItem = (RangeFilterItem) ((de1.j) jVar.getView());
                    rangeFilterItem.a(rangeFilterItem.f48488a, 1.5f);
                } else {
                    if (i13 != 2) {
                        return;
                    }
                    RangeFilterItem rangeFilterItem2 = (RangeFilterItem) ((de1.j) jVar.getView());
                    rangeFilterItem2.a(rangeFilterItem2.f48489b, 1.5f);
                }
            }
        }
    }

    public final void m() {
        this.T = false;
        j jVar = this.H;
        if (jVar != null) {
            c currentThumbPosition = this.U;
            Intrinsics.checkNotNullParameter(currentThumbPosition, "currentThumbPosition");
            if (jVar.isBound()) {
                int i13 = i.f62061a[currentThumbPosition.ordinal()];
                if (i13 == 1) {
                    RangeFilterItem rangeFilterItem = (RangeFilterItem) ((de1.j) jVar.getView());
                    rangeFilterItem.a(rangeFilterItem.f48488a, 1.0f);
                } else if (i13 == 2) {
                    RangeFilterItem rangeFilterItem2 = (RangeFilterItem) ((de1.j) jVar.getView());
                    rangeFilterItem2.a(rangeFilterItem2.f48489b, 1.0f);
                }
                h hVar = jVar.f62063b;
                if ((hVar instanceof b0 ? (b0) hVar : null) != null) {
                    o0 o0Var = (o0) ((b0) hVar);
                    String str = o0Var.f54615s;
                    f N3 = str != null ? o0.N3(str) : null;
                    if (N3 != null && n0.f54609a[N3.ordinal()] == 1) {
                        d0 pinalytics = o0Var.getPinalytics();
                        f1 f1Var = f1.TAP;
                        g0 g0Var = g0.RANGE_FILTER;
                        HashMap hashMap = new HashMap();
                        hashMap.putAll(o0Var.M3());
                        Unit unit = Unit.f80348a;
                        d0.B(pinalytics, f1Var, g0Var, null, hashMap, 20);
                    }
                    o0Var.f54617u = false;
                }
            }
        }
    }

    public final void n(Drawable drawable, int[] iArr) {
        if (drawable != null && drawable.isStateful() && drawable.setState(iArr)) {
            invalidateDrawable(drawable);
        }
    }

    public final void o(int i13, int i14) {
        this.D = i13;
        this.E = i14;
        int i15 = this.f52297b;
        if (i15 != -1 || this.f52298c != -1) {
            if (i15 != -1) {
                this.D = Math.min(i13, i15);
            }
            int i16 = this.f52298c;
            if (i16 != -1) {
                this.E = Math.max(this.E, i16);
                return;
            }
            return;
        }
        int i17 = this.f52296a;
        if (i17 == 0 || i14 - i13 >= i17) {
            return;
        }
        int max = Math.max(0, i14 - i17);
        this.D = max;
        this.E = Math.min(this.f52306k, max + this.f52296a);
    }

    @Override // com.pinterest.ui.components.rangesliders.RangeProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        j(canvas);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info2) {
        Intrinsics.checkNotNullParameter(info2, "info");
        super.onInitializeAccessibilityNodeInfo(info2);
        info2.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        if (r5 != 81) goto L21;
     */
    @Override // android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onKeyDown(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L3e
            int r0 = r4.P
            r1 = 21
            r2 = 1
            if (r5 == r1) goto L30
            r1 = 22
            if (r5 == r1) goto L23
            r1 = 69
            if (r5 == r1) goto L30
            r1 = 70
            if (r5 == r1) goto L23
            r1 = 81
            if (r5 == r1) goto L23
            goto L3e
        L23:
            int r1 = r4.f52305j
            int r1 = r1 - r0
            int r3 = r4.f52304i
            int r3 = r3 + r0
            boolean r0 = r4.e(r1, r3, r2, r2)
            if (r0 == 0) goto L3e
            return r2
        L30:
            int r0 = -r0
            int r1 = r4.f52305j
            int r1 = r1 - r0
            int r3 = r4.f52304i
            int r3 = r3 + r0
            boolean r0 = r4.e(r1, r3, r2, r2)
            if (r0 == 0) goto L3e
            return r2
        L3e:
            boolean r5 = super.onKeyDown(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.ui.components.rangesliders.RangeSliderBar.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // com.pinterest.ui.components.rangesliders.RangeProgressBar, android.view.View
    public final synchronized void onMeasure(int i13, int i14) {
        int i15;
        int i16;
        try {
            Drawable drawable = this.f52309n;
            int intrinsicHeight = this.N.getIntrinsicHeight();
            if (drawable != null) {
                i16 = Math.max(this.f52299d, Math.min(this.f52300e, drawable.getIntrinsicWidth()));
                i15 = Math.max(intrinsicHeight, Math.max(this.f52301f, Math.min(this.f52302g, drawable.getIntrinsicHeight())));
            } else {
                i15 = 0;
                i16 = 0;
            }
            setMeasuredDimension(View.resolveSizeAndState(getPaddingStart() + getPaddingEnd() + i16, i13, 0), View.resolveSizeAndState(getPaddingTop() + getPaddingBottom() + i15, i14, 0));
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // com.pinterest.ui.components.rangesliders.RangeProgressBar, android.view.View
    public final void onSizeChanged(int i13, int i14, int i15, int i16) {
        int i17;
        int i18;
        h(i13, i14);
        int paddingTop = (i14 - getPaddingTop()) - getPaddingBottom();
        Drawable drawable = this.f52309n;
        Drawable drawable2 = this.N;
        int min = Math.min(this.f52302g, paddingTop);
        int intrinsicHeight = drawable2.getIntrinsicHeight();
        if (intrinsicHeight > min) {
            i18 = (paddingTop - intrinsicHeight) / 2;
            i17 = a.b(intrinsicHeight, min, 2, i18);
        } else {
            int i19 = (paddingTop - min) / 2;
            int b13 = a.b(min, intrinsicHeight, 2, i19);
            i17 = i19;
            i18 = b13;
        }
        if (drawable != null) {
            drawable.setBounds(0, i17, (i13 - getPaddingEnd()) - getPaddingStart(), min + i17);
        }
        Drawable drawable3 = this.N;
        float f13 = this.f52306k;
        r(i13, drawable3, f13 > 0.0f ? this.f52305j / f13 : 0.0f, c.Start, i18);
        Drawable drawable4 = this.O;
        float f14 = this.f52306k;
        r(i13, drawable4, f14 > 0.0f ? this.f52304i / f14 : 0.0f, c.End, i18);
        Drawable background = getBackground();
        if (background != null) {
            Rect bounds = drawable2.getBounds();
            Intrinsics.checkNotNullExpressionValue(bounds, "getBounds(...)");
            background.setBounds(bounds);
            background.setHotspotBounds(bounds.left, bounds.top, bounds.right, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!isEnabled()) {
            return false;
        }
        int action = event.getAction();
        if (action == 0) {
            ViewParent parent = getParent();
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    s(event);
                    break;
                }
                if (((ViewGroup) parent).shouldDelayChildPressedState()) {
                    this.S = event.getX();
                    break;
                }
                parent = parent.getParent();
            }
        } else if (action == 1) {
            if (this.T) {
                t(event);
                m();
                setPressed(false);
            } else {
                l();
                t(event);
                m();
                performClick();
            }
            invalidate();
        } else if (action != 2) {
            if (action == 3) {
                if (this.T) {
                    m();
                    setPressed(false);
                }
                invalidate();
            }
        } else if (this.T) {
            t(event);
        } else if (Math.abs(event.getX() - this.S) > this.R) {
            s(event);
        }
        return true;
    }

    public final void p(int i13) {
        int i14;
        int i15;
        if (i13 > this.f52306k) {
            throw new IllegalArgumentException("stepSize cannot be greater than max value");
        }
        if (i13 != 0) {
            this.f52298c = -1;
            this.f52297b = -1;
        }
        this.f52296a = i13;
        if (i13 != 0 && (i15 = i13 % (i14 = this.L)) != 0) {
            this.f52296a = Math.max(i14, i13 - i15);
        }
        if (this.f52307l) {
            e(this.f52305j, this.f52304i, false, false);
        }
    }

    public final void q(Drawable drawable, c cVar) {
        drawable.setCallback(this);
        WeakHashMap weakHashMap = v0.f102521a;
        drawable.setLayoutDirection(getLayoutDirection());
        this.K = drawable.getIntrinsicWidth() / 2;
        this.I = drawable.getIntrinsicWidth();
        this.f52324J = drawable.getIntrinsicHeight();
        if (cVar == c.Start) {
            this.N = drawable;
        } else {
            this.O = drawable;
        }
        Unit unit = Unit.f80348a;
        invalidate();
    }

    public final void r(int i13, Drawable drawable, float f13, c cVar, int i14) {
        int i15;
        int paddingStart = (i13 - getPaddingStart()) - getPaddingEnd();
        int i16 = this.f52303h;
        int i17 = (int) ((f13 * ((this.K * 2) + ((paddingStart - i16) - this.I))) + 0.5f);
        if (i14 == Integer.MIN_VALUE) {
            Rect bounds = drawable.getBounds();
            Intrinsics.checkNotNullExpressionValue(bounds, "getBounds(...)");
            i14 = bounds.top;
            i15 = bounds.bottom;
        } else {
            i15 = this.f52324J + i14;
        }
        int i18 = this.I + i17;
        if (cVar == c.End) {
            i17 += i16;
            i18 += i16;
        }
        Drawable background = getBackground();
        if (background != null && cVar == this.U) {
            int paddingStart2 = getPaddingStart() - this.K;
            int paddingTop = getPaddingTop();
            int i19 = i17 + paddingStart2;
            int i23 = i14 + paddingTop;
            int i24 = paddingStart2 + i18;
            int i25 = paddingTop + i15;
            background.setBounds(i19, i23, i24, i25);
            background.setHotspotBounds(i19, i23, i24, i25);
        }
        drawable.setBounds(i17, i14, i18, i15);
    }

    public final void s(MotionEvent motionEvent) {
        float f13;
        int i13;
        float x13 = motionEvent.getX() - (getPaddingStart() - this.K);
        float y13 = motionEvent.getY();
        Drawable drawable = this.N;
        Rect rect = this.F;
        drawable.copyBounds(rect);
        rect.inset(rect.width() / 4, rect.height() / 4);
        Drawable drawable2 = this.O;
        Rect rect2 = this.G;
        drawable2.copyBounds(rect2);
        rect2.inset(rect2.width() / 4, rect2.height() / 4);
        float abs = Math.abs(x13 - rect.centerX());
        float abs2 = Math.abs(x13 - rect2.centerX());
        int i14 = (int) x13;
        int i15 = (int) y13;
        this.U = rect.contains(i14, i15) ? c.Start : rect2.contains(i14, i15) ? c.End : abs < abs2 ? c.Start : c.End;
        setPressed(true);
        c cVar = this.U;
        if (cVar != c.None) {
            c cVar2 = c.Start;
            Drawable drawable3 = cVar == cVar2 ? this.N : this.O;
            float f14 = 0.0f;
            if (cVar == cVar2) {
                f13 = this.f52306k;
                if (f13 > 0.0f) {
                    i13 = this.f52305j;
                    f14 = i13 / f13;
                }
                r(getWidth(), drawable3, f14, this.U, Integer.MIN_VALUE);
                invalidate();
            } else {
                f13 = this.f52306k;
                if (f13 > 0.0f) {
                    i13 = this.f52304i;
                    f14 = i13 / f13;
                }
                r(getWidth(), drawable3, f14, this.U, Integer.MIN_VALUE);
                invalidate();
            }
        }
        l();
        t(motionEvent);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override // android.view.View
    public final void setPressed(boolean z13) {
        if (!z13) {
            this.U = c.None;
        }
        super.setPressed(z13);
    }

    public final void t(MotionEvent motionEvent) {
        float x13 = motionEvent.getX();
        int width = getWidth();
        c cVar = this.U;
        c cVar2 = c.End;
        int i13 = this.f52303h;
        if (cVar == cVar2) {
            x13 -= i13;
        }
        int intrinsicWidth = this.N.getIntrinsicWidth();
        int paddingStart = (((width - getPaddingStart()) - getPaddingEnd()) - i13) - intrinsicWidth;
        float f13 = (x13 - (intrinsicWidth / 2.0f)) + this.K;
        float paddingStart2 = f13 < ((float) getPaddingStart()) ? 0.0f : f13 > ((float) (width - getPaddingEnd())) ? 1.0f : (f13 - getPaddingStart()) / ((r3 * 2) + paddingStart);
        float f14 = this.f52306k;
        float f15 = (paddingStart2 * f14) + 0.0f;
        c cVar3 = this.U;
        if (cVar3 == c.Start) {
            int i14 = this.f52297b;
            if (i14 == -1) {
                i14 = this.f52304i - this.f52296a;
            }
            float f16 = i14;
            e(ml2.c.c(f15 >= 0.0f ? f15 > f16 ? f16 : f15 : 0.0f), this.f52304i, true, false);
            return;
        }
        if (cVar3 == cVar2) {
            int i15 = this.f52298c;
            if (i15 == -1) {
                i15 = this.f52305j + this.f52296a;
            }
            float f17 = i15;
            if (f15 < f17) {
                f14 = f17;
            } else if (f15 <= f14) {
                f14 = f15;
            }
            e(this.f52305j, ml2.c.c(f14), true, false);
        }
    }

    @Override // com.pinterest.ui.components.rangesliders.RangeProgressBar, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        return drawable == this.N || drawable == this.O || super.verifyDrawable(drawable);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RangeSliderBar(@NotNull Context context, AttributeSet attributeSet, int i13) {
        this(i13, 8, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public RangeSliderBar(int r5, int r6, android.content.Context r7, android.util.AttributeSet r8) {
        /*
            r4 = this;
            r6 = r6 & 4
            if (r6 == 0) goto L6
            int r5 = mz1.a.range_slider_style
        L6:
            java.lang.String r6 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r6)
            r4.<init>(r7, r8, r5)
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>()
            r4.F = r6
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>()
            r4.G = r6
            r6 = 1
            r4.L = r6
            r4.P = r6
            ma2.c r0 = ma2.c.None
            r4.U = r0
            r0 = 0
            r4.f52307l = r0
            int[] r1 = mz1.h.RangeSliderBar
            android.content.res.TypedArray r5 = r7.obtainStyledAttributes(r8, r1, r5, r0)
            java.lang.String r8 = "obtainStyledAttributes(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r8)
            int r8 = mz1.h.RangeSliderBar_range_slider_leftThumb
            boolean r8 = r5.hasValue(r8)
            if (r8 == 0) goto L42
            int r8 = mz1.h.RangeSliderBar_range_slider_leftThumb
            android.graphics.drawable.Drawable r8 = r5.getDrawable(r8)
            goto L48
        L42:
            int r8 = mz1.h.RangeSliderBar_android_thumb
            android.graphics.drawable.Drawable r8 = r5.getDrawable(r8)
        L48:
            java.lang.String r1 = "null cannot be cast to non-null type android.graphics.drawable.Drawable"
            if (r8 != 0) goto L57
            int r8 = mz1.d.range_slider_thumb_animation
            java.lang.Object r2 = d5.a.f53679a
            android.graphics.drawable.Drawable r8 = r7.getDrawable(r8)
            kotlin.jvm.internal.Intrinsics.g(r8, r1)
        L57:
            int r2 = mz1.h.RangeSliderBar_range_slider_rightThumb
            boolean r2 = r5.hasValue(r2)
            if (r2 == 0) goto L66
            int r2 = mz1.h.RangeSliderBar_range_slider_rightThumb
            android.graphics.drawable.Drawable r2 = r5.getDrawable(r2)
            goto L6c
        L66:
            int r2 = mz1.h.RangeSliderBar_android_thumb
            android.graphics.drawable.Drawable r2 = r5.getDrawable(r2)
        L6c:
            if (r2 != 0) goto L76
            int r2 = mz1.d.range_slider_thumb_animation
            java.lang.Object r3 = d5.a.f53679a
            android.graphics.drawable.Drawable r2 = r7.getDrawable(r2)
        L76:
            kotlin.jvm.internal.Intrinsics.g(r2, r1)
            ma2.c r1 = ma2.c.Start
            r4.q(r8, r1)
            r4.N = r8
            ma2.c r8 = ma2.c.End
            r4.q(r2, r8)
            r4.O = r2
            int r8 = mz1.h.RangeSliderBar_android_splitTrack
            r5.getBoolean(r8, r0)
            int r8 = mz1.h.RangeSliderBar_range_slider_stepSize
            boolean r8 = r5.hasValue(r8)
            if (r8 == 0) goto La8
            int r8 = mz1.h.RangeSliderBar_range_slider_stepSize
            int r8 = r5.getInt(r8, r6)
            r4.L = r8
            int r8 = r4.f52296a
            r4.p(r8)
            int r8 = r4.f52305j
            int r1 = r4.f52304i
            r4.e(r8, r1, r0, r0)
        La8:
            int r8 = r4.f52296a
            r4.p(r8)
            int r8 = mz1.h.RangeSliderBar_range_slider_thumbInset
            int r0 = r4.M
            int r8 = r5.getDimensionPixelSize(r8, r0)
            r4.M = r8
            int r8 = mz1.h.RangeSliderBar_android_thumbOffset
            int r0 = r4.K
            int r8 = r5.getDimensionPixelOffset(r8, r0)
            r4.K = r8
            r4.invalidate()
            int r8 = mz1.h.RangeSliderBar_range_slider_useDisabledAlpha
            boolean r8 = r5.getBoolean(r8, r6)
            r5.recycle()
            if (r8 == 0) goto Ld2
            r5 = 1056964608(0x3f000000, float:0.5)
            goto Ld4
        Ld2:
            r5 = 1065353216(0x3f800000, float:1.0)
        Ld4:
            r4.Q = r5
            android.view.ViewConfiguration r5 = android.view.ViewConfiguration.get(r7)
            int r5 = r5.getScaledTouchSlop()
            r4.R = r5
            int r5 = r4.D
            int r7 = r4.E
            r4.o(r5, r7)
            java.lang.String r5 = "listener"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r5)
            r4.A = r4
            r4.f52307l = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.ui.components.rangesliders.RangeSliderBar.<init>(int, int, android.content.Context, android.util.AttributeSet):void");
    }
}
