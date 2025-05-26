package hh1;

import android.content.Context;
import android.content.res.Resources;
import df.j1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final f f69182a = new f(0);

    /* renamed from: b, reason: collision with root package name */
    public static final j f69183b = new j();

    /* renamed from: c, reason: collision with root package name */
    public static final h f69184c = new h();

    /* renamed from: d, reason: collision with root package name */
    public static final k f69185d = new k();

    /* renamed from: e, reason: collision with root package name */
    public static final f f69186e = new f(1);

    public static final m a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        return new m(j1.f0(resources), 0, 0, 0, 0);
    }
}
