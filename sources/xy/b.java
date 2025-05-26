package xy;

import androidx.recyclerview.widget.RecyclerView;
import ar0.y;
import ey.w;
import kotlin.jvm.internal.Intrinsics;
import m60.u;
import ny.s;

/* loaded from: classes.dex */
public final class b implements y {

    /* renamed from: a, reason: collision with root package name */
    public boolean f136139a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f136140b;

    /* renamed from: c, reason: collision with root package name */
    public final a f136141c;

    public b() {
        a aVar = new a(this);
        this.f136141c = aVar;
        u.f85943a.h(aVar);
    }

    @Override // ar0.y
    public final void c(RecyclerView recyclerView, int i13, int i14) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
    }

    @Override // ar0.y
    public final void d(RecyclerView recyclerView, int i13) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (i13 == 0) {
            if (this.f136139a) {
                this.f136139a = false;
                u.f85943a.f(new w());
            }
            if (this.f136140b) {
                this.f136140b = false;
                u.f85943a.f(new s(false));
            }
        }
    }

    @Override // ar0.y
    public final void g(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
    }
}
