package jp2;

import android.util.Log;
import android.util.Pair;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UrlRequest;
import org.chromium.net.impl.CronetUploadDataStream;
import org.chromium.net.impl.CronetUrlRequest;
import org.chromium.net.impl.CronetUrlRequestContext;

/* loaded from: classes2.dex */
public final class z extends ExperimentalUrlRequest.Builder {

    /* renamed from: a, reason: collision with root package name */
    public final e f77393a;

    /* renamed from: b, reason: collision with root package name */
    public final String f77394b;

    /* renamed from: c, reason: collision with root package name */
    public final UrlRequest.Callback f77395c;

    /* renamed from: d, reason: collision with root package name */
    public final Executor f77396d;

    /* renamed from: e, reason: collision with root package name */
    public String f77397e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f77399g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f77400h;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f77402j;

    /* renamed from: k, reason: collision with root package name */
    public UploadDataProvider f77403k;

    /* renamed from: l, reason: collision with root package name */
    public Executor f77404l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f77405m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f77406n;

    /* renamed from: o, reason: collision with root package name */
    public int f77407o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f77408p;

    /* renamed from: q, reason: collision with root package name */
    public int f77409q;

    /* renamed from: r, reason: collision with root package name */
    public RequestFinishedInfo.Listener f77410r;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f77398f = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public int f77401i = 3;

    /* renamed from: s, reason: collision with root package name */
    public long f77411s = -1;

    /* renamed from: t, reason: collision with root package name */
    public int f77412t = 0;

    public z(String str, UrlRequest.Callback callback, Executor executor, e eVar) {
        if (str == null) {
            throw new NullPointerException("URL is required.");
        }
        if (callback == null) {
            throw new NullPointerException("Callback is required.");
        }
        if (executor == null) {
            throw new NullPointerException("Executor is required.");
        }
        if (eVar == null) {
            throw new NullPointerException("CronetEngine is required.");
        }
        this.f77394b = str;
        this.f77395c = callback;
        this.f77396d = executor;
        this.f77393a = eVar;
    }

