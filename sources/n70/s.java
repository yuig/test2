package n70;

import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.z0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class s extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f89672r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ w f89673s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(w wVar, bl2.c cVar) {
        super(2, cVar);
        this.f89673s = wVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        s sVar = new s(this.f89673s, cVar);
        sVar.f89672r = obj;
        return sVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((s) create((a) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        a aVar2 = (a) this.f89672r;
        Map n13 = z0.n(aVar2.f89595a);
        w wVar = this.f89673s;
        wVar.M0 = n13;
        wVar.N0 = aVar2.f89599e;
        List list = aVar2.f89598d;
        if (!list.isEmpty()) {
            ov1.k kVar = wVar.f89698h1;
            if (kVar != null) {
                kVar.m();
            }
            ov1.k kVar2 = wVar.f89698h1;
            if (kVar2 != null) {
                kVar2.g(list);
            }
            ov1.k kVar3 = wVar.f89698h1;
            if (kVar3 != null) {
                kVar3.b("", wVar);
            }
        }
        return Unit.f80348a;
    }
}
