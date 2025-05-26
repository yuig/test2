package h91;

import com.pinterest.activity.sendapin.model.TypeAheadItem;
import java.util.Iterator;
import java.util.LinkedHashMap;
import pk.a0;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final a f68311d = new a();

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f68312a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f68313b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f68314c = new LinkedHashMap();

    public static String b(TypeAheadItem typeAheadItem) {
        String A = typeAheadItem.A();
        return a0.x0(A) ? typeAheadItem.k() : A;
    }

    public final void a() {
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2 = this.f68314c;
        Iterator it = linkedHashMap2.keySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            linkedHashMap = this.f68312a;
            if (!hasNext) {
                break;
            } else {
                linkedHashMap.remove((String) it.next());
            }
        }
        LinkedHashMap linkedHashMap3 = this.f68313b;
        for (String str : linkedHashMap3.keySet()) {
            linkedHashMap.put(str, (TypeAheadItem) linkedHashMap3.get(str));
        }
        linkedHashMap3.clear();
        linkedHashMap2.clear();
    }
}
