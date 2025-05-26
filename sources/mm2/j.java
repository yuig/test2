package mm2;

import java.lang.reflect.Modifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class j extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final j f87700i = new j(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        pm2.m it = (pm2.m) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(!Modifier.isStatic(((gm2.y) it).b().getModifiers()));
    }
}
