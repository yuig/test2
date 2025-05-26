package s4;

import com.google.firebase.messaging.q;
import java.util.Arrays;
import n60.o;

/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: b, reason: collision with root package name */
    public final c f111060b;

    /* renamed from: c, reason: collision with root package name */
    public final q f111061c;

    /* renamed from: a, reason: collision with root package name */
    public int f111059a = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f111062d = 8;

    /* renamed from: e, reason: collision with root package name */
    public int[] f111063e = new int[8];

    /* renamed from: f, reason: collision with root package name */
    public int[] f111064f = new int[8];

    /* renamed from: g, reason: collision with root package name */
    public float[] f111065g = new float[8];

    /* renamed from: h, reason: collision with root package name */
    public int f111066h = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f111067i = -1;

    /* renamed from: j, reason: collision with root package name */
    public boolean f111068j = false;

    public a(c cVar, q qVar) {
        this.f111060b = cVar;
        this.f111061c = qVar;
    }

    @Override // s4.b
    public final void a(j jVar, float f13) {
        if (f13 == 0.0f) {
            i(jVar, true);
            return;
        }
        int i13 = this.f111066h;
        c cVar = this.f111060b;
        if (i13 == -1) {
            this.f111066h = 0;
            this.f111065g[0] = f13;
            this.f111063e[0] = jVar.f111101b;
            this.f111064f[0] = -1;
            jVar.f111111l++;
            jVar.a(cVar);
            this.f111059a++;
            if (this.f111068j) {
                return;
            }
            int i14 = this.f111067i + 1;
            this.f111067i = i14;
            int[] iArr = this.f111063e;
            if (i14 >= iArr.length) {
                this.f111068j = true;
                this.f111067i = iArr.length - 1;
                return;
            }
            return;
        }
        int i15 = -1;
        for (int i16 = 0; i13 != -1 && i16 < this.f111059a; i16++) {
            int i17 = this.f111063e[i13];
            int i18 = jVar.f111101b;
            if (i17 == i18) {
                this.f111065g[i13] = f13;
                return;
            }
            if (i17 < i18) {
                i15 = i13;
            }
            i13 = this.f111064f[i13];
        }
        int i19 = this.f111067i;
        int i23 = i19 + 1;
        if (this.f111068j) {
            int[] iArr2 = this.f111063e;
            if (iArr2[i19] != -1) {
                i19 = iArr2.length;
            }
        } else {
            i19 = i23;
        }
        int[] iArr3 = this.f111063e;
        if (i19 >= iArr3.length && this.f111059a < iArr3.length) {
            int i24 = 0;
            while (true) {
                int[] iArr4 = this.f111063e;
                if (i24 >= iArr4.length) {
                    break;
                }
                if (iArr4[i24] == -1) {
                    i19 = i24;
                    break;
                }
                i24++;
            }
        }
        int[] iArr5 = this.f111063e;
        if (i19 >= iArr5.length) {
            i19 = iArr5.length;
            int i25 = this.f111062d * 2;
            this.f111062d = i25;
            this.f111068j = false;
            this.f111067i = i19 - 1;
            this.f111065g = Arrays.copyOf(this.f111065g, i25);
            this.f111063e = Arrays.copyOf(this.f111063e, this.f111062d);
            this.f111064f = Arrays.copyOf(this.f111064f, this.f111062d);
        }
        this.f111063e[i19] = jVar.f111101b;
        this.f111065g[i19] = f13;
        if (i15 != -1) {
            int[] iArr6 = this.f111064f;
            iArr6[i19] = iArr6[i15];
            iArr6[i15] = i19;
        } else {
            this.f111064f[i19] = this.f111066h;
            this.f111066h = i19;
        }
        jVar.f111111l++;
        jVar.a(cVar);
        int i26 = this.f111059a + 1;
        this.f111059a = i26;
        if (!this.f111068j) {
            this.f111067i++;
        }
        int[] iArr7 = this.f111063e;
        if (i26 >= iArr7.length) {
            this.f111068j = true;
        }
        if (this.f111067i >= iArr7.length) {
            this.f111068j = true;
            this.f111067i = iArr7.length - 1;
        }
    }

    @Override // s4.b
    public final j b(int i13) {
        int i14 = this.f111066h;
        for (int i15 = 0; i14 != -1 && i15 < this.f111059a; i15++) {
            if (i15 == i13) {
                return ((j[]) this.f111061c.f33806d)[this.f111063e[i14]];
            }
            i14 = this.f111064f[i14];
        }
        return null;
    }

    @Override // s4.b
    public final void c() {
        int i13 = this.f111066h;
        for (int i14 = 0; i13 != -1 && i14 < this.f111059a; i14++) {
            float[] fArr = this.f111065g;
            fArr[i13] = fArr[i13] * (-1.0f);
            i13 = this.f111064f[i13];
        }
    }

    @Override // s4.b
    public final void clear() {
        int i13 = this.f111066h;
        for (int i14 = 0; i13 != -1 && i14 < this.f111059a; i14++) {
            j jVar = ((j[]) this.f111061c.f33806d)[this.f111063e[i13]];
            if (jVar != null) {
                jVar.b(this.f111060b);
            }
            i13 = this.f111064f[i13];
        }
        this.f111066h = -1;
        this.f111067i = -1;
        this.f111068j = false;
        this.f111059a = 0;
    }

    @Override // s4.b
    public final float d(j jVar) {
        int i13 = this.f111066h;
        for (int i14 = 0; i13 != -1 && i14 < this.f111059a; i14++) {
            if (this.f111063e[i13] == jVar.f111101b) {
                return this.f111065g[i13];
            }
            i13 = this.f111064f[i13];
        }
        return 0.0f;
    }

    @Override // s4.b
    public final boolean e(j jVar) {
        int i13 = this.f111066h;
        if (i13 == -1) {
            return false;
        }
        for (int i14 = 0; i13 != -1 && i14 < this.f111059a; i14++) {
            if (this.f111063e[i13] == jVar.f111101b) {
                return true;
            }
            i13 = this.f111064f[i13];
        }
        return false;
    }

    @Override // s4.b
    public final void f(j jVar, float f13, boolean z13) {
        if (f13 <= -0.001f || f13 >= 0.001f) {
            int i13 = this.f111066h;
            c cVar = this.f111060b;
            if (i13 == -1) {
                this.f111066h = 0;
                this.f111065g[0] = f13;
                this.f111063e[0] = jVar.f111101b;
                this.f111064f[0] = -1;
                jVar.f111111l++;
                jVar.a(cVar);
                this.f111059a++;
                if (this.f111068j) {
                    return;
                }
                int i14 = this.f111067i + 1;
                this.f111067i = i14;
                int[] iArr = this.f111063e;
                if (i14 >= iArr.length) {
                    this.f111068j = true;
                    this.f111067i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i15 = -1;
            for (int i16 = 0; i13 != -1 && i16 < this.f111059a; i16++) {
                int i17 = this.f111063e[i13];
                int i18 = jVar.f111101b;
                if (i17 == i18) {
                    float[] fArr = this.f111065g;
                    float f14 = fArr[i13] + f13;
                    if (f14 > -0.001f && f14 < 0.001f) {
                        f14 = 0.0f;
                    }
                    fArr[i13] = f14;
                    if (f14 == 0.0f) {
                        if (i13 == this.f111066h) {
                            this.f111066h = this.f111064f[i13];
                        } else {
                            int[] iArr2 = this.f111064f;
                            iArr2[i15] = iArr2[i13];
                        }
                        if (z13) {
                            jVar.b(cVar);
                        }
                        if (this.f111068j) {
                            this.f111067i = i13;
                        }
                        jVar.f111111l--;
                        this.f111059a--;
                        return;
                    }
                    return;
                }
                if (i17 < i18) {
                    i15 = i13;
                }
                i13 = this.f111064f[i13];
            }
            int i19 = this.f111067i;
            int i23 = i19 + 1;
            if (this.f111068j) {
                int[] iArr3 = this.f111063e;
                if (iArr3[i19] != -1) {
                    i19 = iArr3.length;
                }
            } else {
                i19 = i23;
            }
            int[] iArr4 = this.f111063e;
            if (i19 >= iArr4.length && this.f111059a < iArr4.length) {
                int i24 = 0;
                while (true) {
                    int[] iArr5 = this.f111063e;
                    if (i24 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i24] == -1) {
                        i19 = i24;
                        break;
                    }
                    i24++;
                }
            }
            int[] iArr6 = this.f111063e;
            if (i19 >= iArr6.length) {
                i19 = iArr6.length;
                int i25 = this.f111062d * 2;
                this.f111062d = i25;
                this.f111068j = false;
                this.f111067i = i19 - 1;
                this.f111065g = Arrays.copyOf(this.f111065g, i25);
                this.f111063e = Arrays.copyOf(this.f111063e, this.f111062d);
                this.f111064f = Arrays.copyOf(this.f111064f, this.f111062d);
            }
            this.f111063e[i19] = jVar.f111101b;
            this.f111065g[i19] = f13;
            if (i15 != -1) {
                int[] iArr7 = this.f111064f;
                iArr7[i19] = iArr7[i15];
                iArr7[i15] = i19;
            } else {
                this.f111064f[i19] = this.f111066h;
                this.f111066h = i19;
            }
            jVar.f111111l++;
            jVar.a(cVar);
            this.f111059a++;
            if (!this.f111068j) {
                this.f111067i++;
            }
            int i26 = this.f111067i;
            int[] iArr8 = this.f111063e;
            if (i26 >= iArr8.length) {
                this.f111068j = true;
                this.f111067i = iArr8.length - 1;
            }
        }
    }

    @Override // s4.b
    public final int g() {
        return this.f111059a;
    }

    @Override // s4.b
    public final float h(c cVar, boolean z13) {
        float d2 = d(cVar.f111069a);
        i(cVar.f111069a, z13);
        b bVar = cVar.f111072d;
        int g13 = bVar.g();
        for (int i13 = 0; i13 < g13; i13++) {
            j b13 = bVar.b(i13);
            f(b13, bVar.d(b13) * d2, z13);
        }
        return d2;
    }

    @Override // s4.b
    public final float i(j jVar, boolean z13) {
        int i13 = this.f111066h;
        if (i13 == -1) {
            return 0.0f;
        }
        int i14 = 0;
        int i15 = -1;
        while (i13 != -1 && i14 < this.f111059a) {
            if (this.f111063e[i13] == jVar.f111101b) {
                if (i13 == this.f111066h) {
                    this.f111066h = this.f111064f[i13];
                } else {
                    int[] iArr = this.f111064f;
                    iArr[i15] = iArr[i13];
                }
                if (z13) {
                    jVar.b(this.f111060b);
                }
                jVar.f111111l--;
                this.f111059a--;
                this.f111063e[i13] = -1;
                if (this.f111068j) {
                    this.f111067i = i13;
                }
                return this.f111065g[i13];
            }
            i14++;
            i15 = i13;
            i13 = this.f111064f[i13];
        }
        return 0.0f;
    }

    @Override // s4.b
    public final float j(int i13) {
        int i14 = this.f111066h;
        for (int i15 = 0; i14 != -1 && i15 < this.f111059a; i15++) {
            if (i15 == i13) {
                return this.f111065g[i14];
            }
            i14 = this.f111064f[i14];
        }
        return 0.0f;
    }

    @Override // s4.b
    public final void k(float f13) {
        int i13 = this.f111066h;
        for (int i14 = 0; i13 != -1 && i14 < this.f111059a; i14++) {
            float[] fArr = this.f111065g;
            fArr[i13] = fArr[i13] / f13;
            i13 = this.f111064f[i13];
        }
    }

    public final String toString() {
        int i13 = this.f111066h;
        String str = "";
        for (int i14 = 0; i13 != -1 && i14 < this.f111059a; i14++) {
            StringBuilder i15 = o.i(d7.g.i(o.i(a.a.C(str, " -> ")), this.f111065g[i13], " : "));
            i15.append(((j[]) this.f111061c.f33806d)[this.f111063e[i13]]);
            str = i15.toString();
            i13 = this.f111064f[i13];
        }
        return str;
    }
}
