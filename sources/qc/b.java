package qc;

import kotlin.jvm.internal.Intrinsics;
import wo2.k;
import wo2.m;

/* loaded from: classes.dex */
public final class b implements e {

    /* renamed from: a, reason: collision with root package name */
    public final long f103427a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f103428b;

    public b(m mVar) {
        this.f103428b = mVar;
        this.f103427a = mVar.b();
    }

    @Override // qc.e
    public final long a() {
        return this.f103427a;
    }

    @Override // qc.e
    public final void b(k bufferedSink) {
        Intrinsics.checkNotNullParameter(bufferedSink, "bufferedSink");
        bufferedSink.t1(this.f103428b);
    }

    @Override // qc.e
    public final String getContentType() {
        return "application/json";
    }
}
