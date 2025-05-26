package o10;

import com.pinterest.api.model.ow;
import com.pinterest.api.model.v7;
import dl1.s;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a implements e {

    /* renamed from: a, reason: collision with root package name */
    public static final a f92768a = new a();

    private a() {
    }

    @Override // o10.e
    public final void a(s sVar, ow modelStorage) {
        v7 model = (v7) sVar;
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(modelStorage, "modelStorage");
        modelStorage.a(model);
        s k13 = model.k1();
        if (k13 != null) {
            modelStorage.a(k13);
        }
        List<s> I0 = model.I0();
        if (I0 != null) {
            for (s sVar2 : I0) {
                Intrinsics.f(sVar2);
                modelStorage.a(sVar2);
            }
        }
        List<s> e13 = model.e1();
        if (e13 != null) {
            for (s sVar3 : e13) {
                Intrinsics.f(sVar3);
                modelStorage.a(sVar3);
            }
        }
        s k14 = model.k1();
        if (k14 != null) {
            modelStorage.a(k14);
        }
    }
}
