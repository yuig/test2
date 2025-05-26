package a6;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class h0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f842r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Function2 f843s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f844t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(Function2 function2, Object obj, bl2.c cVar) {
        super(2, cVar);
        this.f843s = function2;
        this.f844t = obj;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new h0(this.f843s, this.f844t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f842r;
        if (i13 == 0) {
            ue.c.H(obj);
            this.f842r = 1;
            obj = this.f843s.invoke(this.f844t, this);
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
