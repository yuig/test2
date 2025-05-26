package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import lb.l0;

/* loaded from: classes2.dex */
public final class sl extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public mo2.a f11132a;

    /* renamed from: b, reason: collision with root package name */
    public tl f11133b;

    /* renamed from: c, reason: collision with root package name */
    public int f11134c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f11135d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tl f11136e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sl(long j13, tl tlVar, bl2.c cVar) {
        super(2, cVar);
        this.f11135d = j13;
        this.f11136e = tlVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new sl(this.f11135d, this.f11136e, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new sl(this.f11135d, this.f11136e, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        tl tlVar;
        Object obj2;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f11134c;
        if (i13 == 0) {
            ue.c.H(obj);
            long j13 = this.f11135d;
            this.f11134c = 1;
            if (l0.T(j13, this) == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                tlVar = this.f11133b;
                Object obj3 = this.f11132a;
                ue.c.H(obj);
                obj2 = obj3;
                try {
                    tlVar.f11581h = tlVar.b();
                    tlVar.f11582i = null;
                    return Unit.f80348a;
                } finally {
                    ((mo2.c) obj2).i(null);
                }
            }
            ue.c.H(obj);
        }
        tl tlVar2 = this.f11136e;
        mo2.a aVar2 = tlVar2.f11579f;
        this.f11132a = aVar2;
        this.f11133b = tlVar2;
        this.f11134c = 2;
        mo2.c cVar = (mo2.c) aVar2;
        if (cVar.f(null, this) == aVar) {
            return aVar;
        }
        tlVar = tlVar2;
        obj2 = cVar;
        tlVar.f11581h = tlVar.b();
        tlVar.f11582i = null;
        return Unit.f80348a;
    }
}
