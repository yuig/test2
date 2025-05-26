package mv0;

import com.pinterest.feature.ideaPinCreation.producttagging.view.IdeaPinProductTagsItemView;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class a0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f88324i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ IdeaPinProductTagsItemView f88325j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(IdeaPinProductTagsItemView ideaPinProductTagsItemView, int i13) {
        super(0);
        this.f88324i = i13;
        this.f88325j = ideaPinProductTagsItemView;
    }

    public final GestaltText b() {
        int i13 = this.f88324i;
        IdeaPinProductTagsItemView ideaPinProductTagsItemView = this.f88325j;
        switch (i13) {
            case 1:
                return (GestaltText) ideaPinProductTagsItemView.findViewById(aq1.d.product_tag_merchant);
            case 2:
            case 4:
            default:
                return (GestaltText) ideaPinProductTagsItemView.findViewById(aq1.d.product_tag_price);
            case 3:
                return (GestaltText) ideaPinProductTagsItemView.findViewById(aq1.d.product_tag_out_of_stock_label);
            case 5:
                return (GestaltText) ideaPinProductTagsItemView.findViewById(aq1.d.product_tag_shipping);
            case 6:
                return (GestaltText) ideaPinProductTagsItemView.findViewById(aq1.d.product_tag_title);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        IdeaPinProductTagsItemView ideaPinProductTagsItemView = this.f88325j;
        int i13 = this.f88324i;
        switch (i13) {
            case 0:
                switch (i13) {
                }
            case 4:
                switch (i13) {
                }
        }
        return b();
    }
}
