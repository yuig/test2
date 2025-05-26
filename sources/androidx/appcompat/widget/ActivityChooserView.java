package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public class ActivityChooserView extends ViewGroup {

    /* renamed from: a */
    public final u f16267a;

    /* renamed from: b */
    public final v f16268b;

    /* renamed from: c */
    public final View f16269c;

    /* renamed from: d */
    public final FrameLayout f16270d;

    /* renamed from: e */
    public final FrameLayout f16271e;

    /* renamed from: f */
    public final s f16272f;

    /* renamed from: g */
    public ListPopupWindow f16273g;

    /* renamed from: h */
    public boolean f16274h;

    public static class InnerLayout extends LinearLayout {

        /* renamed from: a */
        public static final int[] f16275a = {R.attr.background};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            x92.b M = x92.b.M(context, attributeSet, f16275a);
            setBackgroundDrawable(M.x(0));
            M.O();
        }
    }

    public ActivityChooserView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void a() {
        if (b().f16397z.isShowing()) {
            b().dismiss();
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeGlobalOnLayoutListener(this.f16272f);
            }
        }
    }

    public final ListPopupWindow b() {
        if (this.f16273g == null) {
            ListPopupWindow listPopupWindow = new ListPopupWindow(getContext());
            this.f16273g = listPopupWindow;
            listPopupWindow.j(this.f16267a);
            ListPopupWindow listPopupWindow2 = this.f16273g;
            listPopupWindow2.f16386o = this;
            listPopupWindow2.f16396y = true;
            listPopupWindow2.f16397z.setFocusable(true);
            ListPopupWindow listPopupWindow3 = this.f16273g;
            v vVar = this.f16268b;
            listPopupWindow3.f16387p = vVar;
            listPopupWindow3.f16397z.setOnDismissListener(vVar);
        }
        return this.f16273g;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f16267a.getClass();
        this.f16274h = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f16267a.getClass();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f16272f);
        }
        if (b().f16397z.isShowing()) {
            a();
        }
        this.f16274h = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        this.f16269c.layout(0, 0, i15 - i13, i16 - i14);
        if (b().f16397z.isShowing()) {
            return;
        }
        a();
    }

    @Override // android.view.View
    public final void onMeasure(int i13, int i14) {
        if (this.f16271e.getVisibility() != 0) {
            i14 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i14), 1073741824);
        }
        View view = this.f16269c;
        measureChild(view, i13, i14);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public ActivityChooserView(@NonNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        new r(this, 0);
        this.f16272f = new s(this, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.j.ActivityChooserView, i13, 0);
        q5.v0.n(this, context, i.j.ActivityChooserView, attributeSet, obtainStyledAttributes, i13, 0);
        obtainStyledAttributes.getInt(i.j.ActivityChooserView_initialActivityCount, 4);
        Drawable drawable = obtainStyledAttributes.getDrawable(i.j.ActivityChooserView_expandActivityOverflowButtonDrawable);
        obtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(i.g.abc_activity_chooser_view, (ViewGroup) this, true);
        v vVar = new v(this);
        this.f16268b = vVar;
        View findViewById = findViewById(i.f.activity_chooser_view_content);
        this.f16269c = findViewById;
        findViewById.getBackground();
        FrameLayout frameLayout = (FrameLayout) findViewById(i.f.default_activity_button);
        this.f16271e = frameLayout;
        frameLayout.setOnClickListener(vVar);
        frameLayout.setOnLongClickListener(vVar);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(i.f.expand_activities_button);
        frameLayout2.setOnClickListener(vVar);
        frameLayout2.setAccessibilityDelegate(new t(this, 0));
        frameLayout2.setOnTouchListener(new n.b(this, frameLayout2));
        this.f16270d = frameLayout2;
        ((ImageView) frameLayout2.findViewById(i.f.image)).setImageDrawable(drawable);
        u uVar = new u(this);
        this.f16267a = uVar;
        uVar.registerDataSetObserver(new r(this, 1));
        Resources resources = context.getResources();
        Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(i.d.abc_config_prefDialogWidth));
    }
}
