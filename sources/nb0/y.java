package nb0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class y extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f90333r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ p0 f90334s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f90335t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(p0 p0Var, String str, bl2.c cVar) {
        super(2, cVar);
        this.f90334s = p0Var;
        this.f90335t = str;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new y(this.f90334s, this.f90335t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((y) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f90333r;
        if (i13 == 0) {
            ue.c.H(obj);
            e e13 = p0.e(this.f90334s);
            this.f90333r = 1;
            obj = e13.j(this.f90335t, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        return obj;
    }
}
