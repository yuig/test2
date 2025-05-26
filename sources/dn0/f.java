package dn0;

import android.opengl.GLES20;
import kh2.k3;
import kotlin.Unit;

/* loaded from: classes5.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f55616a = 33984;

    /* renamed from: b, reason: collision with root package name */
    public final int f55617b;

    /* renamed from: c, reason: collision with root package name */
    public final int f55618c;

    public f(int i13) {
        this.f55617b = i13;
        int[] iArr = new int[1];
        k3.m0();
        GLES20.glGenTextures(1, iArr, 0);
        Unit unit = Unit.f80348a;
        k3.n0("glGenTextures");
        int i14 = iArr[0];
        this.f55618c = i14;
        k3.m0();
        GLES20.glBindTexture(i13, i14);
        k3.n0("glBindTexture");
        k3.m0();
        GLES20.glTexParameteri(i13, 10240, 9729);
        k3.n0("glTexParameteri");
        k3.m0();
        GLES20.glTexParameteri(i13, 10241, 9729);
        k3.n0("glTexParameteri");
        k3.m0();
        GLES20.glTexParameteri(i13, 10242, 33071);
        k3.n0("glTexParameteri");
        k3.m0();
        GLES20.glTexParameteri(i13, 10243, 33071);
        k3.n0("glTexParameteri");
        if (i13 == 32879) {
            k3.m0();
            GLES20.glTexParameteri(i13, 32882, 33071);
            k3.n0("glTexParameteri");
        }
    }
}
