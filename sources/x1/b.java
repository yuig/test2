package x1;

import dl2.j;
import kh2.u2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import n3.w;

/* loaded from: classes2.dex */
public final class b extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f131556r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f131557s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c f131558t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, bl2.c cVar2) {
        super(2, cVar2);
        this.f131558t = cVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        b bVar = new b(this.f131558t, cVar);
        bVar.f131557s = obj;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((w) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f131556r;
        if (i13 == 0) {
            ue.c.H(obj);
            w wVar = (w) this.f131557s;
            a aVar2 = new a(this.f131558t, null);
            this.f131556r = 1;
            if (u2.w(wVar, aVar2, this) == aVar) {
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
