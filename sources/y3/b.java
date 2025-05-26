package y3;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class b extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f136688r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g f136689s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Runnable f136690t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(g gVar, Runnable runnable, bl2.c cVar) {
        super(2, cVar);
        this.f136689s = gVar;
        this.f136690t = runnable;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new b(this.f136689s, this.f136690t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f136688r;
        g gVar = this.f136689s;
        if (i13 == 0) {
            ue.c.H(obj);
            k kVar = gVar.f136716e;
            this.f136688r = 1;
            Object a13 = kVar.a(0.0f - kVar.f136726c, this);
            if (a13 != aVar) {
                a13 = Unit.f80348a;
            }
            if (a13 == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        m mVar = (m) gVar.f136714c;
        mVar.f136728a.setValue(Boolean.FALSE);
        this.f136690t.run();
        return Unit.f80348a;
    }
}
