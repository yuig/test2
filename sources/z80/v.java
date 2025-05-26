package z80;

import ao2.j0;
import ao2.v0;
import kh2.g3;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import s80.m1;
import s80.o1;
import s80.w5;
import s80.z5;

/* loaded from: classes5.dex */
public final class v extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f141093r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f141094s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ x f141095t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ u50.r f141096u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ z5 f141097v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(x xVar, u50.r rVar, z5 z5Var, bl2.c cVar) {
        super(2, cVar);
        this.f141095t = xVar;
        this.f141096u = rVar;
        this.f141097v = z5Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        v vVar = new v(this.f141095t, this.f141096u, this.f141097v, cVar);
        vVar.f141094s = obj;
        return vVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((v) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f141093r;
        x xVar = this.f141095t;
        if (i13 == 0) {
            ue.c.H(obj);
            j0 j0Var = (j0) this.f141094s;
            x80.c cVar = xVar.f141101a;
            this.f141094s = j0Var;
            this.f141093r = 1;
            cVar.getClass();
            ko2.f fVar = v0.f20219a;
            obj = kotlin.jvm.internal.j.M(this, ko2.e.f80326c, new x80.b(cVar, null));
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        y80.a aVar2 = (y80.a) obj;
        u50.r rVar = this.f141096u;
        if (aVar2 == null) {
            rVar.a(new m1(false));
            return Unit.f80348a;
        }
        rVar.a(new o1(((w5) this.f141097v).f111839a, g3.B2(aVar2, xVar.f141103c)));
        return Unit.f80348a;
    }
}
