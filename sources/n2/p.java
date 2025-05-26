package n2;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class p extends kotlin.collections.b {

    /* renamed from: a, reason: collision with root package name */
    public final d f88951a;

    public p(d dVar) {
        this.f88951a = dVar;
    }

    @Override // kotlin.collections.b
    public final int b() {
        return this.f88951a.e();
    }

    @Override // kotlin.collections.b, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f88951a.containsValue(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        r rVar = this.f88951a.f88931d;
        s[] sVarArr = new s[8];
        for (int i13 = 0; i13 < 8; i13++) {
            sVarArr[i13] = new w();
        }
        return new n(rVar, sVarArr);
    }
}
