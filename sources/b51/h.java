package b51;

import a41.u;
import com.pinterest.api.model.wy0;
import h32.f1;
import h32.i0;
import i92.k;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import uj2.b0;
import uj2.q;
import x02.x2;
import yk1.n;
import yk1.r;
import yk1.t;
import yk1.v;

/* loaded from: classes5.dex */
public final class h extends t implements b {

    /* renamed from: a, reason: collision with root package name */
    public final String f22005a;

    /* renamed from: b, reason: collision with root package name */
    public final x2 f22006b;

    /* renamed from: c, reason: collision with root package name */
    public final k f22007c;

    /* renamed from: d, reason: collision with root package name */
    public final v f22008d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(String userId, x2 userRepository, k toastUtils, v viewResources, q networkStateStream, uk1.d presenterPinalytics) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        this.f22005a = userId;
        this.f22006b = userRepository;
        this.f22007c = toastUtils;
        this.f22008d = viewResources;
        d0 d0Var = presenterPinalytics.f122379a;
        Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
        i0 generateLoggingContext = presenterPinalytics.generateLoggingContext();
        f1 f1Var = f1.USER_PROFILE_OVERFLOW_ACTIONS_REPORT_SPAM;
        HashMap x13 = a.a.x("reportee_id", userId, "reason", "spam");
        Unit unit = Unit.f80348a;
        d0Var.U(generateLoggingContext, f1Var, null, null, x13, false);
    }

    @Override // yk1.p, yk1.b
    /* renamed from: onBind */
    public final void r3(n nVar) {
        c view = (c) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        Intrinsics.checkNotNullParameter(this, "listener");
        ((e) view).f22000n0 = this;
    }

    public final void p3() {
        x2 x2Var = this.f22006b;
        String str = this.f22005a;
        wy0 user = (wy0) x2Var.O(str);
        if (user != null) {
            Intrinsics.checkNotNullParameter(user, "user");
            String uid = user.getUid();
            Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
            String z43 = user.z4();
            if (z43 == null) {
                z43 = "";
            }
            b0 k13 = x2Var.l0(user, new k22.e(uid, z43)).k();
            Intrinsics.checkNotNullExpressionValue(k13, "toSingle(...)");
            k13.o(new u(21, new g(this, 0)), new u(22, new g(this, 1)));
        }
        if (isBound()) {
            ((e) ((c) getView())).D5();
        }
        d0 d0Var = getPresenterPinalytics().f122379a;
        Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
        i0 generateLoggingContext = getPresenterPinalytics().generateLoggingContext();
        f1 f1Var = f1.USER_PROFILE_OVERFLOW_ACTIONS_REPORT_SPAM_CONFIRM;
        HashMap x13 = a.a.x("reportee_id", str, "reason", "spam");
        Unit unit = Unit.f80348a;
        d0Var.U(generateLoggingContext, f1Var, null, null, x13, false);
    }

    @Override // yk1.p
    /* renamed from: onBind */
    public final void r3(r rVar) {
        c view = (c) rVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((r) view);
        Intrinsics.checkNotNullParameter(this, "listener");
        ((e) view).f22000n0 = this;
    }
}
