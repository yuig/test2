package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class g5 implements a7 {
    protected int zza;

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(Iterable iterable, i6 i6Var) {
        Charset charset = c6.f31325a;
        iterable.getClass();
        if (iterable instanceof l6) {
            List zzb = ((l6) iterable).zzb();
            l6 l6Var = (l6) i6Var;
            int size = i6Var.size();
            for (Object obj : zzb) {
                if (obj == null) {
                    String e13 = a.a.e("Element at index ", l6Var.size() - size, " is null.");
                    for (int size2 = l6Var.size() - 1; size2 >= size; size2--) {
                        l6Var.remove(size2);
                    }
                    throw new NullPointerException(e13);
                }
                if (obj instanceof o5) {
                    l6Var.G1((o5) obj);
                } else {
                    l6Var.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof h7) {
            i6Var.addAll((Collection) iterable);
            return;
        }
        if ((i6Var instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) i6Var).ensureCapacity(((Collection) iterable).size() + i6Var.size());
        }
        int size3 = i6Var.size();
        for (Object obj2 : iterable) {
            if (obj2 == null) {
                String e14 = a.a.e("Element at index ", i6Var.size() - size3, " is null.");
                for (int size4 = i6Var.size() - 1; size4 >= size3; size4--) {
                    i6Var.remove(size4);
                }
                throw new NullPointerException(e14);
            }
            i6Var.add(obj2);
        }
    }

    public abstract int a(n7 n7Var);

    public final byte[] c() {
        try {
            int a13 = ((a6) this).a(null);
            byte[] bArr = new byte[a13];
            q5 q5Var = new q5(bArr, a13);
            ((a6) this).i(q5Var);
            if (q5Var.i() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e13) {
            throw new RuntimeException(a.a.k("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e13);
        }
    }
}
