package co2;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* loaded from: classes4.dex */
public final /* synthetic */ class j extends kotlin.jvm.internal.p implements kl2.l {

    /* renamed from: a, reason: collision with root package name */
    public static final j f28305a = new j();

    public j() {
        super(3, m.class, "processResultSelectReceiveCatching", "processResultSelectReceiveCatching(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }

    @Override // kl2.l
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        m mVar = (m) obj;
        AtomicLongFieldUpdater atomicLongFieldUpdater = m.f28312d;
        mVar.getClass();
        if (obj3 == o.f28336l) {
            obj3 = new r(mVar.A());
        }
        return new t(obj3);
    }
}
