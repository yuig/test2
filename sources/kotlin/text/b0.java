package kotlin.text;

import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class b0 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ List f80477i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f80478j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(List list, boolean z13) {
        super(2);
        this.f80477i = list;
        this.f80478j = z13;
    }

    public final Pair<Integer, Integer> b(@NotNull CharSequence $receiver, int i13) {
        Object obj;
        Pair pair;
        Object obj2;
        Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
        List list = this.f80477i;
        boolean z13 = this.f80478j;
        if (z13 || list.size() != 1) {
            if (i13 < 0) {
                i13 = 0;
            }
            IntRange intRange = new IntRange(i13, $receiver.length(), 1);
            boolean z14 = $receiver instanceof String;
            int i14 = intRange.f80455c;
            int i15 = intRange.f80454b;
            if (z14) {
                if ((i14 > 0 && i13 <= i15) || (i14 < 0 && i15 <= i13)) {
                    while (true) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it.next();
                            String str = (String) obj2;
                            if (z.k(0, i13, str.length(), str, (String) $receiver, z13)) {
                                break;
                            }
                        }
                        String str2 = (String) obj2;
                        if (str2 == null) {
                            if (i13 == i15) {
                                break;
                            }
                            i13 += i14;
                        } else {
                            pair = new Pair(Integer.valueOf(i13), str2);
                            break;
                        }
                    }
                }
                pair = null;
            } else {
                if ((i14 > 0 && i13 <= i15) || (i14 < 0 && i15 <= i13)) {
                    while (true) {
                        Iterator it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it2.next();
                            String str3 = (String) obj;
                            if (StringsKt__StringsKt.t(0, i13, str3.length(), str3, $receiver, z13)) {
                                break;
                            }
                        }
                        String str4 = (String) obj;
                        if (str4 == null) {
                            if (i13 == i15) {
                                break;
                            }
                            i13 += i14;
                        } else {
                            pair = new Pair(Integer.valueOf(i13), str4);
                            break;
                        }
                    }
                }
                pair = null;
            }
        } else {
            String str5 = (String) CollectionsKt.r0(list);
            int L = StringsKt.L($receiver, str5, i13, false, 4);
            if (L >= 0) {
                pair = new Pair(Integer.valueOf(L), str5);
            }
            pair = null;
        }
        if (pair == null) {
            return null;
        }
        return new Pair<>(pair.f80346a, Integer.valueOf(((String) pair.f80347b).length()));
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return b((CharSequence) obj, ((Number) obj2).intValue());
    }
}
