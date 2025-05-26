package di2;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class h extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ j f55083i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f55084j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f55085k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, long j13, boolean z13) {
        super(0);
        this.f55083i = jVar;
        this.f55084j = j13;
        this.f55085k = z13;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.f55083i.f55089a.d(bi2.f.FOREGROUND, this.f55084j, this.f55085k);
    }
}
