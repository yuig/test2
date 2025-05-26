package oc1;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class b extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f94053i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c f94054j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ nc1.c f94055k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(c cVar, nc1.c cVar2, int i13) {
        super(0);
        this.f94053i = i13;
        this.f94054j = cVar;
        this.f94055k = cVar2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        nc1.c cVar = this.f94055k;
        c cVar2 = this.f94054j;
        int i13 = this.f94053i;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        c.t3(this.f94054j, this.f94055k, true, null, false, 12);
                        break;
                    default:
                        cVar2.v3(cVar, false);
                        break;
                }
                break;
            default:
                switch (i13) {
                    case 0:
                        c.t3(this.f94054j, this.f94055k, true, null, false, 12);
                        break;
                    default:
                        cVar2.v3(cVar, false);
                        break;
                }
                break;
        }
        return Unit.f80348a;
    }
}
