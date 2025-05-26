package com.google.android.material.navigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import bk.o;
import com.google.android.material.internal.d0;
import java.util.WeakHashMap;
import oi.u6;
import q5.v0;

/* loaded from: classes3.dex */
public abstract class l extends FrameLayout {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f32907e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final g f32908a;

    /* renamed from: b, reason: collision with root package name */
    public final h f32909b;

    /* renamed from: c, reason: collision with root package name */
    public final j f32910c;

    /* renamed from: d, reason: collision with root package name */
    public final m.l f32911d;

    public l(Context context, AttributeSet attributeSet, int i13, int i14) {
        super(fk.a.a(context, attributeSet, i13, i14), attributeSet, i13);
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        j jVar = new j();
        jVar.f32905b = false;
        this.f32910c = jVar;
        Context context2 = getContext();
        x92.b g13 = d0.g(context2, attributeSet, fj.m.NavigationBarView, i13, i14, fj.m.NavigationBarView_itemTextAppearanceInactive, fj.m.NavigationBarView_itemTextAppearanceActive);
        g gVar = new g(context2, getClass(), b());
        this.f32908a = gVar;
        h a13 = a(context2);
        this.f32909b = a13;
        jVar.f32904a = a13;
        jVar.f32906c = 1;
        a13.C = jVar;
        gVar.b(jVar);
        getContext();
        jVar.f32904a.D = gVar;
        if (g13.G(fj.m.NavigationBarView_itemIconTint)) {
            ColorStateList u13 = g13.u(fj.m.NavigationBarView_itemIconTint);
            a13.f32886i = u13;
            f[] fVarArr = a13.f32883f;
            if (fVarArr != null) {
                for (f fVar : fVarArr) {
                    fVar.f32870t = u13;
                    if (fVar.f32869s != null && (drawable3 = fVar.f32872v) != null) {
                        drawable3.setTintList(u13);
                        fVar.f32872v.invalidateSelf();
                    }
                }
            }
        } else {
            ColorStateList c13 = a13.c();
            a13.f32886i = c13;
            f[] fVarArr2 = a13.f32883f;
            if (fVarArr2 != null) {
                for (f fVar2 : fVarArr2) {
                    fVar2.f32870t = c13;
                    if (fVar2.f32869s != null && (drawable = fVar2.f32872v) != null) {
                        drawable.setTintList(c13);
                        fVar2.f32872v.invalidateSelf();
                    }
                }
            }
        }
        int w13 = g13.w(fj.m.NavigationBarView_itemIconSize, getResources().getDimensionPixelSize(fj.e.mtrl_navigation_bar_item_default_icon_size));
        a13.f32887j = w13;
        f[] fVarArr3 = a13.f32883f;
        if (fVarArr3 != null) {
            for (f fVar3 : fVarArr3) {
                ImageView imageView = fVar3.f32864n;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
                layoutParams.width = w13;
                layoutParams.height = w13;
                imageView.setLayoutParams(layoutParams);
            }
        }
        if (g13.G(fj.m.NavigationBarView_itemTextAppearanceInactive)) {
            int C = g13.C(fj.m.NavigationBarView_itemTextAppearanceInactive, 0);
            h hVar = this.f32909b;
            hVar.f32890m = C;
            f[] fVarArr4 = hVar.f32883f;
            if (fVarArr4 != null) {
                for (f fVar4 : fVarArr4) {
                    TextView textView = fVar4.f32866p;
                    f.l(textView, C);
                    fVar4.a(textView.getTextSize(), fVar4.f32867q.getTextSize());
                    ColorStateList colorStateList = hVar.f32888k;
                    if (colorStateList != null) {
                        fVar4.m(colorStateList);
                    }
                }
            }
        }
        if (g13.G(fj.m.NavigationBarView_itemTextAppearanceActive)) {
            int C2 = g13.C(fj.m.NavigationBarView_itemTextAppearanceActive, 0);
            h hVar2 = this.f32909b;
            hVar2.f32891n = C2;
            f[] fVarArr5 = hVar2.f32883f;
            if (fVarArr5 != null) {
                for (f fVar5 : fVarArr5) {
                    fVar5.k(C2);
                    ColorStateList colorStateList2 = hVar2.f32888k;
                    if (colorStateList2 != null) {
                        fVar5.m(colorStateList2);
                    }
                }
            }
        }
        boolean t13 = g13.t(fj.m.NavigationBarView_itemTextAppearanceActiveBoldEnabled, true);
        h hVar3 = this.f32909b;
        hVar3.f32892o = t13;
        f[] fVarArr6 = hVar3.f32883f;
        if (fVarArr6 != null) {
            for (f fVar6 : fVarArr6) {
                fVar6.k(fVar6.f32868r);
                TextView textView2 = fVar6.f32867q;
                textView2.setTypeface(textView2.getTypeface(), t13 ? 1 : 0);
            }
        }
        if (g13.G(fj.m.NavigationBarView_itemTextColor)) {
            ColorStateList u14 = g13.u(fj.m.NavigationBarView_itemTextColor);
            h hVar4 = this.f32909b;
            hVar4.f32888k = u14;
            f[] fVarArr7 = hVar4.f32883f;
            if (fVarArr7 != null) {
                for (f fVar7 : fVarArr7) {
                    fVar7.m(u14);
                }
            }
        }
        Drawable background = getBackground();
        ColorStateList P = d7.b.P(background);
        if (background == null || P != null) {
            bk.i iVar = new bk.i(o.b(i13, i14, context2, attributeSet).a());
            if (P != null) {
                iVar.t(P);
            }
            iVar.o(context2);
            WeakHashMap weakHashMap = v0.f102521a;
            setBackground(iVar);
        }
        if (g13.G(fj.m.NavigationBarView_itemPaddingTop)) {
            int w14 = g13.w(fj.m.NavigationBarView_itemPaddingTop, 0);
            h hVar5 = this.f32909b;
            hVar5.f32896s = w14;
            f[] fVarArr8 = hVar5.f32883f;
            if (fVarArr8 != null) {
                for (f fVar8 : fVarArr8) {
                    if (fVar8.f32854d != w14) {
                        fVar8.f32854d = w14;
                        fVar8.c();
                    }
                }
            }
        }
        if (g13.G(fj.m.NavigationBarView_itemPaddingBottom)) {
            int w15 = g13.w(fj.m.NavigationBarView_itemPaddingBottom, 0);
            h hVar6 = this.f32909b;
            hVar6.f32897t = w15;
            f[] fVarArr9 = hVar6.f32883f;
            if (fVarArr9 != null) {
                for (f fVar9 : fVarArr9) {
                    if (fVar9.f32855e != w15) {
                        fVar9.f32855e = w15;
                        fVar9.c();
                    }
                }
            }
        }
        if (g13.G(fj.m.NavigationBarView_activeIndicatorLabelPadding)) {
            int w16 = g13.w(fj.m.NavigationBarView_activeIndicatorLabelPadding, 0);
            h hVar7 = this.f32909b;
            hVar7.f32898u = w16;
            f[] fVarArr10 = hVar7.f32883f;
            if (fVarArr10 != null) {
                for (f fVar10 : fVarArr10) {
                    if (fVar10.f32856f != w16) {
                        fVar10.f32856f = w16;
                        fVar10.c();
                    }
                }
            }
        }
        if (g13.G(fj.m.NavigationBarView_elevation)) {
            setElevation(g13.w(fj.m.NavigationBarView_elevation, 0));
        }
        getBackground().mutate().setTintList(com.bumptech.glide.d.I(context2, g13, fj.m.NavigationBarView_backgroundTint));
        int integer = ((TypedArray) g13.f134366c).getInteger(fj.m.NavigationBarView_labelVisibilityMode, -1);
        h hVar8 = this.f32909b;
        if (hVar8.f32882e != integer) {
            hVar8.f32882e = integer;
            this.f32910c.h(false);
        }
        int C3 = g13.C(fj.m.NavigationBarView_itemBackground, 0);
        if (C3 != 0) {
            h hVar9 = this.f32909b;
            hVar9.f32894q = C3;
            f[] fVarArr11 = hVar9.f32883f;
            if (fVarArr11 != null) {
                for (f fVar11 : fVarArr11) {
                    if (C3 == 0) {
                        drawable2 = null;
                    } else {
                        Context context3 = fVar11.getContext();
                        Object obj = d5.a.f53679a;
                        drawable2 = context3.getDrawable(C3);
                    }
                    if (drawable2 != null) {
                        fVar11.getClass();
                        if (drawable2.getConstantState() != null) {
                            drawable2 = drawable2.getConstantState().newDrawable().mutate();
                        }
                    }
                    fVar11.f32853c = drawable2;
                    fVar11.d();
                }
            }
        } else {
            ColorStateList I = com.bumptech.glide.d.I(context2, g13, fj.m.NavigationBarView_itemRippleColor);
            h hVar10 = this.f32909b;
            hVar10.f32893p = I;
            f[] fVarArr12 = hVar10.f32883f;
            if (fVarArr12 != null) {
                for (f fVar12 : fVarArr12) {
                    fVar12.f32852b = I;
                    fVar12.d();
                }
            }
        }
        int C4 = g13.C(fj.m.NavigationBarView_itemActiveIndicatorStyle, 0);
        if (C4 != 0) {
            h hVar11 = this.f32909b;
            hVar11.f32899v = true;
            f[] fVarArr13 = hVar11.f32883f;
            if (fVarArr13 != null) {
                for (f fVar13 : fVarArr13) {
                    fVar13.f32876z = true;
                    fVar13.d();
                    View view = fVar13.f32863m;
                    if (view != null) {
                        view.setVisibility(0);
                        fVar13.requestLayout();
                    }
                }
            }
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(C4, fj.m.NavigationBarActiveIndicator);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(fj.m.NavigationBarActiveIndicator_android_width, 0);
            h hVar12 = this.f32909b;
            hVar12.f32900w = dimensionPixelSize;
            f[] fVarArr14 = hVar12.f32883f;
            if (fVarArr14 != null) {
                for (f fVar14 : fVarArr14) {
                    fVar14.A = dimensionPixelSize;
                    fVar14.p(fVar14.getWidth());
                }
            }
            int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(fj.m.NavigationBarActiveIndicator_android_height, 0);
            h hVar13 = this.f32909b;
            hVar13.f32901x = dimensionPixelSize2;
            f[] fVarArr15 = hVar13.f32883f;
            if (fVarArr15 != null) {
                for (f fVar15 : fVarArr15) {
                    fVar15.B = dimensionPixelSize2;
                    fVar15.p(fVar15.getWidth());
                }
            }
            int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(fj.m.NavigationBarActiveIndicator_marginHorizontal, 0);
            h hVar14 = this.f32909b;
            hVar14.f32902y = dimensionPixelOffset;
            f[] fVarArr16 = hVar14.f32883f;
            if (fVarArr16 != null) {
                for (f fVar16 : fVarArr16) {
                    fVar16.D = dimensionPixelOffset;
                    fVar16.p(fVar16.getWidth());
                }
            }
            ColorStateList H = com.bumptech.glide.d.H(context2, obtainStyledAttributes, fj.m.NavigationBarActiveIndicator_android_color);
            h hVar15 = this.f32909b;
            hVar15.B = H;
            f[] fVarArr17 = hVar15.f32883f;
            if (fVarArr17 != null) {
                for (f fVar17 : fVarArr17) {
                    bk.i d2 = hVar15.d();
                    View view2 = fVar17.f32863m;
                    if (view2 != null) {
                        view2.setBackgroundDrawable(d2);
                        fVar17.d();
                    }
                }
            }
            o a14 = o.c(context2, obtainStyledAttributes.getResourceId(fj.m.NavigationBarActiveIndicator_shapeAppearance, 0), 0).a();
            h hVar16 = this.f32909b;
            hVar16.f32903z = a14;
            f[] fVarArr18 = hVar16.f32883f;
            if (fVarArr18 != null) {
                for (f fVar18 : fVarArr18) {
                    bk.i d13 = hVar16.d();
                    View view3 = fVar18.f32863m;
                    if (view3 != null) {
                        view3.setBackgroundDrawable(d13);
                        fVar18.d();
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }
        if (g13.G(fj.m.NavigationBarView_menu)) {
            int C5 = g13.C(fj.m.NavigationBarView_menu, 0);
            j jVar2 = this.f32910c;
            jVar2.f32905b = true;
            if (this.f32911d == null) {
                this.f32911d = new m.l(getContext());
            }
            this.f32911d.inflate(C5, this.f32908a);
            jVar2.f32905b = false;
            jVar2.h(true);
        }
        g13.O();
        addView(this.f32909b);
        this.f32908a.f88652e = new u6(this, 16);
    }

    public abstract h a(Context context);

    public abstract int b();

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d7.b.x0(this);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof NavigationBarView$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        NavigationBarView$SavedState navigationBarView$SavedState = (NavigationBarView$SavedState) parcelable;
        super.onRestoreInstanceState(navigationBarView$SavedState.f18020a);
        this.f32908a.u(navigationBarView$SavedState.f32826c);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        NavigationBarView$SavedState navigationBarView$SavedState = new NavigationBarView$SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        navigationBarView$SavedState.f32826c = bundle;
        this.f32908a.w(bundle);
        return navigationBarView$SavedState;
    }

    @Override // android.view.View
    public final void setElevation(float f13) {
        super.setElevation(f13);
        d7.b.v0(this, f13);
    }
}
