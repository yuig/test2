package ey0;

import ao2.j0;
import dl2.j;
import h32.f1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class e extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f60646r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f60647s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ g f60648t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, bl2.c cVar) {
        super(2, cVar);
        this.f60648t = gVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        e eVar = new e(this.f60648t, cVar);
        eVar.f60647s = obj;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f60646r;
        if (i13 == 0) {
            ue.c.H(obj);
            j0 j0Var = (j0) this.f60647s;
            g gVar = this.f60648t;
            gVar.getClass();
            int value = f1.PIN_CLOSEUP.getValue();
            this.f60646r = 1;
            if (g.j(gVar, j0Var, "NUX_PIN_SELECTION_EVENT_TYPE", value, this) == aVar) {
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
