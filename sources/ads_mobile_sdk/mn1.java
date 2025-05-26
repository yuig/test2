package ads_mobile_sdk;

import android.net.Network;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class mn1 extends s implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f8299a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Network f8300b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mn1(long j13, Network network) {
        super(0);
        this.f8299a = j13;
        this.f8300b = network;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String invoke() {
        return "Network lost at " + zn2.b.o(this.f8299a) + ": " + this.f8300b;
    }
}
