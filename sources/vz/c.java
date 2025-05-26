package vz;

import com.pinterest.api.model.BoardSectionFeed;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c implements rz.d {

    /* renamed from: a, reason: collision with root package name */
    public final ke0.b f126895a;

    public c(ke0.b boardSectionDeserializer) {
        Intrinsics.checkNotNullParameter(boardSectionDeserializer, "boardSectionDeserializer");
        this.f126895a = boardSectionDeserializer;
    }

    @Override // rz.d
    public final Object b(vd0.c pinterestJsonObject) {
        Intrinsics.checkNotNullParameter(pinterestJsonObject, "pinterestJsonObject");
        vd0.c m13 = pinterestJsonObject.m("data");
        if (m13 != null) {
            pinterestJsonObject = m13;
        }
        return new BoardSectionFeed(pinterestJsonObject, "", this.f126895a);
    }
}
