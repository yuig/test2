package ads_mobile_sdk;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class sn1 extends s implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f11181a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f11182b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sn1(long j13, boolean z13) {
        super(0);
        this.f11181a = j13;
        this.f11182b = z13;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String invoke() {
        return "Now online at " + zn2.b.o(this.f11181a) + "?: " + this.f11182b;
    }
}
