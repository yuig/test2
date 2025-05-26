package uo;

import b40.r;
import b40.v0;
import com.bumptech.glide.d;
import d7.b;
import dl1.b0;
import fk2.g;
import g30.n;
import kk2.m;
import kk2.t;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import oc.c;
import pc.q0;
import tk2.e;
import vc.f;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final c f122922a;

    public a(c apolloClient, int i13) {
        if (i13 == 1) {
            Intrinsics.checkNotNullParameter(apolloClient, "apolloClient");
            this.f122922a = apolloClient;
        } else if (i13 != 2) {
            Intrinsics.checkNotNullParameter(apolloClient, "apolloClient");
            this.f122922a = apolloClient;
        } else {
            Intrinsics.checkNotNullParameter(apolloClient, "apolloClient");
            this.f122922a = apolloClient;
        }
    }

    public final g a(String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        g i13 = d.u0(this.f122922a.a(new n(token))).r(e.f118017c).l(wj2.c.a()).i();
        Intrinsics.checkNotNullExpressionValue(i13, "ignoreElement(...)");
        return i13;
    }

    public final m b() {
        oc.a c13 = this.f122922a.c(new r());
        b.E(c13, f.NetworkOnly);
        m k13 = d.u0(c13).k(new b0(28, cv1.b.f53311i));
        Intrinsics.checkNotNullExpressionValue(k13, "map(...)");
        return k13;
    }

    public final t c(String str, String str2) {
        if (str == null) {
            str = "";
        }
        q0 q0Var = new q0(e0.b(str));
        if (str2 == null) {
            str2 = "";
        }
        return pk2.f.k(d.u0(this.f122922a.a(new v0(q0Var, new q0(e0.b(str2))))).r(e.f118017c), "observeOn(...)");
    }
}
