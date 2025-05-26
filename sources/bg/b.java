package bg;

import java.util.HashMap;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;
import nj2.p;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Supplier {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22754a;

    public /* synthetic */ b(int i13) {
        this.f22754a = i13;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f22754a) {
            case 0:
                return new HashMap();
            case 1:
                return ThreadLocalRandom.current();
            case 2:
                return bj2.a.f22969c;
            default:
                return p.f91048a;
        }
    }
}
