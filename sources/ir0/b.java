package ir0;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import kg.t;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import nx.d0;
import om1.l;
import ou1.e;
import so.jb;
import so.oa;
import ye2.o;
import zf0.f;

/* loaded from: classes5.dex */
public final class b extends LinearLayout implements af2.c {

    /* renamed from: a, reason: collision with root package name */
    public o f73494a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f73495b;

    /* renamed from: c, reason: collision with root package name */
    public final d0 f73496c;

    /* renamed from: d, reason: collision with root package name */
    public final WebImageView f73497d;

    /* renamed from: e, reason: collision with root package name */
    public final GestaltText f73498e;

    /* renamed from: f, reason: collision with root package name */
    public final GestaltText f73499f;

    /* renamed from: g, reason: collision with root package name */
    public String f73500g;

    /* renamed from: h, reason: collision with root package name */
    public final f f73501h;

    /* renamed from: i, reason: collision with root package name */
    public final w f73502i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, d0 pinalytics) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        final int i13 = 1;
        if (!this.f73495b) {
            this.f73495b = true;
            oa oaVar = ((jb) ((c) generatedComponent())).f113483a;
            this.f73501h = (f) oaVar.f113723hd.get();
            this.f73502i = (w) oaVar.f113885r0.get();
        }
        this.f73496c = pinalytics;
        View.inflate(context, td0.c.view_creator_onboarding_modal, this);
        View findViewById = findViewById(td0.b.view_creator_onboarding_modal_image);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f73497d = (WebImageView) findViewById;
        View findViewById2 = findViewById(td0.b.view_creator_onboarding_modal_close_button);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        View findViewById3 = findViewById(td0.b.view_creator_onboarding_modal_button);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        View findViewById4 = findViewById(td0.b.view_creator_onboarding_modal_description);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f73498e = (GestaltText) findViewById4;
        View findViewById5 = findViewById(td0.b.view_creator_onboarding_modal_title);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f73499f = (GestaltText) findViewById5;
        final int i14 = 0;
        ((GestaltIconButton) findViewById2).u(new gm1.a(this) { // from class: ir0.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f73493b;

            {
                this.f73493b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c event) {
                int i15 = i14;
                b this$0 = this.f73493b;
                switch (i15) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(event, "event");
                        if (event instanceof l) {
                            w wVar = this$0.f73502i;
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
                        Intrinsics.checkNotNullParameter(event, "event");
                        if (event instanceof xl1.a) {
                            Context context2 = this$0.getContext();
                            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                            t.M0(this$0.f73496c, context2, e.DEEPLINK, null, null, 0, 56);
                            w wVar2 = this$0.f73502i;
                            if (wVar2 != null) {
                                a.c.y(wVar2);
                                return;
                            } else {
                                Intrinsics.r("eventManager");
                                throw null;
                            }
                        }
                        return;
                }
            }
        });
        ((GestaltButton) findViewById3).e(new gm1.a(this) { // from class: ir0.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f73493b;

            {
                this.f73493b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c event) {
                int i15 = i13;
                b this$0 = this.f73493b;
                switch (i15) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(event, "event");
                        if (event instanceof l) {
                            w wVar = this$0.f73502i;
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
                        Intrinsics.checkNotNullParameter(event, "event");
                        if (event instanceof xl1.a) {
                            Context context2 = this$0.getContext();
                            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                            t.M0(this$0.f73496c, context2, e.DEEPLINK, null, null, 0, 56);
                            w wVar2 = this$0.f73502i;
                            if (wVar2 != null) {
                                a.c.y(wVar2);
                                return;
                            } else {
                                Intrinsics.r("eventManager");
                                throw null;
                            }
                        }
                        return;
                }
            }
        });
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f73494a == null) {
            this.f73494a = new o(this);
        }
        return this.f73494a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f73494a == null) {
            this.f73494a = new o(this);
        }
        return this.f73494a.generatedComponent();
    }
}
