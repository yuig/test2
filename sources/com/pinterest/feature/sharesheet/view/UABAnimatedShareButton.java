package com.pinterest.feature.sharesheet.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import b62.b;
import b62.c;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/sharesheet/view/UABAnimatedShareButton;", "Lcom/pinterest/feature/sharesheet/view/AnimatedSendShareButton;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "sharesheetLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class UABAnimatedShareButton extends AnimatedSendShareButton {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UABAnimatedShareButton(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.pinterest.feature.sharesheet.view.AnimatedSendShareButton
    public final void L() {
        View.inflate(getContext(), c.view_uab_animated_share_button, this);
        View hideView = findViewById(b.uab_share_button);
        Intrinsics.checkNotNullExpressionValue(hideView, "findViewById(...)");
        Intrinsics.checkNotNullParameter(hideView, "<set-?>");
        this.f48379g = hideView;
        if (hideView == null) {
            Intrinsics.r("sendIconButton");
            throw null;
        }
        Intrinsics.checkNotNullParameter(hideView, "hideView");
        this.f48381i = hideView;
        setClipChildren(false);
        X();
    }

    public final void Z(rm1.c color) {
        Intrinsics.checkNotNullParameter(color, "color");
        View view = this.f48379g;
        if (view != null) {
            ((GestaltIcon) view).g2(new sp.b(color, 3));
        } else {
            Intrinsics.r("sendIconButton");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UABAnimatedShareButton(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
