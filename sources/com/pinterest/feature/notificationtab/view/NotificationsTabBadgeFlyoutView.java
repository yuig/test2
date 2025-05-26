package com.pinterest.feature.notificationtab.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import com.bumptech.glide.c;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m60.r0;
import oe0.g;
import org.jetbrains.annotations.NotNull;
import pk.a0;
import ru1.v;
import ve0.b;
import yk1.d;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/pinterest/feature/notificationtab/view/NotificationsTabBadgeFlyoutView;", "Landroid/widget/LinearLayout;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "legoFloatingNavBarLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class NotificationsTabBadgeFlyoutView extends LinearLayout implements d {

    /* renamed from: a, reason: collision with root package name */
    public final NotificationsTabBadgeTooltip f46837a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f46838b;

    /* renamed from: c, reason: collision with root package name */
    public float f46839c;

    /* renamed from: d, reason: collision with root package name */
    public int f46840d;

    /* renamed from: e, reason: collision with root package name */
    public Function0 f46841e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationsTabBadgeFlyoutView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        NotificationsTabBadgeTooltip notificationsTabBadgeTooltip = new NotificationsTabBadgeTooltip(6, context2, (AttributeSet) null);
        this.f46837a = notificationsTabBadgeTooltip;
        addView(notificationsTabBadgeTooltip, new LinearLayout.LayoutParams(-2, -2));
        new g(getContext().getResources());
        int dimension = (int) getResources().getDimension(r0.margin_half);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        c.a1(layoutParams, 0, dimension, 0, dimension);
        setLayoutParams(layoutParams);
        notificationsTabBadgeTooltip.g(b.BOTTOM_CENTER);
        this.f46838b = true;
        setId(ks1.c.notifs_badge_flyout_container);
    }

    public final void a(v callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f46841e = callback;
    }

    public final void b(String updateCount, String messageCount) {
        Intrinsics.checkNotNullParameter(updateCount, "update_badge");
        Intrinsics.checkNotNullParameter(messageCount, "message_badge");
        NotificationsTabBadgeTooltip notificationsTabBadgeTooltip = this.f46837a;
        notificationsTabBadgeTooltip.getClass();
        Intrinsics.checkNotNullParameter(updateCount, "updateCount");
        Intrinsics.checkNotNullParameter(messageCount, "messageCount");
        GestaltText gestaltText = notificationsTabBadgeTooltip.f46843q;
        if (gestaltText == null) {
            Intrinsics.r("updatesCountTextView");
            throw null;
        }
        a0.p(gestaltText, updateCount);
        GestaltText gestaltText2 = notificationsTabBadgeTooltip.f46844r;
        if (gestaltText2 != null) {
            a0.p(gestaltText2, messageCount);
        } else {
            Intrinsics.r("messageCountTextView");
            throw null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent ev2) {
        Intrinsics.checkNotNullParameter(ev2, "ev");
        if (this.f46838b && ev2.getAction() == 0) {
            NotificationsTabBadgeTooltip notificationsTabBadgeTooltip = this.f46837a;
            if (bs1.c.Q0(notificationsTabBadgeTooltip).contains(ml2.c.c(ev2.getX()), ml2.c.c(ev2.getY()))) {
                notificationsTabBadgeTooltip.performClick();
            }
        }
        this.f46838b = false;
        setVisibility(8);
        Function0 function0 = this.f46841e;
        if (function0 == null) {
            return true;
        }
        function0.invoke();
        return true;
    }

    @Override // android.view.View
    public final boolean isShown() {
        return this.f46838b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f46838b = false;
        setVisibility(8);
        Function0 function0 = this.f46841e;
        if (function0 != null) {
            function0.invoke();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        super.onLayout(z13, i13, i14, i15, i16);
        float f13 = this.f46839c;
        this.f46837a.setX(f13 - (Math.abs(r2.getWidth() - this.f46840d) / 2));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationsTabBadgeFlyoutView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        NotificationsTabBadgeTooltip notificationsTabBadgeTooltip = new NotificationsTabBadgeTooltip(6, context2, (AttributeSet) null);
        this.f46837a = notificationsTabBadgeTooltip;
        addView(notificationsTabBadgeTooltip, new LinearLayout.LayoutParams(-2, -2));
        new g(getContext().getResources());
        int dimension = (int) getResources().getDimension(r0.margin_half);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        c.a1(layoutParams, 0, dimension, 0, dimension);
        setLayoutParams(layoutParams);
        notificationsTabBadgeTooltip.g(b.BOTTOM_CENTER);
        this.f46838b = true;
        setId(ks1.c.notifs_badge_flyout_container);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationsTabBadgeFlyoutView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        NotificationsTabBadgeTooltip notificationsTabBadgeTooltip = new NotificationsTabBadgeTooltip(6, context2, (AttributeSet) null);
        this.f46837a = notificationsTabBadgeTooltip;
        addView(notificationsTabBadgeTooltip, new LinearLayout.LayoutParams(-2, -2));
        new g(getContext().getResources());
        int dimension = (int) getResources().getDimension(r0.margin_half);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        c.a1(layoutParams, 0, dimension, 0, dimension);
        setLayoutParams(layoutParams);
        notificationsTabBadgeTooltip.g(b.BOTTOM_CENTER);
        this.f46838b = true;
        setId(ks1.c.notifs_badge_flyout_container);
    }
}
