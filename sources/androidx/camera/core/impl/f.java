package androidx.camera.core.impl;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f16828a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16829b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16830c;

    /* renamed from: d, reason: collision with root package name */
    public final int f16831d;

    /* renamed from: e, reason: collision with root package name */
    public final int f16832e;

    /* renamed from: f, reason: collision with root package name */
    public final int f16833f;

    /* renamed from: g, reason: collision with root package name */
    public final int f16834g;

    /* renamed from: h, reason: collision with root package name */
    public final int f16835h;

    /* renamed from: i, reason: collision with root package name */
    public final int f16836i;

    /* renamed from: j, reason: collision with root package name */
    public final int f16837j;

    public f(String str, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i23, int i24) {
        this.f16828a = i13;
        if (str == null) {
            throw new NullPointerException("Null mediaType");
        }
        this.f16829b = str;
        this.f16830c = i14;
        this.f16831d = i15;
        this.f16832e = i16;
        this.f16833f = i17;
        this.f16834g = i18;
        this.f16835h = i19;
        this.f16836i = i23;
        this.f16837j = i24;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f16828a == fVar.f16828a && this.f16829b.equals(fVar.f16829b) && this.f16830c == fVar.f16830c && this.f16831d == fVar.f16831d && this.f16832e == fVar.f16832e && this.f16833f == fVar.f16833f && this.f16834g == fVar.f16834g && this.f16835h == fVar.f16835h && this.f16836i == fVar.f16836i && this.f16837j == fVar.f16837j;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.f16828a ^ 1000003) * 1000003) ^ this.f16829b.hashCode()) * 1000003) ^ this.f16830c) * 1000003) ^ this.f16831d) * 1000003) ^ this.f16832e) * 1000003) ^ this.f16833f) * 1000003) ^ this.f16834g) * 1000003) ^ this.f16835h) * 1000003) ^ this.f16836i) * 1000003) ^ this.f16837j;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("VideoProfileProxy{codec=");
        sb3.append(this.f16828a);
        sb3.append(", mediaType=");
        sb3.append(this.f16829b);
        sb3.append(", bitrate=");
        sb3.append(this.f16830c);
        sb3.append(", frameRate=");
        sb3.append(this.f16831d);
        sb3.append(", width=");
        sb3.append(this.f16832e);
        sb3.append(", height=");
        sb3.append(this.f16833f);
        sb3.append(", profile=");
        sb3.append(this.f16834g);
        sb3.append(", bitDepth=");
        sb3.append(this.f16835h);
        sb3.append(", chromaSubsampling=");
        sb3.append(this.f16836i);
        sb3.append(", hdrFormat=");
        return a.a.n(sb3, this.f16837j, "}");
    }
}
