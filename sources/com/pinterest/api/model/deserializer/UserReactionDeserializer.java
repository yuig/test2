package com.pinterest.api.model.deserializer;

import com.pinterest.api.model.gz0;
import com.pinterest.api.model.wy0;
import com.pinterest.deserializers.ModelDeserializerWithSaveAndMerge;
import java.util.ArrayList;
import java.util.List;
import ke0.a;
import ke0.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vd0.c;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0017\b\u0007\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/pinterest/api/model/deserializer/UserReactionDeserializer;", "Lke0/a;", "Lcom/pinterest/api/model/gz0;", "Lke0/b;", "Lcom/pinterest/deserializers/ModelDeserializerWithSaveAndMerge;", "Lcom/pinterest/api/model/wy0;", "userDeserializer", "<init>", "(Lcom/pinterest/deserializers/ModelDeserializerWithSaveAndMerge;)V", "repository_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class UserReactionDeserializer extends a implements b {

    /* renamed from: b, reason: collision with root package name */
    public final ModelDeserializerWithSaveAndMerge f36816b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserReactionDeserializer(@NotNull ModelDeserializerWithSaveAndMerge<wy0> userDeserializer) {
        super("userreaction");
        Intrinsics.checkNotNullParameter(userDeserializer, "userDeserializer");
        this.f36816b = userDeserializer;
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
            c b13 = arr.b(i13);
            if (b13 != null) {
                arrayList.add(d(b13));
            }
        }
        return arrayList;
    }

    @Override // ke0.a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final gz0 d(c json) {
        Intrinsics.checkNotNullParameter(json, "json");
        Object e13 = c.f125622b.e(json.f125623a, gz0.class);
        Intrinsics.g(e13, "null cannot be cast to non-null type com.pinterest.api.model.UserReaction");
        gz0 gz0Var = (gz0) e13;
        c m13 = json.m("user");
        if (m13 != null) {
            gz0Var.f38191d = (wy0) this.f36816b.e(m13, true, true);
        }
        return gz0Var;
    }
}
