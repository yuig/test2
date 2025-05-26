package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.measurement.p7;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public class v1 extends AbstractSet {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18156a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractMap f18157b;

    public /* synthetic */ v1(AbstractMap abstractMap, int i13) {
        this.f18156a = i13;
        this.f18157b = abstractMap;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* synthetic */ boolean add(Object obj) {
        switch (this.f18156a) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    ((p7) this.f18157b).e((Comparable) entry.getKey(), entry.getValue());
                    break;
                }
                break;
        }
        return b((Map.Entry) obj);
    }

    public final boolean b(Map.Entry entry) {
        int i13 = this.f18156a;
        AbstractMap abstractMap = this.f18157b;
        switch (i13) {
            case 0:
                if (!contains(entry)) {
                    ((p1) abstractMap).m((Comparable) entry.getKey(), entry.getValue());
                    break;
                }
                break;
            case 1:
            default:
                if (!contains(entry)) {
                    ((com.google.protobuf.f2) abstractMap).put((Comparable) entry.getKey(), entry.getValue());
                    break;
                }
                break;
            case 2:
                if (!contains(entry)) {
                    ((com.google.crypto.tink.shaded.protobuf.s1) abstractMap).d((Comparable) entry.getKey(), entry.getValue());
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int i13 = this.f18156a;
        AbstractMap abstractMap = this.f18157b;
        switch (i13) {
            case 0:
                ((p1) abstractMap).clear();
                break;
            case 1:
                ((p7) abstractMap).a();
                break;
            case 2:
                ((com.google.crypto.tink.shaded.protobuf.s1) abstractMap).b();
                break;
            default:
                ((com.google.protobuf.f2) abstractMap).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i13 = this.f18156a;
        AbstractMap abstractMap = this.f18157b;
        switch (i13) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = ((p1) abstractMap).get(entry.getKey());
                Object value = entry.getValue();
                if (obj2 != value) {
                    if (obj2 == null || !obj2.equals(value)) {
                        break;
                    }
                }
                break;
            case 1:
                Map.Entry entry2 = (Map.Entry) obj;
                Object b13 = ((p7) abstractMap).b(entry2.getKey());
                Object value2 = entry2.getValue();
                if (b13 != value2) {
                    if (b13 == null || !b13.equals(value2)) {
                        break;
                    }
                }
                break;
            case 2:
                Map.Entry entry3 = (Map.Entry) obj;
                Object c13 = ((com.google.crypto.tink.shaded.protobuf.s1) abstractMap).c(entry3.getKey());
                Object value3 = entry3.getValue();
                if (c13 != value3) {
                    if (c13 == null || !c13.equals(value3)) {
                        break;
                    }
                }
                break;
            default:
                Map.Entry entry4 = (Map.Entry) obj;
                Object obj3 = ((com.google.protobuf.f2) abstractMap).get(entry4.getKey());
                Object value4 = entry4.getValue();
                if (obj3 != value4) {
                    if (obj3 == null || !obj3.equals(value4)) {
                        break;
                    }
                }
                break;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        int i13 = this.f18156a;
        AbstractMap abstractMap = this.f18157b;
        switch (i13) {
            case 0:
                return new u1((p1) abstractMap);
            case 1:
                return new u1((p7) abstractMap);
            case 2:
                return new u1((com.google.crypto.tink.shaded.protobuf.s1) abstractMap);
            default:
                return new u1((com.google.protobuf.f2) abstractMap);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i13 = this.f18156a;
        AbstractMap abstractMap = this.f18157b;
        switch (i13) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    ((p1) abstractMap).remove(entry.getKey());
                    break;
                }
                break;
            case 1:
                Map.Entry entry2 = (Map.Entry) obj;
                if (contains(entry2)) {
                    ((p7) abstractMap).c(entry2.getKey());
                    break;
                }
                break;
            case 2:
                Map.Entry entry3 = (Map.Entry) obj;
                if (contains(entry3)) {
                    ((com.google.crypto.tink.shaded.protobuf.s1) abstractMap).e(entry3.getKey());
                    break;
                }
                break;
            default:
                Map.Entry entry4 = (Map.Entry) obj;
                if (contains(entry4)) {
                    ((com.google.protobuf.f2) abstractMap).remove(entry4.getKey());
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i13 = this.f18156a;
        AbstractMap abstractMap = this.f18157b;
        switch (i13) {
            case 0:
                return ((p1) abstractMap).size();
            case 1:
                return ((p7) abstractMap).d();
            case 2:
                return ((com.google.crypto.tink.shaded.protobuf.s1) abstractMap).g();
            default:
                return ((com.google.protobuf.f2) abstractMap).size();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v1(com.google.protobuf.f2 f2Var) {
        this(f2Var, 3);
        this.f18156a = 3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v1(p1 p1Var) {
        this(p1Var, 0);
        this.f18156a = 0;
    }
}
