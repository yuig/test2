package m60;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class a0 extends LinkedHashMap {

    /* renamed from: a, reason: collision with root package name */
    public final int f85885a;

    public a0() {
        super(21, 1.0f, true);
        this.f85885a = 20;
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        return super.size() > this.f85885a;
    }
}
