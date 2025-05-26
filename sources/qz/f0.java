package qz;

import df.j1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.j0;
import kotlin.collections.y0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f105397a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f105398b;

    /* renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f105399c;

    /* renamed from: d, reason: collision with root package name */
    public final ConcurrentHashMap f105400d;

    public f0(LinkedHashMap source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f105397a = new ConcurrentHashMap();
        this.f105398b = new ConcurrentHashMap();
        this.f105399c = new ConcurrentHashMap();
        this.f105400d = new ConcurrentHashMap();
        for (Map.Entry entry : source.entrySet()) {
            e((String) entry.getKey(), (String) entry.getValue());
        }
    }

    public static LinkedList a(Object obj, String str) {
        Object obj2;
        LinkedList linkedList = new LinkedList();
        int i13 = 0;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            ArrayList arrayList = new ArrayList(map.keySet());
            if ((!arrayList.isEmpty()) && (arrayList.get(0) instanceof Comparable)) {
                j0.t(arrayList, new b4.f(10));
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if ((next instanceof String) && (obj2 = map.get(next)) != null) {
                    linkedList.addAll(a(obj2, str == null ? (String) next : j1.U("%s[%s]", new Object[]{str, next})));
                }
            }
        } else if (obj instanceof List) {
            List list = (List) obj;
            int size = list.size();
            while (i13 < size) {
                String W = j1.W("%s[%d]", str, Integer.valueOf(i13));
                Object obj3 = list.get(i13);
                Intrinsics.f(obj3);
                linkedList.addAll(a(obj3, W));
                i13++;
            }
        } else {
            if (obj instanceof Object[]) {
                Object[] objArr = (Object[]) obj;
                if (objArr instanceof Object[]) {
                    int length = objArr.length;
                    while (i13 < length) {
                        linkedList.addAll(a(objArr[i13], j1.W("%s[%d]", str, Integer.valueOf(i13))));
                        i13++;
                    }
                }
            }
            if (obj instanceof Set) {
                Iterator it2 = ((Set) obj).iterator();
                while (it2.hasNext()) {
                    linkedList.addAll(a(it2.next(), str));
                }
            } else {
                linkedList.add(new p5.b(str, String.valueOf(obj)));
            }
        }
        return linkedList;
    }

    public final boolean b(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (this.f105397a.get(key) == null && this.f105398b.get(key) == null && this.f105399c.get(key) == null && this.f105400d.get(key) == null) ? false : true;
    }

    public final void c(int i13, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f105397a.put(key, String.valueOf(i13));
    }

    public final void d(Object value, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f105400d.put(key, value);
    }

    public final void e(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f105397a.put(key, value);
    }

    public final void f(Map params) {
        Intrinsics.checkNotNullParameter(params, "params");
        for (Map.Entry entry : params.entrySet()) {
            e((String) entry.getKey(), (String) entry.getValue());
        }
    }

    public final void g(List keys, Map params) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(keys, "keys");
        Iterator it = keys.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (params.containsKey(str)) {
                String str2 = (String) params.get(str);
                if (str2 != null) {
                    e(str, str2);
                }
            } else {
                h(str);
            }
        }
    }

    public final void h(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f105397a.remove(key);
        this.f105398b.remove(key);
        this.f105399c.remove(key);
        this.f105400d.remove(key);
    }

    public final LinkedHashMap i() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f105397a.entrySet()) {
            arrayList.add(new p5.b((String) entry.getKey(), (String) entry.getValue()));
        }
        arrayList.addAll(a(this.f105400d, null));
        int a13 = y0.a(kotlin.collections.g0.q(arrayList, 10));
        if (a13 < 16) {
            a13 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a13);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            p5.b bVar = (p5.b) it.next();
            Object obj = bVar.f98855a;
            Intrinsics.f(obj);
            Object obj2 = bVar.f98856b;
            Intrinsics.f(obj2);
            linkedHashMap.put(obj, obj2);
        }
        return linkedHashMap;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        for (Map.Entry entry : this.f105397a.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (sb3.length() > 0) {
                sb3.append("&");
            }
            sb3.append(str);
            sb3.append("=");
            sb3.append(str2);
        }
        Iterator it = this.f105398b.entrySet().iterator();
        while (it.hasNext()) {
            String str3 = (String) ((Map.Entry) it.next()).getKey();
            if (sb3.length() > 0) {
                sb3.append("&");
            }
            sb3.append(str3);
            sb3.append("=");
            sb3.append("STREAM");
        }
        Iterator it2 = this.f105399c.entrySet().iterator();
        while (it2.hasNext()) {
            String str4 = (String) ((Map.Entry) it2.next()).getKey();
            if (sb3.length() > 0) {
                sb3.append("&");
            }
            sb3.append(str4);
            sb3.append("=");
            sb3.append("FILE");
        }
        for (p5.b bVar : a(this.f105400d, null)) {
            if (sb3.length() > 0) {
                sb3.append("&");
            }
            sb3.append((String) bVar.f98855a);
            sb3.append("=");
            sb3.append((String) bVar.f98856b);
        }
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "toString(...)");
        return sb4;
    }

    public f0() {
        this.f105397a = new ConcurrentHashMap();
        this.f105398b = new ConcurrentHashMap();
        this.f105399c = new ConcurrentHashMap();
        this.f105400d = new ConcurrentHashMap();
    }
}
