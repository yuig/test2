package ll;

import c50.c1;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class s {

    /* renamed from: b, reason: collision with root package name */
    public static final s f83768b = new s(new c1(21));

    /* renamed from: c, reason: collision with root package name */
    public static final s f83769c = new s(new c1(25));

    /* renamed from: d, reason: collision with root package name */
    public static final s f83770d = new s(new c1(27));

    /* renamed from: e, reason: collision with root package name */
    public static final s f83771e = new s(new c1(26));

    /* renamed from: f, reason: collision with root package name */
    public static final s f83772f = new s(new c1(22));

    /* renamed from: g, reason: collision with root package name */
    public static final s f83773g = new s(new c1(24));

    /* renamed from: h, reason: collision with root package name */
    public static final s f83774h = new s(new c1(23));

    /* renamed from: a, reason: collision with root package name */
    public final r f83775a;

    public s(c1 c1Var) {
        if (yk.e.f139223b.get()) {
            this.f83775a = new r(c1Var, 2);
        } else if ("The Android Project".equals(System.getProperty("java.vendor"))) {
            this.f83775a = new r(c1Var, 0);
        } else {
            this.f83775a = new r(c1Var, 1);
        }
    }

    public final Object a(String str) {
        r rVar = this.f83775a;
        int i13 = rVar.f83766a;
        int i14 = 0;
        t tVar = rVar.f83767b;
        Exception exc = null;
        switch (i13) {
            case 0:
                String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
                ArrayList arrayList = new ArrayList();
                while (i14 < 2) {
                    Provider provider = Security.getProvider(strArr[i14]);
                    if (provider != null) {
                        arrayList.add(provider);
                    }
                    i14++;
                }
                Iterator it = arrayList.iterator();
                Exception exc2 = null;
                while (it.hasNext()) {
                    try {
                        return ((c1) tVar).d(str, (Provider) it.next());
                    } catch (Exception e13) {
                        if (exc2 == null) {
                            exc2 = e13;
                        }
                    }
                }
                return ((c1) tVar).d(str, null);
            case 1:
                return ((c1) tVar).d(str, null);
            default:
                String[] strArr2 = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};
                ArrayList arrayList2 = new ArrayList();
                while (i14 < 3) {
                    Provider provider2 = Security.getProvider(strArr2[i14]);
                    if (provider2 != null) {
                        arrayList2.add(provider2);
                    }
                    i14++;
                }
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    try {
                        return ((c1) tVar).d(str, (Provider) it2.next());
                    } catch (Exception e14) {
                        if (exc == null) {
                            exc = e14;
                        }
                    }
                }
                throw new GeneralSecurityException("No good Provider found.", exc);
        }
    }
}
