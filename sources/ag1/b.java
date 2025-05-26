package ag1;

import a.cb;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.LruCache;
import com.pinterest.api.model.ln0;
import com.pinterest.api.model.tp;
import com.pinterest.api.model.wn0;
import dl1.l;
import dl1.t;
import jk.r;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import om0.m1;
import oy.d1;
import pw0.w;
import tb0.p;
import vy.m;
import xk2.v;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final t f15128a;

    /* renamed from: b, reason: collision with root package name */
    public final tb0.h f15129b;

    /* renamed from: c, reason: collision with root package name */
    public String f15130c;

    /* renamed from: d, reason: collision with root package name */
    public wn0 f15131d;

    /* renamed from: e, reason: collision with root package name */
    public ln0 f15132e;

    /* renamed from: f, reason: collision with root package name */
    public tp f15133f;

    /* renamed from: g, reason: collision with root package name */
    public final qg1.i f15134g;

    /* renamed from: h, reason: collision with root package name */
    public final LruCache f15135h;

    /* renamed from: i, reason: collision with root package name */
    public String f15136i;

    /* renamed from: j, reason: collision with root package name */
    public w f15137j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f15138k;

    /* renamed from: l, reason: collision with root package name */
    public final v f15139l;

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f15140m;

    public b(t storyPinLocalDataRepository, m analyticsApi, b60.b activeUserManager, tb0.h crashReporting, Context context) {
        Intrinsics.checkNotNullParameter(storyPinLocalDataRepository, "storyPinLocalDataRepository");
        Intrinsics.checkNotNullParameter(analyticsApi, "analyticsApi");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f15128a = storyPinLocalDataRepository;
        this.f15129b = crashReporting;
        this.f15131d = new wn0(null, null, null, null, null, null, false, null, 255, null);
        d0 a13 = sh.f.a();
        Intrinsics.f(a13);
        this.f15134g = new qg1.i(a13, analyticsApi, activeUserManager, crashReporting);
        this.f15135h = new LruCache(30);
        this.f15136i = "";
        this.f15139l = xk2.m.b(new l5.a(context, 4));
    }

    public final void a() {
        this.f15133f = null;
        this.f15131d = new wn0(null, null, null, null, null, null, false, null, 255, null);
        qg1.i iVar = this.f15134g;
        iVar.f103842e = false;
        iVar.f103843f = null;
        iVar.f103844g = false;
        this.f15136i = "";
        this.f15132e = null;
    }

    public final void b(m1 draftDiscardedHandler) {
        Intrinsics.checkNotNullParameter(draftDiscardedHandler, "draftDiscardedHandler");
        ln0 ln0Var = this.f15132e;
        if (ln0Var != null) {
            ((l) this.f15128a).W(ln0Var);
            this.f15133f = ln0Var.getPageData();
            this.f15131d = ln0Var.getMetadata();
            draftDiscardedHandler.invoke();
        }
    }

    public final void c(String creationDraftId, String creationSessionId, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(creationDraftId, "creationDraftId");
        Intrinsics.checkNotNullParameter(creationSessionId, "creationSessionId");
        if (this.f15133f != null) {
            return;
        }
        int i13 = 3;
        while (true) {
            String str = null;
            if (i13 <= 0 || this.f15133f != null) {
                break;
            }
            i13--;
            Intrinsics.checkNotNullParameter(creationDraftId, "creationDraftId");
            ln0 ln0Var = (ln0) ((l) this.f15128a).O(creationDraftId);
            if (ln0Var == null) {
                str = "Failed to get StoryPinLocalData. isEarlyUpload=" + z13;
            } else {
                this.f15133f = ln0Var.getPageData();
                this.f15131d = ln0Var.getMetadata();
                if (this.f15133f == null) {
                    str = "Failed to get PageData. isEarlyUpload=" + z13;
                }
            }
            if (str != null) {
                if (i13 <= 0) {
                    r.r(this.f15133f, ig1.a.COMPOSE_DATA_MANAGER_INIT_FAIL, str);
                    vb0.j.f125466a.K(false, str, p.IDEA_PINS_CREATION, new Object[0]);
                } else {
                    Thread.sleep(500L);
                }
            }
        }
        this.f15140m = false;
        this.f15138k = z14;
        if (z13) {
            return;
        }
        qg1.i.i(this.f15134g, this.f15133f, d1.PROCESS, new qg1.g(), 0, 0, 24);
        qg1.i iVar = this.f15134g;
        tp tpVar = this.f15133f;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(creationSessionId, "creationSessionId");
        if (iVar.f103842e) {
            qg1.i.f(iVar, qg1.f.RESUME_WITH_PREVIOUS_ATTEMPT, null, tpVar, qg1.i.a(iVar, tpVar, null, null, null, null, null, null, null, null, null, null, null, null, null, creationSessionId, null, null, null, 245758), 6);
            return;
        }
        iVar.f103843f = null;
        iVar.f103842e = true;
        iVar.f103844g = true;
    }

    public final String d() {
        String str = this.f15136i;
        if (str.length() != 0) {
            return str;
        }
        String g13 = cb.g("toString(...)");
        this.f15136i = g13;
        return g13;
    }

    public final synchronized Bitmap e(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (Bitmap) this.f15135h.get(key);
    }

    public final void f(wn0 wn0Var) {
        Intrinsics.checkNotNullParameter(wn0Var, "<set-?>");
        this.f15131d = wn0Var;
    }

    public final synchronized void g(Bitmap bitmap, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.f15135h.put(key, bitmap);
    }
}
