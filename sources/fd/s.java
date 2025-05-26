package fd;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class s extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f61803r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ y f61804s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ pc.f f61805t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(y yVar, pc.f fVar, bl2.c cVar) {
        super(2, cVar);
        this.f61804s = yVar;
        this.f61805t = fVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new s(this.f61804s, this.f61805t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((s) create((do2.j) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f61803r;
        if (i13 == 0) {
            ue.c.H(obj);
            co2.m mVar = this.f61804s.f61834g;
            gd.l lVar = new gd.l(this.f61805t);
            this.f61803r = 1;
            if (mVar.o(lVar, this) == aVar) {
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
