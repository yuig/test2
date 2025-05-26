package pr1;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a extends f {

    /* renamed from: h, reason: collision with root package name */
    public final String f101180h;

    /* renamed from: i, reason: collision with root package name */
    public final String f101181i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String id3, String token, boolean z13) {
        super("facebook/", z13, qr1.f.f104999b);
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(token, "token");
        this.f101180h = id3;
        this.f101181i = token;
    }

    @Override // or1.p
    public final String a() {
        return "FacebookLogin";
    }

    @Override // pr1.f
    public final Map c() {
        LinkedHashMap r13 = z0.r(super.c());
        r13.put("facebook_id", this.f101180h);
        r13.put("facebook_token", this.f101181i);
        boolean z13 = this.f101189c;
        if (z13) {
            r13.put("facebook_autologin", String.valueOf(z13));
        }
        return z0.n(r13);
    }
}
