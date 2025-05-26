package n60;

import kotlin.jvm.functions.Function0;
import lb.l0;
import so.oa;

/* loaded from: classes.dex */
public final class l extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f89268i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ m f89269j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(m mVar, int i13) {
        super(0);
        this.f89268i = i13;
        this.f89269j = mVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f89268i;
        m mVar = this.f89269j;
        switch (i13) {
            case 0:
                return (p) l0.k0(mVar.f89270a, p.class);
            default:
                return bf2.b.a(((oa) ((p) mVar.f89274e.getValue())).F9);
        }
    }
}
