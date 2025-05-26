package v42;

import android.os.SystemClock;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a extends o2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f124137a;

    public a(c cVar) {
        this.f124137a = cVar;
    }

    @Override // androidx.recyclerview.widget.o2
    public final void j(RecyclerView recyclerView, int i13, int i14) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        SystemClock.elapsedRealtime();
        c cVar = this.f124137a;
        cVar.getClass();
        RecyclerView g83 = cVar.g8();
        if (!((g83 != null ? g83.computeVerticalScrollOffset() : 0) > cVar.S0)) {
            bs1.c.X0(cVar.getF111140i1());
            return;
        }
        if (cVar.T0) {
            if (cVar.l9()) {
                return;
            }
            bs1.c.U1(cVar.getF111140i1());
        } else if (cVar.l9()) {
            bs1.c.X0(cVar.getF111140i1());
        }
    }
}
