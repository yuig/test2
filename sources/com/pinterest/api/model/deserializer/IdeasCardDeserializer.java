package com.pinterest.api.model.deserializer;

import com.pinterest.api.model.hr;
import dl1.s;
import ke0.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vd0.c;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/pinterest/api/model/deserializer/IdeasCardDeserializer;", "Lke0/a;", "Lcom/pinterest/api/model/hr;", "Lcom/pinterest/api/model/jr;", "ideasCardFeedMetadataDeserializer", "<init>", "(Lke0/a;)V", "repository_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class IdeasCardDeserializer extends a {

    /* renamed from: b, reason: collision with root package name */
    public final a f36800b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdeasCardDeserializer(@NotNull a ideasCardFeedMetadataDeserializer) {
        super("ideascard");
        Intrinsics.checkNotNullParameter(ideasCardFeedMetadataDeserializer, "ideasCardFeedMetadataDeserializer");
        this.f36800b = ideasCardFeedMetadataDeserializer;
    }

    @Override // ke0.a
    public final s d(c json) {
        Intrinsics.checkNotNullParameter(json, "json");
        Object e13 = c.f125622b.e(json.f125623a, hr.class);
        Intrinsics.g(e13, "null cannot be cast to non-null type com.pinterest.api.model.IdeasCard");
        hr hrVar = (hr) e13;
        c m13 = json.m("board");
        if (m13 != null) {
            m13.o("id", "");
        }
        c m14 = json.m("feed_metadata");
        if (m14 != null) {
        }
        return hrVar;
    }
}
