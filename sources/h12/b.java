package h12;

import com.pinterest.api.model.BoardInviteFeed;
import com.pinterest.api.model.deserializer.BoardInviteDeserializer;
import kotlin.jvm.internal.Intrinsics;
import rz.d;

/* loaded from: classes2.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final BoardInviteDeserializer f66469a;

    public b(BoardInviteDeserializer boardInviteDeserializer) {
        Intrinsics.checkNotNullParameter(boardInviteDeserializer, "boardInviteDeserializer");
        this.f66469a = boardInviteDeserializer;
    }

    @Override // rz.d
    public final Object b(vd0.c pinterestJsonObject) {
        Intrinsics.checkNotNullParameter(pinterestJsonObject, "pinterestJsonObject");
        return pinterestJsonObject.f125623a.v("data") != null ? new BoardInviteFeed(pinterestJsonObject, null, this.f66469a) : new BoardInviteFeed();
    }
}
