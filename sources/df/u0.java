package df;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: d, reason: collision with root package name */
    public static final wc.b f54860d = new wc.b(28, 0);

    /* renamed from: e, reason: collision with root package name */
    public static final HashMap f54861e = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final le.g0 f54862a;

    /* renamed from: b, reason: collision with root package name */
    public final String f54863b;

    /* renamed from: c, reason: collision with root package name */
    public StringBuilder f54864c;

    public u0(le.g0 behavior) {
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        Intrinsics.checkNotNullParameter("Request", "tag");
        this.f54862a = behavior;
        k1.e("Request", "tag");
        this.f54863b = Intrinsics.n("Request", "FacebookSDK.");
        this.f54864c = new StringBuilder();
    }

    public final void a(Object value, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Object[] args = {key, value};
        Intrinsics.checkNotNullParameter("  %s:\t%s\n", "format");
        Intrinsics.checkNotNullParameter(args, "args");
        c();
    }

    public final void b() {
        String string = this.f54864c.toString();
        Intrinsics.checkNotNullExpressionValue(string, "contents.toString()");
        Intrinsics.checkNotNullParameter(string, "string");
        wc.b.z(this.f54862a, this.f54863b, string);
        this.f54864c = new StringBuilder();
    }

    public final void c() {
        le.v vVar = le.v.f83104a;
        le.v.i(this.f54862a);
    }
}
