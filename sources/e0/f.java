package e0;

import android.util.Size;
import java.util.Comparator;

/* loaded from: classes2.dex */
public final class f implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f56701a;

    public f(boolean z13) {
        this.f56701a = z13;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Size size = (Size) obj;
        Size size2 = (Size) obj2;
        int signum = Long.signum((size.getWidth() * size.getHeight()) - (size2.getWidth() * size2.getHeight()));
        return this.f56701a ? signum * (-1) : signum;
    }
}
