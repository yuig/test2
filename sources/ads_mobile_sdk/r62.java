package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class r62 extends dl2.j implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public mo2.a f10523a;

    /* renamed from: b, reason: collision with root package name */
    public c72 f10524b;

    /* renamed from: c, reason: collision with root package name */
    public int f10525c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c72 f10526d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r62(c72 c72Var, bl2.c cVar) {
        super(1, cVar);
        this.f10526d = c72Var;
    }

    @Override // dl2.a
    public final bl2.c create(bl2.c cVar) {
        return new r62(this.f10526d, cVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new r62(this.f10526d, (bl2.c) obj).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        c72 c72Var;
        Object obj2;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f10525c;
        if (i13 == 0) {
            ue.c.H(obj);
            c72 c72Var2 = this.f10526d;
            mo2.a aVar2 = c72Var2.f3796e;
            this.f10523a = aVar2;
            this.f10524b = c72Var2;
            this.f10525c = 1;
            mo2.c cVar = (mo2.c) aVar2;
            if (cVar.f(null, this) == aVar) {
                return aVar;
            }
            c72Var = c72Var2;
            obj2 = cVar;
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c72Var = this.f10524b;
            Object obj3 = this.f10523a;
            ue.c.H(obj);
            obj2 = obj3;
        }
        try {
            return new zn2.b(c72Var.f3804m);
        } finally {
            ((mo2.c) obj2).i(null);
        }
    }
}
