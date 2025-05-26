package di0;

import h32.f1;
import h32.v0;
import kotlin.jvm.internal.Intrinsics;
import m60.t;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import pb0.g;
import sp2.k;

/* loaded from: classes5.dex */
public final class a implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f55029a;

    public a(b bVar) {
        this.f55029a = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        if (r0 == null) goto L20;
     */
    @sp2.k(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onEventMainThread(@org.jetbrains.annotations.NotNull ls1.s r19) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: di0.a.onEventMainThread(ls1.s):void");
    }

    @k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull x70.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        b bVar = this.f55029a;
        if (bVar.f55041l <= 0) {
            return;
        }
        wk2.a aVar = bVar.f55035f;
        if (aVar != null) {
            long a13 = ((g) ((pb0.a) aVar.get())).a() - bVar.f55041l;
            bVar.f55041l = 0L;
            f1 f1Var = f1.PIN_IAB_DURATION;
            String str = event.f134109a;
            v0 v0Var = new v0();
            v0Var.C = Long.valueOf(a13);
            bVar.f55031b.H(f1Var, str, null, null, v0Var, false);
            return;
        }
        Intrinsics.r("clock");
        throw null;
    }
}
