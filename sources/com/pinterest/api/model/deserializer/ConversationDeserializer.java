package com.pinterest.api.model.deserializer;

import com.pinterest.api.model.i7;
import com.pinterest.api.model.ue;
import com.pinterest.deserializers.ModelDeserializerWithSaveAndMerge;
import d12.i;
import dl1.l;
import dl1.s;
import dl1.t;
import dl1.u;
import fl1.e;
import java.util.ArrayList;
import java.util.List;
import ke0.b;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import org.jetbrains.annotations.NotNull;
import se2.a;
import vd0.c;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B=\b\u0007\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\b\u0001\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/pinterest/api/model/deserializer/ConversationDeserializer;", "Lcom/pinterest/deserializers/ModelDeserializerWithSaveAndMerge;", "Lcom/pinterest/api/model/ue;", "Lke0/b;", "Lse2/a;", "Ldl1/t;", "conversationRepository", "Ld12/i;", "repositoryBatcher", "Lel1/b;", "apolloModelHelper", "Lfl1/e;", "modelMerger", "<init>", "(Lse2/a;Ld12/i;Lel1/b;Lfl1/e;)V", "repository_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class ConversationDeserializer extends ModelDeserializerWithSaveAndMerge<ue> implements b {

    /* renamed from: b, reason: collision with root package name */
    public final a f36755b;

    /* renamed from: c, reason: collision with root package name */
    public final i f36756c;

    /* renamed from: d, reason: collision with root package name */
    public final el1.b f36757d;

    /* renamed from: e, reason: collision with root package name */
    public final e f36758e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationDeserializer(@NotNull a conversationRepository, @NotNull i repositoryBatcher, @NotNull el1.b apolloModelHelper, @NotNull e modelMerger) {
        super("conversation");
        Intrinsics.checkNotNullParameter(conversationRepository, "conversationRepository");
        Intrinsics.checkNotNullParameter(repositoryBatcher, "repositoryBatcher");
        Intrinsics.checkNotNullParameter(apolloModelHelper, "apolloModelHelper");
        Intrinsics.checkNotNullParameter(modelMerger, "modelMerger");
        Intrinsics.checkNotNullParameter("conversation", "jsonType");
        this.f36755b = conversationRepository;
        this.f36756c = repositoryBatcher;
        this.f36757d = apolloModelHelper;
        this.f36758e = modelMerger;
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
            if (Intrinsics.d(arr.j(i13).o("type", ""), "conversation")) {
                c json = arr.j(i13);
                Intrinsics.checkNotNullExpressionValue(json, "optJsonObject(...)");
                Intrinsics.checkNotNullParameter(json, "json");
                arrayList.add(e(json, true, false));
            }
        }
        f(arrayList);
        return arrayList;
    }

    @Override // ke0.a
    public final s d(c json) {
        Intrinsics.checkNotNullParameter(json, "json");
        return e(json, true, false);
    }

    public final void f(List list) {
        String id3;
        List<ue> F0 = CollectionsKt.F0(list);
        for (ue model : F0) {
            ((l) ((t) ((bf2.b) this.f36755b).get())).Z(model);
            i7 i7Var = (i7) this.f36757d;
            i7Var.getClass();
            Intrinsics.checkNotNullParameter(model, "model");
            if (i7Var.d(model) && (id3 = model.getId()) != null && !z.j(id3)) {
                String id4 = model.getId();
                Intrinsics.checkNotNullExpressionValue(id4, "getUid(...)");
                u uVar = new u(id4);
                el1.a aVar = i7Var.f38687b;
                if (aVar != null) {
                    aVar.h(uVar, model);
                }
            }
        }
        new j10.c(F0, this).b();
    }

    @Override // com.pinterest.deserializers.ModelDeserializerWithSaveAndMerge
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final ue e(c json, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(json, "json");
        c m13 = json.m("data");
        if (m13 != null) {
            json = m13;
        }
        Object e13 = c.f125622b.e(json.f125623a, ue.class);
        Intrinsics.g(e13, "null cannot be cast to non-null type com.pinterest.api.model.Conversation");
        s sVar = (ue) e13;
        if (z14) {
            String id3 = sVar.getId();
            t tVar = (t) ((bf2.b) this.f36755b).get();
            Intrinsics.f(id3);
            ue ueVar = (ue) ((l) tVar).O(id3);
            if (ueVar != null) {
                sVar = this.f36758e.a(ueVar, sVar);
            }
        }
        if (z13) {
            f(e0.b(sVar));
        }
        return (ue) sVar;
    }
}
