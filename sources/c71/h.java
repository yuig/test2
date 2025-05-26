package c71;

import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class h extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f26770i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ m f26771j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(m mVar, int i13) {
        super(0);
        this.f26770i = i13;
        this.f26771j = mVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        m mVar = this.f26771j;
        int i13 = this.f26770i;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        return Boolean.valueOf(mVar.f26793g.h());
                    default:
                        return Boolean.valueOf(ph.a.w0(mVar.f26799m));
                }
            case 1:
                switch (i13) {
                    case 0:
                        return Boolean.valueOf(mVar.f26793g.h());
                    default:
                        return Boolean.valueOf(ph.a.w0(mVar.f26799m));
                }
            default:
                return mVar.f26808v;
        }
    }
}
