package v80;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import r72.u1;

/* loaded from: classes5.dex */
public final class a extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final a f124478j = new a(0);

    /* renamed from: k, reason: collision with root package name */
    public static final a f124479k = new a(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f124480i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i13) {
        super(1);
        this.f124480i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f124480i) {
            case 0:
                return Boolean.valueOf(obj instanceof u1);
            default:
                u1 item = (u1) obj;
                Intrinsics.checkNotNullParameter(item, "item");
                String str = item.f106676h;
                if (str == null) {
                    return null;
                }
                return str;
        }
    }
}
