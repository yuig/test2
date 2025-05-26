package dg2;

import ei2.q;
import ei2.v;
import kh2.s0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import xf2.o0;

/* loaded from: classes4.dex */
public final class k extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f54964i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l f54965j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f54966k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(l lVar, String str, int i13) {
        super(1);
        this.f54964i = i13;
        this.f54965j = lVar;
        this.f54966k = str;
    }

    public final void b(v captureSpanData) {
        int i13 = this.f54964i;
        String str = this.f54966k;
        l lVar = this.f54965j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(captureSpanData, "$this$captureSpanData");
                oi2.b bVar = (oi2.b) dl2.b.u(lVar.f54968e).remove(str);
                if (bVar != null) {
                    ((ei2.k) bVar).s(null, null);
                    return;
                }
                return;
            default:
                Intrinsics.checkNotNullParameter(captureSpanData, "$this$captureSpanData");
                oi2.b bVar2 = (oi2.b) lVar.f54968e.get(str);
                if (bVar2 != null) {
                    ((ei2.k) bVar2).s(null, null);
                }
                if (str == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                q T0 = s0.T0(captureSpanData, new o0(str), lVar.f54967d.now());
                if (T0 != null) {
                    lVar.f54968e.put(str, T0);
                    return;
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f54964i) {
            case 0:
                b((v) obj);
                break;
            default:
                b((v) obj);
                break;
        }
        return Unit.f80348a;
    }
}
