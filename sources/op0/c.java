package op0;

import ck2.i;
import com.pinterest.api.model.az0;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.z2;
import dl1.s;
import go0.j;
import hk2.k;
import kotlin.jvm.internal.Intrinsics;
import uj2.l;
import x02.p1;
import x02.u;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final u f96919a;

    /* renamed from: b, reason: collision with root package name */
    public final p1 f96920b;

    public c(u aggregatedCommentRepository, p1 didItRepository) {
        Intrinsics.checkNotNullParameter(aggregatedCommentRepository, "aggregatedCommentRepository");
        Intrinsics.checkNotNullParameter(didItRepository, "didItRepository");
        this.f96919a = aggregatedCommentRepository;
        this.f96920b = didItRepository;
    }

    public final xj2.b a(s comment, v32.c selectedReaction) {
        Intrinsics.checkNotNullParameter(comment, "comment");
        Intrinsics.checkNotNullParameter(selectedReaction, "selectedReaction");
        xj2.b bVar = new xj2.b();
        boolean z13 = comment instanceof z2;
        ck2.c cVar = i.f27923c;
        if (z13) {
            v32.c cVar2 = v32.c.LIKE;
            u uVar = this.f96919a;
            if (selectedReaction == cVar2) {
                z2 z2Var = (z2) comment;
                k f03 = uVar.f0(z2Var, z2Var.T());
                hk2.b bVar2 = new hk2.b(new j(25, b.f96912j), new j(26, b.f96913k), cVar);
                f03.f(bVar2);
                bVar.a(bVar2);
            } else {
                z2 z2Var2 = (z2) comment;
                bVar.a(uVar.g0(z2Var2, z2Var2.T()).i(new xo.b(20), new j(27, b.f96914l)));
            }
        }
        if (comment instanceof az0) {
            v32.c cVar3 = v32.c.LIKE;
            p1 p1Var = this.f96920b;
            if (selectedReaction == cVar3) {
                az0 az0Var = (az0) comment;
                f30 O = az0Var.O();
                l b03 = p1Var.b0(az0Var, O != null ? O.getUid() : null);
                j jVar = new j(28, b.f96915m);
                j jVar2 = new j(29, b.f96916n);
                b03.getClass();
                hk2.b bVar3 = new hk2.b(jVar, jVar2, cVar);
                b03.f(bVar3);
                bVar.a(bVar3);
            } else {
                az0 az0Var2 = (az0) comment;
                f30 O2 = az0Var2.O();
                bVar.a(p1Var.c0(az0Var2, O2 != null ? O2.getUid() : null).i(new xo.b(21), new a(0, b.f96917o)));
            }
        }
        return bVar;
    }
}
