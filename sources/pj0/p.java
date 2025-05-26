package pj0;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class p extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f100259r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ s f100260s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ i f100261t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(s sVar, i iVar, bl2.c cVar) {
        super(2, cVar);
        this.f100260s = sVar;
        this.f100261t = iVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new p(this.f100260s, this.f100261t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f100259r;
        if (i13 == 0) {
            ue.c.H(obj);
            s sVar = this.f100260s;
            do2.c a13 = kotlin.jvm.internal.j.a(sVar.f100281q.f49129s);
            o1.f fVar = new o1.f(13, sVar, this.f100261t);
            this.f100259r = 1;
            if (a13.collect(fVar, this) == aVar) {
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
