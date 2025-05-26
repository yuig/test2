package la1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.api.model.deserializer.UserDeserializer;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h extends ConstraintLayout implements yk1.n {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f82521f = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Function0 f82522a;

    /* renamed from: b, reason: collision with root package name */
    public final UserDeserializer f82523b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f82524c;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltText f82525d;

    /* renamed from: e, reason: collision with root package name */
    public final GestaltText f82526e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, Function0 onAction, UserDeserializer userDeserializer, boolean z13) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        Intrinsics.checkNotNullParameter(userDeserializer, "userDeserializer");
        this.f82522a = onAction;
        this.f82523b = userDeserializer;
        this.f82524c = z13;
        View inflate = LayoutInflater.from(context).inflate(b52.b.view_close_deactivate_account_footer, this);
        inflate.setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
        View findViewById = inflate.findViewById(b52.a.close_deactivate_final_warning_text);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f82525d = (GestaltText) findViewById;
        View findViewById2 = inflate.findViewById(b52.a.close_deactivate_account_email);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f82526e = (GestaltText) findViewById2;
        ((GestaltButton) inflate.findViewById(b52.a.close_deactivate_continue_button)).d(c.f82498m).e(new ca1.h(this, 1));
    }
}
