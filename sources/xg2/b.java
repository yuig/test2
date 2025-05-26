package xg2;

import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import xk2.k;
import xk2.v;

/* loaded from: classes4.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    public final k f134953a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f134954b;

    public b(v markerFile) {
        Intrinsics.checkNotNullParameter(markerFile, "markerFile");
        this.f134953a = markerFile;
        this.f134954b = new Object();
    }

    @Override // cg2.e
    public final void w(String crashId) {
        Intrinsics.checkNotNullParameter(crashId, "crashId");
        synchronized (this.f134954b) {
            try {
                try {
                    il2.k.d((File) this.f134953a.getValue(), SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE);
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                il2.k.d((File) this.f134953a.getValue(), SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE);
            }
            Unit unit = Unit.f80348a;
        }
    }
}
