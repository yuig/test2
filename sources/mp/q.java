package mp;

import android.content.Context;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import pk.a0;

/* loaded from: classes3.dex */
public final class q implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f87878a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f87879b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f87880c;

    public q(boolean z13, r rVar, Context context) {
        this.f87878a = z13;
        this.f87879b = rVar;
        this.f87880c = context;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull o event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.f87878a) {
            Integer num = event.f87875b;
            r rVar = this.f87879b;
            int i13 = event.f87874a;
            if (num == null) {
                a0.o(rVar.f87882a, i13, new Object[0]);
                return;
            }
            oo1.j jVar = oo1.j.f96854a;
            String f13 = oo1.j.f(num.intValue());
            GestaltText gestaltText = rVar.f87882a;
            String string = this.f87880c.getString(i13, f13);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            a0.p(gestaltText, string);
        }
    }
}
