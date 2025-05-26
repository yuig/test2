package b01;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import u50.k0;

/* loaded from: classes5.dex */
public final class h extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final h f20738j = new h(0);

    /* renamed from: k, reason: collision with root package name */
    public static final h f20739k = new h(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f20740i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i13) {
        super(1);
        this.f20740i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f20740i) {
            case 0:
                rn1.a it = (rn1.a) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                vn1.g gVar = vn1.g.HEADING_400;
                int i13 = iy1.f.pear_related_topics_title;
                String[] formatArgs = new String[0];
                Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
                return rn1.a.y(it, new k0(i13, new ArrayList(0)), null, null, null, gVar, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097134);
            default:
                return Unit.f80348a;
        }
    }
}
