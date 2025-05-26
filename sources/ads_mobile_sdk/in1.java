package ads_mobile_sdk;

import android.net.Network;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class in1 extends s implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f6501a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Network f6502b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public in1(long j13, Network network) {
        super(0);
        this.f6501a = j13;
        this.f6502b = network;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String invoke() {
        return "Network available at " + zn2.b.o(this.f6501a) + ": " + this.f6502b;
    }
}
