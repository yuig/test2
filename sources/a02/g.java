package a02;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import za.j;

/* loaded from: classes4.dex */
public final class g extends j {

    /* renamed from: m, reason: collision with root package name */
    public final List f228m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(FragmentActivity fragmentActivity, ArrayList fragments) {
        super(fragmentActivity.getSupportFragmentManager(), fragmentActivity.getLifecycle());
        Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
        Intrinsics.checkNotNullParameter(fragments, "fragments");
        this.f228m = fragments;
    }

    @Override // za.j
    public final Fragment E(int i13) {
        return (Fragment) this.f228m.get(i13);
    }

    public final Fragment J(rl2.d dVar) {
        Object obj;
        Iterator it = this.f228m.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.d(k0.f80436a.b(((Fragment) obj).getClass()), dVar)) {
                break;
            }
        }
        return (Fragment) obj;
    }

    public final int K(rl2.d dVar) {
        Iterator it = this.f228m.iterator();
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                i13 = -1;
                break;
            }
            if (Intrinsics.d(k0.f80436a.b(((Fragment) it.next()).getClass()), dVar)) {
                break;
            }
            i13++;
        }
        if (i13 == -1) {
            return 0;
        }
        return i13;
    }

    @Override // androidx.recyclerview.widget.b2
    public final int e() {
        return this.f228m.size();
    }
}
