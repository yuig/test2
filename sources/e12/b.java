package e12;

import com.pinterest.api.model.lh0;
import com.pinterest.api.model.u7;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import com.pinterest.deserializers.ModelDeserializerWithSaveAndMerge;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b implements rz.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56819a;

    /* renamed from: b, reason: collision with root package name */
    public final ModelDeserializerWithSaveAndMerge f56820b;

    public b(ModelDeserializerWithSaveAndMerge userDeserializer, int i13) {
        this.f56819a = i13;
        if (i13 == 1) {
            Intrinsics.checkNotNullParameter(userDeserializer, "userDeserializer");
            this.f56820b = userDeserializer;
        } else if (i13 != 2) {
            Intrinsics.checkNotNullParameter(userDeserializer, "boardDeserializer");
            this.f56820b = userDeserializer;
        } else {
            Intrinsics.checkNotNullParameter(userDeserializer, "userDeserializer");
            this.f56820b = userDeserializer;
        }
    }

    @Override // rz.d
    public final Object b(vd0.c pinterestJsonObject) {
        lh0 lh0Var;
        ModelDeserializerWithSaveAndMerge modelDeserializerWithSaveAndMerge = this.f56820b;
        int i13 = this.f56819a;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(pinterestJsonObject, "pinterestJsonObject");
                v7 v7Var = (v7) modelDeserializerWithSaveAndMerge.d(new vd0.c(pinterestJsonObject.f125623a.v("data").i()));
                vd0.c m13 = pinterestJsonObject.m("sensitivity");
                v7 v7Var2 = null;
                if (m13 != null) {
                    Object e13 = vd0.c.f125622b.e(m13.f125623a, lh0.class);
                    Intrinsics.g(e13, "null cannot be cast to non-null type com.pinterest.api.model.Sensitivity");
                    lh0Var = (lh0) e13;
                } else {
                    lh0Var = null;
                }
                if (lh0Var != null) {
                    u7 G1 = v7Var.G1();
                    G1.I(lh0Var);
                    v7Var2 = G1.a();
                }
                if (v7Var2 != null) {
                    break;
                }
                break;
            case 1:
                switch (i13) {
                    case 1:
                        Intrinsics.checkNotNullParameter(pinterestJsonObject, "pinterestJsonObject");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(pinterestJsonObject, "pinterestJsonObject");
                        break;
                }
            default:
                switch (i13) {
                    case 1:
                        Intrinsics.checkNotNullParameter(pinterestJsonObject, "pinterestJsonObject");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(pinterestJsonObject, "pinterestJsonObject");
                        break;
                }
        }
        return (wy0) modelDeserializerWithSaveAndMerge.d(pinterestJsonObject);
    }
}
