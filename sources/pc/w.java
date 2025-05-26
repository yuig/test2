package pc;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class w extends q {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(String name, String className) {
        super(name);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(className, "className");
    }
}
