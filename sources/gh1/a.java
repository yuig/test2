package gh1;

import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class a extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f64997i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ b f64998j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(b bVar, int i13) {
        super(0);
        this.f64997i = i13;
        this.f64998j = bVar;
    }

    public final GestaltText b() {
        int i13 = this.f64997i;
        b bVar = this.f64998j;
        switch (i13) {
            case 0:
                return (GestaltText) bVar.findViewById(n92.b.today_tab_upsell_attribution_byauthor);
            case 1:
                return (GestaltText) bVar.findViewById(n92.b.today_tab_upsell_attribution_title);
            default:
                return (GestaltText) bVar.findViewById(n92.b.today_tab_upsell_title);
        }
    }

    public final WebImageView e() {
        int i13 = this.f64997i;
        b bVar = this.f64998j;
        switch (i13) {
            case 2:
                return (WebImageView) bVar.findViewById(n92.b.today_tab_upsell_image_1);
            case 3:
                return (WebImageView) bVar.findViewById(n92.b.today_tab_upsell_image_2);
            default:
                return (WebImageView) bVar.findViewById(n92.b.today_tab_upsell_image_3);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f64997i) {
            case 0:
                return b();
            case 1:
                return b();
            case 2:
                return e();
            case 3:
                return e();
            case 4:
                return e();
            default:
                return b();
        }
    }
}
