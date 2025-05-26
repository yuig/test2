package oh1;

import android.content.Context;
import android.text.Editable;
import com.pinterest.activity.pin.view.unifiedcomments.NewCommentTextEdit;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.v0;
import h32.f1;
import h32.i0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import nx.d1;
import rh1.v1;
import x02.a2;
import x02.i2;
import x02.p1;

/* loaded from: classes5.dex */
public final class w extends yk1.t implements com.pinterest.feature.unifiedcomments.f, ca2.b {

    /* renamed from: a, reason: collision with root package name */
    public final String f94579a;

    /* renamed from: b, reason: collision with root package name */
    public final String f94580b;

    /* renamed from: c, reason: collision with root package name */
    public final String f94581c;

    /* renamed from: d, reason: collision with root package name */
    public final String f94582d;

    /* renamed from: e, reason: collision with root package name */
    public final String f94583e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f94584f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f94585g;

    /* renamed from: h, reason: collision with root package name */
    public final yk1.v f94586h;

    /* renamed from: i, reason: collision with root package name */
    public final m60.w f94587i;

    /* renamed from: j, reason: collision with root package name */
    public final x02.u f94588j;

    /* renamed from: k, reason: collision with root package name */
    public final p1 f94589k;

    /* renamed from: l, reason: collision with root package name */
    public final d1 f94590l;

    /* renamed from: m, reason: collision with root package name */
    public final i2 f94591m;

    /* renamed from: n, reason: collision with root package name */
    public final qh1.e f94592n;

    /* renamed from: o, reason: collision with root package name */
    public f30 f94593o;

    /* renamed from: p, reason: collision with root package name */
    public rp0.d f94594p;

