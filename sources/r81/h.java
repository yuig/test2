package r81;

import androidx.recyclerview.widget.w;
import com.pinterest.framework.multisection.datasource.pagedlist.e0;
import com.pinterest.framework.multisection.datasource.pagedlist.f0;
import com.pinterest.framework.multisection.datasource.pagedlist.z;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import wt1.b0;
import wt1.c0;
import wt1.u;

/* loaded from: classes5.dex */
public final class h extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f106768i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f0 f106769j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(f0 f0Var, int i13) {
        super(1);
        this.f106768i = i13;
        this.f106769j = f0Var;
    }

    public final c0 b(w it) {
        int i13 = this.f106768i;
        f0 f0Var = this.f106769j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                e0 e0Var = (e0) f0Var;
                return new b0(it, e0Var.f49096b, e0Var.f49097c);
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                z zVar = (z) f0Var;
                return new wt1.m(it, zVar.f49201b, zVar.f49202c);
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                com.pinterest.framework.multisection.datasource.pagedlist.b0 b0Var = (com.pinterest.framework.multisection.datasource.pagedlist.b0) f0Var;
                return new u(it, b0Var.f49086b, b0Var.f49087c);
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                e0 e0Var2 = (e0) f0Var;
                return new b0(it, e0Var2.f49096b, e0Var2.f49097c);
            case 4:
                Intrinsics.checkNotNullParameter(it, "it");
                z zVar2 = (z) f0Var;
                return new wt1.m(it, zVar2.f49201b, zVar2.f49202c);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                com.pinterest.framework.multisection.datasource.pagedlist.b0 b0Var2 = (com.pinterest.framework.multisection.datasource.pagedlist.b0) f0Var;
                return new u(it, b0Var2.f49086b, b0Var2.f49087c);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f106768i) {
        }
        return b((w) obj);
    }
}
