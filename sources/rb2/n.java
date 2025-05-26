package rb2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.c2;
import com.pinterest.gestalt.text.GestaltText;
import h32.d4;
import h32.i0;
import kotlin.jvm.internal.Intrinsics;
import lh0.i4;
import lh0.z0;
import qz.f0;
import so.jb;
import so.oa;

/* loaded from: classes4.dex */
public final class n extends LinearLayout implements nx.a, yk1.n, af2.c {

    /* renamed from: a, reason: collision with root package name */
    public ye2.o f107190a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f107191b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f107192c;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltText f107193d;

    /* renamed from: e, reason: collision with root package name */
    public final m60.w f107194e;

    /* renamed from: f, reason: collision with root package name */
    public final c2 f107195f;

    /* renamed from: g, reason: collision with root package name */
    public final qz.a f107196g;

    /* renamed from: h, reason: collision with root package name */
    public final i4 f107197h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f107198i;

    /* renamed from: j, reason: collision with root package name */
    public l f107199j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Context context, boolean z13) {
        super(context);
        vd0.a c13;
        Intrinsics.checkNotNullParameter(context, "context");
        boolean z14 = true;
        if (!this.f107191b) {
            this.f107191b = true;
            jb jbVar = (jb) ((o) generatedComponent());
            oa oaVar = jbVar.f113483a;
            this.f107194e = (m60.w) oaVar.f113885r0.get();
            this.f107195f = jbVar.f113485c.D6();
            this.f107196g = (qz.a) oaVar.X5.get();
            this.f107197h = new i4((z0) oaVar.D0.get());
        }
        this.f107192c = z13;
        LayoutInflater.from(context).inflate(nb2.c.invite_friends_view, (ViewGroup) this, true);
        if (z13) {
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(eo1.c.space_400);
            setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        }
        View findViewById = findViewById(nb2.b.message_request_title_tv);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f107193d = (GestaltText) findViewById;
        f0 f0Var = new f0();
        f0Var.c(15, "page_size");
        f0Var.e("add_fields", n00.b.a(n00.c.SEND_SHARE_CONTACT));
        f0Var.e("hide_group_conversations", "false");
        qz.a aVar = this.f107196g;
        if (aVar == null) {
            Intrinsics.r("cache");
            throw null;
        }
        vd0.c a13 = aVar.a(f0Var);
        if (a13 != null && ((c13 = a13.c("data")) == null || c13.d() != 0)) {
            z14 = false;
        }
        this.f107198i = z14;
        this.f107199j = l.PROFILE_SHARE;
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f107190a == null) {
            this.f107190a = new ye2.o(this);
        }
        return this.f107190a;
    }

    @Override // nx.a
    public final i0 generateLoggingContext() {
        return new i0(d4.UNKNOWN_VIEW, null, null, null, null, null);
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f107190a == null) {
            this.f107190a = new ye2.o(this);
        }
        return this.f107190a.generatedComponent();
    }
}
