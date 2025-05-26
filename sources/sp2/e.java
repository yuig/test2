package sp2;

import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.logging.Level;
import lb.x;
import org.greenrobot.eventbus.EventBusException;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: r, reason: collision with root package name */
    public static final HashMap f114900r = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f114901a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f114902b;

    /* renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f114903c;

    /* renamed from: d, reason: collision with root package name */
    public final b f114904d = new b();

    /* renamed from: e, reason: collision with root package name */
    public final b20.c f114905e;

    /* renamed from: f, reason: collision with root package name */
    public final g f114906f;

    /* renamed from: g, reason: collision with root package name */
    public final a f114907g;

    /* renamed from: h, reason: collision with root package name */
    public final x f114908h;

    /* renamed from: i, reason: collision with root package name */
    public final o f114909i;

    /* renamed from: j, reason: collision with root package name */
    public final ExecutorService f114910j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f114911k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f114912l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f114913m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f114914n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f114915o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f114916p;

    /* renamed from: q, reason: collision with root package name */
    public final h f114917q;

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public e(sp2.f r4) {
        /*
            r3 = this;
            r3.<init>()
            sp2.b r0 = new sp2.b
            r0.<init>()
            r3.f114904d = r0
            boolean r0 = tp2.a.f118794a
            r1 = 0
            if (r0 == 0) goto L1d
            android.os.Looper r0 = android.os.Looper.getMainLooper()     // Catch: java.lang.RuntimeException -> L14
            goto L15
        L14:
            r0 = r1
        L15:
            if (r0 == 0) goto L1d
            tp2.a r0 = new tp2.a
            r0.<init>()
            goto L22
        L1d:
            org.chromium.net.y r0 = new org.chromium.net.y
            r0.<init>()
        L22:
            r3.f114917q = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r3.f114901a = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r3.f114902b = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r3.f114903c = r0
            boolean r0 = tp2.a.f118794a
            if (r0 == 0) goto L4c
            android.os.Looper r0 = android.os.Looper.getMainLooper()     // Catch: java.lang.RuntimeException -> L42
            goto L43
        L42:
            r0 = r1
        L43:
            if (r0 != 0) goto L46
            goto L4c
        L46:
            b20.c r2 = new b20.c
            r2.<init>(r0)
            goto L4d
        L4c:
            r2 = r1
        L4d:
            r3.f114905e = r2
            if (r2 == 0) goto L5a
            sp2.g r1 = new sp2.g
            java.lang.Object r0 = r2.f21278a
            android.os.Looper r0 = (android.os.Looper) r0
            r1.<init>(r3, r0)
        L5a:
            r3.f114906f = r1
            sp2.a r0 = new sp2.a
            r0.<init>(r3)
            r3.f114907g = r0
            lb.x r0 = new lb.x
            r0.<init>(r3)
            r3.f114908h = r0
            sp2.o r0 = new sp2.o
            r0.<init>()
            r3.f114909i = r0
            r0 = 1
            r3.f114912l = r0
            boolean r1 = r4.f114919a
            r3.f114913m = r1
            r3.f114914n = r0
            boolean r1 = r4.f114920b
            r3.f114915o = r1
            boolean r1 = r4.f114921c
            r3.f114911k = r1
            r3.f114916p = r0
            java.util.concurrent.ExecutorService r4 = r4.f114922d
            r3.f114910j = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sp2.e.<init>(sp2.f):void");
    }

    public static void a(ArrayList arrayList, Class[] clsArr) {
        for (Class cls : clsArr) {
            if (!arrayList.contains(cls)) {
                arrayList.add(cls);
                a(arrayList, cls.getInterfaces());
            }
        }
    }

    public static List d(Class cls) {
        List list;
        HashMap hashMap = f114900r;
        synchronized (hashMap) {
            try {
                List list2 = (List) hashMap.get(cls);
                list = list2;
                if (list2 == null) {
                    ArrayList arrayList = new ArrayList();
                    for (Class cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
                        arrayList.add(cls2);
                        a(arrayList, cls2.getInterfaces());
                    }
                    f114900r.put(cls, arrayList);
                    list = arrayList;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return list;
    }

    public final void b(Object obj, p pVar) {
        try {
            pVar.f114952b.f114937a.invoke(pVar.f114951a, obj);
        } catch (IllegalAccessException e13) {
            throw new IllegalStateException("Unexpected exception", e13);
        } catch (InvocationTargetException e14) {
            Throwable cause = e14.getCause();
            boolean z13 = obj instanceof l;
            boolean z14 = this.f114912l;
            h hVar = this.f114917q;
            if (!z13) {
                if (this.f114911k) {
                    throw new EventBusException("Invoking subscriber failed", cause);
                }
                if (z14) {
                    hVar.s(Level.SEVERE, "Could not dispatch event: " + obj.getClass() + " to subscribing class " + pVar.f114951a.getClass(), cause);
                }
                if (this.f114914n) {
                    e(new l(cause, obj, pVar.f114951a));
                    return;
                }
                return;
            }
            if (z14) {
                Level level = Level.SEVERE;
                hVar.s(level, "SubscriberExceptionEvent subscriber " + pVar.f114951a.getClass() + " threw an exception", cause);
                l lVar = (l) obj;
                hVar.s(level, "Initial event " + lVar.f114935b + " caused exception in " + lVar.f114936c, lVar.f114934a);
            }
        }
    }

    public final void c(j jVar) {
        Object obj = jVar.f114931a;
        p pVar = jVar.f114932b;
        jVar.f114931a = null;
        jVar.f114932b = null;
        jVar.f114933c = null;
        ArrayList arrayList = j.f114930d;
        synchronized (arrayList) {
            if (arrayList.size() < 10000) {
                arrayList.add(jVar);
            }
        }
        if (pVar.f114953c) {
            b(obj, pVar);
        }
    }

    public final void e(Object obj) {
        d dVar = (d) this.f114904d.get();
        ArrayList arrayList = dVar.f114896a;
        arrayList.add(obj);
        if (dVar.f114897b) {
            return;
        }
        b20.c cVar = this.f114905e;
        dVar.f114898c = cVar == null || ((Looper) cVar.f21278a) == Looper.myLooper();
        dVar.f114897b = true;
        while (!arrayList.isEmpty()) {
            try {
                f(arrayList.remove(0), dVar);
            } finally {
                dVar.f114897b = false;
                dVar.f114898c = false;
            }
        }
    }

    public final void f(Object obj, d dVar) {
        boolean g13;
        Class<?> cls = obj.getClass();
        if (this.f114916p) {
            List d2 = d(cls);
            int size = d2.size();
            g13 = false;
            for (int i13 = 0; i13 < size; i13++) {
                g13 |= g(obj, dVar, (Class) d2.get(i13));
            }
        } else {
            g13 = g(obj, dVar, cls);
        }
        if (g13) {
            return;
        }
        if (this.f114913m) {
            this.f114917q.u(a.a.h("No subscribers registered for event ", cls), Level.FINE);
        }
        if (!this.f114915o || cls == i.class || cls == l.class) {
            return;
        }
        e(new i(0, this, obj));
    }

    public final boolean g(Object obj, d dVar, Class cls) {
        CopyOnWriteArrayList copyOnWriteArrayList;
        synchronized (this) {
            copyOnWriteArrayList = (CopyOnWriteArrayList) this.f114901a.get(cls);
        }
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            dVar.f114899d = obj;
            h(pVar, obj, dVar.f114898c);
        }
        return true;
    }

    public final void h(p pVar, Object obj, boolean z13) {
        int i13 = c.f114895a[pVar.f114952b.f114938b.ordinal()];
        if (i13 == 1) {
            b(obj, pVar);
            return;
        }
        g gVar = this.f114906f;
        if (i13 == 2) {
            if (z13) {
                b(obj, pVar);
                return;
            } else {
                gVar.a(obj, pVar);
                return;
            }
        }
        if (i13 == 3) {
            if (gVar != null) {
                gVar.a(obj, pVar);
                return;
            } else {
                b(obj, pVar);
                return;
            }
        }
        if (i13 != 4) {
            if (i13 != 5) {
                throw new IllegalStateException("Unknown thread mode: " + pVar.f114952b.f114938b);
            }
            x xVar = this.f114908h;
            xVar.getClass();
            ((tb.c) xVar.f82681b).d(j.a(obj, pVar));
            ((e) xVar.f82682c).f114910j.execute(xVar);
            return;
        }
        if (!z13) {
            b(obj, pVar);
            return;
        }
        a aVar = this.f114907g;
        aVar.getClass();
        j a13 = j.a(obj, pVar);
        synchronized (aVar) {
            try {
                aVar.f114892a.d(a13);
                if (!aVar.f114894c) {
                    aVar.f114894c = true;
                    aVar.f114893b.f114910j.execute(aVar);
                }
            } finally {
            }
        }
    }

    public final void i(Object obj) {
        Class<?> cls = obj.getClass();
        o oVar = this.f114909i;
        oVar.getClass();
        ConcurrentHashMap concurrentHashMap = o.f114949a;
        List list = (List) concurrentHashMap.get(cls);
        List list2 = list;
        if (list == null) {
            n c13 = o.c();
            c13.f114947e = cls;
            c13.f114948f = false;
            while (c13.f114947e != null) {
                oVar.a(c13);
                c13.b();
            }
            ArrayList b13 = o.b(c13);
            if (b13.isEmpty()) {
                throw new EventBusException("Subscriber " + cls + " and its super classes have no public methods with the @Subscribe annotation");
            }
            concurrentHashMap.put(cls, b13);
            list2 = b13;
        }
        synchronized (this) {
            try {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    j(obj, (m) it.next());
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void j(Object obj, m mVar) {
        Object value;
        Class cls = mVar.f114939c;
        p pVar = new p(obj, mVar);
        HashMap hashMap = this.f114901a;
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) hashMap.get(cls);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList();
            hashMap.put(cls, copyOnWriteArrayList);
        } else if (copyOnWriteArrayList.contains(pVar)) {
            throw new EventBusException("Subscriber " + obj.getClass() + " already registered to event " + cls);
        }
        int size = copyOnWriteArrayList.size();
        for (int i13 = 0; i13 <= size; i13++) {
            if (i13 != size) {
                if (mVar.f114940d <= ((p) copyOnWriteArrayList.get(i13)).f114952b.f114940d) {
                }
            }
            copyOnWriteArrayList.add(i13, pVar);
            break;
        }
        HashMap hashMap2 = this.f114902b;
        List list = (List) hashMap2.get(obj);
        if (list == null) {
            list = new ArrayList();
            hashMap2.put(obj, list);
        }
        list.add(cls);
        if (mVar.f114941e) {
            ConcurrentHashMap concurrentHashMap = this.f114903c;
            b20.c cVar = this.f114905e;
            if (!this.f114916p) {
                Object obj2 = concurrentHashMap.get(cls);
                if (obj2 != null) {
                    h(pVar, obj2, cVar == null || ((Looper) cVar.f21278a) == Looper.myLooper());
                    return;
                }
                return;
            }
            for (Map.Entry entry : concurrentHashMap.entrySet()) {
                if (cls.isAssignableFrom((Class) entry.getKey()) && (value = entry.getValue()) != null) {
                    h(pVar, value, cVar == null || ((Looper) cVar.f21278a) == Looper.myLooper());
                }
            }
        }
    }

    public final synchronized void k(Object obj) {
        try {
            List list = (List) this.f114902b.get(obj);
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    List list2 = (List) this.f114901a.get((Class) it.next());
                    if (list2 != null) {
                        int size = list2.size();
                        int i13 = 0;
                        while (i13 < size) {
                            p pVar = (p) list2.get(i13);
                            if (pVar.f114951a == obj) {
                                pVar.f114953c = false;
                                list2.remove(i13);
                                i13--;
                                size--;
                            }
                            i13++;
                        }
                    }
                }
                this.f114902b.remove(obj);
            } else {
                this.f114917q.u("Subscriber to unregister was not registered before: " + obj.getClass(), Level.WARNING);
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final String toString() {
        return a.a.r(new StringBuilder("EventBus[indexCount=0, eventInheritance="), this.f114916p, "]");
    }
}
