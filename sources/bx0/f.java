package bx0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f24033i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l f24034j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i f24035k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(l lVar, i iVar, int i13) {
        super(1);
        this.f24033i = i13;
        this.f24034j = lVar;
        this.f24035k = iVar;
    }

    public final rn1.a b(rn1.a it) {
        int i13 = this.f24033i;
        i iVar = this.f24035k;
        l lVar = this.f24034j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                String str = lVar.f24065a;
                if (str == null) {
                    str = iVar.getResources().getString(f62.e.see_it_styled_default_title);
                    Intrinsics.checkNotNullExpressionValue(str, "getString(...)");
                }
                return rn1.a.y(it, bs1.c.h2(str), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                String str2 = lVar.f24066b;
                if (str2 == null) {
                    str2 = iVar.getResources().getString(f62.e.see_it_styled_product_title);
                    Intrinsics.checkNotNullExpressionValue(str2, "getString(...)");
                }
                return rn1.a.y(it, bs1.c.h2(str2), null, null, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097150);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f24033i) {
        }
        return b((rn1.a) obj);
    }
}
