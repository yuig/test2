package sr1;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c extends l {

    /* renamed from: k, reason: collision with root package name */
    public final String f115089k;

    /* renamed from: l, reason: collision with root package name */
    public final String f115090l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str, String googleIdToken) {
        super("google_open_id/", null, qr1.h.f105005b, 6);
        Intrinsics.checkNotNullParameter(googleIdToken, "googleIdToken");
        this.f115089k = str;
        this.f115090l = googleIdToken;
    }

    @Override // or1.p
    public final String a() {
        return "GoogleOneTapSignup";
    }

    @Override // sr1.l
    public final Map c() {
        LinkedHashMap r13 = z0.r(super.c());
        String str = this.f115089k;
        if (str == null) {
            str = "";
        }
        r13.put("first_name", str);
        r13.put("google_open_id_token", this.f115090l);
        return z0.n(r13);
    }
}
