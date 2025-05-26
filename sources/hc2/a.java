package hc2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f68732a;

    /* renamed from: b, reason: collision with root package name */
    public final c f68733b;

    public a(int i13, c item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.f68732a = i13;
        this.f68733b = item;
    }

    public final int a() {
        return this.f68732a;
    }

    public final c b() {
        return this.f68733b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f68732a == aVar.f68732a && Intrinsics.d(this.f68733b, aVar.f68733b);
    }

    public final int hashCode() {
        return this.f68733b.hashCode() + (Integer.hashCode(this.f68732a) * 31);
    }

    public final String toString() {
        return "NextPrefetch(index=" + this.f68732a + ", item=" + this.f68733b + ")";
    }
}
