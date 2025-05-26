package ri2;

import java.util.AbstractMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class g extends i {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f108408b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f108409c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(j jVar, int i13) {
        super(jVar);
        this.f108408b = i13;
        this.f108409c = jVar;
    }

    @Override // ri2.i
    public final Object b(int i13) {
        int i14 = this.f108408b;
        j jVar = this.f108409c;
        switch (i14) {
            case 0:
                return new AbstractMap.SimpleImmutableEntry(jVar.f108415a.get(i13), jVar.f108415a.get(i13 + 1));
            case 1:
                return jVar.f108415a.get(i13);
            default:
                return jVar.f108415a.get(i13 + 1);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        int a13;
        int i13 = this.f108408b;
        j jVar = this.f108409c;
        switch (i13) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getKey() == null || (a13 = jVar.a(entry.getKey())) == -1) {
                    return false;
                }
                return jVar.f108415a.get(a13 + 1).equals(entry.getValue());
            case 1:
                return jVar.containsKey(obj);
            default:
                return jVar.containsValue(obj);
        }
    }
}
