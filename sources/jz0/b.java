package jz0;

import com.pinterest.api.model.cb0;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.kb0;
import iz0.q;
import iz0.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.e0;
import kotlin.collections.f0;
import kotlin.collections.g0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import o82.l0;

/* loaded from: classes5.dex */
public final class b extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final b f77750j = new b(0);

    /* renamed from: k, reason: collision with root package name */
    public static final b f77751k = new b(1);

    /* renamed from: l, reason: collision with root package name */
    public static final b f77752l = new b(2);

    /* renamed from: m, reason: collision with root package name */
    public static final b f77753m = new b(3);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f77754i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i13) {
        super(1);
        this.f77754i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f77754i;
        switch (i13) {
            case 0:
                cb0 quizOutput = (cb0) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(quizOutput, "quizOutput");
                        return e0.b(new q(quizOutput));
                    default:
                        Intrinsics.checkNotNullParameter(quizOutput, "quizOutput");
                        return e0.b(new q(quizOutput));
                }
            case 1:
                cb0 quizOutput2 = (cb0) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(quizOutput2, "quizOutput");
                        return e0.b(new q(quizOutput2));
                    default:
                        Intrinsics.checkNotNullParameter(quizOutput2, "quizOutput");
                        return e0.b(new q(quizOutput2));
                }
            case 2:
                List sections = (List) obj;
                Intrinsics.checkNotNullParameter(sections, "sections");
                List list = sections;
                ArrayList arrayList = new ArrayList(g0.q(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new iz0.s((kb0) it.next()));
                }
                return arrayList;
            default:
                b22.d pinListWithBookmark = (b22.d) obj;
                Intrinsics.checkNotNullParameter(pinListWithBookmark, "pinListWithBookmark");
                List list2 = pinListWithBookmark.f21289a;
                ArrayList arrayList2 = new ArrayList(g0.q(list2, 10));
                int i14 = 0;
                for (Object obj2 : list2) {
                    int i15 = i14 + 1;
                    if (i14 < 0) {
                        f0.p();
                        throw null;
                    }
                    arrayList2.add(new r(i14, (f30) obj2));
                    i14 = i15;
                }
                return new l0(arrayList2, pinListWithBookmark.f21290b);
        }
    }
}
