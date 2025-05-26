package ads_mobile_sdk;

import android.net.Network;
import android.net.NetworkCapabilities;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class kn1 extends s implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f7413a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Network f7414b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ NetworkCapabilities f7415c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kn1(long j13, Network network, NetworkCapabilities networkCapabilities) {
        super(0);
        this.f7413a = j13;
        this.f7414b = network;
        this.f7415c = networkCapabilities;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String invoke() {
        return "Network capabilities changed at " + zn2.b.o(this.f7413a) + ": " + this.f7414b + " " + this.f7415c;
    }
}
