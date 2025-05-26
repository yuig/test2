package uq0;

import com.pinterest.api.model.Feed;
import java.util.concurrent.Callable;
import jk2.h0;
import jk2.x;
import kk2.m;
import kotlin.jvm.internal.Intrinsics;
import uj2.q;
import x02.t1;

/* loaded from: classes5.dex */
public final /* synthetic */ class d implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f123041a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f123042b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t1 f123043c;

    public /* synthetic */ d(h hVar, t1 t1Var, int i13) {
        this.f123041a = i13;
        this.f123042b = hVar;
        this.f123043c = t1Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i13 = this.f123041a;
        t1 modelKey = this.f123043c;
        h this$0 = this.f123042b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(modelKey, "$modelKey");
                Feed feed = (Feed) this$0.f123051a.e(modelKey);
                return feed != null ? q.y(feed) : h0.f76488a;
            default:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(modelKey, "$params");
                q qVar = (q) this$0.f123056f.get(modelKey);
                if (qVar != null) {
                    return qVar;
                }
                x xVar = new x(new m(new kk2.g(this$0.f123052b.b(modelKey).e(new b22.f(0, new e(this$0.f123054d, 1))), new c(2, new f(this$0, modelKey, 2)), 3), new qk0.b(27, new f(this$0, modelKey, 3)), 2).u().i(pn.f.f100725a), new fp.a(12, this$0, modelKey), 1);
                Intrinsics.checkNotNullExpressionValue(xVar, "doFinally(...)");
                this$0.f123056f.put(modelKey, xVar);
                return xVar;
        }
    }
}
