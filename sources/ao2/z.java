package ao2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes2.dex */
public class z {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f20241b = AtomicIntegerFieldUpdater.newUpdater(z.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f20242a;

    public z(boolean z13, Throwable th3) {
        this.f20242a = th3;
        this._handled$volatile = z13 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f20242a + ']';
    }
}
