package mp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.pinterest.gestalt.text.GestaltText;
import h32.d4;
import h32.i0;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;

/* loaded from: classes3.dex */
public final class s extends LinearLayout implements nx.a, yk1.n, af2.c {

    /* renamed from: a, reason: collision with root package name */
    public ye2.o f87885a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f87886b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Context context, int i13) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        if (!this.f87886b) {
            this.f87886b = true;
            ((t) generatedComponent()).getClass();
        }
        LayoutInflater.from(context).inflate(xc0.f.inbox_header_layout, (ViewGroup) this, true);
        View findViewById = findViewById(xc0.e.header_text);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        GestaltText gestaltText = (GestaltText) findViewById;
        String string = getResources().getString(xc0.i.requests);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        if (i13 == 1) {
            string = getResources().getString(xc0.i.messages_header);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        } else if (i13 == 2) {
            string = getResources().getString(xc0.i.contacts_header);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        } else if (i13 == 3) {
            string = getResources().getString(xc0.i.message_requests);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        } else if (i13 == 4) {
            string = getResources().getString(xc0.i.board_invites);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        }
        a0.p(gestaltText, string);
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f87885a == null) {
            this.f87885a = new ye2.o(this);
        }
        return this.f87885a;
    }

    @Override // nx.a
    public final i0 generateLoggingContext() {
        return new i0(d4.UNKNOWN_VIEW, null, null, null, null, null);
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f87885a == null) {
            this.f87885a = new ye2.o(this);
        }
        return this.f87885a.generatedComponent();
    }
}
