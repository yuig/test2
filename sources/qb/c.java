package qb;

import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import tb.s;

/* loaded from: classes.dex */
public abstract class c implements e {

    /* renamed from: a, reason: collision with root package name */
    public final rb.f f103383a;

    public c(rb.f tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f103383a = tracker;
    }

    @Override // qb.e
    public final do2.c b(kb.g constraints) {
        Intrinsics.checkNotNullParameter(constraints, "constraints");
        return l0.D(new b(this, null));
    }

    @Override // qb.e
    public final boolean c(s workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        return a(workSpec) && e(this.f103383a.a());
    }

    public abstract int d();

    public abstract boolean e(Object obj);
}
