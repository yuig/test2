package e7;

import d7.c0;
import java.nio.ByteBuffer;
import kh2.s0;

/* loaded from: classes3.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f57597a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f57598b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f57599c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f57600d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f57601e;

    /* renamed from: f, reason: collision with root package name */
    public final int f57602f;

    public t(s sVar) {
        bf.b.i(sVar.f57595a == 1);
        ByteBuffer byteBuffer = sVar.f57596b;
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        c0 c0Var = new c0(bArr, 0, 0);
        c0Var.o(4);
        boolean f13 = c0Var.f();
        this.f57597a = f13;
        s0.r(f13);
        if (c0Var.f()) {
            c0Var.o(64);
            if (c0Var.f()) {
                int i13 = 0;
                while (!c0Var.f()) {
                    i13++;
                }
                if (i13 < 32) {
                    c0Var.o(i13);
                }
            }
            boolean f14 = c0Var.f();
            this.f57598b = f14;
            if (f14) {
                c0Var.o(47);
            }
        } else {
            this.f57598b = false;
        }
        boolean f15 = c0Var.f();
        int g13 = c0Var.g(5);
        for (int i14 = 0; i14 <= g13; i14++) {
            c0Var.o(12);
            if (c0Var.g(5) > 7) {
                c0Var.n();
            }
            s0.r(this.f57598b);
            if (f15 && c0Var.f()) {
                c0Var.o(4);
            }
        }
        int g14 = c0Var.g(4);
        int g15 = c0Var.g(4);
        c0Var.o(g14 + 1);
        c0Var.o(g15 + 1);
        boolean f16 = c0Var.f();
        this.f57599c = f16;
        s0.r(f16);
        c0Var.o(3);
        c0Var.o(4);
        boolean f17 = c0Var.f();
        if (f17) {
            c0Var.o(2);
        }
        if (c0Var.f()) {
            this.f57600d = true;
        } else {
            this.f57600d = c0Var.f();
        }
        if (!this.f57600d) {
            this.f57601e = true;
        } else if (c0Var.f()) {
            this.f57601e = true;
        } else {
            this.f57601e = c0Var.f();
        }
        if (f17) {
            this.f57602f = c0Var.g(3) + 1;
        } else {
            this.f57602f = 0;
        }
    }
}
