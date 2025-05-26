package uq0;

import com.pinterest.api.model.Feed;
import dl1.z;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import uj2.b0;
import uj2.q;
import x02.t1;
import x02.y;

/* loaded from: classes5.dex */
public final class f extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f123045i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h f123046j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ t1 f123047k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(h hVar, t1 t1Var, int i13) {
        super(1);
        this.f123045i = i13;
        this.f123046j = hVar;
        this.f123047k = t1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f123045i;
        t1 t1Var = this.f123047k;
        h hVar = this.f123046j;
        switch (i13) {
            case 0:
                q remoteObservable = (q) obj;
                Intrinsics.checkNotNullParameter(remoteObservable, "remoteObservable");
                return q.z(remoteObservable, hVar.g(t1Var, false).I(1L).J(remoteObservable));
            case 1:
                hVar.getClass();
                if (!(hVar instanceof y)) {
                    hVar.f123057g.f55284a.remove(t1Var);
                    hVar.f123051a.g(t1Var);
                }
                return Unit.f80348a;
            case 2:
                Feed feed = (Feed) obj;
                hVar.f123056f.remove(t1Var);
                Intrinsics.f(feed);
                dl1.a aVar = dl1.a.WRITE;
                z zVar = hVar.f123053c;
                t1 t1Var2 = this.f123047k;
                if (zVar.b(t1Var2, aVar)) {
                    hVar.f123057g.a(t1Var2, feed);
                }
                hVar.f123054d.k(new w.b(hVar, t1Var2, t1Var2, feed, 14));
                return Unit.f80348a;
            default:
                Throwable it = (Throwable) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                hVar.f123056f.remove(t1Var);
                return b0.g(it);
        }
    }
}
