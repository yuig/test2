package gn0;

import android.media.MediaCodec;
import android.media.MediaExtractor;
import bl2.c;
import bn0.d;
import bn0.f;
import bn0.g;
import bn0.h;
import fn0.e;
import java.nio.ByteBuffer;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final e f65800a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f65801b;

    public a(e extractor) {
        Intrinsics.checkNotNullParameter(extractor, "extractor");
        this.f65800a = extractor;
    }

    public abstract Object a(MediaCodec mediaCodec, MediaCodec.BufferInfo bufferInfo, int i13, c cVar);

    public final Object b(h hVar, c cVar) {
        int i13;
        ByteBuffer byteBuffer;
        if (hVar instanceof bn0.e) {
            bn0.e eVar = (bn0.e) hVar;
            MediaCodec mediaCodec = eVar.f23568a;
            if (!this.f65801b && (byteBuffer = mediaCodec.getInputBuffer((i13 = eVar.f23569b))) != null) {
                e eVar2 = this.f65800a;
                eVar2.getClass();
                Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
                MediaExtractor mediaExtractor = eVar2.f62614a;
                int i14 = 0;
                int readSampleData = mediaExtractor.readSampleData(byteBuffer, 0);
                long sampleTime = mediaExtractor.getSampleTime();
                if (readSampleData >= 0 && (mediaExtractor.getSampleFlags() & 1) != 0) {
                    i14 = 1;
                }
                int i15 = i14;
                mediaExtractor.advance();
                if (readSampleData >= 0) {
                    mediaCodec.queueInputBuffer(i13, 0, readSampleData, sampleTime, i15);
                } else {
                    this.f65801b = true;
                    mediaCodec.queueInputBuffer(i13, 0, 0, 0L, 4);
                }
            }
        } else {
            if (hVar instanceof f) {
                f fVar = (f) hVar;
                Object a13 = a(fVar.f23570a, fVar.f23572c, fVar.f23571b, cVar);
                return a13 == cl2.a.COROUTINE_SUSPENDED ? a13 : Unit.f80348a;
            }
            if (hVar instanceof g) {
                Objects.toString(hVar);
            } else if (hVar instanceof d) {
                Objects.toString(hVar);
            }
        }
        return Unit.f80348a;
    }
}
