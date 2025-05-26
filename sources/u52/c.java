package u52;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class c extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f120672i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l f120673j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(l lVar, int i13) {
        super(0);
        this.f120672i = i13;
        this.f120673j = lVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f120672i) {
            case 0:
                m266invoke();
                break;
            case 1:
                m266invoke();
                break;
            case 2:
                m266invoke();
                break;
            default:
                m266invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m266invoke() {
        int i13 = this.f120672i;
        l lVar = this.f120673j;
        switch (i13) {
            case 0:
                int i14 = l.f120709l0;
                kh2.j.x2(lVar.d8(), a0.f120659a);
                break;
            case 1:
                int i15 = l.f120709l0;
                kh2.j.x2(lVar.d8(), f0.f120692a);
                break;
            case 2:
                int i16 = l.f120709l0;
                kh2.j.x2(lVar.d8(), e0.f120682a);
                break;
            default:
                int i17 = l.f120709l0;
                kh2.j.x2(lVar.d8(), g0.f120695a);
                break;
        }
    }
}
