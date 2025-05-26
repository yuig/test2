package kh2;

import io.embrace.android.embracesdk.internal.payload.UserInfo;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class c2 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f79452i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ o0 f79453j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c2(o0 o0Var, int i13) {
        super(0);
        this.f79452i = i13;
        this.f79453j = o0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = 2;
        int i14 = this.f79452i;
        o0 o0Var = this.f79453j;
        switch (i14) {
            case 0:
                return ((r0) o0Var).a();
            case 1:
                return ((r0) o0Var).c();
            case 2:
                r0 r0Var = (r0) o0Var;
                r0Var.getClass();
                return UserInfo.a(((mg2.a) ((mg2.b) r0Var.f79673e.a(r0Var, r0.f79668m[2]))).f(), null, null, null, null, 15);
            default:
                try {
                    c0.d.M2("metadata-source");
                    return new fh2.a(new c2(o0Var, i13));
                } finally {
                }
        }
    }
}
