package n0;

import android.opengl.GLES20;
import java.nio.Buffer;

/* loaded from: classes2.dex */
public final class i extends h {

    /* renamed from: e, reason: collision with root package name */
    public final int f88749e;

    /* renamed from: f, reason: collision with root package name */
    public final int f88750f;

    /* renamed from: g, reason: collision with root package name */
    public final int f88751g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public i(c0.z r3, l0.m r4) {
        /*
            r2 = this;
            java.lang.String r0 = "sTexture"
            boolean r3 = r3.a()
            if (r3 == 0) goto Lc
            java.lang.String r3 = n0.j.f88755d
            goto Le
        Lc:
            java.lang.String r3 = n0.j.f88754c
        Le:
            java.lang.String r1 = "vTextureCoord"
            n0.e r4 = (n0.e) r4     // Catch: java.lang.Throwable -> L53
            java.lang.String r4 = r4.a()     // Catch: java.lang.Throwable -> L53
            boolean r1 = r4.contains(r1)     // Catch: java.lang.Throwable -> L53
            if (r1 == 0) goto L55
            boolean r1 = r4.contains(r0)     // Catch: java.lang.Throwable -> L53
            if (r1 == 0) goto L55
            r2.<init>(r3, r4)
            r3 = -1
            r2.f88749e = r3
            r2.f88750f = r3
            r2.f88751g = r3
            r2.a()
            int r3 = r2.f88745a
            int r4 = android.opengl.GLES20.glGetUniformLocation(r3, r0)
            r2.f88749e = r4
            n0.j.e(r4, r0)
            java.lang.String r4 = "aTextureCoord"
            int r0 = android.opengl.GLES20.glGetAttribLocation(r3, r4)
            r2.f88751g = r0
            n0.j.e(r0, r4)
            java.lang.String r4 = "uTexMatrix"
            int r3 = android.opengl.GLES20.glGetUniformLocation(r3, r4)
            r2.f88750f = r3
            n0.j.e(r3, r4)
            return
        L53:
            r3 = move-exception
            goto L5d
        L55:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L53
            java.lang.String r4 = "Invalid fragment shader"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L53
            throw r3     // Catch: java.lang.Throwable -> L53
        L5d:
            boolean r4 = r3 instanceof java.lang.IllegalArgumentException
            if (r4 == 0) goto L62
            throw r3
        L62:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unable retrieve fragment shader source"
            r4.<init>(r0, r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.i.<init>(c0.z, l0.m):void");
    }

    @Override // n0.h
    public final void b() {
        super.b();
        GLES20.glUniform1i(this.f88749e, 0);
        GLES20.glEnableVertexAttribArray(this.f88751g);
        j.b("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.f88751g, 2, 5126, false, 0, (Buffer) j.f88760i);
        j.b("glVertexAttribPointer");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public i(c0.z r4, n0.g r5) {
        /*
            r3 = this;
            boolean r0 = r4.a()
            if (r0 == 0) goto L28
            n0.g r0 = n0.g.UNKNOWN
            if (r5 == r0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "No default sampler shader available for"
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            com.bumptech.glide.d.g(r1, r0)
            n0.g r0 = n0.g.YUV
            if (r5 != r0) goto L25
            n0.e r5 = n0.j.f88758g
            goto L2a
        L25:
            n0.e r5 = n0.j.f88757f
            goto L2a
        L28:
            n0.e r5 = n0.j.f88756e
        L2a:
            r3.<init>(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.i.<init>(c0.z, n0.g):void");
    }
}
