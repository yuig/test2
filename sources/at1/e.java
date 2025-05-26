package at1;

import android.os.Handler;
import androidx.appcompat.app.v;
import com.pinterest.api.model.wy0;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes2.dex */
public final class e implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Handler f20450a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CountDownLatch f20451b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f20452c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j f20453d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f20454e;

    public e(f fVar, Handler handler, CountDownLatch countDownLatch, h hVar, j jVar) {
        this.f20454e = fVar;
        this.f20450a = handler;
        this.f20451b = countDownLatch;
        this.f20452c = hVar;
        this.f20453d = jVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        ((bk.f) this.f20454e.f20455a).getClass();
        wy0 f13 = ((b60.d) com.bumptech.glide.d.E()).f();
        this.f20450a.post(new v(this, 18));
        return f13;
    }
}
