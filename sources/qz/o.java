package qz;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class o extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final o f105416j = new o(0);

    /* renamed from: k, reason: collision with root package name */
    public static final o f105417k = new o(1);

    /* renamed from: l, reason: collision with root package name */
    public static final o f105418l = new o(2);

    /* renamed from: m, reason: collision with root package name */
    public static final o f105419m = new o(3);

    /* renamed from: n, reason: collision with root package name */
    public static final o f105420n = new o(4);

    /* renamed from: o, reason: collision with root package name */
    public static final o f105421o = new o(5);

    /* renamed from: p, reason: collision with root package name */
    public static final o f105422p = new o(6);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f105423i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i13) {
        super(1);
        this.f105423i = i13;
    }

    public final Boolean b(String it) {
        switch (this.f105423i) {
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(StringsKt.E(it, "as=video", false));
            case 2:
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(StringsKt.E(it, "as=video", false));
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(kotlin.text.z.j(it));
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f105423i) {
            case 0:
                return Unit.f80348a;
            case 1:
                return b((String) obj);
            case 2:
                String it = (String) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                String a03 = StringsKt.a0(it, "thumbnailUrl=", it);
                return StringsKt.d0(';', a03, a03);
            case 3:
                return b((String) obj);
            case 4:
                return b((String) obj);
            case 5:
                String it2 = (String) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                String Z = StringsKt.Z('<', it2, it2);
                String d03 = StringsKt.d0('>', Z, Z);
                String a04 = StringsKt.a0(it2, "pinId=", it2);
                return new Pair(d03, StringsKt.d0(';', a04, a04));
            default:
                Pair it3 = (Pair) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                return Boolean.valueOf(kotlin.text.z.j((CharSequence) it3.f80346a) || kotlin.text.z.j((CharSequence) it3.f80347b));
        }
    }
}
