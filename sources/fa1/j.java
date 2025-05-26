package fa1;

import androidx.appcompat.widget.x;
import ao2.j0;
import e82.b0;
import e82.p;
import e82.w;
import ea1.j1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;

/* loaded from: classes5.dex */
public final class j extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ n f61569r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j1 f61570s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(n nVar, j1 j1Var, bl2.c cVar) {
        super(2, cVar);
        this.f61569r = nVar;
        this.f61570s = j1Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new j(this.f61569r, this.f61570s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        x xVar = this.f61569r.f61581b;
        w network = this.f61570s.f58068a;
        xVar.getClass();
        Intrinsics.checkNotNullParameter(network, "network");
        int i13 = b0.f57820a[network.ordinal()];
        int i14 = 2;
        if (i13 == 2) {
            e82.j jVar = (e82.j) xVar.f16708a;
            d0 pinalytics = (d0) xVar.f16712e;
            m60.w eventManager = (m60.w) xVar.f16713f;
            i92.k toastUtils = (i92.k) xVar.f16710c;
            jVar.getClass();
            Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
            Intrinsics.checkNotNullParameter(eventManager, "eventManager");
            Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
            jVar.f57877c.C("etsy/").h(wj2.c.a()).l(tk2.e.f118017c).i(new px0.b(pinalytics, jVar, toastUtils, eventManager, 4), new e82.b(4, e82.i.f57868k));
        } else if (i13 != 3) {
            network.toString();
        } else {
            p pVar = (p) xVar.f16709b;
            d0 pinalytics2 = (d0) xVar.f16712e;
            m60.w eventManager2 = (m60.w) xVar.f16713f;
            i92.k toastUtils2 = (i92.k) xVar.f16710c;
            pVar.getClass();
            Intrinsics.checkNotNullParameter(pinalytics2, "pinalytics");
            Intrinsics.checkNotNullParameter(eventManager2, "eventManager");
            Intrinsics.checkNotNullParameter(toastUtils2, "toastUtils");
            pVar.f57890b.C("instagram/").h(wj2.c.a()).l(tk2.e.f118017c).i(new xo.c(eventManager2, toastUtils2, pinalytics2, 21), new e82.b(7, new e82.h(eventManager2, i14)));
        }
        return Unit.f80348a;
    }
}
