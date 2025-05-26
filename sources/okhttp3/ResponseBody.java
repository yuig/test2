package okhttp3;

import a.a;
import dl2.b;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import okhttp3.internal.Util;
import org.jetbrains.annotations.NotNull;
import wo2.j;
import wo2.l;
import xk2.d;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b&\u0018\u0000 \u00122\u00020\u0001:\u0002\u0013\u0012B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lokhttp3/ResponseBody;", "Ljava/io/Closeable;", "Ljava/io/InputStream;", "byteStream", "()Ljava/io/InputStream;", "", "bytes", "()[B", "Ljava/io/Reader;", "charStream", "()Ljava/io/Reader;", "", "string", "()Ljava/lang/String;", "reader", "Ljava/io/Reader;", "<init>", "()V", "Companion", "BomAwareReader", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public abstract class ResponseBody implements Closeable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(0);
    private Reader reader;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/ResponseBody$BomAwareReader;", "Ljava/io/Reader;", "okhttp"}, k = 1, mv = {1, 8, 0})
    public static final class BomAwareReader extends Reader {

        /* renamed from: a, reason: collision with root package name */
        public final l f95747a;

        /* renamed from: b, reason: collision with root package name */
        public final Charset f95748b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f95749c;

        /* renamed from: d, reason: collision with root package name */
        public InputStreamReader f95750d;

        public BomAwareReader(l source, Charset charset) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(charset, "charset");
            this.f95747a = source;
            this.f95748b = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            Unit unit;
            this.f95749c = true;
            InputStreamReader inputStreamReader = this.f95750d;
            if (inputStreamReader != null) {
                inputStreamReader.close();
                unit = Unit.f80348a;
            } else {
                unit = null;
            }
            if (unit == null) {
                this.f95747a.close();
            }
        }

        @Override // java.io.Reader
        public final int read(char[] cbuf, int i13, int i14) {
            Intrinsics.checkNotNullParameter(cbuf, "cbuf");
            if (this.f95749c) {
                throw new IOException("Stream closed");
            }
            InputStreamReader inputStreamReader = this.f95750d;
            if (inputStreamReader == null) {
                l lVar = this.f95747a;
                inputStreamReader = new InputStreamReader(lVar.k2(), Util.t(lVar, this.f95748b));
                this.f95750d = inputStreamReader;
            }
            return inputStreamReader.read(cbuf, i13, i14);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/ResponseBody$Companion;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i13) {
            this();
        }

        public static ResponseBody$Companion$asResponseBody$1 a(String string) {
            Intrinsics.checkNotNullParameter(string, "<this>");
            Charset charset = Charsets.UTF_8;
            j jVar = new j();
            Intrinsics.checkNotNullParameter(string, "string");
            Intrinsics.checkNotNullParameter(charset, "charset");
            jVar.n0(string, 0, string.length(), charset);
            long j13 = jVar.f130711b;
            Intrinsics.checkNotNullParameter(jVar, "<this>");
            return new ResponseBody$Companion$asResponseBody$1(null, j13, jVar);
        }
    }

    @d
    @NotNull
    public static final ResponseBody create(MediaType mediaType, long j13, @NotNull l content) {
        INSTANCE.getClass();
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(content, "<this>");
        return new ResponseBody$Companion$asResponseBody$1(mediaType, j13, content);
    }

    @NotNull
    public final InputStream byteStream() {
        return getF95753f().k2();
    }

    @NotNull
    public final byte[] bytes() {
        long f95752e = getF95752e();
        if (f95752e > 2147483647L) {
            throw new IOException(a.g("Cannot buffer entire body for content length: ", f95752e));
        }
        l f95753f = getF95753f();
        try {
            byte[] m13 = f95753f.m1();
            b.J(f95753f, null);
            int length = m13.length;
            if (f95752e == -1 || f95752e == length) {
                return m13;
            }
            throw new IOException("Content-Length (" + f95752e + ") and stream length (" + length + ") disagree");
        } finally {
        }
    }

    @NotNull
    public final Reader charStream() {
        Charset charset;
        Reader reader = this.reader;
        if (reader == null) {
            l f95753f = getF95753f();
            MediaType f95751d = getF95751d();
            if (f95751d == null || (charset = f95751d.a(Charsets.UTF_8)) == null) {
                charset = Charsets.UTF_8;
            }
            reader = new BomAwareReader(f95753f, charset);
            this.reader = reader;
        }
        return reader;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Util.c(getF95753f());
    }

    /* renamed from: contentLength */
    public abstract long getF95752e();

    /* renamed from: contentType */
    public abstract MediaType getF95751d();

    /* renamed from: source */
    public abstract l getF95753f();

    @NotNull
    public final String string() {
        Charset charset;
        l f95753f = getF95753f();
        try {
            MediaType f95751d = getF95751d();
            if (f95751d == null || (charset = f95751d.a(Charsets.UTF_8)) == null) {
                charset = Charsets.UTF_8;
            }
            String C1 = f95753f.C1(Util.t(f95753f, charset));
            b.J(f95753f, null);
            return C1;
        } finally {
        }
    }
}
