package ct0;

import android.app.Application;
import ao2.j0;
import com.pinterest.api.model.zs;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import so.nb;
import so.qb;
import so.rb;

/* loaded from: classes5.dex */
public final class p extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f53164i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ s f53165j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(s sVar, int i13) {
        super(1);
        this.f53164i = i13;
        this.f53165j = sVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f53164i;
        s sVar = this.f53165j;
        switch (i13) {
            case 0:
                zs interest = (zs) obj;
                Intrinsics.checkNotNullParameter(interest, "interest");
                int i14 = s.S0;
                kh2.j.x2(sVar.k9(), new j(interest));
                return Unit.f80348a;
            default:
                nb factory = (nb) obj;
                Intrinsics.checkNotNullParameter(factory, "factory");
                int i15 = s.S0;
                sVar.getClass();
                boolean G = com.bumptech.glide.d.G(sVar, "HOMEFEED_TUNER_EXTRAS_KEY_ADD_TOPICS", false);
                qb qbVar = factory.f113570a;
                u12.e eVar = (u12.e) qbVar.f114076a.f113854p4.get();
                Application h10 = com.pinterest.widget.configuration.k.h(qbVar.f114076a.f113603b);
                rb rbVar = qbVar.f114078c;
                return new a0(eVar, h10, (j0) rbVar.f114104c.get(), rbVar.C2(), G);
        }
    }
}
