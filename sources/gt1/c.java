package gt1;

import et1.a0;
import et1.d0;
import et1.u0;
import ht1.e0;
import ht1.l;
import ht1.v0;
import java.util.LinkedList;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public final a0 f66107a;

    /* renamed from: b, reason: collision with root package name */
    public final et1.c f66108b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedList f66109c;

    /* renamed from: d, reason: collision with root package name */
    public e0 f66110d;

    /* renamed from: e, reason: collision with root package name */
    public final b f66111e;

    /* renamed from: f, reason: collision with root package name */
    public final v0 f66112f;

    /* renamed from: g, reason: collision with root package name */
    public final v0 f66113g;

    /* renamed from: h, reason: collision with root package name */
    public final a f66114h;

    public c(a0 doNotSendDoneProducingCallbackFactory, d0 passThroughNodeFactory, wk2.a componentProvider) {
        Intrinsics.checkNotNullParameter(passThroughNodeFactory, "passThroughNodeFactory");
        Intrinsics.checkNotNullParameter(componentProvider, "componentProvider");
        Intrinsics.checkNotNullParameter(doNotSendDoneProducingCallbackFactory, "doNotSendDoneProducingCallbackFactory");
        this.f66107a = doNotSendDoneProducingCallbackFactory;
        et1.c cVar = (et1.c) componentProvider.get();
        this.f66108b = cVar;
        this.f66109c = new LinkedList();
        b bVar = new b(passThroughNodeFactory, this);
        this.f66111e = bVar;
        Intrinsics.checkNotNullParameter("Port: Output Format Changed", "name");
        v0 v0Var = new v0("Port: Output Format Changed");
        this.f66112f = v0Var;
        Intrinsics.checkNotNullParameter("Port: Work Done", "name");
        v0 v0Var2 = new v0("Port: Work Done");
        this.f66113g = v0Var2;
        a aVar = new a(this);
        this.f66114h = aVar;
        et1.v0 v0Var3 = (et1.v0) cVar;
        v0Var3.a(bVar, "Port: Try to produce audio");
        v0Var3.a(aVar, "Port: On Audio Available");
        v0Var3.a(v0Var, "Port: On Output Format Changed");
        v0Var3.a(v0Var2, "Port: On Work Done");
    }

    public final void a() {
        Pair pair = (Pair) this.f66109c.removeFirst();
        String str = (String) pair.f80346a;
        e0 e0Var = (e0) ((Function0) pair.f80347b).invoke();
        this.f66107a.getClass();
        l lVar = new l(2);
        l lVar2 = new l(2);
        et1.v0 v0Var = (et1.v0) this.f66108b;
        v0Var.a(e0Var, str);
        v0Var.a(lVar, "Don't send onEndOfInput() to onOutputFormatChanged");
        v0Var.a(lVar2, "Don't send onEndOfInput() to onWorkDone");
        ((u0) b()).a(e0Var.e(), this.f66111e);
        et1.d b13 = b();
        ((u0) b13).a(this.f66114h, e0Var.g());
        ((u0) b()).a(lVar, e0Var.k());
        ((u0) b()).a(this.f66112f, lVar);
        ((u0) b()).a(lVar2, e0Var.i());
        ((u0) b()).a(this.f66113g, lVar2);
        c();
        this.f66110d = e0Var;
    }

    public final et1.d b() {
        return ((et1.v0) this.f66108b).f60109a;
    }

    public final void c() {
        e0 node = this.f66110d;
        if (node != null) {
            node.j(new jq1.b(this, 2));
            ((u0) b()).c(node);
            et1.v0 v0Var = (et1.v0) this.f66108b;
            v0Var.getClass();
            Intrinsics.checkNotNullParameter(node, "node");
            v0Var.f60110b.remove(node);
            v0Var.f60111c.remove(node);
        }
    }

    @Override // et1.e
    public final String d(Object obj) {
        return ((et1.v0) this.f66108b).d(obj);
    }

    @Override // ht1.e0
    public final mt1.a e() {
        return this.f66111e;
    }

    @Override // ht1.e0
    public final mt1.d g() {
        return this.f66114h;
    }

    @Override // et1.e
    public final void h(Function2 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        ((et1.v0) this.f66108b).h(callback);
    }

    @Override // ht1.e0
    public final mt1.d i() {
        return this.f66113g;
    }

    @Override // ht1.e0
    public final mt1.d k() {
        return this.f66112f;
    }

    public final String toString() {
        return "remaining factories [" + this.f66109c.size() + "] current input [" + this.f66110d + "]";
    }
}
