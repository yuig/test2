package zx1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f143037r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ k f143038s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(k kVar, bl2.c cVar) {
        super(2, cVar);
        this.f143038s = kVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        f fVar = new f(this.f143038s, cVar);
        fVar.f143037r = obj;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((hw1.e) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        hw1.e eVar = (hw1.e) this.f143037r;
        int i13 = k.f143044x0;
        k kVar = this.f143038s;
        kVar.getClass();
        if (Intrinsics.d(eVar, hw1.a.f70470a)) {
            kVar.X7().setVisibility(8);
        } else if (Intrinsics.d(eVar, hw1.b.f70471a)) {
            kVar.X7().setVisibility(8);
        } else if (eVar instanceof hw1.c) {
            kVar.X7().setVisibility(0);
            hw1.c cVar = (hw1.c) eVar;
            kVar.X7().f(cVar.f70473b, new i(kVar));
            kVar.X7().c(cVar.f70473b, new j(kVar, 0));
            kVar.X7().d(new j(kVar, 1));
            kVar.X7().b(cVar.f70472a, cVar.f70474c);
        }
        return Unit.f80348a;
    }
}
