package k11;

import a.k1;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.wy0;
import kotlin.jvm.internal.Intrinsics;
import uj2.b0;
import x02.x2;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final i92.k f78140a;

    /* renamed from: b, reason: collision with root package name */
    public final x2 f78141b;

    /* renamed from: c, reason: collision with root package name */
    public final b60.b f78142c;

    public h(i92.k toastUtils, x2 userRepository, b60.b activeUserManager) {
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        this.f78140a = toastUtils;
        this.f78141b = userRepository;
        this.f78142c = activeUserManager;
    }

    public final b0 a(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        wy0 n13 = b40.n(pin);
        uj2.n nVar = null;
        String uid = n13 != null ? n13.getUid() : null;
        if (uid != null && uid.length() != 0) {
            nVar = this.f78141b.M(uid);
        } else if (pin.t5() == null) {
            nVar = new hk2.p(new k1(pin, 15));
        }
        if (nVar == null) {
            return b0.j(Boolean.FALSE);
        }
        hk2.b0 b0Var = new hk2.b0(new hk2.k(new hk2.h(nVar, new wv0.a(23, new g(this, pin, 0)), 1), new wv0.a(24, new g(this, pin, 1)), 1), Boolean.FALSE, 1);
        Intrinsics.checkNotNullExpressionValue(b0Var, "toSingle(...)");
        return b0Var;
    }
}
