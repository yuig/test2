package com.pinterest.feature.board.join.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.pinterest.gestalt.button.view.GestaltButton;
import jc0.m;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wl0.b;
import wl0.c;
import y60.d;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/pinterest/feature/board/join/view/RequestToJoinButton;", "Landroid/widget/FrameLayout;", "Lwl0/c;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "detail_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class RequestToJoinButton extends FrameLayout implements c {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f45277d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final GestaltButton f45278a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltButton f45279b;

    /* renamed from: c, reason: collision with root package name */
    public b f45280c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequestToJoinButton(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), d.view_lego_request_to_join_button, this);
        View findViewById = findViewById(y60.c.join_button_small);
        GestaltButton gestaltButton = (GestaltButton) findViewById;
        gestaltButton.d(yl0.b.f139291j);
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        this.f45278a = gestaltButton;
        View findViewById2 = findViewById(y60.c.join_button_large);
        GestaltButton gestaltButton2 = (GestaltButton) findViewById2;
        gestaltButton2.d(yl0.b.f139292k);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "apply(...)");
        this.f45279b = gestaltButton2;
    }

    public final void a() {
        this.f45278a.d(new m(false, 23));
        this.f45279b.d(new m(false, 24));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequestToJoinButton(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), d.view_lego_request_to_join_button, this);
        View findViewById = findViewById(y60.c.join_button_small);
        GestaltButton gestaltButton = (GestaltButton) findViewById;
        gestaltButton.d(yl0.b.f139291j);
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        this.f45278a = gestaltButton;
        View findViewById2 = findViewById(y60.c.join_button_large);
        GestaltButton gestaltButton2 = (GestaltButton) findViewById2;
        gestaltButton2.d(yl0.b.f139292k);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "apply(...)");
        this.f45279b = gestaltButton2;
    }
}
