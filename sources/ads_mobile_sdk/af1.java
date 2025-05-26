package ads_mobile_sdk;

import a.p6;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class af1 {

    /* renamed from: b, reason: collision with root package name */
    public static final af1 f2383b = new af1();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f2384a = new HashMap();

    public final synchronized void a(String str, p6 p6Var) {
        try {
            if (!this.f2384a.containsKey(str)) {
                this.f2384a.put(str, p6Var);
                return;
            }
            if (((p6) this.f2384a.get(str)).equals(p6Var)) {
                return;
            }
            throw new GeneralSecurityException("Parameters object with name " + str + " already exists (" + this.f2384a.get(str) + "), cannot insert " + p6Var);
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final synchronized void a(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            a((String) entry.getKey(), (p6) entry.getValue());
        }
    }
}
