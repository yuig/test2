package ads_mobile_sdk;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes2.dex */
public final class yb0 extends LinkedHashMap {

    /* renamed from: a, reason: collision with root package name */
    public final int f14180a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f14181b;

    /* renamed from: c, reason: collision with root package name */
    public final List f14182c;

    public yb0(int i13, ArrayList arrayList) {
        ld2 ld2Var = ld2.EVICTION_REASON_OVERFLOW;
        this.f14180a = i13;
        this.f14181b = ld2Var;
        this.f14182c = arrayList;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        if (size() <= this.f14180a) {
            return false;
        }
        this.f14182c.add(new Pair(this.f14181b, entry.getValue()));
        return true;
    }
}
