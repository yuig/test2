package mu;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class k0 extends o2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p0 f88211a;

    public k0(p0 p0Var) {
        this.f88211a = p0Var;
    }

    @Override // androidx.recyclerview.widget.o2
    public final void j(RecyclerView recyclerView, int i13, int i14) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (recyclerView.N != 0) {
            p0 p0Var = this.f88211a;
            p0Var.Z7().a(new c(p0Var.b8().n1().f35424k));
        }
    }
}
