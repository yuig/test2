package m4;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes3.dex */
public final class n extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f85804i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ o f85805j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(o oVar, int i13) {
        super(0);
        this.f85804i = i13;
        this.f85805j = oVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f85804i;
        o oVar = this.f85805j;
        switch (i13) {
            case 0:
                return Float.valueOf(oVar.a());
            default:
                return oVar;
        }
    }
}
