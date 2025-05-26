package lu;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.pinterest.ads.feature.owc.view.quiz.QuizCarouselIndexView;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.internal.Intrinsics;
import so.jb;
import so.oa;

/* loaded from: classes3.dex */
public final class n extends FrameLayout implements ft.d, af2.c {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f84910o = 0;

    /* renamed from: a, reason: collision with root package name */
    public ye2.o f84911a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f84912b;

    /* renamed from: c, reason: collision with root package name */
    public final vt.e f84913c;

    /* renamed from: d, reason: collision with root package name */
    public final nx.f0 f84914d;

    /* renamed from: e, reason: collision with root package name */
    public final uj2.q f84915e;

    /* renamed from: f, reason: collision with root package name */
    public final lh0.g f84916f;

    /* renamed from: g, reason: collision with root package name */
    public vt.h f84917g;

    /* renamed from: h, reason: collision with root package name */
    public final GestaltIconButton f84918h;

    /* renamed from: i, reason: collision with root package name */
    public i0 f84919i;

    /* renamed from: j, reason: collision with root package name */
    public final ViewPager2 f84920j;

    /* renamed from: k, reason: collision with root package name */
    public final QuizCarouselIndexView f84921k;

    /* renamed from: l, reason: collision with root package name */
    public final GestaltText f84922l;

    /* renamed from: m, reason: collision with root package name */
    public int f84923m;

    /* renamed from: n, reason: collision with root package name */
    public final xj2.b f84924n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Context context, vt.e adsQuizManager, yk1.j mvpBinder) {
        super(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adsQuizManager, "adsQuizManager");
        Intrinsics.checkNotNullParameter(mvpBinder, "mvpBinder");
        if (!this.f84912b) {
            this.f84912b = true;
            oa oaVar = ((jb) ((o) generatedComponent())).f113483a;
            this.f84914d = (nx.f0) oaVar.f113747j2.get();
            this.f84915e = (uj2.q) oaVar.f113947u9.get();
            this.f84916f = oaVar.p2();
        }
        this.f84913c = adsQuizManager;
        this.f84923m = ps.s.ads_quiz_promoted_by;
        this.f84924n = new xj2.b();
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        View inflate = View.inflate(context, ps.q.quiz_questionnaire_view, this);
        View findViewById = inflate.findViewById(ps.p.back_bt);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f84918h = (GestaltIconButton) findViewById;
        View findViewById2 = inflate.findViewById(ps.p.dotsCarousel);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f84921k = (QuizCarouselIndexView) findViewById2;
        View findViewById3 = inflate.findViewById(ps.p.attribution);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f84922l = (GestaltText) findViewById3;
        View findViewById4 = inflate.findViewById(ps.p.viewPager);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        ViewPager2 viewPager2 = (ViewPager2) findViewById4;
        this.f84920j = viewPager2;
        viewPager2.f(new androidx.viewpager2.widget.d(this, inflate));
        nx.f0 pinalyticsFactory = this.f84914d;
        if (pinalyticsFactory == null) {
            Intrinsics.r("pinalyticsFactory");
            throw null;
        }
        uj2.q networkStateStream = this.f84915e;
        if (networkStateStream == null) {
            Intrinsics.r("networkStateStream");
            throw null;
        }
        Intrinsics.checkNotNullParameter(pinalyticsFactory, "pinalyticsFactory");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(adsQuizManager, "adsQuizManager");
        vt.h hVar = new vt.h(new uk1.d(pinalyticsFactory), networkStateStream);
        hVar.f126599a = adsQuizManager;
        mvpBinder.d(this, hVar);
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f84911a == null) {
            this.f84911a = new ye2.o(this);
        }
        return this.f84911a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f84911a == null) {
            this.f84911a = new ye2.o(this);
        }
        return this.f84911a.generatedComponent();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f84924n.dispose();
        super.onDetachedFromWindow();
    }
}
