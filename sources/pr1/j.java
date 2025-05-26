package pr1;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import qr1.m;

/* loaded from: classes4.dex */
public final class j extends f {

    /* renamed from: h, reason: collision with root package name */
    public final Map f101204h;

    /* renamed from: i, reason: collision with root package name */
    public final String f101205i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Map requestParams, String multiFactorToken, m authority, boolean z13) {
        super("mfa/", z13, authority);
        Intrinsics.checkNotNullParameter(requestParams, "requestParams");
        Intrinsics.checkNotNullParameter(multiFactorToken, "multiFactorToken");
        Intrinsics.checkNotNullParameter(authority, "authority");
        this.f101204h = requestParams;
        this.f101205i = multiFactorToken;
    }

    @Override // or1.p
    public final String a() {
        return "TwoFactorLoginStrategy";
    }

    @Override // pr1.f
    public final Map c() {
        LinkedHashMap r13 = z0.r(super.c());
        r13.putAll(this.f101204h);
        r13.put("mfa_token", this.f101205i);
        return z0.n(r13);
    }
}
