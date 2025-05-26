package com.pinterest.activity.conversation.notifsupsell.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import com.pinterest.activity.conversation.notifsupsell.view.NotifsOptInUpsellBannerView;
import com.pinterest.gestalt.buttongroup.GestaltButtonGroup;
import com.pinterest.gestalt.checkbox.GestaltCheckBox;
import com.pinterest.gestalt.text.GestaltText;
import gp.a;
import hp.d;
import hv1.b;
import ip.c;
import kh2.r;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import m60.r0;
import org.jetbrains.annotations.NotNull;
import u50.f0;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\fB\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/pinterest/activity/conversation/notifsupsell/view/NotifsOptInUpsellBannerView;", "Landroidx/cardview/widget/CardView;", "Lgp/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "kp/n", "notifsUpsellLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class NotifsOptInUpsellBannerView extends CardView implements a {

    /* renamed from: h, reason: collision with root package name */
    public d f34846h;

    /* renamed from: i, reason: collision with root package name */
    public final LinearLayout f34847i;

    /* renamed from: j, reason: collision with root package name */
    public final GestaltText f34848j;

    /* renamed from: k, reason: collision with root package name */
    public final GestaltButtonGroup f34849k;

    /* renamed from: l, reason: collision with root package name */
    public final GestaltCheckBox f34850l;

    /* renamed from: m, reason: collision with root package name */
    public final GestaltCheckBox f34851m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f34852n;

    /* renamed from: o, reason: collision with root package name */
    public Function0 f34853o;

    /* renamed from: p, reason: collision with root package name */
    public Function0 f34854p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotifsOptInUpsellBannerView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f34853o = c.f73358j;
        this.f34854p = c.f73359k;
        View.inflate(getContext(), b.inbox_notifs_optin_banner_upsell, this);
        int W = bs1.c.W(this, eo1.c.space_600);
        Intrinsics.checkNotNullParameter(this, "<this>");
        s(W, W, W, W);
        View findViewById = findViewById(hv1.a.banner_container);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        T();
        View findViewById2 = findViewById(hv1.a.banner_message);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f34848j = (GestaltText) findViewById2;
        View findViewById3 = findViewById(hv1.a.banner_button_group);
        final GestaltButtonGroup gestaltButtonGroup = (GestaltButtonGroup) findViewById3;
        final int i13 = 0;
        gestaltButtonGroup.b(new gm1.a() { // from class: ip.a
            @Override // gm1.a
            public final void h3(gm1.c cVar) {
                int i14 = i13;
                NotifsOptInUpsellBannerView.x(gestaltButtonGroup, this, cVar);
            }
        });
        Intrinsics.checkNotNullExpressionValue(findViewById3, "apply(...)");
        this.f34849k = gestaltButtonGroup;
        View findViewById4 = findViewById(hv1.a.banner_push_checkbox);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f34850l = (GestaltCheckBox) findViewById4;
        View findViewById5 = findViewById(hv1.a.banner_email_checkbox);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f34851m = (GestaltCheckBox) findViewById5;
        View findViewById6 = findViewById(hv1.a.banner_checkboxes_container);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f34847i = (LinearLayout) findViewById6;
    }

    public static void x(GestaltButtonGroup gestaltButtonGroup, NotifsOptInUpsellBannerView this$0, gm1.c event) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.f(gestaltButtonGroup);
        if (r.Z0(event, gestaltButtonGroup)) {
            this$0.f34853o.invoke();
        } else if (r.a1(event, gestaltButtonGroup)) {
            this$0.f34854p.invoke();
        }
    }

    public final void D(CharSequence text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f34848j.i(new ip.d(0, text));
    }

    public final void L(CharSequence text) {
        Intrinsics.checkNotNullParameter(text, "text");
        f0 h23 = bs1.c.h2(text);
        GestaltButtonGroup gestaltButtonGroup = this.f34849k;
        r.s(gestaltButtonGroup, h23);
        r.t(gestaltButtonGroup, d7.b.Z(!z.j(text)));
    }

    public final void T() {
        int i13 = eo1.b.color_themed_background_elevation_floating;
        Context context = getContext();
        Object obj = d5.a.f53679a;
        k(context.getColor(i13));
        t(getResources().getDimensionPixelOffset(r0.lego_banner_corner_radius));
        l(getResources().getDimensionPixelOffset(r0.lego_banner_elevation));
        setClipChildren(false);
        setClipToPadding(false);
        requestLayout();
    }

    public final void y() {
        float f13 = -(getY() + getMeasuredHeight() + getPaddingTop() + getPaddingBottom());
        float translationY = getTranslationY();
        if (this.f34852n) {
            f13 = 0.0f;
        }
        kg.a.d0(this, "translationY", translationY, f13, 0.65f, 0.32f).start();
        pl1.b bVar = new pl1.b(this, getMeasuredHeight(), false);
        bVar.setDuration(200L);
        bVar.setAnimationListener(new ip.b(this, 1));
        startAnimation(bVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotifsOptInUpsellBannerView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f34853o = c.f73358j;
        this.f34854p = c.f73359k;
        View.inflate(getContext(), b.inbox_notifs_optin_banner_upsell, this);
        int W = bs1.c.W(this, eo1.c.space_600);
        Intrinsics.checkNotNullParameter(this, "<this>");
        s(W, W, W, W);
        View findViewById = findViewById(hv1.a.banner_container);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        T();
        View findViewById2 = findViewById(hv1.a.banner_message);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f34848j = (GestaltText) findViewById2;
        View findViewById3 = findViewById(hv1.a.banner_button_group);
        final GestaltButtonGroup gestaltButtonGroup = (GestaltButtonGroup) findViewById3;
        final int i14 = 1;
        gestaltButtonGroup.b(new gm1.a() { // from class: ip.a
            @Override // gm1.a
            public final void h3(gm1.c cVar) {
                int i142 = i14;
                NotifsOptInUpsellBannerView.x(gestaltButtonGroup, this, cVar);
            }
        });
        Intrinsics.checkNotNullExpressionValue(findViewById3, "apply(...)");
        this.f34849k = gestaltButtonGroup;
        View findViewById4 = findViewById(hv1.a.banner_push_checkbox);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f34850l = (GestaltCheckBox) findViewById4;
        View findViewById5 = findViewById(hv1.a.banner_email_checkbox);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f34851m = (GestaltCheckBox) findViewById5;
        View findViewById6 = findViewById(hv1.a.banner_checkboxes_container);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f34847i = (LinearLayout) findViewById6;
    }
}
