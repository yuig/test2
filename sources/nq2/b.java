package nq2;

import java.security.PrivilegedAction;

/* loaded from: classes4.dex */
public final class b implements PrivilegedAction {
    @Override // java.security.PrivilegedAction
    public final Object run() {
        return System.getProperty("line.separator");
    }
}
