package vn2;

import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c extends a {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f126311a;

    /* renamed from: b, reason: collision with root package name */
    public int f126312b;

    @Override // vn2.a
    public final int b() {
        return this.f126312b;
    }

    @Override // vn2.a
    public final void c(int i13, Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        Object[] objArr = this.f126311a;
        if (objArr.length <= i13) {
            int length = objArr.length;
            do {
                length *= 2;
            } while (length <= i13);
            Object[] copyOf = Arrays.copyOf(this.f126311a, length);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.f126311a = copyOf;
        }
        Object[] objArr2 = this.f126311a;
        if (objArr2[i13] == null) {
            this.f126312b++;
        }
        objArr2[i13] = value;
    }

    @Override // vn2.a
    public final Object get(int i13) {
        return kotlin.collections.c0.J(i13, this.f126311a);
    }

    @Override // vn2.a, java.lang.Iterable
    public final Iterator iterator() {
        return new b(this);
    }
}
