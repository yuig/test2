package in0;

import android.media.MediaFormat;
import android.opengl.GLES20;
import android.view.Surface;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h extends dn0.e {

    /* renamed from: c, reason: collision with root package name */
    public dn0.h f72822c;

    /* renamed from: d, reason: collision with root package name */
    public gn0.b f72823d;

    /* renamed from: e, reason: collision with root package name */
    public final dn0.d f72824e = new dn0.d();

    /* renamed from: f, reason: collision with root package name */
    public bh.b f72825f;

    @Override // dn0.i
    public final gn0.b a() {
        gn0.b bVar = this.f72823d;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.r("inputSurface");
        throw null;
    }

    @Override // dn0.e
    public final dn0.h c() {
        dn0.h hVar = this.f72822c;
        if (hVar != null) {
            return hVar;
        }
        Intrinsics.r("videoFilter");
        throw null;
    }

    public final void d(MediaFormat inputMediaFormat, Surface surface) {
        Intrinsics.checkNotNullParameter(inputMediaFormat, "inputMediaFormat");
        bh.b bVar = new bh.b(surface, this.f72824e);
        bVar.r();
        this.f72825f = bVar;
        gn0.b bVar2 = new gn0.b();
        Intrinsics.checkNotNullParameter(bVar2, "<set-?>");
        this.f72823d = bVar2;
        Intrinsics.checkNotNullParameter(inputMediaFormat, "inputMediaFormat");
        GLES20.glGetIntegerv(2978, new int[4], 0);
        dn0.b bVar3 = new dn0.b();
        bVar3.h(0, true);
        Intrinsics.checkNotNullParameter(bVar3, "<set-?>");
        this.f72822c = bVar3;
    }

    public final void e(long j13, boolean z13) {
        gn0.b.a(a());
        b();
    }
}
