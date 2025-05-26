package uu1;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.net.RequestFinishedInfo;

/* loaded from: classes4.dex */
public final class a extends RequestFinishedInfo.Listener {

    /* renamed from: a, reason: collision with root package name */
    public final List f123142a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(List listeners, Executor executor) {
        super(executor);
        Intrinsics.checkNotNullParameter(listeners, "listeners");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f123142a = listeners;
    }

    @Override // org.chromium.net.RequestFinishedInfo.Listener
    public final void onRequestFinished(RequestFinishedInfo requestFinishedInfo) {
        if (requestFinishedInfo == null) {
            return;
        }
        Iterator it = this.f123142a.iterator();
        while (it.hasNext()) {
            ((c) it.next()).a(requestFinishedInfo);
        }
    }
}
