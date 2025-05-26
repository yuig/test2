package ads_mobile_sdk;

import a.z9;

/* loaded from: classes2.dex */
public final class r81 {

    /* renamed from: b, reason: collision with root package name */
    public static final z9 f10547b = new z9();

    /* renamed from: a, reason: collision with root package name */
    public final a.he f10548a;

    public r81() {
        this(a());
    }

    public static q81 a() {
        a.he heVar;
        a.he[] heVarArr = new a.he[2];
        heVarArr[0] = pj0.f9714a;
        k22 k22Var = k22.f7066c;
        try {
            heVar = (a.he) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            heVar = f10547b;
        }
        heVarArr[1] = heVar;
        return new q81(heVarArr);
    }

    public r81(q81 q81Var) {
        this.f10548a = (a.he) hw0.a(q81Var, "messageInfoFactory");
    }
}
