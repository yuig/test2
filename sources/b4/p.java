package b4;

import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class p extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f21637i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q f21638j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(q qVar, int i13) {
        super(0);
        this.f21637i = i13;
        this.f21638j = qVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9 */
    public final Float b() {
        u uVar;
        u uVar2;
        int i13 = this.f21637i;
        float f13 = 0.0f;
        t tVar = null;
        q qVar = this.f21638j;
        int i14 = 1;
        switch (i13) {
            case 0:
                ArrayList arrayList = qVar.f21646e;
                if (!arrayList.isEmpty()) {
                    ?? r23 = arrayList.get(0);
                    float b13 = ((t) r23).f21659a.b();
                    int i15 = kotlin.collections.f0.i(arrayList);
                    boolean z13 = r23;
                    if (1 <= i15) {
                        while (true) {
                            Object obj = arrayList.get(i14);
                            float b14 = ((t) obj).f21659a.b();
                            r23 = z13;
                            if (Float.compare(b13, b14) < 0) {
                                r23 = obj;
                                b13 = b14;
                            }
                            if (i14 != i15) {
                                i14++;
                                z13 = r23;
                            }
                        }
                    }
                    tVar = r23;
                }
                t tVar2 = tVar;
                if (tVar2 != null && (uVar = tVar2.f21659a) != null) {
                    f13 = uVar.b();
                }
                return Float.valueOf(f13);
            default:
                ArrayList arrayList2 = qVar.f21646e;
                if (!arrayList2.isEmpty()) {
                    ?? r24 = arrayList2.get(0);
                    float c13 = ((t) r24).f21659a.c();
                    int i16 = kotlin.collections.f0.i(arrayList2);
                    boolean z14 = r24;
                    if (1 <= i16) {
                        while (true) {
                            Object obj2 = arrayList2.get(i14);
                            float c14 = ((t) obj2).f21659a.c();
                            r24 = z14;
                            if (Float.compare(c13, c14) < 0) {
                                r24 = obj2;
                                c13 = c14;
                            }
                            if (i14 != i16) {
                                i14++;
                                z14 = r24;
                            }
                        }
                    }
                    tVar = r24;
                }
                t tVar3 = tVar;
                if (tVar3 != null && (uVar2 = tVar3.f21659a) != null) {
                    f13 = uVar2.c();
                }
                return Float.valueOf(f13);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f21637i) {
        }
        return b();
    }
}
