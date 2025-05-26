package u00;

import ao2.j0;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class j extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f119844r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ k f119845s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Map f119846t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, Map map, bl2.c cVar) {
        super(2, cVar);
        this.f119845s = kVar;
        this.f119846t = map;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new j(this.f119845s, this.f119846t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f119844r;
        int i14 = 1;
        if (i13 == 0) {
            ue.c.H(obj);
            k kVar = this.f119845s;
            p pVar = kVar.f119847a;
            f fVar = new f(this.f119846t, kVar, i14);
            this.f119844r = 1;
            if (pVar.f119869a.f(fVar, this) == aVar) {
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
