package ha;

import android.content.Context;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f68339a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f68340b;

    public /* synthetic */ g(Context context, int i13) {
        this.f68339a = i13;
        this.f68340b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f68339a;
        Context context = this.f68340b;
        switch (i13) {
            case 0:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new g(context, 1));
                break;
            default:
                e.d(context, new o.a(6), e.f68336a, false);
                break;
        }
    }
}
