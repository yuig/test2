package s4;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class h extends c {

    /* renamed from: f, reason: collision with root package name */
    public j[] f111096f;

    /* renamed from: g, reason: collision with root package name */
    public j[] f111097g;

    /* renamed from: h, reason: collision with root package name */
    public int f111098h;

    /* renamed from: i, reason: collision with root package name */
    public x92.b f111099i;

    @Override // s4.c
    public final j g(boolean[] zArr) {
        int i13 = -1;
        for (int i14 = 0; i14 < this.f111098h; i14++) {
            j[] jVarArr = this.f111096f;
            j jVar = jVarArr[i14];
            if (!zArr[jVar.f111101b]) {
                x92.b bVar = this.f111099i;
                bVar.f134365b = jVar;
                int i15 = 8;
                if (i13 == -1) {
                    while (i15 >= 0) {
                        float f13 = ((j) bVar.f134365b).f111107h[i15];
                        if (f13 <= 0.0f) {
                            if (f13 < 0.0f) {
                                i13 = i14;
                                break;
                            }
                            i15--;
                        }
                    }
                } else {
                    j jVar2 = jVarArr[i13];
                    while (true) {
                        if (i15 >= 0) {
                            float f14 = jVar2.f111107h[i15];
                            float f15 = ((j) bVar.f134365b).f111107h[i15];
                            if (f15 == f14) {
                                i15--;
                            } else if (f15 >= f14) {
                            }
                        }
                    }
                }
            }
        }
        if (i13 == -1) {
            return null;
        }
        return this.f111096f[i13];
    }

    @Override // s4.c
    public final boolean h() {
        return this.f111098h == 0;
    }

    @Override // s4.c
    public final void m(d dVar, c cVar, boolean z13) {
        j jVar = cVar.f111069a;
        if (jVar == null) {
            return;
        }
        b bVar = cVar.f111072d;
        int g13 = bVar.g();
        for (int i13 = 0; i13 < g13; i13++) {
            j b13 = bVar.b(i13);
            float j13 = bVar.j(i13);
            x92.b bVar2 = this.f111099i;
            bVar2.f134365b = b13;
            boolean z14 = b13.f111100a;
            float[] fArr = jVar.f111107h;
            if (z14) {
                boolean z15 = true;
                for (int i14 = 0; i14 < 9; i14++) {
                    float[] fArr2 = ((j) bVar2.f134365b).f111107h;
                    float f13 = (fArr[i14] * j13) + fArr2[i14];
                    fArr2[i14] = f13;
                    if (Math.abs(f13) < 1.0E-4f) {
                        ((j) bVar2.f134365b).f111107h[i14] = 0.0f;
                    } else {
                        z15 = false;
                    }
                }
                if (z15) {
                    ((h) bVar2.f134367d).o((j) bVar2.f134365b);
                }
            } else {
                for (int i15 = 0; i15 < 9; i15++) {
                    float f14 = fArr[i15];
                    if (f14 != 0.0f) {
                        float f15 = f14 * j13;
                        if (Math.abs(f15) < 1.0E-4f) {
                            f15 = 0.0f;
                        }
                        ((j) bVar2.f134365b).f111107h[i15] = f15;
                    } else {
                        ((j) bVar2.f134365b).f111107h[i15] = 0.0f;
                    }
                }
                n(b13);
            }
            this.f111070b = (cVar.f111070b * j13) + this.f111070b;
        }
        o(jVar);
    }

    public final void n(j jVar) {
        int i13;
        int i14 = this.f111098h + 1;
        j[] jVarArr = this.f111096f;
        if (i14 > jVarArr.length) {
            j[] jVarArr2 = (j[]) Arrays.copyOf(jVarArr, jVarArr.length * 2);
            this.f111096f = jVarArr2;
            this.f111097g = (j[]) Arrays.copyOf(jVarArr2, jVarArr2.length * 2);
        }
        j[] jVarArr3 = this.f111096f;
        int i15 = this.f111098h;
        jVarArr3[i15] = jVar;
        int i16 = i15 + 1;
        this.f111098h = i16;
        if (i16 > 1 && jVarArr3[i15].f111101b > jVar.f111101b) {
            int i17 = 0;
            while (true) {
                i13 = this.f111098h;
                if (i17 >= i13) {
                    break;
                }
                this.f111097g[i17] = this.f111096f[i17];
                i17++;
            }
            Arrays.sort(this.f111097g, 0, i13, new g(this, 0));
            for (int i18 = 0; i18 < this.f111098h; i18++) {
                this.f111096f[i18] = this.f111097g[i18];
            }
        }
        jVar.f111100a = true;
        jVar.a(this);
    }

    public final void o(j jVar) {
        int i13 = 0;
        while (i13 < this.f111098h) {
            if (this.f111096f[i13] == jVar) {
                while (true) {
                    int i14 = this.f111098h;
                    if (i13 >= i14 - 1) {
                        this.f111098h = i14 - 1;
                        jVar.f111100a = false;
                        return;
                    } else {
                        j[] jVarArr = this.f111096f;
                        int i15 = i13 + 1;
                        jVarArr[i13] = jVarArr[i15];
                        i13 = i15;
                    }
                }
            } else {
                i13++;
            }
        }
    }

    @Override // s4.c
    public final String toString() {
        String i13 = d7.g.i(new StringBuilder(" goal -> ("), this.f111070b, ") : ");
        for (int i14 = 0; i14 < this.f111098h; i14++) {
            j jVar = this.f111096f[i14];
            x92.b bVar = this.f111099i;
            bVar.f134365b = jVar;
            i13 = i13 + bVar + " ";
        }
        return i13;
    }
}
