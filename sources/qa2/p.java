package qa2;

import android.util.LruCache;
import android.view.View;
import com.pinterest.api.model.f30;
import com.pinterest.ui.grid.LegoPinGridCellImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f103331a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LegoPinGridCellImpl f103332b;

    public /* synthetic */ p(LegoPinGridCellImpl legoPinGridCellImpl, int i13) {
        this.f103331a = i13;
        this.f103332b = legoPinGridCellImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f103331a;
        LegoPinGridCellImpl this$0 = this.f103332b;
        switch (i13) {
            case 0:
                int i14 = LegoPinGridCellImpl.Z2;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                m60.w eventManager = this$0.getEventManager();
                f30 f30Var = this$0.C0;
                eventManager.d(new ls1.a(f30Var != null ? f30Var.getUid() : null));
                ua2.l t03 = this$0.t0();
                t03.E().f128846i = false;
                f30 f30Var2 = t03.f121558q;
                hs.e eVar = t03.f121552k;
                if (eVar != null) {
                    String uid = f30Var2 != null ? f30Var2.getUid() : null;
                    Boolean bool = Boolean.TRUE;
                    LruCache lruCache = ((hs.c) eVar).f70027d;
                    if (uid != null) {
                        lruCache.put(uid, bool);
                    }
                }
                View view = t03.f121492a;
                if (view.getParent() instanceof f0) {
                    Object parent = view.getParent();
                    View view2 = parent instanceof View ? (View) parent : null;
                    if (view2 != null) {
                        view2.postInvalidate();
                    }
                } else {
                    view.postInvalidate();
                }
                f30 f30Var3 = this$0.C0;
                if (f30Var3 != null) {
                    if (((hs.c) this$0.d0()).a(LegoPinGridCellImpl.a0(f30Var3)) == null) {
                        hs.e d03 = this$0.d0();
                        String a03 = LegoPinGridCellImpl.a0(f30Var3);
                        Boolean bool2 = Boolean.TRUE;
                        LruCache lruCache2 = ((hs.c) d03).f70027d;
                        if (a03 != null) {
                            lruCache2.put(a03, bool2);
                            break;
                        }
                    }
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.U0 = null;
                this$0.w2();
                this$0.invalidate();
                break;
        }
    }
}
