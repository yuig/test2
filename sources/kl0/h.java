package kl0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f80086i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ CharSequence f80087j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ rm1.q f80088k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f80089l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(String str, rm1.q qVar, int i13, int i14) {
        super(1);
        this.f80086i = i14;
        this.f80087j = str;
        this.f80088k = qVar;
        this.f80089l = i13;
    }

    public final om1.c b(om1.c it) {
        int i13 = this.f80086i;
        CharSequence charSequence = this.f80087j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                fm1.c cVar = fm1.c.GONE;
                return om1.c.e(it, this.f80088k, null, om1.f.TRANSPARENT_DARK_GRAY, cVar, bs1.c.h2(charSequence), false, this.f80089l, 738);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                fm1.c cVar2 = fm1.c.GONE;
                return om1.c.e(it, this.f80088k, null, om1.f.TRANSPARENT_DARK_GRAY, cVar2, bs1.c.h2(charSequence), false, this.f80089l, 738);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f80086i) {
        }
        return b((om1.c) obj);
    }
}
