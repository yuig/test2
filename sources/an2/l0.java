package an2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class l0 extends n0 {
    @Override // an2.n0
    public final String escape(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        return kotlin.text.z.n(kotlin.text.z.n(string, "<", "&lt;"), ">", "&gt;");
    }
}
