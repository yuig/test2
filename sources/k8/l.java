package k8;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import pk.t2;

/* loaded from: classes.dex */
public final class l implements Spatializer$OnSpatializerStateChangedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f78532a;

    public l(q qVar) {
        this.f78532a = qVar;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z13) {
        q qVar = this.f78532a;
        t2 t2Var = q.f78564j;
        qVar.r();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z13) {
        q qVar = this.f78532a;
        t2 t2Var = q.f78564j;
        qVar.r();
    }
}
