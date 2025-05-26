package lb0;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Base64;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import m60.f0;

/* loaded from: classes.dex */
public final class b implements o {

    /* renamed from: c */
    public static final HashMap f82701c = new HashMap();

    /* renamed from: a */
    public final String f82702a;

    /* renamed from: b */
    public final SharedPreferences f82703b;

    public b(String str) {
        Context context = kb0.a.f79058b;
        SharedPreferences sharedPreferences = f0.X().getSharedPreferences(str, 0);
        this.f82702a = str;
        this.f82703b = sharedPreferences;
    }

    public static void q() {
        ((m60.d) m60.d.a()).g();
    }

    public final boolean b(String str) {
        q();
        if (!i().containsKey(str) || i().get(str) == j.f82711a) {
            return this.f82703b.contains(str);
        }
        return true;
    }

    public final m c() {
        return new m(this.f82703b.edit(), i());
    }

    public final String d(String str, String str2) {
        com.pinterest.encryption.dataEncryptionLibrary.a a13 = t.a();
        q();
        String j13 = j(str, str2);
        if (j13 == null || j13.equals(str2)) {
            return str2;
        }
        byte[] decode = Base64.getDecoder().decode(j13);
        String f13 = a13.f(true, decode, str);
        if (f13 == null) {
            f13 = a13.f(false, decode, str);
        }
        return f13 != null ? f13 : str2;
    }

    public final boolean e(String str, boolean z13) {
        q();
        Object obj = i().get(str);
        return obj == j.f82711a ? z13 : obj != null ? ((Boolean) obj).booleanValue() : this.f82703b.getBoolean(str, z13);
    }

    public final int f(String str, int i13) {
        q();
        Object obj = i().get(str);
        return obj == j.f82711a ? i13 : obj != null ? ((Integer) obj).intValue() : this.f82703b.getInt(str, i13);
    }

    public final long g(String str, long j13) {
        q();
        Object obj = i().get(str);
        return obj == j.f82711a ? j13 : obj != null ? ((Long) obj).longValue() : this.f82703b.getLong(str, j13);
    }

    public final Set h(String str, Set set) {
        Set<String> set2;
        q();
        Object obj = i().get(str);
        if (obj == j.f82711a) {
            return set;
        }
        if (obj == null) {
            set2 = this.f82703b.getStringSet(str, set);
        } else {
            if (!(obj instanceof Set)) {
                throw new IllegalStateException(a.a.k("key ", str, " is not a set"));
            }
            set2 = (Set) obj;
        }
        if (set2 == null) {
            return null;
        }
        return new HashSet(set2);
    }

    public final Map i() {
        Map map;
        HashMap hashMap = f82701c;
        synchronized (hashMap) {
            try {
                map = (Map) hashMap.get(this.f82702a);
                if (map == null) {
                    map = new a(20, 0.9f, true);
                    hashMap.put(this.f82702a, map);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return map;
    }

    public final String j(String str, String str2) {
        q();
        Object obj = i().get(str);
        return obj == j.f82711a ? str2 : obj != null ? (String) obj : this.f82703b.getString(str, str2);
    }

    public final void k(String str) {
        m c13 = c();
        c13.remove(str);
        c13.apply();
    }

    public final void l(String str, int i13) {
        m c13 = c();
        c13.putInt(str, i13);
        c13.apply();
    }

    public final void m(String str, long j13) {
        m c13 = c();
        c13.putLong(str, j13);
        c13.apply();
    }

    public final void n(String str, String str2) {
        m c13 = c();
        c13.putString(str, str2);
        c13.apply();
    }

    public final void o(String str, boolean z13) {
        m c13 = c();
        c13.putBoolean(str, z13);
        c13.apply();
    }

    public final boolean p(String str, String str2, Boolean bool) {
        com.pinterest.encryption.dataEncryptionLibrary.a a13 = t.a();
        q();
        if (str2 == null) {
            m c13 = c();
            c13.putString(str, null);
            c13.apply();
            return false;
        }
        if (bool == null) {
            bool = Boolean.FALSE;
        }
        if (!a13.c(str, bool.booleanValue())) {
            return false;
        }
        byte[] g13 = a13.g(str, str2, bool.booleanValue(), true);
        String encodeToString = (g13 == null || g13.length <= 0) ? "" : Base64.getEncoder().encodeToString(g13);
        if (encodeToString.isEmpty()) {
            return false;
        }
        m c14 = c();
        c14.putString(str, encodeToString);
        c14.apply();
        return true;
    }
}
