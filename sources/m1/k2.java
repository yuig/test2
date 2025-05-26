package m1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class k2 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public o2 f85415r;

    /* renamed from: s, reason: collision with root package name */
    public kotlin.jvm.internal.i0 f85416s;

    /* renamed from: t, reason: collision with root package name */
    public long f85417t;

    /* renamed from: u, reason: collision with root package name */
    public int f85418u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f85419v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o2 f85420w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.i0 f85421x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ long f85422y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(o2 o2Var, kotlin.jvm.internal.i0 i0Var, long j13, bl2.c cVar) {
        super(2, cVar);
        this.f85420w = o2Var;
        this.f85421x = i0Var;
        this.f85422y = j13;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        k2 k2Var = new k2(this.f85420w, this.f85421x, this.f85422y, cVar);
        k2Var.f85419v = obj;
        return k2Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k2) create((l2) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        o2 o2Var;
        kotlin.jvm.internal.i0 i0Var;
        long j13;
        o2 o2Var2;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f85418u;
        if (i13 == 0) {
            ue.c.H(obj);
            l2 l2Var = (l2) this.f85419v;
            o2Var = this.f85420w;
            j2 j2Var = new j2(o2Var, l2Var);
            c1 c1Var = o2Var.f85495c;
            i0Var = this.f85421x;
            long j14 = i0Var.f80432a;
            f1 f1Var = o2Var.f85496d;
            f1 f1Var2 = f1.Horizontal;
            long j15 = this.f85422y;
            float c13 = o2Var.c(f1Var == f1Var2 ? n4.o.d(j15) : n4.o.e(j15));
            this.f85419v = o2Var;
            this.f85415r = o2Var;
            this.f85416s = i0Var;
            this.f85417t = j14;
            this.f85418u = 1;
            obj = c1Var.a(j2Var, c13, this);
            if (obj == aVar) {
                return aVar;
            }
            j13 = j14;
            o2Var2 = o2Var;
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j13 = this.f85417t;
            i0Var = this.f85416s;
            o2Var = this.f85415r;
            o2Var2 = (o2) this.f85419v;
            ue.c.H(obj);
        }
        float c14 = o2Var2.c(((Number) obj).floatValue());
        i0Var.f80432a = o2Var.f85496d == f1.Horizontal ? n4.o.b(j13, c14, 0.0f, 2) : n4.o.b(j13, 0.0f, c14, 1);
        return Unit.f80348a;
    }
}
