package com.pinterest.api.model.deserializer;

import com.pinterest.api.model.q8;
import com.pinterest.api.model.vh;
import com.pinterest.deserializers.ModelDeserializerWithSaveAndMerge;
import dl1.s;
import java.util.ArrayList;
import java.util.Iterator;
import ke0.a;
import kotlin.Metadata;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vd0.c;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/pinterest/api/model/deserializer/BoardMoreIdeasCardsCarouselDeserializer;", "Lke0/a;", "Lcom/pinterest/api/model/q8;", "Lcom/pinterest/deserializers/ModelDeserializerWithSaveAndMerge;", "Lcom/pinterest/api/model/vh;", "dynamicStoryDeserializer", "<init>", "(Lcom/pinterest/deserializers/ModelDeserializerWithSaveAndMerge;)V", "repository_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class BoardMoreIdeasCardsCarouselDeserializer extends a {

    /* renamed from: b, reason: collision with root package name */
    public final ModelDeserializerWithSaveAndMerge f36749b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoardMoreIdeasCardsCarouselDeserializer(@NotNull ModelDeserializerWithSaveAndMerge<vh> dynamicStoryDeserializer) {
        super("board_more_ideas_cards_carousel");
        Intrinsics.checkNotNullParameter(dynamicStoryDeserializer, "dynamicStoryDeserializer");
        this.f36749b = dynamicStoryDeserializer;
    }

    @Override // ke0.a
    public final s d(c json) {
        Intrinsics.checkNotNullParameter(json, "json");
        String o13 = json.o("id", "");
        Intrinsics.checkNotNullExpressionValue(o13, "optString(...)");
        q8 q8Var = new q8(o13);
        vd0.a c13 = json.c("cards");
        if (c13 != null) {
            ArrayList arrayList = new ArrayList(g0.q(c13, 10));
            Iterator it = c13.iterator();
            while (it.hasNext()) {
                c cVar = (c) it.next();
                Intrinsics.f(cVar);
                arrayList.add((vh) this.f36749b.e(cVar, false, false));
            }
            q8Var.a(arrayList);
        }
        json.d("title");
        return q8Var;
    }
}
