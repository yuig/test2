package c21;

import b60.b;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lh0.k2;
import m60.g0;
import m60.w;
import pk.a0;
import sq0.c0;
import tv1.j;
import uk1.d;
import vv1.l;
import vv1.m;
import wk1.e;
import wk1.i;
import wk1.q;
import yk1.n;
import yk1.r;

/* loaded from: classes5.dex */
public final class a extends q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25478a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f25479b;

    /* renamed from: c, reason: collision with root package name */
    public final e f25480c;

    public /* synthetic */ a(String str, yk1.a aVar, b bVar, uj2.q qVar, g0 g0Var, d dVar) {
        this(str, aVar, bVar, qVar, g0Var, dVar, null);
    }

    @Override // wk1.q
    public final void addDataSources(vq0.a dataSources) {
        int i13 = this.f25478a;
        e eVar = this.f25480c;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(dataSources, "dataSources");
                ((i) dataSources).b((ov0.b) eVar);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(dataSources, "dataSources");
                ((i) dataSources).b((ic1.b) eVar);
                break;
            default:
                Intrinsics.checkNotNullParameter(dataSources, "dataSources");
                ((i) dataSources).b((j) eVar);
                break;
        }
    }

    @Override // wk1.q
    /* renamed from: onBind */
    public final /* bridge */ /* synthetic */ void r3(c0 c0Var) {
        switch (this.f25478a) {
            case 2:
                t3((l) c0Var);
                break;
            default:
                super.r3(c0Var);
                break;
        }
    }

    public final void t3(l view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((c0) view);
        m mVar = (m) this.f25479b;
        Function0 searchParametersProvider = mVar.f126789l;
        uv1.q qVar = (uv1.q) view;
        Intrinsics.checkNotNullParameter(searchParametersProvider, "searchParametersProvider");
        qVar.B0.n(new com.pinterest.feature.newshub.b(qVar.s7(), searchParametersProvider));
        String titleText = mVar.f126785h;
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        GestaltText gestaltText = qVar.D0;
        if (gestaltText != null) {
            a0.p(gestaltText, titleText);
        } else {
            Intrinsics.r("titleView");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String pinId, yk1.a viewResources, b activeUserManager, uj2.q networkStateStream, g0 pageSizeProvider, d presenterPinalytics, ov0.b bVar) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(pageSizeProvider, "pageSizeProvider");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        this.f25479b = pinId;
        this.f25480c = bVar == null ? new ov0.b(pinId, pageSizeProvider, viewResources, activeUserManager) : bVar;
    }

    @Override // wk1.q, yk1.p, yk1.b
    /* renamed from: onBind */
    public final /* bridge */ /* synthetic */ void r3(n nVar) {
        switch (this.f25478a) {
            case 2:
                t3((l) nVar);
                break;
            default:
                super.r3(nVar);
                break;
        }
    }

    @Override // wk1.q, yk1.p
    /* renamed from: onBind */
    public final /* bridge */ /* synthetic */ void r3(r rVar) {
        switch (this.f25478a) {
            case 2:
                t3((l) rVar);
                break;
            default:
                super.r3(rVar);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d pinalytics, j20.a countryService, uj2.q networkStateStream) {
        super(pinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(countryService, "countryService");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        this.f25479b = countryService;
        this.f25480c = new ic1.b(countryService);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d presenterPinalytics, uj2.q networkStateStream, m viewModel, z61.b searchPWTManager, w eventManager, k2 oneBarLibraryExperiments) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(searchPWTManager, "searchPWTManager");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(oneBarLibraryExperiments, "oneBarLibraryExperiments");
        this.f25479b = viewModel;
        this.f25480c = new j(viewModel.f126786i, viewModel.f126787j, viewModel.f126788k, searchPWTManager, viewModel.f126789l, presenterPinalytics, eventManager, viewModel.f126790m, viewModel.f126791n, oneBarLibraryExperiments);
    }
}
