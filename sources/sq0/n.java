package sq0;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lsq0/n;", "Lsq0/e;", "Lnr0/f;", "<init>", "()V", "fragmentLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public abstract class n extends e<nr0.f> {
    @Override // yq0.t
    public final void x8(yq0.m mVar, e0 e0Var) {
        yq0.z adapter = (yq0.z) mVar;
        nr0.f dataSource = (nr0.f) e0Var;
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        super.x8(adapter, dataSource);
        Intrinsics.checkNotNullExpressionValue(eb2.i.f58262a, "getInstance(...)");
        adapter.f139766l = new sr0.a(dataSource);
        adapter.f139767m = new sr0.b(dataSource);
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        int F0 = dl2.b.F0(requireContext, eo1.a.item_horizontal_spacing);
        int Z8 = Z8();
        Context requireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
        int F02 = dl2.b.F0(requireContext2, eo1.a.item_vertical_spacing);
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        a8(new eb2.c(U8(F0, Z8, F02, dataSource), new c(this)));
    }
}
