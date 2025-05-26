package yd;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import android.os.Handler;
import android.os.Message;

/* loaded from: classes3.dex */
public final class g implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f138729a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f138730b;

    public /* synthetic */ g(Object obj, int i13) {
        this.f138729a = i13;
        this.f138730b = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f138729a) {
            case 0:
                int i13 = message.what;
                Object obj = this.f138730b;
                if (i13 == 1) {
                    ((h) obj).k((e) message.obj);
                    return true;
                }
                if (i13 != 2) {
                    return false;
                }
                ((h) obj).f138734d.e((e) message.obj);
                return false;
            default:
                if (message.what != 0) {
                    return false;
                }
                m.h hVar = (m.h) this.f138730b;
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(message.obj);
                synchronized (hVar.f85197b) {
                    ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(hVar.f85199d);
                    throw null;
                }
        }
    }
}
