package sr1;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e extends l {

    /* renamed from: k, reason: collision with root package name */
    public final g f115093k;

    /* renamed from: l, reason: collision with root package name */
    public final long f115094l;

    /* renamed from: m, reason: collision with root package name */
    public final Boolean f115095m;

    /* renamed from: n, reason: collision with root package name */
    public final Boolean f115096n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g pendingSignupData, long j13, Boolean bool, Boolean bool2) {
        super(pendingSignupData.f115099a, null, pendingSignupData.f115100b, 6);
        Intrinsics.checkNotNullParameter(pendingSignupData, "pendingSignupData");
        this.f115093k = pendingSignupData;
        this.f115094l = j13;
        this.f115095m = bool;
        this.f115096n = bool2;
    }

    @Override // or1.p
    public final String a() {
        return "PendingAgeSignupStrategy";
    }

    @Override // sr1.l
    public final Map c() {
        LinkedHashMap r13 = z0.r(super.c());
        r13.putAll(this.f115093k.f115101c);
        r13.put("birthday", String.valueOf(this.f115094l));
        Boolean bool = this.f115095m;
        if (bool != null) {
            r13.put("kr_privacy_consent_opt_in", String.valueOf(bool.booleanValue()));
        }
        Boolean bool2 = this.f115096n;
        if (bool2 != null) {
            r13.put("marketing_notifs_opt_out", String.valueOf(bool2.booleanValue()));
        }
        return z0.n(r13);
    }
}
