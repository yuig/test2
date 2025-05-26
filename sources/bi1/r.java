package bi1;

import androidx.fragment.app.FragmentActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbi1/r;", "Lbi1/p;", "<init>", "()V", "videoFeature_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class r extends b {
    @Override // bi1.p, nl1.d, jl1.a, com.pinterest.framework.screens.m
    public final void activate() {
        super.activate();
        FragmentActivity E4 = E4();
        if (E4 != null) {
            Intrinsics.checkNotNullParameter(E4, "<this>");
            if (bs1.c.c1(E4)) {
                dl2.b.w2(bs1.c.k0(E4), 0);
            }
        }
    }

    @Override // bi1.p, nl1.d, jl1.a, com.pinterest.framework.screens.m
    public final void deactivate() {
        FragmentActivity E4 = E4();
        if (E4 != null) {
            dl2.b.a2(E4);
            dl2.b.s2(E4);
        }
        super.deactivate();
    }
}
