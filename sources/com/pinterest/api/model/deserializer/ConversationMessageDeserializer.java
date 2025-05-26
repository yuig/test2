package com.pinterest.api.model.deserializer;

import com.pinterest.api.model.mv;
import com.pinterest.deserializers.ModelDeserializerWithSaveAndMerge;
import d12.i;
import dl1.l;
import dl1.s;
import dl1.t;
import fl1.e;
import j10.d;
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

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B5\b\u0007\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\b\u0001\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/pinterest/api/model/deserializer/ConversationMessageDeserializer;", "Lcom/pinterest/deserializers/ModelDeserializerWithSaveAndMerge;", "Lcom/pinterest/api/model/mv;", "Lke0/b;", "Lse2/a;", "Ldl1/t;", "lazyMessageRepository", "Ld12/i;", "repositoryBatcher", "Lfl1/e;", "messageModelHelper", "<init>", "(Lse2/a;Ld12/i;Lfl1/e;)V", "repository_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class ConversationMessageDeserializer extends ModelDeserializerWithSaveAndMerge<mv> implements b {

    /* renamed from: b, reason: collision with root package name */
    public final a f36759b;

    /* renamed from: c, reason: collision with root package name */
    public final i f36760c;

    /* renamed from: d, reason: collision with root package name */
    public final e f36761d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationMessageDeserializer(@NotNull a lazyMessageRepository, @NotNull i repositoryBatcher, @NotNull e messageModelHelper) {
        super("message");
        Intrinsics.checkNotNullParameter(lazyMessageRepository, "lazyMessageRepository");
        Intrinsics.checkNotNullParameter(repositoryBatcher, "repositoryBatcher");
        Intrinsics.checkNotNullParameter(messageModelHelper, "messageModelHelper");
        Intrinsics.checkNotNullParameter("message", "jsonType");
        this.f36759b = lazyMessageRepository;
        this.f36760c = repositoryBatcher;
        this.f36761d = messageModelHelper;
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
            if (Intrinsics.d(arr.j(i13).o("type", ""), "message")) {
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
        List F0 = CollectionsKt.F0(list);
        Iterator it = F0.iterator();
        while (it.hasNext()) {
            ((l) ((t) ((bf2.b) this.f36759b).get())).Z((mv) it.next());
        }
        new d(F0, this).b();
    }

    @Override // com.pinterest.deserializers.ModelDeserializerWithSaveAndMerge
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final mv e(c json, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(json, "json");
        c m13 = json.m("data");
        if (m13 != null) {
            json = m13;
        }
        Object e13 = c.f125622b.e(json.f125623a, mv.class);
        Intrinsics.g(e13, "null cannot be cast to non-null type com.pinterest.api.model.Message");
        s sVar = (mv) e13;
        if (z14) {
            String id3 = sVar.getId();
            t tVar = (t) ((bf2.b) this.f36759b).get();
            Intrinsics.f(id3);
            mv mvVar = (mv) ((l) tVar).O(id3);
            if (mvVar != null) {
                sVar = this.f36761d.a(mvVar, sVar);
            }
        }
        if (z13) {
            f(e0.b(sVar));
        }
        return (mv) sVar;
    }
}
