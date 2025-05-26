package q71;

import android.text.SpannableString;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f102761i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ SpannableString f102762j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(SpannableString spannableString, int i13) {
        super(1);
        this.f102761i = i13;
        this.f102762j = spannableString;
    }

    public final rn1.a b(rn1.a it) {
        int i13 = this.f102761i;
        SpannableString spannableString = this.f102762j;
        switch (i13) {
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(spannableString), null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, true, 0, null, null, null, null, null, false, null, null, 2096062);
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(spannableString), null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
            default:
                Intrinsics.checkNotNullParameter(it, "state");
                return rn1.a.y(it, new u50.f0(spannableString), null, null, null, null, 0, null, null, null, null, true, 0, null, null, null, null, null, false, null, null, 2096126);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f102761i;
        SpannableString spannableString = this.f102762j;
        switch (i13) {
            case 0:
                rn1.k bind = (rn1.k) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.f(spannableString);
                break;
            case 1:
                em1.d it = (em1.d) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return b((rn1.a) obj);
    }
}
