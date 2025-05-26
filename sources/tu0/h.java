package tu0;

import android.os.Bundle;
import android.view.View;
import com.pinterest.design.brio.widget.IconView;
import com.pinterest.feature.pincarouselads.view.CarouselIndexView;
import h32.a4;
import h32.d4;
import hz.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import so.e8;
import so.g8;
import yk1.m;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ltu0/h;", "Lcom/pinterest/feature/core/view/MvpViewPagerFragment;", "Ltu0/g;", "Ltu0/k;", "<init>", "()V", "ideaPinCreation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class h extends a<g> implements k {

    /* renamed from: y0, reason: collision with root package name */
    public static final /* synthetic */ int f119333y0 = 0;

    /* renamed from: r0, reason: collision with root package name */
    public e8 f119334r0;

    /* renamed from: s0, reason: collision with root package name */
    public uk1.e f119335s0;

    /* renamed from: t0, reason: collision with root package name */
    public g8 f119336t0;

    /* renamed from: u0, reason: collision with root package name */
    public CarouselIndexView f119337u0;

    /* renamed from: v0, reason: collision with root package name */
    public final l f119338v0 = new l(this, 2);

    /* renamed from: w0, reason: collision with root package name */
    public final d4 f119339w0 = d4.IDEA_PINEDUCATION_VIEW_PAGER;

    /* renamed from: x0, reason: collision with root package name */
    public final a4 f119340x0 = a4.STORY_PIN_CREATE;

    @Override // yk1.k
    public final m V7() {
        g8 g8Var = this.f119336t0;
        if (g8Var == null) {
            Intrinsics.r("ideaPinEducationPresenterFactory");
            throw null;
        }
        uk1.e eVar = this.f119335s0;
        if (eVar == null) {
            Intrinsics.r("presenterPinalyticsFactory");
            throw null;
        }
        uk1.d g13 = ((uk1.a) eVar).g();
        g13.d(this.f119339w0, this.f119340x0, null, null, null);
        return g8Var.a(g13);
    }

    @Override // com.pinterest.feature.core.view.MvpViewPagerFragment, uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getH0() {
        return this.f119340x0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getG0() {
        return this.f119339w0;
    }

    @Override // com.pinterest.feature.core.view.MvpViewPagerFragment, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = aq1.f.fragment_idea_pin_education;
        e8 e8Var = this.f119334r0;
        if (e8Var != null) {
            f8(e8Var.a());
        } else {
            Intrinsics.r("ideaPinEducationPageAdapterFactory");
            throw null;
        }
    }

    @Override // com.pinterest.feature.core.view.MvpViewPagerFragment, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        ((g) a8()).H();
        View findViewById = view.findViewById(aq1.d.carousel_index_opaque);
        CarouselIndexView carouselIndexView = (CarouselIndexView) findViewById;
        carouselIndexView.d(((g) a8()).f77529f.size());
        carouselIndexView.e(0);
        carouselIndexView.c(eo1.b.color_themed_text_default, eo1.b.color_gray_500);
        bs1.c.U1(carouselIndexView);
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        this.f119337u0 = carouselIndexView;
        Y7(this.f119338v0);
        ((IconView) view.findViewById(aq1.d.education_exit)).setOnClickListener(new com.pinterest.feature.home.view.c(this, 6));
    }
}
