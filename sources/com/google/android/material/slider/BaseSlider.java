package com.google.android.material.slider;

import a.cb;
import android.R;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Size;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.SeekBar;
import androidx.annotation.NonNull;
import bk.m;
import bk.o;
import com.google.android.material.internal.a0;
import com.google.android.material.internal.d0;
import com.google.android.material.internal.f0;
import com.google.android.material.slider.BaseSlider;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.shuffles.cutout.editor.ui.widget.SizeSlider;
import fj.l;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import oi.u6;
import q5.v0;
import z62.a;
import z62.c;

/* loaded from: classes3.dex */
abstract class BaseSlider<S extends BaseSlider<S, L, T>, L extends z62.a, T extends z62.c> extends View {

    /* renamed from: t0 */
    public static final int f33043t0 = l.Widget_MaterialComponents_Slider;

    /* renamed from: u0 */
    public static final int f33044u0 = fj.c.motionDurationMedium4;

    /* renamed from: v0 */
    public static final int f33045v0 = fj.c.motionDurationShort3;

    /* renamed from: w0 */
    public static final int f33046w0 = fj.c.motionEasingEmphasizedInterpolator;

    /* renamed from: x0 */
    public static final int f33047x0 = fj.c.motionEasingEmphasizedAccelerateInterpolator;
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;

    /* renamed from: J */
    public int f33048J;
    public int K;
    public int L;
    public final int M;
    public float N;
    public MotionEvent O;
    public boolean P;
    public float Q;
    public float R;
    public ArrayList S;
    public int T;
    public int U;
    public float V;
    public float[] W;

    /* renamed from: a */
    public final Paint f33049a;

    /* renamed from: a0 */
    public final boolean f33050a0;

    /* renamed from: b */
    public final Paint f33051b;

    /* renamed from: b0 */
    public int f33052b0;

    /* renamed from: c */
    public final Paint f33053c;

    /* renamed from: c0 */
    public int f33054c0;

    /* renamed from: d */
    public final Paint f33055d;

    /* renamed from: d0 */
    public int f33056d0;

    /* renamed from: e */
    public final Paint f33057e;

    /* renamed from: e0 */
    public boolean f33058e0;

    /* renamed from: f */
    public final Paint f33059f;

    /* renamed from: f0 */
    public boolean f33060f0;

    /* renamed from: g */
    public final Paint f33061g;

    /* renamed from: g0 */
    public ColorStateList f33062g0;

    /* renamed from: h */
    public final f f33063h;

    /* renamed from: h0 */
    public ColorStateList f33064h0;

    /* renamed from: i */
    public final AccessibilityManager f33065i;

    /* renamed from: i0 */
    public ColorStateList f33066i0;

    /* renamed from: j */
    public e f33067j;

    /* renamed from: j0 */
    public ColorStateList f33068j0;

    /* renamed from: k */
    public final int f33069k;

    /* renamed from: k0 */
    public ColorStateList f33070k0;

    /* renamed from: l */
    public final ArrayList f33071l;

    /* renamed from: l0 */
    public final Path f33072l0;

    /* renamed from: m */
    public final ArrayList f33073m;

    /* renamed from: m0 */
    public final RectF f33074m0;

    /* renamed from: n */
    public final ArrayList f33075n;

    /* renamed from: n0 */
    public final RectF f33076n0;

    /* renamed from: o */
    public boolean f33077o;

    /* renamed from: o0 */
    public final bk.i f33078o0;

    /* renamed from: p */
    public ValueAnimator f33079p;

    /* renamed from: p0 */
    public final List f33080p0;

    /* renamed from: q */
    public ValueAnimator f33081q;

    /* renamed from: q0 */
    public float f33082q0;

    /* renamed from: r */
    public final int f33083r;

    /* renamed from: r0 */
    public int f33084r0;

    /* renamed from: s */
    public final int f33085s;

    /* renamed from: s0 */
    public final a f33086s0;

    /* renamed from: t */
    public final int f33087t;

    /* renamed from: u */
    public final int f33088u;

    /* renamed from: v */
    public final int f33089v;

    /* renamed from: w */
    public final int f33090w;

    /* renamed from: x */
    public final int f33091x;

    /* renamed from: y */
    public final int f33092y;

    /* renamed from: z */
    public final int f33093z;

    public static class SliderState extends View.BaseSavedState {
        public static final Parcelable.Creator<SliderState> CREATOR = new h();

        /* renamed from: a */
        public float f33094a;

        /* renamed from: b */
        public float f33095b;

        /* renamed from: c */
        public ArrayList f33096c;

        /* renamed from: d */
        public float f33097d;

