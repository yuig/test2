package ads_mobile_sdk;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes2.dex */
public final class qf2 implements a.ca {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f10067c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final List f10068a;

    /* renamed from: b, reason: collision with root package name */
    public final List f10069b;

    static {
        xv0.a(Collections.emptySet());
    }

    public qf2(List list, List list2) {
        this.f10068a = list;
        this.f10069b = list2;
    }

    @Override // a.v7
    public final Object get() {
        int size = this.f10068a.size();
        ArrayList arrayList = new ArrayList(this.f10069b.size());
        int size2 = this.f10069b.size();
        for (int i13 = 0; i13 < size2; i13++) {
            Collection collection = (Collection) ((a.o8) this.f10069b.get(i13)).get();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet hashSet = new HashSet(size < 3 ? size + 1 : size < 1073741824 ? (int) ((size / 0.75f) + 1.0f) : Integer.MAX_VALUE);
        int size3 = this.f10068a.size();
        for (int i14 = 0; i14 < size3; i14++) {
            Object obj = ((a.o8) this.f10068a.get(i14)).get();
            obj.getClass();
            hashSet.add(obj);
        }
        int size4 = arrayList.size();
        for (int i15 = 0; i15 < size4; i15++) {
            for (Object obj2 : (Collection) arrayList.get(i15)) {
                obj2.getClass();
                hashSet.add(obj2);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }
}
