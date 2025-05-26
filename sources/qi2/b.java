package qi2;

import java.util.ArrayList;
import java.util.Comparator;
import kh2.p2;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f104006a = new ArrayList();

    public final a a() {
        ArrayList arrayList = this.f104006a;
        if (arrayList.size() == 2 && arrayList.get(0) != null) {
            return new a(arrayList.toArray());
        }
        Object[] array = arrayList.toArray();
        Comparator comparator = a.f104004c;
        for (int i13 = 0; i13 < array.length; i13 += 2) {
            ri2.e eVar = (ri2.e) array[i13];
            if (eVar != null && eVar.f108404b.isEmpty()) {
                array[i13] = null;
            }
        }
        p2.T("You must provide an even number of key/value pair arguments.", array.length % 2 == 0);
        if (array.length != 0) {
            Object[] objArr = new Object[array.length];
            System.arraycopy(array, 0, objArr, 0, array.length);
            int length = array.length;
            Comparator comparator2 = a.f104004c;
            ri2.d.d(objArr, 0, length, array, comparator2);
            int i14 = 0;
            Object obj = null;
            for (int i15 = 0; i15 < array.length; i15 += 2) {
                Object obj2 = array[i15];
                Object obj3 = array[i15 + 1];
                if (obj2 != null) {
                    if (obj != null && comparator2.compare(obj2, obj) == 0) {
                        i14 -= 2;
                    }
                    if (obj3 == null) {
                        obj = null;
                    } else {
                        int i16 = i14 + 1;
                        array[i14] = obj2;
                        i14 += 2;
                        array[i16] = obj3;
                        obj = obj2;
                    }
                }
            }
            if (array.length != i14) {
                Object[] objArr2 = new Object[i14];
                System.arraycopy(array, 0, objArr2, 0, i14);
                array = objArr2;
            }
        }
        return new a(array);
    }

    public final void b(ri2.e eVar, Object obj) {
        if (eVar == null || eVar.f108404b.isEmpty() || obj == null) {
            return;
        }
        ArrayList arrayList = this.f104006a;
        arrayList.add(eVar);
        arrayList.add(obj);
    }
}
