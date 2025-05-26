package ads_mobile_sdk;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class qn1 extends s implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f10185a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f10186b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qn1(long j13, boolean z13) {
        super(0);
        this.f10185a = j13;
        this.f10186b = z13;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String invoke() {
        return "Previously online at " + zn2.b.o(this.f10185a) + "?: " + this.f10186b;
    }
}
