package tq0;

import h32.c0;
import h32.f1;
import h32.g0;
import h32.v0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g extends b {

    /* renamed from: c, reason: collision with root package name */
    public final String f119002c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f119003d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public g(nx.d0 r3, java.lang.String r4) {
        /*
            r2 = this;
            pb0.g r0 = pb0.g.f99432a
            java.lang.String r1 = "clock"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r1 = "pinalytics"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r1)
            r2.<init>(r0, r3)
            r2.f119002c = r4
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.f119003d = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tq0.g.<init>(nx.d0, java.lang.String):void");
    }

    @Override // tq0.b
    public final void i() {
        this.f119003d.clear();
    }

    @Override // tq0.b
    public final void l(Object impression) {
        Intrinsics.checkNotNullParameter(impression, "impression");
        if (impression instanceof c0) {
            this.f119003d.add(impression);
        }
    }

    @Override // tq0.b
    public final void p() {
        v0 v0Var;
        Iterator it = this.f119003d.iterator();
        while (it.hasNext()) {
            c0 c0Var = (c0) it.next();
            g0 g0Var = Intrinsics.d(c0Var.f66896j, "didIt") ? g0.AGGREGATED_COMMENT_DIDIT : Intrinsics.d(c0Var.f66895i, "pin") ? g0.AGGREGATED_COMMENT_NONREPLY : g0.AGGREGATED_COMMENT_REPLY;
            f1 f1Var = f1.COMMENT_IMPRESSION_ONE_PIXEL;
            String str = this.f119002c;
            if (str != null) {
                v0 v0Var2 = new v0();
                v0Var2.G = str;
                v0Var = v0Var2;
            } else {
                v0Var = null;
            }
            this.f118989b.l(f1Var, g0Var, c0Var.f66887a, v0Var, f0.d(c0Var));
        }
    }
}
