package a7;

import android.util.SparseBooleanArray;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final SparseBooleanArray f1162a;

    public p(SparseBooleanArray sparseBooleanArray) {
        this.f1162a = sparseBooleanArray;
    }

    public final int a(int i13) {
        SparseBooleanArray sparseBooleanArray = this.f1162a;
        bf.b.m(i13, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        int i13 = d7.n0.f53866a;
        SparseBooleanArray sparseBooleanArray = this.f1162a;
        if (i13 >= 24) {
            return sparseBooleanArray.equals(pVar.f1162a);
        }
        if (sparseBooleanArray.size() != pVar.f1162a.size()) {
            return false;
        }
        for (int i14 = 0; i14 < sparseBooleanArray.size(); i14++) {
            if (a(i14) != pVar.a(i14)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i13 = d7.n0.f53866a;
        SparseBooleanArray sparseBooleanArray = this.f1162a;
        if (i13 >= 24) {
            return sparseBooleanArray.hashCode();
        }
        int size = sparseBooleanArray.size();
        for (int i14 = 0; i14 < sparseBooleanArray.size(); i14++) {
            size = (size * 31) + a(i14);
        }
        return size;
    }
}
