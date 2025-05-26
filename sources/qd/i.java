package qd;

import android.util.Log;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.Queue;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final tb.l f103545a = new tb.l(6);

    /* renamed from: b, reason: collision with root package name */
    public final dc.a f103546b = new dc.a(0);

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f103547c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f103548d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final int f103549e;

    /* renamed from: f, reason: collision with root package name */
    public int f103550f;

    public i(int i13) {
        this.f103549e = i13;
    }

    public final void a(int i13, Class cls) {
        NavigableMap g13 = g(cls);
        Integer num = (Integer) g13.get(Integer.valueOf(i13));
        if (num != null) {
            if (num.intValue() == 1) {
                g13.remove(Integer.valueOf(i13));
                return;
            } else {
                g13.put(Integer.valueOf(i13), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i13 + ", this: " + this);
    }

    public final void b(int i13) {
        while (this.f103550f > i13) {
            Object B = this.f103545a.B();
            d7.b.o(B);
            a d2 = d(B);
            this.f103550f -= d2.b() * d2.c(B);
            a(d2.c(B), B.getClass());
            if (Log.isLoggable(d2.a(), 2)) {
                Log.v(d2.a(), "evicted: " + d2.c(B));
            }
        }
    }

    public final synchronized Object c(int i13, Class cls) {
        h hVar;
        int i14;
        try {
            Integer num = (Integer) g(cls).ceilingKey(Integer.valueOf(i13));
            if (num == null || ((i14 = this.f103550f) != 0 && this.f103549e / i14 < 2 && num.intValue() > i13 * 8)) {
                dc.a aVar = this.f103546b;
                l lVar = (l) ((Queue) aVar.f92902b).poll();
                if (lVar == null) {
                    lVar = aVar.k();
                }
                hVar = (h) lVar;
                hVar.f103543b = i13;
                hVar.f103544c = cls;
            }
            dc.a aVar2 = this.f103546b;
            int intValue = num.intValue();
            l lVar2 = (l) ((Queue) aVar2.f92902b).poll();
            if (lVar2 == null) {
                lVar2 = aVar2.k();
            }
            hVar = (h) lVar2;
            hVar.f103543b = intValue;
            hVar.f103544c = cls;
        } catch (Throwable th3) {
            throw th3;
        }
        return f(hVar, cls);
    }

    public final a d(Object obj) {
        return e(obj.getClass());
    }

    public final a e(Class cls) {
        HashMap hashMap = this.f103548d;
        a aVar = (a) hashMap.get(cls);
        if (aVar == null) {
            if (cls.equals(int[].class)) {
                aVar = new g();
            } else {
                if (!cls.equals(byte[].class)) {
                    throw new IllegalArgumentException("No array pool found for: ".concat(cls.getSimpleName()));
                }
                aVar = new e();
            }
            hashMap.put(cls, aVar);
        }
        return aVar;
    }

    public final Object f(h hVar, Class cls) {
        a e13 = e(cls);
        Object u13 = this.f103545a.u(hVar);
        if (u13 != null) {
            this.f103550f -= e13.b() * e13.c(u13);
            a(e13.c(u13), cls);
        }
        if (u13 != null) {
            return u13;
        }
        if (Log.isLoggable(e13.a(), 2)) {
            Log.v(e13.a(), "Allocated " + hVar.f103543b + " bytes");
        }
        return e13.newArray(hVar.f103543b);
    }

    public final NavigableMap g(Class cls) {
        HashMap hashMap = this.f103547c;
        NavigableMap navigableMap = (NavigableMap) hashMap.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        hashMap.put(cls, treeMap);
        return treeMap;
    }

    public final synchronized void h(Object obj) {
        Class<?> cls = obj.getClass();
        a e13 = e(cls);
        int c13 = e13.c(obj);
        int b13 = e13.b() * c13;
        if (b13 <= this.f103549e / 2) {
            dc.a aVar = this.f103546b;
            l lVar = (l) ((Queue) aVar.f92902b).poll();
            if (lVar == null) {
                lVar = aVar.k();
            }
            h hVar = (h) lVar;
            hVar.f103543b = c13;
            hVar.f103544c = cls;
            this.f103545a.z(hVar, obj);
            NavigableMap g13 = g(cls);
            Integer num = (Integer) g13.get(Integer.valueOf(hVar.f103543b));
            Integer valueOf = Integer.valueOf(hVar.f103543b);
            int i13 = 1;
            if (num != null) {
                i13 = 1 + num.intValue();
            }
            g13.put(valueOf, Integer.valueOf(i13));
            this.f103550f += b13;
            b(this.f103549e);
        }
    }
}
