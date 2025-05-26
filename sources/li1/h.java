package li1;

import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class h extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f83551i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j f83552j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(j jVar, int i13) {
        super(0);
        this.f83551i = i13;
        this.f83552j = jVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        j jVar = this.f83552j;
        int i13 = this.f83551i;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        return (GestaltText) jVar.findViewById(nw.a.action_menu_subtitle_text);
                    default:
                        return (GestaltText) jVar.findViewById(nw.a.message_text);
                }
            case 1:
                switch (i13) {
                    case 0:
                        return (GestaltText) jVar.findViewById(nw.a.action_menu_subtitle_text);
                    default:
                        return (GestaltText) jVar.findViewById(nw.a.message_text);
                }
            default:
                return (GestaltButton) jVar.findViewById(nw.a.action_menu_see_fewer_button);
        }
    }
}
