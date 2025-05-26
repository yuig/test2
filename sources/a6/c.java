package a6;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class c extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f800r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f801s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ List f802t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(List list, bl2.c cVar) {
        super(2, cVar);
        this.f802t = list;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        c cVar2 = new c(this.f802t, cVar);
        cVar2.f801s = obj;
        return cVar2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((b0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f800r;
        if (i13 == 0) {
            ue.c.H(obj);
            b0 b0Var = (b0) this.f801s;
            i iVar = g.f835a;
            this.f800r = 1;
            if (i.a(iVar, this.f802t, b0Var, this) == aVar) {
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
