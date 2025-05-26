package la0;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a1 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f82367i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l82.c0 f82368j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ xa0.l f82369k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a1(l82.c0 c0Var, xa0.l lVar, int i13) {
        super(1);
        this.f82367i = i13;
        this.f82368j = c0Var;
        this.f82369k = lVar;
    }

    public final g b(g it) {
        int i13;
        int i14;
        int i15;
        int i16 = this.f82367i;
        xa0.l lVar = this.f82369k;
        l82.c0 c0Var = this.f82368j;
        switch (i16) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                x31.c cVar = (x31.c) c0Var.f82212a;
                int[] iArr = z0.f82490a;
                int i17 = iArr[lVar.ordinal()];
                if (i17 == 1) {
                    i13 = ka0.b0.collages_retrieval_empty_state_title_calico;
                } else if (i17 == 2) {
                    i13 = ka0.b0.collages_retrieval_empty_state_title_published_calico;
                } else {
                    if (i17 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i13 = ka0.b0.collages_retrieval_empty_state_title_drafts;
                }
                u50.k0 b13 = u50.g0.b(new String[0], i13);
                int i18 = iArr[lVar.ordinal()];
                if (i18 == 1) {
                    i14 = ka0.b0.collages_all_retrieval_empty_state_message_calico;
                } else if (i18 == 2) {
                    i14 = ka0.b0.collages_retrieval_empty_state_message_calico;
                } else {
                    if (i18 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i14 = ka0.b0.collages_retrieval_empty_state_message;
                }
                return g.e(it, null, b13, u50.g0.b(new String[0], i14), cVar, null, false, 483);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                x31.c cVar2 = (x31.c) c0Var.f82212a;
                int i19 = b1.f82374a[lVar.ordinal()];
                if (i19 == 1) {
                    i15 = ka0.b0.collages_retrieval_empty_state_title;
                } else if (i19 == 2) {
                    i15 = ka0.b0.collages_retrieval_empty_state_title_published;
                } else {
                    if (i19 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i15 = ka0.b0.collages_retrieval_empty_state_title_drafts;
                }
                return g.e(it, null, u50.g0.b(new String[0], i15), u50.g0.b(new String[0], ka0.b0.collages_retrieval_empty_state_message), cVar2, null, false, 483);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f82367i) {
        }
        return b((g) obj);
    }
}
