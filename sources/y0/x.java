package y0;

import a.a4;
import androidx.camera.core.impl.t1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import kh2.m0;

/* loaded from: classes2.dex */
public final class x implements j {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f136373a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public t0.b f136374b = t0.b.INACTIVE;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f136375c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c0 f136376d;

    public x(c0 c0Var) {
        this.f136376d = c0Var;
    }

    @Override // androidx.camera.core.impl.u1
    public final void a(t1 t1Var, Executor executor) {
        this.f136376d.f136284h.execute(new a4(this, t1Var, executor, 17));
    }

    public final void b(boolean z13) {
        t0.b bVar = z13 ? t0.b.ACTIVE : t0.b.INACTIVE;
        if (this.f136374b == bVar) {
            return;
        }
        this.f136374b = bVar;
        if (bVar == t0.b.INACTIVE) {
            ArrayList arrayList = this.f136375c;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((com.google.common.util.concurrent.c0) it.next()).cancel(true);
            }
            arrayList.clear();
        }
        for (Map.Entry entry : this.f136373a.entrySet()) {
            try {
                ((Executor) entry.getValue()).execute(new l0.e(19, entry, bVar));
            } catch (RejectedExecutionException e13) {
                m0.t(this.f136376d.f136277a, "Unable to post to the supplied executor.", e13);
            }
        }
    }

    @Override // androidx.camera.core.impl.u1
    public final com.google.common.util.concurrent.c0 c() {
        return com.bumptech.glide.d.L(new u(this, 0));
    }

    @Override // androidx.camera.core.impl.u1
    public final void f(t1 t1Var) {
        this.f136376d.f136284h.execute(new l0.e(20, this, t1Var));
    }
}
