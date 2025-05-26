package am;

import b3.w;
import do2.t2;
import i2.o2;
import kotlin.jvm.internal.Intrinsics;
import n2.r;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15514a;

    public /* synthetic */ d(int i13) {
        this.f15514a = i13;
    }

    public static final void a(h1.b bVar) {
        t2 t2Var;
        l2.d dVar;
        o2.b bVar2;
        t2 t2Var2 = o2.f71206v;
        do {
            t2Var = o2.f71206v;
            dVar = (l2.d) t2Var.getValue();
            bVar2 = (o2.b) dVar;
            n2.d dVar2 = bVar2.f92795d;
            o2.a aVar = (o2.a) dVar2.get(bVar);
            if (aVar != null) {
                int hashCode = bVar != null ? bVar.hashCode() : 0;
                r rVar = dVar2.f88931d;
                r D = rVar.D(hashCode, bVar, 0);
                if (rVar != D) {
                    if (D == null) {
                        dVar2 = n2.d.f88930f;
                        Intrinsics.g(dVar2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>");
                    } else {
                        dVar2 = new n2.d(D, dVar2.f88932e - 1);
                    }
                }
                p2.b bVar3 = p2.b.f98685a;
                Object obj = aVar.f92790a;
                boolean z13 = obj != bVar3;
                Object obj2 = aVar.f92791b;
                if (z13) {
                    Object obj3 = dVar2.get(obj);
                    Intrinsics.f(obj3);
                    dVar2 = dVar2.h(obj, ((o2.a) obj3).a(obj2));
                }
                if (obj2 != bVar3) {
                    Object obj4 = dVar2.get(obj2);
                    Intrinsics.f(obj4);
                    dVar2 = dVar2.h(obj2, new o2.a(obj, ((o2.a) obj4).f92791b));
                }
                Object obj5 = obj != bVar3 ? bVar2.f92793b : obj2;
                if (obj2 != bVar3) {
                    obj = bVar2.f92794c;
                }
                bVar2 = new o2.b(obj5, obj, dVar2);
            }
            if (dVar == bVar2) {
                return;
            }
        } while (!t2Var.h(dVar, bVar2));
    }

    public static float b(float[] fArr) {
        float f13 = fArr[0];
        float f14 = fArr[1];
        float f15 = fArr[2];
        float f16 = fArr[3];
        float f17 = fArr[4];
        float f18 = fArr[5];
        float f19 = (((((f15 * f18) + ((f14 * f17) + (f13 * f16))) - (f16 * f17)) - (f14 * f15)) - (f13 * f18)) * 0.5f;
        return f19 < 0.0f ? -f19 : f19;
    }

    public static float c(float f13, float f14, float f15, float f16) {
        return (f13 * f16) - (f14 * f15);
    }

    public static long d() {
        return w.f21378b;
    }

    public final String toString() {
        switch (this.f15514a) {
            case 5:
                return "Empty";
            default:
                return super.toString();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i13, int i14) {
        this(1);
        this.f15514a = i13;
        switch (i13) {
            case 2:
                this(2);
                break;
            case 3:
                this(3);
                break;
            case 4:
                this(4);
                break;
            case 5:
            default:
                break;
            case 6:
                this(6);
                break;
            case 7:
                this(7);
                break;
            case 8:
                this(8);
                break;
            case 9:
                this(9);
                break;
            case 10:
                this(10);
                break;
            case 11:
                this(11);
                break;
            case 12:
                this(12);
                break;
            case 13:
                this(13);
                break;
            case 14:
                this(14);
                break;
            case 15:
                this(15);
                break;
            case 16:
                this(16);
                break;
            case 17:
                this(17);
                break;
            case 18:
                this(18);
                break;
            case 19:
                this(19);
                break;
            case 20:
                this(20);
                break;
            case 21:
                this(21);
                break;
            case 22:
                this(22);
                break;
            case 23:
                this(23);
                break;
            case 24:
                this(24);
                break;
            case 25:
                this(25);
                break;
            case 26:
                this(26);
                break;
            case 27:
                this(27);
                break;
            case 28:
                this(28);
                break;
            case 29:
                this(29);
                break;
        }
    }
}
