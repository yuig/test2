package sa0;

import java.util.Iterator;

/* loaded from: classes5.dex */
public final class c0 {
    public static d0 a(Integer num) {
        Object obj;
        Iterator<E> it = d0.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            int value = ((d0) obj).getValue();
            if (num != null && value == num.intValue()) {
                break;
            }
        }
        return (d0) obj;
    }
}
