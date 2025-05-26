package rh1;

import android.content.Context;
import android.text.Editable;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.navigation.Navigation;
import kotlin.jvm.internal.Intrinsics;
import so.jb;

/* loaded from: classes5.dex */
public final class k1 extends ConstraintLayout implements yk1.n, af2.c {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f108238l = 0;

    /* renamed from: a, reason: collision with root package name */
    public ye2.o f108239a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f108240b;

    /* renamed from: c, reason: collision with root package name */
    public final nx.d0 f108241c;

    /* renamed from: d, reason: collision with root package name */
    public final Editable f108242d;

    /* renamed from: e, reason: collision with root package name */
    public final String f108243e;

    /* renamed from: f, reason: collision with root package name */
    public final String f108244f;

    /* renamed from: g, reason: collision with root package name */
    public final rp0.d f108245g;

    /* renamed from: h, reason: collision with root package name */
    public final rp0.d f108246h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f108247i;

    /* renamed from: j, reason: collision with root package name */
    public final kl2.p f108248j;

    /* renamed from: k, reason: collision with root package name */
    public final m60.w f108249k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(Context context, nx.d0 pinalytics, Editable commentText, String str, String str2, rp0.d dVar, rp0.d dVar2, boolean z13, kl2.p onPost) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(commentText, "commentText");
        Intrinsics.checkNotNullParameter(onPost, "onPost");
        final int i13 = 1;
        if (!this.f108240b) {
            this.f108240b = true;
            this.f108249k = (m60.w) ((jb) ((l1) generatedComponent())).f113483a.f113885r0.get();
        }
        this.f108241c = pinalytics;
        this.f108242d = commentText;
        this.f108243e = str;
        this.f108244f = str2;
        this.f108245g = dVar;
        this.f108246h = dVar2;
        this.f108247i = z13;
        this.f108248j = onPost;
        View.inflate(context, fb0.d.new_comment_confirmation_modal_view, this);
        View findViewById = findViewById(fb0.c.confirmation_text);
        GestaltText gestaltText = (GestaltText) findViewById;
        gestaltText.i(new q0.d(context, 19));
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        View findViewById2 = findViewById(fb0.c.edit_button);
        final int i14 = 0;
        ((GestaltButton) findViewById2).g(new View.OnClickListener(this) { // from class: rh1.j1

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k1 f108193b;

            {
                this.f108193b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i15 = i14;
                k1 this$0 = this.f108193b;
                switch (i15) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        m60.w wVar = this$0.f108249k;
                        if (wVar != null) {
                            a.c.y(wVar);
                            return;
                        } else {
                            Intrinsics.r("eventManager");
                            throw null;
                        }
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        nx.d0.v(this$0.f108241c, h32.f1.AGGREGATED_COMMENT_COMMUNITY_GUIDELINE_BANNER_CLICK, null, false, 12);
                        m60.w wVar2 = this$0.f108249k;
                        if (wVar2 != null) {
                            wVar2.d(Navigation.z0((ScreenLocation) com.pinterest.screens.u0.f51402a.getValue(), this$0.getResources().getString(fb0.f.url_community_guidelines)));
                            return;
                        } else {
                            Intrinsics.r("eventManager");
                            throw null;
                        }
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(findViewById2, "apply(...)");
        View findViewById3 = findViewById(fb0.c.post_button);
        GestaltButton gestaltButton = (GestaltButton) findViewById3;
        gestaltButton.d(new we1.n1(this, 28)).g(new fd1.e(11, this, gestaltButton));
        Intrinsics.checkNotNullExpressionValue(findViewById3, "apply(...)");
        gestaltText.k(new View.OnClickListener(this) { // from class: rh1.j1

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k1 f108193b;

            {
                this.f108193b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i15 = i13;
                k1 this$0 = this.f108193b;
                switch (i15) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        m60.w wVar = this$0.f108249k;
                        if (wVar != null) {
                            a.c.y(wVar);
                            return;
                        } else {
                            Intrinsics.r("eventManager");
                            throw null;
                        }
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        nx.d0.v(this$0.f108241c, h32.f1.AGGREGATED_COMMENT_COMMUNITY_GUIDELINE_BANNER_CLICK, null, false, 12);
                        m60.w wVar2 = this$0.f108249k;
                        if (wVar2 != null) {
                            wVar2.d(Navigation.z0((ScreenLocation) com.pinterest.screens.u0.f51402a.getValue(), this$0.getResources().getString(fb0.f.url_community_guidelines)));
                            return;
                        } else {
                            Intrinsics.r("eventManager");
                            throw null;
                        }
                }
            }
        });
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f108239a == null) {
            this.f108239a = new ye2.o(this);
        }
        return this.f108239a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f108239a == null) {
            this.f108239a = new ye2.o(this);
        }
        return this.f108239a.generatedComponent();
    }
}
