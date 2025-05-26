package a7;

import a.cb;
import android.net.Uri;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f908a;

    /* renamed from: b, reason: collision with root package name */
    public final int f909b;

    /* renamed from: c, reason: collision with root package name */
    public final int f910c;

    /* renamed from: d, reason: collision with root package name */
    public final Uri[] f911d;

    /* renamed from: e, reason: collision with root package name */
    public final i0[] f912e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f913f;

    /* renamed from: g, reason: collision with root package name */
    public final long[] f914g;

    /* renamed from: h, reason: collision with root package name */
    public final String[] f915h;

    /* renamed from: i, reason: collision with root package name */
    public final long f916i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f917j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f918k;

    static {
        cb.s(0, 1, 2, 3, 4);
        cb.s(5, 6, 7, 8, 9);
        d7.n0.Q(10);
    }

    public a(long j13, int i13, int i14, int[] iArr, i0[] i0VarArr, long[] jArr, long j14, boolean z13, String[] strArr, boolean z14) {
        Uri uri;
        int i15 = 0;
        bf.b.i(iArr.length == i0VarArr.length);
        this.f908a = j13;
        this.f909b = i13;
        this.f910c = i14;
        this.f913f = iArr;
        this.f912e = i0VarArr;
        this.f914g = jArr;
        this.f916i = j14;
        this.f917j = z13;
        this.f911d = new Uri[i0VarArr.length];
        while (true) {
            Uri[] uriArr = this.f911d;
            if (i15 >= uriArr.length) {
                this.f915h = strArr;
                this.f918k = z14;
                return;
            }
            i0 i0Var = i0VarArr[i15];
            if (i0Var == null) {
                uri = null;
            } else {
                d0 d0Var = i0Var.f1073b;
                d0Var.getClass();
                uri = d0Var.f969a;
            }
            uriArr[i15] = uri;
            i15++;
        }
    }

    public final int a(int i13) {
        int i14;
        int i15 = i13 + 1;
        while (true) {
            int[] iArr = this.f913f;
            if (i15 >= iArr.length || this.f917j || (i14 = iArr[i15]) == 0 || i14 == 1) {
                break;
            }
            i15++;
        }
        return i15;
    }

    public final boolean b() {
        int i13 = this.f909b;
        if (i13 == -1) {
            return true;
        }
        for (int i14 = 0; i14 < i13; i14++) {
            int i15 = this.f913f[i14];
            if (i15 == 0 || i15 == 1) {
                return true;
            }
        }
        return false;
    }

    public final boolean c() {
        int i13 = this.f909b;
        return i13 == -1 || a(-1) < i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f908a == aVar.f908a && this.f909b == aVar.f909b && this.f910c == aVar.f910c && Arrays.equals(this.f912e, aVar.f912e) && Arrays.equals(this.f913f, aVar.f913f) && Arrays.equals(this.f914g, aVar.f914g) && this.f916i == aVar.f916i && this.f917j == aVar.f917j && Arrays.equals(this.f915h, aVar.f915h) && this.f918k == aVar.f918k;
    }

    public final int hashCode() {
        int i13 = ((this.f909b * 31) + this.f910c) * 31;
        long j13 = this.f908a;
        int hashCode = (Arrays.hashCode(this.f914g) + ((Arrays.hashCode(this.f913f) + ((Arrays.hashCode(this.f912e) + ((i13 + ((int) (j13 ^ (j13 >>> 32)))) * 31)) * 31)) * 31)) * 31;
        long j14 = this.f916i;
        return ((((((hashCode + ((int) ((j14 >>> 32) ^ j14))) * 31) + (this.f917j ? 1 : 0)) * 31) + Arrays.hashCode(this.f915h)) * 31) + (this.f918k ? 1 : 0);
    }
}
