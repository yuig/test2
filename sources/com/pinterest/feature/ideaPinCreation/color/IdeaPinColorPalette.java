package com.pinterest.feature.ideaPinCreation.color;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.pinterest.feature.ideaPinCreation.color.IdeaPinColorPalette;
import cu0.b;
import cu0.d;
import cu0.e;
import cu0.g;
import dq1.a;
import dq1.f;
import eo1.c;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.c0;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0006\u000b\f\r\u000e\u000f\u0010B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u0011"}, d2 = {"Lcom/pinterest/feature/ideaPinCreation/color/IdeaPinColorPalette;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "cu0/b", "cu0/c", "cu0/d", "gi2/b", "cu0/e", "cu0/f", "ideaPinCreationLibrary_release"}, k = 1, mv = {1, 9, 0})
@SuppressLint({"HardcodedValue"})
/* loaded from: classes5.dex */
public final class IdeaPinColorPalette extends LinearLayout {

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f46415g = {"#F1F1F1", "#FFFFFF", "#F7F2BB", "#D8F0A8", "#BEF4EE", "#DCD4F7", "#F9B8F2", "#F65E55", "#F69855", "#F6E955", "#79DD3C", "#25E4F4", "#AA6AFB", "#F655C9", "#C20000", "#B85C00", "#807500", "#02882A", "#0045CC", "#8000BD", "#97026D", "#5E031A", "#573700", "#363F03", "#01564C", "#00205C", "#370052", "#1A1A1A"};

    /* renamed from: a, reason: collision with root package name */
    public final int f46416a;

    /* renamed from: b, reason: collision with root package name */
    public View f46417b;

    /* renamed from: c, reason: collision with root package name */
    public b f46418c;

    /* renamed from: d, reason: collision with root package name */
    public d f46419d;

