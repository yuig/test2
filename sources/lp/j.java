package lp;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes3.dex */
public final class j extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f84221i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ jc0.n f84222j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(jc0.n nVar, int i13) {
        super(0);
        this.f84221i = i13;
        this.f84222j = nVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f84221i) {
            case 0:
                m180invoke();
                break;
            case 1:
                m180invoke();
                break;
            case 2:
                m180invoke();
                break;
            default:
                m180invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m180invoke() {
        int i13 = this.f84221i;
        jc0.n nVar = this.f84222j;
        switch (i13) {
            case 0:
                a.c.y(nVar.z());
                break;
            case 1:
                a.c.y(nVar.z());
                break;
            case 2:
                a.c.y(nVar.z());
                break;
            default:
                a.c.y(nVar.z());
                break;
        }
    }
}
