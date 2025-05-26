package is;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class a {
    public static b a(Integer num) {
        Object obj;
        Iterator<E> it = b.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            int value = ((b) obj).getValue();
            if (num != null && value == num.intValue()) {
                break;
            }
        }
        return (b) obj;
    }
}
