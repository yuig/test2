package z82;

import ao2.j0;
import d92.m;
import d92.n;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m60.x0;
import u50.k0;
import u50.r;

/* loaded from: classes4.dex */
public final class g extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f141117r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j f141118s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f141119t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar, String str, bl2.c cVar) {
        super(2, cVar);
        this.f141118s = jVar;
        this.f141119t = str;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new g(this.f141118s, this.f141119t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f141117r;
        j jVar = this.f141118s;
        if (i13 == 0) {
            ue.c.H(obj);
            a92.a aVar2 = jVar.f141128b;
            this.f141117r = 1;
            obj = ((a92.h) aVar2).e(this.f141119t, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        b92.a aVar3 = (b92.a) obj;
        jVar.f141135i = aVar3 == null ? j.f141126n : aVar3;
        String str = aVar3 != null ? aVar3.f22246a : null;
        y82.h hVar = jVar.f141130d;
        if (str == null) {
            r rVar = jVar.f141138l;
            String str2 = "token_retrieval_error";
            if (rVar != null) {
                rVar.a(new m(str2, new k0(x0.oops_something_went_wrong)));
            }
            ((y82.i) hVar).b("token_retrieval_error", "");
        } else {
            ((y82.i) hVar).c(aVar3.f22247b ? y82.b.f138068d : y82.b.f138067c);
            r rVar2 = jVar.f141138l;
            if (rVar2 != null) {
                rVar2.a(new n(!aVar3.f22247b));
            }
        }
        return Unit.f80348a;
    }
}
