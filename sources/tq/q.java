package tq;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class q extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f118923i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ r f118924j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(r rVar, int i13) {
        super(0);
        this.f118923i = i13;
        this.f118924j = rVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        int i13 = this.f118923i;
        r rVar = this.f118924j;
        switch (i13) {
            case 0:
                return Boolean.valueOf(rVar.f118926d);
            case 1:
                return Boolean.valueOf(rVar.f118928f);
            default:
                return Boolean.valueOf(rVar.f118927e);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f118923i) {
        }
        return invoke();
    }
}
