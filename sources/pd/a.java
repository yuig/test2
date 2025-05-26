package pd;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final class a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f99624a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a() {
        this(1);
        this.f99624a = 1;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f99624a) {
            case 0:
                return new Thread(new lb.x(3, this, runnable), "glide-active-resources");
            case 1:
                return new sd.a(runnable);
            default:
                return new Thread(runnable, "SplitCompatBackgroundThread");
        }
    }

    public /* synthetic */ a(int i13) {
        this.f99624a = i13;
    }
}
