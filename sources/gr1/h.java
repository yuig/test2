package gr1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class h extends d {

    /* renamed from: g, reason: collision with root package name */
    public final String f66009g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(String googleId, String accessToken) {
        super(qr1.h.f105005b, "gplus/", googleId);
        Intrinsics.checkNotNullParameter(googleId, "googleId");
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        this.f66009g = accessToken;
    }

    @Override // or1.p
    public final String a() {
        return "GoogleIdConnection";
    }

    @Override // gr1.d
    public final Map c() {
        LinkedHashMap r13 = z0.r(new HashMap());
        r13.put("id_token", this.f66009g);
        return z0.n(r13);
    }
}
