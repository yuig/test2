package ep;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import nr0.p;

/* loaded from: classes3.dex */
public final class k implements p {

    /* renamed from: a, reason: collision with root package name */
    public final n f59884a;

    public k(n inviteContactRequestType) {
        Intrinsics.checkNotNullParameter(inviteContactRequestType, "inviteContactRequestType");
        this.f59884a = inviteContactRequestType;
    }

    @Override // nr0.p
    public final boolean c() {
        return true;
    }

    @Override // nr0.p
    public final boolean e(int i13) {
        return true;
    }

    @Override // nr0.p
    public final boolean f(int i13) {
        return RecyclerViewTypes.FULL_SPAN_ITEM_TYPES.contains(Integer.valueOf(i13));
    }

    @Override // nr0.p
    public final int getItemViewType(int i13) {
        int i14 = j.f59883a[this.f59884a.ordinal()];
        if (i14 == 1) {
            return 1;
        }
        if (i14 == 2) {
            return 3;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // nr0.p
    public final boolean h(int i13) {
        return true;
    }

    @Override // nr0.p
    public final boolean m() {
        return true;
    }

    @Override // nr0.p
    public final boolean q(int i13) {
        return RecyclerViewTypes.INSTANCE.getFULL_BLEED_ITEM_TYPES().contains(Integer.valueOf(i13));
    }
}
