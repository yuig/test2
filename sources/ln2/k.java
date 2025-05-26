package ln2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Intrinsics;
import pn2.b1;

/* loaded from: classes2.dex */
public class k implements on2.h, wp2.a {

    /* renamed from: a */
    public final /* synthetic */ int f84094a;

    public /* synthetic */ k(int i13) {
        this.f84094a = i13;
    }

    public static /* synthetic */ void a(int i13) {
        Object[] objArr = new Object[3];
        switch (i13) {
            case 1:
            case 4:
                objArr[0] = "b";
                break;
            case 2:
            case 7:
                objArr[0] = "typeCheckingProcedure";
                break;
            case 3:
            default:
                objArr[0] = "a";
                break;
            case 5:
            case 10:
                objArr[0] = "subtype";
                break;
            case 6:
            case 11:
                objArr[0] = "supertype";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 9:
                objArr[0] = "typeProjection";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerProcedureCallbacksImpl";
        switch (i13) {
            case 3:
            case 4:
                objArr[2] = "assertEqualTypeConstructors";
                break;
            case 5:
            case 6:
            case 7:
                objArr[2] = "assertSubtype";
                break;
            case 8:
            case 9:
                objArr[2] = "capture";
                break;
            case 10:
            case 11:
                objArr[2] = "noCorrespondingSupertype";
                break;
            default:
                objArr[2] = "assertEqualTypes";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static final void b(wo2.e eVar, long j13, boolean z13) {
        wo2.e eVar2;
        ReentrantLock reentrantLock = wo2.e.f130680i;
        if (wo2.e.f130684m == null) {
            wo2.e.f130684m = new wo2.e();
            new sh.e().start();
        }
        long nanoTime = System.nanoTime();
        if (j13 != 0 && z13) {
            eVar.f130687h = Math.min(j13, eVar.c() - nanoTime) + nanoTime;
        } else if (j13 != 0) {
            eVar.f130687h = j13 + nanoTime;
        } else {
            if (!z13) {
                throw new AssertionError();
            }
            eVar.f130687h = eVar.c();
        }
        long j14 = eVar.f130687h - nanoTime;
        wo2.e eVar3 = wo2.e.f130684m;
        Intrinsics.f(eVar3);
        while (true) {
            eVar2 = eVar3.f130686g;
            if (eVar2 == null || j14 < eVar2.f130687h - nanoTime) {
                break;
            }
            Intrinsics.f(eVar2);
            eVar3 = eVar2;
        }
        eVar.f130686g = eVar2;
        eVar3.f130686g = eVar;
        if (eVar3 == wo2.e.f130684m) {
            wo2.e.f130681j.signal();
        }
    }

    public static final void c(wo2.e eVar) {
        ReentrantLock reentrantLock = wo2.e.f130680i;
        wo2.e eVar2 = wo2.e.f130684m;
        while (eVar2 != null) {
            wo2.e eVar3 = eVar2.f130686g;
            if (eVar3 == eVar) {
                eVar2.f130686g = eVar.f130686g;
                eVar.f130686g = null;
                return;
            }
            eVar2 = eVar3;
        }
        throw new IllegalStateException("node was not found in the queue".toString());
    }

    public static boolean d(b1 b1Var, b1 b1Var2) {
        if (b1Var == null) {
            a(3);
            throw null;
        }
        if (b1Var2 != null) {
            return b1Var.equals(b1Var2);
        }
        a(4);
        throw null;
    }

    public static wo2.e e() {
        wo2.e eVar = wo2.e.f130684m;
        Intrinsics.f(eVar);
        wo2.e eVar2 = eVar.f130686g;
        if (eVar2 == null) {
            long nanoTime = System.nanoTime();
            wo2.e.f130681j.await(wo2.e.f130682k, TimeUnit.MILLISECONDS);
            wo2.e eVar3 = wo2.e.f130684m;
            Intrinsics.f(eVar3);
            if (eVar3.f130686g != null || System.nanoTime() - nanoTime < wo2.e.f130683l) {
                return null;
            }
            return wo2.e.f130684m;
        }
        long nanoTime2 = eVar2.f130687h - System.nanoTime();
        if (nanoTime2 > 0) {
            wo2.e.f130681j.await(nanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        wo2.e eVar4 = wo2.e.f130684m;
        Intrinsics.f(eVar4);
        eVar4.f130686g = eVar2.f130686g;
        eVar2.f130686g = null;
        eVar2.f130685f = 2;
        return eVar2;
    }

    public static void f(long j13, wo2.j jVar, int i13, ArrayList arrayList, int i14, int i15, ArrayList arrayList2) {
        int i16;
        int i17;
        int i18;
        int i19;
        wo2.j jVar2;
        int i23 = i13;
        if (i14 >= i15) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        for (int i24 = i14; i24 < i15; i24++) {
            if (((wo2.m) arrayList.get(i24)).b() < i23) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }
        wo2.m mVar = (wo2.m) arrayList.get(i14);
        wo2.m mVar2 = (wo2.m) arrayList.get(i15 - 1);
        int i25 = -1;
        if (i23 == mVar.b()) {
            int intValue = ((Number) arrayList2.get(i14)).intValue();
            int i26 = i14 + 1;
            wo2.m mVar3 = (wo2.m) arrayList.get(i26);
            i16 = i26;
            i17 = intValue;
            mVar = mVar3;
        } else {
            i16 = i14;
            i17 = -1;
        }
        if (mVar.e(i23) == mVar2.e(i23)) {
            int min = Math.min(mVar.b(), mVar2.b());
            int i27 = 0;
            for (int i28 = i23; i28 < min && mVar.e(i28) == mVar2.e(i28); i28++) {
                i27++;
            }
            long j14 = 4;
            long j15 = (jVar.f130711b / j14) + j13 + 2 + i27 + 1;
            jVar.g0(-i27);
            jVar.g0(i17);
            int i29 = i27 + i23;
            while (i23 < i29) {
                jVar.g0(mVar.e(i23) & 255);
                i23++;
            }
            if (i16 + 1 == i15) {
                if (i29 != ((wo2.m) arrayList.get(i16)).b()) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                jVar.g0(((Number) arrayList2.get(i16)).intValue());
                return;
            } else {
                wo2.j jVar3 = new wo2.j();
                jVar.g0(((int) ((jVar3.f130711b / j14) + j15)) * (-1));
                f(j15, jVar3, i29, arrayList, i16, i15, arrayList2);
                jVar.i2(jVar3);
                return;
            }
        }
        int i33 = 1;
        for (int i34 = i16 + 1; i34 < i15; i34++) {
            if (((wo2.m) arrayList.get(i34 - 1)).e(i23) != ((wo2.m) arrayList.get(i34)).e(i23)) {
                i33++;
            }
        }
        long j16 = 4;
        long j17 = (jVar.f130711b / j16) + j13 + 2 + (i33 * 2);
        jVar.g0(i33);
        jVar.g0(i17);
        for (int i35 = i16; i35 < i15; i35++) {
            int e13 = ((wo2.m) arrayList.get(i35)).e(i23);
            if (i35 == i16 || e13 != ((wo2.m) arrayList.get(i35 - 1)).e(i23)) {
                jVar.g0(e13 & 255);
            }
        }
        wo2.j jVar4 = new wo2.j();
        int i36 = i16;
        while (i36 < i15) {
            byte e14 = ((wo2.m) arrayList.get(i36)).e(i23);
            int i37 = i36 + 1;
            int i38 = i37;
            while (true) {
                if (i38 >= i15) {
                    i18 = i15;
                    break;
                } else {
                    if (e14 != ((wo2.m) arrayList.get(i38)).e(i23)) {
                        i18 = i38;
                        break;
                    }
                    i38++;
                }
            }
            if (i37 == i18 && i23 + 1 == ((wo2.m) arrayList.get(i36)).b()) {
                jVar.g0(((Number) arrayList2.get(i36)).intValue());
                i19 = i18;
                jVar2 = jVar4;
            } else {
                jVar.g0(((int) ((jVar4.f130711b / j16) + j17)) * i25);
                i19 = i18;
                jVar2 = jVar4;
                f(j17, jVar4, i23 + 1, arrayList, i36, i18, arrayList2);
            }
            jVar4 = jVar2;
            i36 = i19;
            i25 = -1;
        }
        jVar.i2(jVar4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c7, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static wo2.v j(wo2.m... r11) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ln2.k.j(wo2.m[]):wo2.v");
    }

    public List g(Executor executor) {
        return Collections.singletonList(new pq2.s(executor));
    }

    public List h() {
        return Collections.emptyList();
    }

    public final RuntimeException i(Throwable e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        throw e13;
    }

    public final String toString() {
        switch (this.f84094a) {
            case 5:
                return "NULL_VALUE";
            default:
                return super.toString();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i13, int i14) {
        this(0);
        this.f84094a = i13;
        if (i13 == 2) {
            this(2);
            return;
        }
        if (i13 == 3) {
            this(3);
            return;
        }
        switch (i13) {
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
            default:
                break;
        }
    }
}
