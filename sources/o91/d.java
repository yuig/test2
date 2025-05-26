package o91;

import ao2.j0;
import ao2.v0;
import dl2.j;
import ko2.f;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import n91.u;
import u50.r;

/* loaded from: classes5.dex */
public final class d extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f93825r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e f93826s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ r f93827t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ u f93828u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, r rVar, u uVar, bl2.c cVar) {
        super(2, cVar);
        this.f93826s = eVar;
        this.f93827t = rVar;
        this.f93828u = uVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new d(this.f93826s, this.f93827t, this.f93828u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f93825r;
        if (i13 == 0) {
            ue.c.H(obj);
            f fVar = v0.f20219a;
            ko2.e eVar = ko2.e.f80326c;
            c cVar = new c(this.f93826s, this.f93827t, this.f93828u, null);
            this.f93825r = 1;
            if (kotlin.jvm.internal.j.M(this, eVar, cVar) == aVar) {
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
