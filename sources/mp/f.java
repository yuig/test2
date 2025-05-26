package mp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import h32.d4;
import h32.i0;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import nx.f0;
import so.jb;
import so.oa;

/* loaded from: classes3.dex */
public final class f extends LinearLayout implements nx.a, yk1.n, af2.c {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f87845k = 0;

    /* renamed from: a, reason: collision with root package name */
    public ye2.o f87846a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f87847b;

    /* renamed from: c, reason: collision with root package name */
    public final LinearLayout f87848c;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltAvatar f87849d;

    /* renamed from: e, reason: collision with root package name */
    public final GestaltText f87850e;

    /* renamed from: f, reason: collision with root package name */
    public final GestaltIconButton f87851f;

    /* renamed from: g, reason: collision with root package name */
    public final xj2.b f87852g;

    /* renamed from: h, reason: collision with root package name */
    public final w f87853h;

    /* renamed from: i, reason: collision with root package name */
    public final f0 f87854i;

    /* renamed from: j, reason: collision with root package name */
    public final no1.e f87855j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        if (!this.f87847b) {
            this.f87847b = true;
            jb jbVar = (jb) ((g) generatedComponent());
            oa oaVar = jbVar.f113483a;
            this.f87853h = (w) oaVar.f113885r0.get();
            this.f87854i = (f0) oaVar.f113747j2.get();
            this.f87855j = jbVar.f113485c.C5();
        }
        this.f87852g = new xj2.b();
        LayoutInflater.from(context).inflate(xc0.f.list_cell_lego_conversation_inbox_address_book_contact, (ViewGroup) this, true);
        View findViewById = findViewById(xc0.e.conversation_container);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f87848c = (LinearLayout) findViewById;
        View findViewById2 = findViewById(xc0.e.avatar);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f87849d = (GestaltAvatar) findViewById2;
        View findViewById3 = findViewById(xc0.e.title_tv);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f87850e = (GestaltText) findViewById3;
        View findViewById4 = findViewById(xc0.e.right_arrow);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f87851f = (GestaltIconButton) findViewById4;
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f87846a == null) {
            this.f87846a = new ye2.o(this);
        }
        return this.f87846a;
    }

    @Override // nx.a
    public final i0 generateLoggingContext() {
        return new i0(d4.UNKNOWN_VIEW, null, null, null, null, null);
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f87846a == null) {
            this.f87846a = new ye2.o(this);
        }
        return this.f87846a.generatedComponent();
    }
}
