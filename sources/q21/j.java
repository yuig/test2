package q21;

import com.pinterest.feature.pincells.fixedsize.view.ProductMetadataView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class j extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f102160i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f102161j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ ProductMetadataView f102162k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(String str, ProductMetadataView productMetadataView, int i13) {
        super(1);
        this.f102160i = i13;
        this.f102161j = str;
        this.f102162k = productMetadataView;
    }

    public final rn1.a b(rn1.a it) {
        int i13 = this.f102160i;
        ProductMetadataView productMetadataView = this.f102162k;
        String str = this.f102161j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(str), null, null, null, null, productMetadataView.f47444d ? 2 : Integer.MAX_VALUE, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097118);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(str), null, null, null, null, productMetadataView.f47444d ? 2 : 1, null, rn1.b.END, null, null, false, 0, null, null, null, null, null, false, null, null, 2096990);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f102160i) {
        }
        return b((rn1.a) obj);
    }
}
