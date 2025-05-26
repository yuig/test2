package androidx.appcompat.widget;

import android.graphics.Typeface;
import android.widget.TextView;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes.dex */
public final class m0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16642a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16643b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f16644c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f16645d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f16646e;

    public /* synthetic */ m0(Object obj, Object obj2, Object obj3, int i13, int i14) {
        this.f16642a = i14;
        this.f16646e = obj;
        this.f16644c = obj2;
        this.f16645d = obj3;
        this.f16643b = i13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f16642a;
        Object obj = this.f16645d;
        Object obj2 = this.f16644c;
        switch (i13) {
            case 0:
                ((TextView) obj2).setTypeface((Typeface) obj, this.f16643b);
                break;
            default:
                try {
                    ((CountDownLatch) obj2).await();
                } catch (InterruptedException unused) {
                    ((at1.h) obj).onResourcesError("Fatal error! InterruptedException caught while waiting for resources creation to finish");
                }
                ((at1.i) this.f16646e).f20460b.post(new androidx.appcompat.app.v(this, 17));
                break;
        }
    }
}
