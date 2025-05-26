package z01;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import u50.r;

/* loaded from: classes5.dex */
public final class j extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f140558r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ StringBuilder f140559s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ k f140560t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ r f140561u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(StringBuilder sb3, k kVar, r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f140559s = sb3;
        this.f140560t = kVar;
        this.f140561u = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new j(this.f140559s, this.f140560t, this.f140561u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f140558r;
        if (i13 == 0) {
            ue.c.H(obj);
            i iVar = new i(this.f140559s, this.f140560t, this.f140561u, null);
            this.f140558r = 1;
            if (bs1.c.y2(5000L, iVar, this) == aVar) {
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
