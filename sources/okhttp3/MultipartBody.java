package okhttp3;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.f0;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.internal.Util;
import wo2.j;
import wo2.k;
import wo2.m;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lokhttp3/MultipartBody;", "Lokhttp3/RequestBody;", "Builder", "Companion", "Part", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class MultipartBody extends RequestBody {

    /* renamed from: f, reason: collision with root package name */
    public static final Companion f95657f = new Companion(0);

    /* renamed from: g, reason: collision with root package name */
    public static final MediaType f95658g;

    /* renamed from: h, reason: collision with root package name */
    public static final MediaType f95659h;

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f95660i;

    /* renamed from: j, reason: collision with root package name */
    public static final byte[] f95661j;

    /* renamed from: k, reason: collision with root package name */
    public static final byte[] f95662k;

    /* renamed from: b, reason: collision with root package name */
    public final m f95663b;

    /* renamed from: c, reason: collision with root package name */
    public final List f95664c;

    /* renamed from: d, reason: collision with root package name */
    public final MediaType f95665d;

    /* renamed from: e, reason: collision with root package name */
    public long f95666e;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/MultipartBody$Builder;", "", "okhttp"}, k = 1, mv = {1, 8, 0})
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final m f95667a;

        /* renamed from: b, reason: collision with root package name */
        public MediaType f95668b;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f95669c;

        public Builder() {
            this(0);
        }

        public final void a(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            Part.f95670c.getClass();
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            Part part = Part.Companion.b(name, null, RequestBody.Companion.c(RequestBody.f95711a, value));
            Intrinsics.checkNotNullParameter(part, "part");
            this.f95669c.add(part);
        }

        public final MultipartBody b() {
            ArrayList arrayList = this.f95669c;
            if (!arrayList.isEmpty()) {
                return new MultipartBody(this.f95667a, this.f95668b, Util.A(arrayList));
            }
            throw new IllegalStateException("Multipart body must have at least one part.".toString());
        }

        public final void c(MediaType type) {
            Intrinsics.checkNotNullParameter(type, "type");
            if (Intrinsics.d(type.f95655b, "multipart")) {
                this.f95668b = type;
            } else {
                throw new IllegalArgumentException(("multipart != " + type).toString());
            }
        }

        public Builder(int i13) {
            String boundary = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(boundary, "randomUUID().toString()");
            Intrinsics.checkNotNullParameter(boundary, "boundary");
            m mVar = m.f130712d;
            this.f95667a = f0.h0(boundary);
            this.f95668b = MultipartBody.f95658g;
            this.f95669c = new ArrayList();
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0004¨\u0006\u0010"}, d2 = {"Lokhttp3/MultipartBody$Companion;", "", "Lokhttp3/MediaType;", "ALTERNATIVE", "Lokhttp3/MediaType;", "", "COLONSPACE", "[B", "CRLF", "DASHDASH", "DIGEST", "FORM", "MIXED", "PARALLEL", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i13) {
            this();
        }

        public static void a(String key, StringBuilder sb3) {
            Intrinsics.checkNotNullParameter(sb3, "<this>");
            Intrinsics.checkNotNullParameter(key, "key");
            sb3.append('\"');
            int length = key.length();
            for (int i13 = 0; i13 < length; i13++) {
                char charAt = key.charAt(i13);
                if (charAt == '\n') {
                    sb3.append("%0A");
                } else if (charAt == '\r') {
                    sb3.append("%0D");
                } else if (charAt == '\"') {
                    sb3.append("%22");
                } else {
                    sb3.append(charAt);
                }
            }
            sb3.append('\"');
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/MultipartBody$Part;", "", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0})
    public static final class Part {

        /* renamed from: c, reason: collision with root package name */
        public static final Companion f95670c = new Companion(0);

        /* renamed from: a, reason: collision with root package name */
        public final Headers f95671a;

        /* renamed from: b, reason: collision with root package name */
        public final RequestBody f95672b;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/MultipartBody$Part$Companion;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(int i13) {
                this();
            }

            public static Part a(Headers headers, RequestBody body) {
                Intrinsics.checkNotNullParameter(body, "body");
                if ((headers != null ? headers.c("Content-Type") : null) != null) {
                    throw new IllegalArgumentException("Unexpected header: Content-Type".toString());
                }
                if ((headers != null ? headers.c("Content-Length") : null) == null) {
                    return new Part(headers, body);
                }
                throw new IllegalArgumentException("Unexpected header: Content-Length".toString());
            }

            public static Part b(String name, String str, RequestBody body) {
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(body, "body");
                StringBuilder sb3 = new StringBuilder();
                sb3.append("form-data; name=");
                MultipartBody.f95657f.getClass();
                Companion.a(name, sb3);
                if (str != null) {
                    sb3.append("; filename=");
                    Companion.a(str, sb3);
                }
                String sb4 = sb3.toString();
                Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
                Headers.Builder builder = new Headers.Builder();
                builder.d("Content-Disposition", sb4);
                return a(builder.e(), body);
            }
        }

        public Part(Headers headers, RequestBody requestBody) {
            this.f95671a = headers;
            this.f95672b = requestBody;
        }
    }

    static {
        MediaType.f95651d.getClass();
        f95658g = MediaType.Companion.a("multipart/mixed");
        MediaType.Companion.a("multipart/alternative");
        MediaType.Companion.a("multipart/digest");
        MediaType.Companion.a("multipart/parallel");
        f95659h = MediaType.Companion.a("multipart/form-data");
        f95660i = new byte[]{58, 32};
        f95661j = new byte[]{13, 10};
        f95662k = new byte[]{45, 45};
    }

    public MultipartBody(m boundaryByteString, MediaType type, List parts) {
        Intrinsics.checkNotNullParameter(boundaryByteString, "boundaryByteString");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(parts, "parts");
        this.f95663b = boundaryByteString;
        this.f95664c = parts;
        MediaType.Companion companion = MediaType.f95651d;
        String str = type + "; boundary=" + boundaryByteString.j();
        companion.getClass();
        this.f95665d = MediaType.Companion.a(str);
        this.f95666e = -1L;
    }

    @Override // okhttp3.RequestBody
    public final long a() {
        long j13 = this.f95666e;
        if (j13 != -1) {
            return j13;
        }
        long e13 = e(null, true);
        this.f95666e = e13;
        return e13;
    }

    @Override // okhttp3.RequestBody
    /* renamed from: b, reason: from getter */
    public final MediaType getF95716b() {
        return this.f95665d;
    }

    @Override // okhttp3.RequestBody
    public final void d(k sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        e(sink, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long e(k kVar, boolean z13) {
        j jVar;
        k kVar2;
        if (z13) {
            kVar2 = new j();
            jVar = kVar2;
        } else {
            jVar = 0;
            kVar2 = kVar;
        }
        List list = this.f95664c;
        int size = list.size();
        long j13 = 0;
        int i13 = 0;
        while (true) {
            m mVar = this.f95663b;
            byte[] bArr = f95662k;
            byte[] bArr2 = f95661j;
            if (i13 >= size) {
                Intrinsics.f(kVar2);
                kVar2.I0(bArr);
                kVar2.t1(mVar);
                kVar2.I0(bArr);
                kVar2.I0(bArr2);
                if (!z13) {
                    return j13;
                }
                Intrinsics.f(jVar);
                long j14 = j13 + jVar.f130711b;
                jVar.a();
                return j14;
            }
            Part part = (Part) list.get(i13);
            Headers headers = part.f95671a;
            Intrinsics.f(kVar2);
            kVar2.I0(bArr);
            kVar2.t1(mVar);
            kVar2.I0(bArr2);
            if (headers != null) {
                int size2 = headers.size();
                for (int i14 = 0; i14 < size2; i14++) {
                    kVar2.l0(headers.d(i14)).I0(f95660i).l0(headers.j(i14)).I0(bArr2);
                }
            }
            RequestBody requestBody = part.f95672b;
            MediaType f95716b = requestBody.getF95716b();
            if (f95716b != null) {
                kVar2.l0("Content-Type: ").l0(f95716b.f95654a).I0(bArr2);
            }
            long a13 = requestBody.a();
            if (a13 != -1) {
                kVar2.l0("Content-Length: ").O0(a13).I0(bArr2);
            } else if (z13) {
                Intrinsics.f(jVar);
                jVar.a();
                return -1L;
            }
            kVar2.I0(bArr2);
            if (z13) {
                j13 += a13;
            } else {
                requestBody.d(kVar2);
            }
            kVar2.I0(bArr2);
            i13++;
        }
    }
}
