package okhttp3.internal.http2;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.f0;
import wo2.m;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/http2/Header;", "", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final /* data */ class Header {

    /* renamed from: d, reason: collision with root package name */
    public static final m f96013d;

    /* renamed from: e, reason: collision with root package name */
    public static final m f96014e;

    /* renamed from: f, reason: collision with root package name */
    public static final m f96015f;

    /* renamed from: g, reason: collision with root package name */
    public static final m f96016g;

    /* renamed from: h, reason: collision with root package name */
    public static final m f96017h;

    /* renamed from: i, reason: collision with root package name */
    public static final m f96018i;

    /* renamed from: a, reason: collision with root package name */
    public final m f96019a;

    /* renamed from: b, reason: collision with root package name */
    public final m f96020b;

    /* renamed from: c, reason: collision with root package name */
    public final int f96021c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\bR\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\bR\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0014\u0010\u0010\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\b¨\u0006\u0013"}, d2 = {"Lokhttp3/internal/http2/Header$Companion;", "", "Lwo2/m;", "PSEUDO_PREFIX", "Lwo2/m;", "RESPONSE_STATUS", "", "RESPONSE_STATUS_UTF8", "Ljava/lang/String;", "TARGET_AUTHORITY", "TARGET_AUTHORITY_UTF8", "TARGET_METHOD", "TARGET_METHOD_UTF8", "TARGET_PATH", "TARGET_PATH_UTF8", "TARGET_SCHEME", "TARGET_SCHEME_UTF8", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i13) {
            this();
        }
    }

    static {
        new Companion(0);
        m mVar = m.f130712d;
        f96013d = f0.h0(":");
        f96014e = f0.h0(":status");
        f96015f = f0.h0(":method");
        f96016g = f0.h0(":path");
        f96017h = f0.h0(":scheme");
        f96018i = f0.h0(":authority");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Header(String value, m name) {
        this(name, f0.h0(value));
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        m mVar = m.f130712d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Header)) {
            return false;
        }
        Header header = (Header) obj;
        return Intrinsics.d(this.f96019a, header.f96019a) && Intrinsics.d(this.f96020b, header.f96020b);
    }

    public final int hashCode() {
        return this.f96020b.hashCode() + (this.f96019a.hashCode() * 31);
    }

    public final String toString() {
        return this.f96019a.j() + ": " + this.f96020b.j();
    }

    public Header(m name, m value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f96019a = name;
        this.f96020b = value;
        this.f96021c = value.b() + name.b() + 32;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Header(String name, String value) {
        this(f0.h0(name), f0.h0(value));
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        m mVar = m.f130712d;
    }
}
