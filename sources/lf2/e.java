package lf2;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public final /* synthetic */ class e extends p implements Function0 {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Boolean.valueOf(((AtomicBoolean) this.receiver).get());
    }
}
