package sr1;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class i extends l {

    /* renamed from: k, reason: collision with root package name */
    public final String f115108k;

    /* renamed from: l, reason: collision with root package name */
    public final String f115109l;

    /* renamed from: m, reason: collision with root package name */
    public final String f115110m;

    /* renamed from: n, reason: collision with root package name */
    public final String f115111n;

    /* renamed from: o, reason: collision with root package name */
    public final String f115112o;

    /* renamed from: p, reason: collision with root package name */
    public final String f115113p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(String businessName, String email, String firstName, String ssoIdToken, String ssoId, String ssoProviderEmail) {
        super("sso/", null, qr1.k.f105011b, 6);
        Intrinsics.checkNotNullParameter(businessName, "businessName");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(ssoIdToken, "ssoIdToken");
        Intrinsics.checkNotNullParameter(ssoId, "ssoId");
        Intrinsics.checkNotNullParameter(ssoProviderEmail, "ssoProviderEmail");
        this.f115108k = businessName;
        this.f115109l = email;
        this.f115110m = firstName;
        this.f115111n = ssoIdToken;
        this.f115112o = ssoId;
        this.f115113p = ssoProviderEmail;
    }

    @Override // or1.p
    public final String a() {
        return "SSOSignup";
    }

    @Override // sr1.l
    public final Map c() {
        LinkedHashMap r13 = z0.r(super.c());
        r13.put("business_name", this.f115108k);
        r13.put("email", this.f115109l);
        r13.put("first_name", this.f115110m);
        r13.put("sso_id_token", this.f115111n);
        r13.put("sso_id", this.f115112o);
        r13.put("sso_email", this.f115113p);
        return z0.n(r13);
    }
}
