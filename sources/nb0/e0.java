package nb0;

import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class e0 extends dl2.j implements Function2 {
    public final /* synthetic */ kotlin.jvm.internal.j0 A;

    /* renamed from: r, reason: collision with root package name */
    public mo2.a f90191r;

    /* renamed from: s, reason: collision with root package name */
    public p0 f90192s;

    /* renamed from: t, reason: collision with root package name */
    public String f90193t;

    /* renamed from: u, reason: collision with root package name */
    public Serializable f90194u;

    /* renamed from: v, reason: collision with root package name */
    public Serializable f90195v;

    /* renamed from: w, reason: collision with root package name */
    public int f90196w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ p0 f90197x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f90198y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ String f90199z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(p0 p0Var, String str, String str2, kotlin.jvm.internal.j0 j0Var, bl2.c cVar) {
        super(2, cVar);
        this.f90197x = p0Var;
        this.f90198y = str;
        this.f90199z = str2;
        this.A = j0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new e0(this.f90197x, this.f90198y, this.f90199z, this.A, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        String str;
        p0 p0Var;
        String str2;
        kotlin.jvm.internal.j0 j0Var;
        mo2.a aVar;
        mo2.a aVar2;
        String str3;
        String str4;
        cl2.a aVar3 = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f90196w;
        try {
            if (i13 == 0) {
                ue.c.H(obj);
                p0 p0Var2 = this.f90197x;
                String str5 = this.f90198y;
                mo2.a f13 = p0.f(p0Var2, str5);
                if (f13 == null) {
                    return null;
                }
                this.f90191r = f13;
                this.f90192s = p0Var2;
                this.f90193t = str5;
                str = this.f90199z;
                this.f90194u = str;
                kotlin.jvm.internal.j0 j0Var2 = this.A;
                this.f90195v = j0Var2;
                this.f90196w = 1;
                if (((mo2.c) f13).f(null, this) == aVar3) {
                    return aVar3;
                }
                p0Var = p0Var2;
                str2 = str5;
                j0Var = j0Var2;
                aVar = f13;
            } else {
                if (i13 != 1) {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str3 = (String) this.f90195v;
                    j0Var = (kotlin.jvm.internal.j0) this.f90194u;
                    str4 = this.f90193t;
                    p0Var = this.f90192s;
                    aVar2 = this.f90191r;
                    try {
                        ue.c.H(obj);
                        String str6 = (String) obj;
                        p0.g(p0Var, str4, str6, str3);
                        j0Var.f80434a = str6;
                        Unit unit = Unit.f80348a;
                        ((mo2.c) aVar2).i(null);
                        return unit;
                    } catch (Throwable th3) {
                        th = th3;
                        ((mo2.c) aVar2).i(null);
                        throw th;
                    }
                }
                j0Var = (kotlin.jvm.internal.j0) this.f90195v;
                String str7 = (String) this.f90194u;
                str2 = this.f90193t;
                p0 p0Var3 = this.f90192s;
                aVar = this.f90191r;
                ue.c.H(obj);
                str = str7;
                p0Var = p0Var3;
            }
            String j13 = ((lb0.b) p0Var.j()).j(str2, str);
            e e13 = p0.e(p0Var);
            this.f90191r = aVar;
            this.f90192s = p0Var;
            this.f90193t = str2;
            this.f90194u = j0Var;
            this.f90195v = j13;
            this.f90196w = 2;
            Object h10 = e13.h(str2, str, this);
            if (h10 == aVar3) {
                return aVar3;
            }
            str3 = j13;
            obj = h10;
            str4 = str2;
            aVar2 = aVar;
            String str62 = (String) obj;
            p0.g(p0Var, str4, str62, str3);
            j0Var.f80434a = str62;
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
