package lb0;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class a extends LinkedHashMap {
    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        return size() > 100;
    }
}
