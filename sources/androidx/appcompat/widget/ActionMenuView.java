package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.LinearLayoutCompat;

/* loaded from: classes2.dex */
public class ActionMenuView extends LinearLayoutCompat implements n.n, n.c0 {
    public c3 A;

    /* renamed from: p, reason: collision with root package name */
    public n.o f16250p;

    /* renamed from: q, reason: collision with root package name */
    public Context f16251q;

    /* renamed from: r, reason: collision with root package name */
    public int f16252r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f16253s;

    /* renamed from: t, reason: collision with root package name */
    public n f16254t;

    /* renamed from: u, reason: collision with root package name */
    public n.z f16255u;

    /* renamed from: v, reason: collision with root package name */
    public n.m f16256v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f16257w;

    /* renamed from: x, reason: collision with root package name */
    public int f16258x;

    /* renamed from: y, reason: collision with root package name */
    public final int f16259y;

    /* renamed from: z, reason: collision with root package name */
    public final int f16260z;

    public static class LayoutParams extends LinearLayoutCompat.LayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public boolean f16261a;

        /* renamed from: b, reason: collision with root package name */
        public int f16262b;

        /* renamed from: c, reason: collision with root package name */
        public int f16263c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f16264d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f16265e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f16266f;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public ActionMenuView(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16357a = false;
        float f13 = context.getResources().getDisplayMetrics().density;
        this.f16259y = (int) (56.0f * f13);
        this.f16260z = (int) (f13 * 4.0f);
        this.f16251q = context;
        this.f16252r = 0;
    }

    public static LayoutParams t() {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.f16261a = false;
        ((LinearLayout.LayoutParams) layoutParams).gravity = 16;
        return layoutParams;
    }

