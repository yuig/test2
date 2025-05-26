package androidx.camera.core.impl;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f16814a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16815b;

    /* renamed from: c, reason: collision with root package name */
    public final int f16816c;

    /* renamed from: d, reason: collision with root package name */
    public final int f16817d;

    /* renamed from: e, reason: collision with root package name */
    public final int f16818e;

    /* renamed from: f, reason: collision with root package name */
    public final int f16819f;

    public d(String str, int i13, int i14, int i15, int i16, int i17) {
        this.f16814a = i13;
        if (str == null) {
            throw new NullPointerException("Null mediaType");
        }
        this.f16815b = str;
        this.f16816c = i14;
        this.f16817d = i15;
        this.f16818e = i16;
        this.f16819f = i17;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f16814a == dVar.f16814a && this.f16815b.equals(dVar.f16815b) && this.f16816c == dVar.f16816c && this.f16817d == dVar.f16817d && this.f16818e == dVar.f16818e && this.f16819f == dVar.f16819f;
    }

    public final int hashCode() {
        return ((((((((((this.f16814a ^ 1000003) * 1000003) ^ this.f16815b.hashCode()) * 1000003) ^ this.f16816c) * 1000003) ^ this.f16817d) * 1000003) ^ this.f16818e) * 1000003) ^ this.f16819f;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AudioProfileProxy{codec=");
        sb3.append(this.f16814a);
        sb3.append(", mediaType=");
        sb3.append(this.f16815b);
        sb3.append(", bitrate=");
        sb3.append(this.f16816c);
        sb3.append(", sampleRate=");
        sb3.append(this.f16817d);
        sb3.append(", channels=");
        sb3.append(this.f16818e);
        sb3.append(", profile=");
        return a.a.n(sb3, this.f16819f, "}");
    }
}
