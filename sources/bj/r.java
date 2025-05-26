package bj;

import ads_mobile_sdk.f52;
import ads_mobile_sdk.r32;
import ads_mobile_sdk.xz0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class r extends dl2.j implements Function1 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f22935r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ l f22936s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ r32 f22937t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(r32 r32Var, l lVar, bl2.c cVar, int i13) {
        super(1, cVar);
        this.f22935r = i13;
        this.f22937t = r32Var;
        this.f22936s = lVar;
    }

    @Override // dl2.a
    public final bl2.c create(bl2.c cVar) {
        int i13 = this.f22935r;
        l lVar = this.f22936s;
        r32 r32Var = this.f22937t;
        switch (i13) {
            case 0:
                return new r(r32Var, lVar, cVar, 0);
            default:
                return new r((f52) r32Var, lVar, cVar, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f22935r;
        l lVar = this.f22936s;
        r32 r32Var = this.f22937t;
        switch (i13) {
            case 0:
                return new r(r32Var, lVar, (bl2.c) obj, 0).invokeSuspend(Unit.f80348a);
            default:
                return new r((f52) r32Var, lVar, (bl2.c) obj, 1).invokeSuspend(Unit.f80348a);
        }
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        int i13 = this.f22935r;
        l lVar = this.f22936s;
        r32 r32Var = this.f22937t;
        switch (i13) {
            case 0:
                cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
                ue.c.H(obj);
                r32Var.a(new xz0(lVar));
                break;
            default:
                cl2.a aVar2 = cl2.a.COROUTINE_SUSPENDED;
                ue.c.H(obj);
                ((f52) r32Var).a(new xz0(lVar));
                break;
        }
        return Unit.f80348a;
    }
}
