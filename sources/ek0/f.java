package ek0;

import m60.t;
import org.greenrobot.eventbus.ThreadMode;
import sp2.k;

/* loaded from: classes5.dex */
public final class f implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f59174a;

    public f(h hVar) {
        this.f59174a = hVar;
    }

    @k(threadMode = ThreadMode.MAIN)
    public void onEventMainThread(dg0.i iVar) {
        h hVar = this.f59174a;
        if (hVar.f59178c != gp1.b.CREATE) {
            if (!hVar.f59182g) {
                hVar.f59181f = true;
                return;
            }
            ((fk0.k) ((com.pinterest.feature.board.create.c) hVar.getView())).b8(hVar.f59189n);
        }
    }
}
