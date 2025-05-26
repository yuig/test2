package pr1;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import qr1.k;

/* loaded from: classes4.dex */
public final class i extends f {

    /* renamed from: h, reason: collision with root package name */
    public final String f101202h;

    /* renamed from: i, reason: collision with root package name */
    public final String f101203i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(String email, String authCode) {
        super("sso/", false, k.f105011b);
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(authCode, "authCode");
        this.f101202h = email;
        this.f101203i = authCode;
    }

    @Override // or1.p
    public final String a() {
        return "SSOLogin";
    }

    @Override // pr1.f
    public final Map c() {
        LinkedHashMap r13 = z0.r(super.c());
        r13.put("user_email", this.f101202h);
        r13.put("auth_code", this.f101203i);
        return z0.n(r13);
    }
}
