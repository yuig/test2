package a72;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes4.dex */
public final class d extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f1267i = 1;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f1268j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f1269k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f1270l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f1271m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f1272n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(int i13, int i14, int i15, int i16, hd2.b bVar) {
        super(1);
        this.f1268j = i13;
        this.f1269k = i14;
        this.f1270l = i15;
        this.f1271m = i16;
        this.f1272n = bVar;
    }

    public final void b(b72.a buildSvg) {
        int i13 = this.f1267i;
        int i14 = this.f1271m;
        int i15 = this.f1270l;
        Object obj = this.f1272n;
        int i16 = this.f1269k;
        int i17 = this.f1268j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(buildSvg, "$this$buildSvg");
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (List) obj) {
                    if (!((hd2.b) obj2).f68914a.isEmpty()) {
                        arrayList.add(obj2);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    buildSvg.d(i17, i16, new c(i15, i14, (hd2.b) it.next(), 0));
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(buildSvg, "$this$buildSvg");
                buildSvg.d(i17, i16, new c(i15, i14, (hd2.b) obj, 1));
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f1267i) {
            case 0:
                b((b72.a) obj);
                break;
            default:
                b((b72.a) obj);
                break;
        }
        return Unit.f80348a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ArrayList arrayList, int i13, int i14, int i15, int i16) {
        super(1);
        this.f1272n = arrayList;
        this.f1268j = i13;
        this.f1269k = i14;
        this.f1270l = i15;
        this.f1271m = i16;
    }
}
