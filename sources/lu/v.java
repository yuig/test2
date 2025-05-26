package lu;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.pinterest.ads.feature.owc.view.quiz.QuizCarouselIndexView;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.internal.Intrinsics;
import so.jb;
import so.oa;

/* loaded from: classes3.dex */
public final class v extends FrameLayout implements ft.f, af2.c {

    /* renamed from: a, reason: collision with root package name */
    public ye2.o f84952a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f84953b;

    /* renamed from: c, reason: collision with root package name */
    public final vt.e f84954c;

    /* renamed from: d, reason: collision with root package name */
    public final nx.f0 f84955d;

    /* renamed from: e, reason: collision with root package name */
    public final uj2.q f84956e;

    /* renamed from: f, reason: collision with root package name */
    public final lh0.g f84957f;

    /* renamed from: g, reason: collision with root package name */
    public vt.j f84958g;

    /* renamed from: h, reason: collision with root package name */
    public final GestaltIconButton f84959h;

    /* renamed from: i, reason: collision with root package name */
    public final QuizCarouselIndexView f84960i;

    /* renamed from: j, reason: collision with root package name */
    public final GestaltText f84961j;

    /* renamed from: k, reason: collision with root package name */
    public final GestaltButton f84962k;

    /* renamed from: l, reason: collision with root package name */
    public final GestaltText f84963l;

    /* renamed from: m, reason: collision with root package name */
    public int f84964m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Context context, vt.e adsQuizManager, yk1.j mvpBinder) {
        super(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adsQuizManager, "adsQuizManager");
        Intrinsics.checkNotNullParameter(mvpBinder, "mvpBinder");
        if (!this.f84953b) {
            this.f84953b = true;
            oa oaVar = ((jb) ((w) generatedComponent())).f113483a;
            this.f84955d = (nx.f0) oaVar.f113747j2.get();
            this.f84956e = (uj2.q) oaVar.f113947u9.get();
            this.f84957f = oaVar.p2();
        }
        this.f84954c = adsQuizManager;
        this.f84964m = ps.s.ads_quiz_promoted_by;
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        setLayoutParams(getLayoutParams());
        View inflate = View.inflate(context, ps.q.quiz_results_fallback_view, this);
        View findViewById = inflate.findViewById(ps.p.back_bt);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f84959h = (GestaltIconButton) findViewById;
        View findViewById2 = inflate.findViewById(ps.p.dotsCarousel);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        QuizCarouselIndexView quizCarouselIndexView = (QuizCarouselIndexView) findViewById2;
        this.f84960i = quizCarouselIndexView;
        bs1.c.U1(quizCarouselIndexView);
        View findViewById3 = inflate.findViewById(ps.p.attribution);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f84963l = (GestaltText) findViewById3;
        View findViewById4 = inflate.findViewById(ps.p.fallback_results_description);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f84961j = (GestaltText) findViewById4;
        View findViewById5 = inflate.findViewById(ps.p.see_result);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f84962k = (GestaltButton) findViewById5;
        nx.f0 pinalyticsFactory = this.f84955d;
        if (pinalyticsFactory == null) {
            Intrinsics.r("pinalyticsFactory");
            throw null;
        }
        uj2.q networkStateStream = this.f84956e;
        if (networkStateStream == null) {
            Intrinsics.r("networkStateStream");
            throw null;
        }
        Intrinsics.checkNotNullParameter(pinalyticsFactory, "pinalyticsFactory");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(adsQuizManager, "adsQuizManager");
        vt.j jVar = new vt.j(new uk1.d(pinalyticsFactory), networkStateStream);
        jVar.f126601a = adsQuizManager;
        mvpBinder.d(this, jVar);
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f84952a == null) {
            this.f84952a = new ye2.o(this);
        }
        return this.f84952a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f84952a == null) {
            this.f84952a = new ye2.o(this);
        }
        return this.f84952a.generatedComponent();
    }
}
