package com.pinterest.component.modal;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import d5.a;
import ga2.e;
import hf0.b;
import jc0.c;
import jc0.d;
import jc0.z;
import kh2.k3;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pk.a0;
import rq.n3;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\tB\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/pinterest/component/modal/BaseModalViewWrapper;", "Landroid/widget/LinearLayout;", "Ljc0/z;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "xa0/j", "ui-components_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public abstract class BaseModalViewWrapper extends LinearLayout implements z {

    /* renamed from: j */
    public static final /* synthetic */ int f44748j = 0;

    /* renamed from: a */
    public GestaltIconButton f44749a;

    /* renamed from: b */
    public GestaltText f44750b;

    /* renamed from: c */
    public GestaltButton f44751c;

    /* renamed from: d */
    public GestaltButton f44752d;

    /* renamed from: e */
    public ViewGroup f44753e;

    /* renamed from: f */
    public ViewGroup f44754f;

    /* renamed from: g */
    public ViewGroup f44755g;

    /* renamed from: h */
    public int f44756h;

    /* renamed from: i */
    public c f44757i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseModalViewWrapper(Context context, boolean z13, c floatingToolbarType) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(floatingToolbarType, "floatingToolbarType");
        this.f44757i = c.Disabled;
        i(z13, floatingToolbarType);
    }

    public final void a(int i13) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(Math.min(getContext().getResources().getDisplayMetrics().widthPixels, this.f44756h), i13);
        layoutParams.topMargin = 0;
        layoutParams.gravity = 81;
        setLayoutParams(layoutParams);
    }

    public int b() {
        int i13 = d.f75399a[this.f44757i.ordinal()];
        if (i13 == 1) {
            return e.view_pinterest_modal_brio_content_toolbar_floating;
        }
        if (i13 == 2) {
            return e.view_pinterest_modal_with_background_image;
        }
        if (i13 == 3) {
            return e.view_pinterest_modal_brio_content;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final float e() {
        return getX();
    }

    public final float g() {
        return getY();
    }

    public final void i(boolean z13, c cVar) {
        setOrientation(1);
        setLayoutTransition(new LayoutTransition());
        this.f44757i = cVar;
        View.inflate(getContext(), b(), this);
        this.f44749a = (GestaltIconButton) findViewById(ga2.d.modal_header_dismiss_bt);
        this.f44750b = (GestaltText) findViewById(ga2.d.modal_header_title_tv);
        this.f44751c = (GestaltButton) findViewById(ga2.d.modal_done_btn);
        this.f44752d = (GestaltButton) findViewById(ga2.d.modal_lego_done_btn);
        this.f44753e = (ViewGroup) findViewById(ga2.d.modal_header);
        this.f44754f = (ViewGroup) findViewById(ga2.d.modal_container);
        this.f44755g = (ViewGroup) findViewById(ga2.d.modal_list_container);
        if (b.q()) {
            setBackgroundResource(eo1.d.rounded_top_rect);
            this.f44756h = (int) (getContext().getResources().getDisplayMetrics().widthPixels * 0.7f);
        } else {
            Context context = getContext();
            int i13 = eo1.b.color_themed_background_elevation_floating;
            Object obj = a.f53679a;
            setBackgroundColor(context.getColor(i13));
            this.f44756h = -1;
        }
        GestaltIconButton gestaltIconButton = this.f44749a;
        if (gestaltIconButton != null) {
            gestaltIconButton.u(new n3(3));
        }
        if (z13) {
            ViewGroup viewGroup = this.f44754f;
            if (viewGroup != null) {
                int paddingStart = viewGroup.getPaddingStart();
                int paddingTop = viewGroup.getPaddingTop();
                int paddingEnd = viewGroup.getPaddingEnd();
                Resources resources = viewGroup.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                viewGroup.setPaddingRelative(paddingStart, paddingTop, paddingEnd, a0.K(24, resources));
            }
            ViewGroup viewGroup2 = this.f44755g;
            if (viewGroup2 != null) {
                int paddingStart2 = viewGroup2.getPaddingStart();
                int paddingTop2 = viewGroup2.getPaddingTop();
                int paddingEnd2 = viewGroup2.getPaddingEnd();
                Resources resources2 = viewGroup2.getResources();
                Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
                viewGroup2.setPaddingRelative(paddingStart2, paddingTop2, paddingEnd2, a0.K(24, resources2));
            }
        }
    }

    public final void j(Function0 onClickAction) {
        Intrinsics.checkNotNullParameter(onClickAction, "onClickAction");
        GestaltIconButton gestaltIconButton = this.f44749a;
        if (gestaltIconButton != null) {
            gestaltIconButton.u(new defpackage.a(3, onClickAction));
        }
    }

    public final void k() {
        ViewGroup viewGroup = this.f44753e;
        if (viewGroup == null) {
            return;
        }
        Context context = getContext();
        int i13 = eo1.d.lego_modal_bg;
        Object obj = a.f53679a;
        viewGroup.setBackground(context.getDrawable(i13));
    }

    public final void l(int i13) {
        GestaltText gestaltText = this.f44750b;
        if (gestaltText != null) {
            a0.o(gestaltText, i13, new Object[0]);
        }
    }

    public final void m(float f13) {
        setTranslationX(f13);
    }

    public final void n(float f13) {
        setTranslationY(f13);
    }

    public final void o(boolean z13) {
        if (z13) {
            GestaltIconButton gestaltIconButton = this.f44749a;
            if (gestaltIconButton != null) {
                com.bumptech.glide.c.u1(gestaltIconButton);
                return;
            }
            return;
        }
        GestaltIconButton gestaltIconButton2 = this.f44749a;
        if (gestaltIconButton2 != null) {
            com.bumptech.glide.c.d0(gestaltIconButton2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        GestaltButton gestaltButton = this.f44751c;
        if (gestaltButton != null) {
            gestaltButton.e(new n3(2));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return true;
    }

    public final void p(String str) {
        GestaltText gestaltText = this.f44750b;
        if (gestaltText != null) {
            if (str == null) {
                str = "";
            }
            a0.p(gestaltText, str);
        }
    }

    public final void q(boolean z13) {
        k3.R1(this.f44753e, z13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseModalViewWrapper(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        c cVar = c.Disabled;
        this.f44757i = cVar;
        i(true, cVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BaseModalViewWrapper(@NotNull Context context, AttributeSet attributeSet) {
        this(context, true);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BaseModalViewWrapper(Context context, boolean z13) {
        this(context, z13, c.Disabled);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
