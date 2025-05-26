package qv0;

import cn1.f0;
import com.pinterest.gestalt.searchField.GestaltSearchField;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class c implements gm1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f105161a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f105162b;

    public /* synthetic */ c(g gVar, int i13) {
        this.f105161a = i13;
        this.f105162b = gVar;
    }

    @Override // gm1.a
    public final void h3(gm1.c it) {
        nv0.b bVar;
        int i13 = this.f105161a;
        g this$0 = this.f105162b;
        switch (i13) {
            case 0:
                int i14 = g.N0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof om1.l) {
                    GestaltSearchField gestaltSearchField = this$0.H0;
                    if (gestaltSearchField == null) {
                        Intrinsics.r("searchBar");
                        throw null;
                    }
                    hf0.b.k(gestaltSearchField);
                    this$0.P7();
                    return;
                }
                return;
            default:
                int i15 = g.N0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "event");
                if ((it instanceof xl1.a) && it.j() == f0.gestalt_trailing_button && (bVar = this$0.J0) != null) {
                    bVar.L2(nv0.d.f92354b);
                    return;
                }
                return;
        }
    }
}
