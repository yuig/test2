package wp0;

import java.util.concurrent.TimeUnit;
import jk2.j1;
import jk2.u0;
import kotlin.jvm.internal.Intrinsics;
import uj2.h;
import uj2.q;
import x02.k2;
import x02.l2;

/* loaded from: classes5.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    public final l2 f130764a;

    public c(l2 typeaheadRepository) {
        Intrinsics.checkNotNullParameter(typeaheadRepository, "typeaheadRepository");
        this.f130764a = typeaheadRepository;
    }

    @Override // wp0.a
    public final h a(String term, hl1.a viewActivity) {
        Intrinsics.checkNotNullParameter(term, "term");
        Intrinsics.checkNotNullParameter(viewActivity, "viewActivity");
        j22.a aVar = j22.a.TYPEAHEAD_HASHTAGS;
        l2 l2Var = this.f130764a;
        l2Var.getClass();
        h N = new j1(new u0(new ik2.b(l2Var.n(new k2(j22.c.TYPEAHEAD, aVar, term, true, false, null)), q.M(300L, TimeUnit.MILLISECONDS, tk2.e.f118016b)), new qk0.b(10, b.f130759j), 0), new qk0.b(11, b.f130760k), 0).N(uj2.a.BUFFER);
        Intrinsics.checkNotNullExpressionValue(N, "toFlowable(...)");
        return N;
    }
}
