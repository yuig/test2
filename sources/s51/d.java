package s51;

import com.pinterest.api.model.f30;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import ek2.f;
import g51.g;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class d extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f111155i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e f111156j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(e eVar, int i13) {
        super(0);
        this.f111155i = i13;
        this.f111156j = eVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f111155i) {
            case 0:
                m254invoke();
                break;
            default:
                m254invoke();
                break;
        }
        return Unit.f80348a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m254invoke() {
        v7 D3;
        int i13 = this.f111155i;
        int i14 = 2;
        e eVar = this.f111156j;
        switch (i13) {
            case 0:
                f30 O = eVar.f111157a.O();
                if (O != null && (D3 = O.D3()) != null) {
                    f i15 = eVar.f111162f.c(D3).i(new fp.a(22, eVar, D3), new g(26, new b(eVar, 2)));
                    Intrinsics.checkNotNullExpressionValue(i15, "subscribe(...)");
                    eVar.clearDisposables();
                    eVar.addDisposable(i15);
                    break;
                }
                break;
            default:
                wy0 U = eVar.f111157a.U();
                if (U != null) {
                    xj2.c o13 = eVar.f111161e.c(U, null).o(new g(22, new b(eVar, 3)), new g(23, new c(eVar, U, i14)));
                    Intrinsics.checkNotNullExpressionValue(o13, "subscribe(...)");
                    eVar.clearDisposables();
                    eVar.addDisposable(o13);
                    break;
                }
                break;
        }
    }
}
