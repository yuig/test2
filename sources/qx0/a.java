package qx0;

import bs1.c;
import com.pinterest.api.model.e40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.ox;
import com.pinterest.api.model.rx;
import com.pinterest.api.model.v7;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class a extends s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final a f105321j = new a(0);

    /* renamed from: k, reason: collision with root package name */
    public static final a f105322k = new a(1);

    /* renamed from: l, reason: collision with root package name */
    public static final a f105323l = new a(2);

    /* renamed from: m, reason: collision with root package name */
    public static final a f105324m = new a(3);

    /* renamed from: n, reason: collision with root package name */
    public static final a f105325n = new a(4);

    /* renamed from: o, reason: collision with root package name */
    public static final a f105326o = new a(5);

    /* renamed from: p, reason: collision with root package name */
    public static final a f105327p = new a(6);

    /* renamed from: q, reason: collision with root package name */
    public static final a f105328q = new a(7);

    /* renamed from: r, reason: collision with root package name */
    public static final a f105329r = new a(8);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f105330i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i13) {
        super(1);
        this.f105330i = i13;
    }

    public final Boolean b(Object obj) {
        switch (this.f105330i) {
            case 0:
                return Boolean.valueOf(obj instanceof f30);
            case 1:
                return Boolean.valueOf(obj instanceof rx);
            default:
                return Boolean.valueOf(obj instanceof v7);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f105330i;
        switch (i13) {
            case 0:
                return b(obj);
            case 1:
                return b(obj);
            case 2:
                return b(obj);
            case 3:
                e40 it = (e40) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return it.c();
            case 4:
                ox oxVar = (ox) obj;
                switch (i13) {
                    case 4:
                        return oxVar.f40827a;
                    case 5:
                        return oxVar.f40827a;
                    default:
                        return oxVar.f40827a;
                }
            case 5:
                ox oxVar2 = (ox) obj;
                switch (i13) {
                    case 4:
                        return oxVar2.f40827a;
                    case 5:
                        return oxVar2.f40827a;
                    default:
                        return oxVar2.f40827a;
                }
            case 6:
                f30 it2 = (f30) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return c.B0(it2);
            case 7:
                ox oxVar3 = (ox) obj;
                switch (i13) {
                    case 4:
                        return oxVar3.f40827a;
                    case 5:
                        return oxVar3.f40827a;
                    default:
                        return oxVar3.f40827a;
                }
            default:
                rx it3 = (rx) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                ArrayList arrayList = it3.f41711f;
                Intrinsics.checkNotNullExpressionValue(arrayList, "getImages(...)");
                return (String) CollectionsKt.firstOrNull(arrayList);
        }
    }
}
