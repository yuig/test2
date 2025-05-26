package yy;

import h32.f1;
import ir.v;
import kotlin.jvm.internal.Intrinsics;
import nx.f0;
import nx.m;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final f0 f140421a;

    public a(f0 pinalyticsFactory) {
        Intrinsics.checkNotNullParameter(pinalyticsFactory, "pinalyticsFactory");
        this.f140421a = pinalyticsFactory;
    }

    public final void a() {
        v vVar = new v(4);
        ((m) this.f140421a).a(vVar).U(vVar.generateLoggingContext(), f1.SERVICE_ENTRY, null, null, null, false);
    }
}
