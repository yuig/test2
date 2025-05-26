package t41;

import com.pinterest.api.model.md0;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import m60.t;
import org.greenrobot.eventbus.ThreadMode;
import sp2.k;

/* loaded from: classes5.dex */
public final class a implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f116412a;

    public a(b bVar) {
        this.f116412a = bVar;
    }

    @k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(md0 md0Var) {
        b bVar = this.f116412a;
        bVar.f116418l.i2();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        bVar.getClass();
        Intrinsics.checkNotNullParameter(linkedHashSet, "<set-?>");
        bVar.f120492d = linkedHashSet;
        bVar.x3();
    }
}
