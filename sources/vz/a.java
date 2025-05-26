package vz;

import com.pinterest.api.model.BoardFeed;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a implements rz.d {

    /* renamed from: a, reason: collision with root package name */
    public final ke0.b f126894a;

    public a(ke0.b boardFeedDeserializer) {
        Intrinsics.checkNotNullParameter(boardFeedDeserializer, "boardFeedDeserializer");
        this.f126894a = boardFeedDeserializer;
    }

    @Override // rz.d
    public final Object b(vd0.c pinterestJsonObject) {
        Intrinsics.checkNotNullParameter(pinterestJsonObject, "pinterestJsonObject");
        vd0.c m13 = pinterestJsonObject.m("data");
        if (m13 != null) {
            pinterestJsonObject = m13;
        }
        return new BoardFeed(pinterestJsonObject, "", this.f126894a);
    }
}
