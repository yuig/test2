package r81;

import androidx.recyclerview.widget.w;
import com.pinterest.framework.multisection.datasource.pagedlist.f0;
import com.pinterest.framework.multisection.datasource.pagedlist.y;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import wt1.c0;

/* loaded from: classes5.dex */
public final class j extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f106773i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f0 f106774j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f106775k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(f0 f0Var, int i13, int i14) {
        super(1);
        this.f106773i = i14;
        this.f106774j = f0Var;
        this.f106775k = i13;
    }

    public final c0 b(w it) {
        int i13 = this.f106773i;
        int i14 = this.f106775k;
        f0 f0Var = this.f106774j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return new wt1.m(it, ((y) f0Var).f49200b, i14);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f106773i) {
        }
        return b((w) obj);
    }
}
