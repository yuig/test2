package ai1;

import a11.e;
import a11.n;
import co0.c;
import com.pinterest.api.model.f30;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import di1.g;
import h32.f1;
import h32.u0;
import k11.p;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import nx.b0;
import uj2.q;
import uk1.d;
import x02.i2;
import yk1.r;
import yk1.t;

/* loaded from: classes5.dex */
public final class a extends t {

    /* renamed from: a, reason: collision with root package name */
    public final String f15236a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15237b;

    /* renamed from: c, reason: collision with root package name */
    public final e f15238c;

    /* renamed from: d, reason: collision with root package name */
    public final i2 f15239d;

    /* renamed from: e, reason: collision with root package name */
    public final il1.a f15240e;

    /* renamed from: f, reason: collision with root package name */
    public final w f15241f;

    /* renamed from: g, reason: collision with root package name */
    public final e02.a f15242g;

    /* renamed from: h, reason: collision with root package name */
    public final p f15243h;

    /* renamed from: i, reason: collision with root package name */
    public final b0 f15244i;

    /* renamed from: j, reason: collision with root package name */
    public f30 f15245j;

    /* renamed from: k, reason: collision with root package name */
    public final c f15246k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String pinId, String nullOrBlankUrlErrorMessage, d pinalytics, n clickthroughHelper, q networkStateStream, i2 pinRepo, il1.a fragmentFactory, w eventManager, e02.a boardRouter, p repinUtils, b0 pinAuxHelper) {
        super(pinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(nullOrBlankUrlErrorMessage, "nullOrBlankUrlErrorMessage");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(clickthroughHelper, "clickthroughHelper");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(pinRepo, "pinRepo");
        Intrinsics.checkNotNullParameter(fragmentFactory, "fragmentFactory");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(boardRouter, "boardRouter");
        Intrinsics.checkNotNullParameter(repinUtils, "repinUtils");
        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
        this.f15236a = pinId;
        this.f15237b = nullOrBlankUrlErrorMessage;
        this.f15238c = clickthroughHelper;
        this.f15239d = pinRepo;
        this.f15240e = fragmentFactory;
        this.f15241f = eventManager;
        this.f15242g = boardRouter;
        this.f15243h = repinUtils;
        this.f15244i = pinAuxHelper;
        this.f15246k = new c(this, 1);
    }

    @Override // yk1.b
    public final void onActivate() {
        this.f15239d.L(this.f15236a).s().p(this.f15246k);
    }

    @Override // yk1.p, yk1.b
    /* renamed from: onBind */
    public final void r3(yk1.n nVar) {
        zh1.a view = (zh1.a) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        Intrinsics.checkNotNullParameter(this, "listener");
        ((g) view).f55061j0 = this;
    }

    public final void p3() {
        String uid;
        f30 f30Var = this.f15245j;
        if (f30Var == null || (uid = f30Var.getUid()) == null) {
            return;
        }
        getPinalytics().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.MUSIC_PLAYLIST_ATTRIBUTION, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : uid, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
    }

    @Override // yk1.p
    /* renamed from: onBind */
    public final void r3(r rVar) {
        zh1.a view = (zh1.a) rVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        Intrinsics.checkNotNullParameter(this, "listener");
        ((g) view).f55061j0 = this;
    }
}
