package nb0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class d0 extends dl2.j implements Function2 {
    public final /* synthetic */ kotlin.jvm.internal.i0 A;

    /* renamed from: r, reason: collision with root package name */
    public mo2.a f90182r;

    /* renamed from: s, reason: collision with root package name */
    public p0 f90183s;

    /* renamed from: t, reason: collision with root package name */
    public String f90184t;

    /* renamed from: u, reason: collision with root package name */
    public kotlin.jvm.internal.i0 f90185u;

    /* renamed from: v, reason: collision with root package name */
    public long f90186v;

    /* renamed from: w, reason: collision with root package name */
    public int f90187w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ p0 f90188x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f90189y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ long f90190z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(p0 p0Var, String str, long j13, kotlin.jvm.internal.i0 i0Var, bl2.c cVar) {
        super(2, cVar);
        this.f90188x = p0Var;
        this.f90189y = str;
        this.f90190z = j13;
        this.A = i0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new d0(this.f90188x, this.f90189y, this.f90190z, this.A, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        long j13;
        String str;
        kotlin.jvm.internal.i0 i0Var;
        mo2.a aVar;
        p0 p0Var;
        kotlin.jvm.internal.i0 i0Var2;
        long j14;
        cl2.a aVar2 = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f90187w;
        try {
            if (i13 == 0) {
                ue.c.H(obj);
                p0 p0Var2 = this.f90188x;
                String str2 = this.f90189y;
                mo2.a f13 = p0.f(p0Var2, str2);
                if (f13 == null) {
                    return null;
                }
                this.f90182r = f13;
                this.f90183s = p0Var2;
                this.f90184t = str2;
                kotlin.jvm.internal.i0 i0Var3 = this.A;
                this.f90185u = i0Var3;
                j13 = this.f90190z;
                this.f90186v = j13;
                this.f90187w = 1;
                if (((mo2.c) f13).f(null, this) == aVar2) {
                    return aVar2;
                }
                str = str2;
                i0Var = i0Var3;
                aVar = f13;
                p0Var = p0Var2;
            } else {
                if (i13 != 1) {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j14 = this.f90186v;
                    i0Var2 = this.f90185u;
                    str = this.f90184t;
                    p0Var = this.f90183s;
                    aVar = this.f90182r;
                    ue.c.H(obj);
                    long longValue = ((Number) obj).longValue();
                    p0.g(p0Var, str, new Long(longValue), new Long(j14));
                    i0Var2.f80432a = longValue;
                    return Unit.f80348a;
                }
                long j15 = this.f90186v;
                i0Var = this.f90185u;
                str = this.f90184t;
                p0 p0Var3 = this.f90183s;
                mo2.a aVar3 = this.f90182r;
                ue.c.H(obj);
                p0Var = p0Var3;
                aVar = aVar3;
                j13 = j15;
            }
            long g13 = ((lb0.b) p0Var.j()).g(str, j13);
            e e13 = p0.e(p0Var);
            this.f90182r = aVar;
            this.f90183s = p0Var;
            this.f90184t = str;
            this.f90185u = i0Var;
            this.f90186v = g13;
            this.f90187w = 2;
            obj = e13.e(str, j13, this);
            if (obj == aVar2) {
                return aVar2;
            }
            i0Var2 = i0Var;
            j14 = g13;
            long longValue2 = ((Number) obj).longValue();
            p0.g(p0Var, str, new Long(longValue2), new Long(j14));
            i0Var2.f80432a = longValue2;
            return Unit.f80348a;
        } finally {
            ((mo2.c) aVar).i(null);
        }
    }
}
