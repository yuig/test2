package zp;

import android.content.Context;
import android.view.View;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.v7;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import h32.d4;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import lh0.q2;
import so.jb;
import so.oa;
import so.s8;

/* loaded from: classes3.dex */
public final class g1 extends d implements nx.a, af2.c {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f142408l = 0;

    /* renamed from: a, reason: collision with root package name */
    public ye2.o f142409a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f142410b;

    /* renamed from: c, reason: collision with root package name */
    public final v7 f142411c;

    /* renamed from: d, reason: collision with root package name */
    public final rg0.n f142412d;

    /* renamed from: e, reason: collision with root package name */
    public final nx.j0 f142413e;

    /* renamed from: f, reason: collision with root package name */
    public final q2 f142414f;

    /* renamed from: g, reason: collision with root package name */
    public final m60.w f142415g;

    /* renamed from: h, reason: collision with root package name */
    public final nx.f0 f142416h;

    /* renamed from: i, reason: collision with root package name */
    public final e82.h0 f142417i;

    /* renamed from: j, reason: collision with root package name */
    public final xj2.b f142418j;

    /* renamed from: k, reason: collision with root package name */
    public final xj2.b f142419k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(Context context, f30 pin, v7 board, rg0.n experienceValue) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(board, "board");
        Intrinsics.checkNotNullParameter(experienceValue, "experienceValue");
        Intrinsics.checkNotNullParameter(context, "context");
        if (!this.f142410b) {
            this.f142410b = true;
            jb jbVar = (jb) ((h1) generatedComponent());
            this.f142414f = s8.U4(jbVar.f113485c);
            oa oaVar = jbVar.f113483a;
            this.f142415g = (m60.w) oaVar.f113885r0.get();
            this.f142416h = (nx.f0) oaVar.f113747j2.get();
            this.f142417i = oaVar.b3();
        }
        this.f142411c = board;
        this.f142412d = experienceValue;
        nx.f0 f0Var = this.f142416h;
        if (f0Var == null) {
            Intrinsics.r("pinalyticsFactory");
            throw null;
        }
        this.f142413e = ((nx.m) f0Var).a(this);
        this.f142418j = new xj2.b();
        this.f142419k = new xj2.b();
        View.inflate(context, ry1.d.post_save_upsell_banner, this);
        View findViewById = findViewById(ry1.c.not_now_cta);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        GestaltButton gestaltButton = (GestaltButton) findViewById;
        View findViewById2 = findViewById(ry1.c.invite_friends_button);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        GestaltButton gestaltButton2 = (GestaltButton) findViewById2;
        View findViewById3 = findViewById(ry1.c.post_save_modal_image);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        View findViewById4 = findViewById(ry1.c.modal_header);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        GestaltText gestaltText = (GestaltText) findViewById4;
        View findViewById5 = findViewById(ry1.c.modal_body);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        GestaltText gestaltText2 = (GestaltText) findViewById5;
        ((WebImageView) findViewById3).loadUrl(bs1.c.B0(pin));
        if (experienceValue.f108060b == i32.l.ANDROID_POST_REPIN_BOARD_UPSELL_POST_CREATE.value()) {
            pk.a0.o(gestaltText, ry1.f.invite_people_new_board, new Object[0]);
            pk.a0.o(gestaltText2, ry1.f.get_ideas, new Object[0]);
        }
        HashMap hashMap = new HashMap();
        String j13 = board.j1();
        Intrinsics.checkNotNullExpressionValue(j13, "getName(...)");
        hashMap.put("invite_object", j13);
        gestaltButton.e(new xo.k(this, 3));
        gestaltButton2.e(new bp.j(3, this, hashMap));
        experienceValue.g();
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f142409a == null) {
            this.f142409a = new ye2.o(this);
        }
        return this.f142409a;
    }

    @Override // nx.a
    public final h32.i0 generateLoggingContext() {
        return new h32.i0(d4.BOARD, null, null, null, null, null);
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f142409a == null) {
            this.f142409a = new ye2.o(this);
        }
        return this.f142409a.generatedComponent();
    }

    public final m60.w getEventManager() {
        m60.w wVar = this.f142415g;
        if (wVar != null) {
            return wVar;
        }
        Intrinsics.r("eventManager");
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getEventManager();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        getEventManager();
        if (!this.f142418j.f135163b) {
            this.f142418j.dispose();
        }
        this.f142419k.dispose();
        super.onDetachedFromWindow();
    }
}
