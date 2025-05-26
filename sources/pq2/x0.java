package pq2;

import java.util.regex.Pattern;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;

/* loaded from: classes2.dex */
public final class x0 {

    /* renamed from: l, reason: collision with root package name */
    public static final char[] f101099l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f101100m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* renamed from: a, reason: collision with root package name */
    public final String f101101a;

    /* renamed from: b, reason: collision with root package name */
    public final HttpUrl f101102b;

    /* renamed from: c, reason: collision with root package name */
    public String f101103c;

    /* renamed from: d, reason: collision with root package name */
    public HttpUrl.Builder f101104d;

    /* renamed from: e, reason: collision with root package name */
    public final Request.Builder f101105e = new Request.Builder();

    /* renamed from: f, reason: collision with root package name */
    public final Headers.Builder f101106f;

    /* renamed from: g, reason: collision with root package name */
    public MediaType f101107g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f101108h;

    /* renamed from: i, reason: collision with root package name */
    public final MultipartBody.Builder f101109i;

    /* renamed from: j, reason: collision with root package name */
    public final FormBody.Builder f101110j;

    /* renamed from: k, reason: collision with root package name */
    public RequestBody f101111k;

    public x0(String str, HttpUrl httpUrl, String str2, Headers headers, MediaType mediaType, boolean z13, boolean z14, boolean z15) {
        this.f101101a = str;
        this.f101102b = httpUrl;
        this.f101103c = str2;
        this.f101107g = mediaType;
        this.f101108h = z13;
        if (headers != null) {
            this.f101106f = headers.f();
        } else {
            this.f101106f = new Headers.Builder();
        }
        if (z14) {
            this.f101110j = new FormBody.Builder();
        } else if (z15) {
            MultipartBody.Builder builder = new MultipartBody.Builder();
            this.f101109i = builder;
            builder.c(MultipartBody.f95659h);
        }
    }

    public static void c(wo2.j jVar, String str, int i13, int i14, boolean z13) {
        wo2.j jVar2 = null;
        while (i13 < i14) {
            int codePointAt = str.codePointAt(i13);
            if (!z13 || (codePointAt != 9 && codePointAt != 10 && codePointAt != 12 && codePointAt != 13)) {
                if (codePointAt < 32 || codePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt) != -1 || (!z13 && (codePointAt == 47 || codePointAt == 37))) {
                    if (jVar2 == null) {
                        jVar2 = new wo2.j();
                    }
                    jVar2.s0(codePointAt);
                    while (!jVar2.o1()) {
                        byte readByte = jVar2.readByte();
                        jVar.a0(37);
                        char[] cArr = f101099l;
                        jVar.a0(cArr[((readByte & 255) >> 4) & 15]);
                        jVar.a0(cArr[readByte & 15]);
                    }
                } else {
                    jVar.s0(codePointAt);
                }
            }
            i13 += Character.charCount(codePointAt);
        }
    }

    public final void a(String str, String str2, boolean z13) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                this.f101107g = MediaType.b(str2);
            } catch (IllegalArgumentException e13) {
                throw new IllegalArgumentException(a.a.j("Malformed content type: ", str2), e13);
            }
        } else {
            Headers.Builder builder = this.f101106f;
            if (z13) {
                builder.d(str, str2);
            } else {
                builder.a(str, str2);
            }
        }
    }

    public final void b(String str, String str2, boolean z13) {
        String str3 = this.f101103c;
        if (str3 != null) {
            HttpUrl httpUrl = this.f101102b;
            HttpUrl.Builder g13 = httpUrl.g(str3);
            this.f101104d = g13;
            if (g13 == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + httpUrl + ", Relative: " + this.f101103c);
            }
            this.f101103c = null;
        }
        if (z13) {
            this.f101104d.a(str, str2);
        } else {
            this.f101104d.b(str, str2);
        }
    }
}
