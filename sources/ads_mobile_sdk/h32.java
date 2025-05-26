package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class h32 extends dl2.j implements kl2.l {

    /* renamed from: a, reason: collision with root package name */
    public int f5828a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ do2.j f5829b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Throwable f5830c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r32 f5831d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h32(r32 r32Var, bl2.c cVar) {
        super(3, cVar);
        this.f5831d = r32Var;
    }

    @Override // kl2.l
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        h32 h32Var = new h32(this.f5831d, (bl2.c) obj3);
        h32Var.f5829b = (do2.j) obj;
        h32Var.f5830c = (Throwable) obj2;
        return h32Var.invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f5828a;
        if (i13 == 0) {
            ue.c.H(obj);
            do2.j jVar = this.f5829b;
            Throwable th3 = this.f5830c;
            gk0.c("Ad failed to load", th3);
            r32 r32Var = this.f5831d;
            kk0 error = new kk0(th3, null, 0 == true ? 1 : 0, 6);
            r32Var.getClass();
            Intrinsics.checkNotNullParameter(error, "error");
            s32 s32Var = new s32(new wi.r(error.a().a(), a.bb.d(error), null));
            this.f5829b = null;
            this.f5828a = 1;
            if (jVar.emit(s32Var, this) == aVar) {
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
