package t42;

import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import nr0.j;
import s42.f;
import we1.f2;
import wt1.e0;
import yk1.v;

/* loaded from: classes4.dex */
public final class a extends e0 implements j {

    /* renamed from: h, reason: collision with root package name */
    public final f f116420h;

    public a(v viewResources) {
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        f fVar = new f(((yk1.a) viewResources).f139224a.getString(x0.select_or_reorder), null, 2, null);
        this.f116420h = fVar;
        o(68, new f2(20));
        k(kotlin.collections.e0.b(fVar));
    }

    @Override // nr0.g
    public final boolean f(int i13) {
        return true;
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        return 68;
    }

    @Override // nr0.g
    public final boolean n0(int i13) {
        return true;
    }
}
