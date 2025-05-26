package okhttp3.internal.cache;

import ads_mobile_sdk.wb;
import com.google.android.gms.ads.AdSize;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.http.DatesKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/cache/CacheStrategy;", "", "Companion", "Factory", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class CacheStrategy {

    /* renamed from: c, reason: collision with root package name */
    public static final Companion f95772c = new Companion(0);

    /* renamed from: a, reason: collision with root package name */
    public final Request f95773a;

    /* renamed from: b, reason: collision with root package name */
    public final Response f95774b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/cache/CacheStrategy$Companion;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i13) {
            this();
        }

        public static boolean a(Request request, Response response) {
            Intrinsics.checkNotNullParameter(response, "response");
            Intrinsics.checkNotNullParameter(request, "request");
            int i13 = response.f95723d;
            if (i13 != 200 && i13 != 410 && i13 != 414 && i13 != 501 && i13 != 203 && i13 != 204) {
                if (i13 != 307) {
                    if (i13 != 308 && i13 != 404 && i13 != 405) {
                        switch (i13) {
                            case AdSize.MEDIUM_RECTANGLE_WIDTH /* 300 */:
                            case wb.W0 /* 301 */:
                                break;
                            case wb.X0 /* 302 */:
                                break;
                            default:
                                return false;
                        }
                    }
                }
                if (response.c("Expires", null) == null && response.a().f95525c == -1 && !response.a().f95528f && !response.a().f95527e) {
                    return false;
                }
            }
            if (response.a().f95524b) {
                return false;
            }
            CacheControl cacheControl = request.f95705f;
            if (cacheControl == null) {
                CacheControl.f95521n.getClass();
                cacheControl = CacheControl.Companion.a(request.f95702c);
                request.f95705f = cacheControl;
            }
            return !cacheControl.f95524b;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/cache/CacheStrategy$Factory;", "", "okhttp"}, k = 1, mv = {1, 8, 0})
    public static final class Factory {

        /* renamed from: a, reason: collision with root package name */
        public final long f95775a;

        /* renamed from: b, reason: collision with root package name */
        public final Response f95776b;

        /* renamed from: c, reason: collision with root package name */
        public final Date f95777c;

        /* renamed from: d, reason: collision with root package name */
        public final String f95778d;

        /* renamed from: e, reason: collision with root package name */
        public final Date f95779e;

        /* renamed from: f, reason: collision with root package name */
        public final String f95780f;

        /* renamed from: g, reason: collision with root package name */
        public final Date f95781g;

        /* renamed from: h, reason: collision with root package name */
        public final long f95782h;

        /* renamed from: i, reason: collision with root package name */
        public final long f95783i;

        /* renamed from: j, reason: collision with root package name */
        public final String f95784j;

        /* renamed from: k, reason: collision with root package name */
        public final int f95785k;

        public Factory(long j13, Request request, Response response) {
            Intrinsics.checkNotNullParameter(request, "request");
            this.f95775a = j13;
            this.f95776b = response;
            this.f95785k = -1;
            if (response != null) {
                this.f95782h = response.f95730k;
                this.f95783i = response.f95731l;
                Headers headers = response.f95725f;
                int size = headers.size();
                for (int i13 = 0; i13 < size; i13++) {
                    String d2 = headers.d(i13);
                    String j14 = headers.j(i13);
                    if (z.i(d2, "Date", true)) {
                        this.f95777c = DatesKt.a(j14);
                        this.f95778d = j14;
                    } else if (z.i(d2, "Expires", true)) {
                        this.f95781g = DatesKt.a(j14);
                    } else if (z.i(d2, "Last-Modified", true)) {
                        this.f95779e = DatesKt.a(j14);
                        this.f95780f = j14;
                    } else if (z.i(d2, "ETag", true)) {
                        this.f95784j = j14;
                    } else if (z.i(d2, "Age", true)) {
                        this.f95785k = Util.C(-1, j14);
                    }
                }
            }
        }

        public static boolean c(Request request) {
            return (request.a("If-Modified-Since") == null && request.a("If-None-Match") == null) ? false : true;
        }

        public final long a() {
            long j13 = this.f95783i;
            Date date = this.f95777c;
            long max = date != null ? Math.max(0L, j13 - date.getTime()) : 0L;
            int i13 = this.f95785k;
            if (i13 != -1) {
                max = Math.max(max, TimeUnit.SECONDS.toMillis(i13));
            }
            return max + (j13 - this.f95782h) + (this.f95775a - j13);
        }

        public final long b() {
            String sb3;
            Response response = this.f95776b;
            Intrinsics.f(response);
            int i13 = response.a().f95525c;
            if (i13 != -1) {
                return TimeUnit.SECONDS.toMillis(i13);
            }
            Date date = this.f95777c;
            Date date2 = this.f95781g;
            if (date2 != null) {
                long time = date2.getTime() - (date != null ? date.getTime() : this.f95783i);
                if (time > 0) {
                    return time;
                }
                return 0L;
            }
            Date date3 = this.f95779e;
            if (date3 == null) {
                return 0L;
            }
            List list = response.f95720a.f95700a.f95637g;
            if (list == null) {
                sb3 = null;
            } else {
                StringBuilder sb4 = new StringBuilder();
                HttpUrl.f95629k.getClass();
                HttpUrl.Companion.i(sb4, list);
                sb3 = sb4.toString();
            }
            if (sb3 != null) {
                return 0L;
            }
            long time2 = (date != null ? date.getTime() : this.f95782h) - date3.getTime();
            if (time2 > 0) {
                return time2 / 10;
            }
            return 0L;
        }

        public final boolean d() {
            Response response = this.f95776b;
            Intrinsics.f(response);
            return response.a().f95525c == -1 && this.f95781g == null;
        }
    }

    public CacheStrategy(Request request, Response response) {
        this.f95773a = request;
        this.f95774b = response;
    }
}
