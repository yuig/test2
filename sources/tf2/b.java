package tf2;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import lh2.e;
import lh2.g;

/* loaded from: classes4.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public final ki2.a f117566a;

    /* renamed from: b, reason: collision with root package name */
    public final lh2.b f117567b;

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f117568c;

    /* renamed from: d, reason: collision with root package name */
    public d f117569d;

    public b(ki2.a worker, lh2.b logger) {
        Intrinsics.checkNotNullParameter(worker, "worker");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f117566a = worker;
        this.f117567b = logger;
        this.f117568c = new CopyOnWriteArrayList();
    }

    public final void a(d dVar) {
        this.f117569d = dVar;
        Iterator it = this.f117568c.iterator();
        while (it.hasNext()) {
            uf2.d state = (uf2.d) it.next();
            try {
                Intrinsics.checkNotNullExpressionValue(state, "state");
                a aVar = new a(state, this, 1);
                if (state.f122118c) {
                    this.f117566a.b(new p4.a(10, aVar));
                } else {
                    aVar.invoke();
                }
            } catch (Throwable th3) {
                ((e) this.f117567b).b(g.SESSION_CHANGE_DATA_CAPTURE_FAIL, th3);
            }
        }
    }
}
