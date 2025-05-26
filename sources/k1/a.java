package k1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class a extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f77798r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ o1.l f77799s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ o1.h f77800t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(o1.l lVar, o1.h hVar, bl2.c cVar) {
        super(2, cVar);
        this.f77799s = lVar;
        this.f77800t = hVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new a(this.f77799s, this.f77800t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f77798r;
        if (i13 == 0) {
            ue.c.H(obj);
            this.f77798r = 1;
            if (this.f77799s.a(this.f77800t, this) == aVar) {
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
