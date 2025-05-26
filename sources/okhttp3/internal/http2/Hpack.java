package okhttp3.internal.http2;

import ao2.m0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.z;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Http2Reader;
import okhttp3.internal.http2.Huffman;
import wo2.j;
import wo2.m;
import wo2.y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lokhttp3/internal/http2/Hpack;", "", "<init>", "()V", "Reader", "Writer", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class Hpack {

    /* renamed from: a, reason: collision with root package name */
    public static final Hpack f96022a = new Hpack();

    /* renamed from: b, reason: collision with root package name */
    public static final Header[] f96023b;

    /* renamed from: c, reason: collision with root package name */
    public static final Map f96024c;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/http2/Hpack$Reader;", "", "okhttp"}, k = 1, mv = {1, 8, 0})
    public static final class Reader {

        /* renamed from: a, reason: collision with root package name */
        public final int f96025a;

        /* renamed from: b, reason: collision with root package name */
        public int f96026b;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f96027c;

        /* renamed from: d, reason: collision with root package name */
        public final y f96028d;

        /* renamed from: e, reason: collision with root package name */
        public Header[] f96029e;

        /* renamed from: f, reason: collision with root package name */
        public int f96030f;

        /* renamed from: g, reason: collision with root package name */
        public int f96031g;

        /* renamed from: h, reason: collision with root package name */
        public int f96032h;

        public Reader(Http2Reader.ContinuationSource source) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.f96025a = 4096;
            this.f96026b = 4096;
            this.f96027c = new ArrayList();
            this.f96028d = m0.i(source);
            this.f96029e = new Header[8];
            this.f96030f = 7;
        }

        public final void a() {
            int i13 = this.f96026b;
            int i14 = this.f96032h;
            if (i13 < i14) {
                if (i13 == 0) {
                    b();
                } else {
                    c(i14 - i13);
                }
            }
        }

        public final void b() {
            z.o(0, r0.length, null, this.f96029e);
            this.f96030f = this.f96029e.length - 1;
            this.f96031g = 0;
            this.f96032h = 0;
        }

        public final int c(int i13) {
            int i14;
            int i15 = 0;
            if (i13 > 0) {
                int length = this.f96029e.length;
                while (true) {
                    length--;
                    i14 = this.f96030f;
                    if (length < i14 || i13 <= 0) {
                        break;
                    }
                    Header header = this.f96029e[length];
                    Intrinsics.f(header);
                    int i16 = header.f96021c;
                    i13 -= i16;
                    this.f96032h -= i16;
                    this.f96031g--;
                    i15++;
                }
                Header[] headerArr = this.f96029e;
                System.arraycopy(headerArr, i14 + 1, headerArr, i14 + 1 + i15, this.f96031g);
                this.f96030f += i15;
            }
            return i15;
        }

        public final m d(int i13) {
            if (i13 >= 0) {
                Hpack hpack = Hpack.f96022a;
                hpack.getClass();
                Header[] headerArr = Hpack.f96023b;
                if (i13 <= headerArr.length - 1) {
                    hpack.getClass();
                    return headerArr[i13].f96019a;
                }
            }
            Hpack.f96022a.getClass();
            int length = this.f96030f + 1 + (i13 - Hpack.f96023b.length);
            if (length >= 0) {
                Header[] headerArr2 = this.f96029e;
                if (length < headerArr2.length) {
                    Header header = headerArr2[length];
                    Intrinsics.f(header);
                    return header.f96019a;
                }
            }
            throw new IOException("Header index too large " + (i13 + 1));
        }

        public final void e(Header header) {
            this.f96027c.add(header);
            int i13 = this.f96026b;
            int i14 = header.f96021c;
            if (i14 > i13) {
                b();
                return;
            }
            c((this.f96032h + i14) - i13);
            int i15 = this.f96031g + 1;
            Header[] headerArr = this.f96029e;
            if (i15 > headerArr.length) {
                Header[] headerArr2 = new Header[headerArr.length * 2];
                System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                this.f96030f = this.f96029e.length - 1;
                this.f96029e = headerArr2;
            }
            int i16 = this.f96030f;
            this.f96030f = i16 - 1;
            this.f96029e[i16] = header;
            this.f96031g++;
            this.f96032h += i14;
        }

        public final m f() {
            int i13;
            y source = this.f96028d;
            byte readByte = source.readByte();
            byte[] bArr = Util.f95757a;
            int i14 = readByte & 255;
            int i15 = 0;
            boolean z13 = (readByte & 128) == 128;
            long g13 = g(i14, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK);
            if (!z13) {
                return source.a1(g13);
            }
            j sink = new j();
            Huffman.f96170a.getClass();
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(sink, "sink");
            Huffman.Node node = Huffman.f96173d;
            Huffman.Node node2 = node;
            int i16 = 0;
            for (long j13 = 0; j13 < g13; j13++) {
                byte readByte2 = source.readByte();
                byte[] bArr2 = Util.f95757a;
                i15 = (i15 << 8) | (readByte2 & 255);
                i16 += 8;
                while (i16 >= 8) {
                    Huffman.Node[] nodeArr = node2.f96174a;
                    Intrinsics.f(nodeArr);
                    node2 = nodeArr[(i15 >>> (i16 - 8)) & 255];
                    Intrinsics.f(node2);
                    if (node2.f96174a == null) {
                        sink.a0(node2.f96175b);
                        i16 -= node2.f96176c;
                        node2 = node;
                    } else {
                        i16 -= 8;
                    }
                }
            }
            while (i16 > 0) {
                Huffman.Node[] nodeArr2 = node2.f96174a;
                Intrinsics.f(nodeArr2);
                Huffman.Node node3 = nodeArr2[(i15 << (8 - i16)) & 255];
                Intrinsics.f(node3);
                if (node3.f96174a != null || (i13 = node3.f96176c) > i16) {
                    break;
                }
                sink.a0(node3.f96175b);
                i16 -= i13;
                node2 = node;
            }
            return sink.a1(sink.f130711b);
        }

        public final int g(int i13, int i14) {
            int i15 = i13 & i14;
            if (i15 < i14) {
                return i15;
            }
            int i16 = 0;
            while (true) {
                byte readByte = this.f96028d.readByte();
                byte[] bArr = Util.f95757a;
                int i17 = readByte & 255;
                if ((readByte & 128) == 0) {
                    return i14 + (i17 << i16);
                }
                i14 += (readByte & Byte.MAX_VALUE) << i16;
                i16 += 7;
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/http2/Hpack$Writer;", "", "okhttp"}, k = 1, mv = {1, 8, 0})
    public static final class Writer {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f96033a;

        /* renamed from: b, reason: collision with root package name */
        public final j f96034b;

        /* renamed from: c, reason: collision with root package name */
        public int f96035c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f96036d;

        /* renamed from: e, reason: collision with root package name */
        public int f96037e;

        /* renamed from: f, reason: collision with root package name */
        public Header[] f96038f;

        /* renamed from: g, reason: collision with root package name */
        public int f96039g;

        /* renamed from: h, reason: collision with root package name */
        public int f96040h;

        /* renamed from: i, reason: collision with root package name */
        public int f96041i;

        public Writer(j out) {
            Intrinsics.checkNotNullParameter(out, "out");
            this.f96033a = true;
            this.f96034b = out;
            this.f96035c = Integer.MAX_VALUE;
            this.f96037e = 4096;
            this.f96038f = new Header[8];
            this.f96039g = 7;
        }

        public final void a() {
            int i13 = this.f96037e;
            int i14 = this.f96041i;
            if (i13 < i14) {
                if (i13 == 0) {
                    b();
                } else {
                    c(i14 - i13);
                }
            }
        }

        public final void b() {
            z.o(0, r0.length, null, this.f96038f);
            this.f96039g = this.f96038f.length - 1;
            this.f96040h = 0;
            this.f96041i = 0;
        }

        public final void c(int i13) {
            int i14;
            if (i13 > 0) {
                int length = this.f96038f.length - 1;
                int i15 = 0;
                while (true) {
                    i14 = this.f96039g;
                    if (length < i14 || i13 <= 0) {
                        break;
                    }
                    Header header = this.f96038f[length];
                    Intrinsics.f(header);
                    i13 -= header.f96021c;
                    int i16 = this.f96041i;
                    Header header2 = this.f96038f[length];
                    Intrinsics.f(header2);
                    this.f96041i = i16 - header2.f96021c;
                    this.f96040h--;
                    i15++;
                    length--;
                }
                Header[] headerArr = this.f96038f;
                int i17 = i14 + 1;
                System.arraycopy(headerArr, i17, headerArr, i17 + i15, this.f96040h);
                Header[] headerArr2 = this.f96038f;
                int i18 = this.f96039g + 1;
                Arrays.fill(headerArr2, i18, i18 + i15, (Object) null);
                this.f96039g += i15;
            }
        }

        public final void d(Header header) {
            int i13 = this.f96037e;
            int i14 = header.f96021c;
            if (i14 > i13) {
                b();
                return;
            }
            c((this.f96041i + i14) - i13);
            int i15 = this.f96040h + 1;
            Header[] headerArr = this.f96038f;
            if (i15 > headerArr.length) {
                Header[] headerArr2 = new Header[headerArr.length * 2];
                System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                this.f96039g = this.f96038f.length - 1;
                this.f96038f = headerArr2;
            }
            int i16 = this.f96039g;
            this.f96039g = i16 - 1;
            this.f96038f[i16] = header;
            this.f96040h++;
            this.f96041i += i14;
        }

        public final void e(m source) {
            Intrinsics.checkNotNullParameter(source, "data");
            boolean z13 = this.f96033a;
            j jVar = this.f96034b;
            if (z13) {
                Huffman.f96170a.getClass();
                Intrinsics.checkNotNullParameter(source, "bytes");
                int b13 = source.b();
                long j13 = 0;
                for (int i13 = 0; i13 < b13; i13++) {
                    byte e13 = source.e(i13);
                    byte[] bArr = Util.f95757a;
                    j13 += Huffman.f96172c[e13 & 255];
                }
                if (((int) ((j13 + 7) >> 3)) < source.b()) {
                    j sink = new j();
                    Huffman.f96170a.getClass();
                    Intrinsics.checkNotNullParameter(source, "source");
                    Intrinsics.checkNotNullParameter(sink, "sink");
                    int b14 = source.b();
                    long j14 = 0;
                    int i14 = 0;
                    for (int i15 = 0; i15 < b14; i15++) {
                        byte e14 = source.e(i15);
                        byte[] bArr2 = Util.f95757a;
                        int i16 = e14 & 255;
                        int i17 = Huffman.f96171b[i16];
                        byte b15 = Huffman.f96172c[i16];
                        j14 = (j14 << b15) | i17;
                        i14 += b15;
                        while (i14 >= 8) {
                            i14 -= 8;
                            sink.a0((int) (j14 >> i14));
                        }
                    }
                    if (i14 > 0) {
                        sink.a0((int) ((255 >>> i14) | (j14 << (8 - i14))));
                    }
                    m a13 = sink.a1(sink.f130711b);
                    g(a13.b(), RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
                    jVar.S(a13);
                    return;
                }
            }
            g(source.b(), RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK, 0);
            jVar.S(source);
        }

        public final void f(ArrayList headerBlock) {
            int i13;
            int i14;
            Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
            if (this.f96036d) {
                int i15 = this.f96035c;
                if (i15 < this.f96037e) {
                    g(i15, 31, 32);
                }
                this.f96036d = false;
                this.f96035c = Integer.MAX_VALUE;
                g(this.f96037e, 31, 32);
            }
            int size = headerBlock.size();
            for (int i16 = 0; i16 < size; i16++) {
                Header header = (Header) headerBlock.get(i16);
                m h10 = header.f96019a.h();
                Hpack.f96022a.getClass();
                Integer num = (Integer) Hpack.f96024c.get(h10);
                m mVar = header.f96020b;
                if (num != null) {
                    int intValue = num.intValue();
                    i14 = intValue + 1;
                    if (2 <= i14 && i14 < 8) {
                        Header[] headerArr = Hpack.f96023b;
                        if (Intrinsics.d(headerArr[intValue].f96020b, mVar)) {
                            i13 = i14;
                        } else if (Intrinsics.d(headerArr[i14].f96020b, mVar)) {
                            i14 = intValue + 2;
                            i13 = i14;
                        }
                    }
                    i13 = i14;
                    i14 = -1;
                } else {
                    i13 = -1;
                    i14 = -1;
                }
                if (i14 == -1) {
                    int i17 = this.f96039g + 1;
                    int length = this.f96038f.length;
                    while (true) {
                        if (i17 >= length) {
                            break;
                        }
                        Header header2 = this.f96038f[i17];
                        Intrinsics.f(header2);
                        if (Intrinsics.d(header2.f96019a, h10)) {
                            Header header3 = this.f96038f[i17];
                            Intrinsics.f(header3);
                            if (Intrinsics.d(header3.f96020b, mVar)) {
                                int i18 = i17 - this.f96039g;
                                Hpack.f96022a.getClass();
                                i14 = Hpack.f96023b.length + i18;
                                break;
                            } else if (i13 == -1) {
                                int i19 = i17 - this.f96039g;
                                Hpack.f96022a.getClass();
                                i13 = i19 + Hpack.f96023b.length;
                            }
                        }
                        i17++;
                    }
                }
                if (i14 != -1) {
                    g(i14, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
                } else if (i13 == -1) {
                    this.f96034b.a0(64);
                    e(h10);
                    e(mVar);
                    d(header);
                } else {
                    m prefix = Header.f96013d;
                    h10.getClass();
                    Intrinsics.checkNotNullParameter(prefix, "prefix");
                    if (!h10.g(prefix, prefix.b()) || Intrinsics.d(Header.f96018i, h10)) {
                        g(i13, 63, 64);
                        e(mVar);
                        d(header);
                    } else {
                        g(i13, 15, 0);
                        e(mVar);
                    }
                }
            }
        }

        public final void g(int i13, int i14, int i15) {
            j jVar = this.f96034b;
            if (i13 < i14) {
                jVar.a0(i13 | i15);
                return;
            }
            jVar.a0(i15 | i14);
            int i16 = i13 - i14;
            while (i16 >= 128) {
                jVar.a0(128 | (i16 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK));
                i16 >>>= 7;
            }
            jVar.a0(i16);
        }
    }

    static {
        Header header = new Header("", Header.f96018i);
        m mVar = Header.f96015f;
        Header header2 = new Header("GET", mVar);
        Header header3 = new Header("POST", mVar);
        m mVar2 = Header.f96016g;
        Header header4 = new Header("/", mVar2);
        Header header5 = new Header("/index.html", mVar2);
        m mVar3 = Header.f96017h;
        Header header6 = new Header("http", mVar3);
        Header header7 = new Header("https", mVar3);
        m mVar4 = Header.f96014e;
        Header[] headerArr = {header, header2, header3, header4, header5, header6, header7, new Header("200", mVar4), new Header("204", mVar4), new Header("206", mVar4), new Header("304", mVar4), new Header("400", mVar4), new Header("404", mVar4), new Header("500", mVar4), new Header("accept-charset", ""), new Header("accept-encoding", "gzip, deflate"), new Header("accept-language", ""), new Header("accept-ranges", ""), new Header("accept", ""), new Header("access-control-allow-origin", ""), new Header("age", ""), new Header("allow", ""), new Header("authorization", ""), new Header("cache-control", ""), new Header("content-disposition", ""), new Header("content-encoding", ""), new Header("content-language", ""), new Header("content-length", ""), new Header("content-location", ""), new Header("content-range", ""), new Header("content-type", ""), new Header("cookie", ""), new Header("date", ""), new Header("etag", ""), new Header("expect", ""), new Header("expires", ""), new Header("from", ""), new Header("host", ""), new Header("if-match", ""), new Header("if-modified-since", ""), new Header("if-none-match", ""), new Header("if-range", ""), new Header("if-unmodified-since", ""), new Header("last-modified", ""), new Header("link", ""), new Header("location", ""), new Header("max-forwards", ""), new Header("proxy-authenticate", ""), new Header("proxy-authorization", ""), new Header("range", ""), new Header("referer", ""), new Header("refresh", ""), new Header("retry-after", ""), new Header("server", ""), new Header("set-cookie", ""), new Header("strict-transport-security", ""), new Header("transfer-encoding", ""), new Header("user-agent", ""), new Header("vary", ""), new Header("via", ""), new Header("www-authenticate", "")};
        f96023b = headerArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(headerArr.length);
        int length = headerArr.length;
        for (int i13 = 0; i13 < length; i13++) {
            if (!linkedHashMap.containsKey(headerArr[i13].f96019a)) {
                linkedHashMap.put(headerArr[i13].f96019a, Integer.valueOf(i13));
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "unmodifiableMap(result)");
        f96024c = unmodifiableMap;
    }

    private Hpack() {
    }

    public static void a(m name) {
        Intrinsics.checkNotNullParameter(name, "name");
        int b13 = name.b();
        for (int i13 = 0; i13 < b13; i13++) {
            byte e13 = name.e(i13);
            if (65 <= e13 && e13 < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(name.j()));
            }
        }
    }
}
