package n2;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class o extends kotlin.collections.s {

    /* renamed from: b, reason: collision with root package name */
    public final d f88950b;

    public o(d dVar) {
        this.f88950b = dVar;
    }

    @Override // kotlin.collections.b
    public final int b() {
        return this.f88950b.e();
    }

    @Override // kotlin.collections.b, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f88950b.containsKey(obj);
    }

    @Override // kotlin.collections.s, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        r rVar = this.f88950b.f88931d;
        s[] sVarArr = new s[8];
        for (int i13 = 0; i13 < 8; i13++) {
            sVarArr[i13] = new u();
        }
        return new n(rVar, sVarArr);
    }
}
