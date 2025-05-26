package n60;

import kotlin.jvm.functions.Function0;
import lb.l0;
import so.oa;

/* loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f89255i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j f89256j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(j jVar, int i13) {
        super(0);
        this.f89255i = i13;
        this.f89256j = jVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f89255i;
        j jVar = this.f89256j;
        switch (i13) {
            case 0:
                return (p) l0.k0(jVar.f89259a, p.class);
            default:
                return bf2.b.a(((oa) ((p) jVar.f89264f.getValue())).F9);
        }
    }
}
