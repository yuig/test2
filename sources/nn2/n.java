package nn2;

import java.util.Set;
import kotlin.collections.i1;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class n extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f91614i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p f91615j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ q f91616k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(p pVar, q qVar, int i13) {
        super(0);
        this.f91614i = i13;
        this.f91615j = pVar;
        this.f91616k = qVar;
    }

    public final Set b() {
        int i13 = this.f91614i;
        q qVar = this.f91616k;
        p pVar = this.f91615j;
        switch (i13) {
            case 0:
                return i1.i(pVar.f91620a.keySet(), qVar.o());
            default:
                return i1.i(pVar.f91621b.keySet(), qVar.p());
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f91614i) {
        }
        return b();
    }
}
