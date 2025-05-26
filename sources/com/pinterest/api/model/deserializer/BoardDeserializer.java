package com.pinterest.api.model.deserializer;

import com.pinterest.api.model.v7;
import com.pinterest.deserializers.ModelDeserializerWithSaveAndMerge;
import d12.i;
import dl1.l;
import dl1.s;
import dl1.t;
import fl1.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ke0.b;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import se2.a;
import vd0.c;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B;\b\u0007\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0014\b\u0001\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\t0\u0004¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/pinterest/api/model/deserializer/BoardDeserializer;", "Lcom/pinterest/deserializers/ModelDeserializerWithSaveAndMerge;", "Lcom/pinterest/api/model/v7;", "Lke0/b;", "Lse2/a;", "Ldl1/t;", "lazyBoardRepository", "Ld12/i;", "repositoryBatcher", "Lfl1/e;", "lazyModelMerger", "<init>", "(Lse2/a;Ld12/i;Lse2/a;)V", "repository_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class BoardDeserializer extends ModelDeserializerWithSaveAndMerge<v7> implements b {

    /* renamed from: b, reason: collision with root package name */
    public final a f36742b;

    /* renamed from: c, reason: collision with root package name */
    public final i f36743c;

    /* renamed from: d, reason: collision with root package name */
    public final a f36744d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoardDeserializer(@NotNull a lazyBoardRepository, @NotNull i repositoryBatcher, @NotNull a lazyModelMerger) {
        super("board");
        Intrinsics.checkNotNullParameter(lazyBoardRepository, "lazyBoardRepository");
        Intrinsics.checkNotNullParameter(repositoryBatcher, "repositoryBatcher");
        Intrinsics.checkNotNullParameter(lazyModelMerger, "lazyModelMerger");
        Intrinsics.checkNotNullParameter("board", "jsonType");
        this.f36742b = lazyBoardRepository;
        this.f36743c = repositoryBatcher;
        this.f36744d = lazyModelMerger;
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
            if (Intrinsics.d(arr.j(i13).o("type", ""), "board")) {
                c json = arr.j(i13);
                Intrinsics.checkNotNullExpressionValue(json, "optJsonObject(...)");
                Intrinsics.checkNotNullParameter(json, "json");
                arrayList.add(e(json, false, false));
            }
        }
        f(arrayList);
        return arrayList;
    }

    @Override // ke0.a
    public final s d(c json) {
        Intrinsics.checkNotNullParameter(json, "json");
        return e(json, false, false);
    }

    public final void f(List list) {
        List F0 = CollectionsKt.F0(list);
        Iterator it = F0.iterator();
        while (it.hasNext()) {
            ((l) ((t) ((bf2.b) this.f36742b).get())).Z((v7) it.next());
        }
        new j10.a(F0, this).b();
    }

    @Override // com.pinterest.deserializers.ModelDeserializerWithSaveAndMerge
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final v7 e(c json, boolean z13, boolean z14) {
        String id3;
        v7 v7Var;
        Intrinsics.checkNotNullParameter(json, "json");
        c m13 = json.m("data");
        if (m13 != null) {
            json = m13;
        }
        Object e13 = c.f125622b.e(json.f125623a, v7.class);
        Intrinsics.g(e13, "null cannot be cast to non-null type com.pinterest.api.model.Board");
        s sVar = (v7) e13;
        if (z14 && (id3 = sVar.getId()) != null && (v7Var = (v7) ((l) ((t) ((bf2.b) this.f36742b).get())).O(id3)) != null) {
            sVar = ((e) ((bf2.b) this.f36744d).get()).a(v7Var, sVar);
        }
        if (z13) {
            f(e0.b(sVar));
        }
        return (v7) sVar;
    }
}