    /* renamed from: q, reason: collision with root package name */
    public rp0.d f94595q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f94596r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(uk1.d presenterPinalytics, String pinUid, String str, String str2, String str3, String str4, boolean z13, boolean z14, yk1.a viewResources, uj2.q networkStateStream, m60.w eventManager, x02.u aggregatedCommentRepository, p1 didItRepository, d1 trackingParamAttacher, i2 pinRepository, qh1.e commentUtils) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(aggregatedCommentRepository, "aggregatedCommentRepository");
        Intrinsics.checkNotNullParameter(didItRepository, "didItRepository");
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(commentUtils, "commentUtils");
        this.f94579a = pinUid;
        this.f94580b = str;
        this.f94581c = str2;
        this.f94582d = str3;
        this.f94583e = str4;
        this.f94584f = z13;
        this.f94585g = z14;
        this.f94586h = viewResources;
        this.f94587i = eventManager;
        this.f94588j = aggregatedCommentRepository;
        this.f94589k = didItRepository;
        this.f94590l = trackingParamAttacher;
        this.f94591m = pinRepository;
        this.f94592n = commentUtils;
    }

    public static final void p3(w wVar, rp0.d dVar) {
        ((v1) ((com.pinterest.feature.unifiedcomments.g) wVar.getView())).P7();
        wVar.f94596r = true;
        if (wVar.f94585g) {
            f30 f30Var = wVar.f94593o;
            if (dVar == null || f30Var == null) {
                return;
            }
            NavigationImpl L = Navigation.L(v0.b(), b40.g(f30Var), ml1.b.NO_TRANSITION.getValue());
            L.m0("com.pinterest.EXTRA_PIN_ID", f30Var.getUid());
            wy0 n13 = b40.n(f30Var);
            L.m0("com.pinterest.EXTRA_USER_ID", n13 != null ? n13.getUid() : null);
            wy0 n14 = b40.n(f30Var);
            L.m0("com.pinterest.EXTRA_USERNAME", n14 != null ? n14.z4() : null);
            if (wVar.f94595q == null) {
                L.m0("com.pinterest.EXTRA_COMMENT_ID", dVar.v());
                L.m0("com.pinterest.EXTRA_COMMENT_TYPE", dVar.k());
            } else {
                L.m0("com.pinterest.EXTRA_COMMENT_ID", wVar.f94582d);
                L.m0("com.pinterest.EXTRA_COMMENT_TYPE", "aggregatedcomment");
                L.m0("com.pinterest.EXTRA_REPLY_ID", dVar.v());
            }
            wVar.f94587i.d(L);
        }
    }

    @Override // ca2.b
    public final void M0(String str) {
        if (isBound()) {
            ((v1) ((com.pinterest.feature.unifiedcomments.g) getView())).P7();
        }
    }

    @Override // yk1.b
    public final void onCreate() {
        getPresenterPinalytics().f122384f = this.f94590l.c(this.f94579a);
        getPinalytics().U(new i0(getPresenterPinalytics().j(), getPresenterPinalytics().i(), null, getPresenterPinalytics().f(), null, null), f1.COMMENTS_COMPOSER_OPENED, this.f94579a, null, null, false);
    }

    @Override // yk1.b
    public final void onDestroy() {
        if (this.f94596r) {
            return;
        }
        getPinalytics().U(new i0(getPresenterPinalytics().j(), getPresenterPinalytics().i(), null, getPresenterPinalytics().f(), null, null), f1.COMMENTS_COMPOSER_CLOSED_WITHOUT_POST, this.f94579a, null, null, false);
    }

    @Override // yk1.p
    /* renamed from: q3, reason: merged with bridge method [inline-methods] */
    public final void r3(com.pinterest.feature.unifiedcomments.g view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((yk1.r) view);
        v1 v1Var = (v1) view;
        Intrinsics.checkNotNullParameter(this, "listener");
        v1Var.N0 = this;
        int i13 = 1;
        if (!this.f94584f) {
            uj2.q Q = this.f94591m.Q(this.f94579a);
            a aVar = new a(7, new t(this, view, 0));
            a aVar2 = new a(8, l.f94513m);
            ck2.c cVar = ck2.i.f27923c;
            a2 a2Var = ck2.i.f27924d;
            xj2.c F = Q.F(aVar, aVar2, cVar, a2Var);
            Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
            addDisposable(F);
            String str = this.f94580b;
            if (str != null) {
                xj2.c F2 = (Intrinsics.d(this.f94581c, "aggregatedcomment") ? this.f94588j : this.f94589k).L(str).F(new a(9, new t(this, view, i13)), new a(10, l.f94514n), cVar, a2Var);
                Intrinsics.checkNotNullExpressionValue(F2, "subscribe(...)");
                addDisposable(F2);
            } else {
                String str2 = this.f94582d;
                if (str2 != null) {
                    s3(str2, this.f94583e, new t(view, this));
                }
            }
        }
        v1Var.b8().f27252k = this;
        ca2.e.w(v1Var.b8(), 0, null, null, null, 15);
        NewCommentTextEdit newCommentTextEdit = v1Var.f108319v0;
        if (newCommentTextEdit == null) {
            Intrinsics.r("textEdit");
            throw null;
        }
        newCommentTextEdit.requestFocus();
        v1Var.J0.postDelayed(new rh1.p1(v1Var, 1), 500L);
    }

    public final void r3(Context context, Editable editable, String str, String str2) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (editable == null || editable.length() <= 500) {
            t3(context, editable, str, str2, this.f94595q, this.f94594p, false);
        }
    }

    @Override // ca2.b
    public final void s1(float f13, boolean z13) {
        com.pinterest.feature.unifiedcomments.g gVar = (com.pinterest.feature.unifiedcomments.g) getView();
        ((v1) gVar).H0 = f13;
        ((v1) gVar).i8();
    }

    public final void s3(String str, String str2, Function1 function1) {
        xj2.c F = (Intrinsics.d(str2, "aggregatedcomment") ? this.f94588j : this.f94589k).L(str).F(new a(5, new u(0, this, function1)), new a(6, l.f94516p), ck2.i.f27923c, ck2.i.f27924d);
        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
        addDisposable(F);
    }

    public final void t3(Context context, Editable editable, String str, String str2, rp0.d dVar, rp0.d dVar2, boolean z13) {
        f30 f30Var = this.f94593o;
        if (f30Var == null) {
            return;
        }
        if (z13) {
            mf0.l lVar = new mf0.l();
            lVar.q7(((yk1.a) this.f94586h).f139224a.getString(x0.notification_uploading));
            this.f94587i.d(new of0.a(lVar));
        }
        if (dVar2 != null) {
            addDisposable(this.f94592n.e(getPinalytics(), f30Var, editable, dVar2, z13, new k(this, 5), new v(this, 0)));
            return;
        }
        Unit unit = null;
        if (dVar != null) {
            if (editable != null) {
                addDisposable(qh1.e.f(this.f94592n, getPinalytics(), getPresenterPinalytics(), f30Var, editable, dVar, z13, new k(this, 6), new v(this, 1), null, RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER));
                unit = Unit.f80348a;
            }
            if (unit == null) {
                ((v1) ((com.pinterest.feature.unifiedcomments.g) getView())).P7();
                return;
            }
            return;
        }
        if (str != null) {
            if (str2 == null || str2.length() == 0) {
                this.f94592n.p(context, str, new z9.n(this, f30Var, editable, str, z13, 7));
                return;
            }
            addDisposable(qh1.e.c(this.f94592n, getPinalytics(), getPresenterPinalytics(), f30Var, editable, str2, z13, new k(this, 8), new v(this, 3), null, RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER));
            return;
        }
        if (editable != null) {
            addDisposable(qh1.e.c(this.f94592n, getPinalytics(), getPresenterPinalytics(), f30Var, editable, null, z13, new k(this, 9), new v(this, 4), null, RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER));
            unit = Unit.f80348a;
        }
        if (unit == null) {
            ((v1) ((com.pinterest.feature.unifiedcomments.g) getView())).P7();
        }
    }
}
