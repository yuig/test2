package o10;

import com.pinterest.api.model.ow;
import com.pinterest.api.model.vh;
import com.pinterest.api.model.wy0;
import dl1.s;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d implements e {

    /* renamed from: a, reason: collision with root package name */
    public static final d f92771a = new d();

    private d() {
    }

    public static void b(vh model, ow modelStorage) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(modelStorage, "modelStorage");
        modelStorage.a(model);
        wy0 wy0Var = model.f42860r;
        if (wy0Var != null) {
            modelStorage.a(wy0Var);
        }
        for (s sVar : model.f42865w) {
            e a13 = c.f92770a.a(sVar);
            if (a13 != null) {
                a13.a(sVar, modelStorage);
            }
        }
    }

    @Override // o10.e
    public final /* bridge */ /* synthetic */ void a(s sVar, ow owVar) {
        b((vh) sVar, owVar);
    }
}
