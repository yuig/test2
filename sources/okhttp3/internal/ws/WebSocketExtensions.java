package okhttp3.internal.ws;

import a.cb;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/ws/WebSocketExtensions;", "", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final /* data */ class WebSocketExtensions {

    /* renamed from: g, reason: collision with root package name */
    public static final Companion f96304g = new Companion(0);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f96305a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f96306b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f96307c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f96308d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f96309e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f96310f;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lokhttp3/internal/ws/WebSocketExtensions$Companion;", "", "", "HEADER_WEB_SOCKET_EXTENSION", "Ljava/lang/String;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i13) {
            this();
        }
    }

    public WebSocketExtensions() {
        this(false, null, false, null, false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebSocketExtensions)) {
            return false;
        }
        WebSocketExtensions webSocketExtensions = (WebSocketExtensions) obj;
        return this.f96305a == webSocketExtensions.f96305a && Intrinsics.d(this.f96306b, webSocketExtensions.f96306b) && this.f96307c == webSocketExtensions.f96307c && Intrinsics.d(this.f96308d, webSocketExtensions.f96308d) && this.f96309e == webSocketExtensions.f96309e && this.f96310f == webSocketExtensions.f96310f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        boolean z13 = this.f96305a;
        int i13 = z13;
        if (z13 != 0) {
            i13 = 1;
        }
        int i14 = i13 * 31;
        Integer num = this.f96306b;
        int hashCode = (i14 + (num == null ? 0 : num.hashCode())) * 31;
        boolean z14 = this.f96307c;
        int i15 = z14;
        if (z14 != 0) {
            i15 = 1;
        }
        int i16 = (hashCode + i15) * 31;
        Integer num2 = this.f96308d;
        int hashCode2 = (i16 + (num2 != null ? num2.hashCode() : 0)) * 31;
        boolean z15 = this.f96309e;
        int i17 = z15;
        if (z15 != 0) {
            i17 = 1;
        }
        int i18 = (hashCode2 + i17) * 31;
        boolean z16 = this.f96310f;
        return i18 + (z16 ? 1 : z16 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("WebSocketExtensions(perMessageDeflate=");
        sb3.append(this.f96305a);
        sb3.append(", clientMaxWindowBits=");
        sb3.append(this.f96306b);
        sb3.append(", clientNoContextTakeover=");
        sb3.append(this.f96307c);
        sb3.append(", serverMaxWindowBits=");
        sb3.append(this.f96308d);
        sb3.append(", serverNoContextTakeover=");
        sb3.append(this.f96309e);
        sb3.append(", unknownValues=");
        return cb.m(sb3, this.f96310f, ')');
    }

    public WebSocketExtensions(boolean z13, Integer num, boolean z14, Integer num2, boolean z15, boolean z16) {
        this.f96305a = z13;
        this.f96306b = num;
        this.f96307c = z14;
        this.f96308d = num2;
        this.f96309e = z15;
        this.f96310f = z16;
    }
}
