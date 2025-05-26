package qr;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import so.oa;

/* loaded from: classes3.dex */
public final class b extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f104892i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f104893j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(d dVar, int i13) {
        super(0);
        this.f104892i = i13;
        this.f104893j = dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f104892i;
        d dVar = this.f104893j;
        switch (i13) {
            case 0:
                return ((oa) ((a) dVar.f104901g.getValue())).l2();
            default:
                return ((oa) ((a) dVar.f104901g.getValue())).q2();
        }
    }
}
