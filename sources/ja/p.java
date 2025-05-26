package ja;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public final String[] f75253a;

    public p(String[] tables) {
        Intrinsics.checkNotNullParameter(tables, "tables");
        this.f75253a = tables;
    }

    public boolean a() {
        return false;
    }

    public abstract void b(Set set);
}
