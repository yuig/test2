package p10;

import dl1.s;
import dl1.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import lb.u0;
import org.jetbrains.annotations.NotNull;
import uj2.b0;

/* loaded from: classes.dex */
public final class m implements dl1.p {

    /* renamed from: a, reason: collision with root package name */
    public final n f98630a;

    public m(@NotNull n modelCache) {
        Intrinsics.checkNotNullParameter(modelCache, "modelCache");
        this.f98630a = modelCache;
    }

    @Override // dl1.p
    public final boolean a() {
        return this.f98630a.a();
    }

    @Override // dl1.y
    public final uj2.q b(dl1.m mVar) {
        u params = (u) mVar;
        Intrinsics.checkNotNullParameter(params, "params");
        uj2.q j13 = new hk2.p(new u0(4, this, params)).j();
        Intrinsics.checkNotNullExpressionValue(j13, "toObservable(...)");
        return j13;
    }

    @Override // dl1.p
    public final boolean c(dl1.m mVar, s model) {
        u params = (u) mVar;
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f98630a.b(params, model);
        return true;
    }

    @Override // dl1.p
    public final s e(dl1.m mVar) {
        u params = (u) mVar;
        Intrinsics.checkNotNullParameter(params, "params");
        return this.f98630a.d(params);
    }

    @Override // dl1.p
    public final boolean f(List params, List models) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(models, "models");
        Iterator it = CollectionsKt.N0(params, models).iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            this.f98630a.b((u) pair.f80346a, (s) pair.f80347b);
        }
        return true;
    }

    @Override // dl1.p
    public final boolean g(dl1.m mVar) {
        u params = (u) mVar;
        Intrinsics.checkNotNullParameter(params, "params");
        this.f98630a.c(params);
        return true;
    }

    @Override // dl1.p
    public final b0 i(List paramsList) {
        Intrinsics.checkNotNullParameter(paramsList, "paramsList");
        ArrayList arrayList = new ArrayList();
        Iterator it = paramsList.iterator();
        while (it.hasNext()) {
            u params = (u) it.next();
            Intrinsics.checkNotNullParameter(params, "params");
            s d2 = this.f98630a.d(params);
            if (d2 != null) {
                arrayList.add(d2);
            }
        }
        kk2.b j13 = b0.j(arrayList);
        Intrinsics.checkNotNullExpressionValue(j13, "just(...)");
        return j13;
    }
}
