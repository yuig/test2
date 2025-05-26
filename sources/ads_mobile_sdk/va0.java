package ads_mobile_sdk;

import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;
import kp.n;

/* loaded from: classes2.dex */
public final class va0 implements a.ag {

    /* renamed from: a, reason: collision with root package name */
    public final a.pb f12411a;

    public va0(a.pb pbVar) {
        this.f12411a = pbVar;
    }

    @Override // a.ag
    public final Object a(String str) {
        String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
        ArrayList arrayList = new ArrayList();
        for (int i13 = 0; i13 < 2; i13++) {
            Provider provider = Security.getProvider(strArr[i13]);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        Iterator it = arrayList.iterator();
        Exception exc = null;
        while (it.hasNext()) {
            try {
                return ((n) this.f12411a).H(str, (Provider) it.next());
            } catch (Exception e13) {
                if (exc == null) {
                    exc = e13;
                }
            }
        }
        return ((n) this.f12411a).H(str, null);
    }
}
