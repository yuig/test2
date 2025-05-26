package s90;

import java.util.Iterator;

/* loaded from: classes5.dex */
public final class u0 {
    public static v0 a(int i13) {
        Object obj;
        Iterator<E> it = v0.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((v0) obj).getValue() == i13) {
                break;
            }
        }
        v0 v0Var = (v0) obj;
        return v0Var == null ? v0.PinCloseup : v0Var;
    }
}
