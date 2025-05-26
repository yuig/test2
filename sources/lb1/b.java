package lb1;

import ab1.o;
import ao2.j0;
import da1.c;
import dl2.j;
import kb1.p;
import kk2.t;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import tk2.e;
import u50.r;

/* loaded from: classes5.dex */
public final class b extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ c f82739r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ p f82740s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ r f82741t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, p pVar, r rVar, bl2.c cVar2) {
        super(2, cVar2);
        this.f82739r = cVar;
        this.f82740s = pVar;
        this.f82741t = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new b(this.f82739r, this.f82740s, this.f82741t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        c cVar = this.f82739r;
        x10.a aVar2 = (x10.a) cVar.f54229b;
        p pVar = this.f82740s;
        String str = pVar.f79091a;
        String a13 = n00.b.a(n00.c.USER_ME);
        String str2 = pVar.f79092b;
        t l13 = aVar2.b(str, str, str2, str2, true, a13).r(e.f118017c).l(wj2.c.a());
        r rVar = this.f82741t;
        l13.o(new o(7, new a(cVar, rVar, 0)), new o(8, new a(cVar, rVar, 1)));
        return Unit.f80348a;
    }
}
