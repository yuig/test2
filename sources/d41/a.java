package d41;

import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.screens.p0;
import e0.t;
import il1.b;
import kotlin.Pair;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import xa0.l;
import xa0.q;

/* loaded from: classes5.dex */
public final class a extends jr.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b screenFactory) {
        super(screenFactory);
        Intrinsics.checkNotNullParameter(screenFactory, "screenFactory");
        Pair pair = new Pair("RetrievalExtras.COLLAGE_RETRIEVAL_TYPE", l.DRAFTS);
        Pair pair2 = new Pair("RetrievalExtras.COLLAGE_RETRIEVAL_DRAFT_SELECTION_RESULT", q.ReturnToSource);
        Boolean bool = Boolean.TRUE;
        k(f0.j(jr.a.o((ScreenLocation) p0.f51195b.getValue(), t.j(pair, pair2, new Pair("RetrievalExtras.COLLAGE_IS_IN_TABBED_VIEW", bool))), jr.a.o((ScreenLocation) p0.f51194a.getValue(), t.j(new Pair("RetrievalExtras.COLLAGE_IS_TEMPLATES", bool)))));
    }
}
