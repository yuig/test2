package gr1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i extends d {

    /* renamed from: g, reason: collision with root package name */
    public final String f66010g;

    /* renamed from: h, reason: collision with root package name */
    public final String f66011h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(String idToken, String accessToken) {
        super(qr1.i.f105009b, "line/", null);
        Intrinsics.checkNotNullParameter(idToken, "idToken");
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        this.f66010g = idToken;
        this.f66011h = accessToken;
    }

    @Override // or1.p
    public final String a() {
        return "LineConnection";
    }

    @Override // gr1.d
    public final Map c() {
        LinkedHashMap r13 = z0.r(new HashMap());
        r13.put("line_id_token", this.f66010g);
        r13.put("line_access_token", this.f66011h);
        return z0.n(r13);
    }
}
