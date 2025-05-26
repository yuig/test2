package mk2;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes2.dex */
public final class q extends uj2.a0 {

    /* renamed from: d, reason: collision with root package name */
    public static final t f87413d = new t("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())), false);

    /* renamed from: c, reason: collision with root package name */
    public final ThreadFactory f87414c = f87413d;

    @Override // uj2.a0
    public final uj2.z a() {
        return new r(this.f87414c);
    }
}
