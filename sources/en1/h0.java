package en1;

import com.pinterest.gestalt.searchGuide.GestaltSearchGuide;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class h0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f59672i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ GestaltSearchGuide f59673j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(GestaltSearchGuide gestaltSearchGuide, int i13) {
        super(0);
        this.f59672i = i13;
        this.f59673j = gestaltSearchGuide;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        GestaltSearchGuide gestaltSearchGuide = this.f59673j;
        int i13 = this.f59672i;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        return Float.valueOf(dl2.b.E0(gestaltSearchGuide, eo1.a.comp_searchguide_image_rounding));
                    default:
                        return Float.valueOf(dl2.b.E0(gestaltSearchGuide, eo1.a.comp_searchguide_selected_image_border_width));
                }
            case 1:
                switch (i13) {
                    case 0:
                        return Float.valueOf(dl2.b.E0(gestaltSearchGuide, eo1.a.comp_searchguide_image_rounding));
                    default:
                        return Float.valueOf(dl2.b.E0(gestaltSearchGuide, eo1.a.comp_searchguide_selected_image_border_width));
                }
            default:
                return (GestaltText) gestaltSearchGuide.findViewById(m0.search_guide_text);
        }
    }
}
