package in0;

import ao2.j0;
import co2.c0;
import dl2.j;
import do2.f0;
import ed.l;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;

/* loaded from: classes5.dex */
public final class c extends j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f72802r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f f72803s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c0 f72804t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, c0 c0Var, bl2.c cVar) {
        super(2, cVar);
        this.f72803s = fVar;
        this.f72804t = c0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new c(this.f72803s, this.f72804t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f72802r;
        int i14 = 1;
        if (i13 == 0) {
            ue.c.H(obj);
            f fVar = this.f72803s;
            fn0.e eVar = fVar.f72809a;
            bl2.c cVar = null;
            if (eVar == null) {
                Intrinsics.r("mediaExtractor");
                throw null;
            }
            eVar.f62614a.seekTo(0L, 0);
            f0 f0Var = new f0(l0.D(new e(fVar, null)), new l(4, cVar));
            fn0.e eVar2 = fVar.f72809a;
            if (eVar2 == null) {
                Intrinsics.r("mediaExtractor");
                throw null;
            }
            h hVar = fVar.f72812d;
            if (hVar == null) {
                Intrinsics.r("renderer");
                throw null;
            }
            hn0.b bVar = new hn0.b(new g(eVar2, this.f72804t, hVar, fVar.f72815g, new jh0.d(fVar, 22)), i14);
            this.f72802r = 1;
            if (f0Var.collect(bVar, this) == aVar) {
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
