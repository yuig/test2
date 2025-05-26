package z9;

import java.util.List;
import java.util.ListIterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* loaded from: classes3.dex */
public final class s implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final String f141284a;

    /* renamed from: b, reason: collision with root package name */
    public final String f141285b;

    public s(String mimeType) {
        List list;
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        List f13 = new Regex("/").f(0, mimeType);
        if (!f13.isEmpty()) {
            ListIterator listIterator = f13.listIterator(f13.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    list = CollectionsKt.y0(f13, listIterator.nextIndex() + 1);
                    break;
                }
            }
        }
        list = kotlin.collections.q0.f80391a;
        this.f141284a = (String) list.get(0);
        this.f141285b = (String) list.get(1);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        s other = (s) obj;
        Intrinsics.checkNotNullParameter(other, "other");
        int i13 = Intrinsics.d(this.f141284a, other.f141284a) ? 2 : 0;
        return Intrinsics.d(this.f141285b, other.f141285b) ? i13 + 1 : i13;
    }
}
