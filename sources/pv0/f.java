package pv0;

import com.google.android.gms.internal.measurement.x;
import com.pinterest.api.model.zq;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import dl1.l;
import dl1.t;
import go0.r;
import i92.k;
import kh2.g0;
import kh2.s0;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import nv0.g;
import nv0.m;
import om0.m1;
import qv0.j;
import wk1.i;
import wk1.q;

/* loaded from: classes5.dex */
public final class f extends q implements nv0.b {

    /* renamed from: a, reason: collision with root package name */
    public final t f101461a;

    /* renamed from: b, reason: collision with root package name */
    public final x f101462b;

    /* renamed from: c, reason: collision with root package name */
    public final ag1.b f101463c;

    /* renamed from: d, reason: collision with root package name */
    public final w f101464d;

    /* renamed from: e, reason: collision with root package name */
    public final nt0.d f101465e;

    /* renamed from: f, reason: collision with root package name */
    public final k f101466f;

    /* renamed from: g, reason: collision with root package name */
    public final ov0.a f101467g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String categoryId, du0.b presenterPinalytics, t storyPinLocalDataRepository, x recentlyUsedStickersDataProvider, ag1.b dataManager, w eventManager, uj2.q networkStateStream, nt0.d animatedStickerRepository, k toastUtils) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(categoryId, "categoryId");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(storyPinLocalDataRepository, "storyPinLocalDataRepository");
        Intrinsics.checkNotNullParameter(recentlyUsedStickersDataProvider, "recentlyUsedStickersDataProvider");
        Intrinsics.checkNotNullParameter(dataManager, "dataManager");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(animatedStickerRepository, "animatedStickerRepository");
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        this.f101461a = storyPinLocalDataRepository;
        this.f101462b = recentlyUsedStickersDataProvider;
        this.f101463c = dataManager;
        this.f101464d = eventManager;
        this.f101465e = animatedStickerRepository;
        this.f101466f = toastUtils;
        this.f101467g = new ov0.a(categoryId, this);
    }

    public static final void t3(f fVar, zq zqVar, String str) {
        fVar.getClass();
        Boolean w13 = zqVar.w();
        Intrinsics.checkNotNullExpressionValue(w13, "getShouldShowColorPickerAfterSelection(...)");
        if (w13.booleanValue()) {
            fVar.f101464d.d(new hv0.e(str));
        }
        ((j) ((m) fVar.getView())).z(qv0.d.f105167n);
    }

    @Override // nv0.b
    public final void L2(ig1.b action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof g) {
            zq zqVar = ((g) action).f92357b;
            if (!g0.e0(zqVar)) {
                u3(zqVar, new c(this, 2));
                return;
            }
            GestaltSpinner gestaltSpinner = ((j) ((m) getView())).D0;
            if (gestaltSpinner == null) {
                Intrinsics.r("overlayLoadingView");
                throw null;
            }
            s0.w(gestaltSpinner, qv0.d.f105168o);
            this.f101465e.a(zqVar, new m1(21, this, action), new au0.a(this, 10));
        }
    }

    @Override // wk1.q
    public final void addDataSources(vq0.a dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        ((i) dataSources).b(this.f101467g);
    }

    public final void u3(zq zqVar, c cVar) {
        addDisposable(((l) this.f101461a).P(this.f101463c.d()).F(new e(0, new r(zqVar, this, cVar, 26)), new e(1, b.f101437o), ck2.i.f27923c, ck2.i.f27924d));
        String uid = zqVar.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        this.f101462b.g(uid).l(wj2.c.a()).o(new e(2, b.f101438p), new e(3, b.f101439q));
    }
}
