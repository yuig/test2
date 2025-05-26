package ads_mobile_sdk;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;
import kp.n;

/* loaded from: classes2.dex */
public final class xa0 implements a.ag {

    /* renamed from: a, reason: collision with root package name */
    public final a.pb f13551a;

    public xa0(a.pb pbVar) {
        this.f13551a = pbVar;
    }

    @Override // a.ag
    public final Object a(String str) {
        String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};
        ArrayList arrayList = new ArrayList();
        for (int i13 = 0; i13 < 3; i13++) {
            Provider provider = Security.getProvider(strArr[i13]);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        Iterator it = arrayList.iterator();
        Exception exc = null;
        while (it.hasNext()) {
            try {
                return ((n) this.f13551a).H(str, (Provider) it.next());
            } catch (Exception e13) {
                if (exc == null) {
                    exc = e13;
                }
            }
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
