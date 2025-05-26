package ads_mobile_sdk;

import a.fb;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class vc0 {

    /* renamed from: a, reason: collision with root package name */
    public final vm2 f12435a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f12436b;

    static {
        new vc0(new fb()).a();
    }

    public vc0() {
        this.f12435a = vm2.d();
    }

    public static int a(v03 v03Var, int i13, Object obj) {
        int h10 = oo.h(i13);
        if (v03Var == v03.f12283e) {
            Charset charset = hw0.f6126a;
            h10 *= 2;
        }
        return a(v03Var, obj) + h10;
    }

    public final Object clone() {
        vc0 vc0Var = new vc0();
        vm2 vm2Var = this.f12435a;
        if (vm2Var.f12568b > 0) {
            vm2Var.a(0).f11166a.getClass();
            throw new ClassCastException();
        }
        Iterator it = vm2Var.b().iterator();
        if (!it.hasNext()) {
            return vc0Var;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (entry.getKey() != null) {
            throw new ClassCastException();
        }
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vc0) {
            return this.f12435a.equals(((vc0) obj).f12435a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12435a.hashCode();
    }

    public vc0(fb fbVar) {
        this.f12435a = fbVar;
        a();
    }

    public static int a(v03 v03Var, Object obj) {
        int l13;
        int i13;
        switch (v03Var.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                Logger logger = oo.f9379b;
                return 8;
            case 1:
                ((Float) obj).getClass();
                Logger logger2 = oo.f9379b;
                return 4;
            case 2:
                return oo.a(((Long) obj).longValue());
            case 3:
                return oo.a(((Long) obj).longValue());
            case 4:
                return oo.a(((Integer) obj).intValue());
            case 5:
                ((Long) obj).getClass();
                Logger logger3 = oo.f9379b;
                return 8;
            case 6:
                ((Integer) obj).getClass();
                Logger logger4 = oo.f9379b;
                return 4;
            case 7:
                ((Boolean) obj).getClass();
                Logger logger5 = oo.f9379b;
                return 1;
            case 8:
                if (obj instanceof il) {
                    return oo.a((il) obj);
                }
                return oo.a((String) obj);
            case 9:
                Logger logger6 = oo.f9379b;
                return ((sj0) ((a.xe) obj)).a((a.tb) null);
            case 10:
                Logger logger7 = oo.f9379b;
                l13 = ((sj0) ((a.xe) obj)).l();
                i13 = oo.i(l13);
                break;
            case 11:
                if (obj instanceof il) {
                    return oo.a((il) obj);
                }
                Logger logger8 = oo.f9379b;
                l13 = ((byte[]) obj).length;
                i13 = oo.i(l13);
                break;
            case 12:
                return oo.i(((Integer) obj).intValue());
            case 13:
                if (obj instanceof a.w) {
                    return oo.a(((a.w) obj).a());
                }
                return oo.a(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                Logger logger9 = oo.f9379b;
                return 4;
            case 15:
                ((Long) obj).getClass();
                Logger logger10 = oo.f9379b;
                return 8;
            case 16:
                return oo.i(oo.j(((Integer) obj).intValue()));
            case 17:
                return oo.a(oo.b(((Long) obj).longValue()));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return i13 + l13;
    }

    public final void a() {
        Map unmodifiableMap;
        Map unmodifiableMap2;
        if (this.f12436b) {
            return;
        }
        int i13 = this.f12435a.f12568b;
        for (int i14 = 0; i14 < i13; i14++) {
            Object obj = this.f12435a.a(i14).f11167b;
            if (obj instanceof sj0) {
                ((sj0) obj).n();
            }
        }
        Iterator it = this.f12435a.b().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof sj0) {
                ((sj0) value).n();
            }
        }
        fb fbVar = (fb) this.f12435a;
        if (!fbVar.f12570d) {
            if (fbVar.f12568b <= 0) {
                Iterator it2 = fbVar.b().iterator();
                if (it2.hasNext()) {
                    ((Map.Entry) it2.next()).getKey().getClass();
                    throw new ClassCastException();
                }
            } else {
                fbVar.a(0).f11166a.getClass();
                throw new ClassCastException();
            }
        }
        if (!fbVar.f12570d) {
            if (fbVar.f12569c.isEmpty()) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = Collections.unmodifiableMap(fbVar.f12569c);
            }
            fbVar.f12569c = unmodifiableMap;
            if (fbVar.f12572f.isEmpty()) {
                unmodifiableMap2 = Collections.emptyMap();
            } else {
                unmodifiableMap2 = Collections.unmodifiableMap(fbVar.f12572f);
            }
            fbVar.f12572f = unmodifiableMap2;
            fbVar.f12570d = true;
        }
        this.f12436b = true;
    }

    public static void a(oo ooVar, v03 v03Var, int i13, Object obj) {
        if (v03Var == v03.f12283e) {
            Charset charset = hw0.f6126a;
            ooVar.g(i13, 3);
            ((sj0) ((a.xe) obj)).a(ooVar);
            ooVar.g(i13, 4);
            return;
        }
        ooVar.g(i13, v03Var.f12287b);
        switch (v03Var.ordinal()) {
            case 0:
                ooVar.c(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                ooVar.k(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                ooVar.d(((Long) obj).longValue());
                break;
            case 3:
                ooVar.d(((Long) obj).longValue());
                break;
            case 4:
                ooVar.l(((Integer) obj).intValue());
                break;
            case 5:
                ooVar.c(((Long) obj).longValue());
                break;
            case 6:
                ooVar.k(((Integer) obj).intValue());
                break;
            case 7:
                ooVar.a(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (obj instanceof il) {
                    ooVar.b((il) obj);
                    break;
                } else {
                    ooVar.b((String) obj);
                    break;
                }
            case 9:
                ((sj0) ((a.xe) obj)).a(ooVar);
                break;
            case 10:
                ooVar.a((a.xe) obj);
                break;
            case 11:
                if (obj instanceof il) {
                    ooVar.b((il) obj);
                    break;
                } else {
                    byte[] bArr = (byte[]) obj;
                    ooVar.a(bArr, bArr.length);
                    break;
                }
            case 12:
                ooVar.m(((Integer) obj).intValue());
                break;
            case 13:
                if (obj instanceof a.w) {
                    ooVar.l(((a.w) obj).a());
                    break;
                } else {
                    ooVar.l(((Integer) obj).intValue());
                    break;
                }
            case 14:
                ooVar.k(((Integer) obj).intValue());
                break;
            case 15:
                ooVar.c(((Long) obj).longValue());
                break;
            case 16:
                ooVar.m(oo.j(((Integer) obj).intValue()));
                break;
            case 17:
                ooVar.d(oo.b(((Long) obj).longValue()));
                break;
        }
    }
}
