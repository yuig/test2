package cp;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes3.dex */
public final class m implements m60.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f52941a;

    public m(n nVar) {
        this.f52941a = nVar;
    }

    @sp2.k(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(oo1.e eVar) {
        n nVar = this.f52941a;
        lb0.q prefsManagerPersisted = nVar.f52956n0;
        Context context = nVar.getContext();
        Intrinsics.checkNotNullParameter(prefsManagerPersisted, "prefsManagerPersisted");
        Intrinsics.checkNotNullParameter(context, "context");
        ny1.x.f92714f.a(context);
        e0.t.L0(prefsManagerPersisted, bs1.c.k0(context));
    }
}
