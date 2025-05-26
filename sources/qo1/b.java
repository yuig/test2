package qo1;

import ac2.f;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import yn2.c0;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f104529a;

    /* renamed from: b, reason: collision with root package name */
    public String f104530b;

    /* renamed from: c, reason: collision with root package name */
    public int f104531c;

    public b(boolean z13) {
        this.f104529a = z13;
    }

    public final String a() {
        String str = "";
        if (!this.f104529a) {
            return "";
        }
        String str2 = this.f104530b;
        if (str2 != null && !z.j(str2)) {
            str = a.a.j("&previous_page_pin_ids=", this.f104530b);
        }
        return a.a.D(str, a.a.d("&item_count=", this.f104531c), a.a.j("&video_autoplay_disabled=", String.valueOf(!f.f1945a.c() ? 1 : 0)));
    }

    public final void b(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        if (this.f104529a) {
            this.f104530b = c0.n(c0.j(CollectionsKt.K(CollectionsKt.y0(items, 3)), a.f104526j), ",", a.f104527k, 30);
            this.f104531c = items.size() + this.f104531c;
        }
    }
}
