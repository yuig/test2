package okhttp3;

import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import okhttp3.MediaType;
import okhttp3.internal.Util;
import wo2.k;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lokhttp3/RequestBody;", "", "<init>", "()V", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public abstract class RequestBody {

    /* renamed from: a */
    public static final Companion f95711a = new Companion(0);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/RequestBody$Companion;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i13) {
            this();
        }

        public static RequestBody$Companion$toRequestBody$2 a(String str, MediaType mediaType) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            Charset charset = Charsets.UTF_8;
            if (mediaType != null) {
                MediaType.Companion companion = MediaType.f95651d;
                Charset a13 = mediaType.a(null);
                if (a13 == null) {
                    MediaType.f95651d.getClass();
                    mediaType = MediaType.Companion.b(mediaType + "; charset=utf-8");
                } else {
                    charset = a13;
                }
            }
            byte[] bytes = str.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            return b(bytes, mediaType, 0, bytes.length);
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [okhttp3.RequestBody$Companion$toRequestBody$2] */
        public static RequestBody$Companion$toRequestBody$2 b(final byte[] bArr, final MediaType mediaType, final int i13, final int i14) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            long length = bArr.length;
            long j13 = i13;
            long j14 = i14;
            byte[] bArr2 = Util.f95757a;
            if ((j13 | j14) < 0 || j13 > length || length - j13 < j14) {
                throw new ArrayIndexOutOfBoundsException();
            }
            return new RequestBody() { // from class: okhttp3.RequestBody$Companion$toRequestBody$2
                @Override // okhttp3.RequestBody
                public final long a() {
                    return i14;
                }

                @Override // okhttp3.RequestBody
                /* renamed from: b, reason: from getter */
                public final MediaType getF95716b() {
                    return MediaType.this;
                }

                @Override // okhttp3.RequestBody
                public final void d(k sink) {
                    Intrinsics.checkNotNullParameter(sink, "sink");
                    sink.E1(bArr, i13, i14);
                }
            };
        }

        public static /* synthetic */ RequestBody$Companion$toRequestBody$2 c(Companion companion, String str) {
            companion.getClass();
            return a(str, null);
        }

        public static RequestBody$Companion$toRequestBody$2 d(Companion companion, MediaType mediaType, byte[] content) {
            int length = content.length;
            companion.getClass();
            Intrinsics.checkNotNullParameter(content, "content");
            return b(content, mediaType, 0, length);
        }

        public static /* synthetic */ RequestBody$Companion$toRequestBody$2 e(Companion companion, byte[] bArr, MediaType mediaType, int i13) {
            if ((i13 & 1) != 0) {
                mediaType = null;
            }
            int length = bArr.length;
            companion.getClass();
            return b(bArr, mediaType, 0, length);
        }
    }

    public long a() {
        return -1L;
    }

    /* renamed from: b */
    public abstract MediaType getF95716b();

    public boolean c() {
        return false;
    }

    public abstract void d(k kVar);
}
