package o10;

import com.pinterest.api.model.ow;
import com.pinterest.api.model.wy0;
import dl1.s;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class m implements e {

    /* renamed from: a, reason: collision with root package name */
    public static final m f92778a = new m();

    private m() {
    }

    @Override // o10.e
    public final void a(s sVar, ow modelStorage) {
        wy0 model = (wy0) sVar;
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(modelStorage, "modelStorage");
        modelStorage.a(model);
        s Y3 = model.Y3();
        if (Y3 != null) {
            modelStorage.a(Y3);
        }
    }
}
