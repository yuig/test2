package oe;

import androidx.media3.ui.z;
import df.j1;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class p extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f94206i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ List f94207j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(List list, int i13) {
        super(2);
        this.f94206i = i13;
        this.f94207j = list;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f94206i;
        List list = this.f94207j;
        switch (i13) {
            case 0:
                j1.x1(new z(12, (Integer) obj2, list));
                return Unit.f80348a;
            default:
                Integer num = (Integer) obj2;
                Intrinsics.checkNotNullParameter((en0.a) obj, "<anonymous parameter 0>");
                if (num == null) {
                    num = 0;
                }
                return Integer.valueOf(Math.max(num.intValue(), list.size()));
        }
    }
}
