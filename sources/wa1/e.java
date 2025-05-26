package wa1;

import ao2.j0;
import ao2.v0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import va1.e1;

/* loaded from: classes5.dex */
public final class e extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f128637r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ k f128638s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ e1 f128639t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(k kVar, e1 e1Var, bl2.c cVar) {
        super(2, cVar);
        this.f128638s = kVar;
        this.f128639t = e1Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new e(this.f128638s, this.f128639t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f128637r;
        if (i13 == 0) {
            ue.c.H(obj);
            ko2.f fVar = v0.f20219a;
            ko2.e eVar = ko2.e.f80326c;
            d dVar = new d(this.f128638s, this.f128639t, null);
            this.f128637r = 1;
            if (kotlin.jvm.internal.j.M(this, eVar, dVar) == aVar) {
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
