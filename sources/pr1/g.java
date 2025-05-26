package pr1;

import com.google.android.gms.ads.AdError;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.y0;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class g extends f {

    /* renamed from: h, reason: collision with root package name */
    public final String f101194h;

    /* renamed from: i, reason: collision with root package name */
    public final String f101195i;

    /* renamed from: j, reason: collision with root package name */
    public final String f101196j;

    /* renamed from: k, reason: collision with root package name */
    public final String f101197k;

    /* renamed from: l, reason: collision with root package name */
    public final String f101198l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(String authToken, String expiration, String userId, String stored, String str) {
        super("secure/", false, qr1.j.f105010b);
        Intrinsics.checkNotNullParameter(authToken, "authToken");
        Intrinsics.checkNotNullParameter(expiration, "expiration");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(stored, "stored");
        this.f101194h = authToken;
        this.f101195i = expiration;
        this.f101196j = userId;
        this.f101197k = stored;
        this.f101198l = str;
    }

    @Override // or1.p
    public final String a() {
        return "SecureLogin";
    }

    @Override // pr1.f
    public final Map c() {
        LinkedHashMap r13 = z0.r(super.c());
        r13.put("token", this.f101194h);
        r13.put("expiration", this.f101195i);
        r13.put("user_id", this.f101196j);
        r13.put("stored", this.f101197k);
        String str = this.f101198l;
        if (str != null) {
            r13.put("login_type", str);
        }
        return z0.n(r13);
    }

    @Override // pr1.f
    public final Map d() {
        String str = this.f101198l;
        if (str == null) {
            str = AdError.UNDEFINED_DOMAIN;
        }
        return y0.b(new Pair("login_type", str));
    }
}
