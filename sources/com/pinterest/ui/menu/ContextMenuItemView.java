package com.pinterest.ui.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.pinterest.ui.text.IconView;
import eo1.b;
import eo1.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.s0;
import org.jetbrains.annotations.NotNull;
import wc0.a;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\bB\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/pinterest/ui/menu/ContextMenuItemView;", "Lcom/pinterest/ui/menu/KotSpringLinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "gi2/b", "contextMenuLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ContextMenuItemView extends KotSpringLinearLayout {

    /* renamed from: i, reason: collision with root package name */
    public String f52586i;

    /* renamed from: j, reason: collision with root package name */
    public int f52587j;

    /* renamed from: k, reason: collision with root package name */
    public IconView f52588k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f52589l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f52590m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f52591n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f52592o;

    /* renamed from: p, reason: collision with root package name */
    public Drawable f52593p;

    /* renamed from: q, reason: collision with root package name */
    public int f52594q;

    /* renamed from: r, reason: collision with root package name */
    public int f52595r;

    /* renamed from: s, reason: collision with root package name */
    public int f52596s;

    /* renamed from: t, reason: collision with root package name */
    public int f52597t;

    /* renamed from: u, reason: collision with root package name */
    public int f52598u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContextMenuItemView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f52587j = -1;
        this.f52591n = true;
        this.f52592o = true;
        this.f52597t = a.contextual_icon_selected;
        this.f52598u = a.contextual_icon;
        this.f52595r = s0.brio_contextual_menu_item_selected_bg;
        this.f52596s = s0.brio_contextual_menu_item_bg;
    }

    public final void e(float f13, float f14) {
        setX(f13 - ((this.f52588k != null ? r0.getMeasuredWidth() : 0) / 2));
        float measuredHeight = f14 - ((this.f52588k != null ? r3.getMeasuredHeight() : 0) / 2);
        IconView iconView = this.f52588k;
        setY(measuredHeight - (iconView != null ? iconView.getY() : 0.0f));
    }

    public final void f() {
        k(false);
        this.f52592o = false;
        setOnTouchListener(null);
        setOnClickListener(null);
    }

    /* renamed from: g, reason: from getter */
    public final int getF52587j() {
        return this.f52587j;
    }

    /* renamed from: h, reason: from getter */
    public final String getF52586i() {
        return this.f52586i;
    }

    public final boolean i(int i13, int i14) {
        Rect rect = new Rect();
        int[] iArr = new int[2];
        IconView iconView = this.f52588k;
        if (iconView != null) {
            iconView.getDrawingRect(rect);
            iconView.getLocationOnScreen(iArr);
        }
        rect.offset(iArr[0], iArr[1]);
        return rect.contains(i13, i14);
    }

    public final void j(int i13) {
        IconView iconView = this.f52588k;
        if (iconView != null) {
            iconView.setImageResource(i13);
        }
        IconView iconView2 = this.f52588k;
        this.f52593p = iconView2 != null ? iconView2.getDrawable() : null;
        n();
    }

    public final void k(boolean z13) {
        boolean z14 = this.f52589l;
        Boolean valueOf = Boolean.valueOf(z14);
        if (z14 == z13 || this.f52586i == null) {
            valueOf = null;
        }
        if (valueOf != null) {
            this.f52589l = z13;
            o(z13);
        }
    }

    public final void l(int i13) {
        String string = getResources().getString(i13);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        this.f52586i = string;
        n();
    }

    public final void m(float f13, float f14, float f15) {
        float measuredWidth = (f13 - ((this.f52588k != null ? r0.getMeasuredWidth() : 0) / 2)) - getX();
        float measuredHeight = f14 - ((this.f52588k != null ? r0.getMeasuredHeight() : 0) / 2);
        IconView iconView = this.f52588k;
        float y13 = (measuredHeight - (iconView != null ? iconView.getY() : 0.0f)) - getY();
        d(0, 0.0f, measuredWidth, 0.37f, 0.055f, null);
        d(1, 0.0f, y13, 0.37f, 0.055f, null);
        d(2, 0.0f, f15, 0.37f, 0.055f, null);
    }

    public final void n() {
        o(this.f52589l);
    }

    public final void o(boolean z13) {
        IconView iconView = this.f52588k;
        if (iconView != null) {
            if (this.f52590m) {
                iconView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                iconView.setPaddingRelative(iconView.getPaddingStart(), iconView.getPaddingTop(), iconView.getPaddingEnd(), iconView.getContext().getResources().getDimensionPixelSize(c.lego_brick_quarter));
            }
            String str = this.f52586i;
            if (str == null || str.length() == 0) {
                return;
            }
            if (!z13 || this.f52594q == 0) {
                iconView.setImageDrawable(this.f52593p);
                int i13 = (z13 && this.f52591n) ? this.f52597t : this.f52598u;
                try {
                    Context context = iconView.getContext();
                    Object obj = d5.a.f53679a;
                    i13 = context.getColor(i13);
                } catch (Resources.NotFoundException unused) {
                }
                iconView.f52652a = i13;
                iconView.f2();
            } else {
                iconView.clearColorFilter();
                iconView.setImageResource(this.f52594q);
            }
            iconView.setBackgroundResource(z13 ? this.f52595r : this.f52596s);
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        IconView iconView = (IconView) findViewById(wc0.c.image);
        this.f52588k = iconView;
        if (iconView != null) {
            Context context = getContext();
            int i13 = b.color_themed_background_default;
            Object obj = d5.a.f53679a;
            int color = context.getColor(i13);
            try {
                color = iconView.getContext().getColor(color);
            } catch (Resources.NotFoundException unused) {
            }
            iconView.f52652a = color;
            iconView.f2();
        }
        n();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        IconView iconView;
        super.onMeasure(i13, i14);
        String str = this.f52586i;
        if (str == null || str.length() == 0 || (iconView = this.f52588k) == null) {
            return;
        }
        int translationY = (int) (iconView.getTranslationY() * (-1));
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            com.bumptech.glide.c.a1(layoutParams2, 0, translationY, 0, 0);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return this.f52592o && super.onTouchEvent(event);
    }

    @Override // android.view.View
    public final String toString() {
        return a.a.k("ContextMenuItemView{toolTip=", this.f52586i, "}");
    }
}
