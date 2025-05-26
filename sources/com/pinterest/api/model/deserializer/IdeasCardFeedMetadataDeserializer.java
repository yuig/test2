package com.pinterest.api.model.deserializer;

import com.pinterest.api.model.jr;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.zs;
import com.pinterest.deserializers.ModelDeserializerWithSaveAndMerge;
import dl1.s;
import ke0.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vd0.c;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B3\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0001\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/pinterest/api/model/deserializer/IdeasCardFeedMetadataDeserializer;", "Lke0/a;", "Lcom/pinterest/api/model/jr;", "Lcom/pinterest/api/model/v7;", "boardDeserializer", "Lcom/pinterest/api/model/ba;", "boardSectionDeserializer", "Lcom/pinterest/deserializers/ModelDeserializerWithSaveAndMerge;", "Lcom/pinterest/api/model/zs;", "interestDeserializer", "<init>", "(Lke0/a;Lke0/a;Lcom/pinterest/deserializers/ModelDeserializerWithSaveAndMerge;)V", "repository_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class IdeasCardFeedMetadataDeserializer extends a {

    /* renamed from: b, reason: collision with root package name */
    public final a f36801b;

    /* renamed from: c, reason: collision with root package name */
    public final a f36802c;

    /* renamed from: d, reason: collision with root package name */
    public final ModelDeserializerWithSaveAndMerge f36803d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdeasCardFeedMetadataDeserializer(@NotNull a boardDeserializer, @NotNull a boardSectionDeserializer, @NotNull ModelDeserializerWithSaveAndMerge<zs> interestDeserializer) {
        super("ideas_card_feed_metadata");
        Intrinsics.checkNotNullParameter(boardDeserializer, "boardDeserializer");
        Intrinsics.checkNotNullParameter(boardSectionDeserializer, "boardSectionDeserializer");
        Intrinsics.checkNotNullParameter(interestDeserializer, "interestDeserializer");
        this.f36801b = boardDeserializer;
        this.f36802c = boardSectionDeserializer;
        this.f36803d = interestDeserializer;
    }

    @Override // ke0.a
    public final s d(c json) {
        c m13;
        Intrinsics.checkNotNullParameter(json, "json");
        Object e13 = c.f125622b.e(json.f125623a, jr.class);
        Intrinsics.g(e13, "null cannot be cast to non-null type com.pinterest.api.model.IdeasCardFeedMetadata");
        jr jrVar = (jr) e13;
        c m14 = json.m("board");
        if (m14 != null) {
            jrVar.c((v7) this.f36801b.d(m14));
        }
        String feedType = jrVar.getFeedType();
        if (Intrinsics.d(feedType, "section_to_pins")) {
            c m15 = json.m("section");
            if (m15 != null) {
            }
        } else if (Intrinsics.d(feedType, "interest_to_pins") && (m13 = json.m("interest")) != null) {
        }
        return jrVar;
    }
}
