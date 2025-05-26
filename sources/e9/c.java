package e9;

import a7.m0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class c implements m0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f57906a;

    public c(ArrayList arrayList) {
        this.f57906a = arrayList;
        boolean z13 = false;
        if (!arrayList.isEmpty()) {
            long j13 = ((b) arrayList.get(0)).f57904b;
            int i13 = 1;
            while (true) {
                if (i13 >= arrayList.size()) {
                    break;
                }
                if (((b) arrayList.get(i13)).f57903a < j13) {
                    z13 = true;
                    break;
                } else {
                    j13 = ((b) arrayList.get(i13)).f57904b;
                    i13++;
                }
            }
        }
        bf.b.i(!z13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return this.f57906a.equals(((c) obj).f57906a);
    }

    public final int hashCode() {
        return this.f57906a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.f57906a;
    }
}
