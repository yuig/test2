package ub;

import java.util.HashMap;
import kb.b0;

/* loaded from: classes3.dex */
public final class v {

    /* renamed from: e, reason: collision with root package name */
    public static final String f121699e = b0.h("WorkTimer");

    /* renamed from: a, reason: collision with root package name */
    public final lb.b f121700a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f121701b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f121702c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final Object f121703d = new Object();

    public v(lb.b bVar) {
        this.f121700a = bVar;
    }

    public final void a(tb.j jVar) {
        synchronized (this.f121703d) {
            try {
                if (((u) this.f121701b.remove(jVar)) != null) {
                    b0.e().a(f121699e, "Stopping timer for " + jVar);
                    this.f121702c.remove(jVar);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
