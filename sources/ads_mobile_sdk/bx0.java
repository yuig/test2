package ads_mobile_sdk;

import a.j4;
import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class bx0 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f3632a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f3633b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f3634c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3635d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bx0(String str, String str2, Object obj, bl2.c cVar) {
        super(2, cVar);
        this.f3633b = str;
        this.f3634c = str2;
        this.f3635d = obj;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new bx0(this.f3633b, this.f3634c, this.f3635d, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((bx0) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f3632a;
        if (i13 == 0) {
            ue.c.H(obj);
            ok.e0 e0Var = gk0.f5596a;
            a.c.u("Invoking function [", this.f3633b, "] on listener [", this.f3634c, "]");
            j4 j4Var = (j4) this.f3635d;
            this.f3632a = 1;
            if (j4Var.b(this) == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        return Unit.f80348a;
    }
}
