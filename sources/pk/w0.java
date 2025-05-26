package pk;

import java.io.Serializable;

/* loaded from: classes3.dex */
public final class w0 extends t implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f100508a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f100509b;

    public w0(Object obj, Object obj2) {
        this.f100508a = obj;
        this.f100509b = obj2;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f100508a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f100509b;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
