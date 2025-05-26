package x4;

import androidx.appcompat.widget.c2;
import java.io.EOFException;

/* loaded from: classes3.dex */
public final class e0 implements androidx.constraintlayout.widget.t {

    /* renamed from: a, reason: collision with root package name */
    public int f131738a;

    /* renamed from: b, reason: collision with root package name */
    public int f131739b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f131740c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f131741d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f131742e;

    public e0() {
        this.f131741d = new k9.f();
        this.f131742e = new d7.d0(new byte[65025], 0);
        this.f131738a = -1;
    }

    public final int a(int i13) {
        int i14;
        int i15 = 0;
        this.f131739b = 0;
        do {
            int i16 = this.f131739b;
            int i17 = i13 + i16;
            Object obj = this.f131741d;
            if (i17 >= ((k9.f) obj).f78683c) {
                break;
            }
            int[] iArr = ((k9.f) obj).f78686f;
            this.f131739b = i16 + 1;
            i14 = iArr[i16 + i13];
            i15 += i14;
        } while (i14 == 255);
        return i15;
    }

    public final boolean b(q8.t tVar) {
        int i13;
        bf.b.t(tVar != null);
        boolean z13 = this.f131740c;
        Object obj = this.f131742e;
        if (z13) {
            this.f131740c = false;
            ((d7.d0) obj).H(0);
        }
        while (!this.f131740c) {
            int i14 = this.f131738a;
            Object obj2 = this.f131741d;
            if (i14 < 0) {
                k9.f fVar = (k9.f) obj2;
                if (fVar.b(tVar, -1L) && fVar.a(tVar, true)) {
                    int i15 = fVar.f78684d;
                    if ((fVar.f78681a & 1) == 1 && ((d7.d0) obj).f53808c == 0) {
                        i15 += a(0);
                        i13 = this.f131739b;
                    } else {
                        i13 = 0;
                    }
                    try {
                        tVar.p(i15);
                        this.f131738a = i13;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int a13 = a(this.f131738a);
            int i16 = this.f131738a + this.f131739b;
            if (a13 > 0) {
                d7.d0 d0Var = (d7.d0) obj;
                d0Var.b(d0Var.f53808c + a13);
                try {
                    tVar.readFully(d0Var.f53806a, d0Var.f53808c, a13);
                    d0Var.J(d0Var.f53808c + a13);
                    this.f131740c = ((k9.f) obj2).f78686f[i16 + (-1)] != 255;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i16 == ((k9.f) obj2).f78683c) {
                i16 = -1;
            }
            this.f131738a = i16;
        }
        return true;
    }

    public e0(c2 c2Var, d0 d0Var, int i13, boolean z13, int i14) {
        this.f131742e = c2Var;
        this.f131741d = d0Var;
        this.f131738a = i13;
        this.f131740c = z13;
        this.f131739b = i14;
    }
}
