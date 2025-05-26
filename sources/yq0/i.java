package yq0;

import androidx.recyclerview.widget.b2;
import androidx.recyclerview.widget.g1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i implements g1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f139705a;

    /* renamed from: b, reason: collision with root package name */
    public final sq0.d0 f139706b;

    /* renamed from: c, reason: collision with root package name */
    public final a0 f139707c;

    /* renamed from: d, reason: collision with root package name */
    public final x f139708d;

    public i(int i13, z adapter, a0 dataSource, x xVar) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        this.f139705a = i13;
        this.f139706b = adapter;
        this.f139707c = dataSource;
        this.f139708d = xVar;
    }

    @Override // androidx.recyclerview.widget.g1
    public final void j(int i13, int i14) {
        x xVar = this.f139708d;
        if (xVar != null) {
            xVar.d(this.f139707c, i14);
        }
        ((b2) this.f139706b).n(i13 + this.f139705a, i14);
    }

    @Override // androidx.recyclerview.widget.g1
    public final void m(int i13, int i14) {
        x xVar = this.f139708d;
        if (xVar != null) {
            xVar.g(this.f139707c, i14);
        }
        ((b2) this.f139706b).o(i13 + this.f139705a, i14);
    }

    @Override // androidx.recyclerview.widget.g1
    public final void p(int i13, Object obj, int i14) {
        x xVar = this.f139708d;
        if (xVar != null) {
            xVar.e(this.f139707c);
        }
        ((b2) this.f139706b).l(i13 + this.f139705a, i14);
    }

    @Override // androidx.recyclerview.widget.g1
    public final void q(int i13, int i14) {
        x xVar = this.f139708d;
        if (xVar != null) {
            xVar.f(this.f139707c);
        }
        int i15 = this.f139705a;
        ((b2) this.f139706b).k(i13 + i15, i14 + i15);
    }
}
