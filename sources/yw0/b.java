package yw0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class b extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f140267i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ g f140268j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ e f140269k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(g gVar, e eVar, int i13) {
        super(1);
        this.f140267i = i13;
        this.f140268j = gVar;
        this.f140269k = eVar;
    }

    public final rn1.a b(rn1.a it) {
        int i13 = this.f140267i;
        e eVar = this.f140269k;
        g gVar = this.f140268j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                String str = gVar.f140291a;
                if (str == null) {
                    str = eVar.getResources().getString(f62.e.see_it_styled_default_title);
                    Intrinsics.checkNotNullExpressionValue(str, "getString(...)");
                }
                return rn1.a.y(it, bs1.c.h2(str), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                String str2 = gVar.f140292b;
                if (str2 == null) {
                    str2 = eVar.getResources().getString(f62.e.see_it_styled_product_title);
                    Intrinsics.checkNotNullExpressionValue(str2, "getString(...)");
                }
                return rn1.a.y(it, bs1.c.h2(str2), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f140267i) {
        }
        return b((rn1.a) obj);
    }
}
