package r81;

import androidx.recyclerview.widget.w;
import com.pinterest.framework.multisection.datasource.pagedlist.a0;
import com.pinterest.framework.multisection.datasource.pagedlist.f0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import wt1.c0;
import wt1.r;

/* loaded from: classes5.dex */
public final class i extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f106770i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ dl1.s f106771j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ f0 f106772k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(dl1.s sVar, f0 f0Var, int i13) {
        super(1);
        this.f106770i = i13;
        this.f106771j = sVar;
        this.f106772k = f0Var;
    }

    public final c0 b(w diffResult) {
        int i13 = this.f106770i;
        dl1.s sVar = this.f106771j;
        f0 f0Var = this.f106772k;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(diffResult, "diffResult");
                a0 a0Var = (a0) f0Var;
                return new r(diffResult, sVar, a0Var.f49082b, a0Var.f49083c);
            default:
                Intrinsics.checkNotNullParameter(diffResult, "diffResult");
                a0 a0Var2 = (a0) f0Var;
                return new r(diffResult, sVar, a0Var2.f49082b, a0Var2.f49083c);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f106770i) {
        }
        return b((w) obj);
    }
}
