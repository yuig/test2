package v9;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import d7.k0;
import d7.n0;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class e0 implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public final d7.c0 f124556a = new d7.c0(new byte[5], 0, 0);

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray f124557b = new SparseArray();

    /* renamed from: c, reason: collision with root package name */
    public final SparseIntArray f124558c = new SparseIntArray();

    /* renamed from: d, reason: collision with root package name */
    public final int f124559d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f0 f124560e;

    public e0(f0 f0Var, int i13) {
        this.f124560e = f0Var;
        this.f124559d = i13;
    }

    @Override // v9.b0
    public final void a(k0 k0Var, q8.u uVar, h0 h0Var) {
    }

    @Override // v9.b0
    public final void e(d7.d0 d0Var) {
        k0 k0Var;
        SparseBooleanArray sparseBooleanArray;
        SparseArray sparseArray;
        k0 k0Var2;
        int i13;
        char c13;
        int i14;
        SparseArray sparseArray2;
        int i15;
        int i16;
        if (d0Var.y() != 2) {
            return;
        }
        f0 f0Var = this.f124560e;
        int i17 = f0Var.f124585a;
        int i18 = 0;
        List list = f0Var.f124587c;
        if (i17 == 1 || i17 == 2 || f0Var.f124598n == 1) {
            k0Var = (k0) list.get(0);
        } else {
            k0Var = new k0(((k0) list.get(0)).d());
            list.add(k0Var);
        }
        if ((d0Var.y() & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0) {
            return;
        }
        d0Var.L(1);
        int E = d0Var.E();
        int i19 = 3;
        d0Var.L(3);
        d7.c0 c0Var = this.f124556a;
        d0Var.i(c0Var.f53793b, 0, 2);
        c0Var.m(0);
        c0Var.o(3);
        f0Var.f124604t = c0Var.g(13);
        d0Var.i(c0Var.f53793b, 0, 2);
        c0Var.m(0);
        c0Var.o(4);
        d0Var.L(c0Var.g(12));
        ho.i iVar = f0Var.f124590f;
        int i23 = f0Var.f124585a;
        if (i23 == 2 && f0Var.f124602r == null) {
            i0 a13 = iVar.a(21, new h0.i(21, null, 0, null, n0.f53868c));
            f0Var.f124602r = a13;
            if (a13 != null) {
                a13.a(k0Var, f0Var.f124597m, new h0(E, 21, 8192));
            }
        }
        SparseArray sparseArray3 = this.f124557b;
        sparseArray3.clear();
        SparseIntArray sparseIntArray = this.f124558c;
        sparseIntArray.clear();
        int a14 = d0Var.a();
        while (true) {
            sparseBooleanArray = f0Var.f124593i;
            if (a14 <= 0) {
                break;
            }
            d0Var.i(c0Var.f53793b, i18, 5);
            c0Var.m(i18);
            int g13 = c0Var.g(8);
            c0Var.o(i19);
            int g14 = c0Var.g(13);
            c0Var.o(4);
            int g15 = c0Var.g(12);
            int i24 = d0Var.f53807b;
            int i25 = i24 + g15;
            String str = null;
            ArrayList arrayList = null;
            int i26 = -1;
            int i27 = 0;
            d7.c0 c0Var2 = c0Var;
            while (d0Var.f53807b < i25) {
                int y13 = d0Var.y();
                int y14 = d0Var.f53807b + d0Var.y();
                if (y14 > i25) {
                    break;
                }
                k0 k0Var3 = k0Var;
                if (y13 == 5) {
                    long A = d0Var.A();
                    if (A == 1094921523) {
                        i26 = 129;
                    } else if (A == 1161904947) {
                        i26 = 135;
                    } else {
                        if (A != 1094921524) {
                            if (A == 1212503619) {
                                i26 = 36;
                            }
                        }
                        i26 = 172;
                    }
                    sparseArray2 = sparseArray3;
                    i15 = E;
                    i16 = g14;
                } else if (y13 == 106) {
                    sparseArray2 = sparseArray3;
                    i15 = E;
                    i16 = g14;
                    i26 = 129;
                } else if (y13 == 122) {
                    sparseArray2 = sparseArray3;
                    i15 = E;
                    i16 = g14;
                    i26 = 135;
                } else if (y13 == 127) {
                    int y15 = d0Var.y();
                    if (y15 != 21) {
                        if (y15 == 14) {
                            i26 = RecyclerViewTypes.VIEW_TYPE_SEE_MORE_ACTION_CELL;
                        } else if (y15 == 33) {
                            i26 = RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL_ITEM;
                        }
                        sparseArray2 = sparseArray3;
                        i15 = E;
                        i16 = g14;
                    }
                    i26 = 172;
                    sparseArray2 = sparseArray3;
                    i15 = E;
                    i16 = g14;
                } else {
                    if (y13 == 123) {
                        sparseArray2 = sparseArray3;
                        i26 = 138;
                    } else if (y13 == 10) {
                        String trim = d0Var.w(3, StandardCharsets.UTF_8).trim();
                        i27 = d0Var.y();
                        sparseArray2 = sparseArray3;
                        str = trim;
                    } else {
                        if (y13 == 89) {
                            ArrayList arrayList2 = new ArrayList();
                            while (d0Var.f53807b < y14) {
                                String trim2 = d0Var.w(3, StandardCharsets.UTF_8).trim();
                                d0Var.y();
                                SparseArray sparseArray4 = sparseArray3;
                                byte[] bArr = new byte[4];
                                d0Var.i(bArr, 0, 4);
                                arrayList2.add(new g0(trim2, bArr));
                                sparseArray3 = sparseArray4;
                                E = E;
                                g14 = g14;
                            }
                            sparseArray2 = sparseArray3;
                            i15 = E;
                            i16 = g14;
                            arrayList = arrayList2;
                            i26 = 89;
                        } else {
                            sparseArray2 = sparseArray3;
                            i15 = E;
                            i16 = g14;
                            if (y13 == 111) {
                                i26 = 257;
                            }
                        }
                        d0Var.L(y14 - d0Var.f53807b);
                        sparseArray3 = sparseArray2;
                        k0Var = k0Var3;
                        E = i15;
                        g14 = i16;
                    }
                    i15 = E;
                    i16 = g14;
                }
                d0Var.L(y14 - d0Var.f53807b);
                sparseArray3 = sparseArray2;
                k0Var = k0Var3;
                E = i15;
                g14 = i16;
            }
            SparseArray sparseArray5 = sparseArray3;
            k0 k0Var4 = k0Var;
            int i28 = E;
            int i29 = g14;
            d0Var.K(i25);
            h0.i iVar2 = new h0.i(i26, str, i27, arrayList, Arrays.copyOfRange(d0Var.f53806a, i24, i25));
            if (g13 == 6 || g13 == 5) {
                g13 = iVar2.f66406a;
            }
            a14 -= g15 + 5;
            int i33 = i23 == 2 ? g13 : i29;
            if (sparseBooleanArray.get(i33)) {
                sparseArray3 = sparseArray5;
                c13 = 21;
            } else {
                c13 = 21;
                i0 a15 = (i23 == 2 && g13 == 21) ? f0Var.f124602r : iVar.a(g13, iVar2);
                if (i23 == 2) {
                    i14 = i29;
                    if (i14 >= sparseIntArray.get(i33, 8192)) {
                        sparseArray3 = sparseArray5;
                    }
                } else {
                    i14 = i29;
                }
                sparseIntArray.put(i33, i14);
                sparseArray3 = sparseArray5;
                sparseArray3.put(i33, a15);
            }
            c0Var = c0Var2;
            k0Var = k0Var4;
            E = i28;
            i18 = 0;
            i19 = 3;
        }
        k0 k0Var5 = k0Var;
        int i34 = E;
        int size = sparseIntArray.size();
        int i35 = 0;
        while (true) {
            sparseArray = f0Var.f124592h;
            if (i35 >= size) {
                break;
            }
            int keyAt = sparseIntArray.keyAt(i35);
            int valueAt = sparseIntArray.valueAt(i35);
            sparseBooleanArray.put(keyAt, true);
            f0Var.f124594j.put(valueAt, true);
            i0 i0Var = (i0) sparseArray3.valueAt(i35);
            if (i0Var != null) {
                if (i0Var != f0Var.f124602r) {
                    q8.u uVar = f0Var.f124597m;
                    i13 = i34;
                    h0 h0Var = new h0(i13, keyAt, 8192);
                    k0Var2 = k0Var5;
                    i0Var.a(k0Var2, uVar, h0Var);
                } else {
                    k0Var2 = k0Var5;
                    i13 = i34;
                }
                sparseArray.put(valueAt, i0Var);
            } else {
                k0Var2 = k0Var5;
                i13 = i34;
            }
            i35++;
            k0Var5 = k0Var2;
            i34 = i13;
        }
        if (i23 == 2) {
            if (!f0Var.f124599o) {
                f0Var.f124597m.A();
                f0Var.f124598n = 0;
                f0Var.f124599o = true;
            }
            return;
        }
        sparseArray.remove(this.f124559d);
        int i36 = i23 == 1 ? 0 : f0Var.f124598n - 1;
        f0Var.f124598n = i36;
        if (i36 == 0) {
            f0Var.f124597m.A();
            f0Var.f124599o = true;
        }
    }
}
