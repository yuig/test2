package li1;

import ao2.f0;
import ao2.j0;
import ao2.v0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import h32.f1;
import h32.i0;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import nm.u;
import xk2.v;
import zy.d0;
import zy.e0;
import zy.q0;

/* loaded from: classes5.dex */
public final class m implements l82.g {

    /* renamed from: a, reason: collision with root package name */
    public final x10.d f83568a;

    /* renamed from: b, reason: collision with root package name */
    public final w f83569b;

    /* renamed from: c, reason: collision with root package name */
    public final i92.k f83570c;

    /* renamed from: d, reason: collision with root package name */
    public final j0 f83571d;

    /* renamed from: e, reason: collision with root package name */
    public final f0 f83572e;

    /* renamed from: f, reason: collision with root package name */
    public final f0 f83573f;

    /* renamed from: g, reason: collision with root package name */
    public final v f83574g;

    public m(x10.d settingsApi, w eventManager, i92.k toastUtils, q0 unscopedPinalyticsSEPFactory, j0 applicationScope) {
        ko2.f fVar = v0.f20219a;
        bo2.e mainDispatcher = ((bo2.e) ho2.q.f69782a).f23612f;
        ko2.e iODispatcher = ko2.e.f80326c;
        Intrinsics.checkNotNullParameter(settingsApi, "settingsApi");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        Intrinsics.checkNotNullParameter(unscopedPinalyticsSEPFactory, "unscopedPinalyticsSEPFactory");
        Intrinsics.checkNotNullParameter(applicationScope, "applicationScope");
        Intrinsics.checkNotNullParameter(mainDispatcher, "mainDispatcher");
        Intrinsics.checkNotNullParameter(iODispatcher, "iODispatcher");
        this.f83568a = settingsApi;
        this.f83569b = eventManager;
        this.f83570c = toastUtils;
        this.f83571d = applicationScope;
        this.f83572e = mainDispatcher;
        this.f83573f = iODispatcher;
        this.f83574g = xk2.m.b(new ee1.d(unscopedPinalyticsSEPFactory, 25));
    }

    public static final e0 j(m mVar, o oVar, boolean z13) {
        mVar.getClass();
        i0 z03 = com.bumptech.glide.d.z0(oVar.f83577b, i.f83554k);
        f1 f1Var = f1.WL_SUBMIT;
        HashMap hashMap = new HashMap();
        u uVar = new u();
        uVar.t("is_success", Boolean.valueOf(z13));
        String sVar = uVar.toString();
        Intrinsics.checkNotNullExpressionValue(sVar, "toString(...)");
        hashMap.put("ad_format_extra_data", sVar);
        Unit unit = Unit.f80348a;
        return new e0(new zy.a(z03, f1Var, oVar.f83576a, hashMap, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_ADS_CAROUSEL_PIN_ITEM));
    }

    @Override // l82.g
    public final void e(j0 scope, l82.h hVar, u50.r eventIntake) {
        p request = (p) hVar;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        if (request instanceof o) {
            kotlin.jvm.internal.j.z(this.f83571d, this.f83572e, null, new l(this, request, scope, eventIntake, null), 2);
        } else if (request instanceof n) {
            ((d0) this.f83574g.getValue()).e(scope, ((n) request).f83575a, eventIntake);
        }
    }

    @Override // l82.g
    public final CoroutineContext f(l82.h hVar) {
        p effectRequest = (p) hVar;
        Intrinsics.checkNotNullParameter(effectRequest, "effectRequest");
        ko2.f fVar = v0.f20219a;
        return ((bo2.e) ho2.q.f69782a).f23612f;
    }
}
