package hb2;

import com.pinterest.api.model.fy;
import com.pinterest.api.model.jy;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class n extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f68595i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ fy f68596j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(fy fyVar, int i13) {
        super(1);
        this.f68595i = i13;
        this.f68596j = fyVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f68595i;
        w32.c cVar = null;
        fy fyVar = this.f68596j;
        switch (i13) {
            case 0:
                yl1.b it = (yl1.b) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                jy d2 = fyVar.d();
                String h10 = d2 != null ? d2.h() : null;
                return yl1.b.f(it, bs1.c.p2(h10 != null ? h10 : ""), false, null, null, null, null, null, null, 0, null, 1022);
            default:
                yl1.l bind = (yl1.l) obj;
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                jy d13 = fyVar.d();
                String h13 = d13 != null ? d13.h() : null;
                u50.f0 text = bs1.c.p2(h13 != null ? h13 : "");
                bind.getClass();
                Intrinsics.checkNotNullParameter(text, "text");
                bind.f139348a = text;
                jy d14 = fyVar.d();
                if (d14 != null) {
                    w32.a aVar = w32.c.Companion;
                    Integer f13 = d14.f();
                    Intrinsics.checkNotNullExpressionValue(f13, "getContactType(...)");
                    int intValue = f13.intValue();
                    aVar.getClass();
                    switch (intValue) {
                        case 0:
                            cVar = w32.c.PHONE_NUMBER;
                            break;
                        case 1:
                            cVar = w32.c.SMS_NUMBER;
                            break;
                        case 2:
                            cVar = w32.c.WEBCHAT_URL;
                            break;
                        case 3:
                            cVar = w32.c.WEBSITE;
                            break;
                        case 4:
                            cVar = w32.c.WHATSAPP_URL;
                            break;
                        case 5:
                            cVar = w32.c.APP_LINK;
                            break;
                        case 6:
                            cVar = w32.c.DEFAULT;
                            break;
                    }
                    switch (cVar == null ? -1 : o.f68597a[cVar.ordinal()]) {
                        case 1:
                            bind.f139354g = rm1.q.PHONE;
                            break;
                        case 2:
                            bind.f139354g = rm1.q.SPEECH_ELLIPSIS;
                            break;
                        case 3:
                            bind.f139354g = rm1.q.SPEECH_OUTLINE;
                            break;
                        case 4:
                            bind.f139354g = rm1.q.GLOBE;
                            break;
                        case 5:
                            bind.f139354g = rm1.q.WHATSAPP;
                            break;
                        case 6:
                            bind.f139354g = rm1.q.SEARCH;
                            break;
                        default:
                            bind.f139355h = rm1.q.ARROW_UP_RIGHT;
                            break;
                    }
                }
                return Unit.f80348a;
        }
    }
}
