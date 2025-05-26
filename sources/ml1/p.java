package ml1;

import java.util.HashMap;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import m60.f0;

/* loaded from: classes2.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final f0 f87535a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f87536b;

    public p(f0 creator) {
        Intrinsics.checkNotNullParameter(creator, "creator");
        this.f87535a = creator;
        this.f87536b = new HashMap();
    }

    public final m a(int i13) {
        HashMap hashMap = this.f87536b;
        m mVar = (m) hashMap.get(Integer.valueOf(i13));
        if (mVar == null) {
            this.f87535a.getClass();
            b.Companion.getClass();
            for (b bVar : b.values()) {
                if (bVar.getValue() == i13) {
                    switch (c.f87522a[bVar.ordinal()]) {
                        case 1:
                            mVar = new h();
                            break;
                        case 2:
                            mVar = new i();
                            break;
                        case 3:
                            mVar = new l(false, true);
                            break;
                        case 4:
                            mVar = new o();
                            break;
                        case 5:
                            mVar = new f();
                            break;
                        case 6:
                            mVar = new l();
                            break;
                        case 7:
                            mVar = new l();
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    hashMap.put(Integer.valueOf(i13), mVar);
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        return mVar;
    }
}
