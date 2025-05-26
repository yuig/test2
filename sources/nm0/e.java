package nm0;

import com.pinterest.api.model.ba;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import lm0.f0;
import o82.z;

/* loaded from: classes5.dex */
public final class e implements z {

    /* renamed from: a, reason: collision with root package name */
    public final int f91372a;

    public e(int i13) {
        this.f91372a = i13;
    }

    @Override // o82.z
    public final ArrayList a(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        ArrayList arrayList = new ArrayList(g0.q(items, 10));
        Iterator it = items.iterator();
        while (it.hasNext()) {
            f0 f0Var = (f0) it.next();
            ba section = f0Var.f83862a;
            Intrinsics.checkNotNullParameter(section, "section");
            arrayList.add(new f0(section, this.f91372a, f0Var.f83864c));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof e) && ((e) obj).f91372a == this.f91372a;
    }

    public final int hashCode() {
        return this.f91372a;
    }
}
