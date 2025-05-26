package j8;

import androidx.media3.decoder.DecoderException;
import androidx.media3.extractor.text.SubtitleDecoderException;
import java.nio.ByteBuffer;
import k7.h;
import l9.i;
import l9.l;

/* loaded from: classes3.dex */
public final class b extends h implements l9.e {

    /* renamed from: n, reason: collision with root package name */
    public final l f74916n;

    public b(l lVar) {
        super(new l9.h[2], new i[2]);
        int i13 = this.f78469g;
        k7.e[] eVarArr = this.f78467e;
        bf.b.t(i13 == eVarArr.length);
        for (k7.e eVar : eVarArr) {
            eVar.p(1024);
        }
        this.f74916n = lVar;
    }

    @Override // l9.e
    public final /* bridge */ /* synthetic */ void b(long j13) {
    }

    @Override // k7.h
    public final k7.e g() {
        return new l9.h(1);
    }

    @Override // k7.h
    public final k7.f h() {
        return new l9.c(this);
    }

    @Override // k7.h
    public final DecoderException i(Throwable th3) {
        return new SubtitleDecoderException("Unexpected decode error", th3);
    }

    @Override // k7.h
    public final DecoderException j(k7.e eVar, k7.f fVar, boolean z13) {
        l9.h hVar = (l9.h) eVar;
        i iVar = (i) fVar;
        try {
            ByteBuffer byteBuffer = hVar.f78454e;
            byteBuffer.getClass();
            byte[] array = byteBuffer.array();
            int limit = byteBuffer.limit();
            l lVar = this.f74916n;
            if (z13) {
                lVar.d();
            }
            l9.d x13 = lVar.x(array, 0, limit);
            long j13 = hVar.f78456g;
            long j14 = hVar.f82315k;
            iVar.f78460c = j13;
            iVar.f82316e = x13;
            if (j14 != Long.MAX_VALUE) {
                j13 = j14;
            }
            iVar.f82317f = j13;
            iVar.f78461d = false;
            return null;
        } catch (SubtitleDecoderException e13) {
            return e13;
        }
    }
}
