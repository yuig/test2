package la1;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.pinterest.api.model.wy0;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.radioGroup.GestaltRadioGroup;
import com.pinterest.gestalt.text.GestaltText;
import h32.f1;
import java.util.HashMap;
import kh2.r;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import nx.d0;
import so.jb;

/* loaded from: classes5.dex */
public final class f extends LinearLayout implements af2.c {

    /* renamed from: a, reason: collision with root package name */
    public ye2.o f82513a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f82514b;

    /* renamed from: c, reason: collision with root package name */
    public final x10.d f82515c;

    /* renamed from: d, reason: collision with root package name */
    public final ka1.b f82516d;

    /* renamed from: e, reason: collision with root package name */
    public final GestaltRadioGroup f82517e;

    /* renamed from: f, reason: collision with root package name */
    public final GestaltButton f82518f;

    /* renamed from: g, reason: collision with root package name */
    public final w f82519g;

    /* renamed from: h, reason: collision with root package name */
    public final yk2.b f82520h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, wy0 wy0Var, x10.d settingsApi, ka1.b settingsPresenter) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(settingsApi, "settingsApi");
        Intrinsics.checkNotNullParameter(settingsPresenter, "settingsPresenter");
        final int i13 = 1;
        if (!this.f82514b) {
            this.f82514b = true;
            this.f82519g = (w) ((jb) ((g) generatedComponent())).f113483a.f113885r0.get();
        }
        this.f82515c = settingsApi;
        this.f82516d = settingsPresenter;
        boolean o03 = com.bumptech.glide.d.o0(wy0Var != null ? wy0Var.G3() : null);
        yk2.b bVar = new yk2.b();
        bVar.add(new Pair(Integer.valueOf(b52.c.close_account_survey_option_emails), "email"));
        bVar.add(new Pair(Integer.valueOf(b52.c.close_account_survey_option_second_account), "secondAccount"));
        bVar.add(new Pair(Integer.valueOf(b52.c.close_account_survey_option_privacy), "privacy"));
        if (!o03) {
            bVar.add(new Pair(Integer.valueOf(b52.c.close_account_survey_option_business_account_wanted), "businessAccountWanted"));
        }
        bVar.add(new Pair(Integer.valueOf(b52.c.close_account_survey_option_other), "other"));
        this.f82520h = e0.a(bVar);
        View.inflate(context, b52.b.view_close_account_survey_modal, this);
        ((GestaltText) findViewById(b52.a.unlink_ba_check_inbox_modal_title)).i(new q0.d(context, 16));
        View findViewById = findViewById(b52.a.survey_radio_group);
        GestaltRadioGroup gestaltRadioGroup = (GestaltRadioGroup) findViewById;
        final int i14 = 0;
        gestaltRadioGroup.t(new b(this, 0));
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        this.f82517e = gestaltRadioGroup;
        this.f82518f = ((GestaltButton) findViewById(b52.a.survey_send_email_button)).d(c.f82495j).e(new gm1.a(this) { // from class: la1.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f82492b;

            {
                this.f82492b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                String str;
                int i15 = i14;
                f this$0 = this.f82492b;
                switch (i15) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof xl1.a) {
                            ka1.b bVar2 = this$0.f82516d;
                            d0 pinalytics = bVar2.getPinalytics();
                            f1 f1Var = f1.USER_DELETE_REQUEST;
                            HashMap hashMap = new HashMap();
                            Pair pair = (Pair) CollectionsKt.U(((an1.l) ((u50.o) this$0.f82517e.f49491p.f33803a)).f15747e, this$0.f82520h);
                            if (pair == null || (str = (String) pair.f80347b) == null) {
                                str = "other";
                            }
                            bs1.c.G1("reason", str, hashMap);
                            Unit unit = Unit.f80348a;
                            pinalytics.g(f1Var, null, hashMap, false);
                            fk2.c l13 = this$0.f82515c.f131564a.d().h(wj2.c.a()).l(tk2.e.f118017c);
                            Intrinsics.checkNotNullExpressionValue(l13, "subscribeOn(...)");
                            nl.b.n(l13, new d(bVar2, 0), new e(1, this$0.f82516d, ka1.b.class, "onMyAccountClosedFailure", "onMyAccountClosedFailure(Ljava/lang/Throwable;)V", 0));
                            w wVar = this$0.f82519g;
                            if (wVar != null) {
                                a.c.y(wVar);
                                return;
                            } else {
                                Intrinsics.r("eventManager");
                                throw null;
                            }
                        }
                        return;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        w wVar2 = this$0.f82519g;
                        if (wVar2 != null) {
                            a.c.y(wVar2);
                            return;
                        } else {
                            Intrinsics.r("eventManager");
                            throw null;
                        }
                }
            }
        });
        ((GestaltButton) findViewById(b52.a.survey_cancel_button)).d(c.f82496k).e(new gm1.a(this) { // from class: la1.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f82492b;

            {
                this.f82492b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                String str;
                int i15 = i13;
                f this$0 = this.f82492b;
                switch (i15) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof xl1.a) {
                            ka1.b bVar2 = this$0.f82516d;
                            d0 pinalytics = bVar2.getPinalytics();
                            f1 f1Var = f1.USER_DELETE_REQUEST;
                            HashMap hashMap = new HashMap();
                            Pair pair = (Pair) CollectionsKt.U(((an1.l) ((u50.o) this$0.f82517e.f49491p.f33803a)).f15747e, this$0.f82520h);
                            if (pair == null || (str = (String) pair.f80347b) == null) {
                                str = "other";
                            }
                            bs1.c.G1("reason", str, hashMap);
                            Unit unit = Unit.f80348a;
                            pinalytics.g(f1Var, null, hashMap, false);
                            fk2.c l13 = this$0.f82515c.f131564a.d().h(wj2.c.a()).l(tk2.e.f118017c);
                            Intrinsics.checkNotNullExpressionValue(l13, "subscribeOn(...)");
                            nl.b.n(l13, new d(bVar2, 0), new e(1, this$0.f82516d, ka1.b.class, "onMyAccountClosedFailure", "onMyAccountClosedFailure(Ljava/lang/Throwable;)V", 0));
                            w wVar = this$0.f82519g;
                            if (wVar != null) {
                                a.c.y(wVar);
                                return;
                            } else {
                                Intrinsics.r("eventManager");
                                throw null;
                            }
                        }
                        return;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        w wVar2 = this$0.f82519g;
                        if (wVar2 != null) {
                            a.c.y(wVar2);
                            return;
                        } else {
                            Intrinsics.r("eventManager");
                            throw null;
                        }
                }
            }
        });
        r.p(gestaltRadioGroup, new b(this, 1));
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f82513a == null) {
            this.f82513a = new ye2.o(this);
        }
        return this.f82513a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f82513a == null) {
            this.f82513a = new ye2.o(this);
        }
        return this.f82513a.generatedComponent();
    }
}
