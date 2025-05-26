package y9;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f138119a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f138120b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f138121c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f138122d = new ArrayList();

    public p() {
        new ArrayList();
    }

    public final void a(ArrayList arrayList) {
        int size = arrayList.size() - 1;
        if (size >= 0) {
            ep.b.A(arrayList.get(size));
            throw null;
        }
        ArrayList arrayList2 = this.f138121c;
        if (arrayList2.size() <= 0) {
            return;
        }
        int size2 = arrayList2.size();
        int i13 = 0;
        while (true) {
            ArrayList arrayList3 = this.f138122d;
            if (i13 >= size2) {
                for (int size3 = arrayList3.size() - 1; -1 < size3; size3--) {
                    arrayList2.remove(((Number) arrayList3.get(size3)).intValue());
                }
                if (arrayList2.size() > 0) {
                    ep.b.A(arrayList2.get(0));
                    throw null;
                }
                arrayList2.clear();
                arrayList3.clear();
                return;
            }
            if (!arrayList3.contains(Integer.valueOf(i13))) {
                ep.b.A(arrayList2.get(i13));
                int i14 = i13 + 1;
                if (i14 < arrayList2.size()) {
                    ep.b.A(arrayList2.get(i14));
                    throw null;
                }
            }
            i13++;
        }
    }

    public final void b() {
        synchronized (this.f138120b) {
            int size = this.f138120b.size() - 1;
            if (-1 < size) {
                ep.b.A(this.f138120b.get(size));
                throw null;
            }
            Unit unit = Unit.f80348a;
        }
    }

    public final void c(long j13, long j14, ArrayList frameStates) {
        Intrinsics.checkNotNullParameter(frameStates, "frameStates");
        synchronized (this.f138120b) {
            frameStates.clear();
            a(this.f138119a);
            a(this.f138120b);
            Unit unit = Unit.f80348a;
        }
    }
}
