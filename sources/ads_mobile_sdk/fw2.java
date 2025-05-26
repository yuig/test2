package ads_mobile_sdk;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class fw2 implements Map.Entry, ll2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Map.Entry f5296a;

    public fw2(Map.Entry delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f5296a = delegate;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f5296a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f5296a.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
