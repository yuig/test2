package y52;

import a.cb;
import com.pinterest.activity.sendapin.model.SendableObject;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final SendableObject f137786a;

    /* renamed from: b, reason: collision with root package name */
    public final p32.c f137787b;

    /* renamed from: c, reason: collision with root package name */
    public final p32.f f137788c;

    /* renamed from: d, reason: collision with root package name */
    public final String f137789d;

    /* renamed from: e, reason: collision with root package name */
    public final i91.b f137790e;

    public d(SendableObject sendableObject, p32.c inviteCategory, p32.f inviteChannel, String videoUri, i91.b boardPreviewState) {
        Intrinsics.checkNotNullParameter(sendableObject, "sendableObject");
        Intrinsics.checkNotNullParameter(inviteCategory, "inviteCategory");
        Intrinsics.checkNotNullParameter(inviteChannel, "inviteChannel");
        Intrinsics.checkNotNullParameter(videoUri, "videoUri");
        Intrinsics.checkNotNullParameter(boardPreviewState, "boardPreviewState");
        this.f137786a = sendableObject;
        this.f137787b = inviteCategory;
        this.f137788c = inviteChannel;
        this.f137789d = videoUri;
        this.f137790e = boardPreviewState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f137786a, dVar.f137786a) && this.f137787b == dVar.f137787b && this.f137788c == dVar.f137788c && Intrinsics.d(this.f137789d, dVar.f137789d) && Intrinsics.d(this.f137790e, dVar.f137790e);
    }

    public final int hashCode() {
        return this.f137790e.hashCode() + cb.d(this.f137789d, (this.f137788c.hashCode() + ((this.f137787b.hashCode() + (this.f137786a.hashCode() * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        return "ShareBoardVideoParams(sendableObject=" + this.f137786a + ", inviteCategory=" + this.f137787b + ", inviteChannel=" + this.f137788c + ", videoUri=" + this.f137789d + ", boardPreviewState=" + this.f137790e + ")";
    }
}