    public static LayoutParams u(ViewGroup.LayoutParams layoutParams) {
        LayoutParams layoutParams2;
        if (layoutParams == null) {
            return t();
        }
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams3 = (LayoutParams) layoutParams;
            layoutParams2 = new LayoutParams(layoutParams3);
            layoutParams2.f16261a = layoutParams3.f16261a;
        } else {
            layoutParams2 = new LayoutParams(layoutParams);
        }
        if (((LinearLayout.LayoutParams) layoutParams2).gravity <= 0) {
            ((LinearLayout.LayoutParams) layoutParams2).gravity = 16;
        }
        return layoutParams2;
    }

    @Override // n.c0
    public final void a(n.o oVar) {
        this.f16250p = oVar;
    }

    @Override // n.n
    public final boolean b(n.q qVar) {
        return this.f16250p.r(qVar, null, 0);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return t();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return u(layoutParams);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: k */
    public final /* bridge */ /* synthetic */ LinearLayoutCompat.LayoutParams generateDefaultLayoutParams() {
        return t();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: l */
    public final LinearLayoutCompat.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: m */
    public final /* bridge */ /* synthetic */ LinearLayoutCompat.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return u(layoutParams);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        n nVar = this.f16254t;
        if (nVar != null) {
            nVar.h(false);
            if (this.f16254t.l()) {
                this.f16254t.k();
                this.f16254t.n();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        n nVar = this.f16254t;
        if (nVar != null) {
            nVar.k();
            h hVar = nVar.f16659s;
            if (hVar == null || !hVar.b()) {
                return;
            }
            hVar.f88722j.dismiss();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        int width;
        int i17;
        if (!this.f16257w) {
            super.onLayout(z13, i13, i14, i15, i16);
            return;
        }
        int childCount = getChildCount();
        int i18 = (i16 - i14) / 2;
        int i19 = this.f16368l;
        int i23 = i15 - i13;
        int paddingRight = (i23 - getPaddingRight()) - getPaddingLeft();
        boolean z14 = l3.f16639a;
        boolean z15 = getLayoutDirection() == 1;
        int i24 = 0;
        int i25 = 0;
        for (int i26 = 0; i26 < childCount; i26++) {
            View childAt = getChildAt(i26);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f16261a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (w(i26)) {
                        measuredWidth += i19;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z15) {
                        i17 = getPaddingLeft() + ((LinearLayout.LayoutParams) layoutParams).leftMargin;
                        width = i17 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                        i17 = width - measuredWidth;
                    }
                    int i27 = i18 - (measuredHeight / 2);
                    childAt.layout(i17, i27, width, measuredHeight + i27);
                    paddingRight -= measuredWidth;
                    i24 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) layoutParams).leftMargin) + ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                    w(i26);
                    i25++;
                }
            }
        }
        if (childCount == 1 && i24 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i28 = (i23 / 2) - (measuredWidth2 / 2);
            int i29 = i18 - (measuredHeight2 / 2);
            childAt2.layout(i28, i29, measuredWidth2 + i28, measuredHeight2 + i29);
            return;
        }
        int i33 = i25 - (i24 ^ 1);
        int max = Math.max(0, i33 > 0 ? paddingRight / i33 : 0);
        if (z15) {
            int width2 = getWidth() - getPaddingRight();
            for (int i34 = 0; i34 < childCount; i34++) {
                View childAt3 = getChildAt(i34);
                LayoutParams layoutParams2 = (LayoutParams) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !layoutParams2.f16261a) {
                    int i35 = width2 - ((LinearLayout.LayoutParams) layoutParams2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i36 = i18 - (measuredHeight3 / 2);
                    childAt3.layout(i35 - measuredWidth3, i36, i35, measuredHeight3 + i36);
                    width2 = i35 - ((measuredWidth3 + ((LinearLayout.LayoutParams) layoutParams2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i37 = 0; i37 < childCount; i37++) {
            View childAt4 = getChildAt(i37);
            LayoutParams layoutParams3 = (LayoutParams) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !layoutParams3.f16261a) {
                int i38 = paddingLeft + ((LinearLayout.LayoutParams) layoutParams3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i39 = i18 - (measuredHeight4 / 2);
                childAt4.layout(i38, i39, i38 + measuredWidth4, measuredHeight4 + i39);
                paddingLeft = measuredWidth4 + ((LinearLayout.LayoutParams) layoutParams3).rightMargin + max + i38;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v26 */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onMeasure(int i13, int i14) {
        int i15;
        int i16;
        int i17;
        boolean z13;
        int i18;
        int i19;
        int i23;
        int i24;
        ?? r13;
        int i25;
        int i26;
        int i27;
        n.o oVar;
        boolean z14 = this.f16257w;
        boolean z15 = View.MeasureSpec.getMode(i13) == 1073741824;
        this.f16257w = z15;
        if (z14 != z15) {
            this.f16258x = 0;
        }
        int size = View.MeasureSpec.getSize(i13);
        if (this.f16257w && (oVar = this.f16250p) != null && size != this.f16258x) {
            this.f16258x = size;
            oVar.q(true);
        }
        int childCount = getChildCount();
        if (!this.f16257w || childCount <= 0) {
            for (int i28 = 0; i28 < childCount; i28++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i28).getLayoutParams();
                ((LinearLayout.LayoutParams) layoutParams).rightMargin = 0;
                ((LinearLayout.LayoutParams) layoutParams).leftMargin = 0;
            }
            super.onMeasure(i13, i14);
            return;
        }
        int mode = View.MeasureSpec.getMode(i14);
        int size2 = View.MeasureSpec.getSize(i13);
        int size3 = View.MeasureSpec.getSize(i14);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i14, paddingBottom, -2);
        int i29 = size2 - paddingRight;
        int i33 = this.f16259y;
        int i34 = i29 / i33;
        int i35 = i29 % i33;
        if (i34 == 0) {
            setMeasuredDimension(i29, 0);
            return;
        }
        int i36 = (i35 / i34) + i33;
        int childCount2 = getChildCount();
        int i37 = 0;
        int i38 = 0;
        int i39 = 0;
        boolean z16 = false;
        int i43 = 0;
        int i44 = 0;
        long j13 = 0;
        while (true) {
            i15 = this.f16260z;
            if (i39 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i39);
            int i45 = size3;
            if (childAt.getVisibility() == 8) {
                i25 = i29;
                i26 = paddingBottom;
            } else {
                boolean z17 = childAt instanceof ActionMenuItemView;
                int i46 = i37 + 1;
                if (z17) {
                    childAt.setPadding(i15, 0, i15, 0);
                }
                LayoutParams layoutParams2 = (LayoutParams) childAt.getLayoutParams();
                layoutParams2.f16266f = false;
                layoutParams2.f16263c = 0;
                layoutParams2.f16262b = 0;
                layoutParams2.f16264d = false;
                ((LinearLayout.LayoutParams) layoutParams2).leftMargin = 0;
                ((LinearLayout.LayoutParams) layoutParams2).rightMargin = 0;
                layoutParams2.f16265e = z17 && (TextUtils.isEmpty(((ActionMenuItemView) childAt).getText()) ^ true);
                int i47 = layoutParams2.f16261a ? 1 : i34;
                LayoutParams layoutParams3 = (LayoutParams) childAt.getLayoutParams();
                i25 = i29;
                i26 = paddingBottom;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingBottom, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z17 ? (ActionMenuItemView) childAt : null;
                boolean z18 = actionMenuItemView != null && (TextUtils.isEmpty(actionMenuItemView.getText()) ^ true);
                if (i47 <= 0 || (z18 && i47 < 2)) {
                    i27 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i47 * i36, Integer.MIN_VALUE), makeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i27 = measuredWidth / i36;
                    if (measuredWidth % i36 != 0) {
                        i27++;
                    }
                    if (z18 && i27 < 2) {
                        i27 = 2;
                    }
                }
                layoutParams3.f16264d = !layoutParams3.f16261a && z18;
                layoutParams3.f16262b = i27;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i27 * i36, 1073741824), makeMeasureSpec);
                i38 = Math.max(i38, i27);
                if (layoutParams2.f16264d) {
                    i43++;
                }
                if (layoutParams2.f16261a) {
                    z16 = true;
                }
                i34 -= i27;
                i44 = Math.max(i44, childAt.getMeasuredHeight());
                if (i27 == 1) {
                    j13 |= 1 << i39;
                }
                i37 = i46;
            }
            i39++;
            size3 = i45;
            paddingBottom = i26;
            i29 = i25;
        }
        int i48 = i29;
        int i49 = size3;
        int i53 = i44;
        boolean z19 = z16 && i37 == 2;
        boolean z23 = false;
        while (i43 > 0 && i34 > 0) {
            int i54 = Integer.MAX_VALUE;
            int i55 = 0;
            int i56 = 0;
            long j14 = 0;
            while (i56 < childCount2) {
                int i57 = i53;
                LayoutParams layoutParams4 = (LayoutParams) getChildAt(i56).getLayoutParams();
                boolean z24 = z23;
                if (layoutParams4.f16264d) {
                    int i58 = layoutParams4.f16262b;
                    if (i58 < i54) {
                        j14 = 1 << i56;
                        i54 = i58;
                        i55 = 1;
                    } else if (i58 == i54) {
                        i55++;
                        j14 |= 1 << i56;
                    }
                }
                i56++;
                z23 = z24;
                i53 = i57;
            }
            i17 = i53;
            z13 = z23;
            j13 |= j14;
            if (i55 > i34) {
                i16 = mode;
                break;
            }
            int i59 = i54 + 1;
            int i63 = 0;
            while (i63 < childCount2) {
                View childAt2 = getChildAt(i63);
                LayoutParams layoutParams5 = (LayoutParams) childAt2.getLayoutParams();
                int i64 = mode;
                int i65 = childMeasureSpec;
                int i66 = childCount2;
                long j15 = 1 << i63;
                if ((j14 & j15) != 0) {
                    if (z19 && layoutParams5.f16265e) {
                        r13 = 1;
                        r13 = 1;
                        if (i34 == 1) {
                            childAt2.setPadding(i15 + i36, 0, i15, 0);
                        }
                    } else {
                        r13 = 1;
                    }
                    layoutParams5.f16262b += r13;
                    layoutParams5.f16266f = r13;
                    i34--;
                } else if (layoutParams5.f16262b == i59) {
                    j13 |= j15;
                }
                i63++;
                childMeasureSpec = i65;
                mode = i64;
                childCount2 = i66;
            }
            i53 = i17;
            z23 = true;
        }
        i16 = mode;
        i17 = i53;
        z13 = z23;
        int i67 = childMeasureSpec;
        int i68 = childCount2;
        boolean z25 = !z16 && i37 == 1;
        if (i34 <= 0 || j13 == 0 || (i34 >= i37 - 1 && !z25 && i38 <= 1)) {
            i18 = i68;
        } else {
            float bitCount = Long.bitCount(j13);
            if (!z25) {
                if ((j13 & 1) != 0 && !((LayoutParams) getChildAt(0).getLayoutParams()).f16265e) {
                    bitCount -= 0.5f;
                }
                int i69 = i68 - 1;
                if ((j13 & (1 << i69)) != 0 && !((LayoutParams) getChildAt(i69).getLayoutParams()).f16265e) {
                    bitCount -= 0.5f;
                }
            }
            int i73 = bitCount > 0.0f ? (int) ((i34 * i36) / bitCount) : 0;
            i18 = i68;
            for (int i74 = 0; i74 < i18; i74++) {
                if ((j13 & (1 << i74)) != 0) {
                    View childAt3 = getChildAt(i74);
                    LayoutParams layoutParams6 = (LayoutParams) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        layoutParams6.f16263c = i73;
                        layoutParams6.f16266f = true;
                        if (i74 == 0 && !layoutParams6.f16265e) {
                            ((LinearLayout.LayoutParams) layoutParams6).leftMargin = (-i73) / 2;
                        }
                        z13 = true;
                    } else if (layoutParams6.f16261a) {
                        layoutParams6.f16263c = i73;
                        layoutParams6.f16266f = true;
                        ((LinearLayout.LayoutParams) layoutParams6).rightMargin = (-i73) / 2;
                        z13 = true;
                    } else {
                        if (i74 != 0) {
                            ((LinearLayout.LayoutParams) layoutParams6).leftMargin = i73 / 2;
                        }
                        if (i74 != i18 - 1) {
                            ((LinearLayout.LayoutParams) layoutParams6).rightMargin = i73 / 2;
                        }
                    }
                }
            }
        }
        if (z13) {
            int i75 = 0;
            while (i75 < i18) {
                View childAt4 = getChildAt(i75);
                LayoutParams layoutParams7 = (LayoutParams) childAt4.getLayoutParams();
                if (layoutParams7.f16266f) {
                    i24 = i67;
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((layoutParams7.f16262b * i36) + layoutParams7.f16263c, 1073741824), i24);
                } else {
                    i24 = i67;
                }
                i75++;
                i67 = i24;
            }
        }
        if (i16 != 1073741824) {
            i23 = i48;
            i19 = i17;
        } else {
            i19 = i49;
            i23 = i48;
        }
        setMeasuredDimension(i23, i19);
    }

    public final n.o v() {
        if (this.f16250p == null) {
            Context context = getContext();
            n.o oVar = new n.o(context);
            this.f16250p = oVar;
            oVar.f88652e = new q(this, 0);
            n nVar = new n(context);
            this.f16254t = nVar;
            nVar.f16651k = true;
            nVar.f16652l = true;
            n.z zVar = this.f16255u;
            if (zVar == null) {
                zVar = new p();
            }
            nVar.f88565e = zVar;
            this.f16250p.c(nVar, this.f16251q);
            n nVar2 = this.f16254t;
            nVar2.f88568h = this;
            this.f16250p = nVar2.f88563c;
        }
        return this.f16250p;
    }

    public final boolean w(int i13) {
        boolean z13 = false;
        if (i13 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i13 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i13);
        if (i13 < getChildCount() && (childAt instanceof o)) {
            z13 = ((o) childAt).g0();
        }
        return (i13 <= 0 || !(childAt2 instanceof o)) ? z13 : z13 | ((o) childAt2).t0();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }
}
