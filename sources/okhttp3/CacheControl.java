package okhttp3;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/CacheControl;", "", "Builder", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class CacheControl {

    /* renamed from: n, reason: collision with root package name */
    public static final Companion f95521n = new Companion(0);

    /* renamed from: o, reason: collision with root package name */
    public static final CacheControl f95522o;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f95523a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f95524b;

    /* renamed from: c, reason: collision with root package name */
    public final int f95525c;

    /* renamed from: d, reason: collision with root package name */
    public final int f95526d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f95527e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f95528f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f95529g;

    /* renamed from: h, reason: collision with root package name */
    public final int f95530h;

    /* renamed from: i, reason: collision with root package name */
    public final int f95531i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f95532j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f95533k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f95534l;

    /* renamed from: m, reason: collision with root package name */
    public String f95535m;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/CacheControl$Builder;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final int f95536a = -1;

        /* renamed from: b, reason: collision with root package name */
        public int f95537b = -1;

        /* renamed from: c, reason: collision with root package name */
        public final int f95538c = -1;

        /* renamed from: d, reason: collision with root package name */
        public boolean f95539d;
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lokhttp3/CacheControl$Companion;", "", "Lokhttp3/CacheControl;", "FORCE_CACHE", "Lokhttp3/CacheControl;", "FORCE_NETWORK", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i13) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static okhttp3.CacheControl a(okhttp3.Headers r25) {
            /*
                Method dump skipped, instructions count: 495
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.CacheControl.Companion.a(okhttp3.Headers):okhttp3.CacheControl");
        }
    }

    static {
        Builder builder = new Builder();
        f95522o = new CacheControl(true, false, builder.f95536a, -1, false, false, false, builder.f95537b, builder.f95538c, builder.f95539d, false, false, null);
        Builder builder2 = new Builder();
        builder2.f95539d = true;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        long seconds = timeUnit.toSeconds(Integer.MAX_VALUE);
        builder2.f95537b = seconds <= 2147483647L ? (int) seconds : Integer.MAX_VALUE;
    }

    public CacheControl(boolean z13, boolean z14, int i13, int i14, boolean z15, boolean z16, boolean z17, int i15, int i16, boolean z18, boolean z19, boolean z23, String str) {
        this.f95523a = z13;
        this.f95524b = z14;
        this.f95525c = i13;
        this.f95526d = i14;
        this.f95527e = z15;
        this.f95528f = z16;
        this.f95529g = z17;
        this.f95530h = i15;
        this.f95531i = i16;
        this.f95532j = z18;
        this.f95533k = z19;
        this.f95534l = z23;
        this.f95535m = str;
    }

    /* renamed from: a, reason: from getter */
    public final int getF95525c() {
        return this.f95525c;
    }

    /* renamed from: b, reason: from getter */
    public final int getF95530h() {
        return this.f95530h;
    }

    /* renamed from: c, reason: from getter */
    public final int getF95531i() {
        return this.f95531i;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getF95529g() {
        return this.f95529g;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getF95523a() {
        return this.f95523a;
    }

    public final String toString() {
        String str = this.f95535m;
        if (str != null) {
            return str;
        }
        StringBuilder sb3 = new StringBuilder();
        if (this.f95523a) {
            sb3.append("no-cache, ");
        }
        if (this.f95524b) {
            sb3.append("no-store, ");
        }
        int i13 = this.f95525c;
        if (i13 != -1) {
            sb3.append("max-age=");
            sb3.append(i13);
            sb3.append(", ");
        }
        int i14 = this.f95526d;
        if (i14 != -1) {
            sb3.append("s-maxage=");
            sb3.append(i14);
            sb3.append(", ");
        }
        if (this.f95527e) {
            sb3.append("private, ");
        }
        if (this.f95528f) {
            sb3.append("public, ");
        }
        if (this.f95529g) {
            sb3.append("must-revalidate, ");
        }
        int i15 = this.f95530h;
        if (i15 != -1) {
            sb3.append("max-stale=");
            sb3.append(i15);
            sb3.append(", ");
        }
        int i16 = this.f95531i;
        if (i16 != -1) {
            sb3.append("min-fresh=");
            sb3.append(i16);
            sb3.append(", ");
        }
        if (this.f95532j) {
            sb3.append("only-if-cached, ");
        }
        if (this.f95533k) {
            sb3.append("no-transform, ");
        }
        if (this.f95534l) {
            sb3.append("immutable, ");
        }
        if (sb3.length() == 0) {
            return "";
        }
        sb3.delete(sb3.length() - 2, sb3.length());
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
        this.f95535m = sb4;
        return sb4;
    }
}
