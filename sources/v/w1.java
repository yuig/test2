package v;

import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class w1 {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f123716a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f123717b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f123718c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f123719d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f123720e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f123721f;

    public w1(f0.j jVar) {
        this.f123717b = new Object();
        this.f123718c = new LinkedHashSet();
        this.f123719d = new LinkedHashSet();
        this.f123720e = new LinkedHashSet();
        this.f123721f = new v1(this);
        this.f123716a = jVar;
    }

    public final void a(v2 v2Var) {
        v2 v2Var2;
        Iterator it = d().iterator();
        while (it.hasNext() && (v2Var2 = (v2) it.next()) != v2Var) {
            w2 w2Var = (w2) v2Var2;
            synchronized (w2Var.f123697a) {
                try {
                    List list = w2Var.f123707k;
                    if (list != null) {
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            ((androidx.camera.core.impl.z0) it2.next()).b();
                        }
                        w2Var.f123707k = null;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            w2Var.f123728u.i();
        }
    }

    public final ArrayList b() {
        ArrayList arrayList;
        synchronized (this.f123717b) {
            arrayList = new ArrayList((Set) this.f123718c);
        }
        return arrayList;
    }

    public final ArrayList c() {
        ArrayList arrayList;
        synchronized (this.f123717b) {
            arrayList = new ArrayList((Set) this.f123720e);
        }
        return arrayList;
    }

    public final ArrayList d() {
        ArrayList arrayList;
        synchronized (this.f123717b) {
            arrayList = new ArrayList();
            arrayList.addAll(b());
            arrayList.addAll(c());
        }
        return arrayList;
    }

    public w1(Handler handler, w1 w1Var, androidx.camera.core.impl.r rVar, androidx.camera.core.impl.r rVar2, f0.j jVar, f0.g gVar) {
        this.f123716a = jVar;
        this.f123717b = gVar;
        this.f123718c = handler;
        this.f123719d = w1Var;
        this.f123720e = rVar;
        this.f123721f = rVar2;
    }
}
