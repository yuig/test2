package y3;

import jk.r;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import z3.t;

/* loaded from: classes2.dex */
public final class f extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public boolean f136708r;

    /* renamed from: s, reason: collision with root package name */
    public int f136709s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ float f136710t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ g f136711u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, bl2.c cVar) {
        super(2, cVar);
        this.f136711u = gVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        f fVar = new f(this.f136711u, cVar);
        fVar.f136710t = ((Number) obj).floatValue();
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create(Float.valueOf(((Number) obj).floatValue()), (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        boolean z13;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f136709s;
        if (i13 == 0) {
            ue.c.H(obj);
            float f13 = this.f136710t;
            g gVar = this.f136711u;
            Function2 function2 = (Function2) bs1.c.M0(gVar.f136712a.f140714d, z3.i.f140678e);
            if (function2 == null) {
                r.z("Required value was null.");
                throw null;
            }
            boolean z14 = ((z3.h) gVar.f136712a.f140714d.c(t.f140748q)).f140673c;
            if (z14) {
                f13 = -f13;
            }
            a3.c cVar = new a3.c(com.bumptech.glide.c.d(0.0f, f13));
            this.f136708r = z14;
            this.f136709s = 1;
            obj = function2.invoke(cVar, this);
            if (obj == aVar) {
                return aVar;
            }
            z13 = z14;
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z13 = this.f136708r;
            ue.c.H(obj);
        }
        float e13 = a3.c.e(((a3.c) obj).f482a);
        if (z13) {
            e13 = -e13;
        }
        return new Float(e13);
    }
}
