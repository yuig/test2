package i72;

import ao2.j0;
import c72.u;
import dl2.j;
import e72.d0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.g0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class f extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d72.c f71689r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g f71690s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d72.c cVar, g gVar, bl2.c cVar2) {
        super(2, cVar2);
        this.f71689r = cVar;
        this.f71690s = gVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new f(this.f71689r, this.f71690s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        Iterable iterable = (Iterable) this.f71689r.f53913c;
        u uVar = this.f71690s.f71693c;
        ArrayList arrayList = new ArrayList(g0.q(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(uVar.c((d0) it.next()));
        }
        return arrayList;
    }
}
