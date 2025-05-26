package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class a implements Cloneable {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Iterable iterable, i0 i0Var) {
        Charset charset = j0.f18080a;
        iterable.getClass();
        if (iterable instanceof n0) {
            List h10 = ((n0) iterable).h();
            n0 n0Var = (n0) i0Var;
            int size = i0Var.size();
            for (Object obj : h10) {
                if (obj == null) {
                    String str = "Element at index " + (n0Var.size() - size) + " is null.";
                    for (int size2 = n0Var.size() - 1; size2 >= size; size2--) {
                        n0Var.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof i) {
                    n0Var.b0((i) obj);
                } else {
                    n0Var.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof h1) {
            i0Var.addAll((Collection) iterable);
            return;
        }
        if ((i0Var instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) i0Var).ensureCapacity(((Collection) iterable).size() + i0Var.size());
        }
        int size3 = i0Var.size();
        for (Object obj2 : iterable) {
            if (obj2 == null) {
                String str2 = "Element at index " + (i0Var.size() - size3) + " is null.";
                for (int size4 = i0Var.size() - 1; size4 >= size3; size4--) {
                    i0Var.remove(size4);
                }
                throw new NullPointerException(str2);
            }
            i0Var.add(obj2);
        }
    }

    public final d0 b(b bVar) {
        d0 d0Var = (d0) this;
        if (!d0Var.f18055a.getClass().isInstance(bVar)) {
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        d0Var.i((g0) bVar);
        return d0Var;
    }
}