    public final void a(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Invalid header name.");
        }
        if (str2 == null) {
            throw new NullPointerException("Invalid header value.");
        }
        if ("Accept-Encoding".equalsIgnoreCase(str)) {
            Log.w("z", "It's not necessary to set Accept-Encoding on requests - cronet will do this automatically for you, and setting it yourself has no effect. See https://crbug.com/581399 for details.", new Exception());
        } else {
            this.f77398f.add(Pair.create(str, str2));
        }
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final /* bridge */ /* synthetic */ ExperimentalUrlRequest.Builder addHeader(String str, String str2) {
        a(str, str2);
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final ExperimentalUrlRequest.Builder addRequestAnnotation(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Invalid metrics annotation.");
        }
        if (this.f77402j == null) {
            this.f77402j = new ArrayList();
        }
        this.f77402j.add(obj);
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final ExperimentalUrlRequest.Builder allowDirectExecutor() {
        this.f77405m = true;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final CronetUrlRequest build() {
        CronetUrlRequest cronetUrlRequest;
        e eVar = this.f77393a;
        String str = this.f77394b;
        UrlRequest.Callback callback = this.f77395c;
        Executor executor = this.f77396d;
        int i13 = this.f77401i;
        ArrayList arrayList = this.f77402j;
        boolean z13 = this.f77399g;
        boolean z14 = this.f77400h;
        boolean z15 = this.f77405m;
        boolean z16 = this.f77406n;
        int i14 = this.f77407o;
        boolean z17 = this.f77408p;
        int i15 = this.f77409q;
        RequestFinishedInfo.Listener listener = this.f77410r;
        int i16 = this.f77412t;
        long j13 = this.f77411s;
        CronetUrlRequestContext cronetUrlRequestContext = (CronetUrlRequestContext) eVar;
        if (j13 == -1) {
            j13 = cronetUrlRequestContext.f97435u;
        }
        long j14 = j13;
        synchronized (cronetUrlRequestContext.f97415a) {
            try {
                try {
                    cronetUrlRequestContext.a();
                    CronetUrlRequest cronetUrlRequest2 = new CronetUrlRequest(cronetUrlRequestContext, str, i13, callback, executor, arrayList, z13, z14, z15, z16, i14, z17, i15, listener, i16, j14);
                    String str2 = this.f77397e;
                    if (str2 != null) {
                        cronetUrlRequest2.e();
                        cronetUrlRequest = cronetUrlRequest2;
                        cronetUrlRequest.f97401n = str2;
                    } else {
                        cronetUrlRequest = cronetUrlRequest2;
                    }
                    Iterator it = this.f77398f.iterator();
                    while (it.hasNext()) {
                        Pair pair = (Pair) it.next();
                        String str3 = (String) pair.first;
                        String str4 = (String) pair.second;
                        cronetUrlRequest.e();
                        Objects.requireNonNull(str3, "Invalid header name.");
                        Objects.requireNonNull(str4, "Invalid header value.");
                        cronetUrlRequest.f97402o.add(new AbstractMap.SimpleImmutableEntry(str3, str4));
                    }
                    UploadDataProvider uploadDataProvider = this.f77403k;
                    if (uploadDataProvider != null) {
                        Executor executor2 = this.f77404l;
                        if (cronetUrlRequest.f97401n == null) {
                            cronetUrlRequest.f97401n = "POST";
                        }
                        cronetUrlRequest.f97413z = new CronetUploadDataStream(uploadDataProvider, executor2, cronetUrlRequest);
                    }
                    return cronetUrlRequest;
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                throw th;
            }
        }
    }

    @Override // org.chromium.net.UrlRequest.Builder
    public final UrlRequest.Builder bindToNetwork(long j13) {
        this.f77411s = j13;
        return this;
    }

    public final void c(UploadDataProvider uploadDataProvider, Executor executor) {
        if (uploadDataProvider == null) {
            throw new NullPointerException("Invalid UploadDataProvider.");
        }
        if (executor == null) {
            throw new NullPointerException("Invalid UploadDataProvider Executor.");
        }
        if (this.f77397e == null) {
            this.f77397e = "POST";
        }
        this.f77403k = uploadDataProvider;
        this.f77404l = executor;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final ExperimentalUrlRequest.Builder disableCache() {
        this.f77399g = true;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder
    public final ExperimentalUrlRequest.Builder disableConnectionMigration() {
        this.f77400h = true;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final ExperimentalUrlRequest.Builder setHttpMethod(String str) {
        if (str == null) {
            throw new NullPointerException("Method is required.");
        }
        this.f77397e = str;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder
    public final ExperimentalUrlRequest.Builder setIdempotency(int i13) {
        this.f77412t = i13;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final ExperimentalUrlRequest.Builder setPriority(int i13) {
        this.f77401i = i13;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final ExperimentalUrlRequest.Builder setRequestFinishedListener(RequestFinishedInfo.Listener listener) {
        this.f77410r = listener;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final ExperimentalUrlRequest.Builder setTrafficStatsTag(int i13) {
        this.f77406n = true;
        this.f77407o = i13;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final ExperimentalUrlRequest.Builder setTrafficStatsUid(int i13) {
        this.f77408p = true;
        this.f77409q = i13;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final /* bridge */ /* synthetic */ ExperimentalUrlRequest.Builder setUploadDataProvider(UploadDataProvider uploadDataProvider, Executor executor) {
        c(uploadDataProvider, executor);
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final /* bridge */ /* synthetic */ UrlRequest.Builder addHeader(String str, String str2) {
        a(str, str2);
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final UrlRequest.Builder setPriority(int i13) {
        this.f77401i = i13;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final UrlRequest.Builder setRequestFinishedListener(RequestFinishedInfo.Listener listener) {
        this.f77410r = listener;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final /* bridge */ /* synthetic */ UrlRequest.Builder setUploadDataProvider(UploadDataProvider uploadDataProvider, Executor executor) {
        c(uploadDataProvider, executor);
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final UrlRequest.Builder allowDirectExecutor() {
        this.f77405m = true;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final UrlRequest.Builder disableCache() {
        this.f77399g = true;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final /* bridge */ /* synthetic */ UrlRequest.Builder setHttpMethod(String str) {
        setHttpMethod(str);
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final UrlRequest.Builder setTrafficStatsTag(int i13) {
        this.f77406n = true;
        this.f77407o = i13;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final UrlRequest.Builder setTrafficStatsUid(int i13) {
        this.f77408p = true;
        this.f77409q = i13;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final UrlRequest.Builder addRequestAnnotation(Object obj) {
        if (obj != null) {
            if (this.f77402j == null) {
                this.f77402j = new ArrayList();
            }
            this.f77402j.add(obj);
            return this;
        }
        throw new NullPointerException("Invalid metrics annotation.");
    }
}
