package zt;

import ck2.i;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;
import sq0.b0;
import sq0.e0;
import uj2.q;
import x02.i2;
import xt.f;
import yk1.n;
import yk1.r;

/* loaded from: classes3.dex */
public final class d extends vq0.b {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f142759c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final f f142760d;

    /* renamed from: e, reason: collision with root package name */
    public final d f142761e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(uk1.d presenterPinalytics, q networkStateStream, i2 pinRepository, f showcaseManager) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(showcaseManager, "showcaseManager");
        this.f142760d = showcaseManager;
        this.f126436a.j(RecyclerViewTypes.VIEW_TYPE_SHOWCASE_SUBPAGE_ITEM, new e(showcaseManager, 0));
        this.f142761e = this;
    }

    public final void D3(yu.f fVar) {
        super.r3(fVar);
        xj2.c F = this.f142760d.f135875r.F(new st.c(29, new hs.a(11, fVar, this)), new b(0, c.f142758i), i.f27923c, i.f27924d);
        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
        addDisposable(F);
    }

    public final void F3(zu.c cVar) {
        super.r3(cVar);
        xj2.c F = this.f142760d.f135875r.F(new b(1, new hs.a(12, this, cVar)), new b(2, au.a.f20463j), i.f27923c, i.f27924d);
        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
        addDisposable(F);
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        switch (this.f142759c) {
            case 0:
                return RecyclerViewTypes.VIEW_TYPE_SHOWCASE_SUBPAGE_ITEM;
            default:
                return RecyclerViewTypes.VIEW_TYPE_SHOWCASE_SUBPIN_ITEM;
        }
    }

    @Override // vq0.g, yk1.p, yk1.b
    /* renamed from: onBind */
    public final /* bridge */ /* synthetic */ void r3(n nVar) {
        switch (this.f142759c) {
            case 0:
                D3((yu.f) nVar);
                break;
            default:
                F3((zu.c) nVar);
                break;
        }
    }

    @Override // vq0.g, yk1.p, yk1.b
    public final void onUnbind() {
        switch (this.f142759c) {
            case 0:
                clearDisposables();
                super.onUnbind();
                break;
            default:
                clearDisposables();
                super.onUnbind();
                break;
        }
    }

    @Override // vq0.g
    public final e0 p3() {
        return this.f142761e;
    }

    @Override // vq0.g
    public final /* bridge */ /* synthetic */ void r3(b0 b0Var) {
        switch (this.f142759c) {
            case 0:
                D3((yu.f) b0Var);
                break;
            default:
                F3((zu.c) b0Var);
                break;
        }
    }

    @Override // vq0.g, yk1.p
    /* renamed from: onBind */
    public final /* bridge */ /* synthetic */ void r3(r rVar) {
        switch (this.f142759c) {
            case 0:
                D3((yu.f) rVar);
                break;
            default:
                F3((zu.c) rVar);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(uk1.d presenterPinalytics, q networkStateStream, f showcaseManager) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(showcaseManager, "showcaseManager");
        this.f142760d = showcaseManager;
        this.f126436a.j(RecyclerViewTypes.VIEW_TYPE_SHOWCASE_SUBPIN_ITEM, new e(showcaseManager, 1));
        this.f142761e = this;
    }
}
