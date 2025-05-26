package nb0;

import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class l0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public mo2.a f90258r;

    /* renamed from: s, reason: collision with root package name */
    public p0 f90259s;

    /* renamed from: t, reason: collision with root package name */
    public String f90260t;

    /* renamed from: u, reason: collision with root package name */
    public Set f90261u;

    /* renamed from: v, reason: collision with root package name */
    public int f90262v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p0 f90263w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f90264x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Set f90265y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(p0 p0Var, String str, Set set, bl2.c cVar) {
        super(2, cVar);
        this.f90263w = p0Var;
        this.f90264x = str;
        this.f90265y = set;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new l0(this.f90263w, this.f90264x, this.f90265y, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        p0 p0Var;
        mo2.a f13;
        String str;
        Set set;
        mo2.a aVar;
        p0 p0Var2;
        Set set2;
        String str2;
        cl2.a aVar2 = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f90262v;
        try {
            if (i13 == 0) {
                ue.c.H(obj);
                p0Var = this.f90263w;
                String str3 = this.f90264x;
                f13 = p0.f(p0Var, str3);
                if (f13 == null) {
                    return null;
                }
                this.f90258r = f13;
                this.f90259s = p0Var;
                this.f90260t = str3;
                Set set3 = this.f90265y;
                this.f90261u = set3;
                this.f90262v = 1;
                if (((mo2.c) f13).f(null, this) == aVar2) {
                    return aVar2;
                }
                str = str3;
                set = set3;
            } else {
                if (i13 != 1) {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    set2 = this.f90261u;
                    str2 = this.f90260t;
                    p0Var2 = this.f90259s;
                    aVar = this.f90258r;
                    try {
                        ue.c.H(obj);
                        lb0.m c13 = ((lb0.b) p0Var2.j()).c();
                        c13.putStringSet(str2, set2);
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
                set = this.f90261u;
                str = this.f90260t;
                p0 p0Var3 = this.f90259s;
                mo2.a aVar3 = this.f90258r;
                ue.c.H(obj);
                p0Var = p0Var3;
                f13 = aVar3;
            }
            e e13 = p0.e(p0Var);
            this.f90258r = f13;
            this.f90259s = p0Var;
            this.f90260t = str;
            this.f90261u = set;
            this.f90262v = 2;
            if (e13.m(str, set, this) == aVar2) {
                return aVar2;
            }
            p0Var2 = p0Var;
            set2 = set;
            str2 = str;
            aVar = f13;
            lb0.m c132 = ((lb0.b) p0Var2.j()).c();
            c132.putStringSet(str2, set2);
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
