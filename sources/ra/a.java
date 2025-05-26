package ra;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import androidx.startup.StartupException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import tb.f;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static volatile a f106885d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f106886e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Context f106889c;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f106888b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f106887a = new HashMap();

    public a(Context context) {
        this.f106889c = context.getApplicationContext();
    }

    public static a c(Context context) {
        if (f106885d == null) {
            synchronized (f106886e) {
                try {
                    if (f106885d == null) {
                        f106885d = new a(context);
                    }
                } finally {
                }
            }
        }
        return f106885d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f106889c.getString(c.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = this.f106888b;
                    if (!hasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e13) {
                throw new StartupException(e13);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        Object obj;
        if (f.Q()) {
            try {
                Trace.beginSection(f.k0(cls.getSimpleName()));
            } catch (Throwable th3) {
                Trace.endSection();
                throw th3;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        HashMap hashMap = this.f106887a;
        if (hashMap.containsKey(cls)) {
            obj = hashMap.get(cls);
        } else {
            hashSet.add(cls);
            try {
                b bVar = (b) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class> b13 = bVar.b();
                if (!b13.isEmpty()) {
                    for (Class cls2 : b13) {
                        if (!hashMap.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                obj = bVar.a(this.f106889c);
                hashSet.remove(cls);
                hashMap.put(cls, obj);
            } catch (Throwable th4) {
                throw new StartupException(th4);
            }
        }
        Trace.endSection();
        return obj;
    }
}
