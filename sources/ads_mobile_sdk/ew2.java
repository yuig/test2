package ads_mobile_sdk;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ew2 extends aw2 implements Set {

    /* renamed from: b, reason: collision with root package name */
    public final Set f4977b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ew2(Set delegate) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f4977b = delegate;
    }

    @Override // ads_mobile_sdk.aw2, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return this.f2565a.contains((Map.Entry) obj);
    }

    @Override // ads_mobile_sdk.aw2, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new dw2(this.f4977b.iterator());
    }
}
