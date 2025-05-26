package km;

import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static volatile c f80162b;

    /* renamed from: a, reason: collision with root package name */
    public final Set f80163a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(int i13) {
        this(new HashSet());
        if (i13 != 1) {
            this.f80163a = new HashSet();
        }
    }

    public c(HashSet hashSet) {
        this.f80163a = hashSet;
    }
}
