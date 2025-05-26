package d9;

import a.cb;
import a7.k0;
import d7.n0;
import java.util.ArrayList;
import java.util.Objects;
import pk.c1;
import pk.v2;

/* loaded from: classes3.dex */
public final class o extends j {

    /* renamed from: b, reason: collision with root package name */
    public final String f54037b;

    /* renamed from: c, reason: collision with root package name */
    public final c1 f54038c;

    public o(String str, String str2, v2 v2Var) {
        super(str);
        bf.b.i(!v2Var.isEmpty());
        this.f54037b = str2;
        c1 r13 = c1.r(v2Var);
        this.f54038c = r13;
    }

    public static ArrayList d(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
            } else if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
            } else if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // a7.m0
    public final void b(k0 k0Var) {
        String str = this.f54025a;
        str.getClass();
        char c13 = 65535;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c13 = 0;
                    break;
                }
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c13 = 1;
                    break;
                }
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c13 = 2;
                    break;
                }
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c13 = 3;
                    break;
                }
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c13 = 4;
                    break;
                }
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c13 = 5;
                    break;
                }
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c13 = 6;
                    break;
                }
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c13 = 7;
                    break;
                }
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c13 = '\b';
                    break;
                }
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c13 = '\t';
                    break;
                }
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c13 = '\n';
                    break;
                }
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c13 = 11;
                    break;
                }
                break;
            case 2569358:
                if (str.equals("TCON")) {
                    c13 = '\f';
                    break;
                }
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c13 = '\r';
                    break;
                }
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c13 = 14;
                    break;
                }
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c13 = 15;
                    break;
                }
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c13 = 16;
                    break;
                }
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c13 = 17;
                    break;
                }
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c13 = 18;
                    break;
                }
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c13 = 19;
                    break;
                }
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c13 = 20;
                    break;
                }
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c13 = 21;
                    break;
                }
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c13 = 22;
                    break;
                }
                break;
        }
        c1 c1Var = this.f54038c;
        try {
            switch (c13) {
                case 0:
                case '\n':
                    k0Var.c((CharSequence) c1Var.get(0));
                    break;
                case 1:
                case 11:
                    k0Var.f((CharSequence) c1Var.get(0));
                    break;
                case 2:
                case '\r':
                    String str2 = (String) c1Var.get(0);
                    int parseInt = Integer.parseInt(str2.substring(2, 4));
                    int parseInt2 = Integer.parseInt(str2.substring(0, 2));
                    k0Var.k(Integer.valueOf(parseInt));
                    k0Var.j(Integer.valueOf(parseInt2));
                    break;
                case 3:
                case 18:
                    k0Var.d((CharSequence) c1Var.get(0));
                    break;
                case 4:
                case 19:
                    k0Var.b((CharSequence) c1Var.get(0));
                    break;
                case 5:
                case 20:
                    k0Var.g((CharSequence) c1Var.get(0));
                    break;
                case 6:
                case 21:
                    String[] k03 = n0.k0((String) c1Var.get(0), "/");
                    int parseInt3 = Integer.parseInt(k03[0]);
                    Integer valueOf = k03.length > 1 ? Integer.valueOf(Integer.parseInt(k03[1])) : null;
                    k0Var.s(Integer.valueOf(parseInt3));
                    k0Var.r(valueOf);
                    break;
                case 7:
                case 17:
                    k0Var.q((CharSequence) c1Var.get(0));
                    break;
                case '\b':
                case 16:
                    k0Var.t((CharSequence) c1Var.get(0));
                    break;
                case '\t':
                case 22:
                    k0Var.l(Integer.valueOf(Integer.parseInt((String) c1Var.get(0))));
                    break;
                case '\f':
                    Integer E0 = d7.b.E0((String) c1Var.get(0));
                    if (E0 != null) {
                        String a13 = k.a(E0.intValue());
                        if (a13 != null) {
                            k0Var.i(a13);
                            break;
                        }
                    } else {
                        k0Var.i((CharSequence) c1Var.get(0));
                        break;
                    }
                    break;
                case 14:
                    ArrayList d2 = d((String) c1Var.get(0));
                    int size = d2.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                k0Var.j((Integer) d2.get(2));
                            }
                        }
                        k0Var.k((Integer) d2.get(1));
                    }
                    k0Var.l((Integer) d2.get(0));
                    break;
                case 15:
                    ArrayList d13 = d((String) c1Var.get(0));
                    int size2 = d13.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                k0Var.m((Integer) d13.get(2));
                            }
                        }
                        k0Var.n((Integer) d13.get(1));
                    }
                    k0Var.o((Integer) d13.get(0));
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        return Objects.equals(this.f54025a, oVar.f54025a) && Objects.equals(this.f54037b, oVar.f54037b) && this.f54038c.equals(oVar.f54038c);
    }

    public final int hashCode() {
        int d2 = cb.d(this.f54025a, 527, 31);
        String str = this.f54037b;
        return this.f54038c.hashCode() + ((d2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // d9.j
    public final String toString() {
        return this.f54025a + ": description=" + this.f54037b + ": values=" + this.f54038c;
    }
}
