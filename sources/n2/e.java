package n2;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class e implements Iterator, ll2.a {

    /* renamed from: a, reason: collision with root package name */
    public final s[] f88933a;

    /* renamed from: b, reason: collision with root package name */
    public int f88934b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f88935c = true;

    public e(r rVar, s[] sVarArr) {
        this.f88933a = sVarArr;
        sVarArr[0].b(Integer.bitCount(rVar.f88955a) * 2, 0, rVar.f88958d);
        this.f88934b = 0;
        b();
    }

    public final void b() {
        int i13 = this.f88934b;
        s[] sVarArr = this.f88933a;
        s sVar = sVarArr[i13];
        if (sVar.f88961c < sVar.f88960b) {
            return;
        }
        while (-1 < i13) {
            int c13 = c(i13);
            if (c13 == -1) {
                s sVar2 = sVarArr[i13];
                int i14 = sVar2.f88961c;
                Object[] objArr = sVar2.f88959a;
                if (i14 < objArr.length) {
                    int length = objArr.length;
                    sVar2.f88961c = i14 + 1;
                    c13 = c(i13);
                }
            }
            if (c13 != -1) {
                this.f88934b = c13;
                return;
            }
            if (i13 > 0) {
                s sVar3 = sVarArr[i13 - 1];
                int i15 = sVar3.f88961c;
                int length2 = sVar3.f88959a.length;
                sVar3.f88961c = i15 + 1;
            }
            sVarArr[i13].b(0, 0, r.f88954e.f88958d);
            i13--;
        }
        this.f88935c = false;
    }

    public final int c(int i13) {
        s[] sVarArr = this.f88933a;
        s sVar = sVarArr[i13];
        int i14 = sVar.f88961c;
        if (i14 < sVar.f88960b) {
            return i13;
        }
        Object[] objArr = sVar.f88959a;
        if (i14 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i14];
        Intrinsics.g(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        r rVar = (r) obj;
        if (i13 == 6) {
            s sVar2 = sVarArr[i13 + 1];
            Object[] objArr2 = rVar.f88958d;
            sVar2.b(objArr2.length, 0, objArr2);
        } else {
            sVarArr[i13 + 1].b(Integer.bitCount(rVar.f88955a) * 2, 0, rVar.f88958d);
        }
        return c(i13 + 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f88935c;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.f88935c) {
            throw new NoSuchElementException();
        }
        Object next = this.f88933a[this.f88934b].next();
        b();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
