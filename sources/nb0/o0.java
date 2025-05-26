package nb0;

import android.os.Build;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class o0 extends dl2.j implements Function2 {
    public final /* synthetic */ String A;
    public final /* synthetic */ String B;
    public final /* synthetic */ Boolean C;
    public final /* synthetic */ com.pinterest.encryption.dataEncryptionLibrary.a D;
    public final /* synthetic */ kotlin.jvm.internal.f0 E;

    /* renamed from: r, reason: collision with root package name */
    public mo2.a f90294r;

    /* renamed from: s, reason: collision with root package name */
    public p0 f90295s;

    /* renamed from: t, reason: collision with root package name */
    public String f90296t;

    /* renamed from: u, reason: collision with root package name */
    public String f90297u;

    /* renamed from: v, reason: collision with root package name */
    public Serializable f90298v;

    /* renamed from: w, reason: collision with root package name */
    public com.pinterest.encryption.dataEncryptionLibrary.a f90299w;

    /* renamed from: x, reason: collision with root package name */
    public kotlin.jvm.internal.f0 f90300x;

    /* renamed from: y, reason: collision with root package name */
    public int f90301y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ p0 f90302z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(p0 p0Var, String str, String str2, Boolean bool, com.pinterest.encryption.dataEncryptionLibrary.a aVar, kotlin.jvm.internal.f0 f0Var, bl2.c cVar) {
        super(2, cVar);
        this.f90302z = p0Var;
        this.A = str;
        this.B = str2;
        this.C = bool;
        this.D = aVar;
        this.E = f0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new o0(this.f90302z, this.A, this.B, this.C, this.D, this.E, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        p0 p0Var;
        String str;
        mo2.a aVar;
        String str2;
        kotlin.jvm.internal.f0 f0Var;
        com.pinterest.encryption.dataEncryptionLibrary.a aVar2;
        Boolean bool;
        mo2.a aVar3;
        kotlin.jvm.internal.f0 f0Var2;
        String str3;
        p0 p0Var2;
        String str4;
        cl2.a aVar4 = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f90301y;
        try {
            if (i13 == 0) {
                ue.c.H(obj);
                p0 p0Var3 = this.f90302z;
                String str5 = this.A;
                mo2.a f13 = p0.f(p0Var3, str5);
                if (f13 == null) {
                    return null;
                }
                this.f90294r = f13;
                this.f90295s = p0Var3;
                this.f90296t = str5;
                String str6 = this.B;
                this.f90297u = str6;
                Boolean bool2 = this.C;
                this.f90298v = bool2;
                com.pinterest.encryption.dataEncryptionLibrary.a aVar5 = this.D;
                this.f90299w = aVar5;
                kotlin.jvm.internal.f0 f0Var3 = this.E;
                this.f90300x = f0Var3;
                this.f90301y = 1;
                if (((mo2.c) f13).f(null, this) == aVar4) {
                    return aVar4;
                }
                p0Var = p0Var3;
                str = str5;
                aVar = f13;
                str2 = str6;
                f0Var = f0Var3;
                aVar2 = aVar5;
                bool = bool2;
            } else {
                if (i13 != 1) {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    f0Var2 = (kotlin.jvm.internal.f0) this.f90298v;
                    str4 = this.f90297u;
                    str3 = this.f90296t;
                    p0Var2 = this.f90295s;
                    aVar3 = this.f90294r;
                    try {
                        ue.c.H(obj);
                        f0Var2.f80424a = ((lb0.b) p0Var2.j()).p(str3, str4, null);
                        Unit unit = Unit.f80348a;
                        ((mo2.c) aVar3).i(null);
                        return unit;
                    } catch (Throwable th3) {
                        th = th3;
                        ((mo2.c) aVar3).i(null);
                        throw th;
                    }
                }
                f0Var = this.f90300x;
                com.pinterest.encryption.dataEncryptionLibrary.a aVar6 = this.f90299w;
                Boolean bool3 = (Boolean) this.f90298v;
                String str7 = this.f90297u;
                String str8 = this.f90296t;
                p0 p0Var4 = this.f90295s;
                mo2.a aVar7 = this.f90294r;
                ue.c.H(obj);
                str2 = str7;
                p0Var = p0Var4;
                aVar = aVar7;
                aVar2 = aVar6;
                bool = bool3;
                str = str8;
            }
            e e13 = p0.e(p0Var);
            this.f90294r = aVar;
            this.f90295s = p0Var;
            this.f90296t = str;
            this.f90297u = str2;
            this.f90298v = f0Var;
            this.f90299w = null;
            this.f90300x = null;
            this.f90301y = 2;
            if (e13.b(str, str2, bool, aVar2, Build.VERSION.SDK_INT, this) == aVar4) {
                return aVar4;
            }
            f0Var2 = f0Var;
            str3 = str;
            p0Var2 = p0Var;
            aVar3 = aVar;
            str4 = str2;
            f0Var2.f80424a = ((lb0.b) p0Var2.j()).p(str3, str4, null);
            Unit unit2 = Unit.f80348a;
            ((mo2.c) aVar3).i(null);
            return unit2;
        } catch (Throwable th4) {
            th = th4;
            aVar3 = aVar;
            ((mo2.c) aVar3).i(null);
            throw th;
        }
    }
}
