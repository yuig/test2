package nb0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class b0 extends dl2.j implements Function2 {
    public final /* synthetic */ kotlin.jvm.internal.f0 A;

    /* renamed from: r, reason: collision with root package name */
    public mo2.a f90162r;

    /* renamed from: s, reason: collision with root package name */
    public p0 f90163s;

    /* renamed from: t, reason: collision with root package name */
    public String f90164t;

    /* renamed from: u, reason: collision with root package name */
    public kotlin.jvm.internal.f0 f90165u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f90166v;

    /* renamed from: w, reason: collision with root package name */
    public int f90167w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ p0 f90168x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f90169y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ boolean f90170z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(p0 p0Var, String str, boolean z13, kotlin.jvm.internal.f0 f0Var, bl2.c cVar) {
        super(2, cVar);
        this.f90168x = p0Var;
        this.f90169y = str;
        this.f90170z = z13;
        this.A = f0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new b0(this.f90168x, this.f90169y, this.f90170z, this.A, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        p0 p0Var;
        kotlin.jvm.internal.f0 f0Var;
        String str;
        boolean z13;
        mo2.a aVar;
        mo2.a aVar2;
        String str2;
        boolean z14;
        p0 p0Var2;
        kotlin.jvm.internal.f0 f0Var2;
        cl2.a aVar3 = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f90167w;
        try {
            if (i13 == 0) {
                ue.c.H(obj);
                p0Var = this.f90168x;
                String str3 = this.f90169y;
                mo2.a f13 = p0.f(p0Var, str3);
                if (f13 == null) {
                    return null;
                }
                this.f90162r = f13;
                this.f90163s = p0Var;
                this.f90164t = str3;
                kotlin.jvm.internal.f0 f0Var3 = this.A;
                this.f90165u = f0Var3;
                boolean z15 = this.f90170z;
                this.f90166v = z15;
                this.f90167w = 1;
                if (((mo2.c) f13).f(null, this) == aVar3) {
                    return aVar3;
                }
                f0Var = f0Var3;
                str = str3;
                z13 = z15;
                aVar = f13;
            } else {
                if (i13 != 1) {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z14 = this.f90166v;
                    f0Var2 = this.f90165u;
                    str2 = this.f90164t;
                    p0Var2 = this.f90163s;
                    aVar2 = this.f90162r;
                    try {
                        ue.c.H(obj);
                        Boolean bool = (Boolean) obj;
                        boolean booleanValue = bool.booleanValue();
                        p0.g(p0Var2, str2, bool, Boolean.valueOf(z14));
                        f0Var2.f80424a = booleanValue;
                        Unit unit = Unit.f80348a;
                        ((mo2.c) aVar2).i(null);
                        return unit;
                    } catch (Throwable th3) {
                        th = th3;
                        ((mo2.c) aVar2).i(null);
                        throw th;
                    }
                }
                z13 = this.f90166v;
                f0Var = this.f90165u;
                str = this.f90164t;
                p0 p0Var3 = this.f90163s;
                aVar = this.f90162r;
                ue.c.H(obj);
                p0Var = p0Var3;
            }
            boolean e13 = ((lb0.b) p0Var.j()).e(str, z13);
            e e14 = p0.e(p0Var);
            this.f90162r = aVar;
            this.f90163s = p0Var;
            this.f90164t = str;
            this.f90165u = f0Var;
            this.f90166v = e13;
            this.f90167w = 2;
            Object c13 = e14.c(str, this, z13);
            if (c13 == aVar3) {
                return aVar3;
            }
            str2 = str;
            z14 = e13;
            aVar2 = aVar;
            kotlin.jvm.internal.f0 f0Var4 = f0Var;
            p0Var2 = p0Var;
            obj = c13;
            f0Var2 = f0Var4;
            Boolean bool2 = (Boolean) obj;
            boolean booleanValue2 = bool2.booleanValue();
            p0.g(p0Var2, str2, bool2, Boolean.valueOf(z14));
            f0Var2.f80424a = booleanValue2;
            Unit unit2 = Unit.f80348a;
            ((mo2.c) aVar2).i(null);
            return unit2;
        } catch (Throwable th4) {
            th = th4;
            aVar2 = aVar;
            ((mo2.c) aVar2).i(null);
            throw th;
        }
    }
}
