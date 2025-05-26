package gp1;

import kotlin.jvm.internal.Intrinsics;
import lb0.q;
import lh0.n1;
import nx.r0;
import xk2.m;
import xk2.v;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final n1 f65939a;

    /* renamed from: b, reason: collision with root package name */
    public final q f65940b;

    /* renamed from: c, reason: collision with root package name */
    public final v f65941c;

    public l(n1 experiments, q prefsManagerPersisted) {
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(prefsManagerPersisted, "prefsManagerPersisted");
        this.f65939a = experiments;
        this.f65940b = prefsManagerPersisted;
        this.f65941c = m.b(new r0(this, 21));
    }

    public final boolean a() {
        return ((Boolean) this.f65941c.getValue()).booleanValue() && this.f65940b.f("PREF_TYPEAHEAD_CACHE_READY", false);
    }
}
