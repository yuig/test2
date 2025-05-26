package gt1;

import et1.d0;
import ht1.v0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b implements mt1.b, mt1.e {

    /* renamed from: a, reason: collision with root package name */
    public final v0 f66105a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f66106b;

    public b(d0 d0Var, c cVar) {
        this.f66106b = cVar;
        d0Var.getClass();
        Intrinsics.checkNotNullParameter("Port: Try to produce audio", "name");
        this.f66105a = new v0("Port: Try to produce audio");
    }

    @Override // mt1.a
    public final void a(Object obj) {
        this.f66105a.a(obj);
    }

    @Override // mt1.d
    public final void c(Function1 producePacketCallback) {
        Intrinsics.checkNotNullParameter(producePacketCallback, "producePacketCallback");
        v0 v0Var = this.f66105a;
        v0Var.getClass();
        Intrinsics.checkNotNullParameter(producePacketCallback, "producePacketCallback");
        v0Var.f88158a = producePacketCallback;
    }

    @Override // mt1.d
    public final void d(Function0 doneProducingCallback) {
        Intrinsics.checkNotNullParameter(doneProducingCallback, "doneProducingCallback");
        v0 v0Var = this.f66105a;
        v0Var.getClass();
        Intrinsics.checkNotNullParameter(doneProducingCallback, "doneProducingCallback");
        v0Var.f88159b = doneProducingCallback;
    }

    @Override // mt1.e
    public final void e(Object obj) {
        this.f66105a.e(obj);
    }

    @Override // mt1.e
    public final void f() {
        this.f66105a.f();
    }

    @Override // mt1.a
    public final void g() {
        c cVar = this.f66106b;
        cVar.f66109c.clear();
        cVar.c();
        this.f66105a.g();
    }
}
