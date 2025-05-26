package xd1;

import android.view.View;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import kotlin.text.e0;
import rl1.q;
import rl1.r;

/* loaded from: classes5.dex */
public final class d extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f134628i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ yd1.a f134629j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(yd1.a aVar, int i13) {
        super(1);
        this.f134628i = i13;
        this.f134629j = aVar;
    }

    public final q b(q it) {
        String ch3;
        int i13 = this.f134628i;
        yd1.a aVar = this.f134629j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                String str = aVar.f138780a;
                Character A = e0.A(aVar.f138781b);
                ch3 = A != null ? A.toString() : null;
                return q.e(it, str, ch3 != null ? ch3 : "", false, r.LG, null, false, false, fm1.c.VISIBLE, 0, new rl1.d(aVar.f138782c), null, 1396);
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                rl1.d dVar = new rl1.d(aVar.f138782c);
                Character A2 = e0.A(aVar.f138781b);
                ch3 = A2 != null ? A2.toString() : null;
                return q.e(it, aVar.f138780a, ch3 != null ? ch3 : "", false, null, null, aVar.f138785f, false, fm1.c.VISIBLE, 0, dVar, null, 1372);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                int generateViewId = View.generateViewId();
                String str2 = aVar.f138780a;
                Character A3 = e0.A(aVar.f138781b);
                ch3 = A3 != null ? A3.toString() : null;
                return q.e(it, str2, ch3 != null ? ch3 : "", false, r.LG, null, false, false, null, generateViewId, new rl1.d(aVar.f138782c), null, 1268);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f134628i) {
        }
        return b((q) obj);
    }
}
