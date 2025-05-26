package ads_mobile_sdk;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class w extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f12737a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f12738b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a.ie f12739c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f12740d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(boolean z13, a.ie ieVar, long j13, bl2.c cVar) {
        super(2, cVar);
        this.f12738b = z13;
        this.f12739c = ieVar;
        this.f12740d = j13;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new w(this.f12738b, this.f12739c, this.f12740d, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((w) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f12737a;
        if (i13 == 0) {
            ue.c.H(obj);
            if (this.f12738b) {
                a.ie ieVar = this.f12739c;
                long j13 = this.f12740d;
                this.f12737a = 1;
                if (ieVar.d(j13, this) == aVar) {
                    return aVar;
                }
            } else {
                a.ie ieVar2 = this.f12739c;
                long j14 = this.f12740d;
                this.f12737a = 2;
                if (ieVar2.b(j14, this) == aVar) {
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
