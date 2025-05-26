package id2;

import no2.g;
import org.jetbrains.annotations.NotNull;

@g
/* loaded from: classes4.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* renamed from: a, reason: collision with root package name */
    public float f72190a;

    /* renamed from: b, reason: collision with root package name */
    public float f72191b;

    /* renamed from: c, reason: collision with root package name */
    public float f72192c;

    /* renamed from: d, reason: collision with root package name */
    public float f72193d;

    public /* synthetic */ c() {
        this(1.0f, 0.0f, 0.0f, 1.0f);
    }

    public final int a() {
        int c13 = ml2.c.c(this.f72193d * 255.0f) << 24;
        int c14 = ml2.c.c(this.f72190a * 255.0f) << 16;
        return c13 | c14 | (ml2.c.c(this.f72191b * 255.0f) << 8) | ml2.c.c(this.f72192c * 255.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Float.compare(this.f72190a, cVar.f72190a) == 0 && Float.compare(this.f72191b, cVar.f72191b) == 0 && Float.compare(this.f72192c, cVar.f72192c) == 0 && Float.compare(this.f72193d, cVar.f72193d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f72193d) + a.a.a(this.f72192c, a.a.a(this.f72191b, Float.hashCode(this.f72190a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ColorRGBA(r=");
        sb3.append(this.f72190a);
        sb3.append(", g=");
        sb3.append(this.f72191b);
        sb3.append(", b=");
        sb3.append(this.f72192c);
        sb3.append(", a=");
        return d7.g.h(sb3, this.f72193d, ')');
    }

    public c(float f13, float f14, float f15, float f16) {
        this.f72190a = f13;
        this.f72191b = f14;
        this.f72192c = f15;
        this.f72193d = f16;
    }
}
