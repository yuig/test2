package no1;

import c50.l0;
import com.pinterest.framework.multisection.datasource.pagedlist.h;
import fk2.g;
import java.util.Locale;
import java.util.NoSuchElementException;
import kk2.l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import pc.p0;
import uj2.q;
import vc.f;
import x40.bd;
import x40.ii;
import x40.o;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final oc.c f91666a;

    public d(oc.c apolloClient, int i13) {
        if (i13 == 1) {
            Intrinsics.checkNotNullParameter(apolloClient, "apolloClient");
            this.f91666a = apolloClient;
        } else if (i13 != 2) {
            Intrinsics.checkNotNullParameter(apolloClient, "apolloClient");
            this.f91666a = apolloClient;
        } else {
            Intrinsics.checkNotNullParameter(apolloClient, "apolloClient");
            this.f91666a = apolloClient;
        }
    }

    public final g a(String contactRequestId) {
        Intrinsics.checkNotNullParameter(contactRequestId, "contactRequestId");
        g i13 = com.bumptech.glide.d.u0(this.f91666a.a(new o(contactRequestId))).r(tk2.e.f118017c).l(wj2.c.a()).i();
        Intrinsics.checkNotNullExpressionValue(i13, "ignoreElement(...)");
        return i13;
    }

    public final q b() {
        p0 p0Var = p0.f99597a;
        oc.a c13 = this.f91666a.c(new bd(p0Var, p0Var));
        d7.b.E(c13, f.NetworkFirst);
        q u13 = com.bumptech.glide.d.u0(c13).r(tk2.e.f118017c).l(wj2.c.a()).k(new h(22, b.f91657j)).u();
        Intrinsics.checkNotNullExpressionValue(u13, "toObservable(...)");
        return u13;
    }

    public final l c(String contactRequestId, String reason, a aVar) {
        Intrinsics.checkNotNullParameter(contactRequestId, "contactRequestId");
        Intrinsics.checkNotNullParameter(reason, "reason");
        int i13 = 0;
        for (l0 l0Var : l0.values()) {
            String lowerCase = z.n(l0Var.getRawValue(), "_", "-").toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            if (Intrinsics.d(lowerCase, reason)) {
                xj2.c o13 = com.bumptech.glide.d.u0(this.f91666a.a(new ii(contactRequestId, l0Var))).r(tk2.e.f118017c).l(wj2.c.a()).o(new dl1.c(13, new c(aVar, i13)), new dl1.c(14, new c(aVar, 1)));
                Intrinsics.checkNotNullExpressionValue(o13, "subscribe(...)");
                return (l) o13;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }
}
