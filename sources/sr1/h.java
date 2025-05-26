package sr1;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class h extends l {

    /* renamed from: k, reason: collision with root package name */
    public final String f115102k;

    /* renamed from: l, reason: collision with root package name */
    public final String f115103l;

    /* renamed from: m, reason: collision with root package name */
    public final String f115104m;

    /* renamed from: n, reason: collision with root package name */
    public final long f115105n;

    /* renamed from: o, reason: collision with root package name */
    public final Boolean f115106o;

    /* renamed from: p, reason: collision with root package name */
    public final Boolean f115107p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(String firstName, String lastName, String email, long j13, String password, Boolean bool, Boolean bool2) {
        super("email/", password, qr1.j.f105010b, 4);
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(password, "password");
        this.f115102k = firstName;
        this.f115103l = lastName;
        this.f115104m = email;
        this.f115105n = j13;
        this.f115106o = bool;
        this.f115107p = bool2;
    }

    @Override // or1.p
    public final String a() {
        return "PinterestSignup";
    }

    @Override // sr1.l
    public final Map c() {
        LinkedHashMap r13 = z0.r(super.c());
        r13.put("email", this.f115104m);
        r13.put("first_name", this.f115102k);
        r13.put("last_name", this.f115103l);
        r13.put("birthday", String.valueOf(this.f115105n));
        Boolean bool = this.f115106o;
        if (bool != null) {
            r13.put("kr_privacy_consent_opt_in", String.valueOf(bool.booleanValue()));
        }
        Boolean bool2 = this.f115107p;
        if (bool2 != null) {
            r13.put("marketing_notifs_opt_out", String.valueOf(bool2.booleanValue()));
        }
        return z0.n(r13);
    }
}
