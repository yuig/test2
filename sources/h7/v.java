package h7;

import android.os.ConditionVariable;

/* loaded from: classes.dex */
public final class v extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ConditionVariable f67933a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f67934b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w wVar, ConditionVariable conditionVariable) {
        super("ExoPlayer:SimpleCacheInit");
        this.f67934b = wVar;
        this.f67933a = conditionVariable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        synchronized (this.f67934b) {
            this.f67933a.open();
            w.a(this.f67934b);
            this.f67934b.f67937b.getClass();
        }
    }
}
