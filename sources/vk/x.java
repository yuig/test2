package vk;

import java.util.Objects;

/* loaded from: classes.dex */
public final class x extends c {

    /* renamed from: a, reason: collision with root package name */
    public final int f126068a;

    /* renamed from: b, reason: collision with root package name */
    public final w f126069b;

    public x(int i13, w wVar) {
        this.f126068a = i13;
        this.f126069b = wVar;
    }

    public static tb.l b() {
        return new tb.l((Object) null);
    }

    @Override // uk.q
    public final boolean a() {
        return this.f126069b != w.f126066d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return xVar.f126068a == this.f126068a && xVar.f126069b == this.f126069b;
    }

    public final int hashCode() {
        return Objects.hash(x.class, Integer.valueOf(this.f126068a), this.f126069b);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AesGcmSiv Parameters (variant: ");
        sb3.append(this.f126069b);
        sb3.append(", ");
        return a.a.n(sb3, this.f126068a, "-byte key)");
    }
}
