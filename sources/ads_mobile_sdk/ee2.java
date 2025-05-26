package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ee2 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f4831a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f4832b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fe2 f4833c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ee2(fe2 fe2Var, String str, bl2.c cVar) {
        super(2, cVar);
        this.f4832b = str;
        this.f4833c = fe2Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        ee2 ee2Var = new ee2(this.f4833c, this.f4832b, cVar);
        ee2Var.f4831a = obj;
        return ee2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ee2) create((ae2) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        int i13;
        int i14;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        ae2 ae2Var = (ae2) this.f4831a;
        String value = this.f4832b;
        fe2 fe2Var = this.f4833c;
        qj0 q13 = ae2Var.q();
        Intrinsics.checkNotNullExpressionValue(q13, "toBuilder(...)");
        a.bh builder = (a.bh) q13;
        Intrinsics.checkNotNullParameter(builder, "builder");
        Intrinsics.checkNotNullParameter(value, "value");
        builder.b();
        ae2 ae2Var2 = (ae2) builder.f10110b;
        ae2Var2.getClass();
        value.getClass();
        i13 = ae2Var2.bitField0_;
        ae2Var2.bitField0_ = i13 | 1;
        ae2Var2.cachedSdkCore_ = value;
        fe2Var.f5131b.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        builder.b();
        ae2 ae2Var3 = (ae2) builder.f10110b;
        i14 = ae2Var3.bitField0_;
        ae2Var3.bitField0_ = i14 | 2;
        ae2Var3.lastUpdateTimeMs_ = currentTimeMillis;
        sj0 a13 = builder.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return (ae2) a13;
    }
}
