package u0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: e, reason: collision with root package name */
    public static final List f119769e = Collections.unmodifiableList(Arrays.asList(48000, 44100, 22050, 11025, 8000, 4800));

    /* renamed from: a, reason: collision with root package name */
    public final int f119770a;

    /* renamed from: b, reason: collision with root package name */
    public final int f119771b;

    /* renamed from: c, reason: collision with root package name */
    public final int f119772c;

    /* renamed from: d, reason: collision with root package name */
    public final int f119773d;

    public i(int i13, int i14, int i15, int i16) {
        this.f119770a = i13;
        this.f119771b = i14;
        this.f119772c = i15;
        this.f119773d = i16;
    }

    public final int a() {
        int i13 = this.f119772c;
        com.bumptech.glide.d.g("Invalid channel count: " + i13, i13 > 0);
        int i14 = this.f119773d;
        if (i14 == 2) {
            return i13 * 2;
        }
        if (i14 == 3) {
            return i13;
        }
        if (i14 != 4) {
            if (i14 == 21) {
                return i13 * 3;
            }
            if (i14 != 22) {
                throw new IllegalArgumentException(a.a.d("Invalid audio encoding: ", i14));
            }
        }
        return i13 * 4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f119770a == iVar.f119770a && this.f119771b == iVar.f119771b && this.f119772c == iVar.f119772c && this.f119773d == iVar.f119773d;
    }

    public final int hashCode() {
        return ((((((this.f119770a ^ 1000003) * 1000003) ^ this.f119771b) * 1000003) ^ this.f119772c) * 1000003) ^ this.f119773d;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AudioSettings{audioSource=");
        sb3.append(this.f119770a);
        sb3.append(", sampleRate=");
        sb3.append(this.f119771b);
        sb3.append(", channelCount=");
        sb3.append(this.f119772c);
        sb3.append(", audioFormat=");
        return a.a.n(sb3, this.f119773d, "}");
    }
}
