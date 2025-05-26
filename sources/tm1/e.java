package tm1;

import java.util.LinkedHashMap;
import kotlin.collections.y0;

/* loaded from: classes5.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f118140a;

    static {
        d[] values = d.values();
        int a13 = y0.a(values.length);
        if (a13 < 16) {
            a13 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a13);
        for (d dVar : values) {
            linkedHashMap.put(dVar.name(), dVar);
        }
        f118140a = linkedHashMap;
    }
}
