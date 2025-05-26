package qz;

import g1.p0;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f105363b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final p0 f105364a = new p0(0);

    public a() {
        m60.f0.u0(this);
    }

    public final vd0.c a(f0 params) {
        Intrinsics.checkNotNullParameter("users/contacts/suggestions/share/", "url");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter("SEND_SHARE_SERVICE_CACHE", "tag");
        return (vd0.c) this.f105364a.g(Arrays.hashCode(new Object[]{"users/contacts/suggestions/share/", params.f105397a, "SEND_SHARE_SERVICE_CACHE"}));
    }
}
