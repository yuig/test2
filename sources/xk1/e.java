package xk1;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import nr0.g;
import nr0.j;
import vq0.h;
import wt1.e0;

/* loaded from: classes5.dex */
public final class e extends e0 implements j {

    /* renamed from: h, reason: collision with root package name */
    public final g f135197h;

    /* renamed from: i, reason: collision with root package name */
    public final LinkedHashSet f135198i;

    public e(g spacer) {
        Intrinsics.checkNotNullParameter(spacer, "spacer");
        this.f135197h = spacer;
        this.f135198i = new LinkedHashSet();
    }

    @Override // wt1.e0, vq0.f
    public final Set X1() {
        return this.f135198i;
    }

    @Override // vq0.f, nr0.a
    public final void c(int[] ids, h viewBinderInstance) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        Intrinsics.checkNotNullParameter(viewBinderInstance, "viewBinderInstance");
        throw new IllegalStateException("StaticViews does not support view binding");
    }

    @Override // nr0.g
    public final boolean c3(int i13) {
        return this.f135197h.c3(i13);
    }

    @Override // nr0.g
    public final boolean e(int i13) {
        return this.f135197h.e(i13);
    }

    @Override // nr0.g
    public final boolean f(int i13) {
        return this.f135197h.f(i13);
    }

    @Override // nr0.g
    public final boolean f3(int i13) {
        return this.f135197h.f3(i13);
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        Object item = getItem(i13);
        Intrinsics.f(item);
        return ((Number) item).intValue();
    }

    @Override // nr0.g
    public final boolean h(int i13) {
        return this.f135197h.h(i13);
    }

    @Override // nr0.g
    public final boolean k2(int i13) {
        return this.f135197h.k2(i13);
    }

    @Override // nr0.g
    public final boolean n0(int i13) {
        return this.f135197h.n0(i13);
    }

    @Override // wt1.e0, vq0.f
    public final void o(int i13, h viewBinderInstance) {
        Intrinsics.checkNotNullParameter(viewBinderInstance, "viewBinderInstance");
        throw new IllegalStateException("StaticViews does not support view binding");
    }

    public final void u(int i13) {
        j2(Integer.valueOf(i13));
        this.f135198i.add(Integer.valueOf(i13));
    }

    public /* synthetic */ e() {
        this(new jp.b(2));
    }
}
