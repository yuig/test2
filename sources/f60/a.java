package f60;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {
    public static b a(String str) {
        Object obj;
        Iterator<E> it = b.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.d(((b) obj).getValue(), str)) {
                break;
            }
        }
        b bVar = (b) obj;
        return bVar == null ? b.UNKNOWN : bVar;
    }
}
