package sr1;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d extends l {

    /* renamed from: k, reason: collision with root package name */
    public final String f115091k;

    /* renamed from: l, reason: collision with root package name */
    public final String f115092l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String idToken, String accessToken) {
        super("line/", null, qr1.i.f105009b, 6);
        Intrinsics.checkNotNullParameter(idToken, "idToken");
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        this.f115091k = idToken;
        this.f115092l = accessToken;
    }

    @Override // or1.p
    public final String a() {
        return "LineSignup";
    }

    @Override // sr1.l
    public final Map c() {
        LinkedHashMap r13 = z0.r(super.c());
        r13.put("line_id_token", this.f115091k);
        r13.put("line_access_token", this.f115092l);
        return z0.n(r13);
    }
}
