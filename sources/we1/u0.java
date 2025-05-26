package we1;

import android.content.Context;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.v7;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u0 extends r0 {

    /* renamed from: m, reason: collision with root package name */
    public final Boolean f129629m;

    /* renamed from: n, reason: collision with root package name */
    public final qa2.a1 f129630n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(Context context, nx.d0 pinalytics, h32.g0 g0Var, HashMap hashMap, ao2.j0 scope, Boolean bool) {
        super(context, scope, pinalytics, hashMap);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f129629m = bool;
        qa2.a1 a1Var = new qa2.a1(context, pinalytics, g0Var, hashMap);
        a1Var.B = new androidx.appcompat.widget.q(this, 0);
        a1Var.q(this.f129593j.getCornerRadius());
        this.f129630n = a1Var;
        addView(a1Var);
    }

    @Override // we1.r0
    public final void a(int i13, f30 pin, wa2.m config) {
        f30 f30Var;
        String j13;
        gb2.d aVar;
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(config, "config");
        super.a(i13, pin, config);
        qa2.a1 a1Var = this.f129630n;
        a1Var.t(pin, i13);
        if (!Intrinsics.d(this.f129629m, Boolean.TRUE) || (f30Var = a1Var.f103228w) == null) {
            return;
        }
        String uid = f30Var.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        wa2.a0 a0Var = wa2.a0.PIN_GRID_SAVED_OVERLAY_STATE_VISIBLE;
        v7 D3 = f30Var.D3();
        if (D3 == null || !kh2.d.J0(D3)) {
            v7 D32 = f30Var.D3();
            j13 = D32 != null ? D32.j1() : null;
            if (j13 == null) {
                j13 = "";
            }
        } else {
            j13 = a1Var.getResources().getString(m60.x0.profile);
            Intrinsics.f(j13);
        }
        v7 D33 = f30Var.D3();
        if (D33 == null || !kh2.d.J0(D33)) {
            v7 D34 = f30Var.D3();
            String uid2 = D34 != null ? D34.getUid() : null;
            String boardUid = uid2 != null ? uid2 : "";
            Intrinsics.checkNotNullParameter(boardUid, "boardUid");
            aVar = new gb2.a(boardUid);
        } else {
            String userUid = b40.H(f30Var);
            Intrinsics.checkNotNullParameter(userUid, "userUid");
            aVar = new gb2.c(userUid);
        }
        a1Var.n(new gb2.k(uid, a0Var, j13, aVar));
        a1Var.o();
    }
}
