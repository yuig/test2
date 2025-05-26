package rm2;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f108727a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HashMap f108728b;

    public d(f fVar, HashMap hashMap, HashMap hashMap2) {
        this.f108727a = fVar;
        this.f108728b = hashMap;
    }

    public final b a(ym2.g name, String desc) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(desc, "desc");
        String b13 = name.b();
        Intrinsics.checkNotNullExpressionValue(b13, "asString(...)");
        return new b(this, i0.i(b13, desc));
    }
}
