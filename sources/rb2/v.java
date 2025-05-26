package rb2;

import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class v extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f107223i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ w f107224j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(w wVar, int i13) {
        super(0);
        this.f107223i = i13;
        this.f107224j = wVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        w wVar = this.f107224j;
        int i13 = this.f107223i;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        return (GestaltText) wVar.findViewById(nb2.b.header_text);
                    default:
                        return (GestaltText) wVar.findViewById(nb2.b.see_all_text);
                }
            case 1:
                switch (i13) {
                    case 0:
                        return (GestaltText) wVar.findViewById(nb2.b.header_text);
                    default:
                        return (GestaltText) wVar.findViewById(nb2.b.see_all_text);
                }
            default:
                return wVar.findViewById(nb2.b.unread_badge_icon);
        }
    }
}
