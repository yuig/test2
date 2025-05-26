package tu1;

import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class h extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f119378i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i f119379j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(i iVar, int i13) {
        super(0);
        this.f119378i = i13;
        this.f119379j = iVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        i iVar = this.f119379j;
        int i13 = this.f119378i;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        return Boolean.valueOf(((Number) iVar.f119386f.getValue()).intValue() != -1);
                    default:
                        return Boolean.valueOf(iVar.f119382b.c(null, false, 0));
                }
            default:
                switch (i13) {
                    case 0:
                        return Boolean.valueOf(((Number) iVar.f119386f.getValue()).intValue() != -1);
                    default:
                        return Boolean.valueOf(iVar.f119382b.c(null, false, 0));
                }
        }
    }
}
