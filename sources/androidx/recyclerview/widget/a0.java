package androidx.recyclerview.widget;

import android.view.View;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes3.dex */
public abstract class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final t f19317a = new t();

    public static w e(a0 a0Var) {
        ArrayList arrayList;
        ArrayList arrayList2;
        y yVar;
        z zVar;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int i13;
        y yVar2;
        y yVar3;
        int i14;
        int i15;
        z zVar2;
        z zVar3;
        int i16;
        int i17;
        int i18;
        int i19;
        int i23;
        int i24;
        int i25 = a0Var.i();
        int h10 = a0Var.h();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        y yVar4 = new y();
        int i26 = 0;
        yVar4.f19707a = 0;
        yVar4.f19708b = i25;
        yVar4.f19709c = 0;
        yVar4.f19710d = h10;
        arrayList6.add(yVar4);
        int i27 = i25 + h10;
        int i28 = 1;
        int i29 = (((i27 + 1) / 2) * 2) + 1;
        int[] iArr = new int[i29];
        int i33 = i29 / 2;
        int[] iArr2 = new int[i29];
        ArrayList arrayList7 = new ArrayList();
        while (!arrayList6.isEmpty()) {
            y yVar5 = (y) arrayList6.remove(arrayList6.size() - i28);
            if (yVar5.b() >= i28 && yVar5.a() >= i28) {
                int a13 = ((yVar5.a() + yVar5.b()) + i28) / 2;
                int i34 = i28 + i33;
                iArr[i34] = yVar5.f19707a;
                iArr2[i34] = yVar5.f19708b;
                int i35 = i26;
                while (i35 < a13) {
                    int i36 = Math.abs(yVar5.b() - yVar5.a()) % 2 == i28 ? i28 : i26;
                    int b13 = yVar5.b() - yVar5.a();
                    int i37 = -i35;
                    int i38 = i37;
                    while (true) {
                        if (i38 > i35) {
                            arrayList = arrayList6;
                            i14 = i26;
                            arrayList2 = arrayList7;
                            i15 = a13;
                            zVar2 = null;
                            break;
                        }
                        if (i38 == i37 || (i38 != i35 && iArr[i38 + 1 + i33] > iArr[(i38 - 1) + i33])) {
                            i19 = iArr[i38 + 1 + i33];
                            i23 = i19;
                        } else {
                            i19 = iArr[(i38 - 1) + i33];
                            i23 = i19 + 1;
                        }
                        i15 = a13;
                        arrayList = arrayList6;
                        int i39 = ((i23 - yVar5.f19707a) + yVar5.f19709c) - i38;
                        int i43 = (i35 == 0 || i23 != i19) ? i39 : i39 - 1;
                        arrayList2 = arrayList7;
                        while (i23 < yVar5.f19708b && i39 < yVar5.f19710d && a0Var.c(i23, i39)) {
                            i23++;
                            i39++;
                        }
                        iArr[i38 + i33] = i23;
                        if (i36 != 0) {
                            int i44 = b13 - i38;
                            i24 = i36;
                            if (i44 >= i37 + 1 && i44 <= i35 - 1 && iArr2[i44 + i33] <= i23) {
                                zVar2 = new z();
                                zVar2.f19736a = i19;
                                zVar2.f19737b = i43;
                                zVar2.f19738c = i23;
                                zVar2.f19739d = i39;
                                i14 = 0;
                                zVar2.f19740e = false;
                                break;
                            }
                        } else {
                            i24 = i36;
                        }
                        i38 += 2;
                        i26 = 0;
                        a13 = i15;
                        arrayList6 = arrayList;
                        arrayList7 = arrayList2;
                        i36 = i24;
                    }
                    if (zVar2 != null) {
                        zVar = zVar2;
                        yVar = yVar5;
                        break;
                    }
                    int i45 = (yVar5.b() - yVar5.a()) % 2 == 0 ? 1 : i14;
                    int b14 = yVar5.b() - yVar5.a();
                    int i46 = i37;
                    while (true) {
                        if (i46 > i35) {
                            yVar = yVar5;
                            zVar3 = null;
                            break;
                        }
                        if (i46 == i37 || (i46 != i35 && iArr2[i46 + 1 + i33] < iArr2[(i46 - 1) + i33])) {
                            i16 = iArr2[i46 + 1 + i33];
                            i17 = i16;
                        } else {
                            i16 = iArr2[(i46 - 1) + i33];
                            i17 = i16 - 1;
                        }
                        int i47 = yVar5.f19710d - ((yVar5.f19708b - i17) - i46);
                        int i48 = (i35 == 0 || i17 != i16) ? i47 : i47 + 1;
                        while (i17 > yVar5.f19707a && i47 > yVar5.f19709c) {
                            yVar = yVar5;
                            if (!a0Var.c(i17 - 1, i47 - 1)) {
                                break;
                            }
                            i17--;
                            i47--;
                            yVar5 = yVar;
                        }
                        yVar = yVar5;
                        iArr2[i46 + i33] = i17;
                        if (i45 != 0 && (i18 = b14 - i46) >= i37 && i18 <= i35 && iArr[i18 + i33] >= i17) {
                            zVar3 = new z();
                            zVar3.f19736a = i17;
                            zVar3.f19737b = i47;
                            zVar3.f19738c = i16;
                            zVar3.f19739d = i48;
                            zVar3.f19740e = true;
                            break;
                        }
                        i46 += 2;
                        yVar5 = yVar;
                    }
                    if (zVar3 != null) {
                        zVar = zVar3;
                        break;
                    }
                    i35++;
                    a13 = i15;
                    arrayList6 = arrayList;
                    arrayList7 = arrayList2;
                    yVar5 = yVar;
                    i28 = 1;
                    i26 = 0;
                }
            }
            arrayList = arrayList6;
            arrayList2 = arrayList7;
            yVar = yVar5;
            zVar = null;
            if (zVar != null) {
                if (zVar.a() > 0) {
                    int i49 = zVar.f19739d;
                    int i53 = zVar.f19737b;
                    int i54 = i49 - i53;
                    int i55 = zVar.f19738c;
                    int i56 = zVar.f19736a;
                    int i57 = i55 - i56;
                    arrayList5.add(i54 != i57 ? zVar.f19740e ? new v(i56, i53, zVar.a()) : i54 > i57 ? new v(i56, i53 + 1, zVar.a()) : new v(i56 + 1, i53, zVar.a()) : new v(i56, i53, i57));
                }
                if (arrayList2.isEmpty()) {
                    yVar2 = new y();
                    arrayList4 = arrayList2;
                    yVar3 = yVar;
                    i13 = 1;
                } else {
                    i13 = 1;
                    arrayList4 = arrayList2;
                    yVar2 = (y) arrayList4.remove(arrayList2.size() - 1);
                    yVar3 = yVar;
                }
                yVar2.f19707a = yVar3.f19707a;
                yVar2.f19709c = yVar3.f19709c;
                yVar2.f19708b = zVar.f19736a;
                yVar2.f19710d = zVar.f19737b;
                arrayList3 = arrayList;
                arrayList3.add(yVar2);
                yVar3.f19708b = yVar3.f19708b;
                yVar3.f19710d = yVar3.f19710d;
                yVar3.f19707a = zVar.f19738c;
                yVar3.f19709c = zVar.f19739d;
                arrayList3.add(yVar3);
            } else {
                arrayList3 = arrayList;
                arrayList4 = arrayList2;
                i13 = 1;
                arrayList4.add(yVar);
            }
            i28 = i13;
            arrayList6 = arrayList3;
            arrayList7 = arrayList4;
            i26 = 0;
        }
        Collections.sort(arrayList5, f19317a);
        return new w(a0Var, arrayList5, iArr, iArr2);
    }

    public abstract boolean a(int i13, int i14);

    public abstract boolean b(Object obj, Object obj2);

    public abstract boolean c(int i13, int i14);

    public abstract boolean d(Object obj, Object obj2);

    public Object f(int i13, int i14) {
        return null;
    }

    public Object g(Object obj, Object obj2) {
        return null;
    }

    public abstract int h();

    public abstract int i();

    public abstract View j(q2 q2Var, int i13);
}
