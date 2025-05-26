package xs0;

import android.text.SpannableStringBuilder;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f135823i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ SpannableStringBuilder f135824j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f135825k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(SpannableStringBuilder spannableStringBuilder, String str, int i13) {
        super(1);
        this.f135823i = i13;
        this.f135824j = spannableStringBuilder;
        this.f135825k = str;
    }

    public final rn1.a b(rn1.a it) {
        int i13 = this.f135823i;
        String str = this.f135825k;
        SpannableStringBuilder spannableStringBuilder = this.f135824j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.p2(spannableStringBuilder), null, null, null, null, 0, null, null, null, null, false, 0, bs1.c.p2(str), null, null, null, null, false, null, null, 2093054);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(spannableStringBuilder), null, null, null, null, 0, d7.b.Z(str.length() > 0), null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097086);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f135823i) {
        }
        return b((rn1.a) obj);
    }
}
