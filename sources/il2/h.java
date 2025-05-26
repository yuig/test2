package il2;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public final File f72573a;

    public h(File root) {
        Intrinsics.checkNotNullParameter(root, "root");
        this.f72573a = root;
    }

    public abstract File a();
}
