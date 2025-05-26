package tc;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j extends l {

    /* renamed from: a, reason: collision with root package name */
    public final List f117203a;

    public j(ArrayList list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.f117203a = list;
    }

    public final String toString() {
        return "List (" + this.f117203a.size() + ')';
    }
}
