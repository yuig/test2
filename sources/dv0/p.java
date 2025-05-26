package dv0;

import com.pinterest.api.model.rp;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class p extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f56377i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q f56378j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f56379k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(q qVar, String str, int i13) {
        super(1);
        this.f56377i = i13;
        this.f56378j = qVar;
        this.f56379k = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f56377i;
        String str = this.f56379k;
        q qVar = this.f56378j;
        switch (i13) {
            case 0:
                tt1.a aVar = (tt1.a) obj;
                String blockReason = ((rp) aVar.c()).getBlockReason();
                if (blockReason == null || blockReason.length() == 0) {
                    ((HashMap) qVar.f56384e).put(str, new Pair(Boolean.TRUE, null));
                    ev0.s sVar = (ev0.s) qVar.f56381b;
                    int i14 = ev0.s.f60273l;
                    sVar.X(str, null, true);
                } else {
                    ((HashMap) qVar.f56384e).put(str, new Pair(Boolean.FALSE, ((rp) aVar.c()).getBlockReason()));
                    ((ev0.s) qVar.f56381b).X(str, ((rp) aVar.c()).getBlockReason(), false);
                }
                break;
            default:
                ((HashMap) qVar.f56384e).put(str, new Pair(Boolean.TRUE, null));
                ev0.s sVar2 = (ev0.s) qVar.f56381b;
                int i15 = ev0.s.f60273l;
                sVar2.X(str, null, true);
                break;
        }
        return Unit.f80348a;
    }
}
