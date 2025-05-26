package o71;

import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class l extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f93329i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ m f93330j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(m mVar, int i13) {
        super(0);
        this.f93329i = i13;
        this.f93330j = mVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f93329i;
        m mVar = this.f93330j;
        switch (i13) {
            case 0:
                mVar.getClass();
                return new m71.a(x92.c.f134368a);
            default:
                return new l0(mVar.f93334b, mVar.f93343k);
        }
    }
}
