package pr1;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c extends f {

    /* renamed from: h, reason: collision with root package name */
    public final String f101183h;

    /* renamed from: i, reason: collision with root package name */
    public final String f101184i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String idToken, String accessToken) {
        super("line/", false, qr1.i.f105009b);
        Intrinsics.checkNotNullParameter(idToken, "idToken");
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        this.f101183h = idToken;
        this.f101184i = accessToken;
    }

    @Override // or1.p
    public final String a() {
        return "LineLogin";
    }

    @Override // pr1.f
    public final Map c() {
        LinkedHashMap r13 = z0.r(super.c());
        r13.put("line_id_token", this.f101183h);
        r13.put("line_access_token", this.f101184i);
        return z0.n(r13);
    }
}
