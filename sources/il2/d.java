package il2;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d extends h {

    /* renamed from: b, reason: collision with root package name */
    public boolean f72565b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(File rootFile) {
        super(rootFile);
        Intrinsics.checkNotNullParameter(rootFile, "rootFile");
    }

    @Override // il2.h
    public final File a() {
        if (this.f72565b) {
            return null;
        }
        this.f72565b = true;
        return this.f72573a;
    }
}
