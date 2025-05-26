package nb0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class p extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f90303r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f90304s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(String str, bl2.c cVar) {
        super(2, cVar);
        this.f90304s = str;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        p pVar = new p(this.f90304s, cVar);
        pVar.f90303r = obj;
        return pVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((d6.b) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        ((d6.b) this.f90303r).b(d7.b.z0(this.f90304s));
        return Unit.f80348a;
    }
}
