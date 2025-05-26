package o10;

import com.pinterest.api.model.ba;
import com.pinterest.api.model.e30;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.ow;
import dl1.s;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b implements e {

    /* renamed from: a, reason: collision with root package name */
    public static final b f92769a = new b();

    private b() {
    }

    @Override // o10.e
    public final void a(s sVar, ow modelStorage) {
        ba boardSection = (ba) sVar;
        Intrinsics.checkNotNullParameter(boardSection, "boardSection");
        Intrinsics.checkNotNullParameter(modelStorage, "modelStorage");
        modelStorage.a(boardSection);
        s u13 = boardSection.u();
        if (u13 != null) {
            modelStorage.a(u13);
        }
        List y13 = boardSection.y();
        if (y13 != null) {
            Iterator it = y13.iterator();
            while (it.hasNext()) {
                e30 R6 = ((f30) it.next()).R6();
                R6.Z1(boardSection);
                s a13 = R6.a();
                Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
                modelStorage.a(a13);
            }
        }
    }
}
