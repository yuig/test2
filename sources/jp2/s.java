package jp2;

import android.util.Log;
import java.util.HashSet;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.impl.CronetUrlRequest;
import org.chromium.net.impl.CronetUrlRequestContext;

/* loaded from: classes4.dex */
public final class s implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f77380a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RequestFinishedInfo f77381b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f77382c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f77383d;

    public s(CronetUrlRequestContext cronetUrlRequestContext, h0 h0Var, x xVar) {
        this.f77383d = cronetUrlRequestContext;
        this.f77382c = h0Var;
        this.f77381b = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f77380a;
        RequestFinishedInfo requestFinishedInfo = this.f77381b;
        Object obj = this.f77382c;
        switch (i13) {
            case 0:
                ((h0) obj).onRequestFinished(requestFinishedInfo);
                return;
            default:
                try {
                    try {
                        ((CronetUrlRequest) this.f77383d).f97410w.onRequestFinished(requestFinishedInfo);
                    } catch (Exception e13) {
                        HashSet hashSet = CronetUrlRequestContext.f97414w;
                        Log.e("cr_CronetUrlRequestContext", "Exception thrown from request finished listener", e13);
                    }
                    return;
                } finally {
                    ((w) obj).a();
                }
        }
    }

    public s(CronetUrlRequest cronetUrlRequest, x xVar, w wVar) {
        this.f77383d = cronetUrlRequest;
        this.f77381b = xVar;
        this.f77382c = wVar;
    }
}
