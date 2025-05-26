package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class l0 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18097a;

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f18098b;

    public /* synthetic */ l0(Iterator it, int i13) {
        this.f18097a = i13;
        this.f18098b = it;
    }

    public final Map.Entry b() {
        Iterator it = this.f18098b;
        switch (this.f18097a) {
            case 0:
                Map.Entry entry = (Map.Entry) it.next();
                entry.getValue();
                return entry;
            case 1:
            default:
                Map.Entry entry2 = (Map.Entry) it.next();
                entry2.getValue();
                return entry2;
            case 2:
                Map.Entry entry3 = (Map.Entry) it.next();
                entry3.getValue();
                return entry3;
            case 3:
                Map.Entry entry4 = (Map.Entry) it.next();
                entry4.getValue();
                return entry4;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it = this.f18098b;
        switch (this.f18097a) {
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it = this.f18098b;
        switch (this.f18097a) {
            case 0:
                return b();
            case 1:
                Map.Entry entry = (Map.Entry) it.next();
                entry.getValue();
                return entry;
            case 2:
                return b();
            case 3:
                return b();
            case 4:
                return b();
            default:
                Object next = it.next();
                vp2.a aVar = new vp2.a();
                aVar.f126395a = next;
                return aVar;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        Iterator it = this.f18098b;
        switch (this.f18097a) {
            case 0:
                it.remove();
                break;
            case 1:
                it.remove();
                break;
            case 2:
                it.remove();
                break;
            case 3:
                it.remove();
                break;
            case 4:
                it.remove();
                break;
            default:
                it.remove();
                break;
        }
    }
}
