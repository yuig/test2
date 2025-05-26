package rb2;

import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class y extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f107231i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ z f107232j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(z zVar, int i13) {
        super(0);
        this.f107231i = i13;
        this.f107232j = zVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        z zVar = this.f107232j;
        int i13 = this.f107231i;
        switch (i13) {
            case 0:
                switch (i13) {
                    case 0:
                        return (GestaltText) zVar.findViewById(nb2.b.header_text);
                    default:
                        return (GestaltText) zVar.findViewById(nb2.b.see_all_text);
                }
            case 1:
                switch (i13) {
                    case 0:
                        return (GestaltText) zVar.findViewById(nb2.b.header_text);
                    default:
                        return (GestaltText) zVar.findViewById(nb2.b.see_all_text);
                }
            default:
                return zVar.findViewById(nb2.b.unread_badge_icon);
        }
    }
}
