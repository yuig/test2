package tc;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k extends l {

    /* renamed from: a, reason: collision with root package name */
    public final Map f117204a;

    /* renamed from: b, reason: collision with root package name */
    public String f117205b;

    public k(LinkedHashMap map) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.f117204a = map;
        this.f117205b = null;
    }

    public final String toString() {
        return ep.b.k(new StringBuilder("Map ("), this.f117205b, ')');
    }
}
