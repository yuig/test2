package gi;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class f extends m {
    public void L(List list) {
        Object[] objArr = (Object[]) J();
        int length = objArr == null ? 0 : objArr.length;
        Object[] objArr2 = (Object[]) Array.newInstance(((Field) this.f65093b).getType().getComponentType(), list.size() + length);
        if (objArr != null) {
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            objArr2[length] = it.next();
            length++;
        }
        K(objArr2);
    }

    public void M(Collection collection) {
        Object[] objArr = (Object[]) J();
        int i13 = 0;
        Object[] objArr2 = (Object[]) Array.newInstance(((Field) this.f65093b).getType().getComponentType(), collection.size() + (objArr == null ? 0 : objArr.length));
        if (objArr != null) {
            System.arraycopy(objArr, 0, objArr2, collection.size(), objArr.length);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            objArr2[i13] = it.next();
            i13++;
        }
        K(objArr2);
    }
}
