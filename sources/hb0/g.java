package hb0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Timer;
import nx.q0;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final Map f68519a = Collections.synchronizedMap(new HashMap());

    /* renamed from: b, reason: collision with root package name */
    public final int f68520b;

    /* renamed from: c, reason: collision with root package name */
    public Timer f68521c;

    /* renamed from: d, reason: collision with root package name */
    public Timer f68522d;

    public g() {
        this.f68520b = 10000;
        this.f68520b = 10000;
        if (this.f68521c != null) {
            b();
            a();
        }
        a();
    }

    public final void a() {
        if (this.f68521c != null) {
            return;
        }
        Timer timer = new Timer();
        this.f68521c = timer;
        e eVar = new e(this, (Object) null);
        long j13 = this.f68520b;
        timer.scheduleAtFixedRate(eVar, j13, j13);
        ArrayList arrayList = new ArrayList(this.f68519a.values());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((q0) it.next()).getClass();
        }
        arrayList.clear();
    }

    public final void b() {
        Timer timer = this.f68521c;
        if (timer == null) {
            return;
        }
        timer.cancel();
        this.f68521c = null;
        ArrayList arrayList = new ArrayList(this.f68519a.values());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((q0) it.next()).getClass();
        }
        arrayList.clear();
    }
}
