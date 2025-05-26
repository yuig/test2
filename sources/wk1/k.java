package wk1;

import android.content.Context;
import androidx.recyclerview.widget.h2;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import sq0.f0;
import yq0.z;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lwk1/k;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lsq0/e;", "Lnr0/j;", "<init>", "()V", "wk1/j", "fragmentLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class k<T> extends sq0.e<nr0.j> {
    public static final /* synthetic */ int L0 = 0;
    public h2 J0;
    public eb2.j K0;

    public eb2.a d9(f0 dataSourceProvider, int i13, int i14, int i15) {
        Intrinsics.checkNotNullParameter(dataSourceProvider, "dataSourceProvider");
        return new j(this, i13, i14, i15, X8(), dataSourceProvider);
    }

    public final eb2.j e9() {
        eb2.j jVar = this.K0;
        if (jVar != null) {
            return jVar;
        }
        Intrinsics.r("layoutManagerUtils");
        throw null;
    }

    @Override // yq0.t
    /* renamed from: f9 */
    public void y8(z adapter, f0 dataSourceProvider) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(dataSourceProvider, "dataSourceProvider");
        adapter.f139766l = new o((i) dataSourceProvider, e9(), b6());
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        int F0 = dl2.b.F0(requireContext, eo1.a.item_horizontal_spacing);
        int Z8 = Z8();
        Context requireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
        int F02 = dl2.b.F0(requireContext2, eo1.a.item_vertical_spacing);
        Intrinsics.checkNotNullParameter(dataSourceProvider, "dataSourceProvider");
        eb2.c cVar = new eb2.c(d9(dataSourceProvider, F0, Z8, F02), new u81.o(this, 1));
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.J0 = cVar;
        a8(cVar);
    }
}
