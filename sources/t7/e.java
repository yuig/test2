package t7;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class e extends LinkedHashMap {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f116472a = 4;

    public e(int i13) {
        super(i13, 1.0f, false);
    }

    @Override // java.util.LinkedHashMap
    public final boolean removeEldestEntry(Map.Entry entry) {
        return size() > this.f116472a;
    }
}
