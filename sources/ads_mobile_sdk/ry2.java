package ads_mobile_sdk;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class ry2 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f10862a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f10863b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f10864c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f10865d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ry2(String str, String str2, Object obj, bl2.c cVar) {
        super(2, cVar);
        this.f10863b = str;
        this.f10864c = str2;
        this.f10865d = obj;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new ry2(this.f10863b, this.f10864c, this.f10865d, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ry2) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f10862a;
        if (i13 == 0) {
            ue.c.H(obj);
            ok.e0 e0Var = gk0.f5596a;
            a.c.u("Invoking function [", this.f10863b, "] on listener [", this.f10864c, "]");
            a.qe qeVar = (a.qe) this.f10865d;
            this.f10862a = 1;
            if (qeVar.a(true, this) == aVar) {
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
