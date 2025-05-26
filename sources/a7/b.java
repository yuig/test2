package a7;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: g, reason: collision with root package name */
    public static final b f945g = new b(null, new a[0], 0, -9223372036854775807L, 0);

    /* renamed from: h, reason: collision with root package name */
    public static final a f946h;

    /* renamed from: a, reason: collision with root package name */
    public final Object f947a;

    /* renamed from: b, reason: collision with root package name */
    public final int f948b;

    /* renamed from: c, reason: collision with root package name */
    public final long f949c;

    /* renamed from: d, reason: collision with root package name */
    public final long f950d;

    /* renamed from: e, reason: collision with root package name */
    public final int f951e;

    /* renamed from: f, reason: collision with root package name */
    public final a[] f952f;

    static {
        a aVar = new a(0L, -1, -1, new int[0], new i0[0], new long[0], 0L, false, new String[0], false);
        int[] iArr = aVar.f913f;
        int length = iArr.length;
        int max = Math.max(0, length);
        int[] copyOf = Arrays.copyOf(iArr, max);
        Arrays.fill(copyOf, length, max, 0);
        long[] jArr = aVar.f914g;
        int length2 = jArr.length;
        int max2 = Math.max(0, length2);
        long[] copyOf2 = Arrays.copyOf(jArr, max2);
        Arrays.fill(copyOf2, length2, max2, -9223372036854775807L);
        f946h = new a(aVar.f908a, 0, aVar.f910c, copyOf, (i0[]) Arrays.copyOf(aVar.f912e, 0), copyOf2, aVar.f916i, aVar.f917j, (String[]) Arrays.copyOf(aVar.f915h, 0), aVar.f918k);
        d7.n0.Q(1);
        d7.n0.Q(2);
        d7.n0.Q(3);
        d7.n0.Q(4);
    }

    public b(Object obj, a[] aVarArr, long j13, long j14, int i13) {
        this.f947a = obj;
        this.f949c = j13;
        this.f950d = j14;
        this.f948b = aVarArr.length + i13;
        this.f952f = aVarArr;
        this.f951e = i13;
    }

    public final a a(int i13) {
        int i14 = this.f951e;
        return i13 < i14 ? f946h : this.f952f[i13 - i14];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return Objects.equals(this.f947a, bVar.f947a) && this.f948b == bVar.f948b && this.f949c == bVar.f949c && this.f950d == bVar.f950d && this.f951e == bVar.f951e && Arrays.equals(this.f952f, bVar.f952f);
    }

    public final int hashCode() {
        int i13 = this.f948b * 31;
        Object obj = this.f947a;
        return Arrays.hashCode(this.f952f) + ((((((((i13 + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.f949c)) * 31) + ((int) this.f950d)) * 31) + this.f951e) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("AdPlaybackState(adsId=");
        sb3.append(this.f947a);
        sb3.append(", adResumePositionUs=");
        sb3.append(this.f949c);
        sb3.append(", adGroups=[");
        int i13 = 0;
        while (true) {
            a[] aVarArr = this.f952f;
            if (i13 >= aVarArr.length) {
                sb3.append("])");
                return sb3.toString();
            }
            sb3.append("adGroup(timeUs=");
            sb3.append(aVarArr[i13].f908a);
            sb3.append(", ads=[");
            for (int i14 = 0; i14 < aVarArr[i13].f913f.length; i14++) {
                sb3.append("ad(state=");
                int i15 = aVarArr[i13].f913f[i14];
                if (i15 == 0) {
                    sb3.append('_');
                } else if (i15 == 1) {
                    sb3.append('R');
                } else if (i15 == 2) {
                    sb3.append('S');
                } else if (i15 == 3) {
                    sb3.append('P');
                } else if (i15 != 4) {
                    sb3.append('?');
                } else {
                    sb3.append('!');
                }
                sb3.append(", durationUs=");
                sb3.append(aVarArr[i13].f914g[i14]);
                sb3.append(')');
                if (i14 < aVarArr[i13].f913f.length - 1) {
                    sb3.append(", ");
                }
            }
            sb3.append("])");
            if (i13 < aVarArr.length - 1) {
                sb3.append(", ");
            }
            i13++;
        }
    }
}
