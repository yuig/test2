package ny0;

import com.pinterest.api.model.qz;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class u0 implements o82.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f92634a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qz f92635b;

    public /* synthetic */ u0(qz qzVar, int i13) {
        this.f92634a = i13;
        this.f92635b = qzVar;
    }

    @Override // o82.p
    public final String a(int i13, l82.i0 i0Var) {
        int i14 = this.f92634a;
        qz useCase = this.f92635b;
        switch (i14) {
            case 0:
                Intrinsics.checkNotNullParameter(useCase, "$useCase");
                Intrinsics.checkNotNullParameter((d1) i0Var, "<anonymous parameter 1>");
                return a.a.C(useCase.getId(), "539204");
            case 1:
                a1 item = (a1) i0Var;
                Intrinsics.checkNotNullParameter(useCase, "$useCase");
                Intrinsics.checkNotNullParameter(item, "item");
                return a.a.C(useCase.getId(), item.f92550a.getId());
            default:
                Intrinsics.checkNotNullParameter(useCase, "$useCase");
                Intrinsics.checkNotNullParameter((b1) i0Var, "<anonymous parameter 1>");
                return a.a.C(useCase.getId(), "539206");
        }
    }
}
