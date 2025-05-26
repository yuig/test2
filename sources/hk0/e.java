package hk0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class e extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f69304i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j f69305j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(j jVar, int i13) {
        super(0);
        this.f69304i = i13;
        this.f69305j = jVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f69304i) {
            case 0:
                m150invoke();
                break;
            case 1:
                m150invoke();
                break;
            default:
                m150invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m150invoke() {
        int i13 = this.f69304i;
        j jVar = this.f69305j;
        switch (i13) {
            case 0:
                jVar.k();
                break;
            case 1:
                jVar.i();
                jVar.c(false);
                jVar.l();
                break;
            default:
                jVar.l();
                break;
        }
    }
}
