package ads_mobile_sdk;

import a.na;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class dg0 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f4276a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nm.u f4277b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ds f4278c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dg0(ds dsVar, nm.u uVar, bl2.c cVar) {
        super(2, cVar);
        this.f4277b = uVar;
        this.f4278c = dsVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        dg0 dg0Var = new dg0(this.f4278c, this.f4277b, cVar);
        dg0Var.f4276a = obj;
        return dg0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((dg0) create((sf0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        int i13;
        int i14;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        sf0 sf0Var = (sf0) this.f4276a;
        nm.u uVar = this.f4277b;
        ds value = this.f4278c;
        qj0 q13 = sf0Var.q();
        Intrinsics.checkNotNullExpressionValue(q13, "toBuilder(...)");
        na builder = (na) q13;
        Intrinsics.checkNotNullParameter(builder, "builder");
        if (uVar != null) {
            String value2 = new nm.o().l(uVar);
            Intrinsics.checkNotNullExpressionValue(value2, "toJson(...)");
            Intrinsics.checkNotNullParameter(value2, "value");
            builder.b();
            sf0 sf0Var2 = (sf0) builder.f10110b;
            sf0Var2.getClass();
            value2.getClass();
            i14 = sf0Var2.bitField0_;
            sf0Var2.bitField0_ = i14 | 1;
            sf0Var2.flagJson_ = value2;
            builder.g(0);
        }
        Intrinsics.checkNotNullParameter(value, "value");
        builder.b();
        sf0 sf0Var3 = (sf0) builder.f10110b;
        sf0Var3.getClass();
        value.getClass();
        sf0Var3.consentState_ = value;
        i13 = sf0Var3.bitField0_;
        sf0Var3.bitField0_ = i13 | 4;
        sj0 a13 = builder.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return (sf0) a13;
    }
}
