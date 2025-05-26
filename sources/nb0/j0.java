package nb0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class j0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public mo2.a f90234r;

    /* renamed from: s, reason: collision with root package name */
    public p0 f90235s;

    /* renamed from: t, reason: collision with root package name */
    public String f90236t;

    /* renamed from: u, reason: collision with root package name */
    public long f90237u;

    /* renamed from: v, reason: collision with root package name */
    public int f90238v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p0 f90239w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f90240x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ long f90241y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(p0 p0Var, String str, long j13, bl2.c cVar) {
        super(2, cVar);
        this.f90239w = p0Var;
        this.f90240x = str;
        this.f90241y = j13;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new j0(this.f90239w, this.f90240x, this.f90241y, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        String str;
        p0 p0Var;
        mo2.a aVar;
        long j13;
        mo2.a aVar2;
        String str2;
        long j14;
        cl2.a aVar3 = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f90238v;
        try {
            if (i13 == 0) {
                ue.c.H(obj);
                p0 p0Var2 = this.f90239w;
                str = this.f90240x;
                mo2.a f13 = p0.f(p0Var2, str);
                if (f13 == null) {
                    return null;
                }
                this.f90234r = f13;
                this.f90235s = p0Var2;
                this.f90236t = str;
                long j15 = this.f90241y;
                this.f90237u = j15;
                this.f90238v = 1;
                if (((mo2.c) f13).f(null, this) == aVar3) {
                    return aVar3;
                }
                p0Var = p0Var2;
                aVar = f13;
                j13 = j15;
            } else {
                if (i13 != 1) {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j14 = this.f90237u;
                    str2 = this.f90236t;
                    p0Var = this.f90235s;
                    aVar2 = this.f90234r;
                    try {
                        ue.c.H(obj);
                        lb0.m c13 = ((lb0.b) p0Var.j()).c();
                        c13.putLong(str2, j14);
                        c13.apply();
                        Unit unit = Unit.f80348a;
                        ((mo2.c) aVar2).i(null);
                        return unit;
                    } catch (Throwable th3) {
                        th = th3;
                        ((mo2.c) aVar2).i(null);
                        throw th;
                    }
                }
                j13 = this.f90237u;
                str = this.f90236t;
                p0Var = this.f90235s;
                aVar = this.f90234r;
                ue.c.H(obj);
            }
            e e13 = p0.e(p0Var);
            this.f90234r = aVar;
            this.f90235s = p0Var;
            this.f90236t = str;
            this.f90237u = j13;
            this.f90238v = 2;
            if (e13.f(str, j13, this) == aVar3) {
                return aVar3;
            }
            str2 = str;
            j14 = j13;
            aVar2 = aVar;
            lb0.m c132 = ((lb0.b) p0Var.j()).c();
            c132.putLong(str2, j14);
            c132.apply();
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
