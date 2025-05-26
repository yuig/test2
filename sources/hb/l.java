package hb;

import android.app.Activity;
import androidx.media3.ui.z;
import eb.p;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class l implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f68502a;

    public l(n nVar) {
        this.f68502a = nVar;
    }

    @Override // hb.a
    public final void a(Activity activity, p newLayoutInfo) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(newLayoutInfo, "newLayout");
        Iterator it = this.f68502a.f68510b.iterator();
        while (it.hasNext()) {
            m mVar = (m) it.next();
            if (Intrinsics.d(mVar.f68503a, activity)) {
                Intrinsics.checkNotNullParameter(newLayoutInfo, "newLayoutInfo");
                mVar.f68506d = newLayoutInfo;
                mVar.f68504b.execute(new z(5, mVar, newLayoutInfo));
            }
        }
    }
}
