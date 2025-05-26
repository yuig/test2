package zp;

import a.m2;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.c2;
import com.pinterest.api.model.v7;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import so.jb;
import so.oa;
import so.s8;

/* loaded from: classes3.dex */
public final class p extends LinearLayout implements af2.c {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f142463k = 0;

    /* renamed from: a, reason: collision with root package name */
    public ye2.o f142464a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f142465b;

    /* renamed from: c, reason: collision with root package name */
    public final v7 f142466c;

    /* renamed from: d, reason: collision with root package name */
    public final nx.d0 f142467d;

    /* renamed from: e, reason: collision with root package name */
    public final m60.w f142468e;

    /* renamed from: f, reason: collision with root package name */
    public final rg0.s f142469f;

    /* renamed from: g, reason: collision with root package name */
    public final c2 f142470g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f142471h;

    /* renamed from: i, reason: collision with root package name */
    public float f142472i;

    /* renamed from: j, reason: collision with root package name */
    public final rg0.n f142473j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Context context, v7 board, nx.d0 pinalytics) {
        super(context);
        Intrinsics.checkNotNullParameter(board, "board");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        final int i13 = 1;
        if (!this.f142465b) {
            this.f142465b = true;
            jb jbVar = (jb) ((q) generatedComponent());
            oa oaVar = jbVar.f113483a;
            this.f142468e = (m60.w) oaVar.f113885r0.get();
            s8 s8Var = jbVar.f113485c;
            this.f142469f = (rg0.s) oaVar.Q5.get();
            this.f142470g = s8Var.D6();
        }
        this.f142466c = board;
        this.f142467d = pinalytics;
        rg0.s sVar = this.f142469f;
        if (sVar == null) {
            Intrinsics.r("experiences");
            throw null;
        }
        this.f142473j = ((dh0.d) sVar).b(i32.y0.ANDROID_BOARD_TAKEOVER);
        View.inflate(context, d70.e.invite_collaborator_upsell_modal_view, this);
        View findViewById = findViewById(d70.d.image_modal);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        ImageView imageView = (ImageView) findViewById;
        View findViewById2 = findViewById(d70.d.title_modal_text);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        GestaltText gestaltText = (GestaltText) findViewById2;
        View findViewById3 = findViewById(d70.d.message_modal_text);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        GestaltText gestaltText2 = (GestaltText) findViewById3;
        View findViewById4 = findViewById(d70.d.invite_friends_modal_button);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        GestaltButton gestaltButton = (GestaltButton) findViewById4;
        View findViewById5 = findViewById(d70.d.not_now_modal_cta);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        GestaltButton gestaltButton2 = (GestaltButton) findViewById5;
        Context context2 = getContext();
        s sVar2 = (context2 == null || !dl2.b.A1(context2)) ? r.f142477a : r.f142478b;
        imageView.setImageDrawable(bs1.c.f0(this, sVar2.f142481a, null, null, 6));
        final int i14 = 0;
        pk.a0.o(gestaltText, sVar2.f142482b, new Object[0]);
        pk.a0.o(gestaltText2, sVar2.f142483c, new Object[0]);
        bs1.c.s(gestaltButton, new o(sVar2, 0));
        bs1.c.s(gestaltButton2, new o(sVar2, 1));
        setOnTouchListener(new m2(this, 3));
        gestaltButton.g(new View.OnClickListener(this) { // from class: zp.n

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f142455b;

            {
                this.f142455b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i15 = i14;
                p this$0 = this.f142455b;
                switch (i15) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.getClass();
                        HashMap hashMap = new HashMap();
                        hashMap.put("upsell_view_count", String.valueOf(((lb0.b) lb0.n.f82725d.a()).f("PREF_BOARD_VIEW_INVITE_UPSELL_VIEW_COUNT_2024_V1", 0)));
                        this$0.f142467d.g(h32.f1.BOARD_VIEW_UPSELL_MODAL_INVITE_COLLABORATORS_DISMISS_WITH_INVITE, null, hashMap, false);
                        m60.w wVar = this$0.f142468e;
                        if (wVar == null) {
                            Intrinsics.r("eventManager");
                            throw null;
                        }
                        a.c.y(wVar);
                        c2 c2Var = this$0.f142470g;
                        if (c2Var == null) {
                            Intrinsics.r("sharesheetUtils");
                            throw null;
                        }
                        m60.w wVar2 = this$0.f142468e;
                        if (wVar2 == null) {
                            Intrinsics.r("eventManager");
                            throw null;
                        }
                        c2Var.n(this$0.f142466c, -1, wVar2, true, 1);
                        rg0.n nVar = this$0.f142473j;
                        if (nVar != null) {
                            nVar.a(null, null);
                            return;
                        }
                        return;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.a();
                        rg0.n nVar2 = this$0.f142473j;
                        if (nVar2 != null) {
                            nVar2.c(null, null);
                            return;
                        }
                        return;
                }
            }
        });
        gestaltButton2.g(new View.OnClickListener(this) { // from class: zp.n

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f142455b;

            {
                this.f142455b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i15 = i13;
                p this$0 = this.f142455b;
                switch (i15) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.getClass();
                        HashMap hashMap = new HashMap();
                        hashMap.put("upsell_view_count", String.valueOf(((lb0.b) lb0.n.f82725d.a()).f("PREF_BOARD_VIEW_INVITE_UPSELL_VIEW_COUNT_2024_V1", 0)));
                        this$0.f142467d.g(h32.f1.BOARD_VIEW_UPSELL_MODAL_INVITE_COLLABORATORS_DISMISS_WITH_INVITE, null, hashMap, false);
                        m60.w wVar = this$0.f142468e;
                        if (wVar == null) {
                            Intrinsics.r("eventManager");
                            throw null;
                        }
                        a.c.y(wVar);
                        c2 c2Var = this$0.f142470g;
                        if (c2Var == null) {
                            Intrinsics.r("sharesheetUtils");
                            throw null;
                        }
                        m60.w wVar2 = this$0.f142468e;
                        if (wVar2 == null) {
                            Intrinsics.r("eventManager");
                            throw null;
                        }
                        c2Var.n(this$0.f142466c, -1, wVar2, true, 1);
                        rg0.n nVar = this$0.f142473j;
                        if (nVar != null) {
                            nVar.a(null, null);
                            return;
                        }
                        return;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.a();
                        rg0.n nVar2 = this$0.f142473j;
                        if (nVar2 != null) {
                            nVar2.c(null, null);
                            return;
                        }
                        return;
                }
            }
        });
    }

    public final void a() {
        HashMap hashMap = new HashMap();
        hashMap.put("upsell_view_count", String.valueOf(((lb0.b) lb0.n.f82725d.a()).f("PREF_BOARD_VIEW_INVITE_UPSELL_VIEW_COUNT_2024_V1", 0)));
        this.f142467d.g(h32.f1.BOARD_VIEW_UPSELL_MODAL_INVITE_COLLABORATORS_DISMISS, null, hashMap, false);
        m60.w wVar = this.f142468e;
        if (wVar != null) {
            a.c.y(wVar);
        } else {
            Intrinsics.r("eventManager");
            throw null;
        }
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f142464a == null) {
            this.f142464a = new ye2.o(this);
        }
        return this.f142464a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f142464a == null) {
            this.f142464a = new ye2.o(this);
        }
        return this.f142464a.generatedComponent();
    }
}
