package ads_mobile_sdk;

import a.i;
import a.ih;
import a.od;
import a.u8;
import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class k22 {

    /* renamed from: c */
    public static final k22 f7066c = new k22();

    /* renamed from: b */
    public final ConcurrentHashMap f7068b = new ConcurrentHashMap();

    /* renamed from: a */
    public final r81 f7067a = new r81();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13, types: [ads_mobile_sdk.za1] */
    /* JADX WARN: Type inference failed for: r3v15, types: [ads_mobile_sdk.za1] */
    public final a.tb a(Class cls) {
        ya1 a13;
        ya1 ya1Var;
        Class cls2;
        Charset charset = hw0.f6126a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        a.tb tbVar = (a.tb) this.f7068b.get(cls);
        if (tbVar != null) {
            return tbVar;
        }
        r81 r81Var = this.f7067a;
        r81Var.getClass();
        Class cls3 = td2.f11509a;
        if (!sj0.class.isAssignableFrom(cls) && (cls2 = td2.f11509a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        od b13 = r81Var.f10548a.b(cls);
        f62 f62Var = (f62) b13;
        if ((f62Var.f5071d & 2) == 2) {
            if (sj0.class.isAssignableFrom(cls)) {
                ya1Var = new za1(td2.f11511c, u8.f169a, f62Var.f5068a);
            } else {
                a.tf tfVar = td2.f11510b;
                a.x6 x6Var = u8.f170b;
                if (x6Var == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                ya1Var = new za1(tfVar, x6Var, f62Var.f5068a);
            }
            a13 = ya1Var;
        } else {
            if (sj0.class.isAssignableFrom(cls)) {
                a.wd wdVar = a.ke.f77b;
                a.tg tgVar = i.f56b;
                ih ihVar = td2.f11511c;
                a.x6 x6Var2 = a.bb.c(f62Var.d()) != 1 ? u8.f169a : null;
                a.xf xfVar = a.wg.f178b;
                int[] iArr = ya1.f14158n;
                if (!(b13 instanceof f62)) {
                    b13.getClass();
                    throw new ClassCastException();
                }
                a13 = ya1.a(f62Var, wdVar, tgVar, ihVar, x6Var2, xfVar);
            } else {
                a.ed edVar = a.ke.f76a;
                a.wf wfVar = i.f55a;
                a.tf tfVar2 = td2.f11510b;
                if (a.bb.c(f62Var.d()) != 1 && (r3 = u8.f170b) == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                a.x6 x6Var3 = r3;
                a.mf mfVar = a.wg.f177a;
                int[] iArr2 = ya1.f14158n;
                if (!(b13 instanceof f62)) {
                    b13.getClass();
                    throw new ClassCastException();
                }
                a13 = ya1.a(f62Var, edVar, wfVar, tfVar2, x6Var3, mfVar);
            }
        }
        a.tb tbVar2 = (a.tb) this.f7068b.putIfAbsent(cls, a13);
        return tbVar2 != null ? tbVar2 : a13;
    }
}
