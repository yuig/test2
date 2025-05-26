package fv0;

import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import kotlin.text.StringsKt;
import rl1.q;

/* loaded from: classes5.dex */
public final class g extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f63023i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f63024j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f63025k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f63026l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(int i13, String str, String str2) {
        super(1);
        this.f63023i = 0;
        this.f63026l = i13;
        this.f63024j = str;
        this.f63025k = str2;
    }

    public final q b(q it) {
        String str;
        int i13 = this.f63023i;
        int i14 = this.f63026l;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return q.e(it, this.f63024j, this.f63025k, false, null, null, false, false, null, 0, new rl1.d(i14), null, 1532);
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return q.e(it, this.f63024j, this.f63025k, false, null, null, false, false, null, 0, new rl1.d(i14), null, 1532);
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                return q.e(it, this.f63024j, this.f63025k, false, null, null, false, false, null, 0, new rl1.d(i14), null, 1532);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                String str2 = this.f63024j;
                if (str2 == null || str2.length() == 0 || StringsKt.toIntOrNull(str2) != null) {
                    str = "";
                } else {
                    String substring = str2.substring(0, 1);
                    Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                    Locale locale = Locale.getDefault();
                    Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
                    str = substring.toUpperCase(locale);
                    Intrinsics.checkNotNullExpressionValue(str, "toUpperCase(...)");
                }
                String str3 = this.f63025k;
                return q.e(it, (str3 == null || str3.length() == 0 || StringsKt.E(str3, "default_", false)) ? "" : str3, str, false, null, null, false, false, null, 0, new rl1.d(i14), null, 1532);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f63023i) {
        }
        return b((q) obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(String str, int i13, int i14, String str2) {
        super(1);
        this.f63023i = i14;
        this.f63024j = str;
        this.f63025k = str2;
        this.f63026l = i13;
    }
}
