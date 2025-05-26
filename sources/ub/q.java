package ub;

import androidx.work.impl.WorkDatabase;
import kb.b0;
import tb.y;

/* loaded from: classes.dex */
public final class q implements kb.s {

    /* renamed from: a, reason: collision with root package name */
    public final vb.b f121687a;

    /* renamed from: b, reason: collision with root package name */
    public final sb.a f121688b;

    /* renamed from: c, reason: collision with root package name */
    public final y f121689c;

    static {
        b0.h("WMFgUpdater");
    }

    public q(WorkDatabase workDatabase, sb.a aVar, vb.b bVar) {
        this.f121688b = aVar;
        this.f121687a = bVar;
        this.f121689c = workDatabase.y();
    }
}
