package fd1;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.c2;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import so.jb;

/* loaded from: classes5.dex */
public final class w extends LinearLayout implements cd1.b, af2.c {

    /* renamed from: a, reason: collision with root package name */
    public ye2.o f62004a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f62005b;

    /* renamed from: c, reason: collision with root package name */
    public final nx.d0 f62006c;

    /* renamed from: d, reason: collision with root package name */
    public final int f62007d;

    /* renamed from: e, reason: collision with root package name */
    public final dl1.s f62008e;

    /* renamed from: f, reason: collision with root package name */
    public final m60.w f62009f;

    /* renamed from: g, reason: collision with root package name */
    public final c2 f62010g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(Context context, nx.d0 pinalytics, int i13, dl1.s model, dl1.s viewedUser) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(viewedUser, "viewedUser");
        final int i14 = 1;
        if (!this.f62005b) {
            this.f62005b = true;
            jb jbVar = (jb) ((x) generatedComponent());
            this.f62009f = (m60.w) jbVar.f113483a.f113885r0.get();
            this.f62010g = jbVar.f113485c.D6();
        }
        this.f62006c = pinalytics;
        this.f62007d = i13;
        this.f62008e = model;
        View.inflate(context, b62.c.view_lego_postfollow_modal, this);
        setOrientation(1);
        e0.t.f56747e = i13;
        GestaltText gestaltText = (GestaltText) findViewById(b62.b.youre_following_subtitle);
        Intrinsics.f(gestaltText);
        String string = getResources().getString(m60.x0.now_that_youre_following_1, ((wy0) viewedUser).Z2());
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        pk.a0.p(gestaltText, string);
        final int i15 = 0;
        ((GestaltButton) findViewById(b62.b.not_now_cta)).e(new gm1.a(this) { // from class: fd1.v

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w f62003b;

            {
                this.f62003b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                String str;
                int i16 = i15;
                w this$0 = this.f62003b;
                switch (i16) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.f62006c.h0((r18 & 1) != 0 ? h32.f1.TAP : h32.f1.TAP, (r18 & 2) != 0 ? null : h32.u0.NOT_NOW, (r18 & 4) != 0 ? null : h32.g0.PRIVATE_PROFILE_POST_FOLLOW_MODAL_SHARE_PROFILE, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                        m60.w wVar = this$0.f62009f;
                        if (wVar != null) {
                            a.c.y(wVar);
                            return;
                        } else {
                            Intrinsics.r("eventManager");
                            throw null;
                        }
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        HashMap hashMap = new HashMap();
                        hashMap.put("invite_object", p32.i.PINNER.toString());
                        y32.d dVar = y32.f.Companion;
                        int i17 = this$0.f62007d;
                        dVar.getClass();
                        y32.f a13 = y32.d.a(i17);
                        if (a13 == null || (str = a13.name()) == null) {
                            str = "unknown";
                        }
                        hashMap.put("source", str);
                        this$0.f62006c.h0((r18 & 1) != 0 ? h32.f1.TAP : h32.f1.TAP, (r18 & 2) != 0 ? null : h32.u0.SHARE_PROFILE, (r18 & 4) != 0 ? null : h32.g0.PRIVATE_PROFILE_POST_FOLLOW_MODAL_SHARE_PROFILE, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : hashMap, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                        m60.w wVar2 = this$0.f62009f;
                        if (wVar2 == null) {
                            Intrinsics.r("eventManager");
                            throw null;
                        }
                        a.c.y(wVar2);
                        c2 c2Var = this$0.f62010g;
                        if (c2Var != null) {
                            c2Var.p(this$0.f62007d, this$0.f62008e);
                            return;
                        } else {
                            Intrinsics.r("sharesheetUtils");
                            throw null;
                        }
                }
            }
        });
        ((GestaltButton) findViewById(b62.b.share_link_cta)).e(new gm1.a(this) { // from class: fd1.v

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w f62003b;

            {
                this.f62003b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                String str;
                int i16 = i14;
                w this$0 = this.f62003b;
                switch (i16) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.f62006c.h0((r18 & 1) != 0 ? h32.f1.TAP : h32.f1.TAP, (r18 & 2) != 0 ? null : h32.u0.NOT_NOW, (r18 & 4) != 0 ? null : h32.g0.PRIVATE_PROFILE_POST_FOLLOW_MODAL_SHARE_PROFILE, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                        m60.w wVar = this$0.f62009f;
                        if (wVar != null) {
                            a.c.y(wVar);
                            return;
                        } else {
                            Intrinsics.r("eventManager");
                            throw null;
                        }
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        HashMap hashMap = new HashMap();
                        hashMap.put("invite_object", p32.i.PINNER.toString());
                        y32.d dVar = y32.f.Companion;
                        int i17 = this$0.f62007d;
                        dVar.getClass();
                        y32.f a13 = y32.d.a(i17);
                        if (a13 == null || (str = a13.name()) == null) {
                            str = "unknown";
                        }
                        hashMap.put("source", str);
                        this$0.f62006c.h0((r18 & 1) != 0 ? h32.f1.TAP : h32.f1.TAP, (r18 & 2) != 0 ? null : h32.u0.SHARE_PROFILE, (r18 & 4) != 0 ? null : h32.g0.PRIVATE_PROFILE_POST_FOLLOW_MODAL_SHARE_PROFILE, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : hashMap, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                        m60.w wVar2 = this$0.f62009f;
                        if (wVar2 == null) {
                            Intrinsics.r("eventManager");
                            throw null;
                        }
                        a.c.y(wVar2);
                        c2 c2Var = this$0.f62010g;
                        if (c2Var != null) {
                            c2Var.p(this$0.f62007d, this$0.f62008e);
                            return;
                        } else {
                            Intrinsics.r("sharesheetUtils");
                            throw null;
                        }
                }
            }
        });
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f62004a == null) {
            this.f62004a = new ye2.o(this);
        }
        return this.f62004a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f62004a == null) {
            this.f62004a = new ye2.o(this);
        }
        return this.f62004a.generatedComponent();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        hf0.b.k(this);
        super.onDetachedFromWindow();
    }
}
