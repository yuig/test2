package ads_mobile_sdk;

import a.wc;
import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class yi extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f14258a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zi f14259b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ln0 f14260c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a.ah f14261d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ym0 f14262e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yi(zi ziVar, ln0 ln0Var, a.ah ahVar, ym0 ym0Var, bl2.c cVar) {
        super(2, cVar);
        this.f14259b = ziVar;
        this.f14260c = ln0Var;
        this.f14261d = ahVar;
        this.f14262e = ym0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new yi(this.f14259b, this.f14260c, this.f14261d, this.f14262e, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((yi) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f14258a;
        if (i13 == 0) {
            ue.c.H(obj);
            zi ziVar = this.f14259b;
            ln0 ln0Var = this.f14260c;
            r0 r0Var = ziVar.f12268f;
            y60 b13 = this.f14261d.b();
            this.f14258a = 1;
            if (wc.a(ziVar, ln0Var, r0Var, b13, this) == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        this.f14262e.onPause();
        return Unit.f80348a;
    }
}
