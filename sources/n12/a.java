package n12;

import com.pinterest.activity.board.model.CollaboratorInviteFeed;
import com.pinterest.api.model.deserializer.CollaboratorInviteDeserializer;
import kotlin.jvm.internal.Intrinsics;
import rz.d;
import vd0.c;

/* loaded from: classes2.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final CollaboratorInviteDeserializer f88925a;

    public a(CollaboratorInviteDeserializer collaboratorInviteDeserializer) {
        Intrinsics.checkNotNullParameter(collaboratorInviteDeserializer, "collaboratorInviteDeserializer");
        this.f88925a = collaboratorInviteDeserializer;
    }

    @Override // rz.d
    public final Object b(c pinterestJsonObject) {
        Intrinsics.checkNotNullParameter(pinterestJsonObject, "pinterestJsonObject");
        return new CollaboratorInviteFeed(pinterestJsonObject, null, this.f88925a);
    }
}
