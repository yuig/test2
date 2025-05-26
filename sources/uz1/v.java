package uz1;

import a.cb;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final Context f123318a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f123319b;

    /* renamed from: c, reason: collision with root package name */
    public final List f123320c;

    /* renamed from: d, reason: collision with root package name */
    public final String f123321d;

    /* renamed from: e, reason: collision with root package name */
    public final String f123322e;

    /* renamed from: f, reason: collision with root package name */
    public final PendingIntent f123323f;

    /* renamed from: g, reason: collision with root package name */
    public final hs1.q f123324g;

    public v(Context context, Resources resources, List bitmaps, String titleText, String bodyText, PendingIntent pendingIntent, hs1.q imageCache) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(bitmaps, "bitmaps");
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        Intrinsics.checkNotNullParameter(bodyText, "bodyText");
        Intrinsics.checkNotNullParameter(pendingIntent, "pendingIntent");
        Intrinsics.checkNotNullParameter(imageCache, "imageCache");
        this.f123318a = context;
        this.f123319b = resources;
        this.f123320c = bitmaps;
        this.f123321d = titleText;
        this.f123322e = bodyText;
        this.f123323f = pendingIntent;
        this.f123324g = imageCache;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Intrinsics.d(this.f123318a, vVar.f123318a) && Intrinsics.d(this.f123319b, vVar.f123319b) && Intrinsics.d(this.f123320c, vVar.f123320c) && Intrinsics.d(this.f123321d, vVar.f123321d) && Intrinsics.d(this.f123322e, vVar.f123322e) && Intrinsics.d(this.f123323f, vVar.f123323f) && Intrinsics.d(this.f123324g, vVar.f123324g);
    }

    public final int hashCode() {
        return this.f123324g.hashCode() + ((this.f123323f.hashCode() + cb.d(this.f123322e, cb.d(this.f123321d, ep.b.c(this.f123320c, (this.f123319b.hashCode() + (this.f123318a.hashCode() * 31)) * 31, 31), 31), 31)) * 31);
    }

    public final String toString() {
        return "PushNotificationRemoteViewsData(context=" + this.f123318a + ", resources=" + this.f123319b + ", bitmaps=" + this.f123320c + ", titleText=" + this.f123321d + ", bodyText=" + this.f123322e + ", pendingIntent=" + this.f123323f + ", imageCache=" + this.f123324g + ")";
    }
}
