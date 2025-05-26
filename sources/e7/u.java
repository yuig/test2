package e7;

import d7.d0;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class u implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public long f57604b = -9223372036854775807L;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f57603a = new ArrayList();

    public final void a(long j13, d0 d0Var) {
        bf.b.i(j13 != -9223372036854775807L);
        ArrayList arrayList = this.f57603a;
        bf.b.t(arrayList.isEmpty());
        this.f57604b = j13;
        arrayList.add(d0Var);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f57604b, ((u) obj).f57604b);
    }
}
