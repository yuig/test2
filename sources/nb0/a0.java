package nb0;

import android.os.Build;
import java.io.Serializable;
import java.util.Base64;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a0 extends dl2.j implements Function2 {
    public final /* synthetic */ kotlin.jvm.internal.j0 A;

    /* renamed from: r, reason: collision with root package name */
    public mo2.a f90153r;

    /* renamed from: s, reason: collision with root package name */
    public p0 f90154s;

    /* renamed from: t, reason: collision with root package name */
    public String f90155t;

    /* renamed from: u, reason: collision with root package name */
    public Serializable f90156u;

    /* renamed from: v, reason: collision with root package name */
    public Serializable f90157v;

    /* renamed from: w, reason: collision with root package name */
    public int f90158w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ p0 f90159x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f90160y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ String f90161z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(p0 p0Var, String str, String str2, kotlin.jvm.internal.j0 j0Var, bl2.c cVar) {
        super(2, cVar);
        this.f90159x = p0Var;
        this.f90160y = str;
        this.f90161z = str2;
        this.A = j0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new a0(this.f90159x, this.f90160y, this.f90161z, this.A, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        p0 p0Var;
        String str;
        mo2.a aVar;
        String str2;
        kotlin.jvm.internal.j0 j0Var;
        mo2.a aVar2;
        Object g13;
        String str3;
        p0 p0Var2;
        String str4;
        cl2.a aVar3 = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f90158w;
        try {
            if (i13 == 0) {
                ue.c.H(obj);
                p0 p0Var3 = this.f90159x;
                String str5 = this.f90160y;
                mo2.a f13 = p0.f(p0Var3, str5);
                if (f13 == null) {
                    return null;
                }
                this.f90153r = f13;
                this.f90154s = p0Var3;
                this.f90155t = str5;
                String str6 = this.f90161z;
                this.f90156u = str6;
                kotlin.jvm.internal.j0 j0Var2 = this.A;
                this.f90157v = j0Var2;
                this.f90158w = 1;
                if (((mo2.c) f13).f(null, this) == aVar3) {
                    return aVar3;
                }
                p0Var = p0Var3;
                str = str5;
                aVar = f13;
                str2 = str6;
                j0Var = j0Var2;
            } else {
                if (i13 != 1) {
                    if (i13 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str4 = (String) this.f90157v;
                    kotlin.jvm.internal.j0 j0Var3 = (kotlin.jvm.internal.j0) this.f90156u;
                    str3 = this.f90155t;
                    p0Var2 = this.f90154s;
                    aVar2 = this.f90153r;
                    try {
                        ue.c.H(obj);
                        j0Var = j0Var3;
                        g13 = obj;
                        String str7 = (String) g13;
                        p0.g(p0Var2, str3, str7, str4);
                        j0Var.f80434a = str7;
                        Unit unit = Unit.f80348a;
                        ((mo2.c) aVar2).i(null);
                        return unit;
                    } catch (Throwable th3) {
                        th = th3;
                        ((mo2.c) aVar2).i(null);
                        throw th;
                    }
                }
                kotlin.jvm.internal.j0 j0Var4 = (kotlin.jvm.internal.j0) this.f90157v;
                str2 = (String) this.f90156u;
                String str8 = this.f90155t;
                p0 p0Var4 = this.f90154s;
                mo2.a aVar4 = this.f90153r;
                ue.c.H(obj);
                j0Var = j0Var4;
                str = str8;
                p0Var = p0Var4;
                aVar = aVar4;
            }
            String d2 = ((lb0.b) p0Var.j()).d(str, str2);
            e e13 = p0.e(p0Var);
            com.pinterest.encryption.dataEncryptionLibrary.a a13 = lb0.t.a();
            this.f90153r = aVar;
            this.f90154s = p0Var;
            this.f90155t = str;
            this.f90156u = j0Var;
            this.f90157v = d2;
            this.f90158w = 2;
            int i14 = Build.VERSION.SDK_INT;
            Base64.Decoder decoder = Base64.getDecoder();
            Intrinsics.checkNotNullExpressionValue(decoder, "getDecoder(...)");
            g13 = e13.g(str, str2, i14, a13, decoder, this);
            if (g13 == aVar3) {
                return aVar3;
            }
            str3 = str;
            p0Var2 = p0Var;
            aVar2 = aVar;
            str4 = d2;
            String str72 = (String) g13;
            p0.g(p0Var2, str3, str72, str4);
            j0Var.f80434a = str72;
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
