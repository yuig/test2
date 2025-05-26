package ads_mobile_sdk;

import a.h3;
import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class rn1 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f10695a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f10696b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h3 f10697c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f10698d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rn1(boolean z13, h3 h3Var, long j13, bl2.c cVar) {
        super(2, cVar);
        this.f10696b = z13;
        this.f10697c = h3Var;
        this.f10698d = j13;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new rn1(this.f10696b, this.f10697c, this.f10698d, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((rn1) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f10695a;
        if (i13 == 0) {
            ue.c.H(obj);
            if (this.f10696b) {
                h3 h3Var = this.f10697c;
                long j13 = this.f10698d;
                this.f10695a = 1;
                if (h3Var.a(j13, this) == aVar) {
                    return aVar;
                }
            } else {
                h3 h3Var2 = this.f10697c;
                long j14 = this.f10698d;
                this.f10695a = 2;
                if (h3Var2.c(j14, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i13 != 1 && i13 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        return Unit.f80348a;
    }
}
