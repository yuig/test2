package jp2;

import java.util.Collection;
import java.util.Collections;
import org.chromium.net.CronetException;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UrlResponseInfo;

/* loaded from: classes2.dex */
public final class x extends RequestFinishedInfo {

    /* renamed from: a, reason: collision with root package name */
    public final String f77387a;

    /* renamed from: b, reason: collision with root package name */
    public final Collection f77388b;

    /* renamed from: c, reason: collision with root package name */
    public final RequestFinishedInfo.Metrics f77389c;

    /* renamed from: d, reason: collision with root package name */
    public final int f77390d;

    /* renamed from: e, reason: collision with root package name */
    public final UrlResponseInfo f77391e;

    /* renamed from: f, reason: collision with root package name */
    public final CronetException f77392f;

    public x(String str, Collection collection, m mVar, int i13, b0 b0Var, CronetException cronetException) {
        this.f77387a = str;
        this.f77388b = collection;
        this.f77389c = mVar;
        this.f77390d = i13;
        this.f77391e = b0Var;
        this.f77392f = cronetException;
    }

    @Override // org.chromium.net.RequestFinishedInfo
    public final Collection getAnnotations() {
        Collection collection = this.f77388b;
        return collection == null ? Collections.emptyList() : collection;
    }

    @Override // org.chromium.net.RequestFinishedInfo
    public final CronetException getException() {
        return this.f77392f;
    }

    @Override // org.chromium.net.RequestFinishedInfo
    public final int getFinishedReason() {
        return this.f77390d;
    }

    @Override // org.chromium.net.RequestFinishedInfo
    public final RequestFinishedInfo.Metrics getMetrics() {
        return this.f77389c;
    }

    @Override // org.chromium.net.RequestFinishedInfo
    public final UrlResponseInfo getResponseInfo() {
        return this.f77391e;
    }

    @Override // org.chromium.net.RequestFinishedInfo
    public final String getUrl() {
        return this.f77387a;
    }
}
