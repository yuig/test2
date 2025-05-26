package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class m72 {

    /* renamed from: a, reason: collision with root package name */
    public final r0 f8119a;

    /* renamed from: b, reason: collision with root package name */
    public l72 f8120b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8121c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f8122d;

    public m72(r0 adConfiguration, l72 fillStatus, long j13, Integer num) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(fillStatus, "fillStatus");
        this.f8119a = adConfiguration;
        this.f8120b = fillStatus;
        this.f8121c = j13;
        this.f8122d = num;
    }

    public final String toString() {
        String str = this.f8119a.f10381n + "." + this.f8120b.a() + "." + zn2.b.e(this.f8121c);
        if (this.f8119a.f10372i0.length() <= 0) {
            return str;
        }
        String D = a.a.D(str, ".", this.f8119a.f10372i0);
        Integer num = this.f8122d;
        if (num == null) {
            return D;
        }
        return D + "." + num;
    }
}
