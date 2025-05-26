package yk2;

import java.io.Serializable;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import q5.j0;

/* loaded from: classes4.dex */
public final class f extends j0 implements Iterator, ll2.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g map) {
        super(map);
        Intrinsics.checkNotNullParameter(map, "map");
    }

    @Override // java.util.Iterator
    public final Object next() {
        b();
        int i13 = this.f102464a;
        Serializable serializable = this.f102467d;
        if (i13 >= ((g) serializable).f139253f) {
            throw new NoSuchElementException();
        }
        this.f102464a = i13 + 1;
        this.f102465b = i13;
        Object[] objArr = ((g) serializable).f139249b;
        Intrinsics.f(objArr);
        Object obj = objArr[this.f102465b];
        f();
        return obj;
    }
}
