package b22;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;
import uj2.q;

/* loaded from: classes4.dex */
public final /* synthetic */ class g extends p implements Function1 {
    public g(gl1.d dVar) {
        super(1, dVar, gl1.d.class, "subscribeDb", "subscribeDb(Lio/reactivex/Observable;)Lio/reactivex/Observable;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        q p03 = (q) obj;
        Intrinsics.checkNotNullParameter(p03, "p0");
        return ((gl1.d) this.receiver).i(p03);
    }
}
