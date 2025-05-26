package w7;

import androidx.media3.decoder.DecoderException;
import androidx.media3.exoplayer.image.ImageDecoderException;
import java.nio.ByteBuffer;
import k7.h;

/* loaded from: classes3.dex */
public final class b extends h {

    /* renamed from: n, reason: collision with root package name */
    public final c3.e f128137n;

    public b(c3.e eVar) {
        super(new k7.e[1], new a[1]);
        this.f128137n = eVar;
    }

    @Override // k7.h
    public final k7.e g() {
        return new k7.e(1);
    }

    @Override // k7.h
    public final k7.f h() {
        return new a(this);
    }

    @Override // k7.h
    public final DecoderException i(Throwable th3) {
        return new ImageDecoderException("Unexpected decode error", th3);
    }

    @Override // k7.h
    public final DecoderException j(k7.e eVar, k7.f fVar, boolean z13) {
        a aVar = (a) fVar;
        try {
            ByteBuffer byteBuffer = eVar.f78454e;
            byteBuffer.getClass();
            bf.b.t(byteBuffer.hasArray());
            bf.b.i(byteBuffer.arrayOffset() == 0);
            c3.e eVar2 = this.f128137n;
            byte[] array = byteBuffer.array();
            int remaining = byteBuffer.remaining();
            eVar2.getClass();
            aVar.f128135e = c3.e.m(remaining, array);
            aVar.f78460c = eVar.f78456g;
            return null;
        } catch (ImageDecoderException e13) {
            return e13;
        }
    }
}
