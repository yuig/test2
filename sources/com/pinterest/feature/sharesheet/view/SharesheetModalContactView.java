package com.pinterest.feature.sharesheet.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import b62.b;
import b62.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import org.jetbrains.annotations.NotNull;
import yk1.n;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/pinterest/feature/sharesheet/view/SharesheetModalContactView;", "Landroid/widget/LinearLayout;", "Lyk1/n;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "sharesheetLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SharesheetModalContactView extends LinearLayout implements n {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharesheetModalContactView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Intrinsics.checkNotNullExpressionValue(getResources().getString(x0.sent), "getString(...)");
        Intrinsics.checkNotNullExpressionValue(getResources().getString(x0.undo), "getString(...)");
        LayoutInflater.from(getContext()).inflate(c.contact_view_exp, (ViewGroup) this, true);
        View findViewById = findViewById(b.pinner_avatar);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        View findViewById2 = findViewById(b.placeholder_iconbutton);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        View findViewById3 = findViewById(b.pinner_username);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        View findViewById4 = findViewById(b.send_status);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        View findViewById5 = findViewById(b.progress_circle);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharesheetModalContactView(@NotNull Context context, @NotNull AttributeSet attrs, int i13) {
        super(context, attrs, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Intrinsics.checkNotNullExpressionValue(getResources().getString(x0.sent), "getString(...)");
        Intrinsics.checkNotNullExpressionValue(getResources().getString(x0.undo), "getString(...)");
        LayoutInflater.from(getContext()).inflate(c.contact_view_exp, (ViewGroup) this, true);
        View findViewById = findViewById(b.pinner_avatar);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        View findViewById2 = findViewById(b.placeholder_iconbutton);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        View findViewById3 = findViewById(b.pinner_username);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        View findViewById4 = findViewById(b.send_status);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        View findViewById5 = findViewById(b.progress_circle);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
    }
}
