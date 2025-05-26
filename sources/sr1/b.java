package sr1;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* loaded from: classes4.dex */
public final class b extends l {

    /* renamed from: k, reason: collision with root package name */
    public final String f115082k;

    /* renamed from: l, reason: collision with root package name */
    public final String f115083l;

    /* renamed from: m, reason: collision with root package name */
    public final String f115084m;

    /* renamed from: n, reason: collision with root package name */
    public final long f115085n;

    /* renamed from: o, reason: collision with root package name */
    public final String f115086o;

    /* renamed from: p, reason: collision with root package name */
    public final Boolean f115087p;

    /* renamed from: q, reason: collision with root package name */
    public final Boolean f115088q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String password, String firstName, String lastName, String email, long j13, String businessName, Boolean bool, Boolean bool2) {
        super("partner/", password, qr1.j.f105010b, 4);
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(businessName, "businessName");
        this.f115082k = firstName;
        this.f115083l = lastName;
        this.f115084m = email;
        this.f115085n = j13;
        this.f115086o = businessName;
        this.f115087p = bool;
        this.f115088q = bool2;
    }

    @Override // or1.p
    public final String a() {
        return "BusinessSignup";
    }

    @Override // sr1.l
    public final Map c() {
        List split$default;
        LinkedHashMap r13 = z0.r(super.c());
        r13.put("email", this.f115084m);
        r13.put("first_name", this.f115082k);
        r13.put("last_name", this.f115083l);
        r13.put("birthday", String.valueOf(this.f115085n));
        split$default = StringsKt__StringsKt.split$default(this.f115086o, new String[]{" "}, false, 0, 6, null);
        r13.put("business_name", CollectionsKt.Z(split$default, " ", null, null, 0, null, a.f115081i, 30));
        Boolean bool = this.f115087p;
        if (bool != null) {
            r13.put("kr_privacy_consent_opt_in", String.valueOf(bool.booleanValue()));
        }
        Boolean bool2 = this.f115088q;
        if (bool2 != null) {
            r13.put("marketing_notifs_opt_out", String.valueOf(bool2.booleanValue()));
        }
        return z0.n(r13);
    }
}
