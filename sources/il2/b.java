package il2;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class b extends h {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(File rootDir) {
        super(rootDir);
        Intrinsics.checkNotNullParameter(rootDir, "rootDir");
    }
}
