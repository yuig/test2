package lb;

import androidx.work.impl.WorkerStoppedException;
import ao2.p1;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class w0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f82678r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a1 f82679s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(a1 a1Var, bl2.c cVar) {
        super(2, cVar);
        this.f82679s = a1Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new w0(this.f82679s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((w0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        Object q0Var;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f82678r;
        a1 a1Var = this.f82679s;
        try {
            if (i13 == 0) {
                ue.c.H(obj);
                p1 p1Var = a1Var.f82571n;
                v0 v0Var = new v0(a1Var, null);
                this.f82678r = 1;
                obj = kotlin.jvm.internal.j.M(this, p1Var, v0Var);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ue.c.H(obj);
            }
            q0Var = (t0) obj;
        } catch (WorkerStoppedException e13) {
            q0Var = new s0(e13.getF20012a());
        } catch (CancellationException unused) {
            q0Var = new q0();
        } catch (Throwable th3) {
            kb.b0.e().d(b1.f82583a, "Unexpected error in WorkerWrapper", th3);
            q0Var = new q0();
        }
        Object p13 = a1Var.f82566i.p(new u0(0, q0Var, a1Var));
        Intrinsics.checkNotNullExpressionValue(p13, "workDatabase.runInTransa…          }\n            )");
        return p13;
    }
}
