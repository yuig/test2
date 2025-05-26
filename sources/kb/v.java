package kb;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class v extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f79043r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f79044s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Function2 f79045t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ r4.i f79046u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Function2 function2, r4.i iVar, bl2.c cVar) {
        super(2, cVar);
        this.f79045t = function2;
        this.f79046u = iVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        v vVar = new v(this.f79045t, this.f79046u, cVar);
        vVar.f79044s = obj;
        return vVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((v) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f79043r;
        r4.i iVar = this.f79046u;
        try {
            if (i13 == 0) {
                ue.c.H(obj);
                ao2.j0 j0Var = (ao2.j0) this.f79044s;
                Function2 function2 = this.f79045t;
                this.f79043r = 1;
                obj = function2.invoke(j0Var, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ue.c.H(obj);
            }
            iVar.b(obj);
        } catch (CancellationException unused) {
            iVar.c();
        } catch (Throwable th3) {
            iVar.d(th3);
        }
        return Unit.f80348a;
    }
}
