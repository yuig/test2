package aa1;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class s extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f1672r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ p70.e f1673s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ u50.r f1674t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(p70.e eVar, u50.r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f1673s = eVar;
        this.f1674t = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new s(this.f1673s, this.f1674t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((s) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f1672r;
        p70.e eVar = this.f1673s;
        if (i13 == 0) {
            ue.c.H(obj);
            z82.b bVar = (z82.b) eVar.f99072b;
            this.f1672r = 1;
            obj = ((z82.j) bVar).e(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        u50.r rVar = this.f1674t;
        if (booleanValue) {
            rVar.a(l.f1657a);
            ((e92.d) eVar.f99074d).a();
        } else {
            rVar.a(k.f1656a);
        }
        return Unit.f80348a;
    }
}
