package kh2;

import android.content.Context;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class w1 extends kotlin.jvm.internal.p implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public static final w1 f79729a = new w1();

    public w1() {
        super(2, r.class, "createCoreModule", "createCoreModule(Landroid/content/Context;Lio/embrace/android/embracesdk/internal/injection/InitModule;)Lio/embrace/android/embracesdk/internal/injection/CoreModule;", 1);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Context context = (Context) obj;
        b1 initModule = (b1) obj2;
        Intrinsics.checkNotNullParameter(context, "p0");
        Intrinsics.checkNotNullParameter(initModule, "p1");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initModule, "initModule");
        return new q(context, initModule);
    }
}
