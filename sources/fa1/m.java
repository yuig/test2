package fa1;

import ao2.j0;
import e82.w;
import ea1.l1;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import u50.r;

/* loaded from: classes5.dex */
public final class m extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ n f61577r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ l1 f61578s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ r f61579t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, l1 l1Var, r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f61577r = nVar;
        this.f61578s = l1Var;
        this.f61579t = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new m(this.f61577r, this.f61578s, this.f61579t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        n nVar = this.f61577r;
        xj2.b bVar = nVar.f61587h;
        l1 l1Var = this.f61578s;
        w network = l1Var.f58079a;
        e82.f fVar = nVar.f61582c;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(network, "network");
        HashMap hashMap = new HashMap();
        String str = fVar.f57834d;
        if (str != null) {
        }
        String str2 = l1Var.f58080b;
        if (str2 != null) {
        }
        hashMap.put("save_to_profile", String.valueOf(str2 == null));
        String str3 = l1Var.f58081c;
        if (str3 != null) {
        }
        hashMap.put("should_clear_section", String.valueOf(str3 == null));
        String apiParam = network.getApiParam();
        Intrinsics.checkNotNullExpressionValue(apiParam, "getApiParam(...)");
        kk2.g gVar = new kk2.g(pk2.f.k(fVar.f57831a.b(apiParam, hashMap).r(tk2.e.f118017c), "observeOn(...)"), new c(12, new y71.b(16, nVar, l1Var)), 3);
        r rVar = this.f61579t;
        bVar.a(gVar.o(new c(13, new g(rVar, 4)), new c(14, new g(rVar, 5))));
        return Unit.f80348a;
    }
}
