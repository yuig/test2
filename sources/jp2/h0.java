package jp2;

import java.util.concurrent.Executor;
import org.chromium.net.RequestFinishedInfo;

/* loaded from: classes4.dex */
public final class h0 extends RequestFinishedInfo.Listener {

    /* renamed from: a, reason: collision with root package name */
    public final RequestFinishedInfo.Listener f77331a;

    public h0(RequestFinishedInfo.Listener listener) {
        super(listener.getExecutor());
        this.f77331a = listener;
    }

    @Override // org.chromium.net.RequestFinishedInfo.Listener
    public final Executor getExecutor() {
        return this.f77331a.getExecutor();
    }

    @Override // org.chromium.net.RequestFinishedInfo.Listener
    public final void onRequestFinished(RequestFinishedInfo requestFinishedInfo) {
        this.f77331a.onRequestFinished(requestFinishedInfo);
    }
}
