package ec0;

import android.text.Spannable;
import android.text.SpannableString;
import dc0.o;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import u50.f0;

/* loaded from: classes5.dex */
public final class f extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f58380i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Spannable f58381j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ o f58382k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(SpannableString spannableString, o oVar, int i13) {
        super(1);
        this.f58380i = i13;
        this.f58381j = spannableString;
        this.f58382k = oVar;
    }

    public final rn1.a b(rn1.a it) {
        vn1.c cVar;
        int i13 = this.f58380i;
        boolean z13 = false;
        o oVar = this.f58382k;
        Spannable spannable = this.f58381j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                f0 p23 = bs1.c.p2(spannable);
                int i14 = e.f58379a[oVar.f54357u.ordinal()];
                if (i14 == 1) {
                    cVar = oVar.f54342f;
                } else {
                    if (i14 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cVar = vn1.c.SUBTLE;
                }
                vn1.c cVar2 = cVar;
                if (!oVar.f54350n && spannable.length() > 0) {
                    z13 = true;
                }
                return rn1.a.y(it, p23, cVar2, null, null, null, 0, d7.b.Z(z13), null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097084);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                f0 p24 = bs1.c.p2(spannable);
                vn1.c cVar3 = oVar.f54342f;
                if (!oVar.f54350n && spannable.length() > 0) {
                    z13 = true;
                }
                return rn1.a.y(it, p24, cVar3, null, null, null, 0, d7.b.Z(z13), null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097084);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f58380i) {
        }
        return b((rn1.a) obj);
    }
}
