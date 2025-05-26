package v91;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import lb.l0;

/* loaded from: classes5.dex */
public final class j extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f124986r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ m f124987s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(m mVar, bl2.c cVar) {
        super(2, cVar);
        this.f124987s = mVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new j(this.f124987s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f124986r;
        if (i13 == 0) {
            ue.c.H(obj);
            int i14 = m.f124995l0;
            m mVar = this.f124987s;
            do2.i d2 = ((v) mVar.f124996c0.getValue()).f125014e.d();
            i iVar = new i(mVar, null);
            this.f124986r = 1;
            if (l0.I(d2, iVar, this) == aVar) {
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
