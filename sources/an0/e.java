package an0;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e {
    public static f a(String str) {
        Object obj;
        Iterator<E> it = f.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.d(((f) obj).getId(), str)) {
                break;
            }
        }
        return (f) obj;
    }
}
