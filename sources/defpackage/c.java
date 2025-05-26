package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.api.model.wy0;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.listAction.GestaltListAction;
import g52.a;
import g52.b;
import kotlin.jvm.internal.Intrinsics;
import x91.r;

/* loaded from: classes2.dex */
public final class c extends ConstraintLayout {

    /* renamed from: a, reason: collision with root package name */
    public final GestaltListAction f24189a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltButton f24190b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(context).inflate(b.view_blocked_accounts_item, (ViewGroup) this, true);
        setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
        View findViewById = findViewById(a.blocked_user_list_action);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f24189a = (GestaltListAction) findViewById;
        View findViewById2 = findViewById(a.unblock_button);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f24190b = (GestaltButton) findViewById2;
    }

    public final void L(r listActionClick, r unblockButtonClick) {
        Intrinsics.checkNotNullParameter(listActionClick, "listActionClick");
        Intrinsics.checkNotNullParameter(unblockButtonClick, "unblockButtonClick");
        this.f24189a.Z(new a(0, listActionClick));
        this.f24190b.e(new a(1, unblockButtonClick));
    }

    public final void T(wy0 user) {
        Intrinsics.checkNotNullParameter(user, "user");
        b nextState = new b(user, dl2.b.j1(user));
        GestaltListAction gestaltListAction = this.f24189a;
        gestaltListAction.getClass();
        Intrinsics.checkNotNullParameter(nextState, "nextState");
    }
}
