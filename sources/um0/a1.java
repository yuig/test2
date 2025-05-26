package um0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a1 implements l82.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final Set f122684a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f122685b;

    /* renamed from: c, reason: collision with root package name */
    public final int f122686c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f122687d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f122688e;

    public a1(Set selectedPins, Set pinsRemovedFromBulkSelection) {
        Intrinsics.checkNotNullParameter(selectedPins, "selectedPins");
        Intrinsics.checkNotNullParameter(pinsRemovedFromBulkSelection, "pinsRemovedFromBulkSelection");
        this.f122684a = selectedPins;
        this.f122685b = pinsRemovedFromBulkSelection;
        int size = selectedPins.size();
        this.f122686c = size < 0 ? 0 : size;
        Set set = selectedPins;
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((b1) it.next()).f122690a);
        }
        this.f122687d = arrayList;
        Set set2 = this.f122685b;
        ArrayList arrayList2 = new ArrayList(kotlin.collections.g0.q(set2, 10));
        Iterator it2 = set2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((b1) it2.next()).f122690a);
        }
        this.f122688e = arrayList2;
    }

    public final s42.b b(String id3) {
        Intrinsics.checkNotNullParameter(id3, "id");
        Set<b1> set = this.f122684a;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            for (b1 b1Var : set) {
                b1Var.getClass();
                Intrinsics.checkNotNullParameter(id3, "id");
                if (Intrinsics.d(id3, b1Var.f122690a)) {
                    return s42.b.SELECTED;
                }
            }
        }
        return s42.b.UNSELECTED;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        return Intrinsics.d(this.f122684a, a1Var.f122684a) && Intrinsics.d(this.f122685b, a1Var.f122685b);
    }

    public final int hashCode() {
        return this.f122685b.hashCode() + (this.f122684a.hashCode() * 31);
    }

    public final String toString() {
        return "PinSelectionVMState(selectedPins=" + this.f122684a + ", pinsRemovedFromBulkSelection=" + this.f122685b + ")";
    }
}
