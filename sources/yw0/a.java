package yw0;

import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import yq0.g0;

/* loaded from: classes5.dex */
public final class a extends g0 {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f140265j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f140266k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d0 pinalytics, h32.g0 g0Var, HashMap hashMap, int i13) {
        super(pinalytics, g0Var, null, hashMap);
        this.f140265j = i13;
        if (i13 != 1) {
            Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        } else {
            Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
            super(pinalytics, g0Var, null, hashMap);
        }
    }

    @Override // yq0.g0, ar0.o
    public final void k(RecyclerView recyclerView, int i13, int i14) {
        switch (this.f140265j) {
            case 0:
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                if (this.f140266k) {
                    super.k(recyclerView, i13, i14);
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                if (this.f140266k) {
                    super.k(recyclerView, i13, i14);
                    break;
                }
                break;
        }
    }
}
