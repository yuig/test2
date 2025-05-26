package ey;

import java.util.LinkedHashSet;
import java.util.SortedMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f60450a;

    /* renamed from: b, reason: collision with root package name */
    public final b0 f60451b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f60452c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f60453d;

    /* renamed from: e, reason: collision with root package name */
    public final long f60454e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f60455f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f60456g;

    public c0(long j13, b0 tag, Runnable runnable, boolean z13, boolean z14, boolean z15, boolean z16) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.f60450a = runnable;
        this.f60451b = tag;
        this.f60452c = z13;
        this.f60453d = z14;
        this.f60454e = j13;
        this.f60455f = z15;
        this.f60456g = z16;
    }

    public abstract m60.t a();

    public abstract boolean b();

    public final void c() {
        LinkedHashSet linkedHashSet = d0.f60468a;
        Intrinsics.checkNotNullParameter(this, "task");
        m60.t a13 = a();
        LinkedHashSet linkedHashSet2 = d0.f60468a;
        boolean z13 = this.f60456g;
        b0 b0Var = this.f60451b;
        if (z13) {
            linkedHashSet2.remove(b0Var);
        }
        if (linkedHashSet2.contains(b0Var)) {
            return;
        }
        if (!b()) {
            SortedMap scheduledTasks = d0.f60469b;
            Intrinsics.checkNotNullExpressionValue(scheduledTasks, "scheduledTasks");
            scheduledTasks.put(b0Var, this);
        }
        m60.u.f85943a.h(a13);
        if (this.f60453d) {
            d0.b(this.f60454e, new androidx.activity.d(this, 27), this.f60452c);
        }
    }
}
