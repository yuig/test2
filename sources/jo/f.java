package jo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f77136a;

    /* renamed from: b, reason: collision with root package name */
    public final List f77137b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f77138c;

    public f(String str, List list) {
        this.f77136a = str;
        this.f77137b = list;
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        int i13 = 1;
        while (it.hasNext()) {
            hashMap.put((String) it.next(), Integer.valueOf(i13));
            i13++;
        }
        this.f77138c = hashMap;
    }
}
