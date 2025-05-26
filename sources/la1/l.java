package la1;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import pk.a0;
import so.jb;
import so.oa;

/* loaded from: classes5.dex */
public final class l extends LinearLayout implements af2.c {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f82535e = 0;

    /* renamed from: a, reason: collision with root package name */
    public ye2.o f82536a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f82537b;

    /* renamed from: c, reason: collision with root package name */
    public final lu1.b f82538c;

    /* renamed from: d, reason: collision with root package name */
    public final w f82539d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context, boolean z13) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        if (!this.f82537b) {
            this.f82537b = true;
            oa oaVar = ((jb) ((m) generatedComponent())).f113483a;
            this.f82538c = (lu1.b) oaVar.f113961v5.get();
            this.f82539d = (w) oaVar.f113885r0.get();
        }
        View.inflate(context, b52.b.view_close_deactivate_contact_us_modal, this);
        View findViewById = findViewById(b52.a.close_deactivate_contact_us_modal_title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        View findViewById2 = findViewById(b52.a.close_deactivate_contact_us_modal_description);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        GestaltText gestaltText = (GestaltText) findViewById2;
        View findViewById3 = findViewById(b52.a.close_deactivate_contact_us_modal_button);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        GestaltButton gestaltButton = (GestaltButton) findViewById3;
        View findViewById4 = findViewById(b52.a.close_deactivate_cancel_modal_button);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        GestaltButton gestaltButton2 = (GestaltButton) findViewById4;
        String string = z13 ? context.getString(b52.c.unable_to_close_linked_business_account) : context.getString(b52.c.unable_to_close_advertiser_account);
        Intrinsics.f(string);
        a0.p(gestaltText, string);
        gestaltButton.d(c.f82509x).e(new k(0, this, context));
        gestaltButton2.d(c.f82510y).e(new ca1.h(this, 2));
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f82536a == null) {
            this.f82536a = new ye2.o(this);
        }
        return this.f82536a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f82536a == null) {
            this.f82536a = new ye2.o(this);
        }
        return this.f82536a.generatedComponent();
    }
}
