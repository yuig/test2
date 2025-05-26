package rq;

import android.text.SpannableStringBuilder;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class n2 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f109397i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p2 f109398j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f109399k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f109400l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n2(p2 p2Var, String str, String str2, int i13) {
        super(1);
        this.f109397i = i13;
        this.f109398j = p2Var;
        this.f109399k = str;
        this.f109400l = str2;
    }

    public final rn1.a b(rn1.a it) {
        SpannableStringBuilder string;
        SpannableStringBuilder string2;
        String str = this.f109400l;
        p2 p2Var = this.f109398j;
        int i13 = this.f109397i;
        String str2 = this.f109399k;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                string = p2Var.b("\"" + str2 + "\" ...", eo1.b.color_text_default, str, false);
                Intrinsics.checkNotNullParameter(string, "string");
                return rn1.a.y(it, new u50.f0(string), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                string2 = p2Var.b("\"" + str2 + "...\"", eo1.b.color_text_default, str, false);
                Intrinsics.checkNotNullParameter(string2, "string");
                return rn1.a.y(it, new u50.f0(string2), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f109397i) {
        }
        return b((rn1.a) obj);
    }
}
