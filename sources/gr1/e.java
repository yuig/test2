package gr1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e extends d {

    /* renamed from: g, reason: collision with root package name */
    public final String f66002g;

    /* renamed from: h, reason: collision with root package name */
    public final String f66003h;

    /* renamed from: i, reason: collision with root package name */
    public final String f66004i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String token, String tokenSecret, String verifier) {
        super(qr1.e.f104994b, "etsy/", null);
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(tokenSecret, "tokenSecret");
        Intrinsics.checkNotNullParameter(verifier, "verifier");
        this.f66002g = token;
        this.f66003h = tokenSecret;
        this.f66004i = verifier;
    }

    @Override // or1.p
    public final String a() {
        return "EtsyConnection";
    }

    @Override // gr1.d
    public final Map c() {
        LinkedHashMap r13 = z0.r(new HashMap());
        r13.put("oauth_token", this.f66002g);
        r13.put("oauth_token_secret", this.f66003h);
        r13.put("oauth_verifier", this.f66004i);
        return z0.n(r13);
    }
}
