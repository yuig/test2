package ji0;

import android.content.Context;
import android.text.Html;
import android.text.Spanned;
import android.view.View;
import android.widget.LinearLayout;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import df.j1;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;

/* loaded from: classes5.dex */
public final class j extends LinearLayout {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f76268b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final GestaltText f76269a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), vq1.c.suspended_accounts_view, this);
        setOrientation(1);
        View findViewById = findViewById(vq1.b.suspended_message_tV);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        GestaltText gestaltText = (GestaltText) findViewById;
        this.f76269a = gestaltText;
        gestaltText.i(f.f76256p);
        View findViewById2 = findViewById(vq1.b.dismiss_button);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        ((GestaltButton) findViewById2).e(new yb0.b(this, 14));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Context context = getContext();
        int i13 = eo1.b.color_themed_text_default;
        Object obj = d5.a.f53679a;
        int color = context.getColor(i13);
        Spanned fromHtml = Html.fromHtml(j1.c0(getContext().getResources().getString(vq1.d.suspended_account_login_error)));
        Intrinsics.checkNotNullExpressionValue(fromHtml, "fromHtml(...)");
        a0.p(this.f76269a, f0.h.l0(color, fromHtml).toString());
    }
}
