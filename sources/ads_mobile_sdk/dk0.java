package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class dk0 extends Exception implements a.jf {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f4322a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dk0(Throwable wrappedException) {
        super(wrappedException);
        Intrinsics.checkNotNullParameter(wrappedException, "wrappedException");
        this.f4322a = wrappedException;
    }

    @Override // a.jf
    public final Throwable a() {
        return this.f4322a;
    }
}
