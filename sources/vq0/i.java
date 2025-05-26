package vq0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import sq0.e0;
import sq0.f0;
import sq0.o;
import yk1.n;
import yq0.a0;

/* loaded from: classes.dex */
public final class i implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final a0 f126437a;

    public i(a0 dataSource) {
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        this.f126437a = dataSource;
    }

    @Override // sq0.f0
    public final int a() {
        return this.f126437a.a();
    }

    @Override // sq0.f0
    public final int getItemViewType(int i13) {
        return this.f126437a.getItemViewType(i13);
    }

    @Override // sq0.f0
    public final void p(int i13, n view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f126437a.p(i13, view);
    }

    @Override // sq0.f0
    public final e0 q(int i13) {
        return this.f126437a;
    }

    @Override // sq0.f0
    public final o r(int i13) {
        return new o(this.f126437a, i13);
    }

    @Override // sq0.f0
    public final List s() {
        return kotlin.collections.e0.b(this.f126437a);
    }
}
