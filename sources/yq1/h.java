package yq1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class h extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f139858i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ k f139859j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(k kVar, int i13) {
        super(1);
        this.f139858i = i13;
        this.f139859j = kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f139858i;
        k kVar = this.f139859j;
        switch (i13) {
            case 0:
                ao1.b it = (ao1.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                String str = kVar.N0;
                if (str != null) {
                    return ao1.b.e(it, bs1.c.h2(str), null, null, null, null, false, 0, 0, 0, false, false, false, null, false, null, null, null, null, null, 0, 4194302);
                }
                Intrinsics.r("emailTypoSuggestion");
                throw null;
            case 1:
                am1.h bind = (am1.h) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                boolean c13 = kVar.b8().c();
                bind.getClass();
                bind.f15541d = c13 ? fm1.c.VISIBLE : fm1.c.GONE;
                return Unit.f80348a;
            default:
                rn1.a it2 = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                CharSequence string = kVar.getText(vq1.d.arr_facebook_deprecated_text);
                Intrinsics.checkNotNullExpressionValue(string, "getText(...)");
                Intrinsics.checkNotNullParameter(string, "string");
                return rn1.a.y(it2, new u50.f0(string), null, null, null, null, 0, fm1.c.VISIBLE, null, null, null, true, 0, null, null, null, null, null, false, null, null, 2096062);
        }
    }
}
