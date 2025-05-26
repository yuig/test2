package nb0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class m0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public mo2.a f90270r;

    /* renamed from: s, reason: collision with root package name */
    public p0 f90271s;

    /* renamed from: t, reason: collision with root package name */
    public String f90272t;

    /* renamed from: u, reason: collision with root package name */
    public String f90273u;

    /* renamed from: v, reason: collision with root package name */
    public int f90274v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p0 f90275w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f90276x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f90277y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(p0 p0Var, String str, String str2, bl2.c cVar) {
        super(2, cVar);
        this.f90275w = p0Var;
        this.f90276x = str;
        this.f90277y = str2;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new m0(this.f90275w, this.f90276x, this.f90277y, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        p0 p0Var;
        mo2.a f13;
        String str;
        String str2;
        mo2.a aVar;
        p0 p0Var2;
        String str3;
        String str4;
        cl2.a aVar2 = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f90274v;
        try {
            if (i13 == 0) {
                ue.c.H(obj);
                p0Var = this.f90275w;
                String str5 = this.f90276x;
                f13 = p0.f(p0Var, str5);
                if (f13 == null) {
                    return null;
                }
                this.f90270r = f13;
                this.f90271s = p0Var;
                this.f90272t = str5;
                String str6 = this.f90277y;
                this.f90273u = str6;
                this.f90274v = 1;
                if (((mo2.c) f13).f(null, this) == aVar2) {
                    return aVar2;
                }
                str = str5;
                str2 = str6;
            } else {
                if (i13 != 1) {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str3 = this.f90273u;
                    str4 = this.f90272t;
                    p0Var2 = this.f90271s;
                    aVar = this.f90270r;
                    try {
                        ue.c.H(obj);
                        lb0.m c13 = ((lb0.b) p0Var2.j()).c();
                        c13.putString(str4, str3);
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
                str2 = this.f90273u;
                str = this.f90272t;
                p0 p0Var3 = this.f90271s;
                mo2.a aVar3 = this.f90270r;
                ue.c.H(obj);
                p0Var = p0Var3;
                f13 = aVar3;
            }
            e e13 = p0.e(p0Var);
            this.f90270r = f13;
            this.f90271s = p0Var;
            this.f90272t = str;
            this.f90273u = str2;
            this.f90274v = 2;
            if (e13.i(str, str2, this) == aVar2) {
                return aVar2;
            }
            p0Var2 = p0Var;
            str3 = str2;
            str4 = str;
            aVar = f13;
            lb0.m c132 = ((lb0.b) p0Var2.j()).c();
            c132.putString(str4, str3);
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
