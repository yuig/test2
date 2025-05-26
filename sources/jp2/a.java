package jp2;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.ExperimentalBidirectionalStream;
import org.chromium.net.impl.CronetBidirectionalStream;
import org.chromium.net.impl.CronetUrlRequestContext;

/* loaded from: classes4.dex */
public final class a extends ExperimentalBidirectionalStream.Builder {

    /* renamed from: a, reason: collision with root package name */
    public final e f77288a;

    /* renamed from: b, reason: collision with root package name */
    public final String f77289b;

    /* renamed from: c, reason: collision with root package name */
    public final BidirectionalStream.Callback f77290c;

    /* renamed from: d, reason: collision with root package name */
    public final Executor f77291d;

    /* renamed from: h, reason: collision with root package name */
    public boolean f77295h;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f77296i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f77297j;

    /* renamed from: k, reason: collision with root package name */
    public int f77298k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f77299l;

    /* renamed from: m, reason: collision with root package name */
    public int f77300m;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f77292e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public String f77293f = "POST";

    /* renamed from: g, reason: collision with root package name */
    public int f77294g = 3;

    /* renamed from: n, reason: collision with root package name */
    public long f77301n = -1;

    public a(String str, BidirectionalStream.Callback callback, Executor executor, e eVar) {
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
        this.f77289b = str;
        this.f77290c = callback;
        this.f77291d = executor;
        this.f77288a = eVar;
    }

    public final void a(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Invalid header name.");
        }
        if (str2 == null) {
            throw new NullPointerException("Invalid header value.");
        }
        this.f77292e.add(new AbstractMap.SimpleImmutableEntry(str, str2));
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final /* bridge */ /* synthetic */ BidirectionalStream.Builder addHeader(String str, String str2) {
        a(str, str2);
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final ExperimentalBidirectionalStream.Builder addRequestAnnotation(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Invalid metrics annotation.");
        }
        if (this.f77296i == null) {
            this.f77296i = new ArrayList();
        }
        this.f77296i.add(obj);
        return this;
    }

    @Override // org.chromium.net.BidirectionalStream.Builder
    public final BidirectionalStream.Builder bindToNetwork(long j13) {
        this.f77301n = j13;
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final ExperimentalBidirectionalStream build() {
        e eVar = this.f77288a;
        String str = this.f77289b;
        BidirectionalStream.Callback callback = this.f77290c;
        Executor executor = this.f77291d;
        String str2 = this.f77293f;
        ArrayList arrayList = this.f77292e;
        int i13 = this.f77294g;
        boolean z13 = this.f77295h;
        ArrayList arrayList2 = this.f77296i;
        boolean z14 = this.f77297j;
        int i14 = this.f77298k;
        boolean z15 = this.f77299l;
        int i15 = this.f77300m;
        long j13 = this.f77301n;
        CronetUrlRequestContext cronetUrlRequestContext = (CronetUrlRequestContext) eVar;
        if (j13 == -1) {
            j13 = cronetUrlRequestContext.f97435u;
        }
        long j14 = j13;
        synchronized (cronetUrlRequestContext.f97415a) {
            try {
                try {
                    cronetUrlRequestContext.a();
                    return new CronetBidirectionalStream(cronetUrlRequestContext, str, i13, callback, executor, str2, arrayList, z13, arrayList2, z14, i14, z15, i15, j14);
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

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final BidirectionalStream.Builder delayRequestHeadersUntilFirstFlush(boolean z13) {
        this.f77295h = z13;
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final BidirectionalStream.Builder setHttpMethod(String str) {
        if (str == null) {
            throw new NullPointerException("Method is required.");
        }
        this.f77293f = str;
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final BidirectionalStream.Builder setPriority(int i13) {
        this.f77294g = i13;
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final BidirectionalStream.Builder setTrafficStatsTag(int i13) {
        this.f77297j = true;
        this.f77298k = i13;
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final BidirectionalStream.Builder setTrafficStatsUid(int i13) {
        this.f77299l = true;
        this.f77300m = i13;
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final /* bridge */ /* synthetic */ ExperimentalBidirectionalStream.Builder addHeader(String str, String str2) {
        a(str, str2);
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final ExperimentalBidirectionalStream.Builder delayRequestHeadersUntilFirstFlush(boolean z13) {
        this.f77295h = z13;
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final ExperimentalBidirectionalStream.Builder setPriority(int i13) {
        this.f77294g = i13;
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final ExperimentalBidirectionalStream.Builder setHttpMethod(String str) {
        if (str != null) {
            this.f77293f = str;
            return this;
        }
        throw new NullPointerException("Method is required.");
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final ExperimentalBidirectionalStream.Builder setTrafficStatsTag(int i13) {
        this.f77297j = true;
        this.f77298k = i13;
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final ExperimentalBidirectionalStream.Builder setTrafficStatsUid(int i13) {
        this.f77299l = true;
        this.f77300m = i13;
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final /* bridge */ /* synthetic */ BidirectionalStream.Builder addRequestAnnotation(Object obj) {
        addRequestAnnotation(obj);
        return this;
    }
}
