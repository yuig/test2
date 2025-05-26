package xe1;

import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class a0 extends oa2.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f134673e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Function0 f134674f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(Function0 function0, ld1.f fVar, t90.n nVar) {
        super(fVar, nVar, (oa2.m) null, 12);
        this.f134674f = function0;
    }

    @Override // oa2.c, oa2.l
    public final void k() {
        int i13 = this.f134673e;
        Function0 function0 = this.f134674f;
        switch (i13) {
            case 0:
                if (function0 != null) {
                    function0.invoke();
                    break;
                }
                break;
            default:
                if (function0 != null) {
                    function0.invoke();
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(Function0 function0, ld1.f fVar, t90.n nVar, int i13) {
        super(fVar, nVar, (oa2.m) null, 12);
        this.f134674f = function0;
    }
}
