package br0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class e extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f23743i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ha2.c f23744j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ ha2.g f23745k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(ha2.c cVar, ha2.g gVar, int i13) {
        super(0);
        this.f23743i = i13;
        this.f23744j = cVar;
        this.f23745k = gVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f23743i) {
            case 0:
                m76invoke();
                break;
            default:
                m76invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m76invoke() {
        int i13 = this.f23743i;
        ha2.g gVar = this.f23745k;
        ha2.c cVar = this.f23744j;
        switch (i13) {
            case 0:
                cVar.f().invoke(Integer.valueOf(gVar.getIndex()));
                break;
            default:
                cVar.f().invoke(Integer.valueOf(gVar.getIndex()));
                break;
        }
    }
}
