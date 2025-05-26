package hp2;

import java.net.HttpRetryException;
import java.nio.ByteBuffer;
import kp2.h;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* loaded from: classes4.dex */
public final class a extends UploadDataProvider {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f69889g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f69890h;

    public a(ByteBuffer byteBuffer) {
        this.f69889g = 0;
        this.f69890h = byteBuffer;
    }

    @Override // org.chromium.net.UploadDataProvider
    public final long getLength() {
        int i13 = this.f69889g;
        Object obj = this.f69890h;
        switch (i13) {
            case 0:
                return ((ByteBuffer) obj).limit();
            case 1:
                kp2.a aVar = (kp2.a) obj;
                int i14 = aVar.f80581d;
                if (i14 == -1) {
                    i14 = aVar.f80584g ? aVar.f80583f.limit() : aVar.f80583f.position();
                }
                return i14;
            case 2:
                return -1L;
            default:
                return ((kp2.c) obj).f80590e;
        }
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        int i13 = this.f69889g;
        Object obj = this.f69890h;
        switch (i13) {
            case 0:
                if (!byteBuffer.hasRemaining()) {
                    throw new IllegalStateException("Cronet passed a buffer with no bytes remaining");
                }
                ByteBuffer byteBuffer2 = (ByteBuffer) obj;
                if (byteBuffer.remaining() >= byteBuffer2.remaining()) {
                    byteBuffer.put(byteBuffer2);
                } else {
                    int limit = byteBuffer2.limit();
                    byteBuffer.put(byteBuffer2);
                }
                uploadDataSink.onReadSucceeded(false);
                return;
            case 1:
                int remaining = byteBuffer.remaining();
                kp2.a aVar = (kp2.a) obj;
                if (remaining < aVar.f80583f.remaining()) {
                    byteBuffer.put(aVar.f80583f.array(), aVar.f80583f.position(), remaining);
                    ByteBuffer byteBuffer3 = aVar.f80583f;
                } else {
                    byteBuffer.put(aVar.f80583f);
                }
                uploadDataSink.onReadSucceeded(false);
                return;
            case 2:
                int remaining2 = byteBuffer.remaining();
                kp2.b bVar = (kp2.b) obj;
                int remaining3 = bVar.f80586e.remaining();
                ByteBuffer byteBuffer4 = bVar.f80586e;
                if (remaining2 >= remaining3) {
                    byteBuffer.put(byteBuffer4);
                    uploadDataSink.onReadSucceeded(bVar.f80588g);
                    if (bVar.f80588g) {
                        return;
                    }
                    bVar.f80585d.f80621b = false;
                    return;
                }
                int limit2 = byteBuffer4.limit();
                byteBuffer.put(byteBuffer4);
                uploadDataSink.onReadSucceeded(false);
                return;
            default:
                int remaining4 = byteBuffer.remaining();
                kp2.c cVar = (kp2.c) obj;
                int remaining5 = cVar.f80591f.remaining();
                ByteBuffer byteBuffer5 = cVar.f80591f;
                if (remaining4 >= remaining5) {
                    byteBuffer.put(byteBuffer5);
                    uploadDataSink.onReadSucceeded(false);
                    cVar.f80589d.f80621b = false;
                    return;
                }
                int limit3 = byteBuffer5.limit();
                byteBuffer.put(byteBuffer5);
                uploadDataSink.onReadSucceeded(false);
                return;
        }
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void rewind(UploadDataSink uploadDataSink) {
        int i13 = this.f69889g;
        Object obj = this.f69890h;
        switch (i13) {
            case 0:
                uploadDataSink.onRewindSucceeded();
                break;
            case 1:
                uploadDataSink.onRewindSucceeded();
                break;
            case 2:
                uploadDataSink.onRewindError(new HttpRetryException("Cannot retry streamed Http body", -1));
                break;
            default:
                uploadDataSink.onRewindError(new HttpRetryException("Cannot retry streamed Http body", -1));
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(ByteBuffer byteBuffer, int i13) {
        this(byteBuffer);
        this.f69889g = 0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(kp2.a aVar) {
        this(aVar, 1);
        this.f69889g = 1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(kp2.b bVar) {
        this(bVar, 2);
        this.f69889g = 2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(kp2.c cVar) {
        this(cVar, 3);
        this.f69889g = 3;
    }

    public /* synthetic */ a(h hVar, int i13) {
        this.f69889g = i13;
        this.f69890h = hVar;
    }
}
