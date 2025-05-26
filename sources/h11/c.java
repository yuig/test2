package h11;

import java.util.List;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public String f66453a;

    /* renamed from: b, reason: collision with root package name */
    public String f66454b;

    /* renamed from: c, reason: collision with root package name */
    public String f66455c;

    /* renamed from: d, reason: collision with root package name */
    public final List f66456d = q0.f80391a;

    public final void a() {
        Intrinsics.checkNotNullParameter("", "boardName");
        this.f66453a = "";
    }

    public final d b() {
        String str = this.f66453a;
        if (str == null) {
            Intrinsics.r("boardName");
            throw null;
        }
        String str2 = this.f66455c;
        String str3 = this.f66454b;
        if (str3 == null) {
            str3 = "";
        }
        return new d(null, str, str2, str3, false, false, 0, null, this.f66456d);
    }

    public final void c(String str) {
        this.f66454b = str;
    }

    public final void d(String str) {
        this.f66455c = str;
    }
}
