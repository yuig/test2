package e7;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class c extends e {

    /* renamed from: c, reason: collision with root package name */
    public final long f57525c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f57526d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f57527e;

    public c(int i13, long j13) {
        super(i13);
        this.f57525c = j13;
        this.f57526d = new ArrayList();
        this.f57527e = new ArrayList();
    }

    public final c n(int i13) {
        ArrayList arrayList = this.f57527e;
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            c cVar = (c) arrayList.get(i14);
            if (cVar.f57530b == i13) {
                return cVar;
            }
        }
        return null;
    }

    public final d o(int i13) {
        ArrayList arrayList = this.f57526d;
        int size = arrayList.size();
        for (int i14 = 0; i14 < size; i14++) {
            d dVar = (d) arrayList.get(i14);
            if (dVar.f57530b == i13) {
                return dVar;
            }
        }
        return null;
    }

    @Override // e7.e
    public final String toString() {
        return e.h(this.f57530b) + " leaves: " + Arrays.toString(this.f57526d.toArray()) + " containers: " + Arrays.toString(this.f57527e.toArray());
    }
}
