package nb0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class c0 extends dl2.j implements Function2 {
    public final /* synthetic */ kotlin.jvm.internal.h0 A;

    /* renamed from: r, reason: collision with root package name */
    public mo2.a f90171r;

    /* renamed from: s, reason: collision with root package name */
    public p0 f90172s;

    /* renamed from: t, reason: collision with root package name */
    public String f90173t;

    /* renamed from: u, reason: collision with root package name */
    public kotlin.jvm.internal.h0 f90174u;

    /* renamed from: v, reason: collision with root package name */
    public int f90175v;

    /* renamed from: w, reason: collision with root package name */
    public int f90176w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ p0 f90177x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f90178y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f90179z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(p0 p0Var, String str, int i13, kotlin.jvm.internal.h0 h0Var, bl2.c cVar) {
        super(2, cVar);
        this.f90177x = p0Var;
        this.f90178y = str;
        this.f90179z = i13;
        this.A = h0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new c0(this.f90177x, this.f90178y, this.f90179z, this.A, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        p0 p0Var;
        kotlin.jvm.internal.h0 h0Var;
        String str;
        int i13;
        mo2.a aVar;
        mo2.a aVar2;
        String str2;
        int i14;
        p0 p0Var2;
        kotlin.jvm.internal.h0 h0Var2;
        cl2.a aVar3 = cl2.a.COROUTINE_SUSPENDED;
        int i15 = this.f90176w;
        try {
            if (i15 == 0) {
                ue.c.H(obj);
                p0Var = this.f90177x;
                String str3 = this.f90178y;
                mo2.a f13 = p0.f(p0Var, str3);
                if (f13 == null) {
                    return null;
                }
                this.f90171r = f13;
                this.f90172s = p0Var;
                this.f90173t = str3;
                kotlin.jvm.internal.h0 h0Var3 = this.A;
                this.f90174u = h0Var3;
                int i16 = this.f90179z;
                this.f90175v = i16;
                this.f90176w = 1;
                if (((mo2.c) f13).f(null, this) == aVar3) {
                    return aVar3;
                }
                h0Var = h0Var3;
                str = str3;
                i13 = i16;
                aVar = f13;
            } else {
                if (i15 != 1) {
                    if (i15 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i14 = this.f90175v;
                    h0Var2 = this.f90174u;
                    str2 = this.f90173t;
                    p0Var2 = this.f90172s;
                    aVar2 = this.f90171r;
                    try {
                        ue.c.H(obj);
                        int intValue = ((Number) obj).intValue();
                        p0.g(p0Var2, str2, new Integer(intValue), new Integer(i14));
                        h0Var2.f80426a = intValue;
                        Unit unit = Unit.f80348a;
                        ((mo2.c) aVar2).i(null);
                        return unit;
                    } catch (Throwable th3) {
                        th = th3;
                        ((mo2.c) aVar2).i(null);
                        throw th;
                    }
                }
                i13 = this.f90175v;
                h0Var = this.f90174u;
                str = this.f90173t;
                p0 p0Var3 = this.f90172s;
                aVar = this.f90171r;
                ue.c.H(obj);
                p0Var = p0Var3;
            }
            int f14 = ((lb0.b) p0Var.j()).f(str, i13);
            e e13 = p0.e(p0Var);
            this.f90171r = aVar;
            this.f90172s = p0Var;
            this.f90173t = str;
            this.f90174u = h0Var;
            this.f90175v = f14;
            this.f90176w = 2;
            Object a13 = e13.a(str, i13, this);
            if (a13 == aVar3) {
                return aVar3;
            }
            str2 = str;
            i14 = f14;
            aVar2 = aVar;
            kotlin.jvm.internal.h0 h0Var4 = h0Var;
            p0Var2 = p0Var;
            obj = a13;
            h0Var2 = h0Var4;
            int intValue2 = ((Number) obj).intValue();
            p0.g(p0Var2, str2, new Integer(intValue2), new Integer(i14));
            h0Var2.f80426a = intValue2;
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
