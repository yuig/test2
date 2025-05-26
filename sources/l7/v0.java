package l7;

import android.opengl.GLES20;
import java.util.ArrayDeque;
import java.util.Iterator;
import pk.w1;

/* loaded from: classes3.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayDeque f81888a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f81889b;

    /* renamed from: c, reason: collision with root package name */
    public final int f81890c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f81891d;

    public v0(boolean z13, int i13) {
        this.f81890c = i13;
        this.f81891d = z13;
        this.f81888a = new ArrayDeque(i13);
        this.f81889b = new ArrayDeque(i13);
    }

    public final void a(sp2.i iVar, int i13, int i14) {
        int i15;
        ArrayDeque arrayDeque = this.f81888a;
        bf.b.t(arrayDeque.isEmpty());
        bf.b.t(this.f81889b.isEmpty());
        for (int i16 = 0; i16 < this.f81890c; i16++) {
            if (this.f81891d) {
                d7.n.a(i13, i14);
                int[] iArr = new int[1];
                GLES20.glGenTextures(1, iArr, 0);
                d7.n.d();
                i15 = iArr[0];
                d7.n.b(3553, i15, 9729);
                GLES20.glTexImage2D(3553, 0, 34842, i13, i14, 0, 6408, 5131, null);
                d7.n.d();
            } else {
                d7.n.a(i13, i14);
                int[] iArr2 = new int[1];
                GLES20.glGenTextures(1, iArr2, 0);
                d7.n.d();
                i15 = iArr2[0];
                d7.n.b(3553, i15, 9729);
                GLES20.glTexImage2D(3553, 0, 6408, i13, i14, 0, 6408, 5121, null);
                d7.n.d();
            }
            iVar.getClass();
            int[] iArr3 = new int[1];
            GLES20.glGenFramebuffers(1, iArr3, 0);
            d7.n.d();
            GLES20.glBindFramebuffer(36160, iArr3[0]);
            d7.n.d();
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, i15, 0);
            d7.n.d();
            arrayDeque.add(new a7.t(i15, iArr3[0], i13, i14));
        }
    }

    public final void b() {
        ArrayDeque arrayDeque = this.f81888a;
        ArrayDeque arrayDeque2 = this.f81889b;
        Iterator it = pk.o0.b(arrayDeque, arrayDeque2).iterator();
        while (true) {
            w1 w1Var = (w1) it;
            if (!w1Var.hasNext()) {
                arrayDeque.clear();
                arrayDeque2.clear();
                return;
            }
            ((a7.t) w1Var.next()).a();
        }
    }

    public final a7.t c() {
        ArrayDeque arrayDeque = this.f81888a;
        if (arrayDeque.isEmpty()) {
            throw new IllegalStateException("Textures are all in use. Please release in-use textures before calling useTexture.");
        }
        a7.t tVar = (a7.t) arrayDeque.remove();
        this.f81889b.add(tVar);
        return tVar;
    }
}
