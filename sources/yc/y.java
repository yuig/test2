package yc;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class y extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f138693r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f138694s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ do2.i f138695t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(do2.i iVar, bl2.c cVar) {
        super(2, cVar);
        this.f138695t = iVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        y yVar = new y(this.f138695t, cVar);
        yVar.f138694s = obj;
        return yVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((y) create((do2.j) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f138693r;
        if (i13 == 0) {
            ue.c.H(obj);
            wb.b bVar = new wb.b((do2.j) this.f138694s, 2);
            this.f138693r = 1;
            if (this.f138695t.collect(bVar, this) == aVar) {
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
