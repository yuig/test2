package a;

import ads_mobile_sdk.hw0;
import ads_mobile_sdk.l22;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public abstract class z2 implements Cloneable {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Iterable iterable, h4 h4Var) {
        hw0.a(iterable);
        if (iterable instanceof h1) {
            h4Var.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size();
            if (h4Var instanceof ArrayList) {
                ((ArrayList) h4Var).ensureCapacity(h4Var.size() + size);
            } else if (h4Var instanceof l22) {
                ((l22) h4Var).b(h4Var.size() + size);
            }
        }
        int size2 = h4Var.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj : iterable) {
                if (obj == null) {
                    a(size2, h4Var);
                    throw null;
                }
                h4Var.add(obj);
            }
            return;
        }
        List list = (List) iterable;
        int size3 = list.size();
        for (int i13 = 0; i13 < size3; i13++) {
            Object obj2 = list.get(i13);
            if (obj2 == null) {
                a(size2, h4Var);
                throw null;
            }
            h4Var.add(obj2);
        }
    }

    public static void a(int i13, h4 h4Var) {
        String e13 = a.e("Element at index ", h4Var.size() - i13, " is null.");
        for (int size = h4Var.size() - 1; size >= i13; size--) {
            h4Var.remove(size);
        }
        throw new NullPointerException(e13);
    }
}
