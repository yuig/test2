package n2;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class m extends kotlin.collections.s {

    /* renamed from: b, reason: collision with root package name */
    public final d f88949b;

    public m(d dVar) {
        this.f88949b = dVar;
    }

    @Override // kotlin.collections.b
    public final int b() {
        return this.f88949b.e();
    }

    @Override // kotlin.collections.b, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (!(entry instanceof Map.Entry)) {
            return false;
        }
        Object key = entry.getKey();
        d dVar = this.f88949b;
        Object obj2 = dVar.get(key);
        return obj2 != null ? Intrinsics.d(obj2, entry.getValue()) : entry.getValue() == null && dVar.containsKey(entry.getKey());
    }

    @Override // kotlin.collections.s, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        r rVar = this.f88949b.f88931d;
        s[] sVarArr = new s[8];
        for (int i13 = 0; i13 < 8; i13++) {
            sVarArr[i13] = new t();
        }
        return new n(rVar, sVarArr);
    }
}
