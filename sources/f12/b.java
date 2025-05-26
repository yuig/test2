package f12;

import com.pinterest.api.model.deserializer.BoardInviteDeserializer;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import rz.d;
import vd0.c;

/* loaded from: classes4.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final BoardInviteDeserializer f60783a;

    public b(BoardInviteDeserializer boardInviteDeserializer) {
        Intrinsics.checkNotNullParameter(boardInviteDeserializer, "boardInviteDeserializer");
        this.f60783a = boardInviteDeserializer;
    }

    @Override // rz.d
    public final Object b(c pinterestJsonObject) {
        Intrinsics.checkNotNullParameter(pinterestJsonObject, "pinterestJsonObject");
        c m13 = pinterestJsonObject.m("data");
        if (m13 != null) {
            return this.f60783a.d(m13);
        }
        throw new NoSuchElementException("data is null, cannot create BoardInvite from null data");
    }
}
