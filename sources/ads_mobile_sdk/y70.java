package ads_mobile_sdk;

import gw.f;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class y70 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f80 f14117a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wi.j f14118b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y70(bl2.c cVar, f80 f80Var, wi.j jVar) {
        super(2, cVar);
        this.f14117a = f80Var;
        this.f14118b = jVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new y70(cVar, this.f14117a, this.f14118b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new y70((bl2.c) obj2, this.f14117a, this.f14118b).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        wi.e a13 = this.f14117a.a();
        if (a13 != null) {
            wi.j value = this.f14118b;
            gw.a aVar2 = (gw.a) a13;
            int i13 = aVar2.f66173a;
            Function1 function1 = aVar2.f66177e;
            f fVar = aVar2.f66174b;
            switch (i13) {
                case 0:
                    Intrinsics.checkNotNullParameter(value, "value");
                    long j13 = value.f129952b;
                    Objects.toString(value.f129951a);
                    fVar.getClass();
                    function1.invoke(value);
                    Intrinsics.checkNotNullParameter(value, "value");
                    break;
                default:
                    Intrinsics.checkNotNullParameter(value, "value");
                    long j14 = value.f129952b;
                    Objects.toString(value.f129951a);
                    fVar.getClass();
                    function1.invoke(value);
                    Intrinsics.checkNotNullParameter(value, "value");
                    break;
            }
        }
        return Unit.f80348a;
    }
}