    /* renamed from: e, reason: collision with root package name */
    public e f46420e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f46421f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdeaPinColorPalette(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f46416a = (int) getContext().getResources().getDimension(a.story_pin_color_picker_item_size);
        int dimension = (int) getContext().getResources().getDimension(c.margin_half);
        int dimension2 = (int) getContext().getResources().getDimension(r0.margin_quadruple);
        setOrientation(1);
        Context context2 = getContext();
        int i13 = dq1.b.rounded_top_rect_radius_40_dark_gray;
        Object obj = d5.a.f53679a;
        setBackground(context2.getDrawable(i13));
        setPaddingRelative(dimension, dimension, dimension, dimension2);
        int u13 = ue.c.u(0, 27, 7);
        if (u13 < 0) {
            return;
        }
        int i14 = 0;
        while (true) {
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            linearLayout.setOrientation(0);
            for (int i15 = 0; i15 < 7; i15++) {
                final int i16 = i14 + i15;
                if (i16 >= 28) {
                    break;
                }
                View view = new View(getContext());
                view.setTag(dq1.c.idea_pin_color_option_index, Integer.valueOf(i16));
                view.setId(dq1.c.color_palette_item);
                view.setContentDescription(view.getContext().getString(f.accessibility_color_palette_button));
                int i17 = this.f46416a;
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i17, i17);
                layoutParams.weight = 1.0f;
                view.setLayoutParams(layoutParams);
                Context context3 = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                view.setBackground(new uf1.a(context3, f46415g[i16], i16 == 0, false, 8));
                final int i18 = 2;
                view.setOnClickListener(new View.OnClickListener(this) { // from class: cu0.a

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ IdeaPinColorPalette f53250b;

                    {
                        this.f53250b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i19 = i18;
                        IdeaPinColorPalette.a(this.f53250b, i16, view2);
                    }
                });
                linearLayout.addView(view);
            }
            addView(linearLayout);
            if (i14 == u13) {
                return;
            } else {
                i14 += 7;
            }
        }
    }

    public static void a(IdeaPinColorPalette this$0, int i13, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.f(view);
        View view2 = this$0.f46417b;
        Object tag = view2 != null ? view2.getTag(dq1.c.idea_pin_color_option_index) : null;
        Integer num = tag instanceof Integer ? (Integer) tag : null;
        int intValue = num != null ? num.intValue() : -1;
        if (this$0.f46421f && i13 == intValue) {
            this$0.f();
            this$0.f46417b = null;
            d dVar = this$0.f46419d;
            if (dVar != null) {
                dVar.m(null);
                return;
            }
            return;
        }
        this$0.f();
        this$0.f46417b = view;
        if (i13 == 0) {
            e eVar = this$0.f46420e;
            if (eVar != null) {
                eVar.j();
                return;
            }
            return;
        }
        this$0.f();
        Context context = this$0.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        String[] strArr = f46415g;
        view.setBackground(new uf1.a(context, strArr[i13], false, true, 4));
        d dVar2 = this$0.f46419d;
        if (dVar2 != null) {
            dVar2.m(strArr[i13]);
        }
        this$0.announceForAccessibility(this$0.getResources().getString(f.accessibility_color_selected));
    }

    public final void b(String str) {
        f();
        if (str == null) {
            return;
        }
        int K = c0.K(f46415g, str);
        if (K == -1) {
            K = 0;
        }
        Iterator it = d7.b.O(this).iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            if (view instanceof LinearLayout) {
                Iterator it2 = d7.b.O((ViewGroup) view).iterator();
                while (it2.hasNext()) {
                    View view2 = (View) it2.next();
                    Object tag = view2.getTag(dq1.c.idea_pin_color_option_index);
                    Integer num = tag instanceof Integer ? (Integer) tag : null;
                    if (num != null && num.intValue() == K) {
                        Context context = getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        view2.setBackground(new uf1.a(context, str, K == 0, true));
                        this.f46417b = view2;
                        return;
                    }
                }
            }
        }
    }

    public final void c(d colorUpdateListener, e eyeDropperListener, b bVar) {
        Intrinsics.checkNotNullParameter(colorUpdateListener, "colorUpdateListener");
        Intrinsics.checkNotNullParameter(eyeDropperListener, "eyeDropperListener");
        this.f46419d = colorUpdateListener;
        this.f46420e = eyeDropperListener;
        this.f46418c = bVar;
    }

    public final void d() {
        b bVar = this.f46418c;
        if (bVar != null) {
            bVar.a();
        }
        animate().translationY(getHeight()).setDuration(200L).setListener(new g(this, 0));
    }

    public final void e() {
        setTranslationY(getTranslationY() + getHeight());
        animate().translationY(0.0f).setDuration(200L).setListener(new g(this, 1));
    }

    public final void f() {
        View view = this.f46417b;
        if (view != null) {
            Object tag = view.getTag(dq1.c.idea_pin_color_option_index);
            Integer num = tag instanceof Integer ? (Integer) tag : null;
            if (num != null) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                view.setBackground(new uf1.a(context, f46415g[num.intValue()], num.intValue() == 0, false, 8));
            }
        }
    }

    public final void g(String colorHex) {
        Intrinsics.checkNotNullParameter(colorHex, "colorHex");
        View view = this.f46417b;
        if (view == null) {
            return;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        view.setBackground(new uf1.a(context, colorHex, true, true));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdeaPinColorPalette(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f46416a = (int) getContext().getResources().getDimension(a.story_pin_color_picker_item_size);
        int dimension = (int) getContext().getResources().getDimension(c.margin_half);
        int dimension2 = (int) getContext().getResources().getDimension(r0.margin_quadruple);
        setOrientation(1);
        Context context2 = getContext();
        int i13 = dq1.b.rounded_top_rect_radius_40_dark_gray;
        Object obj = d5.a.f53679a;
        setBackground(context2.getDrawable(i13));
        setPaddingRelative(dimension, dimension, dimension, dimension2);
        final int i14 = 0;
        int u13 = ue.c.u(0, 27, 7);
        if (u13 < 0) {
            return;
        }
        int i15 = 0;
        while (true) {
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            linearLayout.setOrientation(0);
            for (int i16 = 0; i16 < 7; i16++) {
                final int i17 = i15 + i16;
                if (i17 >= 28) {
                    break;
                }
                View view = new View(getContext());
                view.setTag(dq1.c.idea_pin_color_option_index, Integer.valueOf(i17));
                view.setId(dq1.c.color_palette_item);
                view.setContentDescription(view.getContext().getString(f.accessibility_color_palette_button));
                int i18 = this.f46416a;
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i18, i18);
                layoutParams.weight = 1.0f;
                view.setLayoutParams(layoutParams);
                Context context3 = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                view.setBackground(new uf1.a(context3, f46415g[i17], i17 == 0, false, 8));
                view.setOnClickListener(new View.OnClickListener(this) { // from class: cu0.a

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ IdeaPinColorPalette f53250b;

                    {
                        this.f53250b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i19 = i14;
                        IdeaPinColorPalette.a(this.f53250b, i17, view2);
                    }
                });
                linearLayout.addView(view);
            }
            addView(linearLayout);
            if (i15 == u13) {
                return;
            } else {
                i15 += 7;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdeaPinColorPalette(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f46416a = (int) getContext().getResources().getDimension(a.story_pin_color_picker_item_size);
        int dimension = (int) getContext().getResources().getDimension(c.margin_half);
        int dimension2 = (int) getContext().getResources().getDimension(r0.margin_quadruple);
        final int i14 = 1;
        setOrientation(1);
        Context context2 = getContext();
        int i15 = dq1.b.rounded_top_rect_radius_40_dark_gray;
        Object obj = d5.a.f53679a;
        setBackground(context2.getDrawable(i15));
        setPaddingRelative(dimension, dimension, dimension, dimension2);
        int u13 = ue.c.u(0, 27, 7);
        if (u13 < 0) {
            return;
        }
        int i16 = 0;
        while (true) {
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            linearLayout.setOrientation(0);
            for (int i17 = 0; i17 < 7; i17++) {
                final int i18 = i16 + i17;
                if (i18 >= 28) {
                    break;
                }
                View view = new View(getContext());
                view.setTag(dq1.c.idea_pin_color_option_index, Integer.valueOf(i18));
                view.setId(dq1.c.color_palette_item);
                view.setContentDescription(view.getContext().getString(f.accessibility_color_palette_button));
                int i19 = this.f46416a;
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i19, i19);
                layoutParams.weight = 1.0f;
                view.setLayoutParams(layoutParams);
                Context context3 = view.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                view.setBackground(new uf1.a(context3, f46415g[i18], i18 == 0, false, 8));
                view.setOnClickListener(new View.OnClickListener(this) { // from class: cu0.a

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ IdeaPinColorPalette f53250b;

                    {
                        this.f53250b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i192 = i14;
                        IdeaPinColorPalette.a(this.f53250b, i18, view2);
                    }
                });
                linearLayout.addView(view);
            }
            addView(linearLayout);
            if (i16 == u13) {
                return;
            } else {
                i16 += 7;
            }
        }
    }
}
