package m9;

import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class j implements l9.d {

    /* renamed from: a, reason: collision with root package name */
    public final List f86615a;

    public j(List list) {
        this.f86615a = list;
    }

    @Override // l9.d
    public final int a(long j13) {
        return j13 < 0 ? 0 : -1;
    }

    @Override // l9.d
    public final List b(long j13) {
        return j13 >= 0 ? this.f86615a : Collections.emptyList();
    }

    @Override // l9.d
    public final long c(int i13) {
        bf.b.i(i13 == 0);
        return 0L;
    }

    @Override // l9.d
    public final int d() {
        return 1;
    }
}
