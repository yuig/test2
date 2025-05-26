package wo;

import android.os.Bundle;
import com.pinterest.component.modal.ModalContainer;
import kotlin.jvm.internal.Intrinsics;
import m60.w;
import nl1.d;
import pd.s;

/* loaded from: classes.dex */
public abstract class b extends c {

    /* renamed from: a, reason: collision with root package name */
    public ModalContainer f130610a;

    /* renamed from: b, reason: collision with root package name */
    public r70.a f130611b;

    /* renamed from: c, reason: collision with root package name */
    public s f130612c;

    /* renamed from: d, reason: collision with root package name */
    public ff0.c f130613d;

    /* renamed from: e, reason: collision with root package name */
    public final a f130614e = new a();

    /* renamed from: f, reason: collision with root package name */
    public lh0.b f130615f;

    @Override // cp1.p, cp1.a
    /* renamed from: getActiveFragment */
    public final d getF52740f() {
        return getNavigationManager().b();
    }

    @Override // cp1.p, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        getEventManager().j(this.f130614e);
        w eventManager = getEventManager();
        ff0.c cVar = this.f130613d;
        if (cVar != null) {
            eventManager.j(cVar);
        } else {
            Intrinsics.r("developerEventsSubscriber");
            throw null;
        }
    }

    @Override // cp1.p, androidx.appcompat.app.n, android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ModalContainer modalContainer = this.f130610a;
        if (modalContainer == null) {
            Intrinsics.r("adminModalContainer");
            throw null;
        }
        ff0.c cVar = new ff0.c(modalContainer);
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f130613d = cVar;
    }

    @Override // cp1.p, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        getEventManager().h(this.f130614e);
        w eventManager = getEventManager();
        ff0.c cVar = this.f130613d;
        if (cVar != null) {
            eventManager.h(cVar);
        } else {
            Intrinsics.r("developerEventsSubscriber");
            throw null;
        }
    }

    public final lh0.b x() {
        lh0.b bVar = this.f130615f;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.r("experiments");
        throw null;
    }
}
