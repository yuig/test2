package nb0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class k0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public mo2.a f90246r;

    /* renamed from: s, reason: collision with root package name */
    public p0 f90247s;

    /* renamed from: t, reason: collision with root package name */
    public String f90248t;

    /* renamed from: u, reason: collision with root package name */
    public int f90249u;

    /* renamed from: v, reason: collision with root package name */
    public int f90250v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p0 f90251w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f90252x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f90253y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(p0 p0Var, String str, int i13, bl2.c cVar) {
        super(2, cVar);
        this.f90251w = p0Var;
        this.f90252x = str;
        this.f90253y = i13;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new k0(this.f90251w, this.f90252x, this.f90253y, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        p0 p0Var;
        mo2.a f13;
        String str;
        int i13;
        mo2.a aVar;
        p0 p0Var2;
        int i14;
        String str2;
        cl2.a aVar2 = cl2.a.COROUTINE_SUSPENDED;
        int i15 = this.f90250v;
        try {
            if (i15 == 0) {
                ue.c.H(obj);
                p0Var = this.f90251w;
                String str3 = this.f90252x;
                f13 = p0.f(p0Var, str3);
                if (f13 == null) {
                    return null;
                }
                this.f90246r = f13;
                this.f90247s = p0Var;
                this.f90248t = str3;
                int i16 = this.f90253y;
                this.f90249u = i16;
                this.f90250v = 1;
                if (((mo2.c) f13).f(null, this) == aVar2) {
                    return aVar2;
                }
                str = str3;
                i13 = i16;
            } else {
                if (i15 != 1) {
                    if (i15 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i14 = this.f90249u;
                    str2 = this.f90248t;
                    p0Var2 = this.f90247s;
                    aVar = this.f90246r;
                    try {
                        ue.c.H(obj);
                        lb0.m c13 = ((lb0.b) p0Var2.j()).c();
                        c13.putInt(str2, i14);
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
                i13 = this.f90249u;
                str = this.f90248t;
                p0 p0Var3 = this.f90247s;
                mo2.a aVar3 = this.f90246r;
                ue.c.H(obj);
                p0Var = p0Var3;
                f13 = aVar3;
            }
            e e13 = p0.e(p0Var);
            this.f90246r = f13;
            this.f90247s = p0Var;
            this.f90248t = str;
            this.f90249u = i13;
            this.f90250v = 2;
            if (e13.d(str, i13, this) == aVar2) {
                return aVar2;
            }
            p0Var2 = p0Var;
            i14 = i13;
            str2 = str;
            aVar = f13;
            lb0.m c132 = ((lb0.b) p0Var2.j()).c();
            c132.putInt(str2, i14);
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
