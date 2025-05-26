package dv0;

import com.pinterest.api.model.f30;
import h32.d4;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import so.k8;
import x02.i2;
import x02.x2;
import yk1.r;

/* loaded from: classes5.dex */
public final class d extends yk1.p implements av0.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f56312a;

    /* renamed from: b, reason: collision with root package name */
    public final String f56313b;

    /* renamed from: c, reason: collision with root package name */
    public final i2 f56314c;

    /* renamed from: d, reason: collision with root package name */
    public final x2 f56315d;

    /* renamed from: e, reason: collision with root package name */
    public final k8 f56316e;

    /* renamed from: f, reason: collision with root package name */
    public f30 f56317f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String str, String str2, i2 pinRepository, x2 userRepository, uk1.d pinAnalytics, uj2.q networkStream, k8 paidPartnershipDelegateFactory) {
        super(pinAnalytics, networkStream);
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(pinAnalytics, "pinAnalytics");
        Intrinsics.checkNotNullParameter(networkStream, "networkStream");
        Intrinsics.checkNotNullParameter(paidPartnershipDelegateFactory, "paidPartnershipDelegateFactory");
        this.f56312a = str;
        this.f56313b = str2;
        this.f56314c = pinRepository;
        this.f56315d = userRepository;
        this.f56316e = paidPartnershipDelegateFactory;
    }

    @Override // yk1.p
    public final void bindPinalytics(r rVar) {
        av0.b view = (av0.b) rVar;
        Intrinsics.checkNotNullParameter(view, "view");
        uk1.d presenterPinalytics = getPresenterPinalytics();
        ((ev0.d) view).getClass();
        presenterPinalytics.c(null, d4.IDEA_PIN_PAID_PARTNERSHIP_EDIT, null);
    }

    @Override // yk1.p
    /* renamed from: p3, reason: merged with bridge method [inline-methods] */
    public final void r3(av0.b view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        String str = this.f56312a;
        if (str != null) {
            uj2.q L = this.f56314c.L(str);
            String str2 = this.f56313b;
            addDisposable(uj2.q.P(L, str2 != null ? this.f56315d.L(str2) : null, new ep.g(11, a.f56295i)).H(wj2.c.a()).F(new mu0.a(11, new b(1, this, d.class, "setData", "setData(Lcom/pinterest/api/model/Pin;)V", 0)), new mu0.a(12, c.f56296j), ck2.i.f27923c, ck2.i.f27924d));
        }
        Intrinsics.checkNotNullParameter(this, "listener");
        ((ev0.d) view).f60246l0 = this;
    }

    public final void q3() {
        xj2.b bVar = new xj2.b();
        android.support.v4.media.a a13 = this.f56316e.a(getPinalytics());
        f30 f30Var = this.f56317f;
        String b23 = bs1.c.b2(aq1.h.idea_pin_remove_partner_alert_message);
        Intrinsics.checkNotNullExpressionValue(b23, "string(...)");
        a13.i(f30Var, b23, bVar, true);
        Unit unit = Unit.f80348a;
        addDisposable(bVar);
    }

    @Override // yk1.p
    public final void unbindPinalytics() {
        getPresenterPinalytics().k();
    }
}
