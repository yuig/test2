package pk;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* loaded from: classes3.dex */
public class o extends i implements SortedMap {

    /* renamed from: e, reason: collision with root package name */
    public SortedSet f100458e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d f100459f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(d dVar, SortedMap sortedMap) {
        super(dVar, sortedMap);
        this.f100459f = dVar;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return f().comparator();
    }

    public SortedSet d() {
        return new p(this.f100459f, f());
    }

    @Override // pk.i, java.util.AbstractMap, java.util.Map
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.f100458e;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet d2 = d();
        this.f100458e = d2;
        return d2;
    }

    public SortedMap f() {
        return (SortedMap) this.f100416c;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return f().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new o(this.f100459f, f().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return f().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new o(this.f100459f, f().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new o(this.f100459f, f().tailMap(obj));
    }
}
