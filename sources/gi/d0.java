package gi;

import java.util.Iterator;
import java.util.Map;
import kh2.p2;

/* loaded from: classes3.dex */
public final class d0 extends b0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e0 f65057d;

    public d0(e0 e0Var) {
        this.f65057d = e0Var;
    }

    @Override // gi.u
    public final r0 e() {
        return n().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return n().listIterator(0);
    }

    @Override // gi.b0
    public final /* bridge */ /* synthetic */ boolean j() {
        return false;
    }

    @Override // gi.b0
    public final z p() {
        return new c0(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f65057d.get(entry.getKey());
            if (obj2 != null && obj2.equals(entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // gi.b0, java.util.Collection, java.util.Set
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final int hashCode() {
        return p2.j1(this.f65057d.entrySet());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final int size() {
        return this.f65057d.f65063d.size();
    }
}
