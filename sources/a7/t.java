package a7;

import android.opengl.GLES20;

/* loaded from: classes3.dex */
public final class t {

    /* renamed from: e, reason: collision with root package name */
    public static final t f1201e = new t(-1, -1, -1, -1);

    /* renamed from: a, reason: collision with root package name */
    public final int f1202a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1203b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1204c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1205d;

    public t(int i13, int i14, int i15, int i16) {
        this.f1202a = i13;
        this.f1203b = i14;
        this.f1204c = i15;
        this.f1205d = i16;
    }

    public final void a() {
        int i13 = this.f1202a;
        if (i13 != -1) {
            GLES20.glDeleteTextures(1, new int[]{i13}, 0);
            d7.n.d();
        }
        int i14 = this.f1203b;
        if (i14 != -1) {
            GLES20.glDeleteFramebuffers(1, new int[]{i14}, 0);
            d7.n.d();
        }
    }
}
