package com.google.android.material.navigation;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.i3;
import androidx.recyclerview.widget.y1;
import com.google.android.gms.common.api.internal.x;
import com.google.android.material.badge.BadgeState$State;
import java.util.WeakHashMap;
import n.b0;
import n.q;
import q5.o0;
import q5.v0;

/* loaded from: classes3.dex */
public abstract class f extends FrameLayout implements b0 {
    public static final int[] F = {R.attr.state_checked};
    public static final d G = new d();
    public static final e H = new e();
    public int A;
    public int B;
    public boolean C;
    public int D;
    public hj.a E;

    /* renamed from: a, reason: collision with root package name */
    public boolean f32851a;

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f32852b;

    /* renamed from: c, reason: collision with root package name */
    public Drawable f32853c;

    /* renamed from: d, reason: collision with root package name */
    public int f32854d;

    /* renamed from: e, reason: collision with root package name */
    public int f32855e;

    /* renamed from: f, reason: collision with root package name */
    public int f32856f;

    /* renamed from: g, reason: collision with root package name */
    public float f32857g;

    /* renamed from: h, reason: collision with root package name */
    public float f32858h;

    /* renamed from: i, reason: collision with root package name */
    public float f32859i;

    /* renamed from: j, reason: collision with root package name */
    public int f32860j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f32861k;

    /* renamed from: l, reason: collision with root package name */
    public final FrameLayout f32862l;

    /* renamed from: m, reason: collision with root package name */
    public final View f32863m;

    /* renamed from: n, reason: collision with root package name */
    public final ImageView f32864n;

    /* renamed from: o, reason: collision with root package name */
    public final ViewGroup f32865o;

    /* renamed from: p, reason: collision with root package name */
    public final TextView f32866p;

    /* renamed from: q, reason: collision with root package name */
    public final TextView f32867q;

    /* renamed from: r, reason: collision with root package name */
    public int f32868r;

    /* renamed from: s, reason: collision with root package name */
    public q f32869s;

    /* renamed from: t, reason: collision with root package name */
    public ColorStateList f32870t;

    /* renamed from: u, reason: collision with root package name */
    public Drawable f32871u;

    /* renamed from: v, reason: collision with root package name */
    public Drawable f32872v;

    /* renamed from: w, reason: collision with root package name */
    public ValueAnimator f32873w;

    /* renamed from: x, reason: collision with root package name */
    public d f32874x;

    /* renamed from: y, reason: collision with root package name */
    public float f32875y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f32876z;

