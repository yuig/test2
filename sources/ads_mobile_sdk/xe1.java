package ads_mobile_sdk;

import a.ze;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class xe1 {

    /* renamed from: b, reason: collision with root package name */
    public static final xe1 f13623b = new xe1();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f13624a = new HashMap();

    public final synchronized void a(ze zeVar, Class cls) {
        try {
            ze zeVar2 = (ze) this.f13624a.get(cls);
            if (zeVar2 != null && !zeVar2.equals(zeVar)) {
                throw new GeneralSecurityException("Different key creator for parameters class already inserted");
            }
            this.f13624a.put(cls, zeVar);
        } catch (Throwable th3) {
            throw th3;
        }
    }
}
