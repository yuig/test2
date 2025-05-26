package gr1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f extends d {

    /* renamed from: g, reason: collision with root package name */
    public final String f66005g;

    /* renamed from: h, reason: collision with root package name */
    public final String f66006h;

    /* renamed from: i, reason: collision with root package name */
    public final String f66007i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String id3, String token, String scope) {
        super(qr1.f.f104999b, "facebook/", id3);
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f66005g = id3;
        this.f66006h = token;
        this.f66007i = scope;
    }

    @Override // or1.p
    public final String a() {
        return "FacebookConnection";
    }

    @Override // gr1.d
    public final Map c() {
        LinkedHashMap r13 = z0.r(new HashMap());
        r13.put("facebook_id", this.f66005g);
        r13.put("facebook_token", this.f66006h);
        r13.put("facebook_scope", this.f66007i);
        return z0.n(r13);
    }
}
