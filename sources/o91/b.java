package o91;

import ao2.j0;
import ao2.v0;
import dl2.j;
import ko2.f;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import n91.t;
import u50.r;

/* loaded from: classes5.dex */
public final class b extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f93817r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e f93818s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ r f93819t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ t f93820u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, r rVar, t tVar, bl2.c cVar) {
        super(2, cVar);
        this.f93818s = eVar;
        this.f93819t = rVar;
        this.f93820u = tVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new b(this.f93818s, this.f93819t, this.f93820u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f93817r;
        if (i13 == 0) {
            ue.c.H(obj);
            f fVar = v0.f20219a;
            ko2.e eVar = ko2.e.f80326c;
            a aVar2 = new a(this.f93818s, this.f93819t, this.f93820u, null);
            this.f93817r = 1;
            if (kotlin.jvm.internal.j.M(this, eVar, aVar2) == aVar) {
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
