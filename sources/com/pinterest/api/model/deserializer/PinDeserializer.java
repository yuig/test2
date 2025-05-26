package com.pinterest.api.model.deserializer;

import b22.c;
import com.pinterest.api.model.f30;
import com.pinterest.deserializers.ModelDeserializerWithSaveAndMerge;
import d12.i;
import dl1.s;
import fl1.e;
import j10.g;
import java.util.ArrayList;
import java.util.List;
import ke0.b;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import se2.a;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u00032\u00020\u0004B5\b\u0007\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/pinterest/api/model/deserializer/PinDeserializer;", "Lcom/pinterest/deserializers/ModelDeserializerWithSaveAndMerge;", "Lcom/pinterest/api/model/f30;", "Lke0/b;", "Lb22/c;", "Lfl1/e;", "pinModelMerger", "Lse2/a;", "Ldl1/t;", "lazyPinRepository", "Ld12/i;", "repositoryBatcher", "<init>", "(Lfl1/e;Lse2/a;Ld12/i;)V", "repository_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class PinDeserializer extends ModelDeserializerWithSaveAndMerge<f30> implements b, c {

    /* renamed from: b, reason: collision with root package name */
    public final g f36810b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinDeserializer(@NotNull e pinModelMerger, @NotNull a lazyPinRepository, @NotNull i repositoryBatcher) {
        super("pin");
        Intrinsics.checkNotNullParameter(pinModelMerger, "pinModelMerger");
        Intrinsics.checkNotNullParameter(lazyPinRepository, "lazyPinRepository");
        Intrinsics.checkNotNullParameter(repositoryBatcher, "repositoryBatcher");
        Intrinsics.checkNotNullParameter("pin", "jsonType");
        this.f36810b = new g(pinModelMerger, lazyPinRepository, repositoryBatcher);
    }

    @Override // ke0.b
    public final List a(vd0.a arr, boolean z13) {
        Intrinsics.checkNotNullParameter(arr, "arr");
        return c(arr);
    }

    @Override // ke0.b
    public final List c(vd0.a arr) {
        Intrinsics.checkNotNullParameter(arr, "arr");
        ArrayList arrayList = new ArrayList();
        int d2 = arr.d();
        for (int i13 = 0; i13 < d2; i13++) {
            vd0.c j13 = arr.j(i13);
            if (!j13.f() && Intrinsics.d(j13.d("type"), "pin")) {
                vd0.c j14 = arr.j(i13);
                Intrinsics.checkNotNullExpressionValue(j14, "optJsonObject(...)");
                arrayList.add(e(j14, false, false));
            }
        }
        this.f36810b.a(arrayList);
        return arrayList;
    }

    @Override // ke0.a
    public final s d(vd0.c json) {
        Intrinsics.checkNotNullParameter(json, "json");
        return e(json, false, false);
    }

    @Override // com.pinterest.deserializers.ModelDeserializerWithSaveAndMerge
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final f30 e(vd0.c json, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(json, "json");
        vd0.c m13 = json.m("data");
        if (m13 != null) {
            json = m13;
        }
        Object e13 = vd0.c.f125622b.e(json.f125623a, f30.class);
        Intrinsics.g(e13, "null cannot be cast to non-null type com.pinterest.api.model.Pin");
        f30 f30Var = (f30) e13;
        g gVar = this.f36810b;
        if (z14) {
            f30Var = gVar.b(f30Var);
        }
        if (z13) {
            gVar.a(e0.b(f30Var));
        }
        return f30Var;
    }
}
