package on2;

import i2.j2;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Object f96773a;

    /* renamed from: b, reason: collision with root package name */
    public final Function0 f96774b;

    public i(Object obj, j2 j2Var) {
        this.f96773a = obj;
        this.f96774b = j2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && i.class == obj.getClass() && this.f96773a.equals(((i) obj).f96773a);
    }

    public final int hashCode() {
        return this.f96773a.hashCode();
    }
}
