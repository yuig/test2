package b11;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x implements yq0.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yq0.u f21090a;

    public x(yq0.u uVar) {
        this.f21090a = uVar;
    }

    @Override // yq0.u
    public final void E(yq0.d0 viewHolder, int i13) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        yq0.u uVar = this.f21090a;
        if (uVar != null) {
            uVar.E(viewHolder, i13);
        }
    }

    @Override // yq0.u
    public final void F(yq0.d0 viewHolder, RecyclerView parent, int i13) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(parent, "parent");
        yq0.u uVar = this.f21090a;
        if (uVar != null) {
            uVar.F(viewHolder, parent, i13);
        }
        if (i13 == 87) {
            viewHolder.a0(false);
        } else {
            if (i13 != 107) {
                return;
            }
            viewHolder.a0(false);
        }
    }

    @Override // yq0.u
    public final void K(yq0.d0 viewHolder, int i13) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        yq0.u uVar = this.f21090a;
        if (uVar != null) {
            uVar.K(viewHolder, i13);
        }
    }

    @Override // yq0.u
    public final void o(RecyclerView parent, int i13) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        yq0.u uVar = this.f21090a;
        if (uVar != null) {
            uVar.o(parent, i13);
        }
    }
}
