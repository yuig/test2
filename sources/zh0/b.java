package zh0;

import java.util.Random;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class b extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public static final b f141973i = new b(0);

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Boolean.valueOf(new Random().nextInt(1000) < 5);
    }
}
