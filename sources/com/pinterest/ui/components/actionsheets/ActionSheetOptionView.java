package com.pinterest.ui.components.actionsheets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.text.GestaltText;
import kg.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rt1.a;
import rt1.b;
import yk1.n;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/pinterest/ui/components/actionsheets/ActionSheetOptionView;", "Landroid/widget/LinearLayout;", "Lyk1/n;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "modalLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ActionSheetOptionView extends LinearLayout implements n {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f52250c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final GestaltText f52251a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltIcon f52252b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionSheetOptionView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), b.view_lego_actionsheet_row, this);
        View findViewById = findViewById(a.option_title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f52251a = (GestaltText) findViewById;
        View findViewById2 = findViewById(a.option_selected_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f52252b = (GestaltIcon) findViewById2;
    }

    @Override // android.view.View
    public final void setSelected(boolean z13) {
        super.setSelected(z13);
        GestaltIcon gestaltIcon = this.f52252b;
        if (z13) {
            t.e1(gestaltIcon);
        } else {
            t.O(gestaltIcon);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionSheetOptionView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), b.view_lego_actionsheet_row, this);
        View findViewById = findViewById(a.option_title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f52251a = (GestaltText) findViewById;
        View findViewById2 = findViewById(a.option_selected_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f52252b = (GestaltIcon) findViewById2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionSheetOptionView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), b.view_lego_actionsheet_row, this);
        View findViewById = findViewById(a.option_title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f52251a = (GestaltText) findViewById;
        View findViewById2 = findViewById(a.option_selected_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f52252b = (GestaltIcon) findViewById2;
    }
}
