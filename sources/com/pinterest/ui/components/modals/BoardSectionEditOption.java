package com.pinterest.ui.components.modals;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.gestalt.text.GestaltText;
import k70.b;
import k70.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import org.jetbrains.annotations.NotNull;
import pk.a0;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/ui/components/modals/BoardSectionEditOption;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "boardSection_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class BoardSectionEditOption extends ConstraintLayout {

    /* renamed from: a, reason: collision with root package name */
    public final GestaltText f52286a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f52287b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoardSectionEditOption(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), c.view_lego_modal_option, this);
        View findViewById = findViewById(b.modal_option_title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f52286a = (GestaltText) findViewById;
        View findViewById2 = findViewById(b.modal_option_subtitle);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f52287b = (GestaltText) findViewById2;
    }

    public final void c(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        GestaltText gestaltText = this.f52287b;
        a0.p(gestaltText, text);
        if (z.j(text)) {
            a0.k0(gestaltText);
        } else {
            a0.w1(gestaltText);
        }
    }

    public final void p(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        GestaltText gestaltText = this.f52286a;
        a0.p(gestaltText, text);
        if (z.j(text)) {
            a0.k0(gestaltText);
        } else {
            a0.w1(gestaltText);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoardSectionEditOption(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), c.view_lego_modal_option, this);
        View findViewById = findViewById(b.modal_option_title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f52286a = (GestaltText) findViewById;
        View findViewById2 = findViewById(b.modal_option_subtitle);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f52287b = (GestaltText) findViewById2;
    }
}
