package cf2;

import ao2.j0;
import cn0.t;
import dl2.j;
import do2.b1;
import do2.t2;
import eo2.r;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class e extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f27664r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f f27665s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, bl2.c cVar) {
        super(2, cVar);
        this.f27665s = fVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new e(this.f27665s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f27664r;
        if (i13 == 0) {
            ue.c.H(obj);
            this.f27664r = 1;
            f fVar = this.f27665s;
            t2 t2Var = fVar.f27666p;
            t tVar = new t(3, null);
            int i14 = b1.f55739a;
            Object collect = new r(tVar, t2Var, kotlin.coroutines.j.f80412a, -2, co2.a.SUSPEND).collect(new y1.b(fVar, 20), this);
            if (collect != aVar) {
                collect = Unit.f80348a;
            }
            if (collect == aVar) {
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
