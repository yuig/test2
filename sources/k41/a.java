package k41;

import java.util.Iterator;

/* loaded from: classes5.dex */
public final class a {
    public static b a(int i13) {
        Object obj;
        Iterator<E> it = b.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((b) obj).ordinal() == i13) {
                break;
            }
        }
        return (b) obj;
    }
}
