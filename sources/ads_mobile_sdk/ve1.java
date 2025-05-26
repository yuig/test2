package ads_mobile_sdk;

import a.f;
import a.p6;
import a.sd;
import a.w7;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class ve1 {

    /* renamed from: b, reason: collision with root package name */
    public static final ve1 f12474b;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f12475a = new HashMap();

    static {
        f fVar = new f(11);
        ve1 ve1Var = new ve1();
        try {
            ve1Var.a(fVar, x61.class);
            f12474b = ve1Var;
        } catch (GeneralSecurityException e13) {
            throw new IllegalStateException("unexpected error.", e13);
        }
    }

    public final synchronized void a(sd sdVar, Class cls) {
        try {
            sd sdVar2 = (sd) this.f12475a.get(cls);
            if (sdVar2 != null && !sdVar2.equals(sdVar)) {
                throw new GeneralSecurityException("Different key creator for parameters class " + cls + " already inserted");
            }
            this.f12475a.put(cls, sdVar);
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final a.i7 a(p6 p6Var, Integer num) {
        a.i7 a13;
        synchronized (this) {
            sd sdVar = (sd) this.f12475a.get(p6Var.getClass());
            if (sdVar != null) {
                a13 = ((f) sdVar).a(p6Var, num);
            } else {
                throw new GeneralSecurityException("Cannot create a new key for parameters " + p6Var + ": no key creator for this class was registered.");
            }
        }
        return a13;
    }

    public static w61 a(x61 x61Var, Integer num) {
        a.w9 w9Var;
        a51 a51Var = x61Var.f13510a.f6610b;
        q41 q41Var = q41.f9943d;
        String t13 = a51Var.t();
        synchronized (q41Var) {
            if (q41Var.f9944a.containsKey(t13)) {
                w9Var = (a.w9) q41Var.f9944a.get(t13);
            } else {
                throw new GeneralSecurityException("No key manager found for key type " + t13 + ", see https://developers.google.com/tink/faq/registration_errors");
            }
        }
        if (((Boolean) q41Var.f9945b.get(a51Var.t())).booleanValue()) {
            il u13 = a51Var.u();
            l61 l61Var = (l61) w9Var;
            l61Var.getClass();
            a.sg v13 = a51.v();
            v13.i(l61Var.f7695a);
            v13.h(u13);
            v13.g(ju1.RAW);
            a51 a51Var2 = (a51) v13.a();
            j22 j22Var = new j22(a51Var2, sx2.a(a51Var2.t()));
            cf1 cf1Var = cf1.f3890b;
            i22 i22Var = (i22) cf1Var.a(f12474b.a(cf1Var.a(j22Var), (Integer) null));
            w7 v14 = o41.v();
            String str = i22Var.f6184a;
            v14.b();
            o41 o41Var = (o41) v14.f10110b;
            o41Var.getClass();
            str.getClass();
            o41Var.typeUrl_ = str;
            il ilVar = i22Var.f6186c;
            v14.b();
            o41 o41Var2 = (o41) v14.f10110b;
            o41Var2.getClass();
            ilVar.getClass();
            o41Var2.value_ = ilVar;
            n41 n41Var = i22Var.f6187d;
            v14.b();
            o41 o41Var3 = (o41) v14.f10110b;
            o41Var3.getClass();
            o41Var3.keyMaterialType_ = n41Var.a();
            o41 o41Var4 = (o41) v14.a();
            return new w61(i22.a(o41Var4.t(), o41Var4.u(), o41Var4.s(), a51Var.s(), num));
        }
        throw new GeneralSecurityException("Creating new keys is not allowed.");
    }
}
