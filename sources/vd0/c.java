package vd0;

import a.sc;
import com.google.gson.reflect.TypeToken;
import df.j1;
import java.io.BufferedReader;
import java.lang.reflect.Type;
import java.util.AbstractCollection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import nm.o;
import nm.q;
import nm.s;
import nm.u;
import nm.v;
import pm.k;
import pm.l;
import qm.m;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: b */
    public static o f125622b;

    /* renamed from: a */
    public final u f125623a;

    public c(u uVar) {
        this.f125623a = uVar;
    }

    public static Object a(Object obj) {
        if (!(obj instanceof s)) {
            return null;
        }
        s sVar = (s) obj;
        sVar.getClass();
        if (sVar instanceof q) {
            return new a(sVar.f());
        }
        if (sVar instanceof u) {
            return new c(sVar.i());
        }
        if (obj instanceof v) {
            return sVar.p();
        }
        return null;
    }

    public final Object b(Type type) {
        o oVar = f125622b;
        oVar.getClass();
        TypeToken typeToken = new TypeToken(type);
        u uVar = this.f125623a;
        if (uVar == null) {
            return null;
        }
        return oVar.f(new m(uVar), typeToken);
    }

    public final a c(String str) {
        u uVar = this.f125623a;
        if (uVar == null || uVar.v(str) == null) {
            return null;
        }
        s v13 = uVar.v(str);
        v13.getClass();
        if (v13 instanceof q) {
            return new a(uVar.w(str));
        }
        return null;
    }

    public final String d(String str) {
        u uVar = this.f125623a;
        if (uVar != null && uVar.v(str) != null) {
            try {
                return uVar.v(str).p();
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public final boolean e(String str) {
        return this.f125623a.f91366a.containsKey(str);
    }

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof c) && ((c) obj).f125623a.equals(this.f125623a));
    }

    public final boolean f() {
        return ((AbstractCollection) this.f125623a.f91366a.entrySet()).isEmpty();
    }

    public final Set g() {
        return Collections.unmodifiableSet(this.f125623a.f91366a.keySet());
    }

    public final Boolean h(String str, Boolean bool) {
        u uVar = this.f125623a;
        if (uVar != null && uVar.v(str) != null) {
            s v13 = uVar.v(str);
            v13.getClass();
            if (v13 instanceof v) {
                try {
                    return Boolean.valueOf(uVar.v(str).b());
                } catch (Exception unused) {
                }
            }
        }
        return bool;
    }

    public final int hashCode() {
        return this.f125623a.f91366a.hashCode();
    }

    public final double i(String str, double d2) {
        u uVar = this.f125623a;
        if (uVar != null && uVar.v(str) != null) {
            s v13 = uVar.v(str);
            v13.getClass();
            if (v13 instanceof v) {
                try {
                    return uVar.v(str).c();
                } catch (Exception unused) {
                }
            }
        }
        return d2;
    }

    public final int j(int i13, String str) {
        u uVar = this.f125623a;
        if (uVar == null || uVar.v(str) == null) {
            return i13;
        }
        s v13 = uVar.v(str);
        v13.getClass();
        if (!(v13 instanceof v)) {
            return i13;
        }
        try {
            return uVar.v(str).e();
        } catch (Exception unused) {
            return i13;
        }
    }

    public final a k(String str) {
        u uVar = this.f125623a;
        if (uVar != null && uVar.v(str) != null) {
            s v13 = uVar.v(str);
            v13.getClass();
            if (v13 instanceof q) {
                return new a(uVar.w(str));
            }
        }
        return new a();
    }

    public final HashMap l() {
        l lVar = (l) this.f125623a.f91366a.entrySet();
        HashMap hashMap = new HashMap(lVar.size());
        Iterator it = lVar.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            hashMap.put((String) entry.getKey(), new c(((s) entry.getValue()).i()));
        }
        return hashMap;
    }

    public final c m(String str) {
        s v13;
        u uVar = this.f125623a;
        if (uVar == null || (v13 = uVar.v(str)) == null || !(v13 instanceof u)) {
            return null;
        }
        return new c((u) v13);
    }

    public final long n(long j13, String str) {
        u uVar = this.f125623a;
        if (uVar == null || uVar.v(str) == null) {
            return j13;
        }
        s v13 = uVar.v(str);
        v13.getClass();
        if (!(v13 instanceof v)) {
            return j13;
        }
        try {
            return uVar.v(str).l();
        } catch (Exception unused) {
            return j13;
        }
    }

    public final String o(String str, String str2) {
        u uVar = this.f125623a;
        if (uVar != null && uVar.v(str) != null) {
            try {
                return uVar.v(str).p();
            } catch (Exception unused) {
            }
        }
        return str2;
    }

    public final void p(String str) {
        o(str, "");
    }

    public final HashMap q() {
        sc scVar = new sc(29);
        l lVar = (l) this.f125623a.f91366a.entrySet();
        HashMap hashMap = new HashMap(lVar.size());
        Iterator it = lVar.iterator();
        while (((pm.m) it).hasNext()) {
            Map.Entry entry = (Map.Entry) ((k) it).next();
            hashMap.put((String) entry.getKey(), scVar.f((s) entry.getValue()));
        }
        return hashMap;
    }

    public final void r(Number number, String str) {
        this.f125623a.s(number, str);
    }

    public final void s(String str, Boolean bool) {
        this.f125623a.t(str, bool);
    }

    public final void t(String str, String str2) {
        this.f125623a.u(str, str2);
    }

    public final String toString() {
        return this.f125623a.toString();
    }

    public c() {
        this.f125623a = new u();
    }

    public c(String str) {
        this.f125623a = j1.p1(str).i();
    }

    public c(BufferedReader bufferedReader) {
        this.f125623a = j1.n1(bufferedReader).i();
    }

    public c(Map map) {
        this.f125623a = (u) f125622b.o(map);
    }
}
