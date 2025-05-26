package a41;

import androidx.recyclerview.widget.RecyclerView;
import com.pinterest.gestalt.searchField.GestaltStaticSearchBar;
import com.pinterest.gestalt.tabs.GestaltTabLayout;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q extends ek.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f644d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f645e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, GestaltTabLayout gestaltTabLayout) {
        super(gestaltTabLayout);
        this.f645e = rVar;
    }

    @Override // ek.f, xa.i
    public final void A5(int i13) {
        p41.b bVar;
        super.A5(i13);
        this.f644d = true;
        r rVar = this.f645e;
        l0 l0Var = rVar.f668t1;
        if (l0Var != null) {
            d0 d0Var = (d0) l0Var;
            if (d0Var.R) {
                ArrayList arrayList = d0Var.L;
                if (!arrayList.isEmpty() || (bVar = d0Var.M) == null) {
                    bVar = (p41.b) CollectionsKt.U(i13, arrayList);
                }
                d0Var.N = bVar;
                d0Var.O = bVar != null ? bVar.f98848e : null;
            }
        }
        boolean z13 = !rVar.p8().isPublic() && (((t) rVar.a8()).u(i13) instanceof r0) && rVar.s8();
        GestaltStaticSearchBar gestaltStaticSearchBar = rVar.f652g1;
        if (gestaltStaticSearchBar != null) {
            gestaltStaticSearchBar.d0(new i31.a(z13, 4));
        } else {
            Intrinsics.r("searchFieldWithActions");
            throw null;
        }
    }

    @Override // ek.f, xa.i
    public final void i5(int i13) {
        gq0.d dVar;
        RecyclerView g83;
        super.i5(i13);
        boolean z13 = this.f644d;
        r rVar = this.f645e;
        if (z13 && i13 == 0) {
            this.f644d = false;
            com.pinterest.framework.screens.a Z7 = rVar.Z7();
            uk1.b bVar = Z7 instanceof uk1.b ? (uk1.b) Z7 : null;
            if (bVar != null && (g83 = (dVar = (gq0.d) bVar).g8()) != null) {
                dVar.C0.h(g83);
            }
        }
        if (i13 == 1) {
            int i14 = r.P1;
            if (rVar.x8() && rVar.x8()) {
                ((t) rVar.a8()).M();
            }
        }
    }
}
