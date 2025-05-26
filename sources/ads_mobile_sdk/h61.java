package ads_mobile_sdk;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class h61 {

    /* renamed from: a, reason: collision with root package name */
    public Object f5863a;

    public final Object a() {
        return a("The backing field has not yet been initialized.");
    }

    public final Object a(String uninitializedMessage) {
        Object obj;
        Intrinsics.checkNotNullParameter(uninitializedMessage, "uninitializedMessage");
        synchronized (this) {
            obj = this.f5863a;
            if (obj == null) {
                throw new IllegalStateException(uninitializedMessage.toString());
            }
        }
        return obj;
    }

    public final void a(Object t13) {
        Intrinsics.checkNotNullParameter(t13, "t");
        synchronized (this) {
            this.f5863a = t13;
            Unit unit = Unit.f80348a;
        }
    }
}
