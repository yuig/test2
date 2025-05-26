package d9;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class m extends j {

    /* renamed from: b, reason: collision with root package name */
    public final int f54030b;

    /* renamed from: c, reason: collision with root package name */
    public final int f54031c;

    /* renamed from: d, reason: collision with root package name */
    public final int f54032d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f54033e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f54034f;

    public m(int i13, int i14, int i15, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f54030b = i13;
        this.f54031c = i14;
        this.f54032d = i15;
        this.f54033e = iArr;
        this.f54034f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        return this.f54030b == mVar.f54030b && this.f54031c == mVar.f54031c && this.f54032d == mVar.f54032d && Arrays.equals(this.f54033e, mVar.f54033e) && Arrays.equals(this.f54034f, mVar.f54034f);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f54034f) + ((Arrays.hashCode(this.f54033e) + ((((((527 + this.f54030b) * 31) + this.f54031c) * 31) + this.f54032d) * 31)) * 31);
    }
}
