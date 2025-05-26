package vu1;

import ao2.j0;
import ao2.v0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class l extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f126687r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ p f126688s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p pVar, bl2.c cVar) {
        super(2, cVar);
        this.f126688s = pVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new l(this.f126688s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f126687r;
        if (i13 == 0) {
            ue.c.H(obj);
            ko2.f fVar = v0.f20219a;
            ko2.e eVar = ko2.e.f80326c;
            k kVar = new k(this.f126688s, null);
            this.f126687r = 1;
            obj = kotlin.jvm.internal.j.M(this, eVar, kVar);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        return obj;
    }
}
