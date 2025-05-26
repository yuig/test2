package nb0;

import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class f0 extends dl2.j implements Function2 {
    public final /* synthetic */ kotlin.jvm.internal.j0 A;

    /* renamed from: r, reason: collision with root package name */
    public mo2.a f90203r;

    /* renamed from: s, reason: collision with root package name */
    public p0 f90204s;

    /* renamed from: t, reason: collision with root package name */
    public String f90205t;

    /* renamed from: u, reason: collision with root package name */
    public Object f90206u;

    /* renamed from: v, reason: collision with root package name */
    public Object f90207v;

    /* renamed from: w, reason: collision with root package name */
    public int f90208w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ p0 f90209x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f90210y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Set f90211z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(p0 p0Var, String str, Set set, kotlin.jvm.internal.j0 j0Var, bl2.c cVar) {
        super(2, cVar);
        this.f90209x = p0Var;
        this.f90210y = str;
        this.f90211z = set;
        this.A = j0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new f0(this.f90209x, this.f90210y, this.f90211z, this.A, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        Set<String> set;
        p0 p0Var;
        String str;
        kotlin.jvm.internal.j0 j0Var;
        mo2.a aVar;
        mo2.a aVar2;
        Set<String> set2;
        String str2;
        cl2.a aVar3 = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f90208w;
        try {
            if (i13 == 0) {
                ue.c.H(obj);
                p0 p0Var2 = this.f90209x;
                String str3 = this.f90210y;
                mo2.a f13 = p0.f(p0Var2, str3);
                if (f13 == null) {
                    return null;
                }
                this.f90203r = f13;
                this.f90204s = p0Var2;
                this.f90205t = str3;
                set = this.f90211z;
                this.f90206u = set;
                kotlin.jvm.internal.j0 j0Var2 = this.A;
                this.f90207v = j0Var2;
                this.f90208w = 1;
                if (((mo2.c) f13).f(null, this) == aVar3) {
                    return aVar3;
                }
                p0Var = p0Var2;
                str = str3;
                j0Var = j0Var2;
                aVar = f13;
            } else {
                if (i13 != 1) {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    set2 = (Set) this.f90207v;
                    j0Var = (kotlin.jvm.internal.j0) this.f90206u;
                    str2 = this.f90205t;
                    p0Var = this.f90204s;
                    aVar2 = this.f90203r;
                    try {
                        ue.c.H(obj);
                        Set set3 = (Set) obj;
                        p0.g(p0Var, str2, set3, set2);
                        j0Var.f80434a = set3;
                        Unit unit = Unit.f80348a;
                        ((mo2.c) aVar2).i(null);
                        return unit;
                    } catch (Throwable th3) {
                        th = th3;
                        ((mo2.c) aVar2).i(null);
                        throw th;
                    }
                }
                j0Var = (kotlin.jvm.internal.j0) this.f90207v;
                Set<String> set4 = (Set) this.f90206u;
                str = this.f90205t;
                p0 p0Var3 = this.f90204s;
                aVar = this.f90203r;
                ue.c.H(obj);
                set = set4;
                p0Var = p0Var3;
            }
            lb0.b bVar = (lb0.b) p0Var.j();
            bVar.getClass();
            lb0.b.q();
            Object obj2 = bVar.i().get(str);
            Set<String> stringSet = obj2 == lb0.j.f82711a ? set : obj2 != null ? (Set) obj2 : bVar.f82703b.getStringSet(str, set);
            e e13 = p0.e(p0Var);
            this.f90203r = aVar;
            this.f90204s = p0Var;
            this.f90205t = str;
            this.f90206u = j0Var;
            this.f90207v = stringSet;
            this.f90208w = 2;
            Object k13 = e13.k(str, set, this);
            if (k13 == aVar3) {
                return aVar3;
            }
            set2 = stringSet;
            obj = k13;
            str2 = str;
            aVar2 = aVar;
            Set set32 = (Set) obj;
            p0.g(p0Var, str2, set32, set2);
            j0Var.f80434a = set32;
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
