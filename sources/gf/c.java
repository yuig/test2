package gf;

import df.f0;
import df.j1;
import ff.d;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kh2.g0;
import kh2.m0;
import kotlin.collections.CollectionsKt;
import kotlin.collections.u0;
import le.o0;
import le.v;
import org.json.JSONArray;
import ql2.s;
import v.j2;

/* loaded from: classes3.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f64864a = new AtomicBoolean(false);

    public static final synchronized void a() {
        synchronized (c.class) {
            if (p001if.a.b(c.class)) {
                return;
            }
            try {
                if (f64864a.getAndSet(true)) {
                    return;
                }
                v vVar = v.f83104a;
                if (o0.b()) {
                    b();
                }
                int i13 = a.f64858a;
                if (!p001if.a.b(a.class)) {
                    try {
                        a.f64859b.scheduleAtFixedRate(a.f64861d, 0L, 500, TimeUnit.MILLISECONDS);
                    } catch (Throwable th3) {
                        p001if.a.a(a.class, th3);
                    }
                }
            } catch (Throwable th4) {
                p001if.a.a(c.class, th4);
            }
        }
    }

    public static final void b() {
        File[] listFiles;
        if (p001if.a.b(c.class)) {
            return;
        }
        try {
            if (j1.O0()) {
                return;
            }
            File y13 = m0.y();
            int i13 = 0;
            if (y13 == null) {
                listFiles = new File[0];
            } else {
                listFiles = y13.listFiles(new f0(3));
                if (listFiles == null) {
                    listFiles = new File[0];
                }
            }
            ArrayList arrayList = new ArrayList(listFiles.length);
            for (File file : listFiles) {
                arrayList.add(g0.i0(file));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((d) obj).a()) {
                    arrayList2.add(obj);
                }
            }
            List x03 = CollectionsKt.x0(arrayList2, new j2(22));
            JSONArray jSONArray = new JSONArray();
            Iterator it = s.q(0, Math.min(x03.size(), 5)).iterator();
            while (it.hasNext()) {
                jSONArray.put(x03.get(((u0) it).b()));
            }
            m0.N0("anr_reports", jSONArray, new b(x03, i13));
        } catch (Throwable th3) {
            p001if.a.a(c.class, th3);
        }
    }
}
