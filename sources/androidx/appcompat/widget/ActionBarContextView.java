package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public class ActionBarContextView extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public final a f16203a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f16204b;

    /* renamed from: c, reason: collision with root package name */
    public ActionMenuView f16205c;

    /* renamed from: d, reason: collision with root package name */
    public n f16206d;

    /* renamed from: e, reason: collision with root package name */
    public int f16207e;

    /* renamed from: f, reason: collision with root package name */
    public q5.d1 f16208f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f16209g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f16210h;

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f16211i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f16212j;

    /* renamed from: k, reason: collision with root package name */
    public View f16213k;

    /* renamed from: l, reason: collision with root package name */
    public View f16214l;

    /* renamed from: m, reason: collision with root package name */
    public View f16215m;

    /* renamed from: n, reason: collision with root package name */
    public LinearLayout f16216n;

    /* renamed from: o, reason: collision with root package name */
    public TextView f16217o;

    /* renamed from: p, reason: collision with root package name */
    public TextView f16218p;

    /* renamed from: q, reason: collision with root package name */
    public final int f16219q;

    /* renamed from: r, reason: collision with root package name */
    public final int f16220r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f16221s;

    /* renamed from: t, reason: collision with root package name */
    public final int f16222t;

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    public static int f(View view, int i13, int i14) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i13, Integer.MIN_VALUE), i14);
        return Math.max(0, i13 - view.getMeasuredWidth());
    }

    public static int j(int i13, int i14, int i15, View view, boolean z13) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int b13 = a.a.b(i15, measuredHeight, 2, i14);
        if (z13) {
            view.layout(i13 - measuredWidth, b13, i13, measuredHeight + b13);
        } else {
            view.layout(i13, b13, i13 + measuredWidth, measuredHeight + b13);
        }
        return z13 ? -measuredWidth : measuredWidth;
    }

    public final void c(m.c cVar) {
        View view = this.f16213k;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f16222t, (ViewGroup) this, false);
            this.f16213k = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f16213k);
        }
        View findViewById = this.f16213k.findViewById(i.f.action_mode_close_button);
        this.f16214l = findViewById;
        findViewById.setOnClickListener(new c(this, cVar));
        n.o c13 = cVar.c();
        n nVar = this.f16206d;
        if (nVar != null) {
            nVar.k();
            h hVar = nVar.f16659s;
            if (hVar != null && hVar.b()) {
                hVar.f88722j.dismiss();
            }
        }
        n nVar2 = new n(getContext());
        this.f16206d = nVar2;
        nVar2.f16651k = true;
        nVar2.f16652l = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        c13.c(this.f16206d, this.f16204b);
        n nVar3 = this.f16206d;
        n.c0 c0Var = nVar3.f88568h;
        if (c0Var == null) {
            n.c0 c0Var2 = (n.c0) nVar3.f88564d.inflate(nVar3.f88566f, (ViewGroup) this, false);
            nVar3.f88568h = c0Var2;
            c0Var2.a(nVar3.f88563c);
            nVar3.h(true);
        }
        n.c0 c0Var3 = nVar3.f88568h;
        if (c0Var != c0Var3) {
            ActionMenuView actionMenuView = (ActionMenuView) c0Var3;
            actionMenuView.f16254t = nVar3;
            nVar3.f88568h = actionMenuView;
            actionMenuView.f16250p = nVar3.f88563c;
        }
        ActionMenuView actionMenuView2 = (ActionMenuView) c0Var3;
        this.f16205c = actionMenuView2;
        actionMenuView2.setBackground(null);
        addView(this.f16205c, layoutParams);
    }

    public final void d() {
        if (this.f16216n == null) {
            LayoutInflater.from(getContext()).inflate(i.g.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f16216n = linearLayout;
            this.f16217o = (TextView) linearLayout.findViewById(i.f.action_bar_title);
            this.f16218p = (TextView) this.f16216n.findViewById(i.f.action_bar_subtitle);
            int i13 = this.f16219q;
            if (i13 != 0) {
                this.f16217o.setTextAppearance(getContext(), i13);
            }
            int i14 = this.f16220r;
            if (i14 != 0) {
                this.f16218p.setTextAppearance(getContext(), i14);
            }
        }
        this.f16217o.setText(this.f16211i);
        this.f16218p.setText(this.f16212j);
        boolean z13 = !TextUtils.isEmpty(this.f16211i);
        boolean z14 = !TextUtils.isEmpty(this.f16212j);
        this.f16218p.setVisibility(z14 ? 0 : 8);
        this.f16216n.setVisibility((z13 || z14) ? 0 : 8);
        if (this.f16216n.getParent() == null) {
            addView(this.f16216n);
        }
    }

    public final void e() {
        removeAllViews();
        this.f16215m = null;
        this.f16205c = null;
        this.f16206d = null;
        View view = this.f16214l;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.View
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, i.j.ActionBar, i.a.actionBarStyle, 0);
        this.f16207e = obtainStyledAttributes.getLayoutDimension(i.j.ActionBar_height, 0);
        obtainStyledAttributes.recycle();
        n nVar = this.f16206d;
        if (nVar != null) {
            Configuration configuration2 = nVar.f88562b.getResources().getConfiguration();
            int i13 = configuration2.screenWidthDp;
            int i14 = configuration2.screenHeightDp;
            nVar.f16655o = (configuration2.smallestScreenWidthDp > 600 || i13 > 600 || (i13 > 960 && i14 > 720) || (i13 > 720 && i14 > 960)) ? 5 : (i13 >= 500 || (i13 > 640 && i14 > 480) || (i13 > 480 && i14 > 640)) ? 4 : i13 >= 360 ? 3 : 2;
            n.o oVar = nVar.f88563c;
            if (oVar != null) {
                oVar.q(true);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public final boolean h(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f16210h = false;
        }
        if (!this.f16210h) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f16210h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f16210h = false;
        }
        return true;
    }

    public final boolean i(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f16209g = false;
        }
        if (!this.f16209g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f16209g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f16209g = false;
        }
        return true;
    }

    public final void k(int i13) {
        this.f16207e = i13;
    }

    public final void l(View view) {
        LinearLayout linearLayout;
        View view2 = this.f16215m;
        if (view2 != null) {
            removeView(view2);
        }
        this.f16215m = view;
        if (view != null && (linearLayout = this.f16216n) != null) {
            removeView(linearLayout);
            this.f16216n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    @Override // android.view.View
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i13) {
        if (i13 != getVisibility()) {
            q5.d1 d1Var = this.f16208f;
            if (d1Var != null) {
                d1Var.b();
            }
            super.setVisibility(i13);
        }
    }

    public final q5.d1 n(int i13, long j13) {
        q5.d1 d1Var = this.f16208f;
        if (d1Var != null) {
            d1Var.b();
        }
        a aVar = this.f16203a;
        if (i13 != 0) {
            q5.d1 b13 = q5.v0.b(this);
            b13.a(0.0f);
            b13.c(j13);
            ((ActionBarContextView) aVar.f16504c).f16208f = b13;
            aVar.f16502a = i13;
            b13.e(aVar);
            return b13;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        q5.d1 b14 = q5.v0.b(this);
        b14.a(1.0f);
        b14.c(j13);
        ((ActionBarContextView) aVar.f16504c).f16208f = b14;
        aVar.f16502a = i13;
        b14.e(aVar);
        return b14;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        n nVar = this.f16206d;
        if (nVar != null) {
            nVar.k();
            h hVar = this.f16206d.f16659s;
            if (hVar == null || !hVar.b()) {
                return;
            }
            hVar.f88722j.dismiss();
        }
    }

    @Override // android.view.View
    public final /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        h(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        boolean z14 = l3.f16639a;
        boolean z15 = getLayoutDirection() == 1;
        int paddingRight = z15 ? (i15 - i13) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i16 - i14) - getPaddingTop()) - getPaddingBottom();
        View view = this.f16213k;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f16213k.getLayoutParams();
            int i17 = z15 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i18 = z15 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i19 = z15 ? paddingRight - i17 : paddingRight + i17;
            int j13 = j(i19, paddingTop, paddingTop2, this.f16213k, z15) + i19;
            paddingRight = z15 ? j13 - i18 : j13 + i18;
        }
        LinearLayout linearLayout = this.f16216n;
        if (linearLayout != null && this.f16215m == null && linearLayout.getVisibility() != 8) {
            paddingRight += j(paddingRight, paddingTop, paddingTop2, this.f16216n, z15);
        }
        View view2 = this.f16215m;
        if (view2 != null) {
            j(paddingRight, paddingTop, paddingTop2, view2, z15);
        }
        int paddingLeft = z15 ? getPaddingLeft() : (i15 - i13) - getPaddingRight();
        ActionMenuView actionMenuView = this.f16205c;
        if (actionMenuView != null) {
            j(paddingLeft, paddingTop, paddingTop2, actionMenuView, !z15);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i13, int i14) {
        if (View.MeasureSpec.getMode(i13) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i14) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i13);
        int i15 = this.f16207e;
        if (i15 <= 0) {
            i15 = View.MeasureSpec.getSize(i14);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i16 = i15 - paddingBottom;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16, Integer.MIN_VALUE);
        View view = this.f16213k;
        if (view != null) {
            int f13 = f(view, paddingLeft, makeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f16213k.getLayoutParams();
            paddingLeft = f13 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f16205c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = f(this.f16205c, paddingLeft, makeMeasureSpec);
        }
        LinearLayout linearLayout = this.f16216n;
        if (linearLayout != null && this.f16215m == null) {
            if (this.f16221s) {
                this.f16216n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.f16216n.getMeasuredWidth();
                boolean z13 = measuredWidth <= paddingLeft;
                if (z13) {
                    paddingLeft -= measuredWidth;
                }
                this.f16216n.setVisibility(z13 ? 0 : 8);
            } else {
                paddingLeft = f(linearLayout, paddingLeft, makeMeasureSpec);
            }
        }
        View view2 = this.f16215m;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i17 = layoutParams.width;
            int i18 = i17 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i17 >= 0) {
                paddingLeft = Math.min(i17, paddingLeft);
            }
            int i19 = layoutParams.height;
            int i23 = i19 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i19 >= 0) {
                i16 = Math.min(i19, i16);
            }
            this.f16215m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i18), View.MeasureSpec.makeMeasureSpec(i16, i23));
        }
        if (this.f16207e > 0) {
            setMeasuredDimension(size, i15);
            return;
        }
        int childCount = getChildCount();
        int i24 = 0;
        for (int i25 = 0; i25 < childCount; i25++) {
            int measuredHeight = getChildAt(i25).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i24) {
                i24 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i24);
    }

    @Override // android.view.View
    public final /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        i(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i.a.actionModeStyle);
    }

    public ActionBarContextView(@NonNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Drawable drawable;
        int resourceId;
        a aVar = new a();
        aVar.f16504c = this;
        aVar.f16503b = false;
        this.f16203a = aVar;
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i.a.actionBarPopupTheme, typedValue, true) && typedValue.resourceId != 0) {
            this.f16204b = new ContextThemeWrapper(context, typedValue.resourceId);
        } else {
            this.f16204b = context;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.j.ActionMode, i13, 0);
        int i14 = i.j.ActionMode_background;
        if (obtainStyledAttributes.hasValue(i14) && (resourceId = obtainStyledAttributes.getResourceId(i14, 0)) != 0) {
            drawable = com.bumptech.glide.c.I(context, resourceId);
        } else {
            drawable = obtainStyledAttributes.getDrawable(i14);
        }
        setBackground(drawable);
        this.f16219q = obtainStyledAttributes.getResourceId(i.j.ActionMode_titleTextStyle, 0);
        this.f16220r = obtainStyledAttributes.getResourceId(i.j.ActionMode_subtitleTextStyle, 0);
        this.f16207e = obtainStyledAttributes.getLayoutDimension(i.j.ActionMode_height, 0);
        this.f16222t = obtainStyledAttributes.getResourceId(i.j.ActionMode_closeItemLayout, i.g.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }
}
