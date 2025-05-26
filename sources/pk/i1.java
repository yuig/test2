package pk;

import java.util.Map;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class i1 extends n3 {

    /* renamed from: a, reason: collision with root package name */
    public final n3 f100419a;

    /* renamed from: b, reason: collision with root package name */
    public Object f100420b = null;

    /* renamed from: c, reason: collision with root package name */
    public n3 f100421c = v1.f100500d;

    public i1(l1 l1Var) {
        this.f100419a = l1Var.f100447d.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f100421c.hasNext() || this.f100419a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f100421c.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f100419a.next();
            this.f100420b = entry.getKey();
            this.f100421c = ((v0) entry.getValue()).iterator();
        }
        Object obj = this.f100420b;
        Objects.requireNonNull(obj);
        return new w0(obj, this.f100421c.next());
    }
}
