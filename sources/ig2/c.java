package ig2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    public final sg2.a f72249a;

    /* renamed from: b, reason: collision with root package name */
    public final a f72250b;

    public c(uh2.b preferencesService, sg2.a configService, ei2.a writer) {
        Intrinsics.checkNotNullParameter(preferencesService, "preferencesService");
        Intrinsics.checkNotNullParameter(configService, "configService");
        Intrinsics.checkNotNullParameter(writer, "writer");
        this.f72249a = configService;
        this.f72250b = new a(preferencesService, configService, writer);
    }

    public static String a(int i13, String str) {
        if (str.length() <= i13) {
            return str;
        }
        StringBuilder sb3 = new StringBuilder();
        String substring = str.substring(0, i13 - 3);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return a.a.p(sb3, substring, "...");
    }
}
