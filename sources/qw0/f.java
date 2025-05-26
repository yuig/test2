package qw0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class f extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f105274i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j f105275j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(j jVar, int i13) {
        super(0);
        this.f105274i = i13;
        this.f105275j = jVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f105274i;
        j jVar = this.f105275j;
        switch (i13) {
            case 0:
                return Boolean.valueOf(jVar.F3());
            case 1:
                return jVar.f105282d;
            default:
                return jVar.f105297s;
        }
    }
}
