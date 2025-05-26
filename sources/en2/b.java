package en2;

import im2.k;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class b implements Comparable {
    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(Object obj) {
        b other = (b) obj;
        Intrinsics.checkNotNullParameter(other, "other");
        a aVar = a.ERROR;
        ((k) other).getClass();
        return aVar.compareTo(aVar);
    }
}
