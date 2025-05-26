package sr1;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f extends l {

    /* renamed from: k, reason: collision with root package name */
    public final g f115097k;

    /* renamed from: l, reason: collision with root package name */
    public final String f115098l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g pendingSignupData, String email) {
        super(pendingSignupData.f115099a, null, pendingSignupData.f115100b, 6);
        Intrinsics.checkNotNullParameter(pendingSignupData, "pendingSignupData");
        Intrinsics.checkNotNullParameter(email, "email");
        this.f115097k = pendingSignupData;
        this.f115098l = email;
    }

    @Override // or1.p
    public final String a() {
        return "PendingEmailSignupStrategy";
    }

    @Override // sr1.l
    public final Map c() {
        LinkedHashMap r13 = z0.r(super.c());
        r13.putAll(this.f115097k.f115101c);
        r13.put("email", this.f115098l);
        return r13;
    }
}
