package jp2;

import java.util.Date;
import org.chromium.net.RequestFinishedInfo;

/* loaded from: classes2.dex */
public final class m extends RequestFinishedInfo.Metrics {

    /* renamed from: a, reason: collision with root package name */
    public final long f77353a;

    /* renamed from: b, reason: collision with root package name */
    public final long f77354b;

    /* renamed from: c, reason: collision with root package name */
    public final long f77355c;

    /* renamed from: d, reason: collision with root package name */
    public final long f77356d;

    /* renamed from: e, reason: collision with root package name */
    public final long f77357e;

    /* renamed from: f, reason: collision with root package name */
    public final long f77358f;

    /* renamed from: g, reason: collision with root package name */
    public final long f77359g;

    /* renamed from: h, reason: collision with root package name */
    public final long f77360h;

    /* renamed from: i, reason: collision with root package name */
    public final long f77361i;

    /* renamed from: j, reason: collision with root package name */
    public final long f77362j;

    /* renamed from: k, reason: collision with root package name */
    public final long f77363k;

    /* renamed from: l, reason: collision with root package name */
    public final long f77364l;

    /* renamed from: m, reason: collision with root package name */
    public final long f77365m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f77366n;

    /* renamed from: o, reason: collision with root package name */
    public final Long f77367o;

    /* renamed from: p, reason: collision with root package name */
    public final Long f77368p;

    /* renamed from: q, reason: collision with root package name */
    public final Long f77369q;

    /* renamed from: r, reason: collision with root package name */
    public final Long f77370r;

    public m(long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j23, long j24, long j25, long j26, long j27, long j28, boolean z13, long j29, long j33) {
        this.f77353a = j13;
        this.f77354b = j14;
        this.f77355c = j15;
        this.f77356d = j16;
        this.f77357e = j17;
        this.f77358f = j18;
        this.f77359g = j19;
        this.f77360h = j23;
        this.f77361i = j24;
        this.f77362j = j25;
        this.f77363k = j26;
        this.f77364l = j27;
        this.f77365m = j28;
        this.f77366n = z13;
        this.f77369q = Long.valueOf(j29);
        this.f77370r = Long.valueOf(j33);
        if (j13 == -1 || j27 == -1) {
            this.f77367o = null;
        } else {
            this.f77367o = Long.valueOf(j27 - j13);
        }
        if (j13 == -1 || j28 == -1) {
            this.f77368p = null;
        } else {
            this.f77368p = Long.valueOf(j28 - j13);
        }
    }

    public static Date a(long j13) {
        if (j13 != -1) {
            return new Date(j13);
        }
        return null;
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Date getConnectEnd() {
        return a(this.f77357e);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Date getConnectStart() {
        return a(this.f77356d);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Date getDnsEnd() {
        return a(this.f77355c);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Date getDnsStart() {
        return a(this.f77354b);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Date getPushEnd() {
        return a(this.f77363k);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Date getPushStart() {
        return a(this.f77362j);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Long getReceivedByteCount() {
        return this.f77370r;
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Date getRequestEnd() {
        return a(this.f77365m);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Date getRequestStart() {
        return a(this.f77353a);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Date getResponseStart() {
        return a(this.f77364l);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Date getSendingEnd() {
        return a(this.f77361i);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Date getSendingStart() {
        return a(this.f77360h);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Long getSentByteCount() {
        return this.f77369q;
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final boolean getSocketReused() {
        return this.f77366n;
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Date getSslEnd() {
        return a(this.f77359g);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Date getSslStart() {
        return a(this.f77358f);
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Long getTotalTimeMs() {
        return this.f77368p;
    }

    @Override // org.chromium.net.RequestFinishedInfo.Metrics
    public final Long getTtfbMs() {
        return this.f77367o;
    }
}
