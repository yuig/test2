package ro2;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f108980a = new LinkedHashMap();

    public final n a(String key, n element) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(element, "element");
        return (n) this.f108980a.put(key, element);
    }
}
