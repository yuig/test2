package s4;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class j implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f111100a;

    /* renamed from: e, reason: collision with root package name */
    public float f111104e;

    /* renamed from: i, reason: collision with root package name */
    public i f111108i;

    /* renamed from: b, reason: collision with root package name */
    public int f111101b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f111102c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f111103d = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f111105f = false;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f111106g = new float[9];

    /* renamed from: h, reason: collision with root package name */
    public final float[] f111107h = new float[9];

    /* renamed from: j, reason: collision with root package name */
    public c[] f111109j = new c[16];

    /* renamed from: k, reason: collision with root package name */
    public int f111110k = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f111111l = 0;

    public j(i iVar) {
        this.f111108i = iVar;
    }

    public final void a(c cVar) {
        int i13 = 0;
        while (true) {
            int i14 = this.f111110k;
            if (i13 >= i14) {
                c[] cVarArr = this.f111109j;
                if (i14 >= cVarArr.length) {
                    this.f111109j = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
                }
                c[] cVarArr2 = this.f111109j;
                int i15 = this.f111110k;
                cVarArr2[i15] = cVar;
                this.f111110k = i15 + 1;
                return;
            }
            if (this.f111109j[i13] == cVar) {
                return;
            } else {
                i13++;
            }
        }
    }

    public final void b(c cVar) {
        int i13 = this.f111110k;
        int i14 = 0;
        while (i14 < i13) {
            if (this.f111109j[i14] == cVar) {
                while (i14 < i13 - 1) {
                    c[] cVarArr = this.f111109j;
                    int i15 = i14 + 1;
                    cVarArr[i14] = cVarArr[i15];
                    i14 = i15;
                }
                this.f111110k--;
                return;
            }
            i14++;
        }
    }

    public final void c() {
        this.f111108i = i.UNKNOWN;
        this.f111103d = 0;
        this.f111101b = -1;
        this.f111102c = -1;
        this.f111104e = 0.0f;
        this.f111105f = false;
        int i13 = this.f111110k;
        for (int i14 = 0; i14 < i13; i14++) {
            this.f111109j[i14] = null;
        }
        this.f111110k = 0;
        this.f111111l = 0;
        this.f111100a = false;
        Arrays.fill(this.f111107h, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f111101b - ((j) obj).f111101b;
    }

    public final void d(d dVar, float f13) {
        this.f111104e = f13;
        this.f111105f = true;
        int i13 = this.f111110k;
        this.f111102c = -1;
        for (int i14 = 0; i14 < i13; i14++) {
            this.f111109j[i14].l(dVar, this, false);
        }
        this.f111110k = 0;
    }

    public final void e(d dVar, c cVar) {
        int i13 = this.f111110k;
        for (int i14 = 0; i14 < i13; i14++) {
            this.f111109j[i14].m(dVar, cVar, false);
        }
        this.f111110k = 0;
    }

    public final String toString() {
        return "" + this.f111101b;
    }
}
