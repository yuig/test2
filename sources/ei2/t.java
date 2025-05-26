package ei2;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class t extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f59034i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ u f59035j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f59036k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(u uVar, String str, int i13) {
        super(0);
        this.f59034i = i13;
        this.f59035j = uVar;
        this.f59036k = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        q qVar;
        int i13 = this.f59034i;
        String str = this.f59036k;
        u uVar = this.f59035j;
        switch (i13) {
            case 0:
                q qVar2 = (q) uVar.f59037a.get(str);
                return qVar2 == null ? (q) uVar.f59038b.get(str) : qVar2;
            default:
                q qVar3 = (q) uVar.f59037a.get(str);
                if (qVar3 == null) {
                    return null;
                }
                if (!(!((k) qVar3).b())) {
                    qVar3 = null;
                }
                if (qVar3 == null || (qVar = (q) uVar.f59037a.remove(str)) == null) {
                    return null;
                }
                uVar.f59038b.put(str, qVar);
                return Unit.f80348a;
        }
    }
}
