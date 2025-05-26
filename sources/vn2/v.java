package vn2;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import pn2.r0;

/* loaded from: classes2.dex */
public final class v extends a {

    /* renamed from: a, reason: collision with root package name */
    public final Object f126346a;

    /* renamed from: b, reason: collision with root package name */
    public final int f126347b;

    public v(r0 value, int i13) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f126346a = value;
        this.f126347b = i13;
    }

    @Override // vn2.a
    public final int b() {
        return 1;
    }

    @Override // vn2.a
    public final void c(int i13, Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        throw new IllegalStateException();
    }

    @Override // vn2.a
    public final Object get(int i13) {
        if (i13 == this.f126347b) {
            return this.f126346a;
        }
        return null;
    }

    @Override // vn2.a, java.lang.Iterable
    public final Iterator iterator() {
        return new u(this);
    }
}
