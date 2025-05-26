package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar$LayoutParams;
import androidx.customview.view.AbsSavedState;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class Toolbar extends ViewGroup implements q5.l {
    public final ColorStateList A;
    public boolean B;
    public boolean C;
    public final ArrayList D;
    public final ArrayList E;
    public final int[] F;
    public final q5.p G;
    public ArrayList H;
    public androidx.appcompat.app.w0 I;

    /* renamed from: J, reason: collision with root package name */
    public final c3 f16468J;
    public h3 K;
    public n L;
    public f3 M;
    public n.z N;
    public n.m O;
    public boolean P;
    public OnBackInvokedCallback Q;
    public OnBackInvokedDispatcher R;
    public boolean S;
    public final i1 T;

    /* renamed from: a, reason: collision with root package name */
    public ActionMenuView f16469a;

    /* renamed from: b, reason: collision with root package name */
    public AppCompatTextView f16470b;

    /* renamed from: c, reason: collision with root package name */
    public AppCompatTextView f16471c;

    /* renamed from: d, reason: collision with root package name */
    public AppCompatImageButton f16472d;

    /* renamed from: e, reason: collision with root package name */
    public AppCompatImageView f16473e;

    /* renamed from: f, reason: collision with root package name */
    public final Drawable f16474f;

    /* renamed from: g, reason: collision with root package name */
    public final CharSequence f16475g;

    /* renamed from: h, reason: collision with root package name */
    public AppCompatImageButton f16476h;

    /* renamed from: i, reason: collision with root package name */
    public View f16477i;

    /* renamed from: j, reason: collision with root package name */
    public Context f16478j;

    /* renamed from: k, reason: collision with root package name */
    public int f16479k;

    /* renamed from: l, reason: collision with root package name */
    public int f16480l;

    /* renamed from: m, reason: collision with root package name */
    public int f16481m;

    /* renamed from: n, reason: collision with root package name */
    public final int f16482n;

    /* renamed from: o, reason: collision with root package name */
    public final int f16483o;

    /* renamed from: p, reason: collision with root package name */
    public final int f16484p;

    /* renamed from: q, reason: collision with root package name */
    public final int f16485q;

    /* renamed from: r, reason: collision with root package name */
    public final int f16486r;

    /* renamed from: s, reason: collision with root package name */
    public final int f16487s;

    /* renamed from: t, reason: collision with root package name */
    public g2 f16488t;

    /* renamed from: u, reason: collision with root package name */
    public final int f16489u;

    /* renamed from: v, reason: collision with root package name */
    public final int f16490v;

    /* renamed from: w, reason: collision with root package name */
    public final int f16491w;

    /* renamed from: x, reason: collision with root package name */
    public CharSequence f16492x;

    /* renamed from: y, reason: collision with root package name */
    public CharSequence f16493y;

    /* renamed from: z, reason: collision with root package name */
    public final ColorStateList f16494z;

    public static class LayoutParams extends ActionBar$LayoutParams {

        /* renamed from: b, reason: collision with root package name */
        public int f16495b;

        public LayoutParams(@NonNull Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f16495b = 0;
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new g3();

        /* renamed from: c, reason: collision with root package name */
        public int f16496c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f16497d;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f16496c = parcel.readInt();
            this.f16497d = parcel.readInt() != 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            super.writeToParcel(parcel, i13);
            parcel.writeInt(this.f16496c);
            parcel.writeInt(this.f16497d ? 1 : 0);
        }
    }

    public Toolbar(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i.a.toolbarStyle);
    }

    public static LayoutParams g() {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.f16495b = 0;
        layoutParams.f15945a = 8388627;
        return layoutParams;
    }

    public static LayoutParams h(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            LayoutParams layoutParams3 = new LayoutParams(layoutParams2);
            layoutParams3.f16495b = 0;
            layoutParams3.f16495b = layoutParams2.f16495b;
            return layoutParams3;
        }
        if (layoutParams instanceof ActionBar$LayoutParams) {
            LayoutParams layoutParams4 = new LayoutParams((ActionBar$LayoutParams) layoutParams);
            layoutParams4.f16495b = 0;
            return layoutParams4;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            LayoutParams layoutParams5 = new LayoutParams(layoutParams);
            layoutParams5.f16495b = 0;
            return layoutParams5;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        LayoutParams layoutParams6 = new LayoutParams(marginLayoutParams);
        layoutParams6.f16495b = 0;
        ((ViewGroup.MarginLayoutParams) layoutParams6).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) layoutParams6).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) layoutParams6).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) layoutParams6).bottomMargin = marginLayoutParams.bottomMargin;
        return layoutParams6;
    }

    public static int m(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int p(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public void A(Drawable drawable) {
        if (drawable != null) {
            f();
            if (!r(this.f16472d)) {
                c(this.f16472d, true);
            }
        } else {
            AppCompatImageButton appCompatImageButton = this.f16472d;
            if (appCompatImageButton != null && r(appCompatImageButton)) {
                removeView(this.f16472d);
                this.E.remove(this.f16472d);
            }
        }
        AppCompatImageButton appCompatImageButton2 = this.f16472d;
        if (appCompatImageButton2 != null) {
            appCompatImageButton2.setImageDrawable(drawable);
        }
    }

    public void B(View.OnClickListener onClickListener) {
        f();
        this.f16472d.setOnClickListener(onClickListener);
    }

    public void C(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            AppCompatTextView appCompatTextView = this.f16471c;
            if (appCompatTextView != null && r(appCompatTextView)) {
                removeView(this.f16471c);
                this.E.remove(this.f16471c);
            }
        } else {
            if (this.f16471c == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(context, null);
                this.f16471c = appCompatTextView2;
                appCompatTextView2.setSingleLine();
                this.f16471c.setEllipsize(TextUtils.TruncateAt.END);
                int i13 = this.f16481m;
                if (i13 != 0) {
                    this.f16471c.setTextAppearance(context, i13);
                }
                ColorStateList colorStateList = this.A;
                if (colorStateList != null) {
                    this.f16471c.setTextColor(colorStateList);
                }
            }
            if (!r(this.f16471c)) {
                c(this.f16471c, true);
            }
        }
        AppCompatTextView appCompatTextView3 = this.f16471c;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.f16493y = charSequence;
    }

    public void D(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            AppCompatTextView appCompatTextView = this.f16470b;
            if (appCompatTextView != null && r(appCompatTextView)) {
                removeView(this.f16470b);
                this.E.remove(this.f16470b);
            }
        } else {
            if (this.f16470b == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(context, null);
                this.f16470b = appCompatTextView2;
                appCompatTextView2.setSingleLine();
                this.f16470b.setEllipsize(TextUtils.TruncateAt.END);
                int i13 = this.f16480l;
                if (i13 != 0) {
                    this.f16470b.setTextAppearance(context, i13);
                }
                ColorStateList colorStateList = this.f16494z;
                if (colorStateList != null) {
                    this.f16470b.setTextColor(colorStateList);
                }
            }
            if (!r(this.f16470b)) {
                c(this.f16470b, true);
            }
        }
        AppCompatTextView appCompatTextView3 = this.f16470b;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.f16492x = charSequence;
    }

    public final boolean E(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public final boolean F() {
        n nVar;
        ActionMenuView actionMenuView = this.f16469a;
        return (actionMenuView == null || (nVar = actionMenuView.f16254t) == null || !nVar.n()) ? false : true;
    }

    public final void G() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher a13 = e3.a(this);
            f3 f3Var = this.M;
            int i13 = 0;
            boolean z13 = (f3Var != null && f3Var.f16562b != null) && a13 != null && isAttachedToWindow() && this.S;
            if (z13 && this.R == null) {
                if (this.Q == null) {
                    this.Q = e3.b(new b3(this, i13));
                }
                e3.c(a13, this.Q);
                this.R = a13;
                return;
            }
            if (z13 || (onBackInvokedDispatcher = this.R) == null) {
                return;
            }
            e3.d(onBackInvokedDispatcher, this.Q);
            this.R = null;
        }
    }

    @Override // q5.l
    public final void addMenuProvider(q5.q qVar) {
        q5.p pVar = this.G;
        pVar.f102493b.add(qVar);
        pVar.f102492a.run();
    }

    public final void b(int i13, ArrayList arrayList) {
        boolean z13 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i13, getLayoutDirection());
        arrayList.clear();
        if (!z13) {
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = getChildAt(i14);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f16495b == 0 && E(childAt)) {
                    int i15 = layoutParams.f15945a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i15, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i16 = childCount - 1; i16 >= 0; i16--) {
            View childAt2 = getChildAt(i16);
            LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
            if (layoutParams2.f16495b == 0 && E(childAt2)) {
                int i17 = layoutParams2.f15945a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i17, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void c(View view, boolean z13) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        LayoutParams g13 = layoutParams == null ? g() : !checkLayoutParams(layoutParams) ? h(layoutParams) : (LayoutParams) layoutParams;
        g13.f16495b = 1;
        if (!z13 || this.f16477i == null) {
            addView(view, g13);
        } else {
            view.setLayoutParams(g13);
            this.E.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof LayoutParams);
    }

    public final void d() {
        if (this.f16488t == null) {
            g2 g2Var = new g2();
            g2Var.f16569a = 0;
            g2Var.f16570b = 0;
            g2Var.f16571c = Integer.MIN_VALUE;
            g2Var.f16572d = Integer.MIN_VALUE;
            g2Var.f16573e = 0;
            g2Var.f16574f = 0;
            g2Var.f16575g = false;
            g2Var.f16576h = false;
            this.f16488t = g2Var;
        }
    }

    public final void e() {
        if (this.f16469a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f16469a = actionMenuView;
            int i13 = this.f16479k;
            if (actionMenuView.f16252r != i13) {
                actionMenuView.f16252r = i13;
                if (i13 == 0) {
                    actionMenuView.f16251q = actionMenuView.getContext();
                } else {
                    actionMenuView.f16251q = new ContextThemeWrapper(actionMenuView.getContext(), i13);
                }
            }
            ActionMenuView actionMenuView2 = this.f16469a;
            actionMenuView2.A = this.f16468J;
            n.z zVar = this.N;
            c3 c3Var = new c3(this);
            actionMenuView2.f16255u = zVar;
            actionMenuView2.f16256v = c3Var;
            LayoutParams g13 = g();
            g13.f15945a = (this.f16482n & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) | 8388613;
            this.f16469a.setLayoutParams(g13);
            c(this.f16469a, false);
        }
    }

    public final void f() {
        if (this.f16472d == null) {
            this.f16472d = new AppCompatImageButton(getContext(), null, i.a.toolbarNavigationButtonStyle);
            LayoutParams g13 = g();
            g13.f15945a = (this.f16482n & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) | 8388611;
            this.f16472d.setLayoutParams(g13);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return g();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return h(layoutParams);
    }

    public final int i(View view, int i13) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i14 = i13 > 0 ? (measuredHeight - i13) / 2 : 0;
        int i15 = layoutParams.f15945a & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER;
        if (i15 != 16 && i15 != 48 && i15 != 80) {
            i15 = this.f16491w & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER;
        }
        if (i15 == 48) {
            return getPaddingTop() - i14;
        }
        if (i15 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) - i14;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i16 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i17 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        if (i16 < i17) {
            i16 = i17;
        } else {
            int i18 = (((height - paddingBottom) - measuredHeight) - i16) - paddingTop;
            int i19 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            if (i18 < i19) {
                i16 = Math.max(0, i16 - (i19 - i18));
            }
        }
        return paddingTop + i16;
    }

    public final int j() {
        n.o oVar;
        ActionMenuView actionMenuView = this.f16469a;
        int i13 = 0;
        if (actionMenuView != null && (oVar = actionMenuView.f16250p) != null && oVar.hasVisibleItems()) {
            g2 g2Var = this.f16488t;
            return Math.max(g2Var != null ? g2Var.f16575g ? g2Var.f16569a : g2Var.f16570b : 0, Math.max(this.f16490v, 0));
        }
        g2 g2Var2 = this.f16488t;
        if (g2Var2 != null) {
            i13 = g2Var2.f16575g ? g2Var2.f16569a : g2Var2.f16570b;
        }
        return i13;
    }

    public final int k() {
        int i13 = 0;
        if (o() != null) {
            g2 g2Var = this.f16488t;
            return Math.max(g2Var != null ? g2Var.f16575g ? g2Var.f16570b : g2Var.f16569a : 0, Math.max(this.f16489u, 0));
        }
        g2 g2Var2 = this.f16488t;
        if (g2Var2 != null) {
            i13 = g2Var2.f16575g ? g2Var2.f16570b : g2Var2.f16569a;
        }
        return i13;
    }

    public final ArrayList l() {
        ArrayList arrayList = new ArrayList();
        n.o n13 = n();
        for (int i13 = 0; i13 < n13.f88653f.size(); i13++) {
            arrayList.add(n13.getItem(i13));
        }
        return arrayList;
    }

    public final n.o n() {
        e();
        ActionMenuView actionMenuView = this.f16469a;
        if (actionMenuView.f16250p == null) {
            n.o v13 = actionMenuView.v();
            if (this.M == null) {
                this.M = new f3(this);
            }
            this.f16469a.f16254t.f16656p = true;
            v13.c(this.M, this.f16478j);
            G();
        }
        return this.f16469a.v();
    }

    public final Drawable o() {
        AppCompatImageButton appCompatImageButton = this.f16472d;
        if (appCompatImageButton != null) {
            return appCompatImageButton.getDrawable();
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        G();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.T);
        G();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.C = false;
        }
        if (!this.C) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.C = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.C = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x029f A[LOOP:0: B:46:0x029d->B:47:0x029f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02bc A[LOOP:1: B:50:0x02ba->B:51:0x02bc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02da A[LOOP:2: B:54:0x02d8->B:55:0x02da, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0328 A[LOOP:3: B:63:0x0326->B:64:0x0328, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01c4  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 825
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public void onMeasure(int i13, int i14) {
        char c13;
        char c14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i23;
        int i24;
        boolean z13 = l3.f16639a;
        int i25 = 0;
        if (getLayoutDirection() == 1) {
            c14 = 1;
            c13 = 0;
        } else {
            c13 = 1;
            c14 = 0;
        }
        if (E(this.f16472d)) {
            w(this.f16472d, i13, 0, i14, this.f16483o);
            i15 = m(this.f16472d) + this.f16472d.getMeasuredWidth();
            i16 = Math.max(0, p(this.f16472d) + this.f16472d.getMeasuredHeight());
            i17 = View.combineMeasuredStates(0, this.f16472d.getMeasuredState());
        } else {
            i15 = 0;
            i16 = 0;
            i17 = 0;
        }
        if (E(this.f16476h)) {
            w(this.f16476h, i13, 0, i14, this.f16483o);
            i15 = m(this.f16476h) + this.f16476h.getMeasuredWidth();
            i16 = Math.max(i16, p(this.f16476h) + this.f16476h.getMeasuredHeight());
            i17 = View.combineMeasuredStates(i17, this.f16476h.getMeasuredState());
        }
        int k13 = k();
        int max = Math.max(k13, i15);
        int max2 = Math.max(0, k13 - i15);
        int[] iArr = this.F;
        iArr[c14] = max2;
        if (E(this.f16469a)) {
            w(this.f16469a, i13, max, i14, this.f16483o);
            i18 = m(this.f16469a) + this.f16469a.getMeasuredWidth();
            i16 = Math.max(i16, p(this.f16469a) + this.f16469a.getMeasuredHeight());
            i17 = View.combineMeasuredStates(i17, this.f16469a.getMeasuredState());
        } else {
            i18 = 0;
        }
        int j13 = j();
        int max3 = max + Math.max(j13, i18);
        iArr[c13] = Math.max(0, j13 - i18);
        if (E(this.f16477i)) {
            max3 += v(this.f16477i, i13, max3, i14, 0, iArr);
            i16 = Math.max(i16, p(this.f16477i) + this.f16477i.getMeasuredHeight());
            i17 = View.combineMeasuredStates(i17, this.f16477i.getMeasuredState());
        }
        if (E(this.f16473e)) {
            max3 += v(this.f16473e, i13, max3, i14, 0, iArr);
            i16 = Math.max(i16, p(this.f16473e) + this.f16473e.getMeasuredHeight());
            i17 = View.combineMeasuredStates(i17, this.f16473e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i26 = 0; i26 < childCount; i26++) {
            View childAt = getChildAt(i26);
            if (((LayoutParams) childAt.getLayoutParams()).f16495b == 0 && E(childAt)) {
                max3 += v(childAt, i13, max3, i14, 0, iArr);
                i16 = Math.max(i16, p(childAt) + childAt.getMeasuredHeight());
                i17 = View.combineMeasuredStates(i17, childAt.getMeasuredState());
            }
        }
        int i27 = this.f16486r + this.f16487s;
        int i28 = this.f16484p + this.f16485q;
        if (E(this.f16470b)) {
            v(this.f16470b, i13, max3 + i28, i14, i27, iArr);
            int m13 = m(this.f16470b) + this.f16470b.getMeasuredWidth();
            i19 = p(this.f16470b) + this.f16470b.getMeasuredHeight();
            i23 = View.combineMeasuredStates(i17, this.f16470b.getMeasuredState());
            i24 = m13;
        } else {
            i19 = 0;
            i23 = i17;
            i24 = 0;
        }
        if (E(this.f16471c)) {
            i24 = Math.max(i24, v(this.f16471c, i13, max3 + i28, i14, i19 + i27, iArr));
            i19 += p(this.f16471c) + this.f16471c.getMeasuredHeight();
            i23 = View.combineMeasuredStates(i23, this.f16471c.getMeasuredState());
        }
        int max4 = Math.max(i16, i19);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max4;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + max3 + i24, getSuggestedMinimumWidth()), i13, (-16777216) & i23);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i14, i23 << 16);
        if (this.P) {
            int childCount2 = getChildCount();
            for (int i29 = 0; i29 < childCount2; i29++) {
                View childAt2 = getChildAt(i29);
                if (!E(childAt2) || childAt2.getMeasuredWidth() <= 0 || childAt2.getMeasuredHeight() <= 0) {
                }
            }
            setMeasuredDimension(resolveSizeAndState, i25);
        }
        i25 = resolveSizeAndState2;
        setMeasuredDimension(resolveSizeAndState, i25);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f18020a);
        ActionMenuView actionMenuView = this.f16469a;
        n.o oVar = actionMenuView != null ? actionMenuView.f16250p : null;
        int i13 = savedState.f16496c;
        if (i13 != 0 && this.M != null && oVar != null && (findItem = oVar.findItem(i13)) != null) {
            findItem.expandActionView();
        }
        if (savedState.f16497d) {
            i1 i1Var = this.T;
            removeCallbacks(i1Var);
            post(i1Var);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i13) {
        super.onRtlPropertiesChanged(i13);
        d();
        g2 g2Var = this.f16488t;
        boolean z13 = i13 == 1;
        if (z13 == g2Var.f16575g) {
            return;
        }
        g2Var.f16575g = z13;
        if (!g2Var.f16576h) {
            g2Var.f16569a = g2Var.f16573e;
            g2Var.f16570b = g2Var.f16574f;
            return;
        }
        if (z13) {
            int i14 = g2Var.f16572d;
            if (i14 == Integer.MIN_VALUE) {
                i14 = g2Var.f16573e;
            }
            g2Var.f16569a = i14;
            int i15 = g2Var.f16571c;
            if (i15 == Integer.MIN_VALUE) {
                i15 = g2Var.f16574f;
            }
            g2Var.f16570b = i15;
            return;
        }
        int i16 = g2Var.f16571c;
        if (i16 == Integer.MIN_VALUE) {
            i16 = g2Var.f16573e;
        }
        g2Var.f16569a = i16;
        int i17 = g2Var.f16572d;
        if (i17 == Integer.MIN_VALUE) {
            i17 = g2Var.f16574f;
        }
        g2Var.f16570b = i17;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        n.q qVar;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        f3 f3Var = this.M;
        if (f3Var != null && (qVar = f3Var.f16562b) != null) {
            savedState.f16496c = qVar.f88675a;
        }
        savedState.f16497d = s();
        return savedState;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.B = false;
        }
        if (!this.B) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.B = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.B = false;
        }
        return true;
    }

    public void q(int i13) {
        new m.l(getContext()).inflate(i13, n());
    }

    public final boolean r(View view) {
        return view.getParent() == this || this.E.contains(view);
    }

    @Override // q5.l
    public final void removeMenuProvider(q5.q qVar) {
        this.G.b(qVar);
    }

    public final boolean s() {
        n nVar;
        ActionMenuView actionMenuView = this.f16469a;
        return (actionMenuView == null || (nVar = actionMenuView.f16254t) == null || !nVar.l()) ? false : true;
    }

    public final int t(View view, int i13, int i14, int[] iArr) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i15 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin - iArr[0];
        int max = Math.max(0, i15) + i13;
        iArr[0] = Math.max(0, -i15);
        int i16 = i(view, i14);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, i16, max + measuredWidth, view.getMeasuredHeight() + i16);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + max;
    }

    public final int u(View view, int i13, int i14, int[] iArr) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i15 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin - iArr[1];
        int max = i13 - Math.max(0, i15);
        iArr[1] = Math.max(0, -i15);
        int i16 = i(view, i14);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, i16, max, view.getMeasuredHeight() + i16);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin);
    }

    public final int v(View view, int i13, int i14, int i15, int i16, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i17 = marginLayoutParams.leftMargin - iArr[0];
        int i18 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i18) + Math.max(0, i17);
        iArr[0] = Math.max(0, -i17);
        iArr[1] = Math.max(0, -i18);
        view.measure(ViewGroup.getChildMeasureSpec(i13, getPaddingRight() + getPaddingLeft() + max + i14, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i15, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i16, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void w(View view, int i13, int i14, int i15, int i16) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i13, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i14, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i15, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i16 >= 0) {
            if (mode != 0) {
                i16 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i16);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i16, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final void x() {
        if (!this.S) {
            this.S = true;
            G();
        }
    }

    public final void y(Drawable drawable) {
        if (drawable != null) {
            if (this.f16473e == null) {
                this.f16473e = new AppCompatImageView(getContext(), null);
            }
            if (!r(this.f16473e)) {
                c(this.f16473e, true);
            }
        } else {
            AppCompatImageView appCompatImageView = this.f16473e;
            if (appCompatImageView != null && r(appCompatImageView)) {
                removeView(this.f16473e);
                this.E.remove(this.f16473e);
            }
        }
        AppCompatImageView appCompatImageView2 = this.f16473e;
        if (appCompatImageView2 != null) {
            appCompatImageView2.setImageDrawable(drawable);
        }
    }

    public final void z(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            f();
        }
        AppCompatImageButton appCompatImageButton = this.f16472d;
        if (appCompatImageButton != null) {
            appCompatImageButton.setContentDescription(charSequence);
            i3.a(this.f16472d, charSequence);
        }
    }

    public Toolbar(@NonNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f16491w = 8388627;
        this.D = new ArrayList();
        this.E = new ArrayList();
        this.F = new int[2];
        this.G = new q5.p(new b3(this, 1));
        this.H = new ArrayList();
        this.f16468J = new c3(this);
        this.T = new i1(this, 1);
        x92.b N = x92.b.N(getContext(), attributeSet, i.j.Toolbar, i13, 0);
        q5.v0.n(this, context, i.j.Toolbar, attributeSet, (TypedArray) N.f134366c, i13, 0);
        this.f16480l = N.C(i.j.Toolbar_titleTextAppearance, 0);
        this.f16481m = N.C(i.j.Toolbar_subtitleTextAppearance, 0);
        this.f16491w = ((TypedArray) N.f134366c).getInteger(i.j.Toolbar_android_gravity, 8388627);
        this.f16482n = ((TypedArray) N.f134366c).getInteger(i.j.Toolbar_buttonGravity, 48);
        int v13 = N.v(i.j.Toolbar_titleMargin, 0);
        v13 = N.G(i.j.Toolbar_titleMargins) ? N.v(i.j.Toolbar_titleMargins, v13) : v13;
        this.f16487s = v13;
        this.f16486r = v13;
        this.f16485q = v13;
        this.f16484p = v13;
        int v14 = N.v(i.j.Toolbar_titleMarginStart, -1);
        if (v14 >= 0) {
            this.f16484p = v14;
        }
        int v15 = N.v(i.j.Toolbar_titleMarginEnd, -1);
        if (v15 >= 0) {
            this.f16485q = v15;
        }
        int v16 = N.v(i.j.Toolbar_titleMarginTop, -1);
        if (v16 >= 0) {
            this.f16486r = v16;
        }
        int v17 = N.v(i.j.Toolbar_titleMarginBottom, -1);
        if (v17 >= 0) {
            this.f16487s = v17;
        }
        this.f16483o = N.w(i.j.Toolbar_maxButtonHeight, -1);
        int v18 = N.v(i.j.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        int v19 = N.v(i.j.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        int w13 = N.w(i.j.Toolbar_contentInsetLeft, 0);
        int w14 = N.w(i.j.Toolbar_contentInsetRight, 0);
        d();
        g2 g2Var = this.f16488t;
        g2Var.f16576h = false;
        if (w13 != Integer.MIN_VALUE) {
            g2Var.f16573e = w13;
            g2Var.f16569a = w13;
        }
        if (w14 != Integer.MIN_VALUE) {
            g2Var.f16574f = w14;
            g2Var.f16570b = w14;
        }
        if (v18 != Integer.MIN_VALUE || v19 != Integer.MIN_VALUE) {
            g2Var.a(v18, v19);
        }
        this.f16489u = N.v(i.j.Toolbar_contentInsetStartWithNavigation, Integer.MIN_VALUE);
        this.f16490v = N.v(i.j.Toolbar_contentInsetEndWithActions, Integer.MIN_VALUE);
        this.f16474f = N.x(i.j.Toolbar_collapseIcon);
        this.f16475g = N.E(i.j.Toolbar_collapseContentDescription);
        CharSequence E = N.E(i.j.Toolbar_title);
        if (!TextUtils.isEmpty(E)) {
            D(E);
        }
        CharSequence E2 = N.E(i.j.Toolbar_subtitle);
        if (!TextUtils.isEmpty(E2)) {
            C(E2);
        }
        this.f16478j = getContext();
        int C = N.C(i.j.Toolbar_popupTheme, 0);
        if (this.f16479k != C) {
            this.f16479k = C;
            if (C == 0) {
                this.f16478j = getContext();
            } else {
                this.f16478j = new ContextThemeWrapper(getContext(), C);
            }
        }
        Drawable x13 = N.x(i.j.Toolbar_navigationIcon);
        if (x13 != null) {
            A(x13);
        }
        CharSequence E3 = N.E(i.j.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(E3)) {
            z(E3);
        }
        Drawable x14 = N.x(i.j.Toolbar_logo);
        if (x14 != null) {
            y(x14);
        }
        CharSequence E4 = N.E(i.j.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(E4)) {
            if (!TextUtils.isEmpty(E4) && this.f16473e == null) {
                this.f16473e = new AppCompatImageView(getContext(), null);
            }
            AppCompatImageView appCompatImageView = this.f16473e;
            if (appCompatImageView != null) {
                appCompatImageView.setContentDescription(E4);
            }
        }
        if (N.G(i.j.Toolbar_titleTextColor)) {
            ColorStateList u13 = N.u(i.j.Toolbar_titleTextColor);
            this.f16494z = u13;
            AppCompatTextView appCompatTextView = this.f16470b;
            if (appCompatTextView != null) {
                appCompatTextView.setTextColor(u13);
            }
        }
        if (N.G(i.j.Toolbar_subtitleTextColor)) {
            ColorStateList u14 = N.u(i.j.Toolbar_subtitleTextColor);
            this.A = u14;
            AppCompatTextView appCompatTextView2 = this.f16471c;
            if (appCompatTextView2 != null) {
                appCompatTextView2.setTextColor(u14);
            }
        }
        if (N.G(i.j.Toolbar_menu)) {
            q(N.C(i.j.Toolbar_menu, 0));
        }
        N.O();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }
}
