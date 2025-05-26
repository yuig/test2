package u00;

import ao2.j0;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class i extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f119841r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ k f119842s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Map f119843t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, Map map, bl2.c cVar) {
        super(2, cVar);
        this.f119842s = kVar;
        this.f119843t = map;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new i(this.f119842s, this.f119843t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f119841r;
        k kVar = this.f119842s;
        if (i13 == 0) {
            ue.c.H(obj);
            p pVar = kVar.f119847a;
            h hVar = new h(0, this.f119843t);
            this.f119841r = 1;
            obj = pVar.f119869a.f(hVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ue.c.H(obj);
                return Unit.f80348a;
            }
            ue.c.H(obj);
        }
        p pVar2 = kVar.f119847a;
        this.f119841r = 2;
        if (pVar2.f119869a.e((Set) obj, this) == aVar) {
            return aVar;
        }
        return Unit.f80348a;
    }
}
