package uz1;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public final String f123276a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f123277b;

    /* renamed from: c, reason: collision with root package name */
    public final int f123278c;

    /* renamed from: d, reason: collision with root package name */
    public final e f123279d;

    /* renamed from: e, reason: collision with root package name */
    public final String f123280e;

    public b(String link, Map rawMap, int i13, e notifIntentSource, String source) {
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(rawMap, "rawMap");
        Intrinsics.checkNotNullParameter(notifIntentSource, "notifIntentSource");
        Intrinsics.checkNotNullParameter(source, "source");
        this.f123276a = link;
        this.f123277b = rawMap;
        this.f123278c = i13;
        this.f123279d = notifIntentSource;
        this.f123280e = source;
    }

    public static b a(b bVar, String str, e notifIntentSource, int i13) {
        if ((i13 & 1) != 0) {
            str = bVar.f123276a;
        }
        String link = str;
        Intrinsics.checkNotNullParameter(link, "link");
        Map rawMap = bVar.f123277b;
        Intrinsics.checkNotNullParameter(rawMap, "rawMap");
        Intrinsics.checkNotNullParameter(notifIntentSource, "notifIntentSource");
        String source = bVar.f123280e;
        Intrinsics.checkNotNullParameter(source, "source");
        return new b(link, rawMap, bVar.f123278c, notifIntentSource, source);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f123276a, bVar.f123276a) && Intrinsics.d(this.f123277b, bVar.f123277b) && this.f123278c == bVar.f123278c && this.f123279d == bVar.f123279d && Intrinsics.d(this.f123280e, bVar.f123280e);
    }

    public final int hashCode() {
        return this.f123280e.hashCode() + ((this.f123279d.hashCode() + ep.b.b(this.f123278c, a.c.e(this.f123277b, this.f123276a.hashCode() * 31, 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("WebHookIntentData(link=");
        sb3.append(this.f123276a);
        sb3.append(", rawMap=");
        sb3.append(this.f123277b);
        sb3.append(", notificationId=");
        sb3.append(this.f123278c);
        sb3.append(", notifIntentSource=");
        sb3.append(this.f123279d);
        sb3.append(", source=");
        return a.a.p(sb3, this.f123280e, ")");
    }

    public /* synthetic */ b(String str, Map map, int i13, e eVar) {
        this(str, map, i13, eVar, "PUSH_NOTIF");
    }
}
