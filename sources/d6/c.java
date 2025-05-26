package d6;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class c extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f53727r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f53728s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Function2 f53729t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Function2 function2, bl2.c cVar) {
        super(2, cVar);
        this.f53729t = function2;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        c cVar2 = new c(this.f53729t, cVar);
        cVar2.f53728s = obj;
        return cVar2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((i) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f53727r;
        if (i13 == 0) {
            ue.c.H(obj);
            i iVar = (i) this.f53728s;
            this.f53727r = 1;
            obj = this.f53729t.invoke(iVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        i iVar2 = (i) obj;
        ((b) iVar2).f53726b.set(true);
        return iVar2;
    }
}
