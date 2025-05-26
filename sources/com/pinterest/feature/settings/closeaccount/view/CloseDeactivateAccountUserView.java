package com.pinterest.feature.settings.closeaccount.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import b52.a;
import b52.b;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yk1.n;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/pinterest/feature/settings/closeaccount/view/CloseDeactivateAccountUserView;", "Landroid/widget/LinearLayout;", "Lyk1/n;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "account_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class CloseDeactivateAccountUserView extends LinearLayout implements n {

    /* renamed from: a, reason: collision with root package name */
    public final GestaltAvatar f48140a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f48141b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CloseDeactivateAccountUserView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        View inflate = LayoutInflater.from(getContext()).inflate(b.view_close_deactivate_account_user, this);
        View findViewById = inflate.findViewById(a.close_deactivate_account_user_avatar);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f48140a = (GestaltAvatar) findViewById;
        View findViewById2 = inflate.findViewById(a.close_deactivate_account_user_name);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f48141b = (GestaltText) findViewById2;
        inflate.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CloseDeactivateAccountUserView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        View inflate = LayoutInflater.from(getContext()).inflate(b.view_close_deactivate_account_user, this);
        View findViewById = inflate.findViewById(a.close_deactivate_account_user_avatar);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f48140a = (GestaltAvatar) findViewById;
        View findViewById2 = inflate.findViewById(a.close_deactivate_account_user_name);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f48141b = (GestaltText) findViewById2;
        inflate.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CloseDeactivateAccountUserView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        View inflate = LayoutInflater.from(getContext()).inflate(b.view_close_deactivate_account_user, this);
        View findViewById = inflate.findViewById(a.close_deactivate_account_user_avatar);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f48140a = (GestaltAvatar) findViewById;
        View findViewById2 = inflate.findViewById(a.close_deactivate_account_user_name);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f48141b = (GestaltText) findViewById2;
        inflate.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
    }
}
