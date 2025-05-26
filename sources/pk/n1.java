package pk;

import java.io.Serializable;

/* loaded from: classes3.dex */
public final class n1 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f100456a;

    public n1(Object[] objArr) {
        this.f100456a = objArr;
    }

    public Object readResolve() {
        return o1.s(this.f100456a);
    }
}
