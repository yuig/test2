package com.pinterest.gestalt.splitButton.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/pinterest/gestalt/splitButton/view/ButtonWithEllipsize;", "Landroidx/appcompat/widget/AppCompatButton;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "splitButton_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ButtonWithEllipsize extends AppCompatButton {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ButtonWithEllipsize(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.View
    public final boolean isFocused() {
        if (getEllipsize() == TextUtils.TruncateAt.MARQUEE) {
            return true;
        }
        return super.isFocused();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonWithEllipsize(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        setSingleLine(true);
        setGravity(16);
    }
}
