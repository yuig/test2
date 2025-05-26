package ta1;

import android.content.Intent;
import androidx.recyclerview.widget.b2;
import com.pinterest.api.model.wy0;
import dl1.s;
import fk2.l;
import jk2.k2;
import jk2.v;
import jk2.x;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import l91.g;
import lh0.t3;
import m60.t;
import m60.w;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import q91.h;
import sp2.k;
import sq0.c0;
import va1.m1;
import wk1.i;
import wk1.q;
import x02.x2;

/* loaded from: classes5.dex */
public final class f extends q implements t {

    /* renamed from: a, reason: collision with root package name */
    public final mr1.c f116938a;

    /* renamed from: b, reason: collision with root package name */
    public final x2 f116939b;

    /* renamed from: c, reason: collision with root package name */
    public final lb2.q f116940c;

    /* renamed from: d, reason: collision with root package name */
    public final com.pinterest.identity.authentication.c f116941d;

    /* renamed from: e, reason: collision with root package name */
    public final w f116942e;

    /* renamed from: f, reason: collision with root package name */
    public final cr1.a f116943f;

    /* renamed from: g, reason: collision with root package name */
    public final b60.b f116944g;

    /* renamed from: h, reason: collision with root package name */
    public final bo0.a f116945h;

    /* renamed from: i, reason: collision with root package name */
    public m1 f116946i;

    /* renamed from: j, reason: collision with root package name */
    public wy0 f116947j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(mr1.b activityProvider, uk1.e pinalyticsFactory, uj2.q networkStateStream, x2 userRepository, lb2.q authManager, com.pinterest.identity.authentication.a authNavigationHelper, w eventManager, cr1.a accountService, t3 experiments, b60.b activeUserManager, gz1.b googlePlayServices) {
        super(((uk1.a) pinalyticsFactory).g(), networkStateStream);
        Intrinsics.checkNotNullParameter(activityProvider, "activityProvider");
        Intrinsics.checkNotNullParameter(pinalyticsFactory, "pinalyticsFactory");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(authNavigationHelper, "authNavigationHelper");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(accountService, "accountService");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(googlePlayServices, "googlePlayServices");
        this.f116938a = activityProvider;
        this.f116939b = userRepository;
        this.f116940c = authManager;
        this.f116941d = authNavigationHelper;
        this.f116942e = eventManager;
        this.f116943f = accountService;
        this.f116944g = activeUserManager;
        this.f116945h = new bo0.a(userRepository, experiments, activeUserManager, googlePlayServices);
    }

    @Override // wk1.q
    public final void addDataSources(vq0.a dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        ((i) dataSources).b(this.f116945h);
    }

    @Override // yk1.b
    public final void onActivityResult(int i13, int i14, Intent intent) {
        super.onActivityResult(i13, i14, intent);
        this.f116940c.d(i13, i14, intent);
    }

    @k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull g event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (isBound()) {
            x2 d03 = this.f116939b.d0();
            String uid = com.bumptech.glide.d.Q(this.f116944g).getUid();
            Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
            k2 I = d03.Q(uid).I(1L);
            fa1.c cVar = new fa1.c(21, new d(this, 3));
            ck2.c cVar2 = ck2.i.f27923c;
            int i13 = 1;
            xj2.c F = new x(new v(I, cVar, cVar2, i13), new a(this, 0), i13).F(new fa1.c(22, new d(this, 4)), new fa1.c(23, new d(this, 5)), cVar2, ck2.i.f27924d);
            Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
            addDisposable(F);
        }
    }

    @Override // wk1.q, yk1.p, yk1.b
    public final void onUnbind() {
        this.f116942e.j(this);
        ((ua1.d) ((ra1.a) getView())).C0 = null;
        super.onUnbind();
    }

    @Override // wk1.q
    public final boolean shouldLoadDataOnBind() {
        return false;
    }

    @Override // wk1.q, yk1.p
    /* renamed from: t3, reason: merged with bridge method [inline-methods] */
    public final void r3(ra1.a view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((c0) view);
        Intrinsics.checkNotNullParameter(this, "listener");
        ((ua1.d) view).C0 = this;
        this.f116942e.h(this);
        x2 d03 = this.f116939b.d0();
        String uid = com.bumptech.glide.d.Q(this.f116944g).getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        xj2.c F = d03.Q(uid).I(1L).F(new fa1.c(24, new d(this, 1)), new fa1.c(25, new h(view, 24)), ck2.i.f27923c, ck2.i.f27924d);
        Intrinsics.checkNotNullExpressionValue(F, "subscribe(...)");
        addDisposable(F);
    }

    public final void u3(m1 m1Var, boolean z13) {
        boolean z14 = m1Var instanceof sa1.a;
        cr1.a aVar = this.f116943f;
        uj2.b C = z14 ? aVar.C("gplus/") : m1Var instanceof sa1.b ? aVar.C("line/") : null;
        if (C != null) {
            ek2.f i13 = new l(new fk2.x(C.h(wj2.c.a()).l(tk2.e.f118017c), new fa1.c(26, new d(this, 2)), ck2.i.f27924d, ck2.i.f27923c), new a(this, 1), 0).i(new b(this, m1Var, z13), new fa1.c(27, new y71.b(20, this, m1Var)));
            Intrinsics.checkNotNullExpressionValue(i13, "subscribe(...)");
            addDisposable(i13);
        }
    }

    public final void v3(m1 m1Var, boolean z13) {
        int i13 = 0;
        for (Object obj : CollectionsKt.F0(this.f116945h.f135191h)) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                f0.p();
                throw null;
            }
            s sVar = (s) obj;
            if ((sVar instanceof m1) && Intrinsics.d(sVar, m1Var) && isBound()) {
                ((m1) sVar).f125210e = z13;
                Object adapter = getAdapter();
                if (adapter != null) {
                    ((b2) adapter).i(i13);
                }
            }
            i13 = i14;
        }
    }
}
