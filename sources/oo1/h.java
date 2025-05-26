package oo1;

import com.pinterest.api.model.wy0;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import uj2.f0;

/* loaded from: classes5.dex */
public final class h extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f96851i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ no1.e f96852j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(no1.e eVar, int i13) {
        super(1);
        this.f96851i = i13;
        this.f96852j = eVar;
    }

    public final f0 b(Pair recipients) {
        switch (this.f96851i) {
            case 0:
                Intrinsics.checkNotNullParameter(recipients, "recipients");
                return j.b(null, (Collection) recipients.f80346a, (List) recipients.f80347b, null, null, null, null, null, null, y32.c.PROFILE.getValue(), this.f96852j, null);
            case 1:
            default:
                Intrinsics.checkNotNullParameter(recipients, "recipients");
                return j.b(null, (Collection) recipients.f80346a, (List) recipients.f80347b, null, null, null, null, null, null, y32.c.SEND_A_PIN.getValue(), this.f96852j, null);
            case 2:
                Intrinsics.checkNotNullParameter(recipients, "<name for destructuring parameter 0>");
                return j.a((List) recipients.f80346a, (List) recipients.f80347b, null, null, y32.c.GROUP_BOARD.getValue(), this.f96852j);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f96851i) {
            case 1:
                wy0 user = (wy0) obj;
                Intrinsics.checkNotNullParameter(user, "user");
                Boolean s43 = user.s4();
                Intrinsics.checkNotNullExpressionValue(s43, "getShouldShowMessaging(...)");
                if (s43.booleanValue()) {
                    new kk2.m(j.i(j.l(user)), new d(1, new h(this.f96852j, 0)), 0).l(wj2.c.a()).o(new dl1.c(22, g.f96842k), new dl1.c(23, g.f96843l));
                }
                break;
        }
        return b((Pair) obj);
    }
}
