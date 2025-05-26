package pk;

import java.io.Serializable;

/* loaded from: classes3.dex */
public final class a1 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f100347a;

    public a1(Object[] objArr) {
        this.f100347a = objArr;
    }

    public Object readResolve() {
        return c1.s(this.f100347a);
    }
}
