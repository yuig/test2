package pr1;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b extends f {

    /* renamed from: h, reason: collision with root package name */
    public final String f101182h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String idToken) {
        super("google_open_id/", false, qr1.h.f105005b);
        Intrinsics.checkNotNullParameter(idToken, "idToken");
        this.f101182h = idToken;
    }

    @Override // or1.p
    public final String a() {
        return "GoogleOneTapLogin";
    }

    @Override // pr1.f
    public final Map c() {
        LinkedHashMap r13 = z0.r(super.c());
        String str = this.f101182h;
        r13.put("gplus_id_token", str);
        r13.put("google_open_id_token", str);
        return z0.n(r13);
    }
}
