package jo2;

import co2.z;
import dl2.j;
import java.util.concurrent.atomic.AtomicReference;
import jk2.p2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import uj2.t;

/* loaded from: classes4.dex */
public final class f extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f77229r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f77230s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ t f77231t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(t tVar, bl2.c cVar) {
        super(2, cVar);
        this.f77231t = tVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        f fVar = new f(this.f77231t, cVar);
        fVar.f77230s = obj;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((z) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f77229r;
        if (i13 == 0) {
            ue.c.H(obj);
            z zVar = (z) this.f77230s;
            AtomicReference atomicReference = new AtomicReference();
            this.f77231t.d(new p2(zVar, atomicReference, 2));
            lr.d dVar = new lr.d(atomicReference, 4);
            this.f77229r = 1;
            if (dl2.b.w(zVar, dVar, this) == aVar) {
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
