package el;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: b, reason: collision with root package name */
    public static final f0 f59486b = new f0();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f59487a = new HashMap();

    public final synchronized void a(String str, uk.q qVar) {
        try {
            if (!this.f59487a.containsKey(str)) {
                this.f59487a.put(str, qVar);
                return;
            }
            if (((uk.q) this.f59487a.get(str)).equals(qVar)) {
                return;
            }
            throw new GeneralSecurityException("Parameters object with name " + str + " already exists (" + this.f59487a.get(str) + "), cannot insert " + qVar);
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final synchronized void b(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            a((String) entry.getKey(), (uk.q) entry.getValue());
        }
    }
}
