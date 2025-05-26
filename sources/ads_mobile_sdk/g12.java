package ads_mobile_sdk;

import a.o3;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class g12 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f5351a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f5352b;

    public g12(e12 e12Var) {
        this.f5351a = new HashMap(e12Var.f4573a);
        this.f5352b = new HashMap(e12Var.f4574b);
    }

    public final Object a(a.i7 i7Var, Class cls) {
        f12 f12Var = new f12(i7Var.getClass(), cls);
        if (this.f5351a.containsKey(f12Var)) {
            return ((a12) ((c12) this.f5351a.get(f12Var))).f2199c.e(i7Var);
        }
        throw new GeneralSecurityException("No PrimitiveConstructor for " + f12Var + " available, see https://developers.google.com/tink/faq/registration_errors");
    }

    public final Object a(a.i5 i5Var, a.ka kaVar) {
        return a(((o51) kaVar).f9143a, i5Var.a());
    }

    public final Object a(a.za zaVar, kb1 kb1Var, a.i5 i5Var) {
        return i5Var.a(zaVar, kb1Var, new o3(0, this, i5Var));
    }

    public static e12 a() {
        return new e12();
    }
}
