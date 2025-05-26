package wb2;

import dl2.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import xk2.w;

/* loaded from: classes4.dex */
public final class a extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f129070r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Function1 f129071s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Function1 function1, bl2.c cVar) {
        super(2, cVar);
        this.f129071s = function1;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        a aVar = new a(this.f129071s, cVar);
        aVar.f129070r = obj;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((w) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        w wVar = (w) this.f129070r;
        boolean booleanValue = ((Boolean) wVar.f135234a).booleanValue();
        boolean booleanValue2 = ((Boolean) wVar.f135235b).booleanValue();
        boolean booleanValue3 = ((Boolean) wVar.f135236c).booleanValue();
        if (!booleanValue) {
            Function1 function1 = this.f129071s;
            if (booleanValue2) {
                function1.invoke(c.DOWN);
            } else if (booleanValue3) {
                function1.invoke(c.UP);
            }
        }
        return Unit.f80348a;
    }
}
