package bn0;

import android.media.MediaCodec;
import android.media.MediaFormat;
import co2.y;
import co2.z;
import kh2.g3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c extends MediaCodec.Callback {

    /* renamed from: a, reason: collision with root package name */
    public z f23565a;

    public c(z scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f23565a = scope;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec codec, MediaCodec.CodecException e13) {
        Intrinsics.checkNotNullParameter(codec, "codec");
        Intrinsics.checkNotNullParameter(e13, "e");
        z zVar = this.f23565a;
        if (zVar == null) {
            Intrinsics.r("scope");
            throw null;
        }
        g3.l(zVar, new d(codec, e13));
        z zVar2 = this.f23565a;
        if (zVar2 != null) {
            ((y) zVar2).r(e13);
        } else {
            Intrinsics.r("scope");
            throw null;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec codec, int i13) {
        Intrinsics.checkNotNullParameter(codec, "codec");
        z zVar = this.f23565a;
        if (zVar != null) {
            g3.l(zVar, new e(codec, i13));
        } else {
            Intrinsics.r("scope");
            throw null;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec codec, int i13, MediaCodec.BufferInfo info2) {
        Intrinsics.checkNotNullParameter(codec, "codec");
        Intrinsics.checkNotNullParameter(info2, "info");
        z zVar = this.f23565a;
        if (zVar == null) {
            Intrinsics.r("scope");
            throw null;
        }
        g3.l(zVar, new f(codec, i13, info2));
        if ((info2.flags & 4) != 0) {
            z zVar2 = this.f23565a;
            if (zVar2 != null) {
                ((y) zVar2).r(null);
            } else {
                Intrinsics.r("scope");
                throw null;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec codec, MediaFormat format) {
        Intrinsics.checkNotNullParameter(codec, "codec");
        Intrinsics.checkNotNullParameter(format, "format");
        z zVar = this.f23565a;
        if (zVar != null) {
            g3.l(zVar, new g(codec, format));
        } else {
            Intrinsics.r("scope");
            throw null;
        }
    }
}
