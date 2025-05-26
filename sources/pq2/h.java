package pq2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class h extends ln2.k {
    public h() {
        super(12);
    }

    @Override // ln2.k
    public final List g(Executor executor) {
        return Arrays.asList(new n(), new s(executor));
    }

    @Override // ln2.k
    public final List h() {
        return Collections.singletonList(new g(1));
    }
}
