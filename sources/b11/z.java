package b11;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o2;
import com.pinterest.feature.pin.closeup.view.PinCloseupFragment;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import oq.x0;

/* loaded from: classes5.dex */
public final class z extends o2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PinCloseupFragment f21092a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f21093b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f21094c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f21095d = true;

    public z(PinCloseupFragment pinCloseupFragment, List list, int i13) {
        this.f21092a = pinCloseupFragment;
        this.f21093b = list;
        this.f21094c = i13;
    }

    @Override // androidx.recyclerview.widget.o2
    public final void g(RecyclerView recyclerView, int i13) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (i13 == 0) {
            PinCloseupFragment pinCloseupFragment = this.f21092a;
            x0 x0Var = pinCloseupFragment.f46997i2;
            if (x0Var != null) {
                i01.l0.w0(x0Var, this.f21093b, this.f21094c, false, "", this.f21095d, 0.0f, 0.0f, 96);
            } else {
                tq.y yVar = pinCloseupFragment.f47000j2;
                if (yVar != null) {
                    yVar.q(this.f21093b, this.f21095d);
                }
            }
            pinCloseupFragment.A8(this);
        }
    }
}
