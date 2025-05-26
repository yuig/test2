package o10;

import com.pinterest.api.model.ow;
import com.pinterest.api.model.zv0;
import dl1.s;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class l implements e {

    /* renamed from: a, reason: collision with root package name */
    public static final l f92777a = new l();

    private l() {
    }

    @Override // o10.e
    public final void a(s sVar, ow modelStorage) {
        zv0 model = (zv0) sVar;
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(modelStorage, "modelStorage");
        modelStorage.a(model);
        s G = model.G();
        if (G != null) {
            modelStorage.a(G);
        }
        s W = model.W();
        if (W != null) {
            modelStorage.a(W);
        }
        s H = model.H();
        if (H != null) {
            modelStorage.a(H);
        }
        List<s> I = model.I();
        if (I != null) {
            for (s sVar2 : I) {
                Intrinsics.f(sVar2);
                modelStorage.a(sVar2);
            }
        }
    }
}
