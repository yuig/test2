package n2;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class a extends kotlin.collections.q {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (!((entry instanceof Object ? entry : null) instanceof Map.Entry)) {
            return false;
        }
        Object key = entry.getKey();
        f fVar = ((h) this).f88945a;
        Object obj2 = fVar.get(key);
        return obj2 != null ? Intrinsics.d(obj2, entry.getValue()) : entry.getValue() == null && fVar.containsKey(entry.getKey());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if ((entry instanceof Object ? entry : null) instanceof Map.Entry) {
            return ((h) this).f88945a.remove(entry.getKey(), entry.getValue());
        }
        return false;
    }
}
