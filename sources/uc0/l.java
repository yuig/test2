package uc0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class l extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f121811r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ m f121812s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ k f121813t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, k kVar, bl2.c cVar) {
        super(2, cVar);
        this.f121812s = mVar;
        this.f121813t = kVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new l(this.f121812s, this.f121813t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f121811r;
        if (i13 == 0) {
            ue.c.H(obj);
            do2.f2 f2Var = this.f121812s.f121826f;
            this.f121811r = 1;
            if (f2Var.emit(this.f121813t, this) == aVar) {
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
