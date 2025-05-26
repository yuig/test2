package com.pinterest.api.model.deserializer;

import com.pinterest.api.model.wy0;
import com.pinterest.deserializers.ModelDeserializerWithSaveAndMerge;
import d12.i;
import dl1.s;
import dl1.t;
import fl1.e;
import j10.k;
import j10.l;
import java.util.ArrayList;
import java.util.List;
import ke0.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import se2.a;
import vd0.c;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\rB5\b\u0007\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u0004\u0012\u000e\b\u0001\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/pinterest/api/model/deserializer/UserDeserializer;", "Lcom/pinterest/deserializers/ModelDeserializerWithSaveAndMerge;", "Lcom/pinterest/api/model/wy0;", "Lke0/b;", "Lse2/a;", "Ldl1/t;", "lazyUserRepository", "Lfl1/e;", "userModelMerger", "Ld12/i;", "repositoryBatcher", "<init>", "(Lse2/a;Lfl1/e;Ld12/i;)V", "j10/k", "repository_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class UserDeserializer extends ModelDeserializerWithSaveAndMerge<wy0> implements b {

    /* renamed from: e, reason: collision with root package name */
    public static final k f36811e = new k(null);

    /* renamed from: f, reason: collision with root package name */
    public static UserDeserializer f36812f;

    /* renamed from: b, reason: collision with root package name */
    public final a f36813b;

    /* renamed from: c, reason: collision with root package name */
    public final e f36814c;

    /* renamed from: d, reason: collision with root package name */
    public final i f36815d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserDeserializer(@NotNull a lazyUserRepository, @NotNull e userModelMerger, @NotNull i repositoryBatcher) {
        super("user");
        Intrinsics.checkNotNullParameter(lazyUserRepository, "lazyUserRepository");
        Intrinsics.checkNotNullParameter(userModelMerger, "userModelMerger");
        Intrinsics.checkNotNullParameter(repositoryBatcher, "repositoryBatcher");
        Intrinsics.checkNotNullParameter("user", "jsonType");
        this.f36813b = lazyUserRepository;
        this.f36814c = userModelMerger;
        this.f36815d = repositoryBatcher;
        f36811e.getClass();
        Intrinsics.checkNotNullParameter(this, "<set-?>");
        f36812f = this;
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
            c json = arr.j(i13);
            Intrinsics.checkNotNullExpressionValue(json, "optJsonObject(...)");
            Intrinsics.checkNotNullParameter(json, "json");
            arrayList.add(e(json, false, false));
        }
        new l(arrayList, this).b();
        return arrayList;
    }

    @Override // ke0.a
    public final s d(c json) {
        Intrinsics.checkNotNullParameter(json, "json");
        return e(json, false, false);
    }

    @Override // com.pinterest.deserializers.ModelDeserializerWithSaveAndMerge
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final wy0 e(c json, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(json, "json");
        c m13 = json.m("data");
        if (m13 != null) {
            json = m13;
        }
        c m14 = json.m("pinterest_user");
        if (m14 != null) {
            json = m14;
        }
        Object e13 = c.f125622b.e(json.f125623a, wy0.class);
        Intrinsics.g(e13, "null cannot be cast to non-null type com.pinterest.api.model.User");
        s sVar = (wy0) e13;
        a aVar = this.f36813b;
        if (z14) {
            t tVar = (t) ((bf2.b) aVar).get();
            String id3 = sVar.getId();
            Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
            wy0 wy0Var = (wy0) ((dl1.l) tVar).O(id3);
            if (wy0Var != null) {
                sVar = this.f36814c.a(wy0Var, sVar);
            }
        }
        if (z13) {
            ((dl1.l) ((t) ((bf2.b) aVar).get())).Z(sVar);
        }
        return (wy0) sVar;
    }
}
