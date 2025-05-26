package nb0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class n0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public mo2.a f90282r;

    /* renamed from: s, reason: collision with root package name */
    public p0 f90283s;

    /* renamed from: t, reason: collision with root package name */
    public String f90284t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f90285u;

    /* renamed from: v, reason: collision with root package name */
    public int f90286v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p0 f90287w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f90288x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ boolean f90289y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(p0 p0Var, String str, boolean z13, bl2.c cVar) {
        super(2, cVar);
        this.f90287w = p0Var;
        this.f90288x = str;
        this.f90289y = z13;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new n0(this.f90287w, this.f90288x, this.f90289y, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        p0 p0Var;
        mo2.a f13;
        String str;
        boolean z13;
        mo2.a aVar;
        p0 p0Var2;
        boolean z14;
        String str2;
        cl2.a aVar2 = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f90286v;
        try {
            if (i13 == 0) {
                ue.c.H(obj);
                p0Var = this.f90287w;
                String str3 = this.f90288x;
                f13 = p0.f(p0Var, str3);
                if (f13 == null) {
                    return null;
                }
                this.f90282r = f13;
                this.f90283s = p0Var;
                this.f90284t = str3;
                boolean z15 = this.f90289y;
                this.f90285u = z15;
                this.f90286v = 1;
                if (((mo2.c) f13).f(null, this) == aVar2) {
                    return aVar2;
                }
                str = str3;
                z13 = z15;
            } else {
                if (i13 != 1) {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z14 = this.f90285u;
                    str2 = this.f90284t;
                    p0Var2 = this.f90283s;
                    aVar = this.f90282r;
                    try {
                        ue.c.H(obj);
                        lb0.m c13 = ((lb0.b) p0Var2.j()).c();
                        c13.putBoolean(str2, z14);
                        c13.apply();
                        Unit unit = Unit.f80348a;
                        ((mo2.c) aVar).i(null);
                        return unit;
                    } catch (Throwable th3) {
                        th = th3;
                        ((mo2.c) aVar).i(null);
                        throw th;
                    }
                }
                z13 = this.f90285u;
                str = this.f90284t;
                p0 p0Var3 = this.f90283s;
                mo2.a aVar3 = this.f90282r;
                ue.c.H(obj);
                p0Var = p0Var3;
                f13 = aVar3;
            }
            e e13 = p0.e(p0Var);
            this.f90282r = f13;
            this.f90283s = p0Var;
            this.f90284t = str;
            this.f90285u = z13;
            this.f90286v = 2;
            if (e13.l(str, this, z13) == aVar2) {
                return aVar2;
            }
            p0Var2 = p0Var;
            z14 = z13;
            str2 = str;
            aVar = f13;
            lb0.m c132 = ((lb0.b) p0Var2.j()).c();
            c132.putBoolean(str2, z14);
            c132.apply();
            Unit unit2 = Unit.f80348a;
            ((mo2.c) aVar).i(null);
            return unit2;
        } catch (Throwable th4) {
            th = th4;
            aVar = f13;
            ((mo2.c) aVar).i(null);
            throw th;
        }
    }
}