        /* renamed from: e */
        public boolean f33098e;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            super.writeToParcel(parcel, i13);
            parcel.writeFloat(this.f33094a);
            parcel.writeFloat(this.f33095b);
            parcel.writeList(this.f33096c);
            parcel.writeFloat(this.f33097d);
            parcel.writeBooleanArray(new boolean[]{this.f33098e});
        }
    }

    public BaseSlider(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, fj.c.sliderStyle);
    }

    public void A(float f13) {
        this.f33078o0.s(f13);
    }

    public void B(int i13) {
        if (i13 == this.F) {
            return;
        }
        this.F = i13;
        this.f33078o0.setBounds(0, 0, this.E, i13);
        Iterator it = this.f33080p0.iterator();
        while (it.hasNext()) {
            a((Drawable) it.next());
        }
        Y();
    }

    public void C(ColorStateList colorStateList) {
        this.f33078o0.y(colorStateList);
        postInvalidate();
    }

    public void D(float f13) {
        bk.i iVar = this.f33078o0;
        iVar.f23052a.f23040k = f13;
        iVar.invalidateSelf();
        postInvalidate();
    }

    public void E(int i13) {
        if (this.H == i13) {
            return;
        }
        this.H = i13;
        invalidate();
    }

    public void F(int i13) {
        if (i13 == this.E) {
            return;
        }
        this.E = i13;
        m mVar = new m();
        mVar.d(this.E / 2.0f);
        o a13 = mVar.a();
        bk.i iVar = this.f33078o0;
        iVar.Y0(a13);
        iVar.setBounds(0, 0, this.E, this.F);
        Iterator it = this.f33080p0.iterator();
        while (it.hasNext()) {
            a((Drawable) it.next());
        }
        Y();
    }

    public void G(int i13) {
        if (this.f33052b0 != i13) {
            this.f33052b0 = i13;
            this.f33059f.setStrokeWidth(i13 * 2);
            Y();
        }
    }

    public void H(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f33064h0)) {
            return;
        }
        this.f33064h0 = colorStateList;
        this.f33059f.setColor(i(colorStateList));
        invalidate();
    }

    public void I(int i13) {
        if (this.f33054c0 != i13) {
            this.f33054c0 = i13;
            this.f33057e.setStrokeWidth(i13 * 2);
            Y();
        }
    }

    public void J(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f33066i0)) {
            return;
        }
        this.f33066i0 = colorStateList;
        this.f33057e.setColor(i(colorStateList));
        invalidate();
    }

    public void K(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f33068j0)) {
            return;
        }
        this.f33068j0 = colorStateList;
        this.f33051b.setColor(i(colorStateList));
        this.f33061g.setColor(i(this.f33068j0));
        invalidate();
    }

    public void L(int i13) {
        if (this.C != i13) {
            this.C = i13;
            this.f33049a.setStrokeWidth(i13);
            this.f33051b.setStrokeWidth(this.C);
            Y();
        }
    }

    public void M(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f33070k0)) {
            return;
        }
        this.f33070k0 = colorStateList;
        this.f33049a.setColor(i(colorStateList));
        invalidate();
    }

    public void N(int i13) {
        if (this.L == i13) {
            return;
        }
        this.L = i13;
        invalidate();
    }

    public void O(int i13) {
        if (this.K == i13) {
            return;
        }
        this.K = i13;
        this.f33061g.setStrokeWidth(i13);
        invalidate();
    }

    public final void P(gk.a aVar, float f13) {
        String g13 = g(f13);
        if (!TextUtils.equals(aVar.f65202y, g13)) {
            aVar.f65202y = g13;
            aVar.B.f32703e = true;
            aVar.invalidateSelf();
        }
        int u13 = (this.D + ((int) (u(f13) * this.f33056d0))) - (aVar.getIntrinsicWidth() / 2);
        int b13 = b() - ((this.F / 2) + this.M);
        aVar.setBounds(u13, b13 - aVar.getIntrinsicHeight(), aVar.getIntrinsicWidth() + u13, b13);
        Rect rect = new Rect(aVar.getBounds());
        com.google.android.material.internal.d.c(l0.q0(this), this, rect);
        aVar.setBounds(rect);
        u6 r03 = l0.r0(this);
        switch (r03.f95224a) {
            case 14:
                f0 f0Var = (f0) r03.f95225b;
                if (f0Var.f32764b) {
                    throw new IllegalStateException("This overlay was disposed already. Please use a new one via ViewGroupUtils.getOverlay()");
                }
                if (f0Var.f32763a == null) {
                    f0Var.f32763a = new ArrayList();
                }
                if (f0Var.f32763a.contains(aVar)) {
                    return;
                }
                f0Var.f32763a.add(aVar);
                f0Var.invalidate(aVar.getBounds());
                aVar.setCallback(f0Var);
                return;
            default:
                ((ViewOverlay) r03.f95225b).add(aVar);
                return;
        }
    }

    public void Q(Float... fArr) {
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, fArr);
        R(arrayList);
    }

    public final void R(ArrayList arrayList) {
        int i13;
        int i14;
        int i15;
        ViewGroup q03;
        int resourceId;
        u6 r03;
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("At least one value must be set");
        }
        Collections.sort(arrayList);
        if (this.S.size() == arrayList.size() && this.S.equals(arrayList)) {
            return;
        }
        this.S = arrayList;
        this.f33060f0 = true;
        this.U = 0;
        V();
        ArrayList arrayList2 = this.f33071l;
        if (arrayList2.size() > this.S.size()) {
            List<gk.a> subList = arrayList2.subList(this.S.size(), arrayList2.size());
            for (gk.a aVar : subList) {
                WeakHashMap weakHashMap = v0.f102521a;
                if (isAttachedToWindow() && (r03 = l0.r0(this)) != null) {
                    r03.m(aVar);
                    ViewGroup q04 = l0.q0(this);
                    if (q04 == null) {
                        aVar.getClass();
                    } else {
                        q04.removeOnLayoutChangeListener(aVar.C);
                    }
                }
            }
            subList.clear();
        }
        while (arrayList2.size() < this.S.size()) {
            Context context = getContext();
            int i16 = this.f33069k;
            gk.a aVar2 = new gk.a(context, i16);
            TypedArray f13 = d0.f(aVar2.f65203z, null, fj.m.Tooltip, 0, i16, new int[0]);
            Context context2 = aVar2.f65203z;
            aVar2.f65201J = context2.getResources().getDimensionPixelSize(fj.e.mtrl_tooltip_arrowSize);
            boolean z13 = f13.getBoolean(fj.m.Tooltip_showMarker, true);
            aVar2.I = z13;
            if (z13) {
                m h10 = aVar2.f23052a.f23030a.h();
                h10.f23088k = aVar2.D();
                aVar2.Y0(h10.a());
            } else {
                aVar2.f65201J = 0;
            }
            CharSequence text = f13.getText(fj.m.Tooltip_android_text);
            boolean equals = TextUtils.equals(aVar2.f65202y, text);
            a0 a0Var = aVar2.B;
            if (!equals) {
                aVar2.f65202y = text;
                a0Var.f32703e = true;
                aVar2.invalidateSelf();
            }
            int i17 = fj.m.Tooltip_android_textAppearance;
            yj.e eVar = (!f13.hasValue(i17) || (resourceId = f13.getResourceId(i17, 0)) == 0) ? null : new yj.e(context2, resourceId);
            if (eVar != null && f13.hasValue(fj.m.Tooltip_android_textColor)) {
                eVar.f139200j = com.bumptech.glide.d.H(context2, f13, fj.m.Tooltip_android_textColor);
            }
            a0Var.c(eVar, context2);
            TypedValue Y0 = com.bumptech.glide.c.Y0(fj.c.colorOnBackground, context2, gk.a.class.getCanonicalName());
            int i18 = Y0.resourceId;
            if (i18 != 0) {
                Object obj = d5.a.f53679a;
                i13 = context2.getColor(i18);
            } else {
                i13 = Y0.data;
            }
            TypedValue Y02 = com.bumptech.glide.c.Y0(R.attr.colorBackground, context2, gk.a.class.getCanonicalName());
            int i19 = Y02.resourceId;
            if (i19 != 0) {
                Object obj2 = d5.a.f53679a;
                i14 = context2.getColor(i19);
            } else {
                i14 = Y02.data;
            }
            aVar2.t(ColorStateList.valueOf(f13.getColor(fj.m.Tooltip_backgroundTint, f5.c.g(f5.c.j(i13, RecyclerViewTypes.VIEW_TYPE_STANDARD_FILTER_ITEM), f5.c.j(i14, RecyclerViewTypes.VIEW_TYPE_IN_LINE_VTO)))));
            TypedValue Y03 = com.bumptech.glide.c.Y0(fj.c.colorSurface, context2, gk.a.class.getCanonicalName());
            int i23 = Y03.resourceId;
            if (i23 != 0) {
                Object obj3 = d5.a.f53679a;
                i15 = context2.getColor(i23);
            } else {
                i15 = Y03.data;
            }
            aVar2.y(ColorStateList.valueOf(i15));
            aVar2.E = f13.getDimensionPixelSize(fj.m.Tooltip_android_padding, 0);
            aVar2.F = f13.getDimensionPixelSize(fj.m.Tooltip_android_minWidth, 0);
            aVar2.G = f13.getDimensionPixelSize(fj.m.Tooltip_android_minHeight, 0);
            aVar2.H = f13.getDimensionPixelSize(fj.m.Tooltip_android_layout_margin, 0);
            f13.recycle();
            arrayList2.add(aVar2);
            WeakHashMap weakHashMap2 = v0.f102521a;
            if (isAttachedToWindow() && (q03 = l0.q0(this)) != null) {
                int[] iArr = new int[2];
                q03.getLocationOnScreen(iArr);
                aVar2.K = iArr[0];
                q03.getWindowVisibleDisplayFrame(aVar2.D);
                q03.addOnLayoutChangeListener(aVar2.C);
            }
        }
        int i24 = arrayList2.size() == 1 ? 0 : 1;
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            gk.a aVar3 = (gk.a) it.next();
            aVar3.f23052a.f23040k = i24;
            aVar3.invalidateSelf();
        }
        Iterator it2 = this.f33073m.iterator();
        while (it2.hasNext()) {
            z62.a aVar4 = (z62.a) it2.next();
            Iterator it3 = this.S.iterator();
            while (it3.hasNext()) {
                ((Float) it3.next()).getClass();
                aVar4.getClass();
                int i25 = SizeSlider.f51990d;
                SizeSlider this$0 = aVar4.f140893a;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter((Slider) this, "<anonymous parameter 0>");
                s81.g gVar = this$0.f51992b;
                this$0.removeCallbacks(gVar);
                this$0.postDelayed(gVar, 1000L);
            }
        }
        postInvalidate();
    }

    public final boolean S(int i13, float f13) {
        this.U = i13;
        if (Math.abs(f13 - ((Float) this.S.get(i13)).floatValue()) < 1.0E-4d) {
            return false;
        }
        float j13 = j();
        if (this.f33084r0 == 0) {
            if (j13 == 0.0f) {
                j13 = 0.0f;
            } else {
                float f14 = this.Q;
                j13 = ep.b.a(f14, this.R, (j13 - this.D) / this.f33056d0, f14);
            }
        }
        if (q()) {
            j13 = -j13;
        }
        int i14 = i13 + 1;
        int i15 = i13 - 1;
        this.S.set(i13, Float.valueOf(com.bumptech.glide.c.p(f13, i15 < 0 ? this.Q : j13 + ((Float) this.S.get(i15)).floatValue(), i14 >= this.S.size() ? this.R : ((Float) this.S.get(i14)).floatValue() - j13)));
        Iterator it = this.f33073m.iterator();
        while (it.hasNext()) {
            z62.a aVar = (z62.a) it.next();
            ((Float) this.S.get(i13)).getClass();
            aVar.getClass();
            int i16 = SizeSlider.f51990d;
            SizeSlider this$0 = aVar.f140893a;
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter((Slider) this, "<anonymous parameter 0>");
            this$0.getClass();
            s81.g gVar = this$0.f51992b;
            this$0.removeCallbacks(gVar);
            this$0.postDelayed(gVar, 1000L);
        }
        AccessibilityManager accessibilityManager = this.f33065i;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            return true;
        }
        e eVar = this.f33067j;
        if (eVar == null) {
            this.f33067j = new e(this);
        } else {
            removeCallbacks(eVar);
        }
        e eVar2 = this.f33067j;
        eVar2.f33107a = i13;
        postDelayed(eVar2, 200L);
        return true;
    }

    public final void T() {
        double d2;
        float f13 = this.f33082q0;
        float f14 = this.V;
        if (f14 > 0.0f) {
            d2 = Math.round(f13 * r1) / ((int) ((this.R - this.Q) / f14));
        } else {
            d2 = f13;
        }
        if (q()) {
            d2 = 1.0d - d2;
        }
        float f15 = this.R;
        S(this.T, (float) ((d2 * (f15 - r1)) + this.Q));
    }

    public final void U(int i13, Rect rect) {
        int u13 = this.D + ((int) (u(((Float) n().get(i13)).floatValue()) * this.f33056d0));
        int b13 = b();
        int max = Math.max(this.E / 2, this.f33092y / 2);
        int max2 = Math.max(this.F / 2, this.f33092y / 2);
        rect.set(u13 - max, b13 - max2, u13 + max, b13 + max2);
    }

    public final void V() {
        if ((!(getBackground() instanceof RippleDrawable)) || getMeasuredWidth() <= 0) {
            return;
        }
        Drawable background = getBackground();
        if (background instanceof RippleDrawable) {
            int u13 = (int) ((u(((Float) this.S.get(this.U)).floatValue()) * this.f33056d0) + this.D);
            int b13 = b();
            int i13 = this.G;
            background.setHotspotBounds(u13 - i13, b13 - i13, u13 + i13, b13 + i13);
        }
    }

    public final void W() {
        int i13 = this.B;
        if (i13 == 0 || i13 == 1) {
            if (this.T == -1 || !isEnabled()) {
                f();
                return;
            } else {
                e();
                return;
            }
        }
        if (i13 == 2) {
            f();
            return;
        }
        if (i13 != 3) {
            throw new IllegalArgumentException("Unexpected labelBehavior: " + this.B);
        }
        if (isEnabled()) {
            Rect rect = new Rect();
            l0.q0(this).getHitRect(rect);
            if (getLocalVisibleRect(rect)) {
                e();
                return;
            }
        }
        f();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void X(android.graphics.Canvas r11, android.graphics.Paint r12, android.graphics.RectF r13, com.google.android.material.slider.g r14) {
        /*
            r10 = this;
            r0 = 1
            r1 = 2
            r2 = 3
            int r3 = r10.C
            float r4 = (float) r3
            r5 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r5
            float r3 = (float) r3
            float r3 = r3 / r5
            int[] r6 = com.google.android.material.slider.d.f33106a
            int r7 = r14.ordinal()
            r7 = r6[r7]
            if (r7 == r0) goto L22
            if (r7 == r1) goto L1e
            if (r7 == r2) goto L1a
            goto L26
        L1a:
            int r4 = r10.L
            float r4 = (float) r4
            goto L26
        L1e:
            int r3 = r10.L
        L20:
            float r3 = (float) r3
            goto L26
        L22:
            int r3 = r10.L
            float r4 = (float) r3
            goto L20
        L26:
            android.graphics.Paint$Style r7 = android.graphics.Paint.Style.FILL
            r12.setStyle(r7)
            android.graphics.Paint$Cap r7 = android.graphics.Paint.Cap.BUTT
            r12.setStrokeCap(r7)
            r12.setAntiAlias(r0)
            android.graphics.Path r7 = r10.f33072l0
            r7.reset()
            float r8 = r13.width()
            float r9 = r4 + r3
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 < 0) goto L64
            r14 = 8
            float[] r14 = new float[r14]
            r5 = 0
            r14[r5] = r4
            r14[r0] = r4
            r14[r1] = r3
            r14[r2] = r3
            r0 = 4
            r14[r0] = r3
            r0 = 5
            r14[r0] = r3
            r0 = 6
            r14[r0] = r4
            r0 = 7
            r14[r0] = r4
            android.graphics.Path$Direction r0 = android.graphics.Path.Direction.CW
            r7.addRoundRect(r13, r14, r0)
            r11.drawPath(r7, r12)
            goto Lb3
        L64:
            float r0 = java.lang.Math.min(r4, r3)
            float r3 = java.lang.Math.max(r4, r3)
            r11.save()
            android.graphics.Path$Direction r4 = android.graphics.Path.Direction.CW
            r7.addRoundRect(r13, r0, r0, r4)
            r11.clipPath(r7)
            int r14 = r14.ordinal()
            r14 = r6[r14]
            android.graphics.RectF r0 = r10.f33076n0
            if (r14 == r1) goto La2
            if (r14 == r2) goto L95
            float r14 = r13.centerX()
            float r14 = r14 - r3
            float r1 = r13.top
            float r2 = r13.centerX()
            float r2 = r2 + r3
            float r13 = r13.bottom
            r0.set(r14, r1, r2, r13)
            goto Lad
        L95:
            float r14 = r13.right
            float r5 = r5 * r3
            float r1 = r14 - r5
            float r2 = r13.top
            float r13 = r13.bottom
            r0.set(r1, r2, r14, r13)
            goto Lad
        La2:
            float r14 = r13.left
            float r1 = r13.top
            float r5 = r5 * r3
            float r5 = r5 + r14
            float r13 = r13.bottom
            r0.set(r14, r1, r5, r13)
        Lad:
            r11.drawRoundRect(r0, r3, r3, r12)
            r11.restore()
        Lb3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.slider.BaseSlider.X(android.graphics.Canvas, android.graphics.Paint, android.graphics.RectF, com.google.android.material.slider.g):void");
    }

    public final void Y() {
        boolean z13;
        int max = Math.max(this.f33093z, Math.max(this.C + getPaddingBottom() + getPaddingTop(), getPaddingBottom() + getPaddingTop() + this.F));
        boolean z14 = false;
        if (max == this.A) {
            z13 = false;
        } else {
            this.A = max;
            z13 = true;
        }
        int max2 = Math.max(Math.max(Math.max((this.E / 2) - this.f33087t, 0), Math.max((this.C - this.f33088u) / 2, 0)), Math.max(Math.max(this.f33052b0 - this.f33089v, 0), Math.max(this.f33054c0 - this.f33090w, 0))) + this.f33085s;
        if (this.D != max2) {
            this.D = max2;
            WeakHashMap weakHashMap = v0.f102521a;
            if (isLaidOut()) {
                this.f33056d0 = Math.max(getWidth() - (this.D * 2), 0);
                r();
            }
            z14 = true;
        }
        if (z13) {
            requestLayout();
        } else if (z14) {
            postInvalidate();
        }
    }

    public final void Z() {
        if (this.f33060f0) {
            float f13 = this.Q;
            float f14 = this.R;
            if (f13 >= f14) {
                throw new IllegalStateException("valueFrom(" + this.Q + ") must be smaller than valueTo(" + this.R + ")");
            }
            if (f14 <= f13) {
                throw new IllegalStateException("valueTo(" + this.R + ") must be greater than valueFrom(" + this.Q + ")");
            }
            if (this.V > 0.0f && !a0(f14)) {
                float f15 = this.V;
                float f16 = this.Q;
                float f17 = this.R;
                StringBuilder sb3 = new StringBuilder("The stepSize(");
                sb3.append(f15);
                sb3.append(") must be 0, or a factor of the valueFrom(");
                sb3.append(f16);
                sb3.append(")-valueTo(");
                throw new IllegalStateException(d7.g.i(sb3, f17, ") range"));
            }
            Iterator it = this.S.iterator();
            while (it.hasNext()) {
                Float f18 = (Float) it.next();
                if (f18.floatValue() < this.Q || f18.floatValue() > this.R) {
                    float f19 = this.Q;
                    float f23 = this.R;
                    StringBuilder sb4 = new StringBuilder("Slider value(");
                    sb4.append(f18);
                    sb4.append(") must be greater or equal to valueFrom(");
                    sb4.append(f19);
                    sb4.append("), and lower or equal to valueTo(");
                    throw new IllegalStateException(d7.g.i(sb4, f23, ")"));
                }
                if (this.V > 0.0f && !a0(f18.floatValue())) {
                    float f24 = this.Q;
                    float f25 = this.V;
                    throw new IllegalStateException("Value(" + f18 + ") must be equal to valueFrom(" + f24 + ") plus a multiple of stepSize(" + f25 + ") when using stepSize(" + f25 + ")");
                }
            }
            float j13 = j();
            if (j13 < 0.0f) {
                throw new IllegalStateException(cb.h("minSeparation(", j13, ") must be greater or equal to 0"));
            }
            float f26 = this.V;
            if (f26 > 0.0f && j13 > 0.0f) {
                if (this.f33084r0 != 1) {
                    throw new IllegalStateException("minSeparation(" + j13 + ") cannot be set as a dimension when using stepSize(" + this.V + ")");
                }
                if (j13 < f26 || !o(j13)) {
                    float f27 = this.V;
                    StringBuilder sb5 = new StringBuilder("minSeparation(");
                    sb5.append(j13);
                    sb5.append(") must be greater or equal and a multiple of stepSize(");
                    sb5.append(f27);
                    sb5.append(") when using stepSize(");
                    throw new IllegalStateException(d7.g.i(sb5, f27, ")"));
                }
            }
            float f28 = this.V;
            if (f28 != 0.0f) {
                if (((int) f28) != f28) {
                    Log.w("BaseSlider", "Floating point value used for stepSize(" + f28 + "). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.");
                }
                float f29 = this.Q;
                if (((int) f29) != f29) {
                    Log.w("BaseSlider", "Floating point value used for valueFrom(" + f29 + "). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.");
                }
                float f33 = this.R;
                if (((int) f33) != f33) {
                    Log.w("BaseSlider", "Floating point value used for valueTo(" + f33 + "). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.");
                }
            }
            this.f33060f0 = false;
        }
    }

    public final void a(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth == -1 && intrinsicHeight == -1) {
            drawable.setBounds(0, 0, this.E, this.F);
        } else {
            float max = Math.max(this.E, this.F) / Math.max(intrinsicWidth, intrinsicHeight);
            drawable.setBounds(0, 0, (int) (intrinsicWidth * max), (int) (intrinsicHeight * max));
        }
    }

    public final boolean a0(float f13) {
        return o(new BigDecimal(Float.toString(f13)).subtract(new BigDecimal(Float.toString(this.Q)), MathContext.DECIMAL64).doubleValue());
    }

    public final int b() {
        int i13 = this.A / 2;
        int i14 = this.B;
        return i13 + ((i14 == 1 || i14 == 3) ? ((gk.a) this.f33071l.get(0)).getIntrinsicHeight() : 0);
    }

    public final float b0(float f13) {
        return (u(f13) * this.f33056d0) + this.D;
    }

    public final ValueAnimator c(boolean z13) {
        int c03;
        TimeInterpolator d03;
        float f13 = z13 ? 0.0f : 1.0f;
        ValueAnimator valueAnimator = z13 ? this.f33081q : this.f33079p;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            f13 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f13, z13 ? 1.0f : 0.0f);
        if (z13) {
            c03 = tb.f.c0(getContext(), f33044u0, 83);
            d03 = tb.f.d0(getContext(), f33046w0, gj.a.f65171e);
        } else {
            c03 = tb.f.c0(getContext(), f33045v0, RecyclerViewTypes.VIEW_TYPE_CAROUSEL_SINGLE_COLUMN);
            d03 = tb.f.d0(getContext(), f33047x0, gj.a.f65169c);
        }
        ofFloat.setDuration(c03);
        ofFloat.setInterpolator(d03);
        ofFloat.addUpdateListener(new b(this));
        return ofFloat;
    }

    public final void d(Canvas canvas, int i13, int i14, float f13, Drawable drawable) {
        canvas.save();
        canvas.translate((this.D + ((int) (u(f13) * i13))) - (drawable.getBounds().width() / 2.0f), i14 - (drawable.getBounds().height() / 2.0f));
        drawable.draw(canvas);
        canvas.restore();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
    
        if (r1 != Integer.MIN_VALUE) goto L58;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean dispatchHoverEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            com.google.android.material.slider.f r0 = r6.f33063h
            android.view.accessibility.AccessibilityManager r1 = r0.f137739h
            boolean r2 = r1.isEnabled()
            if (r2 == 0) goto L53
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 != 0) goto L11
            goto L53
        L11:
            int r1 = r7.getAction()
            r2 = 256(0x100, float:3.59E-43)
            r3 = 128(0x80, float:1.8E-43)
            r4 = 7
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r4) goto L37
            r4 = 9
            if (r1 == r4) goto L37
            r4 = 10
            if (r1 == r4) goto L27
            goto L53
        L27:
            int r1 = r0.f137744m
            if (r1 == r5) goto L53
            if (r1 != r5) goto L2e
            goto L59
        L2e:
            r0.f137744m = r5
            r0.u(r5, r3)
            r0.u(r1, r2)
            goto L59
        L37:
            float r1 = r7.getX()
            float r4 = r7.getY()
            int r1 = r0.v(r1, r4)
            int r4 = r0.f137744m
            if (r4 != r1) goto L48
            goto L50
        L48:
            r0.f137744m = r1
            r0.u(r1, r3)
            r0.u(r4, r2)
        L50:
            if (r1 == r5) goto L53
            goto L59
        L53:
            boolean r7 = super.dispatchHoverEvent(r7)
            if (r7 == 0) goto L5b
        L59:
            r7 = 1
            goto L5c
        L5b:
            r7 = 0
        L5c:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.slider.BaseSlider.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f33049a.setColor(i(this.f33070k0));
        this.f33051b.setColor(i(this.f33068j0));
        this.f33057e.setColor(i(this.f33066i0));
        this.f33059f.setColor(i(this.f33064h0));
        this.f33061g.setColor(i(this.f33068j0));
        Iterator it = this.f33071l.iterator();
        while (it.hasNext()) {
            gk.a aVar = (gk.a) it.next();
            if (aVar.isStateful()) {
                aVar.setState(getDrawableState());
            }
        }
        bk.i iVar = this.f33078o0;
        if (iVar.isStateful()) {
            iVar.setState(getDrawableState());
        }
        Paint paint = this.f33055d;
        paint.setColor(i(this.f33062g0));
        paint.setAlpha(63);
    }

    public final void e() {
        if (!this.f33077o) {
            this.f33077o = true;
            ValueAnimator c13 = c(true);
            this.f33079p = c13;
            this.f33081q = null;
            c13.start();
        }
        ArrayList arrayList = this.f33071l;
        Iterator it = arrayList.iterator();
        for (int i13 = 0; i13 < this.S.size() && it.hasNext(); i13++) {
            if (i13 != this.U) {
                P((gk.a) it.next(), ((Float) this.S.get(i13)).floatValue());
            }
        }
        if (!it.hasNext()) {
            throw new IllegalStateException(String.format("Not enough labels(%d) to display all the values(%d)", Integer.valueOf(arrayList.size()), Integer.valueOf(this.S.size())));
        }
        P((gk.a) it.next(), ((Float) this.S.get(this.U)).floatValue());
    }

    public final void f() {
        if (this.f33077o) {
            this.f33077o = false;
            ValueAnimator c13 = c(false);
            this.f33081q = c13;
            this.f33079p = null;
            c13.addListener(new c(this));
            this.f33081q.start();
        }
    }

    public final String g(float f13) {
        return String.format(((float) ((int) f13)) == f13 ? "%.0f" : "%.2f", Float.valueOf(f13));
    }

    @Override // android.view.View
    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    public final float[] h() {
        float floatValue = ((Float) this.S.get(0)).floatValue();
        float floatValue2 = ((Float) ep.b.h(this.S, 1)).floatValue();
        if (this.S.size() == 1) {
            floatValue = this.Q;
        }
        float u13 = u(floatValue);
        float u14 = u(floatValue2);
        float[] fArr = new float[2];
        if (q()) {
            fArr[0] = u14;
            fArr[1] = u13;
        } else {
            fArr[0] = u13;
            fArr[1] = u14;
        }
        return fArr;
    }

    public final int i(ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    public float j() {
        return 0.0f;
    }

    public int k() {
        return this.E / 2;
    }

    public float l() {
        return this.Q;
    }

    public float m() {
        return this.R;
    }

    public ArrayList n() {
        return new ArrayList(this.S);
    }

    public final boolean o(double d2) {
        double doubleValue = new BigDecimal(Double.toString(d2)).divide(new BigDecimal(Float.toString(this.V)), MathContext.DECIMAL64).doubleValue();
        return Math.abs(((double) Math.round(doubleValue)) - doubleValue) < 1.0E-4d;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnScrollChangedListener(this.f33086s0);
        Iterator it = this.f33071l.iterator();
        while (it.hasNext()) {
            gk.a aVar = (gk.a) it.next();
            ViewGroup q03 = l0.q0(this);
            if (q03 == null) {
                aVar.getClass();
            } else {
                aVar.getClass();
                int[] iArr = new int[2];
                q03.getLocationOnScreen(iArr);
                aVar.K = iArr[0];
                q03.getWindowVisibleDisplayFrame(aVar.D);
                q03.addOnLayoutChangeListener(aVar.C);
            }
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        e eVar = this.f33067j;
        if (eVar != null) {
            removeCallbacks(eVar);
        }
        this.f33077o = false;
        Iterator it = this.f33071l.iterator();
        while (it.hasNext()) {
            gk.a aVar = (gk.a) it.next();
            u6 r03 = l0.r0(this);
            if (r03 != null) {
                r03.m(aVar);
                ViewGroup q03 = l0.q0(this);
                if (q03 == null) {
                    aVar.getClass();
                } else {
                    q03.removeOnLayoutChangeListener(aVar.C);
                }
            }
        }
        getViewTreeObserver().removeOnScrollChangedListener(this.f33086s0);
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0185 A[SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onDraw(android.graphics.Canvas r18) {
        /*
            Method dump skipped, instructions count: 758
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.slider.BaseSlider.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z13, int i13, Rect rect) {
        super.onFocusChanged(z13, i13, rect);
        f fVar = this.f33063h;
        if (!z13) {
            this.T = -1;
            fVar.j(this.U);
            return;
        }
        if (i13 == 1) {
            s(Integer.MAX_VALUE);
        } else if (i13 == 2) {
            s(Integer.MIN_VALUE);
        } else if (i13 == 17) {
            t(Integer.MAX_VALUE);
        } else if (i13 == 66) {
            t(Integer.MIN_VALUE);
        }
        fVar.t(this.U);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i13, KeyEvent keyEvent) {
        if (!isEnabled()) {
            return super.onKeyDown(i13, keyEvent);
        }
        if (this.S.size() == 1) {
            this.T = 0;
        }
        Float f13 = null;
        Boolean valueOf = null;
        if (this.T == -1) {
            if (i13 != 61) {
                if (i13 != 66) {
                    if (i13 != 81) {
                        if (i13 == 69) {
                            s(-1);
                            valueOf = Boolean.TRUE;
                        } else if (i13 != 70) {
                            switch (i13) {
                                case 21:
                                    t(-1);
                                    valueOf = Boolean.TRUE;
                                    break;
                                case 22:
                                    t(1);
                                    valueOf = Boolean.TRUE;
                                    break;
                            }
                        }
                    }
                    s(1);
                    valueOf = Boolean.TRUE;
                }
                this.T = this.U;
                postInvalidate();
                valueOf = Boolean.TRUE;
            } else {
                valueOf = keyEvent.hasNoModifiers() ? Boolean.valueOf(s(1)) : keyEvent.isShiftPressed() ? Boolean.valueOf(s(-1)) : Boolean.FALSE;
            }
            return valueOf != null ? valueOf.booleanValue() : super.onKeyDown(i13, keyEvent);
        }
        boolean isLongPress = this.f33058e0 | keyEvent.isLongPress();
        this.f33058e0 = isLongPress;
        if (isLongPress) {
            float f14 = this.V;
            r10 = f14 != 0.0f ? f14 : 1.0f;
            if ((this.R - this.Q) / r10 > 20) {
                r10 *= Math.round(r0 / r11);
            }
        } else {
            float f15 = this.V;
            if (f15 != 0.0f) {
                r10 = f15;
            }
        }
        if (i13 == 21) {
            if (!q()) {
                r10 = -r10;
            }
            f13 = Float.valueOf(r10);
        } else if (i13 == 22) {
            if (q()) {
                r10 = -r10;
            }
            f13 = Float.valueOf(r10);
        } else if (i13 == 69) {
            f13 = Float.valueOf(-r10);
        } else if (i13 == 70 || i13 == 81) {
            f13 = Float.valueOf(r10);
        }
        if (f13 != null) {
            if (S(this.T, f13.floatValue() + ((Float) this.S.get(this.T)).floatValue())) {
                V();
                postInvalidate();
            }
            return true;
        }
        if (i13 != 23) {
            if (i13 == 61) {
                if (keyEvent.hasNoModifiers()) {
                    return s(1);
                }
                if (keyEvent.isShiftPressed()) {
                    return s(-1);
                }
                return false;
            }
            if (i13 != 66) {
                return super.onKeyDown(i13, keyEvent);
            }
        }
        this.T = -1;
        postInvalidate();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i13, KeyEvent keyEvent) {
        this.f33058e0 = false;
        return super.onKeyUp(i13, keyEvent);
    }

    @Override // android.view.View
    public final void onMeasure(int i13, int i14) {
        int i15 = this.A;
        int i16 = this.B;
        super.onMeasure(i13, View.MeasureSpec.makeMeasureSpec(i15 + ((i16 == 1 || i16 == 3) ? ((gk.a) this.f33071l.get(0)).getIntrinsicHeight() : 0), 1073741824));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SliderState sliderState = (SliderState) parcelable;
        super.onRestoreInstanceState(sliderState.getSuperState());
        this.Q = sliderState.f33094a;
        this.R = sliderState.f33095b;
        R(sliderState.f33096c);
        this.V = sliderState.f33097d;
        if (sliderState.f33098e) {
            requestFocus();
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SliderState sliderState = new SliderState(super.onSaveInstanceState());
        sliderState.f33094a = this.Q;
        sliderState.f33095b = this.R;
        sliderState.f33096c = new ArrayList(this.S);
        sliderState.f33097d = this.V;
        sliderState.f33098e = hasFocus();
        return sliderState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i13, int i14, int i15, int i16) {
        this.f33056d0 = Math.max(i13 - (this.D * 2), 0);
        r();
        V();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        if (r2 != 3) goto L131;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.slider.BaseSlider.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i13) {
        u6 r03;
        super.onVisibilityChanged(view, i13);
        if (i13 == 0 || (r03 = l0.r0(this)) == null) {
            return;
        }
        Iterator it = this.f33071l.iterator();
        while (it.hasNext()) {
            r03.m((gk.a) it.next());
        }
    }

    public final boolean p(MotionEvent motionEvent) {
        if (motionEvent.getToolType(0) == 3) {
            return false;
        }
        for (ViewParent parent = getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if ((viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) && viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
        }
        return false;
    }

    public final boolean q() {
        WeakHashMap weakHashMap = v0.f102521a;
        return getLayoutDirection() == 1;
    }

    public final void r() {
        if (this.V <= 0.0f) {
            return;
        }
        Z();
        int min = Math.min((int) (((this.R - this.Q) / this.V) + 1.0f), (this.f33056d0 / this.f33091x) + 1);
        float[] fArr = this.W;
        if (fArr == null || fArr.length != min * 2) {
            this.W = new float[min * 2];
        }
        float f13 = this.f33056d0 / (min - 1);
        for (int i13 = 0; i13 < min * 2; i13 += 2) {
            float[] fArr2 = this.W;
            fArr2[i13] = ((i13 / 2.0f) * f13) + this.D;
            fArr2[i13 + 1] = b();
        }
    }

    public final boolean s(int i13) {
        int i14 = this.U;
        long j13 = i14 + i13;
        long size = this.S.size() - 1;
        if (j13 < 0) {
            j13 = 0;
        } else if (j13 > size) {
            j13 = size;
        }
        int i15 = (int) j13;
        this.U = i15;
        if (i15 == i14) {
            return false;
        }
        if (this.T != -1) {
            this.T = i15;
        }
        V();
        postInvalidate();
        return true;
    }

    @Override // android.view.View
    public void setEnabled(boolean z13) {
        super.setEnabled(z13);
        setLayerType(z13 ? 0 : 2, null);
    }

    public final void t(int i13) {
        if (q()) {
            i13 = i13 == Integer.MIN_VALUE ? Integer.MAX_VALUE : -i13;
        }
        s(i13);
    }

    public final float u(float f13) {
        float f14 = this.Q;
        float f15 = (f13 - f14) / (this.R - f14);
        return q() ? 1.0f - f15 : f15;
    }

    public final void v() {
        Iterator it = this.f33075n.iterator();
        while (it.hasNext()) {
            z62.c cVar = (z62.c) it.next();
            cVar.getClass();
            Slider slider = (Slider) this;
            Intrinsics.checkNotNullParameter(slider, "slider");
            int i13 = SizeSlider.f51990d;
            SizeSlider sizeSlider = cVar.f140897b;
            sizeSlider.getClass();
            ImageView imageView = new ImageView(cVar.f140898c);
            imageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            imageView.setImageDrawable(null);
            Size size = sizeSlider.f51991a;
            PopupWindow popupWindow = new PopupWindow(imageView, size.getWidth(), size.getHeight());
            popupWindow.setAnimationStyle(R.style.Animation.Dialog);
            PopupWindow popupWindow2 = cVar.f140896a;
            if (popupWindow2 != null) {
                popupWindow2.dismiss();
            }
            cVar.f140896a = popupWindow;
            int[] iArr = new int[2];
            sizeSlider.getLocationOnScreen(iArr);
            popupWindow.showAtLocation(sizeSlider, 0, iArr[0], iArr[1] - popupWindow.getHeight());
            s81.g gVar = sizeSlider.f51992b;
            sizeSlider.removeCallbacks(gVar);
            sizeSlider.postDelayed(gVar, 1000L);
        }
    }

    public boolean w() {
        if (this.T != -1) {
            return true;
        }
        float f13 = this.f33082q0;
        if (q()) {
            f13 = 1.0f - f13;
        }
        float f14 = this.R;
        float f15 = this.Q;
        float a13 = ep.b.a(f14, f15, f13, f15);
        float b03 = b0(a13);
        this.T = 0;
        float abs = Math.abs(((Float) this.S.get(0)).floatValue() - a13);
        for (int i13 = 1; i13 < this.S.size(); i13++) {
            float abs2 = Math.abs(((Float) this.S.get(i13)).floatValue() - a13);
            float b04 = b0(((Float) this.S.get(i13)).floatValue());
            if (Float.compare(abs2, abs) > 0) {
                break;
            }
            boolean z13 = !q() ? b04 - b03 >= 0.0f : b04 - b03 <= 0.0f;
            if (Float.compare(abs2, abs) < 0) {
                this.T = i13;
            } else {
                if (Float.compare(abs2, abs) != 0) {
                    continue;
                } else {
                    if (Math.abs(b04 - b03) < this.f33083r) {
                        this.T = -1;
                        return false;
                    }
                    if (z13) {
                        this.T = i13;
                    }
                }
            }
            abs = abs2;
        }
        return this.T != -1;
    }

    public void x(int i13) {
        if (i13 == this.G) {
            return;
        }
        this.G = i13;
        Drawable background = getBackground();
        if ((!(getBackground() instanceof RippleDrawable)) || !(background instanceof RippleDrawable)) {
            postInvalidate();
        } else {
            ((RippleDrawable) background).setRadius(this.G);
        }
    }

    public void y(ColorStateList colorStateList) {
        if (colorStateList.equals(this.f33062g0)) {
            return;
        }
        this.f33062g0 = colorStateList;
        Drawable background = getBackground();
        if (!(!(getBackground() instanceof RippleDrawable)) && (background instanceof RippleDrawable)) {
            ((RippleDrawable) background).setColor(colorStateList);
            return;
        }
        int i13 = i(colorStateList);
        Paint paint = this.f33055d;
        paint.setColor(i13);
        paint.setAlpha(63);
        invalidate();
    }

    public void z(int i13) {
        if (this.B != i13) {
            this.B = i13;
            requestLayout();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.google.android.material.slider.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public BaseSlider(@androidx.annotation.NonNull android.content.Context r13, android.util.AttributeSet r14, int r15) {
        /*
            Method dump skipped, instructions count: 699
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.slider.BaseSlider.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
