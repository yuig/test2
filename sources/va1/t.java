package va1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public abstract class t implements f {

    /* renamed from: a, reason: collision with root package name */
    public final List f125242a;

    /* renamed from: b, reason: collision with root package name */
    public final String f125243b;

    public t(@NotNull List<String> filterList) {
        Intrinsics.checkNotNullParameter(filterList, "filterList");
        this.f125242a = filterList;
        this.f125243b = ol2.f.f96454a.toString();
    }

    public List a() {
        return this.f125242a;
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getF39332b() {
        return this.f125243b;
    }
}
