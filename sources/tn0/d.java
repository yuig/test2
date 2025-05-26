package tn0;

import gb2.i;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class d extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final d f118597j = new d(0);

    /* renamed from: k, reason: collision with root package name */
    public static final d f118598k = new d(1);

    /* renamed from: l, reason: collision with root package name */
    public static final d f118599l = new d(2);

    /* renamed from: m, reason: collision with root package name */
    public static final d f118600m = new d(3);

    /* renamed from: n, reason: collision with root package name */
    public static final d f118601n = new d(4);

    /* renamed from: o, reason: collision with root package name */
    public static final d f118602o = new d(5);

    /* renamed from: p, reason: collision with root package name */
    public static final d f118603p = new d(6);

    /* renamed from: q, reason: collision with root package name */
    public static final d f118604q = new d(7);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f118605i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i13) {
        super(1);
        this.f118605i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f118605i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                List list = (List) obj;
                Intrinsics.checkNotNullParameter(list, "list");
                if (!(CollectionsKt.d0(list) instanceof i)) {
                    break;
                } else {
                    break;
                }
            case 4:
                List it = (List) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                break;
            case 5:
                List it2 = (List) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                break;
            case 6:
                break;
            default:
                break;
        }
        return Unit.f80348a;
    }
}
