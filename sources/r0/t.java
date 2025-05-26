package r0;

import android.util.Range;
import android.util.Rational;
import android.util.Size;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class t {

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f105643b;

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f105644c;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f105645a = new HashMap();

    static {
        HashMap hashMap = new HashMap();
        f105643b = hashMap;
        hashMap.put(r.f105632d, Range.create(2160, 4319));
        hashMap.put(r.f105631c, Range.create(1080, 1439));
        hashMap.put(r.f105630b, Range.create(720, 1079));
        hashMap.put(r.f105629a, Range.create(Integer.valueOf(RecyclerViewTypes.VIEW_TYPE_SHOWCASE_SUBPAGE_ITEM), 719));
        HashMap hashMap2 = new HashMap();
        f105644c = hashMap2;
        hashMap2.put(0, e0.b.f56693a);
        hashMap2.put(1, e0.b.f56695c);
    }

    public t(List list, HashMap hashMap) {
        HashMap hashMap2;
        Integer num;
        r rVar;
        HashMap hashMap3 = f105643b;
        Iterator it = hashMap3.keySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            hashMap2 = f105644c;
            if (!hasNext) {
                break;
            }
            r rVar2 = (r) it.next();
            this.f105645a.put(new g(rVar2, -1), new ArrayList());
            Iterator it2 = hashMap2.keySet().iterator();
            while (it2.hasNext()) {
                this.f105645a.put(new g(rVar2, ((Integer) it2.next()).intValue()), new ArrayList());
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            List list2 = (List) this.f105645a.get(new g((r) entry.getKey(), -1));
            Objects.requireNonNull(list2);
            list2.add((Size) entry.getValue());
        }
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            Size size = (Size) it3.next();
            Iterator it4 = hashMap3.entrySet().iterator();
            while (true) {
                num = null;
                if (!it4.hasNext()) {
                    rVar = null;
                    break;
                }
                Map.Entry entry2 = (Map.Entry) it4.next();
                if (((Range) entry2.getValue()).contains((Range) Integer.valueOf(size.getHeight()))) {
                    rVar = (r) entry2.getKey();
                    break;
                }
            }
            if (rVar != null) {
                Iterator it5 = hashMap2.entrySet().iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        break;
                    }
                    Map.Entry entry3 = (Map.Entry) it5.next();
                    if (e0.b.a(size, (Rational) entry3.getValue(), k0.c.f77782b)) {
                        num = (Integer) entry3.getKey();
                        break;
                    }
                }
                if (num != null) {
                    List list3 = (List) this.f105645a.get(new g(rVar, num.intValue()));
                    Objects.requireNonNull(list3);
                    list3.add(size);
                }
            }
        }
        for (Map.Entry entry4 : this.f105645a.entrySet()) {
            Size size2 = (Size) hashMap.get(((g) entry4.getKey()).f105516a);
            if (size2 != null) {
                Size size3 = k0.c.f77781a;
                Collections.sort((List) entry4.getValue(), new s(size2.getHeight() * size2.getWidth(), 0));
            }
        }
    }
}
