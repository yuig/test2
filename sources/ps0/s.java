package ps0;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class s extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final s f101309j = new s(0);

    /* renamed from: k, reason: collision with root package name */
    public static final s f101310k = new s(1);

    /* renamed from: l, reason: collision with root package name */
    public static final s f101311l = new s(2);

    /* renamed from: m, reason: collision with root package name */
    public static final s f101312m = new s(3);

    /* renamed from: n, reason: collision with root package name */
    public static final s f101313n = new s(4);

    /* renamed from: o, reason: collision with root package name */
    public static final s f101314o = new s(5);

    /* renamed from: p, reason: collision with root package name */
    public static final s f101315p = new s(6);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f101316i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(int i13) {
        super(1);
        this.f101316i = i13;
    }

    public final Boolean b(List it) {
        switch (this.f101316i) {
            case 4:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                break;
        }
        return Boolean.valueOf(!it.isEmpty());
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f101316i) {
            case 0:
                return Unit.f80348a;
            case 1:
                return Unit.f80348a;
            case 2:
                return Unit.f80348a;
            case 3:
                List list = (List) obj;
                Intrinsics.checkNotNullParameter(list, "list");
                return CollectionsKt.d0(list) instanceof gb2.k ? kotlin.collections.m0.F(list, gb2.k.class) : kotlin.collections.q0.f80391a;
            case 4:
                return b((List) obj);
            case 5:
                return b((List) obj);
            default:
                return Unit.f80348a;
        }
    }
}
