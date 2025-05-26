package m60;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.greenrobot.eventbus.EventBusException;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a */
    public final sp2.e f85944a;

    /* renamed from: b */
    public final ArrayList f85945b = new ArrayList();

    public w() {
        HashMap hashMap = sp2.e.f114900r;
        sp2.f fVar = new sp2.f();
        fVar.f114921c = true;
        fVar.f114919a = false;
        fVar.f114920b = false;
        this.f85944a = new sp2.e(fVar);
    }

    public final void a(v vVar) {
        synchronized (this.f85945b) {
            this.f85945b.add(vVar);
        }
    }

    public final boolean b(Class cls) {
        CopyOnWriteArrayList copyOnWriteArrayList;
        sp2.e eVar = this.f85944a;
        eVar.getClass();
        List d2 = sp2.e.d(cls);
        int size = d2.size();
        for (int i13 = 0; i13 < size; i13++) {
            Class cls2 = (Class) d2.get(i13);
            synchronized (eVar) {
                copyOnWriteArrayList = (CopyOnWriteArrayList) eVar.f114901a.get(cls2);
            }
            if (copyOnWriteArrayList != null && !copyOnWriteArrayList.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public final boolean c(t tVar) {
        boolean containsKey;
        sp2.e eVar = this.f85944a;
        synchronized (eVar) {
            containsKey = eVar.f114902b.containsKey(tVar);
        }
        return containsKey;
    }

    public final void d(Object obj) {
        if (obj == null) {
            return;
        }
        synchronized (this.f85945b) {
            try {
                int size = this.f85945b.size();
                for (int i13 = 0; i13 < size; i13++) {
                    ((v) this.f85945b.get(i13)).a(obj);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        try {
            this.f85944a.e(obj);
        } catch (EventBusException e13) {
            if (e13.getCause() != null) {
                e13.getCause();
            }
            throw e13;
        }
    }

    public final void e(long j13, Object obj) {
        if (obj == null) {
            return;
        }
        new Handler(Looper.getMainLooper()).postDelayed(new s(this, obj, 0), j13);
    }

    public final void f(Object obj) {
        if (obj == null) {
            return;
        }
        synchronized (this.f85945b) {
            try {
                int size = this.f85945b.size();
                for (int i13 = 0; i13 < size; i13++) {
                    ((v) this.f85945b.get(i13)).a(obj);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        sp2.e eVar = this.f85944a;
        synchronized (eVar.f114903c) {
            eVar.f114903c.put(obj.getClass(), obj);
        }
        eVar.e(obj);
    }

    public final void g(long j13, Object obj) {
        f(obj);
        new Handler(Looper.getMainLooper()).postDelayed(new s(this, obj, 1), j13);
    }

    public final void h(Object obj) {
        if (obj == null) {
            return;
        }
        try {
            this.f85944a.i(obj);
        } catch (EventBusException unused) {
        }
    }

    public final void i(Object obj) {
        if (obj != null) {
            sp2.e eVar = this.f85944a;
            synchronized (eVar.f114903c) {
                try {
                    Class<?> cls = obj.getClass();
                    if (obj.equals(eVar.f114903c.get(cls))) {
                        eVar.f114903c.remove(cls);
                    }
                } finally {
                }
            }
        }
    }

    public final void j(t tVar) {
        if (tVar == null) {
            return;
        }
        try {
            this.f85944a.k(tVar);
        } catch (EventBusException unused) {
        }
    }
}
