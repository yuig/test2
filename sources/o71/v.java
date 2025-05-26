package o71;

import android.content.res.Resources;
import android.text.SpannableString;
import com.pinterest.feature.search.typeahead.view.SearchTypeaheadPinCarousel;
import com.pinterest.gestalt.text.GestaltText;
import java.util.Date;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import lh0.j3;
import x02.i2;

/* loaded from: classes5.dex */
public final class v extends vq0.b {

    /* renamed from: c, reason: collision with root package name */
    public final m60.w f93380c;

    /* renamed from: d, reason: collision with root package name */
    public final l71.p f93381d;

    /* renamed from: e, reason: collision with root package name */
    public final w f93382e;

    /* renamed from: f, reason: collision with root package name */
    public final i2 f93383f;

    /* renamed from: g, reason: collision with root package name */
    public final yk1.v f93384g;

    /* renamed from: h, reason: collision with root package name */
    public br.d f93385h;

    /* renamed from: i, reason: collision with root package name */
    public final int f93386i;

    /* renamed from: j, reason: collision with root package name */
    public String f93387j;

    /* renamed from: k, reason: collision with root package name */
    public Date f93388k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(m60.w eventManager, uk1.d presenterPinalytics, uj2.q networkStateStream, l71.p searchTypeaheadListener, w screenNavigatorManager, i2 pinRepository, yk1.v viewResources, j3 typeaheadExperiments) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(searchTypeaheadListener, "searchTypeaheadListener");
        Intrinsics.checkNotNullParameter(screenNavigatorManager, "screenNavigatorManager");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(typeaheadExperiments, "typeaheadExperiments");
        this.f93380c = eventManager;
        this.f93381d = searchTypeaheadListener;
        this.f93382e = screenNavigatorManager;
        this.f93383f = pinRepository;
        this.f93384g = viewResources;
        this.f93386i = -1;
        this.f93387j = "";
        this.f126436a.j(7, new ni0.f(this, viewResources, typeaheadExperiments));
    }

    public final void D3() {
        List list;
        List y03;
        if (isBound()) {
            int i13 = eo1.c.space_800;
            yk1.a aVar = (yk1.a) this.f93384g;
            int dimensionPixelSize = ((SearchTypeaheadPinCarousel) ((k71.i) getView())).getResources().getDisplayMetrics().widthPixels - aVar.f139224a.getDimensionPixelSize(i13);
            int i14 = n42.a.search_autocomplete_pin_image_width;
            Resources resources = aVar.f139224a;
            int dimensionPixelSize2 = dimensionPixelSize / (resources.getDimensionPixelSize(eo1.c.space_200) + resources.getDimensionPixelSize(i14));
            br.d dVar = this.f93385h;
            if (dVar == null || (list = dVar.f23718p) == null || (y03 = CollectionsKt.y0(list, dimensionPixelSize2)) == null) {
                return;
            }
            hk2.f fVar = new hk2.f(1, this.f93383f.N(y03).r(tk2.e.f118017c).l(wj2.c.a()), new d51.a(17, new t(this, 0)));
            hk2.b bVar = new hk2.b(new u51.b(25, new t(this, 1)), new u51.b(26, u.f93377j), ck2.i.f27923c);
            fVar.f(bVar);
            Intrinsics.checkNotNullExpressionValue(bVar, "subscribe(...)");
            addDisposable(bVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void F3() {
        if (isBound()) {
            br.d dVar = this.f93385h;
            if (dVar != null) {
                String title = dVar.f23704b;
                if (title == null) {
                    title = "";
                }
                k71.i iVar = (k71.i) getView();
                String enteredQuery = this.f93387j;
                SearchTypeaheadPinCarousel searchTypeaheadPinCarousel = (SearchTypeaheadPinCarousel) iVar;
                searchTypeaheadPinCarousel.getClass();
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(enteredQuery, "enteredQuery");
                if (enteredQuery.length() != 0) {
                    SpannableString spannableString = new SpannableString(title);
                    String lowerCase = title.toLowerCase();
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    String lowerCase2 = enteredQuery.toLowerCase();
                    Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                    spannableString.setSpan(searchTypeaheadPinCarousel.f47875e, 0, kotlin.text.z.p(lowerCase, lowerCase2, false) ? enteredQuery.length() : 0, 0);
                    title = spannableString;
                }
                Object value = searchTypeaheadPinCarousel.f47874d.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                pk.a0.q((GestaltText) value, bs1.c.h2(title));
            }
            SearchTypeaheadPinCarousel searchTypeaheadPinCarousel2 = (SearchTypeaheadPinCarousel) ((k71.i) getView());
            searchTypeaheadPinCarousel2.getClass();
            Intrinsics.checkNotNullParameter(this, "listener");
            searchTypeaheadPinCarousel2.f47876f = this;
        }
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        return 7;
    }

    @Override // vq0.g, yk1.p, yk1.b
    /* renamed from: onBind */
    public final void r3(yk1.n nVar) {
        k71.i view = (k71.i) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        F3();
        D3();
    }

    @Override // vq0.g
    public final sq0.e0 p3() {
        return this;
    }

    @Override // vq0.g
    public final void r3(sq0.b0 b0Var) {
        k71.i view = (k71.i) b0Var;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        F3();
        D3();
    }

    @Override // vq0.g, yk1.p
    /* renamed from: onBind */
    public final void r3(yk1.r rVar) {
        k71.i view = (k71.i) rVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        F3();
        D3();
    }
}
