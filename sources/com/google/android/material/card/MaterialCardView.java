package com.google.android.material.card;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.cardview.widget.CardView;
import bk.a0;
import bk.i;
import bk.m;
import bk.o;
import fj.c;
import fj.l;
import java.util.WeakHashMap;
import lj.b;
import q5.v0;

/* loaded from: classes3.dex */
public class MaterialCardView extends CardView implements Checkable, a0 {

    /* renamed from: l */
    public static final int[] f32392l = {R.attr.state_checkable};

    /* renamed from: m */
    public static final int[] f32393m = {R.attr.state_checked};

    /* renamed from: n */
    public static final int[] f32394n = {c.state_dragged};

    /* renamed from: o */
    public static final int f32395o = l.Widget_MaterialComponents_CardView;

    /* renamed from: h */
    public final b f32396h;

    /* renamed from: i */
    public final boolean f32397i;

    /* renamed from: j */
    public boolean f32398j;

    /* renamed from: k */
    public boolean f32399k;

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.materialCardViewStyle);
    }

    public final void D(int i13, int i14, int i15, int i16) {
        super.s(i13, i14, i15, i16);
    }

    public final void L(boolean z13) {
        if (this.f32399k != z13) {
            this.f32399k = z13;
            refreshDrawableState();
            x();
            invalidate();
        }
    }

    public final void T(int i13) {
        ColorStateList valueOf = ColorStateList.valueOf(i13);
        b bVar = this.f32396h;
        if (bVar.f83600n != valueOf) {
            bVar.f83600n = valueOf;
            i iVar = bVar.f83590d;
            iVar.f23052a.f23040k = bVar.f83594h;
            iVar.invalidateSelf();
            iVar.y(valueOf);
        }
        invalidate();
    }

    public final void X(int i13) {
        b bVar = this.f32396h;
        if (i13 != bVar.f83594h) {
            bVar.f83594h = i13;
            i iVar = bVar.f83590d;
            ColorStateList colorStateList = bVar.f83600n;
            iVar.f23052a.f23040k = i13;
            iVar.invalidateSelf();
            iVar.y(colorStateList);
        }
        invalidate();
    }

    @Override // bk.a0
    public final void Y0(o oVar) {
        RectF rectF = new RectF();
        b bVar = this.f32396h;
        rectF.set(bVar.f83589c.getBounds());
        setClipToOutline(oVar.g(rectF));
        bVar.f(oVar);
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f32398j;
    }

    @Override // androidx.cardview.widget.CardView
    public final void k(int i13) {
        this.f32396h.f83589c.t(ColorStateList.valueOf(i13));
    }

    @Override // androidx.cardview.widget.CardView
    public final void l(float f13) {
        super.l(0.0f);
        b bVar = this.f32396h;
        bVar.f83589c.s(((CardView) bVar.f83587a.f17057e.f114929c).getElevation());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        b bVar = this.f32396h;
        bVar.i();
        d7.b.y0(this, bVar.f83589c);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i13) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i13 + 3);
        b bVar = this.f32396h;
        if (bVar != null && bVar.f83605s) {
            View.mergeDrawableStates(onCreateDrawableState, f32392l);
        }
        if (this.f32398j) {
            View.mergeDrawableStates(onCreateDrawableState, f32393m);
        }
        if (this.f32399k) {
            View.mergeDrawableStates(onCreateDrawableState, f32394n);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(this.f32398j);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        b bVar = this.f32396h;
        accessibilityNodeInfo.setCheckable(bVar != null && bVar.f83605s);
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(this.f32398j);
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        int i15;
        int i16;
        int i17;
        int i18;
        super.onMeasure(i13, i14);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        b bVar = this.f32396h;
        if (bVar.f83602p != null) {
            MaterialCardView materialCardView = bVar.f83587a;
            if (materialCardView.f17053a) {
                i15 = (int) Math.ceil(((gi2.b.g0(materialCardView.f17057e).f60763e * 1.5f) + (bVar.g() ? bVar.a() : 0.0f)) * 2.0f);
                i16 = (int) Math.ceil((gi2.b.g0(materialCardView.f17057e).f60763e + (bVar.g() ? bVar.a() : 0.0f)) * 2.0f);
            } else {
                i15 = 0;
                i16 = 0;
            }
            int i19 = bVar.f83593g;
            int i23 = (i19 & 8388613) == 8388613 ? ((measuredWidth - bVar.f83591e) - bVar.f83592f) - i16 : bVar.f83591e;
            int i24 = (i19 & 80) == 80 ? bVar.f83591e : ((measuredHeight - bVar.f83591e) - bVar.f83592f) - i15;
            int i25 = (i19 & 8388613) == 8388613 ? bVar.f83591e : ((measuredWidth - bVar.f83591e) - bVar.f83592f) - i16;
            int i26 = (i19 & 80) == 80 ? ((measuredHeight - bVar.f83591e) - bVar.f83592f) - i15 : bVar.f83591e;
            WeakHashMap weakHashMap = v0.f102521a;
            if (materialCardView.getLayoutDirection() == 1) {
                i18 = i25;
                i17 = i23;
            } else {
                i17 = i25;
                i18 = i23;
            }
            bVar.f83602p.setLayerInset(2, i18, i26, i17, i24);
        }
    }

    @Override // androidx.cardview.widget.CardView
    public final void s(int i13, int i14, int i15, int i16) {
        b bVar = this.f32396h;
        bVar.f83588b.set(i13, i14, i15, i16);
        bVar.j();
    }

    @Override // android.view.View
    public final void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        if (this.f32397i) {
            b bVar = this.f32396h;
            if (!bVar.f83604r) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                bVar.f83604r = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z13) {
        if (this.f32398j != z13) {
            toggle();
        }
    }

    @Override // android.view.View
    public final void setClickable(boolean z13) {
        super.setClickable(z13);
        b bVar = this.f32396h;
        if (bVar != null) {
            bVar.i();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public final void t(float f13) {
        super.t(f13);
        b bVar = this.f32396h;
        m h10 = bVar.f83599m.h();
        h10.c(f13);
        bVar.f(h10.a());
        bVar.f83595i.invalidateSelf();
        boolean g13 = bVar.g();
        i iVar = bVar.f83589c;
        MaterialCardView materialCardView = bVar.f83587a;
        if (g13 || (materialCardView.f17054b && !iVar.p())) {
            bVar.j();
        }
        if (bVar.g()) {
            if (!bVar.f83604r) {
                super.setBackgroundDrawable(bVar.d(iVar));
            }
            materialCardView.setForeground(bVar.d(bVar.f83595i));
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        b bVar = this.f32396h;
        if (bVar != null && bVar.f83605s && isEnabled()) {
            this.f32398j = !this.f32398j;
            refreshDrawableState();
            x();
            bVar.e(this.f32398j, true);
        }
    }

    public final void x() {
        b bVar;
        RippleDrawable rippleDrawable;
        if (Build.VERSION.SDK_INT <= 26 || (rippleDrawable = (bVar = this.f32396h).f83601o) == null) {
            return;
        }
        Rect bounds = rippleDrawable.getBounds();
        int i13 = bounds.bottom;
        bVar.f83601o.setBounds(bounds.left, bounds.top, bounds.right, i13 - 1);
        bVar.f83601o.setBounds(bounds.left, bounds.top, bounds.right, i13);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MaterialCardView(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.card.MaterialCardView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
