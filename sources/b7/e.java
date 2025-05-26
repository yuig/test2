package b7;

import a.cb;
import d7.n0;
import java.util.Objects;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: e, reason: collision with root package name */
    public static final e f22037e = new e(-1, -1, -1);

    /* renamed from: a, reason: collision with root package name */
    public final int f22038a;

    /* renamed from: b, reason: collision with root package name */
    public final int f22039b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22040c;

    /* renamed from: d, reason: collision with root package name */
    public final int f22041d;

    public e(int i13, int i14, int i15) {
        this.f22038a = i13;
        this.f22039b = i14;
        this.f22040c = i15;
        this.f22041d = n0.R(i15) ? n0.G(i15, i14) : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f22038a == eVar.f22038a && this.f22039b == eVar.f22039b && this.f22040c == eVar.f22040c;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f22038a), Integer.valueOf(this.f22039b), Integer.valueOf(this.f22040c));
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AudioFormat[sampleRate=");
        sb3.append(this.f22038a);
        sb3.append(", channelCount=");
        sb3.append(this.f22039b);
        sb3.append(", encoding=");
        return cb.l(sb3, this.f22040c, ']');
    }
}
