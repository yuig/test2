package com.pinterest.component.modal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import ga2.d;
import jc0.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/pinterest/component/modal/ModalViewWithImageWrapper;", "Lcom/pinterest/component/modal/BaseModalViewWrapper;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ui-components_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ModalViewWithImageWrapper extends BaseModalViewWrapper {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ModalViewWithImageWrapper(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ModalViewWithImageWrapper(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalViewWithImageWrapper(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, true, c.BackgroundImage);
        Intrinsics.checkNotNullParameter(context, "context");
        View findViewById = findViewById(d.background_image);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        View findViewById2 = findViewById(d.modal_header_dismiss_bt);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
    }
}
