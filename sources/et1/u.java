package et1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class u implements g {
    @Override // et1.g
    public final Object a(wk2.a componentProvider) {
        Intrinsics.checkNotNullParameter(componentProvider, "componentProvider");
        Object obj = componentProvider.get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        return new ht1.q0((c) obj);
    }
}
