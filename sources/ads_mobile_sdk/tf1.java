package ads_mobile_sdk;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class tf1 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f11528a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ uf1 f11529b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ if1 f11530c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nm.u f11531d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tf1(if1 if1Var, uf1 uf1Var, nm.u uVar, bl2.c cVar) {
        super(2, cVar);
        this.f11529b = uf1Var;
        this.f11530c = if1Var;
        this.f11531d = uVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        tf1 tf1Var = new tf1(this.f11530c, this.f11529b, this.f11531d, cVar);
        tf1Var.f11528a = obj;
        return tf1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((tf1) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        j0 j0Var = (j0) this.f11528a;
        uf1 uf1Var = this.f11529b;
        kotlin.jvm.internal.j.z(j0Var, uf1Var.f12063b, null, new lf1(this.f11530c, uf1Var, this.f11531d, null), 2);
        uf1 uf1Var2 = this.f11529b;
        kotlin.jvm.internal.j.z(j0Var, uf1Var2.f12063b, null, new mf1(this.f11530c, uf1Var2, this.f11531d, null), 2);
        uf1 uf1Var3 = this.f11529b;
        kotlin.jvm.internal.j.z(j0Var, uf1Var3.f12063b, null, new nf1(this.f11530c, uf1Var3, this.f11531d, null), 2);
        uf1 uf1Var4 = this.f11529b;
        kotlin.jvm.internal.j.z(j0Var, uf1Var4.f12063b, null, new of1(this.f11530c, uf1Var4, this.f11531d, null), 2);
        uf1 uf1Var5 = this.f11529b;
        kotlin.jvm.internal.j.z(j0Var, uf1Var5.f12063b, null, new pf1(this.f11530c, uf1Var5, this.f11531d, null), 2);
        uf1 uf1Var6 = this.f11529b;
        kotlin.jvm.internal.j.z(j0Var, uf1Var6.f12063b, null, new qf1(this.f11530c, uf1Var6, this.f11531d, null), 2);
        uf1 uf1Var7 = this.f11529b;
        kotlin.jvm.internal.j.z(j0Var, uf1Var7.f12063b, null, new rf1(this.f11530c, uf1Var7, this.f11531d, null), 2);
        return kotlin.jvm.internal.j.z(j0Var, this.f11529b.f12063b, null, new sf1(this.f11531d, this.f11530c, null), 2);
    }
}
