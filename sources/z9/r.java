package z9;

import androidx.lifecycle.l1;
import androidx.lifecycle.t1;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class r extends l1 implements p0 {

    /* renamed from: c, reason: collision with root package name */
    public static final q f141280c = new q();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f141281b = new LinkedHashMap();

    @Override // androidx.lifecycle.l1
    public final void g() {
        LinkedHashMap linkedHashMap = this.f141281b;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((t1) it.next()).a();
        }
        linkedHashMap.clear();
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("NavControllerViewModel{");
        sb3.append(Integer.toHexString(System.identityHashCode(this)));
        sb3.append("} ViewModelStores (");
        Iterator it = this.f141281b.keySet().iterator();
        while (it.hasNext()) {
            sb3.append((String) it.next());
            if (it.hasNext()) {
                sb3.append(", ");
            }
        }
        sb3.append(')');
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "sb.toString()");
        return sb4;
    }
}
