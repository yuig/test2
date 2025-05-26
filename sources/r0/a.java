package r0;

import android.util.Range;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final Range f105469f = new Range(0, Integer.MAX_VALUE);

    /* renamed from: g, reason: collision with root package name */
    public static final Range f105470g = new Range(0, Integer.MAX_VALUE);

    /* renamed from: a, reason: collision with root package name */
    public final Range f105471a;

    /* renamed from: b, reason: collision with root package name */
    public final int f105472b;

    /* renamed from: c, reason: collision with root package name */
    public final int f105473c;

    /* renamed from: d, reason: collision with root package name */
    public final Range f105474d;

    /* renamed from: e, reason: collision with root package name */
    public final int f105475e;

    static {
        androidx.camera.core.impl.j a13 = a();
        a13.f16879f = 0;
        a13.c();
    }

    public a(Range range, int i13, int i14, Range range2, int i15) {
        this.f105471a = range;
        this.f105472b = i13;
        this.f105473c = i14;
        this.f105474d = range2;
        this.f105475e = i15;
    }

    public static androidx.camera.core.impl.j a() {
        androidx.camera.core.impl.j jVar = new androidx.camera.core.impl.j(3);
        jVar.f16875b = -1;
        jVar.f16876c = -1;
        jVar.f16879f = -1;
        Range range = f105469f;
        if (range == null) {
            throw new NullPointerException("Null bitrate");
        }
        jVar.f16877d = range;
        Range range2 = f105470g;
        if (range2 == null) {
            throw new NullPointerException("Null sampleRate");
        }
        jVar.f16878e = range2;
        return jVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f105471a.equals(aVar.f105471a) && this.f105472b == aVar.f105472b && this.f105473c == aVar.f105473c && this.f105474d.equals(aVar.f105474d) && this.f105475e == aVar.f105475e;
    }

    public final int hashCode() {
        return ((((((((this.f105471a.hashCode() ^ 1000003) * 1000003) ^ this.f105472b) * 1000003) ^ this.f105473c) * 1000003) ^ this.f105474d.hashCode()) * 1000003) ^ this.f105475e;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AudioSpec{bitrate=");
        sb3.append(this.f105471a);
        sb3.append(", sourceFormat=");
        sb3.append(this.f105472b);
        sb3.append(", source=");
        sb3.append(this.f105473c);
        sb3.append(", sampleRate=");
        sb3.append(this.f105474d);
        sb3.append(", channelCount=");
        return a.a.n(sb3, this.f105475e, "}");
    }
}
