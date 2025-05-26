package com.pinterest.feature.profile.lego.empty;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import b31.f;
import b41.a;
import b41.c;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.t0;
import m60.v0;
import mp.m;
import org.jetbrains.annotations.NotNull;
import pk.a0;
import vn1.g;
import yk1.n;
import yl1.k;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\fB\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/pinterest/feature/profile/lego/empty/LegoEmptyStateView;", "Landroid/widget/LinearLayout;", "Lyk1/n;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "b41/c", "profileLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class LegoEmptyStateView extends LinearLayout implements n {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f47533d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final GestaltText f47534a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f47535b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltButton f47536c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegoEmptyStateView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), v0.view_lego_empty_state, this);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setOrientation(1);
        View findViewById = findViewById(t0.lego_empty_state_title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f47534a = (GestaltText) findViewById;
        View findViewById2 = findViewById(t0.lego_empty_state_message);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f47535b = (GestaltText) findViewById2;
        View findViewById3 = findViewById(t0.empty_state_action_button);
        GestaltButton gestaltButton = (GestaltButton) findViewById3;
        gestaltButton.d(a.f21773i);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "apply(...)");
        this.f47536c = gestaltButton;
        a();
        if (isInEditMode()) {
            b(new c(5, "button text", null));
            i();
        }
    }

    public final void a() {
        GestaltButton gestaltButton = this.f47536c;
        Intrinsics.checkNotNullParameter(gestaltButton, "<this>");
        gestaltButton.d(k.f139345j);
    }

    public final void b(c actionItem) {
        Intrinsics.checkNotNullParameter(actionItem, "actionItem");
        this.f47536c.d(new y11.c(11, actionItem.f21776b, actionItem.f21775a)).e(new defpackage.a(21, actionItem.f21777c));
    }

    public final void e(String messageText) {
        Intrinsics.checkNotNullParameter(messageText, "messageText");
        a0.p(this.f47535b, messageText);
    }

    public final void g(g variant) {
        Intrinsics.checkNotNullParameter(variant, "variant");
        this.f47535b.i(new m(variant, 6));
    }

    public final void i() {
        a0.v1(this.f47536c);
    }

    public final void p(String titleText) {
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        this.f47534a.i(new f(titleText, 3));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegoEmptyStateView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), v0.view_lego_empty_state, this);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setOrientation(1);
        View findViewById = findViewById(t0.lego_empty_state_title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f47534a = (GestaltText) findViewById;
        View findViewById2 = findViewById(t0.lego_empty_state_message);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f47535b = (GestaltText) findViewById2;
        View findViewById3 = findViewById(t0.empty_state_action_button);
        GestaltButton gestaltButton = (GestaltButton) findViewById3;
        gestaltButton.d(a.f21773i);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "apply(...)");
        this.f47536c = gestaltButton;
        a();
        if (isInEditMode()) {
            b(new c(5, "button text", null));
            i();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegoEmptyStateView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), v0.view_lego_empty_state, this);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setOrientation(1);
        View findViewById = findViewById(t0.lego_empty_state_title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f47534a = (GestaltText) findViewById;
        View findViewById2 = findViewById(t0.lego_empty_state_message);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f47535b = (GestaltText) findViewById2;
        View findViewById3 = findViewById(t0.empty_state_action_button);
        GestaltButton gestaltButton = (GestaltButton) findViewById3;
        gestaltButton.d(a.f21773i);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "apply(...)");
        this.f47536c = gestaltButton;
        a();
        if (isInEditMode()) {
            b(new c(5, "button text", null));
            i();
        }
    }
}
