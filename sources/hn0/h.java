package hn0;

import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Size;
import android.view.Surface;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h extends dn0.e {

    /* renamed from: d, reason: collision with root package name */
    public gn0.b f69632d;

    /* renamed from: e, reason: collision with root package name */
    public Size f69633e;

    /* renamed from: g, reason: collision with root package name */
    public bh.b f69635g;

    /* renamed from: h, reason: collision with root package name */
    public dn0.b f69636h;

    /* renamed from: i, reason: collision with root package name */
    public final float[] f69637i;

    /* renamed from: c, reason: collision with root package name */
    public dn0.h f69631c = dn0.c.f55610a;

    /* renamed from: f, reason: collision with root package name */
    public final dn0.d f69634f = new dn0.d();

    public h() {
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        this.f69637i = fArr;
    }

    @Override // dn0.i
    public final gn0.b a() {
        gn0.b bVar = this.f69632d;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.r("inputSurface");
        throw null;
    }

    @Override // dn0.e
    public final dn0.h c() {
        return this.f69631c;
    }

    public final void d(MediaFormat inputMediaFormat, Surface surface) {
        Intrinsics.checkNotNullParameter(inputMediaFormat, "inputMediaFormat");
        if (surface == null) {
            throw new IllegalArgumentException("GlVideoRenderer requires an output surface".toString());
        }
        this.f69633e = new Size(inputMediaFormat.getInteger("width"), inputMediaFormat.getInteger("height"));
        bh.b bVar = new bh.b(surface, this.f69634f);
        bVar.r();
        this.f69635g = bVar;
        gn0.b bVar2 = new gn0.b();
        Intrinsics.checkNotNullParameter(bVar2, "<set-?>");
        this.f69632d = bVar2;
        Intrinsics.checkNotNullParameter(inputMediaFormat, "inputMediaFormat");
        GLES20.glGetIntegerv(2978, new int[4], 0);
        dn0.b bVar3 = new dn0.b();
        bVar3.h(0, false);
        Intrinsics.checkNotNullParameter(bVar3, "<set-?>");
        this.f69631c = bVar3;
    }
}
