package lq0;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.gestalt.button.view.GestaltButton;
import kotlin.jvm.internal.Intrinsics;
import so.jb;

/* loaded from: classes5.dex */
public final class i extends ConstraintLayout implements af2.c {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f84333d = 0;

    /* renamed from: a, reason: collision with root package name */
    public ye2.o f84334a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f84335b;

    /* renamed from: c, reason: collision with root package name */
    public final m60.w f84336c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context, String messageId, b1 b1Var) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        if (!this.f84335b) {
            this.f84335b = true;
            this.f84336c = (m60.w) ((jb) ((j) generatedComponent())).f113483a.f113885r0.get();
        }
        View.inflate(context, xc0.f.conversation_message_deletion_confirmation_modal_view, this);
        View findViewById = findViewById(xc0.e.conversation_message_deletion_title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        View findViewById2 = findViewById(xc0.e.conversation_message_deletion_description);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        View findViewById3 = findViewById(xc0.e.conversation_message_deletion_cancel);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        View findViewById4 = findViewById(xc0.e.conversation_message_deletion_confirm);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        ((GestaltButton) findViewById3).g(new lj0.a(this, 17));
        ((GestaltButton) findViewById4).g(new zp.y0(this, messageId, b1Var, 9));
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f84334a == null) {
            this.f84334a = new ye2.o(this);
        }
        return this.f84334a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f84334a == null) {
            this.f84334a = new ye2.o(this);
        }
        return this.f84334a.generatedComponent();
    }
}
