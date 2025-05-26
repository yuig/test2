package t1;

import ao2.j0;
import kh2.b0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import s3.q1;

/* loaded from: classes2.dex */
public final class i extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f115752r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ k f115753s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Function0 f115754t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, Function0 function0, bl2.c cVar) {
        super(2, cVar);
        this.f115753s = kVar;
        this.f115754t = function0;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new i(this.f115753s, this.f115754t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        a aVar;
        cl2.a aVar2 = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f115752r;
        if (i13 == 0) {
            ue.c.H(obj);
            k kVar = this.f115753s;
            if (kVar.f120054m) {
                if (kVar.f120042a.f120054m) {
                    aVar = (a) b0.f0(kVar, k.f115760p);
                    if (aVar == null) {
                        aVar = new l(kVar);
                    }
                } else {
                    aVar = null;
                }
                if (aVar != null) {
                    q1 T0 = com.bumptech.glide.c.T0(kVar);
                    this.f115752r = 1;
                    if (aVar.j(T0, this.f115754t, this) == aVar2) {
                        return aVar2;
                    }
                }
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