    public f(Context context) {
        super(context);
        int i13;
        int i14;
        int i15 = 0;
        this.f32851a = false;
        this.f32868r = 0;
        this.f32874x = G;
        this.f32875y = 0.0f;
        this.f32876z = false;
        this.A = 0;
        this.B = 0;
        this.C = false;
        this.D = 0;
        LayoutInflater from = LayoutInflater.from(context);
        int i16 = ((jj.a) this).I;
        switch (i16) {
            case 0:
                i13 = fj.i.design_bottom_navigation_item;
                break;
            default:
                i13 = fj.i.mtrl_navigation_rail_item;
                break;
        }
        from.inflate(i13, (ViewGroup) this, true);
        this.f32862l = (FrameLayout) findViewById(fj.g.navigation_bar_item_icon_container);
        this.f32863m = findViewById(fj.g.navigation_bar_item_active_indicator_view);
        ImageView imageView = (ImageView) findViewById(fj.g.navigation_bar_item_icon_view);
        this.f32864n = imageView;
        ViewGroup viewGroup = (ViewGroup) findViewById(fj.g.navigation_bar_item_labels_group);
        this.f32865o = viewGroup;
        TextView textView = (TextView) findViewById(fj.g.navigation_bar_item_small_label_view);
        this.f32866p = textView;
        TextView textView2 = (TextView) findViewById(fj.g.navigation_bar_item_large_label_view);
        this.f32867q = textView2;
        setBackgroundResource(fj.f.mtrl_navigation_bar_item_background);
        Resources resources = getResources();
        switch (i16) {
            case 0:
                i14 = fj.e.design_bottom_navigation_margin;
                break;
            default:
                i14 = fj.e.mtrl_navigation_rail_icon_margin;
                break;
        }
        this.f32854d = resources.getDimensionPixelSize(i14);
        this.f32855e = viewGroup.getPaddingBottom();
        this.f32856f = getResources().getDimensionPixelSize(fj.e.m3_navigation_item_active_indicator_label_padding);
        WeakHashMap weakHashMap = v0.f102521a;
        textView.setImportantForAccessibility(2);
        textView2.setImportantForAccessibility(2);
        setFocusable(true);
        a(textView.getTextSize(), textView2.getTextSize());
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new b(this, i15));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void l(android.widget.TextView r4, int r5) {
        /*
            r4.setTextAppearance(r5)
            android.content.Context r0 = r4.getContext()
            r1 = 0
            if (r5 != 0) goto Lc
        La:
            r5 = r1
            goto L4e
        Lc:
            int[] r2 = fj.m.TextAppearance
            android.content.res.TypedArray r5 = r0.obtainStyledAttributes(r5, r2)
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            int r3 = fj.m.TextAppearance_android_textSize
            boolean r3 = r5.getValue(r3, r2)
            r5.recycle()
            if (r3 != 0) goto L23
            goto La
        L23:
            int r5 = r2.getComplexUnit()
            r3 = 2
            if (r5 != r3) goto L40
            int r5 = r2.data
            float r5 = android.util.TypedValue.complexToFloat(r5)
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r5 = r5 * r0
            int r5 = java.lang.Math.round(r5)
            goto L4e
        L40:
            int r5 = r2.data
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r5 = android.util.TypedValue.complexToDimensionPixelSize(r5, r0)
        L4e:
            if (r5 == 0) goto L54
            float r5 = (float) r5
            r4.setTextSize(r1, r5)
        L54:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.navigation.f.l(android.widget.TextView, int):void");
    }

    public static void n(float f13, float f14, int i13, TextView textView) {
        textView.setScaleX(f13);
        textView.setScaleY(f14);
        textView.setVisibility(i13);
    }

    public static void o(View view, int i13, int i14) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i13;
        layoutParams.bottomMargin = i13;
        layoutParams.gravity = i14;
        view.setLayoutParams(layoutParams);
    }

    public static void q(ViewGroup viewGroup, int i13) {
        viewGroup.setPadding(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop(), viewGroup.getPaddingRight(), i13);
    }

    public final void a(float f13, float f14) {
        this.f32857g = f13 - f14;
        this.f32858h = (f14 * 1.0f) / f13;
        this.f32859i = (f13 * 1.0f) / f14;
    }

    public final View b() {
        FrameLayout frameLayout = this.f32862l;
        return frameLayout != null ? frameLayout : this.f32864n;
    }

    public final void c() {
        q qVar = this.f32869s;
        if (qVar != null) {
            i(qVar.isChecked());
        }
    }

    public final void d() {
        Drawable drawable = this.f32853c;
        ColorStateList colorStateList = this.f32852b;
        FrameLayout frameLayout = this.f32862l;
        RippleDrawable rippleDrawable = null;
        boolean z13 = true;
        if (colorStateList != null) {
            View view = this.f32863m;
            Drawable background = view == null ? null : view.getBackground();
            if (this.f32876z) {
                if ((view == null ? null : view.getBackground()) != null && frameLayout != null && background != null) {
                    rippleDrawable = new RippleDrawable(zj.a.c(this.f32852b), null, background);
                    z13 = false;
                }
            }
            if (drawable == null) {
                drawable = new RippleDrawable(zj.a.a(this.f32852b), null, null);
            }
        }
        if (frameLayout != null) {
            frameLayout.setPadding(0, 0, 0, 0);
            frameLayout.setForeground(rippleDrawable);
        }
        WeakHashMap weakHashMap = v0.f102521a;
        setBackground(drawable);
        setDefaultFocusHighlightEnabled(z13);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        FrameLayout frameLayout = this.f32862l;
        if (frameLayout != null && this.f32876z) {
            frameLayout.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // n.b0
    public final void e(q qVar) {
        this.f32869s = qVar;
        qVar.getClass();
        refreshDrawableState();
        i(qVar.isChecked());
        setEnabled(qVar.isEnabled());
        Drawable icon = qVar.getIcon();
        if (icon != this.f32871u) {
            this.f32871u = icon;
            if (icon != null) {
                Drawable.ConstantState constantState = icon.getConstantState();
                if (constantState != null) {
                    icon = constantState.newDrawable();
                }
                icon = icon.mutate();
                this.f32872v = icon;
                ColorStateList colorStateList = this.f32870t;
                if (colorStateList != null) {
                    icon.setTintList(colorStateList);
                }
            }
            this.f32864n.setImageDrawable(icon);
        }
        CharSequence charSequence = qVar.f88679e;
        this.f32866p.setText(charSequence);
        this.f32867q.setText(charSequence);
        q qVar2 = this.f32869s;
        if (qVar2 == null || TextUtils.isEmpty(qVar2.f88691q)) {
            setContentDescription(charSequence);
        }
        q qVar3 = this.f32869s;
        if (qVar3 != null && !TextUtils.isEmpty(qVar3.f88692r)) {
            charSequence = this.f32869s.f88692r;
        }
        i3.a(this, charSequence);
        setId(qVar.f88675a);
        if (!TextUtils.isEmpty(qVar.f88691q)) {
            setContentDescription(qVar.f88691q);
        }
        i3.a(this, !TextUtils.isEmpty(qVar.f88692r) ? qVar.f88692r : qVar.f88679e);
        setVisibility(qVar.isVisible() ? 0 : 8);
        this.f32851a = true;
    }

    public final void f(float f13, float f14) {
        View view = this.f32863m;
        if (view != null) {
            d dVar = this.f32874x;
            dVar.getClass();
            view.setScaleX(gj.a.a(0.4f, 1.0f, f13));
            view.setScaleY(dVar.a(f13, f14));
            view.setAlpha(gj.a.b(0.0f, 1.0f, f14 == 0.0f ? 0.8f : 0.0f, f14 == 0.0f ? 1.0f : 0.2f, f13));
        }
        this.f32875y = f13;
    }

    @Override // n.b0
    public final q g() {
        return this.f32869s;
    }

    @Override // android.view.View
    public final int getSuggestedMinimumHeight() {
        ViewGroup viewGroup = this.f32865o;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
        return viewGroup.getMeasuredHeight() + b().getMeasuredHeight() + ((FrameLayout.LayoutParams) b().getLayoutParams()).topMargin + (viewGroup.getVisibility() == 0 ? this.f32856f : 0) + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    public final int getSuggestedMinimumWidth() {
        ViewGroup viewGroup = this.f32865o;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
        int measuredWidth = viewGroup.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
        hj.a aVar = this.E;
        int minimumWidth = aVar == null ? 0 : aVar.getMinimumWidth() - this.E.f69259e.f69269b.f32224w.intValue();
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) b().getLayoutParams();
        return Math.max(Math.max(minimumWidth, layoutParams2.rightMargin) + this.f32864n.getMeasuredWidth() + Math.max(minimumWidth, layoutParams2.leftMargin), measuredWidth);
    }

    public final void h(hj.a aVar) {
        hj.a aVar2 = this.E;
        if (aVar2 == aVar) {
            return;
        }
        boolean z13 = aVar2 != null;
        ImageView imageView = this.f32864n;
        if (z13 && imageView != null) {
            Log.w("NavigationBar", "Multiple badges shouldn't be attached to one item.");
            if (this.E != null) {
                setClipChildren(true);
                setClipToPadding(true);
                hj.a aVar3 = this.E;
                if (aVar3 != null) {
                    if (aVar3.c() != null) {
                        aVar3.c().setForeground(null);
                    } else {
                        imageView.getOverlay().remove(aVar3);
                    }
                }
                this.E = null;
            }
        }
        this.E = aVar;
        if (imageView != null) {
            setClipChildren(false);
            setClipToPadding(false);
            hj.a aVar4 = this.E;
            Rect rect = new Rect();
            imageView.getDrawingRect(rect);
            aVar4.setBounds(rect);
            aVar4.i(imageView, null);
            if (aVar4.c() != null) {
                aVar4.c().setForeground(aVar4);
            } else {
                imageView.getOverlay().add(aVar4);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(boolean r13) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.navigation.f.i(boolean):void");
    }

    public final void j(int i13) {
        if (this.f32860j != i13) {
            this.f32860j = i13;
            if (this.C && i13 == 2) {
                this.f32874x = H;
            } else {
                this.f32874x = G;
            }
            p(getWidth());
            c();
        }
    }

    public final void k(int i13) {
        this.f32868r = i13;
        TextView textView = this.f32867q;
        l(textView, i13);
        a(this.f32866p.getTextSize(), textView.getTextSize());
    }

    public final void m(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f32866p.setTextColor(colorStateList);
            this.f32867q.setTextColor(colorStateList);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i13) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i13 + 1);
        q qVar = this.f32869s;
        if (qVar != null && qVar.isCheckable() && this.f32869s.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, F);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        Context context;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        hj.a aVar = this.E;
        if (aVar != null && aVar.isVisible()) {
            q qVar = this.f32869s;
            CharSequence charSequence = qVar.f88679e;
            if (!TextUtils.isEmpty(qVar.f88691q)) {
                charSequence = this.f32869s.f88691q;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append((Object) charSequence);
            sb3.append(", ");
            hj.a aVar2 = this.E;
            CharSequence charSequence2 = null;
            if (aVar2.isVisible()) {
                hj.b bVar = aVar2.f69259e;
                BadgeState$State badgeState$State = bVar.f69269b;
                String str = badgeState$State.f32211j;
                if (str != null) {
                    CharSequence charSequence3 = badgeState$State.f32216o;
                    charSequence2 = charSequence3 != null ? charSequence3 : str;
                } else {
                    boolean g13 = aVar2.g();
                    BadgeState$State badgeState$State2 = bVar.f69269b;
                    if (!g13) {
                        charSequence2 = badgeState$State2.f32217p;
                    } else if (badgeState$State2.f32218q != 0 && (context = (Context) aVar2.f69255a.get()) != null) {
                        if (aVar2.f69262h != -2) {
                            int d2 = aVar2.d();
                            int i13 = aVar2.f69262h;
                            if (d2 > i13) {
                                charSequence2 = context.getString(badgeState$State2.f32219r, Integer.valueOf(i13));
                            }
                        }
                        charSequence2 = context.getResources().getQuantityString(badgeState$State2.f32218q, aVar2.d(), Integer.valueOf(aVar2.d()));
                    }
                }
            }
            sb3.append((Object) charSequence2);
            accessibilityNodeInfo.setContentDescription(sb3.toString());
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int indexOfChild = viewGroup.indexOfChild(this);
        int i14 = 0;
        for (int i15 = 0; i15 < indexOfChild; i15++) {
            View childAt = viewGroup.getChildAt(i15);
            if ((childAt instanceof f) && childAt.getVisibility() == 0) {
                i14++;
            }
        }
        accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) y1.j(0, 1, i14, 1, false, isSelected()).f19715a);
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) r5.d.f106213g.f106227a);
        }
        accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(fj.k.item_view_role_description));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i13, int i14, int i15, int i16) {
        super.onSizeChanged(i13, i14, i15, i16);
        post(new x(this, i13, 1));
    }

    public final void p(int i13) {
        View view = this.f32863m;
        if (view == null || i13 <= 0) {
            return;
        }
        int min = Math.min(this.A, i13 - (this.D * 2));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.height = (this.C && this.f32860j == 2) ? min : this.B;
        layoutParams.width = min;
        view.setLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void setEnabled(boolean z13) {
        super.setEnabled(z13);
        this.f32866p.setEnabled(z13);
        this.f32867q.setEnabled(z13);
        this.f32864n.setEnabled(z13);
        if (!z13) {
            WeakHashMap weakHashMap = v0.f102521a;
            o0.a(this, null);
        } else {
            PointerIcon systemIcon = PointerIcon.getSystemIcon(getContext(), 1002);
            WeakHashMap weakHashMap2 = v0.f102521a;
            o0.a(this, systemIcon);
        }
    }
}
