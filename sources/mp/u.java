package mp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.pinterest.gestalt.listAction.GestaltListAction;
import h32.d4;
import h32.i0;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import so.jb;

/* loaded from: classes3.dex */
public final class u extends LinearLayout implements nx.a, yk1.n, af2.c {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f87887e = 0;

    /* renamed from: a, reason: collision with root package name */
    public ye2.o f87888a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f87889b;

    /* renamed from: c, reason: collision with root package name */
    public final w f87890c;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltListAction f87891d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        if (!this.f87889b) {
            this.f87889b = true;
            this.f87890c = (w) ((jb) ((v) generatedComponent())).f113483a.f113885r0.get();
        }
        LayoutInflater.from(context).inflate(xc0.f.list_cell_conversation_inbox_more_request, (ViewGroup) this, true);
        View findViewById = findViewById(xc0.e.message_request_container);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f87891d = (GestaltListAction) findViewById;
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f87888a == null) {
            this.f87888a = new ye2.o(this);
        }
        return this.f87888a;
    }

    @Override // nx.a
    public final i0 generateLoggingContext() {
        return new i0(d4.UNKNOWN_VIEW, null, null, null, null, null);
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f87888a == null) {
            this.f87888a = new ye2.o(this);
        }
        return this.f87888a.generatedComponent();
    }
}
